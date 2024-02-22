// Generated from SimpleFun.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleFunLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, EMPTY=14, INVOKE=15, IF=16, MATCH=17, 
		OP=18, CMP=19, ID=20, INT=21, BOOL=22, STRING=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "EMPTY", "INVOKE", "IF", "MATCH", 
			"OP", "CMP", "ID", "INT", "BOOL", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'|'", "'->'", "'='", "'then'", "'else'", 
			"'with'", "';'", "'Int'", "'Bool'", "'String'", "'_'", "'^'", "'if'", 
			"'match'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "EMPTY", "INVOKE", "IF", "MATCH", "OP", "CMP", "ID", "INT", 
			"BOOL", "STRING", "WS"
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


	public SimpleFunLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleFun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012v\b\u0012\u0001\u0013\u0001\u0013\u0005"+
		"\u0013z\b\u0013\n\u0013\f\u0013}\t\u0013\u0001\u0014\u0004\u0014\u0080"+
		"\b\u0014\u000b\u0014\f\u0014\u0081\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u008d\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0093\b\u0016\n\u0016\f\u0016\u0096\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0004\u0017\u009b\b\u0017\u000b\u0017\f\u0017\u009c"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0007\u0004"+
		"\u0000%%*+--//\u0002\u0000<<>>\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001"+
		"\u000009\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  \u00a8\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055"+
		"\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t9\u0001\u0000"+
		"\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000\u0000\u0000"+
		"\u000fC\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013M"+
		"\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017S\u0001\u0000"+
		"\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000"+
		"\u001da\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000!f\u0001"+
		"\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000\u0000"+
		"\'w\u0001\u0000\u0000\u0000)\u007f\u0001\u0000\u0000\u0000+\u008c\u0001"+
		"\u0000\u0000\u0000-\u008e\u0001\u0000\u0000\u0000/\u009a\u0001\u0000\u0000"+
		"\u000012\u0005(\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005)\u0000"+
		"\u00004\u0004\u0001\u0000\u0000\u000056\u0005,\u0000\u00006\u0006\u0001"+
		"\u0000\u0000\u000078\u0005|\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005"+
		"-\u0000\u0000:;\u0005>\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005"+
		"=\u0000\u0000=\f\u0001\u0000\u0000\u0000>?\u0005t\u0000\u0000?@\u0005"+
		"h\u0000\u0000@A\u0005e\u0000\u0000AB\u0005n\u0000\u0000B\u000e\u0001\u0000"+
		"\u0000\u0000CD\u0005e\u0000\u0000DE\u0005l\u0000\u0000EF\u0005s\u0000"+
		"\u0000FG\u0005e\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005w\u0000"+
		"\u0000IJ\u0005i\u0000\u0000JK\u0005t\u0000\u0000KL\u0005h\u0000\u0000"+
		"L\u0012\u0001\u0000\u0000\u0000MN\u0005;\u0000\u0000N\u0014\u0001\u0000"+
		"\u0000\u0000OP\u0005I\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005t\u0000"+
		"\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005B\u0000\u0000TU\u0005o\u0000"+
		"\u0000UV\u0005o\u0000\u0000VW\u0005l\u0000\u0000W\u0018\u0001\u0000\u0000"+
		"\u0000XY\u0005S\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005r\u0000\u0000"+
		"[\\\u0005i\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005g\u0000\u0000^\u001a"+
		"\u0001\u0000\u0000\u0000_`\u0005_\u0000\u0000`\u001c\u0001\u0000\u0000"+
		"\u0000ab\u0005^\u0000\u0000b\u001e\u0001\u0000\u0000\u0000cd\u0005i\u0000"+
		"\u0000de\u0005f\u0000\u0000e \u0001\u0000\u0000\u0000fg\u0005m\u0000\u0000"+
		"gh\u0005a\u0000\u0000hi\u0005t\u0000\u0000ij\u0005c\u0000\u0000jk\u0005"+
		"h\u0000\u0000k\"\u0001\u0000\u0000\u0000lm\u0007\u0000\u0000\u0000m$\u0001"+
		"\u0000\u0000\u0000no\u0005<\u0000\u0000ov\u0005=\u0000\u0000pq\u0005>"+
		"\u0000\u0000qv\u0005=\u0000\u0000rs\u0005=\u0000\u0000sv\u0005=\u0000"+
		"\u0000tv\u0007\u0001\u0000\u0000un\u0001\u0000\u0000\u0000up\u0001\u0000"+
		"\u0000\u0000ur\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v&\u0001"+
		"\u0000\u0000\u0000w{\u0007\u0002\u0000\u0000xz\u0007\u0003\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|(\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000~\u0080\u0007\u0004\u0000\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082*\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005t\u0000\u0000\u0084\u0085\u0005r\u0000\u0000\u0085\u0086\u0005"+
		"u\u0000\u0000\u0086\u008d\u0005e\u0000\u0000\u0087\u0088\u0005f\u0000"+
		"\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005l\u0000\u0000\u008a"+
		"\u008b\u0005s\u0000\u0000\u008b\u008d\u0005e\u0000\u0000\u008c\u0083\u0001"+
		"\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008d,\u0001\u0000"+
		"\u0000\u0000\u008e\u0094\u0005\"\u0000\u0000\u008f\u0093\b\u0005\u0000"+
		"\u0000\u0090\u0091\u0005\\\u0000\u0000\u0091\u0093\u0007\u0005\u0000\u0000"+
		"\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000\u0098"+
		".\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0006\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0017\u0000\u0000\u009f0\u0001"+
		"\u0000\u0000\u0000\b\u0000u{\u0081\u008c\u0092\u0094\u009c\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}