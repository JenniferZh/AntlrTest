// Generated from F:/Javaworkspace/AntlrTest/src/main/java\ExpressGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		WS=25, BLOCK_COMMENT=26, INT=27, SCHEMA=28, END_SCHEMA=29, TYPE=30, END_TYPE=31, 
		ENTITY=32, END_ENTITY=33, FUNCTION=34, END_FUNCTION=35, RULE=36, END_RULE=37, 
		SUBTYPE_OF=38, SUPERTYPE_OF=39, ONEOF=40, ABSTRACT=41, OPTIONAL=42, FIXED=43, 
		OF=44, SET=45, ARRAY=46, LIST=47, BOOLEAN=48, REAL=49, INTEGER=50, BINARY=51, 
		NUMBER=52, STRING=53, ENUMERATION=54, SELECT=55, WHERE=56, DERIVE=57, 
		UNIQUE=58, INVERSE=59, SELF_=60, FOR=61, NAME=62;
	public static final int
		RULE_schema = 0, RULE_beginSchema = 1, RULE_endSchema = 2, RULE_entity = 3, 
		RULE_beginEntity = 4, RULE_endEntity = 5, RULE_entityType = 6, RULE_subtypeOf = 7, 
		RULE_supertypeOf = 8, RULE_entityArgument = 9, RULE_collectionOf = 10, 
		RULE_collectionArgPart = 11, RULE_beginNameList = 12, RULE_endNameList = 13, 
		RULE_nameList = 14, RULE_names = 15, RULE_typeName = 16, RULE_type = 17, 
		RULE_inversePart = 18, RULE_inverseSentence = 19, RULE_derivePart = 20, 
		RULE_deriveOverrideSentence = 21, RULE_deriveSentence = 22, RULE_uniquePart = 23, 
		RULE_uniqueSentence = 24, RULE_wherePart = 25, RULE_whereSentence = 26, 
		RULE_function = 27, RULE_therule = 28, RULE_commonKeyword = 29, RULE_commonSentence = 30, 
		RULE_typeSingleKeyword = 31, RULE_typeArrayKeyword = 32, RULE_typeKeyword = 33, 
		RULE_innerKeyword = 34, RULE_sign = 35;
	public static final String[] ruleNames = {
		"schema", "beginSchema", "endSchema", "entity", "beginEntity", "endEntity", 
		"entityType", "subtypeOf", "supertypeOf", "entityArgument", "collectionOf", 
		"collectionArgPart", "beginNameList", "endNameList", "nameList", "names", 
		"typeName", "type", "inversePart", "inverseSentence", "derivePart", "deriveOverrideSentence", 
		"deriveSentence", "uniquePart", "uniqueSentence", "wherePart", "whereSentence", 
		"function", "therule", "commonKeyword", "commonSentence", "typeSingleKeyword", 
		"typeArrayKeyword", "typeKeyword", "innerKeyword", "sign"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "':'", "'['", "'?'", "']'", "','", "'='", "'.'", 
		"':='", "'<'", "'>'", "'\\'", "'/'", "'|'", "'*'", "'''", "'\"'", "'!'", 
		"'-'", "'+'", "'{'", "'}'", null, null, null, "'SCHEMA'", "'END_SCHEMA;'", 
		"'TYPE'", "'END_TYPE;'", "'ENTITY'", "'END_ENTITY;'", "'FUNCTION'", "'END_FUNCTION;'", 
		"'RULE'", "'END_RULE;'", "'SUBTYPE OF'", "'SUPERTYPE OF'", "'ONEOF'", 
		"'ABSTRACT'", "'OPTIONAL'", "'FIXED'", "'OF'", "'SET'", "'ARRAY'", "'LIST'", 
		"'BOOLEAN'", "'REAL'", "'INTEGER'", "'BINARY'", "'NUMBER'", "'STRING'", 
		"'ENUMERATION'", "'SELECT'", "'WHERE'", "'DERIVE'", "'UNIQUE'", "'INVERSE'", 
		"'SELF\\'", "'FOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "BLOCK_COMMENT", "INT", "SCHEMA", "END_SCHEMA", "TYPE", "END_TYPE", 
		"ENTITY", "END_ENTITY", "FUNCTION", "END_FUNCTION", "RULE", "END_RULE", 
		"SUBTYPE_OF", "SUPERTYPE_OF", "ONEOF", "ABSTRACT", "OPTIONAL", "FIXED", 
		"OF", "SET", "ARRAY", "LIST", "BOOLEAN", "REAL", "INTEGER", "BINARY", 
		"NUMBER", "STRING", "ENUMERATION", "SELECT", "WHERE", "DERIVE", "UNIQUE", 
		"INVERSE", "SELF_", "FOR", "NAME"
	};
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
	public String getGrammarFileName() { return "ExpressGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SchemaContext extends ParserRuleContext {
		public BeginSchemaContext beginSchema() {
			return getRuleContext(BeginSchemaContext.class,0);
		}
		public EndSchemaContext endSchema() {
			return getRuleContext(EndSchemaContext.class,0);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TheruleContext> therule() {
			return getRuleContexts(TheruleContext.class);
		}
		public TheruleContext therule(int i) {
			return getRuleContext(TheruleContext.class,i);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			beginSchema();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << ENTITY) | (1L << FUNCTION) | (1L << RULE))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTITY:
					{
					setState(73);
					entity();
					}
					break;
				case TYPE:
					{
					setState(74);
					type();
					}
					break;
				case FUNCTION:
					{
					setState(75);
					function();
					}
					break;
				case RULE:
					{
					setState(76);
					therule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			endSchema();
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

	public static class BeginSchemaContext extends ParserRuleContext {
		public TerminalNode SCHEMA() { return getToken(ExpressGrammarParser.SCHEMA, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public BeginSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterBeginSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitBeginSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitBeginSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginSchemaContext beginSchema() throws RecognitionException {
		BeginSchemaContext _localctx = new BeginSchemaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_beginSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(SCHEMA);
			setState(85);
			match(NAME);
			setState(86);
			match(T__0);
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

	public static class EndSchemaContext extends ParserRuleContext {
		public TerminalNode END_SCHEMA() { return getToken(ExpressGrammarParser.END_SCHEMA, 0); }
		public EndSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterEndSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitEndSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEndSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndSchemaContext endSchema() throws RecognitionException {
		EndSchemaContext _localctx = new EndSchemaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(END_SCHEMA);
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

	public static class EntityContext extends ParserRuleContext {
		public BeginEntityContext beginEntity() {
			return getRuleContext(BeginEntityContext.class,0);
		}
		public EndEntityContext endEntity() {
			return getRuleContext(EndEntityContext.class,0);
		}
		public List<EntityTypeContext> entityType() {
			return getRuleContexts(EntityTypeContext.class);
		}
		public EntityTypeContext entityType(int i) {
			return getRuleContext(EntityTypeContext.class,i);
		}
		public List<EntityArgumentContext> entityArgument() {
			return getRuleContexts(EntityArgumentContext.class);
		}
		public EntityArgumentContext entityArgument(int i) {
			return getRuleContext(EntityArgumentContext.class,i);
		}
		public List<InversePartContext> inversePart() {
			return getRuleContexts(InversePartContext.class);
		}
		public InversePartContext inversePart(int i) {
			return getRuleContext(InversePartContext.class,i);
		}
		public List<DerivePartContext> derivePart() {
			return getRuleContexts(DerivePartContext.class);
		}
		public DerivePartContext derivePart(int i) {
			return getRuleContext(DerivePartContext.class,i);
		}
		public List<WherePartContext> wherePart() {
			return getRuleContexts(WherePartContext.class);
		}
		public WherePartContext wherePart(int i) {
			return getRuleContext(WherePartContext.class,i);
		}
		public List<UniquePartContext> uniquePart() {
			return getRuleContexts(UniquePartContext.class);
		}
		public UniquePartContext uniquePart(int i) {
			return getRuleContext(UniquePartContext.class,i);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			beginEntity();
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case SUBTYPE_OF:
				case SUPERTYPE_OF:
				case ABSTRACT:
					{
					setState(91);
					entityType();
					}
					break;
				case NAME:
					{
					setState(92);
					entityArgument();
					}
					break;
				case INVERSE:
					{
					setState(93);
					inversePart();
					}
					break;
				case DERIVE:
					{
					setState(94);
					derivePart();
					}
					break;
				case WHERE:
					{
					setState(95);
					wherePart();
					}
					break;
				case UNIQUE:
					{
					setState(96);
					uniquePart();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUBTYPE_OF) | (1L << SUPERTYPE_OF) | (1L << ABSTRACT) | (1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE) | (1L << NAME))) != 0) );
			setState(101);
			endEntity();
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

	public static class BeginEntityContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(ExpressGrammarParser.ENTITY, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public BeginEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterBeginEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitBeginEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitBeginEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginEntityContext beginEntity() throws RecognitionException {
		BeginEntityContext _localctx = new BeginEntityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_beginEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ENTITY);
			setState(104);
			match(NAME);
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

	public static class EndEntityContext extends ParserRuleContext {
		public TerminalNode END_ENTITY() { return getToken(ExpressGrammarParser.END_ENTITY, 0); }
		public EndEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterEndEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitEndEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEndEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndEntityContext endEntity() throws RecognitionException {
		EndEntityContext _localctx = new EndEntityContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(END_ENTITY);
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

	public static class EntityTypeContext extends ParserRuleContext {
		public List<SubtypeOfContext> subtypeOf() {
			return getRuleContexts(SubtypeOfContext.class);
		}
		public SubtypeOfContext subtypeOf(int i) {
			return getRuleContext(SubtypeOfContext.class,i);
		}
		public List<SupertypeOfContext> supertypeOf() {
			return getRuleContexts(SupertypeOfContext.class);
		}
		public SupertypeOfContext supertypeOf(int i) {
			return getRuleContext(SupertypeOfContext.class,i);
		}
		public EntityTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterEntityType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitEntityType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEntityType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityTypeContext entityType() throws RecognitionException {
		EntityTypeContext _localctx = new EntityTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_entityType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBTYPE_OF) | (1L << SUPERTYPE_OF) | (1L << ABSTRACT))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUBTYPE_OF:
					{
					setState(108);
					subtypeOf();
					}
					break;
				case SUPERTYPE_OF:
				case ABSTRACT:
					{
					setState(109);
					supertypeOf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__0);
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

	public static class SubtypeOfContext extends ParserRuleContext {
		public SubtypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtypeOf; }
	 
		public SubtypeOfContext() { }
		public void copyFrom(SubtypeOfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubtypeContext extends SubtypeOfContext {
		public TerminalNode SUBTYPE_OF() { return getToken(ExpressGrammarParser.SUBTYPE_OF, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public SubtypeContext(SubtypeOfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitSubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtypeOfContext subtypeOf() throws RecognitionException {
		SubtypeOfContext _localctx = new SubtypeOfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subtypeOf);
		try {
			_localctx = new SubtypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(SUBTYPE_OF);
			setState(118);
			match(T__1);
			setState(119);
			match(NAME);
			setState(120);
			match(T__2);
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

	public static class SupertypeOfContext extends ParserRuleContext {
		public TerminalNode SUPERTYPE_OF() { return getToken(ExpressGrammarParser.SUPERTYPE_OF, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode ABSTRACT() { return getToken(ExpressGrammarParser.ABSTRACT, 0); }
		public TerminalNode ONEOF() { return getToken(ExpressGrammarParser.ONEOF, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public SupertypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supertypeOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterSupertypeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitSupertypeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSupertypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupertypeOfContext supertypeOf() throws RecognitionException {
		SupertypeOfContext _localctx = new SupertypeOfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_supertypeOf);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT) {
					{
					setState(122);
					match(ABSTRACT);
					}
				}

				setState(125);
				match(SUPERTYPE_OF);
				setState(126);
				match(T__1);
				setState(127);
				match(NAME);
				setState(128);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT) {
					{
					setState(129);
					match(ABSTRACT);
					}
				}

				setState(132);
				match(SUPERTYPE_OF);
				setState(133);
				match(T__1);
				setState(134);
				match(ONEOF);
				setState(135);
				nameList();
				setState(136);
				match(T__2);
				}
				break;
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

	public static class EntityArgumentContext extends ParserRuleContext {
		public EntityArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityArgument; }
	 
		public EntityArgumentContext() { }
		public void copyFrom(EntityArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrContext extends EntityArgumentContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(ExpressGrammarParser.OPTIONAL, 0); }
		public AttrContext(EntityArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityArgumentContext entityArgument() throws RecognitionException {
		EntityArgumentContext _localctx = new EntityArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entityArgument);
		int _la;
		try {
			_localctx = new AttrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(NAME);
			setState(141);
			match(T__3);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(142);
				match(OPTIONAL);
				}
			}

			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(145);
				typeName();
				}
				break;
			case 2:
				{
				setState(146);
				collectionOf();
				setState(147);
				typeName();
				}
				break;
			case 3:
				{
				setState(149);
				collectionOf();
				setState(150);
				collectionArgPart();
				}
				break;
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

	public static class CollectionOfContext extends ParserRuleContext {
		public TypeArrayKeywordContext typeArrayKeyword() {
			return getRuleContext(TypeArrayKeywordContext.class,0);
		}
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public List<TerminalNode> INT() { return getTokens(ExpressGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExpressGrammarParser.INT, i);
		}
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode UNIQUE() { return getToken(ExpressGrammarParser.UNIQUE, 0); }
		public CollectionOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterCollectionOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitCollectionOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCollectionOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionOfContext collectionOf() throws RecognitionException {
		CollectionOfContext _localctx = new CollectionOfContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_collectionOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			typeArrayKeyword();
			{
			setState(155);
			match(T__4);
			setState(156);
			match(INT);
			setState(157);
			match(T__3);
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << INT) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(T__6);
			}
			setState(161);
			match(OF);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(162);
				match(UNIQUE);
				}
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

	public static class CollectionArgPartContext extends ParserRuleContext {
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public CollectionArgPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionArgPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterCollectionArgPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitCollectionArgPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCollectionArgPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionArgPartContext collectionArgPart() throws RecognitionException {
		CollectionArgPartContext _localctx = new CollectionArgPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_collectionArgPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(165);
				collectionOf();
				setState(166);
				typeName();
				}
				break;
			case 2:
				{
				setState(168);
				collectionOf();
				setState(169);
				collectionArgPart();
				}
				break;
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

	public static class BeginNameListContext extends ParserRuleContext {
		public BeginNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterBeginNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitBeginNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitBeginNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginNameListContext beginNameList() throws RecognitionException {
		BeginNameListContext _localctx = new BeginNameListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_beginNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__1);
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

	public static class EndNameListContext extends ParserRuleContext {
		public EndNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterEndNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitEndNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEndNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndNameListContext endNameList() throws RecognitionException {
		EndNameListContext _localctx = new EndNameListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__2);
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

	public static class NameListContext extends ParserRuleContext {
		public BeginNameListContext beginNameList() {
			return getRuleContext(BeginNameListContext.class,0);
		}
		public EndNameListContext endNameList() {
			return getRuleContext(EndNameListContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nameList);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				beginNameList();
				setState(178);
				endNameList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				beginNameList();
				setState(181);
				names(0);
				setState(182);
				endNameList();
				}
				break;
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

	public static class NamesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		return names(0);
	}

	private NamesContext names(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NamesContext _localctx = new NamesContext(_ctx, _parentState);
		NamesContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(187);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NamesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_names);
					setState(189);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(190);
					match(T__7);
					setState(191);
					match(NAME);
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode INT() { return getToken(ExpressGrammarParser.INT, 0); }
		public TypeSingleKeywordContext typeSingleKeyword() {
			return getRuleContext(TypeSingleKeywordContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeName);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(NAME);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(198);
					match(T__1);
					setState(199);
					match(INT);
					setState(200);
					match(T__2);
					}
				}

				}
				break;
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				typeSingleKeyword();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(204);
					match(T__1);
					setState(205);
					match(INT);
					setState(206);
					match(T__2);
					}
				}

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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ExpressGrammarParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode END_TYPE() { return getToken(ExpressGrammarParser.END_TYPE, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public TerminalNode ENUMERATION() { return getToken(ExpressGrammarParser.ENUMERATION, 0); }
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(ExpressGrammarParser.SELECT, 0); }
		public TerminalNode FIXED() { return getToken(ExpressGrammarParser.FIXED, 0); }
		public List<WherePartContext> wherePart() {
			return getRuleContexts(WherePartContext.class);
		}
		public WherePartContext wherePart(int i) {
			return getRuleContext(WherePartContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TYPE);
			setState(212);
			match(NAME);
			setState(213);
			match(T__8);
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(214);
				typeName();
				}
				break;
			case 2:
				{
				setState(215);
				collectionOf();
				setState(216);
				typeName();
				}
				break;
			case 3:
				{
				setState(218);
				collectionOf();
				setState(219);
				collectionArgPart();
				}
				break;
			case 4:
				{
				setState(221);
				match(ENUMERATION);
				setState(222);
				match(OF);
				setState(223);
				nameList();
				}
				break;
			case 5:
				{
				setState(224);
				match(SELECT);
				setState(225);
				nameList();
				}
				break;
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIXED) {
				{
				setState(228);
				match(FIXED);
				}
			}

			setState(231);
			match(T__0);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHERE) {
				{
				{
				setState(232);
				wherePart();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(END_TYPE);
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

	public static class InversePartContext extends ParserRuleContext {
		public TerminalNode INVERSE() { return getToken(ExpressGrammarParser.INVERSE, 0); }
		public List<InverseSentenceContext> inverseSentence() {
			return getRuleContexts(InverseSentenceContext.class);
		}
		public InverseSentenceContext inverseSentence(int i) {
			return getRuleContext(InverseSentenceContext.class,i);
		}
		public InversePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterInversePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitInversePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitInversePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InversePartContext inversePart() throws RecognitionException {
		InversePartContext _localctx = new InversePartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inversePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(INVERSE);
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(241);
					inverseSentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InverseSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public TerminalNode FOR() { return getToken(ExpressGrammarParser.FOR, 0); }
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public InverseSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverseSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterInverseSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitInverseSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitInverseSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseSentenceContext inverseSentence() throws RecognitionException {
		InverseSentenceContext _localctx = new InverseSentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inverseSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			match(NAME);
			setState(247);
			match(T__3);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ARRAY) | (1L << LIST))) != 0)) {
				{
				setState(248);
				collectionOf();
				}
			}

			setState(251);
			match(NAME);
			setState(252);
			match(FOR);
			setState(253);
			match(NAME);
			setState(254);
			match(T__0);
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

	public static class DerivePartContext extends ParserRuleContext {
		public DeriveOverrideSentenceContext ov;
		public TerminalNode DERIVE() { return getToken(ExpressGrammarParser.DERIVE, 0); }
		public List<DeriveSentenceContext> deriveSentence() {
			return getRuleContexts(DeriveSentenceContext.class);
		}
		public DeriveSentenceContext deriveSentence(int i) {
			return getRuleContext(DeriveSentenceContext.class,i);
		}
		public List<DeriveOverrideSentenceContext> deriveOverrideSentence() {
			return getRuleContexts(DeriveOverrideSentenceContext.class);
		}
		public DeriveOverrideSentenceContext deriveOverrideSentence(int i) {
			return getRuleContext(DeriveOverrideSentenceContext.class,i);
		}
		public DerivePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterDerivePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitDerivePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitDerivePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivePartContext derivePart() throws RecognitionException {
		DerivePartContext _localctx = new DerivePartContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_derivePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(DERIVE);
			setState(259); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(257);
						deriveSentence();
						}
						break;
					case 2:
						{
						setState(258);
						((DerivePartContext)_localctx).ov = deriveOverrideSentence();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeriveOverrideSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CommonSentenceContext commonSentence() {
			return getRuleContext(CommonSentenceContext.class,0);
		}
		public DeriveOverrideSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriveOverrideSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterDeriveOverrideSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitDeriveOverrideSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitDeriveOverrideSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeriveOverrideSentenceContext deriveOverrideSentence() throws RecognitionException {
		DeriveOverrideSentenceContext _localctx = new DeriveOverrideSentenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_deriveOverrideSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELF_) {
				{
				{
				setState(263);
				match(SELF_);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(NAME);
			setState(270);
			match(T__9);
			setState(271);
			match(NAME);
			setState(272);
			match(T__3);
			setState(273);
			typeName();
			setState(274);
			match(T__10);
			setState(275);
			commonSentence();
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

	public static class DeriveSentenceContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public CommonSentenceContext commonSentence() {
			return getRuleContext(CommonSentenceContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public DeriveSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriveSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterDeriveSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitDeriveSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitDeriveSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeriveSentenceContext deriveSentence() throws RecognitionException {
		DeriveSentenceContext _localctx = new DeriveSentenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_deriveSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(NAME);
			setState(278);
			match(T__3);
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
			case NAME:
				{
				setState(279);
				typeName();
				}
				break;
			case SET:
			case ARRAY:
			case LIST:
				{
				setState(280);
				collectionArgPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			match(T__10);
			setState(284);
			commonSentence();
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

	public static class UniquePartContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(ExpressGrammarParser.UNIQUE, 0); }
		public List<UniqueSentenceContext> uniqueSentence() {
			return getRuleContexts(UniqueSentenceContext.class);
		}
		public UniqueSentenceContext uniqueSentence(int i) {
			return getRuleContext(UniqueSentenceContext.class,i);
		}
		public UniquePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniquePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterUniquePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitUniquePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitUniquePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniquePartContext uniquePart() throws RecognitionException {
		UniquePartContext _localctx = new UniquePartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_uniquePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(UNIQUE);
			setState(288); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(287);
					uniqueSentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(290); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UniqueSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public UniqueSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterUniqueSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitUniqueSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitUniqueSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueSentenceContext uniqueSentence() throws RecognitionException {
		UniqueSentenceContext _localctx = new UniqueSentenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_uniqueSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(NAME);
			setState(293);
			match(T__3);
			setState(294);
			match(NAME);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(295);
				match(T__7);
				setState(296);
				match(NAME);
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(T__0);
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

	public static class WherePartContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExpressGrammarParser.WHERE, 0); }
		public List<WhereSentenceContext> whereSentence() {
			return getRuleContexts(WhereSentenceContext.class);
		}
		public WhereSentenceContext whereSentence(int i) {
			return getRuleContext(WhereSentenceContext.class,i);
		}
		public WherePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterWherePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitWherePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitWherePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WherePartContext wherePart() throws RecognitionException {
		WherePartContext _localctx = new WherePartContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wherePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(WHERE);
			setState(306); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(305);
					whereSentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(308); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class WhereSentenceContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public CommonSentenceContext commonSentence() {
			return getRuleContext(CommonSentenceContext.class,0);
		}
		public WhereSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterWhereSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitWhereSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitWhereSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereSentenceContext whereSentence() throws RecognitionException {
		WhereSentenceContext _localctx = new WhereSentenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whereSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(NAME);
			setState(311);
			match(T__3);
			setState(312);
			commonSentence();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ExpressGrammarParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode END_FUNCTION() { return getToken(ExpressGrammarParser.END_FUNCTION, 0); }
		public List<CommonKeywordContext> commonKeyword() {
			return getRuleContexts(CommonKeywordContext.class);
		}
		public CommonKeywordContext commonKeyword(int i) {
			return getRuleContext(CommonKeywordContext.class,i);
		}
		public List<CommonSentenceContext> commonSentence() {
			return getRuleContexts(CommonSentenceContext.class);
		}
		public CommonSentenceContext commonSentence(int i) {
			return getRuleContext(CommonSentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(FUNCTION);
			setState(315);
			match(NAME);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHERE:
				case DERIVE:
				case UNIQUE:
				case INVERSE:
					{
					setState(316);
					commonKeyword();
					}
					break;
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case INT:
				case ONEOF:
				case ABSTRACT:
				case OPTIONAL:
				case FIXED:
				case OF:
				case SET:
				case ARRAY:
				case LIST:
				case BOOLEAN:
				case REAL:
				case INTEGER:
				case BINARY:
				case NUMBER:
				case STRING:
				case ENUMERATION:
				case SELECT:
				case SELF_:
				case FOR:
				case NAME:
					{
					setState(317);
					commonSentence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << INT) | (1L << ONEOF) | (1L << ABSTRACT) | (1L << OPTIONAL) | (1L << FIXED) | (1L << OF) | (1L << SET) | (1L << ARRAY) | (1L << LIST) | (1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING) | (1L << ENUMERATION) | (1L << SELECT) | (1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE) | (1L << SELF_) | (1L << FOR) | (1L << NAME))) != 0) );
			setState(322);
			match(END_FUNCTION);
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

	public static class TheruleContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(ExpressGrammarParser.RULE, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode END_RULE() { return getToken(ExpressGrammarParser.END_RULE, 0); }
		public List<CommonKeywordContext> commonKeyword() {
			return getRuleContexts(CommonKeywordContext.class);
		}
		public CommonKeywordContext commonKeyword(int i) {
			return getRuleContext(CommonKeywordContext.class,i);
		}
		public List<CommonSentenceContext> commonSentence() {
			return getRuleContexts(CommonSentenceContext.class);
		}
		public CommonSentenceContext commonSentence(int i) {
			return getRuleContext(CommonSentenceContext.class,i);
		}
		public TheruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_therule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterTherule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitTherule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTherule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheruleContext therule() throws RecognitionException {
		TheruleContext _localctx = new TheruleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_therule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(RULE);
			setState(325);
			match(NAME);
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(328);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHERE:
				case DERIVE:
				case UNIQUE:
				case INVERSE:
					{
					setState(326);
					commonKeyword();
					}
					break;
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case INT:
				case ONEOF:
				case ABSTRACT:
				case OPTIONAL:
				case FIXED:
				case OF:
				case SET:
				case ARRAY:
				case LIST:
				case BOOLEAN:
				case REAL:
				case INTEGER:
				case BINARY:
				case NUMBER:
				case STRING:
				case ENUMERATION:
				case SELECT:
				case SELF_:
				case FOR:
				case NAME:
					{
					setState(327);
					commonSentence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << INT) | (1L << ONEOF) | (1L << ABSTRACT) | (1L << OPTIONAL) | (1L << FIXED) | (1L << OF) | (1L << SET) | (1L << ARRAY) | (1L << LIST) | (1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING) | (1L << ENUMERATION) | (1L << SELECT) | (1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE) | (1L << SELF_) | (1L << FOR) | (1L << NAME))) != 0) );
			setState(332);
			match(END_RULE);
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

	public static class CommonKeywordContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExpressGrammarParser.WHERE, 0); }
		public TerminalNode DERIVE() { return getToken(ExpressGrammarParser.DERIVE, 0); }
		public TerminalNode UNIQUE() { return getToken(ExpressGrammarParser.UNIQUE, 0); }
		public TerminalNode INVERSE() { return getToken(ExpressGrammarParser.INVERSE, 0); }
		public CommonKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterCommonKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitCommonKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCommonKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonKeywordContext commonKeyword() throws RecognitionException {
		CommonKeywordContext _localctx = new CommonKeywordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_commonKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE))) != 0)) ) {
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

	public static class CommonSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExpressGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExpressGrammarParser.INT, i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public List<InnerKeywordContext> innerKeyword() {
			return getRuleContexts(InnerKeywordContext.class);
		}
		public InnerKeywordContext innerKeyword(int i) {
			return getRuleContext(InnerKeywordContext.class,i);
		}
		public CommonSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterCommonSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitCommonSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCommonSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonSentenceContext commonSentence() throws RecognitionException {
		CommonSentenceContext _localctx = new CommonSentenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_commonSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(336);
					match(NAME);
					}
					break;
				case INT:
					{
					setState(337);
					match(INT);
					}
					break;
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
					{
					setState(338);
					sign();
					}
					break;
				case ONEOF:
				case ABSTRACT:
				case OPTIONAL:
				case FIXED:
				case OF:
				case SET:
				case ARRAY:
				case LIST:
				case BOOLEAN:
				case REAL:
				case INTEGER:
				case BINARY:
				case NUMBER:
				case STRING:
				case ENUMERATION:
				case SELECT:
				case SELF_:
				case FOR:
					{
					setState(339);
					innerKeyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << INT) | (1L << ONEOF) | (1L << ABSTRACT) | (1L << OPTIONAL) | (1L << FIXED) | (1L << OF) | (1L << SET) | (1L << ARRAY) | (1L << LIST) | (1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING) | (1L << ENUMERATION) | (1L << SELECT) | (1L << SELF_) | (1L << FOR) | (1L << NAME))) != 0) );
			setState(344);
			match(T__0);
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

	public static class TypeSingleKeywordContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ExpressGrammarParser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(ExpressGrammarParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(ExpressGrammarParser.INTEGER, 0); }
		public TerminalNode BINARY() { return getToken(ExpressGrammarParser.BINARY, 0); }
		public TerminalNode NUMBER() { return getToken(ExpressGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ExpressGrammarParser.STRING, 0); }
		public TypeSingleKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSingleKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterTypeSingleKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitTypeSingleKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeSingleKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSingleKeywordContext typeSingleKeyword() throws RecognitionException {
		TypeSingleKeywordContext _localctx = new TypeSingleKeywordContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeSingleKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
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

	public static class TypeArrayKeywordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ExpressGrammarParser.SET, 0); }
		public TerminalNode ARRAY() { return getToken(ExpressGrammarParser.ARRAY, 0); }
		public TerminalNode LIST() { return getToken(ExpressGrammarParser.LIST, 0); }
		public TypeArrayKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArrayKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterTypeArrayKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitTypeArrayKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeArrayKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayKeywordContext typeArrayKeyword() throws RecognitionException {
		TypeArrayKeywordContext _localctx = new TypeArrayKeywordContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeArrayKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ARRAY) | (1L << LIST))) != 0)) ) {
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

	public static class TypeKeywordContext extends ParserRuleContext {
		public TypeSingleKeywordContext typeSingleKeyword() {
			return getRuleContext(TypeSingleKeywordContext.class,0);
		}
		public TypeArrayKeywordContext typeArrayKeyword() {
			return getRuleContext(TypeArrayKeywordContext.class,0);
		}
		public TerminalNode ENUMERATION() { return getToken(ExpressGrammarParser.ENUMERATION, 0); }
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public TerminalNode SELECT() { return getToken(ExpressGrammarParser.SELECT, 0); }
		public TypeKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterTypeKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitTypeKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeKeywordContext typeKeyword() throws RecognitionException {
		TypeKeywordContext _localctx = new TypeKeywordContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeKeyword);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				typeSingleKeyword();
				}
				break;
			case SET:
			case ARRAY:
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				typeArrayKeyword();
				}
				break;
			case ENUMERATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(ENUMERATION);
				setState(353);
				match(OF);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(SELECT);
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

	public static class InnerKeywordContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(ExpressGrammarParser.ONEOF, 0); }
		public TerminalNode ABSTRACT() { return getToken(ExpressGrammarParser.ABSTRACT, 0); }
		public TerminalNode OPTIONAL() { return getToken(ExpressGrammarParser.OPTIONAL, 0); }
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public TerminalNode FIXED() { return getToken(ExpressGrammarParser.FIXED, 0); }
		public TerminalNode SELF_() { return getToken(ExpressGrammarParser.SELF_, 0); }
		public TerminalNode FOR() { return getToken(ExpressGrammarParser.FOR, 0); }
		public TypeKeywordContext typeKeyword() {
			return getRuleContext(TypeKeywordContext.class,0);
		}
		public InnerKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterInnerKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitInnerKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitInnerKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerKeywordContext innerKeyword() throws RecognitionException {
		InnerKeywordContext _localctx = new InnerKeywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_innerKeyword);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONEOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(ONEOF);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(ABSTRACT);
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(OPTIONAL);
				}
				break;
			case OF:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(OF);
				}
				break;
			case FIXED:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(FIXED);
				}
				break;
			case SELF_:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(SELF_);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(FOR);
				}
				break;
			case SET:
			case ARRAY:
			case LIST:
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
			case ENUMERATION:
			case SELECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				typeKeyword();
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

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressGrammarListener ) ((ExpressGrammarListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		case 15:
			return names_sempred((NamesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean names_sempred(NamesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0174\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5d\n"+
		"\5\r\5\16\5e\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\bq\n\b\f\b\16\bt\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\5\n~\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0085"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\5\13\u0092\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bb\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00c3\n\21\f\21\16\21\u00c6\13"+
		"\21\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\3\22\3\22\5\22\u00d2"+
		"\n\22\5\22\u00d4\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00e5\n\23\3\23\5\23\u00e8\n\23\3\23\3"+
		"\23\7\23\u00ec\n\23\f\23\16\23\u00ef\13\23\3\23\3\23\3\24\3\24\6\24\u00f5"+
		"\n\24\r\24\16\24\u00f6\3\25\3\25\3\25\5\25\u00fc\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\6\26\u0106\n\26\r\26\16\26\u0107\3\27\7\27\u010b"+
		"\n\27\f\27\16\27\u010e\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\5\30\u011c\n\30\3\30\3\30\3\30\3\31\3\31\6\31\u0123"+
		"\n\31\r\31\16\31\u0124\3\32\3\32\3\32\3\32\3\32\7\32\u012c\n\32\f\32\16"+
		"\32\u012f\13\32\3\32\3\32\3\33\3\33\6\33\u0135\n\33\r\33\16\33\u0136\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\6\35\u0141\n\35\r\35\16\35\u0142"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\6\36\u014b\n\36\r\36\16\36\u014c\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \3 \6 \u0157\n \r \16 \u0158\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3#\3#\3#\5#\u0166\n#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0170\n$\3%\3%"+
		"\3%\2\3 &\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFH\2\7\5\2\b\b\35\35@@\3\2:=\3\2\62\67\3\2/\61\3\2\4\32\2\u0189"+
		"\2J\3\2\2\2\4V\3\2\2\2\6Z\3\2\2\2\b\\\3\2\2\2\ni\3\2\2\2\fl\3\2\2\2\16"+
		"r\3\2\2\2\20w\3\2\2\2\22\u008c\3\2\2\2\24\u008e\3\2\2\2\26\u009c\3\2\2"+
		"\2\30\u00ad\3\2\2\2\32\u00af\3\2\2\2\34\u00b1\3\2\2\2\36\u00ba\3\2\2\2"+
		" \u00bc\3\2\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2\2&\u00f2\3\2\2\2(\u00f8\3"+
		"\2\2\2*\u0102\3\2\2\2,\u010c\3\2\2\2.\u0117\3\2\2\2\60\u0120\3\2\2\2\62"+
		"\u0126\3\2\2\2\64\u0132\3\2\2\2\66\u0138\3\2\2\28\u013c\3\2\2\2:\u0146"+
		"\3\2\2\2<\u0150\3\2\2\2>\u0156\3\2\2\2@\u015c\3\2\2\2B\u015e\3\2\2\2D"+
		"\u0165\3\2\2\2F\u016f\3\2\2\2H\u0171\3\2\2\2JQ\5\4\3\2KP\5\b\5\2LP\5$"+
		"\23\2MP\58\35\2NP\5:\36\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PS\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\5\6\4\2U\3\3\2\2\2VW"+
		"\7\36\2\2WX\7@\2\2XY\7\3\2\2Y\5\3\2\2\2Z[\7\37\2\2[\7\3\2\2\2\\c\5\n\6"+
		"\2]d\5\16\b\2^d\5\24\13\2_d\5&\24\2`d\5*\26\2ad\5\64\33\2bd\5\60\31\2"+
		"c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5\f\7\2h\t\3\2\2\2ij\7\"\2\2jk\7@\2\2"+
		"k\13\3\2\2\2lm\7#\2\2m\r\3\2\2\2nq\5\20\t\2oq\5\22\n\2pn\3\2\2\2po\3\2"+
		"\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\3\2\2v\17\3"+
		"\2\2\2wx\7(\2\2xy\7\4\2\2yz\7@\2\2z{\7\5\2\2{\21\3\2\2\2|~\7+\2\2}|\3"+
		"\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7)\2\2\u0080\u0081\7\4\2\2\u0081"+
		"\u0082\7@\2\2\u0082\u008d\7\5\2\2\u0083\u0085\7+\2\2\u0084\u0083\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7)\2\2\u0087\u0088"+
		"\7\4\2\2\u0088\u0089\7*\2\2\u0089\u008a\5\36\20\2\u008a\u008b\7\5\2\2"+
		"\u008b\u008d\3\2\2\2\u008c}\3\2\2\2\u008c\u0084\3\2\2\2\u008d\23\3\2\2"+
		"\2\u008e\u008f\7@\2\2\u008f\u0091\7\6\2\2\u0090\u0092\7,\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009a\3\2\2\2\u0093\u009b\5\"\22\2"+
		"\u0094\u0095\5\26\f\2\u0095\u0096\5\"\22\2\u0096\u009b\3\2\2\2\u0097\u0098"+
		"\5\26\f\2\u0098\u0099\5\30\r\2\u0099\u009b\3\2\2\2\u009a\u0093\3\2\2\2"+
		"\u009a\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d"+
		"\5B\"\2\u009d\u009e\7\7\2\2\u009e\u009f\7\35\2\2\u009f\u00a0\7\6\2\2\u00a0"+
		"\u00a1\t\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\7."+
		"\2\2\u00a4\u00a6\7<\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\27\3\2\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\5\"\22\2\u00a9\u00ae\3\2"+
		"\2\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\5\30\r\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7\4\2"+
		"\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\5\2\2\u00b2\35\3\2\2\2\u00b3\u00b4\5"+
		"\32\16\2\u00b4\u00b5\5\34\17\2\u00b5\u00bb\3\2\2\2\u00b6\u00b7\5\32\16"+
		"\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\5\34\17\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b3\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\37\3\2\2\2\u00bc\u00bd\b\21\1"+
		"\2\u00bd\u00be\7@\2\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\f\4\2\2\u00c0\u00c1"+
		"\7\n\2\2\u00c1\u00c3\7@\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c7\u00cb\7@\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\7\35\2\2\u00ca\u00cc"+
		"\7\5\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d4\3\2\2\2\u00cd"+
		"\u00d1\5@!\2\u00ce\u00cf\7\4\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d2\7\5"+
		"\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00c7\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d4#\3\2\2\2\u00d5\u00d6\7 \2\2\u00d6"+
		"\u00d7\7@\2\2\u00d7\u00e4\7\13\2\2\u00d8\u00e5\5\"\22\2\u00d9\u00da\5"+
		"\26\f\2\u00da\u00db\5\"\22\2\u00db\u00e5\3\2\2\2\u00dc\u00dd\5\26\f\2"+
		"\u00dd\u00de\5\30\r\2\u00de\u00e5\3\2\2\2\u00df\u00e0\78\2\2\u00e0\u00e1"+
		"\7.\2\2\u00e1\u00e5\5\36\20\2\u00e2\u00e3\79\2\2\u00e3\u00e5\5\36\20\2"+
		"\u00e4\u00d8\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00df"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\7-\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ed\7\3"+
		"\2\2\u00ea\u00ec\5\64\33\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7!\2\2\u00f1%\3\2\2\2\u00f2\u00f4\7=\2\2\u00f3\u00f5"+
		"\5(\25\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fb\7\6\2\2"+
		"\u00fa\u00fc\5\26\f\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\7@\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100\7@\2\2\u0100"+
		"\u0101\7\3\2\2\u0101)\3\2\2\2\u0102\u0105\7;\2\2\u0103\u0106\5.\30\2\u0104"+
		"\u0106\5,\27\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108+\3\2\2\2\u0109\u010b"+
		"\7>\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7@"+
		"\2\2\u0110\u0111\7\f\2\2\u0111\u0112\7@\2\2\u0112\u0113\7\6\2\2\u0113"+
		"\u0114\5\"\22\2\u0114\u0115\7\r\2\2\u0115\u0116\5> \2\u0116-\3\2\2\2\u0117"+
		"\u0118\7@\2\2\u0118\u011b\7\6\2\2\u0119\u011c\5\"\22\2\u011a\u011c\5\30"+
		"\r\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\7\r\2\2\u011e\u011f\5> \2\u011f/\3\2\2\2\u0120\u0122\7<\2\2\u0121"+
		"\u0123\5\62\32\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\61\3\2\2\2\u0126\u0127\7@\2\2\u0127\u0128"+
		"\7\6\2\2\u0128\u012d\7@\2\2\u0129\u012a\7\n\2\2\u012a\u012c\7@\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\3\2\2\u0131"+
		"\63\3\2\2\2\u0132\u0134\7:\2\2\u0133\u0135\5\66\34\2\u0134\u0133\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\65"+
		"\3\2\2\2\u0138\u0139\7@\2\2\u0139\u013a\7\6\2\2\u013a\u013b\5> \2\u013b"+
		"\67\3\2\2\2\u013c\u013d\7$\2\2\u013d\u0140\7@\2\2\u013e\u0141\5<\37\2"+
		"\u013f\u0141\5> \2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7%\2\2\u01459\3\2\2\2\u0146\u0147\7&\2\2\u0147\u014a\7@\2\2\u0148"+
		"\u014b\5<\37\2\u0149\u014b\5> \2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2"+
		"\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\7\'\2\2\u014f;\3\2\2\2\u0150\u0151\t\3\2\2\u0151"+
		"=\3\2\2\2\u0152\u0157\7@\2\2\u0153\u0157\7\35\2\2\u0154\u0157\5H%\2\u0155"+
		"\u0157\5F$\2\u0156\u0152\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2"+
		"\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\3\2\2\u015b?\3\2\2\2\u015c"+
		"\u015d\t\4\2\2\u015dA\3\2\2\2\u015e\u015f\t\5\2\2\u015fC\3\2\2\2\u0160"+
		"\u0166\5@!\2\u0161\u0166\5B\"\2\u0162\u0163\78\2\2\u0163\u0166\7.\2\2"+
		"\u0164\u0166\79\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0162"+
		"\3\2\2\2\u0165\u0164\3\2\2\2\u0166E\3\2\2\2\u0167\u0170\7*\2\2\u0168\u0170"+
		"\7+\2\2\u0169\u0170\7,\2\2\u016a\u0170\7.\2\2\u016b\u0170\7-\2\2\u016c"+
		"\u0170\7>\2\2\u016d\u0170\7?\2\2\u016e\u0170\5D#\2\u016f\u0167\3\2\2\2"+
		"\u016f\u0168\3\2\2\2\u016f\u0169\3\2\2\2\u016f\u016a\3\2\2\2\u016f\u016b"+
		"\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"G\3\2\2\2\u0171\u0172\t\6\2\2\u0172I\3\2\2\2(OQcepr}\u0084\u008c\u0091"+
		"\u009a\u00a5\u00ad\u00ba\u00c4\u00cb\u00d1\u00d3\u00e4\u00e7\u00ed\u00f6"+
		"\u00fb\u0105\u0107\u010c\u011b\u0124\u012d\u0136\u0140\u0142\u014a\u014c"+
		"\u0156\u0158\u0165\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}