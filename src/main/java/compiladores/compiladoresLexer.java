// Generated from /home/francisco/Escritorio/tc2/TC-TP2-Oliva-Ameri/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SUMA=4, RESTA=5, MULT=6, DIV=7, MOD=8, AND=9, 
		OR=10, PA=11, PC=12, CA=13, CC=14, LA=15, LC=16, IGUALDAD=17, DESIGUALDAD=18, 
		MENOR=19, MAYOR=20, MENOR_IGUAL=21, MAYOR_IGUAL=22, INT=23, DOUBLE=24, 
		COMA=25, PYC=26, IGUAL=27, ENTERO=28, ID=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LETRA", "DIGITO", "SUMA", "RESTA", "MULT", "DIV", 
			"MOD", "AND", "OR", "PA", "PC", "CA", "CC", "LA", "LC", "IGUALDAD", "DESIGUALDAD", 
			"MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", "INT", "DOUBLE", "COMA", 
			"PYC", "IGUAL", "ENTERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'for'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'&&'", "'||'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'int'", "'double'", "','", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", 
			"OR", "PA", "PC", "CA", "CC", "LA", "LC", "IGUALDAD", "DESIGUALDAD", 
			"MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", "INT", "DOUBLE", "COMA", 
			"PYC", "IGUAL", "ENTERO", "ID", "WS"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\6\37\u0093\n\37\r\37\16\37\u0094\3 \3 \5 \u0099\n "+
		"\3 \3 \3 \7 \u009e\n \f \16 \u00a1\13 \3!\3!\3!\3!\2\2\"\3\3\5\4\7\5\t"+
		"\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22"+
		"\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A \3\2\5"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2"+
		"\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5"+
		"I\3\2\2\2\7L\3\2\2\2\tP\3\2\2\2\13R\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21"+
		"X\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27^\3\2\2\2\31a\3\2\2\2\33d\3\2\2\2"+
		"\35f\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#l\3\2\2\2%n\3\2\2\2\'p\3\2\2\2)s\3"+
		"\2\2\2+v\3\2\2\2-x\3\2\2\2/z\3\2\2\2\61}\3\2\2\2\63\u0080\3\2\2\2\65\u0084"+
		"\3\2\2\2\67\u008b\3\2\2\29\u008d\3\2\2\2;\u008f\3\2\2\2=\u0092\3\2\2\2"+
		"?\u0098\3\2\2\2A\u00a2\3\2\2\2CD\7y\2\2DE\7j\2\2EF\7k\2\2FG\7n\2\2GH\7"+
		"g\2\2H\4\3\2\2\2IJ\7k\2\2JK\7h\2\2K\6\3\2\2\2LM\7h\2\2MN\7q\2\2NO\7t\2"+
		"\2O\b\3\2\2\2PQ\t\2\2\2Q\n\3\2\2\2RS\t\3\2\2S\f\3\2\2\2TU\7-\2\2U\16\3"+
		"\2\2\2VW\7/\2\2W\20\3\2\2\2XY\7,\2\2Y\22\3\2\2\2Z[\7\61\2\2[\24\3\2\2"+
		"\2\\]\7\'\2\2]\26\3\2\2\2^_\7(\2\2_`\7(\2\2`\30\3\2\2\2ab\7~\2\2bc\7~"+
		"\2\2c\32\3\2\2\2de\7*\2\2e\34\3\2\2\2fg\7+\2\2g\36\3\2\2\2hi\7]\2\2i "+
		"\3\2\2\2jk\7_\2\2k\"\3\2\2\2lm\7}\2\2m$\3\2\2\2no\7\177\2\2o&\3\2\2\2"+
		"pq\7?\2\2qr\7?\2\2r(\3\2\2\2st\7#\2\2tu\7?\2\2u*\3\2\2\2vw\7>\2\2w,\3"+
		"\2\2\2xy\7@\2\2y.\3\2\2\2z{\7>\2\2{|\7?\2\2|\60\3\2\2\2}~\7@\2\2~\177"+
		"\7?\2\2\177\62\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7v\2\2\u0083\64\3\2\2\2\u0084\u0085\7f\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7w\2\2\u0087\u0088\7d\2\2\u0088\u0089\7n\2\2\u0089\u008a\7g\2\2\u008a"+
		"\66\3\2\2\2\u008b\u008c\7.\2\2\u008c8\3\2\2\2\u008d\u008e\7=\2\2\u008e"+
		":\3\2\2\2\u008f\u0090\7?\2\2\u0090<\3\2\2\2\u0091\u0093\5\13\6\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095>\3\2\2\2\u0096\u0099\5\t\5\2\u0097\u0099\7a\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009f\3\2\2\2\u009a\u009e\5\t\5\2\u009b"+
		"\u009e\5\13\6\2\u009c\u009e\7a\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0@\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\t\4\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b!\2\2\u00a5B\3\2\2\2\7\2\u0094\u0098"+
		"\u009d\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}