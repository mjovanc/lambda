package com.github.mjovanc;

// Generated from Lambda.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LambdaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(LambdaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LambdaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LambdaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LambdaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LambdaParser.ValueContext ctx);
}