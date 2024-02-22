// Generated from SimpleFun.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleFunParser}.
 */
public interface SimpleFunListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleFunParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleFunParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(SimpleFunParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(SimpleFunParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SimpleFunParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SimpleFunParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SimpleFunParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SimpleFunParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#functionMatch}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMatch(SimpleFunParser.FunctionMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#functionMatch}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMatch(SimpleFunParser.FunctionMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterPatterns(SimpleFunParser.PatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitPatterns(SimpleFunParser.PatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(SimpleFunParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(SimpleFunParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#functionDefault}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefault(SimpleFunParser.FunctionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#functionDefault}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefault(SimpleFunParser.FunctionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleFunParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleFunParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#invokeParams}.
	 * @param ctx the parse tree
	 */
	void enterInvokeParams(SimpleFunParser.InvokeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#invokeParams}.
	 * @param ctx the parse tree
	 */
	void exitInvokeParams(SimpleFunParser.InvokeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#matchCases}.
	 * @param ctx the parse tree
	 */
	void enterMatchCases(SimpleFunParser.MatchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#matchCases}.
	 * @param ctx the parse tree
	 */
	void exitMatchCases(SimpleFunParser.MatchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#matchCase}.
	 * @param ctx the parse tree
	 */
	void enterMatchCase(SimpleFunParser.MatchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#matchCase}.
	 * @param ctx the parse tree
	 */
	void exitMatchCase(SimpleFunParser.MatchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(SimpleFunParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(SimpleFunParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleFunParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleFunParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleFunParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(SimpleFunParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleFunParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(SimpleFunParser.TermsContext ctx);
}