package com.github.mjovanc;

// Generated from Lambda.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LambdaParser}.
 */
public interface LambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LambdaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(LambdaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(LambdaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LambdaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LambdaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LambdaParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LambdaParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LambdaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LambdaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LambdaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LambdaParser.ValueContext ctx);
}