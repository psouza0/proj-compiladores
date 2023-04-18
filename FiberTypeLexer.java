// Generated from FiberType.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FiberTypeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMBER=12, SPACES=13, INT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "NUMBER", "SPACES", "INT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A'", "'B'", "'C'", "'D'", "'OADM'", "'ROADM'", "'Use fiber type'", 
			"'Add'", "'every'", "'km'", "'for distances up to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMBER", "SPACES", "INT"
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


	public FiberTypeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FiberType.g4"; }

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
		"\u0004\u0000\u000eq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0004\u000bb\b\u000b\u000b\u000b\f\u000bc\u0001"+
		"\f\u0004\fg\b\f\u000b\f\f\fh\u0001\f\u0001\f\u0001\r\u0004\rn\b\r\u000b"+
		"\r\f\ro\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u0001\u0000\u0002\u0001\u000009\u0003\u0000\t\n"+
		"\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001"+
		"\u001d\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005"+
		"!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000"+
		"\u0000\u0000\u000b*\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000"+
		"\u000f?\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013I"+
		"\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017a\u0001\u0000"+
		"\u0000\u0000\u0019f\u0001\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005A\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f"+
		" \u0005B\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005C\u0000\u0000"+
		"\"\u0006\u0001\u0000\u0000\u0000#$\u0005D\u0000\u0000$\b\u0001\u0000\u0000"+
		"\u0000%&\u0005O\u0000\u0000&\'\u0005A\u0000\u0000\'(\u0005D\u0000\u0000"+
		"()\u0005M\u0000\u0000)\n\u0001\u0000\u0000\u0000*+\u0005R\u0000\u0000"+
		"+,\u0005O\u0000\u0000,-\u0005A\u0000\u0000-.\u0005D\u0000\u0000./\u0005"+
		"M\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005U\u0000\u000012\u0005"+
		"s\u0000\u000023\u0005e\u0000\u000034\u0005 \u0000\u000045\u0005f\u0000"+
		"\u000056\u0005i\u0000\u000067\u0005b\u0000\u000078\u0005e\u0000\u0000"+
		"89\u0005r\u0000\u00009:\u0005 \u0000\u0000:;\u0005t\u0000\u0000;<\u0005"+
		"y\u0000\u0000<=\u0005p\u0000\u0000=>\u0005e\u0000\u0000>\u000e\u0001\u0000"+
		"\u0000\u0000?@\u0005A\u0000\u0000@A\u0005d\u0000\u0000AB\u0005d\u0000"+
		"\u0000B\u0010\u0001\u0000\u0000\u0000CD\u0005e\u0000\u0000DE\u0005v\u0000"+
		"\u0000EF\u0005e\u0000\u0000FG\u0005r\u0000\u0000GH\u0005y\u0000\u0000"+
		"H\u0012\u0001\u0000\u0000\u0000IJ\u0005k\u0000\u0000JK\u0005m\u0000\u0000"+
		"K\u0014\u0001\u0000\u0000\u0000LM\u0005f\u0000\u0000MN\u0005o\u0000\u0000"+
		"NO\u0005r\u0000\u0000OP\u0005 \u0000\u0000PQ\u0005d\u0000\u0000QR\u0005"+
		"i\u0000\u0000RS\u0005s\u0000\u0000ST\u0005t\u0000\u0000TU\u0005a\u0000"+
		"\u0000UV\u0005n\u0000\u0000VW\u0005c\u0000\u0000WX\u0005e\u0000\u0000"+
		"XY\u0005s\u0000\u0000YZ\u0005 \u0000\u0000Z[\u0005u\u0000\u0000[\\\u0005"+
		"p\u0000\u0000\\]\u0005 \u0000\u0000]^\u0005t\u0000\u0000^_\u0005o\u0000"+
		"\u0000_\u0016\u0001\u0000\u0000\u0000`b\u0007\u0000\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\u0018\u0001\u0000\u0000\u0000eg\u0007\u0001"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0006\f\u0000\u0000k\u001a\u0001\u0000\u0000\u0000ln\u0007\u0000\u0000"+
		"\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\u001c\u0001\u0000\u0000\u0000"+
		"\u0004\u0000cho\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}