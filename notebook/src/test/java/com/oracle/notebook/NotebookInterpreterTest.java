/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.notebook;

import com.oracle.notebook.interpreter.NotebookInterpreter;
import static org.hamcrest.Matchers.containsString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author constantindrabo
 */

@RunWith(SpringRunner.class)
@WebMvcTest(NotebookInterpreter.class)
public class NotebookInterpreterTest {
    
    @Autowired
    private MockMvc mvc;
    
    String input = "{\r\n \"code\":\"%python print 1 + 2 \"\r\n }";
    String wronginput = "{\r\n \"code\":\"%python print 1 + 2 \"\r\n ";
    
    @Test
    public void getPythonResult() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders.post("/execute")
                .contentType(MediaType.APPLICATION_JSON)
                .content(input)).andExpect(status().isOk()).andDo(print()).andExpect(content().string(containsString("3")));
    }
    
    
    @Test
    public void getPythonWrongResult() throws Exception {
         this.mvc.perform(MockMvcRequestBuilders.post("/execute")
                .contentType(MediaType.APPLICATION_JSON)
                .content(wronginput)).andExpect(status().isOk()).andDo(print()).andExpect(content().string(containsString("3")));
    }
    
    
}
