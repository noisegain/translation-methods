// Generated from SimpleFun.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleFunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, INVOKE=14, IF=15, MATCH=16, OP=17, 
		ID=18, INT=19, BOOL=20, STRING=21, WS=22;
	public static final int
		RULE_program = 0, RULE_functionDecl = 1, RULE_params = 2, RULE_param = 3, 
		RULE_expr = 4, RULE_invokeParams = 5, RULE_matchCases = 6, RULE_matchCase = 7, 
		RULE_defaultCase = 8, RULE_type = 9, RULE_terms = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDecl", "params", "param", "expr", "invokeParams", 
			"matchCases", "matchCase", "defaultCase", "type", "terms"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "','", "'then'", "'else'", "'with'", "';'", 
			"'|'", "'->'", "'Int'", "'Bool'", "'String'", "'^'", "'if'", "'match'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INVOKE", "IF", "MATCH", "OP", "ID", "INT", "BOOL", "STRING", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleFun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleFunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				functionDecl();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleFunParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			type();
			setState(28);
			match(ID);
			setState(29);
			match(T__0);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) {
				{
				setState(30);
				params();
				}
			}

			setState(33);
			match(T__1);
			setState(34);
			match(T__2);
			setState(35);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			param();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(38);
				match(T__3);
				setState(39);
				param();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleFunParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			type();
			setState(46);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleFunParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MATCH() { return getToken(SimpleFunParser.MATCH, 0); }
		public MatchCasesContext matchCases() {
			return getRuleContext(MatchCasesContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleFunParser.ID, 0); }
		public TerminalNode INT() { return getToken(SimpleFunParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SimpleFunParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(SimpleFunParser.BOOL, 0); }
		public TerminalNode INVOKE() { return getToken(SimpleFunParser.INVOKE, 0); }
		public InvokeParamsContext invokeParams() {
			return getRuleContext(InvokeParamsContext.class,0);
		}
		public TerminalNode OP() { return getToken(SimpleFunParser.OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(49);
				match(IF);
				setState(50);
				expr(0);
				setState(51);
				match(T__4);
				setState(52);
				expr(0);
				setState(53);
				match(T__5);
				setState(54);
				expr(9);
				}
				break;
			case 2:
				{
				setState(56);
				match(MATCH);
				setState(57);
				expr(0);
				setState(58);
				match(T__6);
				setState(59);
				matchCases();
				}
				break;
			case 3:
				{
				setState(61);
				match(ID);
				}
				break;
			case 4:
				{
				setState(62);
				match(INT);
				}
				break;
			case 5:
				{
				setState(63);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(64);
				match(BOOL);
				}
				break;
			case 7:
				{
				setState(65);
				match(T__0);
				setState(66);
				expr(0);
				setState(67);
				match(T__1);
				}
				break;
			case 8:
				{
				setState(69);
				match(ID);
				setState(70);
				match(INVOKE);
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(71);
					invokeParams();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(76);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(77);
					match(OP);
					setState(78);
					expr(8);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvokeParamsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InvokeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterInvokeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitInvokeParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitInvokeParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeParamsContext invokeParams() throws RecognitionException {
		InvokeParamsContext _localctx = new InvokeParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_invokeParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			expr(0);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(85);
				match(T__3);
				setState(86);
				expr(0);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchCasesContext extends ParserRuleContext {
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public List<MatchCaseContext> matchCase() {
			return getRuleContexts(MatchCaseContext.class);
		}
		public MatchCaseContext matchCase(int i) {
			return getRuleContext(MatchCaseContext.class,i);
		}
		public MatchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterMatchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitMatchCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitMatchCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchCasesContext matchCases() throws RecognitionException {
		MatchCasesContext _localctx = new MatchCasesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matchCases);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(T__8);
					setState(95);
					matchCase();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(101);
			defaultCase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchCaseContext extends ParserRuleContext {
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MatchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterMatchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitMatchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitMatchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchCaseContext matchCase() throws RecognitionException {
		MatchCaseContext _localctx = new MatchCaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_matchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			terms();
			setState(104);
			match(T__9);
			setState(105);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCaseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitDefaultCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(107);
			match(T__8);
			setState(108);
			expr(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleFunParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleFunParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SimpleFunParser.STRING, 0); }
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleFunListener ) ((SimpleFunListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleFunVisitor ) return ((SimpleFunVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016s\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002"+
		"\n\u0002\f\u0002,\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"I\b\u0004\u0003\u0004K\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004P\b\u0004\n\u0004\f\u0004S\t\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u0006a\b\u0006\n\u0006\f\u0006d\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0000\u0001\b\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0002\u0001\u0000\u000b\r\u0001\u0000\u0013\u0015u\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004%\u0001"+
		"\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000"+
		"\u0000\nT\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000eg\u0001"+
		"\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000"+
		"\u0000\u0014p\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0012\t\u0000\u001c"+
		"\u001d\u0005\u0012\u0000\u0000\u001d\u001f\u0005\u0001\u0000\u0000\u001e"+
		" \u0003\u0004\u0002\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0002\u0000\u0000"+
		"\"#\u0005\u0003\u0000\u0000#$\u0003\b\u0004\u0000$\u0003\u0001\u0000\u0000"+
		"\u0000%*\u0003\u0006\u0003\u0000&\'\u0005\u0004\u0000\u0000\')\u0003\u0006"+
		"\u0003\u0000(&\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0005\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-.\u0003\u0012\t\u0000./\u0005\u0012\u0000"+
		"\u0000/\u0007\u0001\u0000\u0000\u000001\u0006\u0004\uffff\uffff\u0000"+
		"12\u0005\u000f\u0000\u000023\u0003\b\u0004\u000034\u0005\u0005\u0000\u0000"+
		"45\u0003\b\u0004\u000056\u0005\u0006\u0000\u000067\u0003\b\u0004\t7K\u0001"+
		"\u0000\u0000\u000089\u0005\u0010\u0000\u00009:\u0003\b\u0004\u0000:;\u0005"+
		"\u0007\u0000\u0000;<\u0003\f\u0006\u0000<K\u0001\u0000\u0000\u0000=K\u0005"+
		"\u0012\u0000\u0000>K\u0005\u0013\u0000\u0000?K\u0005\u0015\u0000\u0000"+
		"@K\u0005\u0014\u0000\u0000AB\u0005\u0001\u0000\u0000BC\u0003\b\u0004\u0000"+
		"CD\u0005\u0002\u0000\u0000DK\u0001\u0000\u0000\u0000EF\u0005\u0012\u0000"+
		"\u0000FH\u0005\u000e\u0000\u0000GI\u0003\n\u0005\u0000HG\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000J0\u0001\u0000"+
		"\u0000\u0000J8\u0001\u0000\u0000\u0000J=\u0001\u0000\u0000\u0000J>\u0001"+
		"\u0000\u0000\u0000J?\u0001\u0000\u0000\u0000J@\u0001\u0000\u0000\u0000"+
		"JA\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000KQ\u0001\u0000\u0000"+
		"\u0000LM\n\u0007\u0000\u0000MN\u0005\u0011\u0000\u0000NP\u0003\b\u0004"+
		"\bOL\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000R\t\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000TY\u0003\b\u0004\u0000UV\u0005\u0004\u0000\u0000VX\u0003\b"+
		"\u0004\u0000WU\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000\\]\u0005\b\u0000\u0000]\u000b\u0001\u0000\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_a\u0003\u000e\u0007\u0000`^\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0003"+
		"\u0010\b\u0000f\r\u0001\u0000\u0000\u0000gh\u0003\u0014\n\u0000hi\u0005"+
		"\n\u0000\u0000ij\u0003\b\u0004\u0000j\u000f\u0001\u0000\u0000\u0000kl"+
		"\u0005\t\u0000\u0000lm\u0003\b\u0004\u0000m\u0011\u0001\u0000\u0000\u0000"+
		"no\u0007\u0000\u0000\u0000o\u0013\u0001\u0000\u0000\u0000pq\u0007\u0001"+
		"\u0000\u0000q\u0015\u0001\u0000\u0000\u0000\b\u0019\u001f*HJQYb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}