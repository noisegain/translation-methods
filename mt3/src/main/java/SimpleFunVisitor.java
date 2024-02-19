// Generated from SimpleFun.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleFunParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleFunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleFunParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(SimpleFunParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SimpleFunParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SimpleFunParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleFunParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#invokeParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeParams(SimpleFunParser.InvokeParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#matchCases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchCases(SimpleFunParser.MatchCasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#matchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchCase(SimpleFunParser.MatchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(SimpleFunParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleFunParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFunParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(SimpleFunParser.TermsContext ctx);
}