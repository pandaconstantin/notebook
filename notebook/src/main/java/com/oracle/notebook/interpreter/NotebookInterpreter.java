package com.oracle.notebook.interpreter;

import com.oracle.notebook.model.ResultModel;
import com.oracle.notebook.model.CodeModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.notebook.grammar.NotebookBaseVisitor;
import com.oracle.notebook.grammar.NotebookLexer;
import com.oracle.notebook.grammar.NotebookParser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpSession;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.python.util.PythonInterpreter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interpreter of the Notebook. It parses the input and submit to a jython
 * subprocess
 *
 * @author constantindrabo
 * @version 1.0
 * @since 16th April 2019
 *
 */
@RestController
public class NotebookInterpreter {

    private ObjectMapper resultJSONMapper;
    private ScriptEngine moteurExec;
    private PythonInterpreter pythonInterpret;
    private String sessionID;
    private ResultModel resultJSON;

    public NotebookInterpreter() {

    }

    @PostConstruct
    public void init() {
        resultJSONMapper = new ObjectMapper();
        moteurExec = new ScriptEngineManager().getEngineByName("python");
        pythonInterpret = new PythonInterpreter();
        pythonInterpret.exec("import sys");
    }

    /**
     * Take a JSON object as input and return the result after submitted to the
     * Python interpreter
     *
     * @param snippetJson
     * @param session
     * @return
     */
    @PostMapping("/execute")
    public String parsingDataInput(@RequestBody String snippetJson, HttpSession session) {
        ObjectMapper objectMapper = new ObjectMapper();
        CodeModel codeModel = new CodeModel();
        try {
            codeModel = objectMapper.readValue(snippetJson, CodeModel.class);
        } catch (IOException ex) {
            Logger.getLogger(NotebookInterpreter.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Test here if the snippet is correct syntaxically 
        if (isCorrectSnippet(snippetJson) == 0) {
            resultJSON = new ResultModel(resultPythonProcessing(codeModel.getCode(), session));
        } else {
            resultJSON = new ResultModel("");
        }

        try {
            return resultJSONMapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultJSON);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(NotebookInterpreter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * This method submit the expression to the Python interpreter
     *
     * @param snippetcode
     * @param session
     * @return
     */
    public String resultPythonProcessing(String snippetcode, HttpSession session) {
        try {
            String statement = snippetcode.substring(snippetcode.indexOf(" ")).trim();
            if (statement.contains("print")) {
                statement = statement.substring(statement.indexOf(" ")).trim();
            }
            if (session.isNew()) {
                moteurExec = new ScriptEngineManager().getEngineByName("python");
                pythonInterpret = new PythonInterpreter();
            }
            pythonInterpret.exec(statement);
            return "" + moteurExec.eval(statement) + "";

        } catch (ScriptException ex) {
            Logger.getLogger(NotebookInterpreter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int isCorrectSnippet(String snippet) {
        snippet = snippet.replace("\"", " ");
        CharStream charStream = CharStreams.fromString(snippet);
        NotebookLexer notebooklexer = new NotebookLexer(charStream);
        NotebookParser p = new NotebookParser(new CommonTokenStream(notebooklexer));
        NotebookBaseVisitor notebookvisitor = new NotebookBaseVisitor();
        Object o = notebookvisitor.visit(p.codejson());
        return p.getNumberOfSyntaxErrors();
    }

    public ObjectMapper getResultJSONMapper() {
        return resultJSONMapper;
    }

    public void setResultJSONMapper(ObjectMapper resultJSONMapper) {
        this.resultJSONMapper = resultJSONMapper;
    }

    public ScriptEngine getMoteurExec() {
        return moteurExec;
    }

    public void setMoteurExec(ScriptEngine moteurExec) {
        this.moteurExec = moteurExec;
    }

    public PythonInterpreter getPythonInterpret() {
        return pythonInterpret;
    }

    public void setPythonInterpret(PythonInterpreter pythonInterpret) {
        this.pythonInterpret = pythonInterpret;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

}
