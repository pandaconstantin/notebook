package com.oracle.notebook.grammar;

// Generated from /Users/constantindrabo/Documents/OracleExams/untitled/src/Notebook.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotebookParser}.
 */
public interface NotebookListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotebookParser#codejson}.
	 * @param ctx the parse tree
	 */
	void enterCodejson(NotebookParser.CodejsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#codejson}.
	 * @param ctx the parse tree
	 */
	void exitCodejson(NotebookParser.CodejsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(NotebookParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(NotebookParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(NotebookParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(NotebookParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(NotebookParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(NotebookParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(NotebookParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(NotebookParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(NotebookParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(NotebookParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(NotebookParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(NotebookParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(NotebookParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(NotebookParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(NotebookParser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(NotebookParser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(NotebookParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(NotebookParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(NotebookParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(NotebookParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(NotebookParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(NotebookParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(NotebookParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(NotebookParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(NotebookParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(NotebookParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(NotebookParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(NotebookParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(NotebookParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(NotebookParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(NotebookParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(NotebookParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(NotebookParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(NotebookParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(NotebookParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(NotebookParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(NotebookParser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(NotebookParser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(NotebookParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(NotebookParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(NotebookParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(NotebookParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(NotebookParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(NotebookParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(NotebookParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(NotebookParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(NotebookParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(NotebookParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(NotebookParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(NotebookParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(NotebookParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(NotebookParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(NotebookParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(NotebookParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(NotebookParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(NotebookParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(NotebookParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(NotebookParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(NotebookParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(NotebookParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(NotebookParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(NotebookParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(NotebookParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(NotebookParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(NotebookParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(NotebookParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(NotebookParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(NotebookParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(NotebookParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(NotebookParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(NotebookParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(NotebookParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(NotebookParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(NotebookParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(NotebookParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(NotebookParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(NotebookParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(NotebookParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(NotebookParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(NotebookParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(NotebookParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(NotebookParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(NotebookParser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(NotebookParser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(NotebookParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(NotebookParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(NotebookParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(NotebookParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(NotebookParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(NotebookParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(NotebookParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(NotebookParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(NotebookParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(NotebookParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(NotebookParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(NotebookParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(NotebookParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(NotebookParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(NotebookParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(NotebookParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(NotebookParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(NotebookParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(NotebookParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(NotebookParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(NotebookParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(NotebookParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(NotebookParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(NotebookParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(NotebookParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(NotebookParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(NotebookParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(NotebookParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(NotebookParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(NotebookParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(NotebookParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(NotebookParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(NotebookParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(NotebookParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(NotebookParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(NotebookParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NotebookParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NotebookParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(NotebookParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(NotebookParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(NotebookParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(NotebookParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(NotebookParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(NotebookParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(NotebookParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(NotebookParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(NotebookParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(NotebookParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(NotebookParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(NotebookParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(NotebookParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(NotebookParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(NotebookParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(NotebookParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(NotebookParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(NotebookParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(NotebookParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(NotebookParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(NotebookParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(NotebookParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(NotebookParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(NotebookParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(NotebookParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(NotebookParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(NotebookParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(NotebookParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(NotebookParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(NotebookParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(NotebookParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(NotebookParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(NotebookParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(NotebookParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(NotebookParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(NotebookParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(NotebookParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(NotebookParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(NotebookParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(NotebookParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(NotebookParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(NotebookParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(NotebookParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(NotebookParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(NotebookParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(NotebookParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(NotebookParser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(NotebookParser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(NotebookParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(NotebookParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotebookParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(NotebookParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotebookParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(NotebookParser.Yield_argContext ctx);
}