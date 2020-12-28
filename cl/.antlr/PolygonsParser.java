// Generated from d:\Usuario\Documentos\Universitat\2020-2021\Q1\LP\PolyBot\cl\Polygons.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolygonsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, NUM=20, ID=21, R=22, MUL=23, MES=24, PAD=25, EXC=26, 
		COMMENT=27, WS=28;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_variable = 2, RULE_operation = 3, RULE_instruction = 4, 
		RULE_coords = 5, RULE_colorRGB = 6, RULE_img = 7, RULE_lines = 8, RULE_polygons = 9, 
		RULE_printPol = 10, RULE_area = 11, RULE_perimeter = 12, RULE_vertices = 13, 
		RULE_centroid = 14, RULE_color = 15, RULE_inside = 16, RULE_equal = 17, 
		RULE_draw = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "variable", "operation", "instruction", "coords", "colorRGB", 
			"img", "lines", "polygons", "printPol", "area", "perimeter", "vertices", 
			"centroid", "color", "inside", "equal", "draw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"image.png\"'", 
			"'\"---\"'", "','", "'print'", "'area'", "'perimeter'", "'vertices'", 
			"'centroid'", "'color'", "'inside'", "'equal'", "'draw'", null, null, 
			null, "'*'", "'+'", "'#'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUM", "ID", "R", "MUL", 
			"MES", "PAD", "EXC", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Polygons.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolygonsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PolygonsParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			expr();
			setState(39);
			match(EOF);
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

	public static class ExprContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				variable();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolygonsParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(ID);
			setState(46);
			match(T__0);
			setState(47);
			operation(0);
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

	public static class OperationContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode PAD() { return getToken(PolygonsParser.PAD, 0); }
		public CoordsContext coords() {
			return getRuleContext(CoordsContext.class,0);
		}
		public TerminalNode ID() { return getToken(PolygonsParser.ID, 0); }
		public TerminalNode R() { return getToken(PolygonsParser.R, 0); }
		public TerminalNode NUM() { return getToken(PolygonsParser.NUM, 0); }
		public TerminalNode MUL() { return getToken(PolygonsParser.MUL, 0); }
		public TerminalNode MES() { return getToken(PolygonsParser.MES, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(50);
				match(T__1);
				setState(51);
				operation(0);
				setState(52);
				match(T__2);
				}
				break;
			case PAD:
				{
				setState(54);
				match(PAD);
				setState(55);
				operation(7);
				}
				break;
			case T__3:
				{
				setState(56);
				coords();
				}
				break;
			case ID:
				{
				setState(57);
				match(ID);
				}
				break;
			case R:
				{
				setState(58);
				match(R);
				}
				break;
			case NUM:
				{
				setState(59);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(62);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(63);
						match(MUL);
						setState(64);
						operation(7);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(65);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(66);
						match(MES);
						setState(67);
						operation(6);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class InstructionContext extends ParserRuleContext {
		public PrintPolContext printPol() {
			return getRuleContext(PrintPolContext.class,0);
		}
		public AreaContext area() {
			return getRuleContext(AreaContext.class,0);
		}
		public PerimeterContext perimeter() {
			return getRuleContext(PerimeterContext.class,0);
		}
		public VerticesContext vertices() {
			return getRuleContext(VerticesContext.class,0);
		}
		public CentroidContext centroid() {
			return getRuleContext(CentroidContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				printPol();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				area();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				perimeter();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				vertices();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				centroid();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				color();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				inside();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				equal();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				draw();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CoordsContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(PolygonsParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PolygonsParser.NUM, i);
		}
		public List<TerminalNode> R() { return getTokens(PolygonsParser.R); }
		public TerminalNode R(int i) {
			return getToken(PolygonsParser.R, i);
		}
		public CoordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coords; }
	}

	public final CoordsContext coords() throws RecognitionException {
		CoordsContext _localctx = new CoordsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__3);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM || _la==R) {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__4);
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

	public static class ColorRGBContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(PolygonsParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PolygonsParser.NUM, i);
		}
		public ColorRGBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorRGB; }
	}

	public final ColorRGBContext colorRGB() throws RecognitionException {
		ColorRGBContext _localctx = new ColorRGBContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_colorRGB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__5);
			setState(95);
			match(NUM);
			setState(96);
			match(NUM);
			setState(97);
			match(NUM);
			setState(98);
			match(T__6);
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

	public static class ImgContext extends ParserRuleContext {
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_img);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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

	public static class LinesContext extends ParserRuleContext {
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__8);
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

	public static class PolygonsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PolygonsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PolygonsParser.ID, i);
		}
		public PolygonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygons; }
	}

	public final PolygonsContext polygons() throws RecognitionException {
		PolygonsContext _localctx = new PolygonsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_polygons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			match(ID);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(105);
				match(T__9);
				setState(106);
				match(ID);
				}
				}
				setState(111);
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

	public static class PrintPolContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public PrintPolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printPol; }
	}

	public final PrintPolContext printPol() throws RecognitionException {
		PrintPolContext _localctx = new PrintPolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__10);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case NUM:
			case ID:
			case R:
			case PAD:
				{
				setState(113);
				operation(0);
				}
				break;
			case T__8:
				{
				setState(114);
				lines();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AreaContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_area; }
	}

	public final AreaContext area() throws RecognitionException {
		AreaContext _localctx = new AreaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_area);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__11);
			setState(118);
			operation(0);
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

	public static class PerimeterContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PerimeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perimeter; }
	}

	public final PerimeterContext perimeter() throws RecognitionException {
		PerimeterContext _localctx = new PerimeterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_perimeter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__12);
			setState(121);
			operation(0);
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

	public static class VerticesContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VerticesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertices; }
	}

	public final VerticesContext vertices() throws RecognitionException {
		VerticesContext _localctx = new VerticesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vertices);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__13);
			setState(124);
			operation(0);
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

	public static class CentroidContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CentroidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centroid; }
	}

	public final CentroidContext centroid() throws RecognitionException {
		CentroidContext _localctx = new CentroidContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_centroid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__14);
			setState(127);
			operation(0);
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

	public static class ColorContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ColorRGBContext colorRGB() {
			return getRuleContext(ColorRGBContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__15);
			setState(130);
			operation(0);
			setState(131);
			match(T__9);
			setState(132);
			colorRGB();
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

	public static class InsideContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public InsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside; }
	}

	public final InsideContext inside() throws RecognitionException {
		InsideContext _localctx = new InsideContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__16);
			setState(135);
			operation(0);
			setState(136);
			match(T__9);
			setState(137);
			operation(0);
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

	public static class EqualContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ID() { return getToken(PolygonsParser.ID, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__17);
			setState(140);
			operation(0);
			setState(141);
			match(T__9);
			setState(142);
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

	public static class DrawContext extends ParserRuleContext {
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public PolygonsContext polygons() {
			return getRuleContext(PolygonsContext.class,0);
		}
		public DrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw; }
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_draw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__18);
			setState(145);
			img();
			setState(146);
			match(T__9);
			setState(147);
			polygons();
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
		case 3:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U"+
		"\n\6\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13n\n\13\f\13\16\13q\13\13\3\f\3\f"+
		"\3\f\5\fv\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\2\3\b\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\3\4\2\26\26\30\30\2\u0097\2(\3\2\2\2\4-\3\2\2\2\6"+
		"/\3\2\2\2\b>\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16`\3\2\2\2\20f\3\2\2\2\22"+
		"h\3\2\2\2\24j\3\2\2\2\26r\3\2\2\2\30w\3\2\2\2\32z\3\2\2\2\34}\3\2\2\2"+
		"\36\u0080\3\2\2\2 \u0083\3\2\2\2\"\u0088\3\2\2\2$\u008d\3\2\2\2&\u0092"+
		"\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+.\5\6\4\2,.\5\n\6\2-+\3\2\2\2"+
		"-,\3\2\2\2.\5\3\2\2\2/\60\7\27\2\2\60\61\7\3\2\2\61\62\5\b\5\2\62\7\3"+
		"\2\2\2\63\64\b\5\1\2\64\65\7\4\2\2\65\66\5\b\5\2\66\67\7\5\2\2\67?\3\2"+
		"\2\289\7\33\2\29?\5\b\5\t:?\5\f\7\2;?\7\27\2\2<?\7\30\2\2=?\7\26\2\2>"+
		"\63\3\2\2\2>8\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?H\3\2\2"+
		"\2@A\f\b\2\2AB\7\31\2\2BG\5\b\5\tCD\f\7\2\2DE\7\32\2\2EG\5\b\5\bF@\3\2"+
		"\2\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2\2KU\5"+
		"\26\f\2LU\5\30\r\2MU\5\32\16\2NU\5\34\17\2OU\5\36\20\2PU\5 \21\2QU\5\""+
		"\22\2RU\5$\23\2SU\5&\24\2TK\3\2\2\2TL\3\2\2\2TM\3\2\2\2TN\3\2\2\2TO\3"+
		"\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\13\3\2\2\2V[\7\6\2\2W"+
		"X\t\2\2\2XZ\t\2\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2][\3\2\2\2^_\7\7\2\2_\r\3\2\2\2`a\7\b\2\2ab\7\26\2\2bc\7\26\2\2cd\7"+
		"\26\2\2de\7\t\2\2e\17\3\2\2\2fg\7\n\2\2g\21\3\2\2\2hi\7\13\2\2i\23\3\2"+
		"\2\2jo\7\27\2\2kl\7\f\2\2ln\7\27\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2p\25\3\2\2\2qo\3\2\2\2ru\7\r\2\2sv\5\b\5\2tv\5\22\n\2us\3\2\2\2"+
		"ut\3\2\2\2v\27\3\2\2\2wx\7\16\2\2xy\5\b\5\2y\31\3\2\2\2z{\7\17\2\2{|\5"+
		"\b\5\2|\33\3\2\2\2}~\7\20\2\2~\177\5\b\5\2\177\35\3\2\2\2\u0080\u0081"+
		"\7\21\2\2\u0081\u0082\5\b\5\2\u0082\37\3\2\2\2\u0083\u0084\7\22\2\2\u0084"+
		"\u0085\5\b\5\2\u0085\u0086\7\f\2\2\u0086\u0087\5\16\b\2\u0087!\3\2\2\2"+
		"\u0088\u0089\7\23\2\2\u0089\u008a\5\b\5\2\u008a\u008b\7\f\2\2\u008b\u008c"+
		"\5\b\5\2\u008c#\3\2\2\2\u008d\u008e\7\24\2\2\u008e\u008f\5\b\5\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0091\7\27\2\2\u0091%\3\2\2\2\u0092\u0093\7\25\2"+
		"\2\u0093\u0094\5\20\t\2\u0094\u0095\7\f\2\2\u0095\u0096\5\24\13\2\u0096"+
		"\'\3\2\2\2\n->FHT[ou";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}