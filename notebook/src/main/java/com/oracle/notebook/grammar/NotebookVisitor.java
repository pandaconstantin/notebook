package com.oracle.notebook.grammar;

// Generated from /Users/constantindrabo/Documents/OracleExams/untitled/src/Notebook.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotebookParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotebookVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotebookParser#codejson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodejson(NotebookParser.CodejsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(NotebookParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(NotebookParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(NotebookParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(NotebookParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(NotebookParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(NotebookParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(NotebookParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#async_funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_funcdef(NotebookParser.Async_funcdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(NotebookParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(NotebookParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(NotebookParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(NotebookParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(NotebookParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(NotebookParser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(NotebookParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(NotebookParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(NotebookParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(NotebookParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(NotebookParser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(NotebookParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(NotebookParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(NotebookParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(NotebookParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(NotebookParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(NotebookParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(NotebookParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(NotebookParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(NotebookParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(NotebookParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(NotebookParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(NotebookParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(NotebookParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(NotebookParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(NotebookParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(NotebookParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(NotebookParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(NotebookParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(NotebookParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(NotebookParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(NotebookParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(NotebookParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_stmt(NotebookParser.Async_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(NotebookParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(NotebookParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(NotebookParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(NotebookParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(NotebookParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(NotebookParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(NotebookParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(NotebookParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(NotebookParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(NotebookParser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(NotebookParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(NotebookParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(NotebookParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(NotebookParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(NotebookParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(NotebookParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(NotebookParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(NotebookParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NotebookParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(NotebookParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(NotebookParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(NotebookParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(NotebookParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(NotebookParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(NotebookParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(NotebookParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(NotebookParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(NotebookParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(NotebookParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(NotebookParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(NotebookParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(NotebookParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(NotebookParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(NotebookParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(NotebookParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(NotebookParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(NotebookParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(NotebookParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(NotebookParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(NotebookParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(NotebookParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(NotebookParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#encoding_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_decl(NotebookParser.Encoding_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(NotebookParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotebookParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(NotebookParser.Yield_argContext ctx);
}