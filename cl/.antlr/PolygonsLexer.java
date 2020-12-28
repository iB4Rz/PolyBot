// Generated from d:\Usuario\Documentos\Universitat\2020-2021\Q1\LP\PolyBot\cl\Polygons.g by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolygonsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, NUM=20, ID=21, MUL=22, MES=23, PAD=24, EXC=25, COMMENT=26, 
		WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "NUM", "ID", "MUL", "MES", "PAD", "EXC", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"image.png\"'", 
			"'\"---\"'", "','", "'print'", "'area'", "'perimeter'", "'vertices'", 
			"'centroid'", "'color'", "'inside'", "'equal'", "'draw'", null, null, 
			"'*'", "'+'", "'#'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUM", "ID", "MUL", "MES", 
			"PAD", "EXC", "COMMENT", "WS"
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


	public PolygonsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Polygons.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\6"+
		"\25\u009d\n\25\r\25\16\25\u009e\3\26\3\26\7\26\u00a3\n\26\f\26\16\26\u00a6"+
		"\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\6\33"+
		"\u00b4\n\33\r\33\16\33\u00b5\3\33\3\33\3\34\6\34\u00bb\n\34\r\34\16\34"+
		"\u00bc\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\35\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\""+
		"\2\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2"+
		"\2\2\5<\3\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rD\3\2\2\2\17F\3\2\2"+
		"\2\21H\3\2\2\2\23T\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31b\3\2\2\2\33g\3"+
		"\2\2\2\35q\3\2\2\2\37z\3\2\2\2!\u0083\3\2\2\2#\u0089\3\2\2\2%\u0090\3"+
		"\2\2\2\'\u0096\3\2\2\2)\u009c\3\2\2\2+\u00a0\3\2\2\2-\u00a7\3\2\2\2/\u00a9"+
		"\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00ba\3"+
		"\2\2\29:\7<\2\2:;\7?\2\2;\4\3\2\2\2<=\7*\2\2=\6\3\2\2\2>?\7+\2\2?\b\3"+
		"\2\2\2@A\7]\2\2A\n\3\2\2\2BC\7_\2\2C\f\3\2\2\2DE\7}\2\2E\16\3\2\2\2FG"+
		"\7\177\2\2G\20\3\2\2\2HI\7$\2\2IJ\7k\2\2JK\7o\2\2KL\7c\2\2LM\7i\2\2MN"+
		"\7g\2\2NO\7\60\2\2OP\7r\2\2PQ\7p\2\2QR\7i\2\2RS\7$\2\2S\22\3\2\2\2TU\7"+
		"$\2\2UV\7/\2\2VW\7/\2\2WX\7/\2\2XY\7$\2\2Y\24\3\2\2\2Z[\7.\2\2[\26\3\2"+
		"\2\2\\]\7r\2\2]^\7t\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2a\30\3\2\2\2bc\7c\2"+
		"\2cd\7t\2\2de\7g\2\2ef\7c\2\2f\32\3\2\2\2gh\7r\2\2hi\7g\2\2ij\7t\2\2j"+
		"k\7k\2\2kl\7o\2\2lm\7g\2\2mn\7v\2\2no\7g\2\2op\7t\2\2p\34\3\2\2\2qr\7"+
		"x\2\2rs\7g\2\2st\7t\2\2tu\7v\2\2uv\7k\2\2vw\7e\2\2wx\7g\2\2xy\7u\2\2y"+
		"\36\3\2\2\2z{\7e\2\2{|\7g\2\2|}\7p\2\2}~\7v\2\2~\177\7t\2\2\177\u0080"+
		"\7q\2\2\u0080\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082 \3\2\2\2\u0083\u0084"+
		"\7e\2\2\u0084\u0085\7q\2\2\u0085\u0086\7n\2\2\u0086\u0087\7q\2\2\u0087"+
		"\u0088\7t\2\2\u0088\"\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b"+
		"\u008c\7u\2\2\u008c\u008d\7k\2\2\u008d\u008e\7f\2\2\u008e\u008f\7g\2\2"+
		"\u008f$\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7s\2\2\u0092\u0093\7w\2"+
		"\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095&\3\2\2\2\u0096\u0097\7"+
		"f\2\2\u0097\u0098\7t\2\2\u0098\u0099\7c\2\2\u0099\u009a\7y\2\2\u009a("+
		"\3\2\2\2\u009b\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f*\3\2\2\2\u00a0\u00a4\t\3\2\2"+
		"\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5,\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7,\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\60\3\2\2\2\u00ab"+
		"\u00ac\7%\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\7\61\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b4\n"+
		"\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\33\2\2\u00b8\66\3\2\2"+
		"\2\u00b9\u00bb\t\5\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\34\2\2"+
		"\u00bf8\3\2\2\2\7\2\u009e\u00a4\u00b5\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}