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
		T__9=10, T__10=11, T__11=12, INT=13, SPACES=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "INT", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A'", "'B'", "'C'", "'D'", "'OADM'", "'ROADM'", "'Use fiber type '", 
			"'Add '", "' '", "' every '", "'km'", "'for distances up to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "SPACES"
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
		"\u0004\u0000\u000er\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0004\fh\b\f\u000b\f\f\fi\u0001\r\u0004\rm\b\r\u000b\r\f\rn\u0001"+
		"\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0002\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000"+
		"\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001"+
		"\u0000\u0000\u0000\u000b*\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000"+
		"\u0000\u000f@\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013"+
		"G\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017R\u0001"+
		"\u0000\u0000\u0000\u0019g\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005A\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000"+
		"\u001f \u0005B\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005C\u0000"+
		"\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005D\u0000\u0000$\b\u0001\u0000"+
		"\u0000\u0000%&\u0005O\u0000\u0000&\'\u0005A\u0000\u0000\'(\u0005D\u0000"+
		"\u0000()\u0005M\u0000\u0000)\n\u0001\u0000\u0000\u0000*+\u0005R\u0000"+
		"\u0000+,\u0005O\u0000\u0000,-\u0005A\u0000\u0000-.\u0005D\u0000\u0000"+
		"./\u0005M\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005U\u0000\u0000"+
		"12\u0005s\u0000\u000023\u0005e\u0000\u000034\u0005 \u0000\u000045\u0005"+
		"f\u0000\u000056\u0005i\u0000\u000067\u0005b\u0000\u000078\u0005e\u0000"+
		"\u000089\u0005r\u0000\u00009:\u0005 \u0000\u0000:;\u0005t\u0000\u0000"+
		";<\u0005y\u0000\u0000<=\u0005p\u0000\u0000=>\u0005e\u0000\u0000>?\u0005"+
		" \u0000\u0000?\u000e\u0001\u0000\u0000\u0000@A\u0005A\u0000\u0000AB\u0005"+
		"d\u0000\u0000BC\u0005d\u0000\u0000CD\u0005 \u0000\u0000D\u0010\u0001\u0000"+
		"\u0000\u0000EF\u0005 \u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005"+
		" \u0000\u0000HI\u0005e\u0000\u0000IJ\u0005v\u0000\u0000JK\u0005e\u0000"+
		"\u0000KL\u0005r\u0000\u0000LM\u0005y\u0000\u0000MN\u0005 \u0000\u0000"+
		"N\u0014\u0001\u0000\u0000\u0000OP\u0005k\u0000\u0000PQ\u0005m\u0000\u0000"+
		"Q\u0016\u0001\u0000\u0000\u0000RS\u0005f\u0000\u0000ST\u0005o\u0000\u0000"+
		"TU\u0005r\u0000\u0000UV\u0005 \u0000\u0000VW\u0005d\u0000\u0000WX\u0005"+
		"i\u0000\u0000XY\u0005s\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005a\u0000"+
		"\u0000[\\\u0005n\u0000\u0000\\]\u0005c\u0000\u0000]^\u0005e\u0000\u0000"+
		"^_\u0005s\u0000\u0000_`\u0005 \u0000\u0000`a\u0005u\u0000\u0000ab\u0005"+
		"p\u0000\u0000bc\u0005 \u0000\u0000cd\u0005t\u0000\u0000de\u0005o\u0000"+
		"\u0000e\u0018\u0001\u0000\u0000\u0000fh\u0007\u0000\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\u001a\u0001\u0000\u0000\u0000km\u0007\u0001"+
		"\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pq\u0006\r\u0000\u0000q\u001c\u0001\u0000\u0000\u0000\u0003\u0000in\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}