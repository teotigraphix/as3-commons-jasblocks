// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g 2011-08-16 07:44:01

package org.as3commons.asblocks.parser.antlr.as3;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.MismatchedTokenException;
import org.as3commons.asblocks.impl.TokenBuilder;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTokenStream;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.LinkedListTreeAdaptor;
import org.as3commons.asblocks.parser.antlr.e4x.E4XHelper;
import org.as3commons.asblocks.parser.antlr.regexsimple.RegexSimpleHelper;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class AS3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMPILATION_UNIT", "MXML_SCRIPT_UNIT", "PROGRAM_UNIT", "COMPILE_CONFIG", "ANNOTATIONS", "METATAG", "METATAG_PARAMS", "MODIFIERS", "NAMESPACE_DEF", "TYPE_BLOCK", "STATIC_BLOCK", "BLOCK", "CLASS_DEF", "INTERFACE_DEF", "FUNCTION_DEF", "FIELD_DEF", "VARIABLE_DEF", "VAR_DEC", "FUNC_DEF", "METHOD_DEF", "TYPE_SPEC", "TYPE", "TYPE_POSTFIX", "VAR_INIT", "ACCESSOR_ROLE", "PARAMS", "PARAM", "EXPR_STMNT", "ENCPS_EXPR", "CONDITION", "ELIST", "FUNCTION_CALL", "ARGUMENTS", "FIELD_ACCESS", "ARRAY_ACCESS", "MULT", "UNARY_PLUS", "UNARY_MINUS", "POST_INC", "POST_DEC", "PRE_INC", "PRE_DEC", "ARRAY_LITERAL", "OBJECT_LITERAL", "OBJECT_FIELD", "FOR_INIT", "FOR_CONDITION", "FOR_ITERATOR", "FOR_EACH", "FOR_IN", "SWITCH_STATEMENT_LIST", "LABEL_STMNT", "DEFAULT_XML_NAMESPACE", "STATIC_LINK", "SR", "BSR", "STAR_ASSIGN", "SR_ASSIGN", "BSR_ASSIGN", "GE", "E4X_FILTER", "E4X_ATTRI_PROPERTY", "E4X_ATTRI_STAR", "E4X_ATTRI_EXPR", "E4X_EXPRESSION", "VECTOR_INIT", "VIRTUAL_PLACEHOLDER", "XML_EMPTY_ELEMENT", "XML_ELEMENT", "XML_ATTRIBUTE", "XML_LIST", "PACKAGE", "LBRACE", "RBRACE", "SEMI", "IDENT", "DBL_COLON", "LBRACK", "RBRACK", "LPAREN", "COMMA", "RPAREN", "ASSIGN", "INCLUDE", "STRING_LITERAL", "USE", "NAMESPACE", "IMPORT", "DOT", "STAR", "DYNAMIC", "FINAL", "INTERNAL", "OVERRIDE", "PRIVATE", "PROTECTED", "PUBLIC", "STATIC", "NATIVE", "CLASS", "EXTENDS", "IMPLEMENTS", "INTERFACE", "FUNCTION", "GET", "SET", "VAR", "CONST", "IF", "ELSE", "FOR", "EACH", "IN", "THROW", "TRY", "CATCH", "FINALLY", "SWITCH", "CASE", "COLON", "DEFAULT", "WHILE", "DO", "WITH", "RETURN", "CONTINUE", "BREAK", "VOID", "POST", "GT", "IS", "AS", "DIV_ASSIGN", "MOD_ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "SL_ASSIGN", "BAND_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "LAND_ASSIGN", "LOR_ASSIGN", "QUESTION", "LOR", "LAND", "BOR", "BXOR", "BAND", "STRICT_EQUAL", "STRICT_NOT_EQUAL", "NOT_EQUAL", "EQUAL", "LT", "LE", "INSTANCEOF", "SL", "PLUS", "MINUS", "DIV", "MOD", "INC", "DEC", "DELETE", "TYPEOF", "LNOT", "BNOT", "E4X_DESC", "UNDEFINED", "THIS", "SUPER", "NEW", "NULL", "FALSE", "TRUE", "XML_LITERAL", "REGEXP_LITERAL", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOAT_LITERAL", "REST", "E4X_ATTRI", "BSLASH", "REGEX_BODY", "REGEX_POSTFIX", "XML_SUBTREE", "XML_BINDING", "XML_WS", "XML_TEXTNODE", "XML_COMMENT", "XML_CDATA", "XML_AS3_EXPRESSION", "ESC", "HEX_DIGIT", "EXPONENT", "WS", "EOL", "BOM", "SL_COMMENT", "ML_COMMENT", "OCT_DIGIT", "CTRLCHAR_ESC", "UNICODE_ESC", "OCTAL_ESC"
    };
    public static final int EOF=-1;
    public static final int COMPILATION_UNIT=4;
    public static final int MXML_SCRIPT_UNIT=5;
    public static final int PROGRAM_UNIT=6;
    public static final int COMPILE_CONFIG=7;
    public static final int ANNOTATIONS=8;
    public static final int METATAG=9;
    public static final int METATAG_PARAMS=10;
    public static final int MODIFIERS=11;
    public static final int NAMESPACE_DEF=12;
    public static final int TYPE_BLOCK=13;
    public static final int STATIC_BLOCK=14;
    public static final int BLOCK=15;
    public static final int CLASS_DEF=16;
    public static final int INTERFACE_DEF=17;
    public static final int FUNCTION_DEF=18;
    public static final int FIELD_DEF=19;
    public static final int VARIABLE_DEF=20;
    public static final int VAR_DEC=21;
    public static final int FUNC_DEF=22;
    public static final int METHOD_DEF=23;
    public static final int TYPE_SPEC=24;
    public static final int TYPE=25;
    public static final int TYPE_POSTFIX=26;
    public static final int VAR_INIT=27;
    public static final int ACCESSOR_ROLE=28;
    public static final int PARAMS=29;
    public static final int PARAM=30;
    public static final int EXPR_STMNT=31;
    public static final int ENCPS_EXPR=32;
    public static final int CONDITION=33;
    public static final int ELIST=34;
    public static final int FUNCTION_CALL=35;
    public static final int ARGUMENTS=36;
    public static final int FIELD_ACCESS=37;
    public static final int ARRAY_ACCESS=38;
    public static final int MULT=39;
    public static final int UNARY_PLUS=40;
    public static final int UNARY_MINUS=41;
    public static final int POST_INC=42;
    public static final int POST_DEC=43;
    public static final int PRE_INC=44;
    public static final int PRE_DEC=45;
    public static final int ARRAY_LITERAL=46;
    public static final int OBJECT_LITERAL=47;
    public static final int OBJECT_FIELD=48;
    public static final int FOR_INIT=49;
    public static final int FOR_CONDITION=50;
    public static final int FOR_ITERATOR=51;
    public static final int FOR_EACH=52;
    public static final int FOR_IN=53;
    public static final int SWITCH_STATEMENT_LIST=54;
    public static final int LABEL_STMNT=55;
    public static final int DEFAULT_XML_NAMESPACE=56;
    public static final int STATIC_LINK=57;
    public static final int SR=58;
    public static final int BSR=59;
    public static final int STAR_ASSIGN=60;
    public static final int SR_ASSIGN=61;
    public static final int BSR_ASSIGN=62;
    public static final int GE=63;
    public static final int E4X_FILTER=64;
    public static final int E4X_ATTRI_PROPERTY=65;
    public static final int E4X_ATTRI_STAR=66;
    public static final int E4X_ATTRI_EXPR=67;
    public static final int E4X_EXPRESSION=68;
    public static final int VECTOR_INIT=69;
    public static final int VIRTUAL_PLACEHOLDER=70;
    public static final int XML_EMPTY_ELEMENT=71;
    public static final int XML_ELEMENT=72;
    public static final int XML_ATTRIBUTE=73;
    public static final int XML_LIST=74;
    public static final int PACKAGE=75;
    public static final int LBRACE=76;
    public static final int RBRACE=77;
    public static final int SEMI=78;
    public static final int IDENT=79;
    public static final int DBL_COLON=80;
    public static final int LBRACK=81;
    public static final int RBRACK=82;
    public static final int LPAREN=83;
    public static final int COMMA=84;
    public static final int RPAREN=85;
    public static final int ASSIGN=86;
    public static final int INCLUDE=87;
    public static final int STRING_LITERAL=88;
    public static final int USE=89;
    public static final int NAMESPACE=90;
    public static final int IMPORT=91;
    public static final int DOT=92;
    public static final int STAR=93;
    public static final int DYNAMIC=94;
    public static final int FINAL=95;
    public static final int INTERNAL=96;
    public static final int OVERRIDE=97;
    public static final int PRIVATE=98;
    public static final int PROTECTED=99;
    public static final int PUBLIC=100;
    public static final int STATIC=101;
    public static final int NATIVE=102;
    public static final int CLASS=103;
    public static final int EXTENDS=104;
    public static final int IMPLEMENTS=105;
    public static final int INTERFACE=106;
    public static final int FUNCTION=107;
    public static final int GET=108;
    public static final int SET=109;
    public static final int VAR=110;
    public static final int CONST=111;
    public static final int IF=112;
    public static final int ELSE=113;
    public static final int FOR=114;
    public static final int EACH=115;
    public static final int IN=116;
    public static final int THROW=117;
    public static final int TRY=118;
    public static final int CATCH=119;
    public static final int FINALLY=120;
    public static final int SWITCH=121;
    public static final int CASE=122;
    public static final int COLON=123;
    public static final int DEFAULT=124;
    public static final int WHILE=125;
    public static final int DO=126;
    public static final int WITH=127;
    public static final int RETURN=128;
    public static final int CONTINUE=129;
    public static final int BREAK=130;
    public static final int VOID=131;
    public static final int POST=132;
    public static final int GT=133;
    public static final int IS=134;
    public static final int AS=135;
    public static final int DIV_ASSIGN=136;
    public static final int MOD_ASSIGN=137;
    public static final int PLUS_ASSIGN=138;
    public static final int MINUS_ASSIGN=139;
    public static final int SL_ASSIGN=140;
    public static final int BAND_ASSIGN=141;
    public static final int BXOR_ASSIGN=142;
    public static final int BOR_ASSIGN=143;
    public static final int LAND_ASSIGN=144;
    public static final int LOR_ASSIGN=145;
    public static final int QUESTION=146;
    public static final int LOR=147;
    public static final int LAND=148;
    public static final int BOR=149;
    public static final int BXOR=150;
    public static final int BAND=151;
    public static final int STRICT_EQUAL=152;
    public static final int STRICT_NOT_EQUAL=153;
    public static final int NOT_EQUAL=154;
    public static final int EQUAL=155;
    public static final int LT=156;
    public static final int LE=157;
    public static final int INSTANCEOF=158;
    public static final int SL=159;
    public static final int PLUS=160;
    public static final int MINUS=161;
    public static final int DIV=162;
    public static final int MOD=163;
    public static final int INC=164;
    public static final int DEC=165;
    public static final int DELETE=166;
    public static final int TYPEOF=167;
    public static final int LNOT=168;
    public static final int BNOT=169;
    public static final int E4X_DESC=170;
    public static final int UNDEFINED=171;
    public static final int THIS=172;
    public static final int SUPER=173;
    public static final int NEW=174;
    public static final int NULL=175;
    public static final int FALSE=176;
    public static final int TRUE=177;
    public static final int XML_LITERAL=178;
    public static final int REGEXP_LITERAL=179;
    public static final int HEX_LITERAL=180;
    public static final int DECIMAL_LITERAL=181;
    public static final int OCTAL_LITERAL=182;
    public static final int FLOAT_LITERAL=183;
    public static final int REST=184;
    public static final int E4X_ATTRI=185;
    public static final int BSLASH=186;
    public static final int REGEX_BODY=187;
    public static final int REGEX_POSTFIX=188;
    public static final int XML_SUBTREE=189;
    public static final int XML_BINDING=190;
    public static final int XML_WS=191;
    public static final int XML_TEXTNODE=192;
    public static final int XML_COMMENT=193;
    public static final int XML_CDATA=194;
    public static final int XML_AS3_EXPRESSION=195;
    public static final int ESC=196;
    public static final int HEX_DIGIT=197;
    public static final int EXPONENT=198;
    public static final int WS=199;
    public static final int EOL=200;
    public static final int BOM=201;
    public static final int SL_COMMENT=202;
    public static final int ML_COMMENT=203;
    public static final int OCT_DIGIT=204;
    public static final int CTRLCHAR_ESC=205;
    public static final int UNICODE_ESC=206;
    public static final int OCTAL_ESC=207;

    // delegates
    // delegators

    protected static class InOperator_scope {
        boolean allowed;
    }
    protected Stack InOperator_stack = new Stack();


        public AS3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public AS3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return AS3Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g"; }



    	public static final int CHANNEL_PLACEHOLDER = 999;
    	
    	private AS3Lexer lexer;
    	
    	private CharStream cs;
    	
    	public void setInput(AS3Lexer lexer, CharStream cs)
    	{
    		this.lexer = lexer;
    		this.cs = cs;
    	}
    	
    	protected void mismatch(IntStream input, int ttype, BitSet follow) throws MismatchedTokenException
    	{
    		throw new MismatchedTokenException(ttype, input);
    	}
    	
    	private LinkedListTree parseXMLLiteral() throws RecognitionException
    	{
    		return E4XHelper.parseXMLLiteral(lexer, cs, (LinkedListTokenStream)input);
    	}
    	
    	private LinkedListTree parseRegexpLiteral(LinkedListToken startMarker) throws RecognitionException
    	{
    		return RegexSimpleHelper.parseRegexpLiteral(startMarker, lexer, cs, (LinkedListTokenStream)input);
    	}

    	private LinkedListToken placeholder(LinkedListTree imaginary)
    	{
    		return AS3ParserHelper.placeholder(input, imaginary);
    	}
    	
    	private void demarcate(LinkedListTree parent)
    	{
    		AS3ParserHelper.demarcate(parent);
    	}
    	
    	private boolean findVirtualHiddenToken(ParserRuleReturnScope retval)
    	{
    		return AS3ParserHelper.findVirtualHiddenToken(input, retval);
    	}
    	
    	boolean packageBlockParse = false;
    	
    	public boolean getPackageBlockParse()
    	{
    		return packageBlockParse;
    	}	
    	
    	public void setPackageBlockParse(boolean value)
    	{
    		packageBlockParse = value;
    	}	
    	
    	boolean typeBlockParse = false;
    	
    	public boolean getTypeBlockParse()
    	{
    		return typeBlockParse;
    	}	
    	
    	public void setTypeBlockParse(boolean value)
    	{
    		typeBlockParse = value;
    	}
    	
    	private boolean parseBlock(ParserRuleReturnScope retval)
    	{
    		return AS3ParserHelper.parseBlock(input, retval, (LinkedListTreeAdaptor) adaptor);
    	}


    public static class compilationUnit_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:217:1: compilationUnit : ( asCompilationUnit ) -> ^( COMPILATION_UNIT ( asCompilationUnit )? ) ;
    public final AS3Parser.compilationUnit_return compilationUnit() throws RecognitionException {
        AS3Parser.compilationUnit_return retval = new AS3Parser.compilationUnit_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.asCompilationUnit_return asCompilationUnit1 = null;


        RewriteRuleSubtreeStream stream_asCompilationUnit=new RewriteRuleSubtreeStream(adaptor,"rule asCompilationUnit");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:218:2: ( ( asCompilationUnit ) -> ^( COMPILATION_UNIT ( asCompilationUnit )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:218:4: ( asCompilationUnit )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:218:4: ( asCompilationUnit )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:218:6: asCompilationUnit
            {
            pushFollow(FOLLOW_asCompilationUnit_in_compilationUnit368);
            asCompilationUnit1=asCompilationUnit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_asCompilationUnit.add(asCompilationUnit1.getTree());

            }



            // AST REWRITE
            // elements: asCompilationUnit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 219:3: -> ^( COMPILATION_UNIT ( asCompilationUnit )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:219:6: ^( COMPILATION_UNIT ( asCompilationUnit )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:219:26: ( asCompilationUnit )?
                if ( stream_asCompilationUnit.hasNext() ) {
                    adaptor.addChild(root_1, stream_asCompilationUnit.nextTree());

                }
                stream_asCompilationUnit.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class mxmlScriptUnit_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mxmlScriptUnit"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:224:1: mxmlScriptUnit : ( packageBlockEntry )* -> ^( MXML_SCRIPT_UNIT ( packageBlockEntry )* ) ;
    public final AS3Parser.mxmlScriptUnit_return mxmlScriptUnit() throws RecognitionException {
        AS3Parser.mxmlScriptUnit_return retval = new AS3Parser.mxmlScriptUnit_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.packageBlockEntry_return packageBlockEntry2 = null;


        RewriteRuleSubtreeStream stream_packageBlockEntry=new RewriteRuleSubtreeStream(adaptor,"rule packageBlockEntry");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:225:2: ( ( packageBlockEntry )* -> ^( MXML_SCRIPT_UNIT ( packageBlockEntry )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:225:4: ( packageBlockEntry )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:225:4: ( packageBlockEntry )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SEMI && LA1_0<=IDENT)||LA1_0==LBRACK||LA1_0==INCLUDE||(LA1_0>=USE && LA1_0<=IMPORT)||(LA1_0>=DYNAMIC && LA1_0<=CLASS)||(LA1_0>=INTERFACE && LA1_0<=CONST)||(LA1_0>=IS && LA1_0<=AS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:225:4: packageBlockEntry
            	    {
            	    pushFollow(FOLLOW_packageBlockEntry_in_mxmlScriptUnit399);
            	    packageBlockEntry2=packageBlockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_packageBlockEntry.add(packageBlockEntry2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: packageBlockEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 226:3: -> ^( MXML_SCRIPT_UNIT ( packageBlockEntry )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:226:6: ^( MXML_SCRIPT_UNIT ( packageBlockEntry )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(MXML_SCRIPT_UNIT, "MXML_SCRIPT_UNIT"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:226:26: ( packageBlockEntry )*
                while ( stream_packageBlockEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_packageBlockEntry.nextTree());

                }
                stream_packageBlockEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "mxmlScriptUnit"

    public static class program_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:231:1: program : ( statement )* -> ^( PROGRAM_UNIT ( statement )* ) ;
    public final AS3Parser.program_return program() throws RecognitionException {
        AS3Parser.program_return retval = new AS3Parser.program_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.statement_return statement3 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:232:2: ( ( statement )* -> ^( PROGRAM_UNIT ( statement )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:232:4: ( statement )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:232:4: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LBRACE||(LA2_0>=SEMI && LA2_0<=IDENT)||LA2_0==LBRACK||LA2_0==LPAREN||(LA2_0>=INCLUDE && LA2_0<=IMPORT)||(LA2_0>=DYNAMIC && LA2_0<=FINAL)||LA2_0==OVERRIDE||(LA2_0>=STATIC && LA2_0<=NATIVE)||(LA2_0>=FUNCTION && LA2_0<=IF)||(LA2_0>=FOR && LA2_0<=EACH)||(LA2_0>=THROW && LA2_0<=TRY)||LA2_0==SWITCH||(LA2_0>=DEFAULT && LA2_0<=VOID)||(LA2_0>=PLUS && LA2_0<=MINUS)||(LA2_0>=INC && LA2_0<=BNOT)||(LA2_0>=UNDEFINED && LA2_0<=FLOAT_LITERAL)||LA2_0==E4X_ATTRI) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:232:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program427);
            	    statement3=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 233:3: -> ^( PROGRAM_UNIT ( statement )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:233:6: ^( PROGRAM_UNIT ( statement )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PROGRAM_UNIT, "PROGRAM_UNIT"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:233:22: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class asCompilationUnit_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "asCompilationUnit"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:241:1: asCompilationUnit : packageDecl ( packageBlockEntry )* EOF ;
    public final AS3Parser.asCompilationUnit_return asCompilationUnit() throws RecognitionException {
        AS3Parser.asCompilationUnit_return retval = new AS3Parser.asCompilationUnit_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token EOF6=null;
        AS3Parser.packageDecl_return packageDecl4 = null;

        AS3Parser.packageBlockEntry_return packageBlockEntry5 = null;


        LinkedListTree EOF6_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:242:2: ( packageDecl ( packageBlockEntry )* EOF )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:242:4: packageDecl ( packageBlockEntry )* EOF
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_packageDecl_in_asCompilationUnit457);
            packageDecl4=packageDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, packageDecl4.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:243:3: ( packageBlockEntry )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=SEMI && LA3_0<=IDENT)||LA3_0==LBRACK||LA3_0==INCLUDE||(LA3_0>=USE && LA3_0<=IMPORT)||(LA3_0>=DYNAMIC && LA3_0<=CLASS)||(LA3_0>=INTERFACE && LA3_0<=CONST)||(LA3_0>=IS && LA3_0<=AS)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:243:3: packageBlockEntry
            	    {
            	    pushFollow(FOLLOW_packageBlockEntry_in_asCompilationUnit461);
            	    packageBlockEntry5=packageBlockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, packageBlockEntry5.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_asCompilationUnit466); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "asCompilationUnit"

    public static class packageDecl_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "packageDecl"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:248:1: packageDecl : PACKAGE ( type )? packageBlock ;
    public final AS3Parser.packageDecl_return packageDecl() throws RecognitionException {
        AS3Parser.packageDecl_return retval = new AS3Parser.packageDecl_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token PACKAGE7=null;
        AS3Parser.type_return type8 = null;

        AS3Parser.packageBlock_return packageBlock9 = null;


        LinkedListTree PACKAGE7_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:249:2: ( PACKAGE ( type )? packageBlock )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:249:4: PACKAGE ( type )? packageBlock
            {
            root_0 = (LinkedListTree)adaptor.nil();

            PACKAGE7=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDecl479); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PACKAGE7_tree = (LinkedListTree)adaptor.create(PACKAGE7);
            root_0 = (LinkedListTree)adaptor.becomeRoot(PACKAGE7_tree, root_0);
            }
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:249:13: ( type )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT||LA4_0==NAMESPACE||(LA4_0>=STAR && LA4_0<=OVERRIDE)||(LA4_0>=STATIC && LA4_0<=NATIVE)||(LA4_0>=GET && LA4_0<=SET)||LA4_0==EACH||LA4_0==DEFAULT||LA4_0==VOID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:249:13: type
                    {
                    pushFollow(FOLLOW_type_in_packageDecl482);
                    type8=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type8.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_packageBlock_in_packageDecl485);
            packageBlock9=packageBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, packageBlock9.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "packageDecl"

    public static class packageBlock_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "packageBlock"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:253:1: packageBlock : LBRACE ( packageBlockEntry )* RBRACE -> ^( BLOCK ( packageBlockEntry )* ) ;
    public final AS3Parser.packageBlock_return packageBlock() throws RecognitionException {
        AS3Parser.packageBlock_return retval = new AS3Parser.packageBlock_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE10=null;
        Token RBRACE12=null;
        AS3Parser.packageBlockEntry_return packageBlockEntry11 = null;


        LinkedListTree LBRACE10_tree=null;
        LinkedListTree RBRACE12_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_packageBlockEntry=new RewriteRuleSubtreeStream(adaptor,"rule packageBlockEntry");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:254:2: ( LBRACE ( packageBlockEntry )* RBRACE -> ^( BLOCK ( packageBlockEntry )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:254:4: LBRACE ( packageBlockEntry )* RBRACE
            {
            LBRACE10=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_packageBlock497); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE10);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:254:11: ( packageBlockEntry )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=SEMI && LA5_0<=IDENT)||LA5_0==LBRACK||LA5_0==INCLUDE||(LA5_0>=USE && LA5_0<=IMPORT)||(LA5_0>=DYNAMIC && LA5_0<=CLASS)||(LA5_0>=INTERFACE && LA5_0<=CONST)||(LA5_0>=IS && LA5_0<=AS)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:254:11: packageBlockEntry
            	    {
            	    pushFollow(FOLLOW_packageBlockEntry_in_packageBlock499);
            	    packageBlockEntry11=packageBlockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_packageBlockEntry.add(packageBlockEntry11.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            RBRACE12=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_packageBlock502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE12);



            // AST REWRITE
            // elements: packageBlockEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 255:3: -> ^( BLOCK ( packageBlockEntry )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:255:6: ^( BLOCK ( packageBlockEntry )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:255:15: ( packageBlockEntry )*
                while ( stream_packageBlockEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_packageBlockEntry.nextTree());

                }
                stream_packageBlockEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "packageBlock"

    public static class packageBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "packageBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:258:1: packageBlockEntry : (annos= annotations mods= modifiers ( classDefinition[$mods.tree] | interfaceDefinition[$mods.tree] | variableDefinition[$mods.tree] | functionDefinition[$mods.tree] ) | SEMI ) ;
    public final AS3Parser.packageBlockEntry_return packageBlockEntry() throws RecognitionException {
        AS3Parser.packageBlockEntry_return retval = new AS3Parser.packageBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token SEMI17=null;
        AS3Parser.annotations_return annos = null;

        AS3Parser.modifiers_return mods = null;

        AS3Parser.classDefinition_return classDefinition13 = null;

        AS3Parser.interfaceDefinition_return interfaceDefinition14 = null;

        AS3Parser.variableDefinition_return variableDefinition15 = null;

        AS3Parser.functionDefinition_return functionDefinition16 = null;


        LinkedListTree SEMI17_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:259:2: ( (annos= annotations mods= modifiers ( classDefinition[$mods.tree] | interfaceDefinition[$mods.tree] | variableDefinition[$mods.tree] | functionDefinition[$mods.tree] ) | SEMI ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:260:2: (annos= annotations mods= modifiers ( classDefinition[$mods.tree] | interfaceDefinition[$mods.tree] | variableDefinition[$mods.tree] | functionDefinition[$mods.tree] ) | SEMI )
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:260:2: (annos= annotations mods= modifiers ( classDefinition[$mods.tree] | interfaceDefinition[$mods.tree] | variableDefinition[$mods.tree] | functionDefinition[$mods.tree] ) | SEMI )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT||LA7_0==LBRACK||LA7_0==INCLUDE||(LA7_0>=USE && LA7_0<=IMPORT)||(LA7_0>=DYNAMIC && LA7_0<=CLASS)||(LA7_0>=INTERFACE && LA7_0<=CONST)||(LA7_0>=IS && LA7_0<=AS)) ) {
                alt7=1;
            }
            else if ( (LA7_0==SEMI) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:261:3: annos= annotations mods= modifiers ( classDefinition[$mods.tree] | interfaceDefinition[$mods.tree] | variableDefinition[$mods.tree] | functionDefinition[$mods.tree] )
                    {
                    pushFollow(FOLLOW_annotations_in_packageBlockEntry533);
                    annos=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, annos.getTree());
                    if ( state.backtracking==0 ) {
                       placeholder((annos!=null?((LinkedListTree)annos.tree):null)); 
                    }
                    pushFollow(FOLLOW_modifiers_in_packageBlockEntry541);
                    mods=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       placeholder((mods!=null?((LinkedListTree)mods.tree):null)); 
                    }
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:263:3: ( classDefinition[$mods.tree] | interfaceDefinition[$mods.tree] | variableDefinition[$mods.tree] | functionDefinition[$mods.tree] )
                    int alt6=4;
                    switch ( input.LA(1) ) {
                    case CLASS:
                        {
                        alt6=1;
                        }
                        break;
                    case INTERFACE:
                        {
                        alt6=2;
                        }
                        break;
                    case NAMESPACE:
                    case VAR:
                    case CONST:
                        {
                        alt6=3;
                        }
                        break;
                    case FUNCTION:
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:263:5: classDefinition[$mods.tree]
                            {
                            pushFollow(FOLLOW_classDefinition_in_packageBlockEntry550);
                            classDefinition13=classDefinition((mods!=null?((LinkedListTree)mods.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition13.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:264:5: interfaceDefinition[$mods.tree]
                            {
                            pushFollow(FOLLOW_interfaceDefinition_in_packageBlockEntry557);
                            interfaceDefinition14=interfaceDefinition((mods!=null?((LinkedListTree)mods.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDefinition14.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:265:5: variableDefinition[$mods.tree]
                            {
                            pushFollow(FOLLOW_variableDefinition_in_packageBlockEntry564);
                            variableDefinition15=variableDefinition((mods!=null?((LinkedListTree)mods.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDefinition15.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:266:5: functionDefinition[$mods.tree]
                            {
                            pushFollow(FOLLOW_functionDefinition_in_packageBlockEntry571);
                            functionDefinition16=functionDefinition((mods!=null?((LinkedListTree)mods.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDefinition16.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:269:5: SEMI
                    {
                    SEMI17=(Token)match(input,SEMI,FOLLOW_SEMI_in_packageBlockEntry583); if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "packageBlockEntry"

    public static class endOfFile_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endOfFile"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:273:1: endOfFile : EOF ;
    public final AS3Parser.endOfFile_return endOfFile() throws RecognitionException {
        AS3Parser.endOfFile_return retval = new AS3Parser.endOfFile_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token EOF18=null;

        LinkedListTree EOF18_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:274:2: ( EOF )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:274:4: EOF
            {
            root_0 = (LinkedListTree)adaptor.nil();

            EOF18=(Token)match(input,EOF,FOLLOW_EOF_in_endOfFile598); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "endOfFile"

    public static class annotations_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotations"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:282:1: annotations : ( annotation )* -> ^( ANNOTATIONS ( annotation )* ) ;
    public final AS3Parser.annotations_return annotations() throws RecognitionException {
        AS3Parser.annotations_return retval = new AS3Parser.annotations_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.annotation_return annotation19 = null;


        RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:283:2: ( ( annotation )* -> ^( ANNOTATIONS ( annotation )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:283:4: ( annotation )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:283:4: ( annotation )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==DBL_COLON) ) {
                        alt8=1;
                    }


                    }
                    break;
                case USE:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (LA8_3==NAMESPACE) ) {
                        alt8=1;
                    }


                    }
                    break;
                case LBRACK:
                case INCLUDE:
                case IMPORT:
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:283:4: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations615);
            	    annotation19=annotation();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_annotation.add(annotation19.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: annotation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 284:3: -> ^( ANNOTATIONS ( annotation )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:284:6: ^( ANNOTATIONS ( annotation )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ANNOTATIONS, "ANNOTATIONS"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:284:21: ( annotation )*
                while ( stream_annotation.hasNext() ) {
                    adaptor.addChild(root_1, stream_annotation.nextTree());

                }
                stream_annotation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "annotations"

    public static class annotation_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:294:1: annotation : ( configBlockDirective | metaDirective | includeDirective | importDirective | useNamespaceDirective );
    public final AS3Parser.annotation_return annotation() throws RecognitionException {
        AS3Parser.annotation_return retval = new AS3Parser.annotation_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.configBlockDirective_return configBlockDirective20 = null;

        AS3Parser.metaDirective_return metaDirective21 = null;

        AS3Parser.includeDirective_return includeDirective22 = null;

        AS3Parser.importDirective_return importDirective23 = null;

        AS3Parser.useNamespaceDirective_return useNamespaceDirective24 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:295:2: ( configBlockDirective | metaDirective | includeDirective | importDirective | useNamespaceDirective )
            int alt9=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt9=1;
                }
                break;
            case LBRACK:
                {
                alt9=2;
                }
                break;
            case INCLUDE:
                {
                alt9=3;
                }
                break;
            case IMPORT:
                {
                alt9=4;
                }
                break;
            case USE:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:295:5: configBlockDirective
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_configBlockDirective_in_annotation649);
                    configBlockDirective20=configBlockDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configBlockDirective20.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:296:6: metaDirective
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_metaDirective_in_annotation656);
                    metaDirective21=metaDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metaDirective21.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:297:5: includeDirective
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_includeDirective_in_annotation662);
                    includeDirective22=includeDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, includeDirective22.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:298:5: importDirective
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_importDirective_in_annotation669);
                    importDirective23=importDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, importDirective23.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:299:5: useNamespaceDirective
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_useNamespaceDirective_in_annotation676);
                    useNamespaceDirective24=useNamespaceDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useNamespaceDirective24.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class configIdent_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "configIdent"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:317:1: configIdent : IDENT DBL_COLON IDENT ;
    public final AS3Parser.configIdent_return configIdent() throws RecognitionException {
        AS3Parser.configIdent_return retval = new AS3Parser.configIdent_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IDENT25=null;
        Token DBL_COLON26=null;
        Token IDENT27=null;

        LinkedListTree IDENT25_tree=null;
        LinkedListTree DBL_COLON26_tree=null;
        LinkedListTree IDENT27_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:318:2: ( IDENT DBL_COLON IDENT )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:318:4: IDENT DBL_COLON IDENT
            {
            root_0 = (LinkedListTree)adaptor.nil();

            IDENT25=(Token)match(input,IDENT,FOLLOW_IDENT_in_configIdent696); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT25_tree = (LinkedListTree)adaptor.create(IDENT25);
            adaptor.addChild(root_0, IDENT25_tree);
            }
            DBL_COLON26=(Token)match(input,DBL_COLON,FOLLOW_DBL_COLON_in_configIdent698); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DBL_COLON26_tree = (LinkedListTree)adaptor.create(DBL_COLON26);
            root_0 = (LinkedListTree)adaptor.becomeRoot(DBL_COLON26_tree, root_0);
            }
            IDENT27=(Token)match(input,IDENT,FOLLOW_IDENT_in_configIdent701); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT27_tree = (LinkedListTree)adaptor.create(IDENT27);
            adaptor.addChild(root_0, IDENT27_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "configIdent"

    public static class configBlockDirective_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "configBlockDirective"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:322:1: configBlockDirective : configIdent block -> ^( COMPILE_CONFIG configIdent block ) ;
    public final AS3Parser.configBlockDirective_return configBlockDirective() throws RecognitionException {
        AS3Parser.configBlockDirective_return retval = new AS3Parser.configBlockDirective_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.configIdent_return configIdent28 = null;

        AS3Parser.block_return block29 = null;


        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_configIdent=new RewriteRuleSubtreeStream(adaptor,"rule configIdent");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:323:2: ( configIdent block -> ^( COMPILE_CONFIG configIdent block ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:324:3: configIdent block
            {
            pushFollow(FOLLOW_configIdent_in_configBlockDirective715);
            configIdent28=configIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_configIdent.add(configIdent28.getTree());
            pushFollow(FOLLOW_block_in_configBlockDirective717);
            block29=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block29.getTree());


            // AST REWRITE
            // elements: configIdent, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 325:3: -> ^( COMPILE_CONFIG configIdent block )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:325:6: ^( COMPILE_CONFIG configIdent block )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(COMPILE_CONFIG, "COMPILE_CONFIG"), root_1);

                adaptor.addChild(root_1, stream_configIdent.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "configBlockDirective"

    public static class metaDirective_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metaDirective"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:328:1: metaDirective : LBRACK ident ( metaDirectiveList )? RBRACK ( SEMI )? -> ^( METATAG ident ( metaDirectiveList )? ) ;
    public final AS3Parser.metaDirective_return metaDirective() throws RecognitionException {
        AS3Parser.metaDirective_return retval = new AS3Parser.metaDirective_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACK30=null;
        Token RBRACK33=null;
        Token SEMI34=null;
        AS3Parser.ident_return ident31 = null;

        AS3Parser.metaDirectiveList_return metaDirectiveList32 = null;


        LinkedListTree LBRACK30_tree=null;
        LinkedListTree RBRACK33_tree=null;
        LinkedListTree SEMI34_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_metaDirectiveList=new RewriteRuleSubtreeStream(adaptor,"rule metaDirectiveList");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:329:2: ( LBRACK ident ( metaDirectiveList )? RBRACK ( SEMI )? -> ^( METATAG ident ( metaDirectiveList )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:329:4: LBRACK ident ( metaDirectiveList )? RBRACK ( SEMI )?
            {
            LBRACK30=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_metaDirective742); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK30);

            pushFollow(FOLLOW_ident_in_metaDirective744);
            ident31=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident31.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:329:17: ( metaDirectiveList )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LPAREN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:329:17: metaDirectiveList
                    {
                    pushFollow(FOLLOW_metaDirectiveList_in_metaDirective746);
                    metaDirectiveList32=metaDirectiveList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaDirectiveList.add(metaDirectiveList32.getTree());

                    }
                    break;

            }

            RBRACK33=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_metaDirective749); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK33);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:329:43: ( SEMI )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==SEMI) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:329:43: SEMI
                    {
                    SEMI34=(Token)match(input,SEMI,FOLLOW_SEMI_in_metaDirective751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI34);


                    }
                    break;

            }



            // AST REWRITE
            // elements: metaDirectiveList, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 330:3: -> ^( METATAG ident ( metaDirectiveList )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:330:6: ^( METATAG ident ( metaDirectiveList )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(METATAG, "METATAG"), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:330:23: ( metaDirectiveList )?
                if ( stream_metaDirectiveList.hasNext() ) {
                    adaptor.addChild(root_1, stream_metaDirectiveList.nextTree());

                }
                stream_metaDirectiveList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "metaDirective"

    public static class metaDirectiveList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metaDirectiveList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:334:1: metaDirectiveList : LPAREN ( metaTagParam ( COMMA metaTagParam )* )? RPAREN -> ^( METATAG_PARAMS ( metaTagParam )* ) ;
    public final AS3Parser.metaDirectiveList_return metaDirectiveList() throws RecognitionException {
        AS3Parser.metaDirectiveList_return retval = new AS3Parser.metaDirectiveList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LPAREN35=null;
        Token COMMA37=null;
        Token RPAREN39=null;
        AS3Parser.metaTagParam_return metaTagParam36 = null;

        AS3Parser.metaTagParam_return metaTagParam38 = null;


        LinkedListTree LPAREN35_tree=null;
        LinkedListTree COMMA37_tree=null;
        LinkedListTree RPAREN39_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_metaTagParam=new RewriteRuleSubtreeStream(adaptor,"rule metaTagParam");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:335:2: ( LPAREN ( metaTagParam ( COMMA metaTagParam )* )? RPAREN -> ^( METATAG_PARAMS ( metaTagParam )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:336:3: LPAREN ( metaTagParam ( COMMA metaTagParam )* )? RPAREN
            {
            LPAREN35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_metaDirectiveList781); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN35);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:336:10: ( metaTagParam ( COMMA metaTagParam )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENT||(LA13_0>=STRING_LITERAL && LA13_0<=NAMESPACE)||(LA13_0>=STAR && LA13_0<=OVERRIDE)||(LA13_0>=STATIC && LA13_0<=NATIVE)||(LA13_0>=GET && LA13_0<=SET)||LA13_0==EACH||LA13_0==DEFAULT||LA13_0==VOID||(LA13_0>=IS && LA13_0<=AS)||(LA13_0>=NULL && LA13_0<=FLOAT_LITERAL)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:336:12: metaTagParam ( COMMA metaTagParam )*
                    {
                    pushFollow(FOLLOW_metaTagParam_in_metaDirectiveList785);
                    metaTagParam36=metaTagParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaTagParam.add(metaTagParam36.getTree());
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:336:25: ( COMMA metaTagParam )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:336:27: COMMA metaTagParam
                    	    {
                    	    COMMA37=(Token)match(input,COMMA,FOLLOW_COMMA_in_metaDirectiveList789); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA37);

                    	    pushFollow(FOLLOW_metaTagParam_in_metaDirectiveList791);
                    	    metaTagParam38=metaTagParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_metaTagParam.add(metaTagParam38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_metaDirectiveList799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN39);



            // AST REWRITE
            // elements: metaTagParam
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 337:3: -> ^( METATAG_PARAMS ( metaTagParam )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:337:6: ^( METATAG_PARAMS ( metaTagParam )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(METATAG_PARAMS, "METATAG_PARAMS"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:337:24: ( metaTagParam )*
                while ( stream_metaTagParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_metaTagParam.nextTree());

                }
                stream_metaTagParam.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "metaDirectiveList"

    public static class metaTagParam_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metaTagParam"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:342:1: metaTagParam : ( ident ASSIGN constant -> ^( ASSIGN ident constant ) | constant -> constant | ( ident DOT )=> type -> type | ident ASSIGN ( ident DOT )=> type -> ^( ASSIGN ident type ) | ident -> ident );
    public final AS3Parser.metaTagParam_return metaTagParam() throws RecognitionException {
        AS3Parser.metaTagParam_return retval = new AS3Parser.metaTagParam_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token ASSIGN41=null;
        Token ASSIGN46=null;
        AS3Parser.ident_return ident40 = null;

        AS3Parser.constant_return constant42 = null;

        AS3Parser.constant_return constant43 = null;

        AS3Parser.type_return type44 = null;

        AS3Parser.ident_return ident45 = null;

        AS3Parser.type_return type47 = null;

        AS3Parser.ident_return ident48 = null;


        LinkedListTree ASSIGN41_tree=null;
        LinkedListTree ASSIGN46_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:343:2: ( ident ASSIGN constant -> ^( ASSIGN ident constant ) | constant -> constant | ( ident DOT )=> type -> type | ident ASSIGN ( ident DOT )=> type -> ^( ASSIGN ident type ) | ident -> ident )
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:344:3: ident ASSIGN constant
                    {
                    pushFollow(FOLLOW_ident_in_metaTagParam827);
                    ident40=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident40.getTree());
                    ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaTagParam829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN41);

                    pushFollow(FOLLOW_constant_in_metaTagParam831);
                    constant42=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant.add(constant42.getTree());


                    // AST REWRITE
                    // elements: constant, ident, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 344:25: -> ^( ASSIGN ident constant )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:344:28: ^( ASSIGN ident constant )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        adaptor.addChild(root_1, stream_constant.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:345:4: constant
                    {
                    pushFollow(FOLLOW_constant_in_metaTagParam846);
                    constant43=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant.add(constant43.getTree());


                    // AST REWRITE
                    // elements: constant
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 345:13: -> constant
                    {
                        adaptor.addChild(root_0, stream_constant.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:346:5: ( ident DOT )=> type
                    {
                    pushFollow(FOLLOW_type_in_metaTagParam863);
                    type44=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type44.getTree());


                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 346:24: -> type
                    {
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:347:4: ident ASSIGN ( ident DOT )=> type
                    {
                    pushFollow(FOLLOW_ident_in_metaTagParam872);
                    ident45=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident45.getTree());
                    ASSIGN46=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaTagParam874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN46);

                    pushFollow(FOLLOW_type_in_metaTagParam883);
                    type47=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type47.getTree());


                    // AST REWRITE
                    // elements: ASSIGN, ident, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 347:36: -> ^( ASSIGN ident type )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:347:39: ^( ASSIGN ident type )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:348:4: ident
                    {
                    pushFollow(FOLLOW_ident_in_metaTagParam898);
                    ident48=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident48.getTree());


                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 348:10: -> ident
                    {
                        adaptor.addChild(root_0, stream_ident.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "metaTagParam"

    public static class includeDirective_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "includeDirective"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:352:1: includeDirective : INCLUDE STRING_LITERAL semi ;
    public final AS3Parser.includeDirective_return includeDirective() throws RecognitionException {
        AS3Parser.includeDirective_return retval = new AS3Parser.includeDirective_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token INCLUDE49=null;
        Token STRING_LITERAL50=null;
        AS3Parser.semi_return semi51 = null;


        LinkedListTree INCLUDE49_tree=null;
        LinkedListTree STRING_LITERAL50_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:353:2: ( INCLUDE STRING_LITERAL semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:353:4: INCLUDE STRING_LITERAL semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            INCLUDE49=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_includeDirective914); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INCLUDE49_tree = (LinkedListTree)adaptor.create(INCLUDE49);
            root_0 = (LinkedListTree)adaptor.becomeRoot(INCLUDE49_tree, root_0);
            }
            STRING_LITERAL50=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_includeDirective917); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL50_tree = (LinkedListTree)adaptor.create(STRING_LITERAL50);
            adaptor.addChild(root_0, STRING_LITERAL50_tree);
            }
            pushFollow(FOLLOW_semi_in_includeDirective919);
            semi51=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi51.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "includeDirective"

    public static class useNamespaceDirective_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "useNamespaceDirective"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:357:1: useNamespaceDirective : USE NAMESPACE ident semi ;
    public final AS3Parser.useNamespaceDirective_return useNamespaceDirective() throws RecognitionException {
        AS3Parser.useNamespaceDirective_return retval = new AS3Parser.useNamespaceDirective_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token USE52=null;
        Token NAMESPACE53=null;
        AS3Parser.ident_return ident54 = null;

        AS3Parser.semi_return semi55 = null;


        LinkedListTree USE52_tree=null;
        LinkedListTree NAMESPACE53_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:358:2: ( USE NAMESPACE ident semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:358:4: USE NAMESPACE ident semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            USE52=(Token)match(input,USE,FOLLOW_USE_in_useNamespaceDirective931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            USE52_tree = (LinkedListTree)adaptor.create(USE52);
            root_0 = (LinkedListTree)adaptor.becomeRoot(USE52_tree, root_0);
            }
            NAMESPACE53=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_useNamespaceDirective934); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAMESPACE53_tree = (LinkedListTree)adaptor.create(NAMESPACE53);
            adaptor.addChild(root_0, NAMESPACE53_tree);
            }
            pushFollow(FOLLOW_ident_in_useNamespaceDirective936);
            ident54=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ident54.getTree());
            pushFollow(FOLLOW_semi_in_useNamespaceDirective938);
            semi55=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi55.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "useNamespaceDirective"

    public static class importDirective_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importDirective"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:362:1: importDirective : IMPORT type ( DOT STAR )? semi ;
    public final AS3Parser.importDirective_return importDirective() throws RecognitionException {
        AS3Parser.importDirective_return retval = new AS3Parser.importDirective_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IMPORT56=null;
        Token DOT58=null;
        Token STAR59=null;
        AS3Parser.type_return type57 = null;

        AS3Parser.semi_return semi60 = null;


        LinkedListTree IMPORT56_tree=null;
        LinkedListTree DOT58_tree=null;
        LinkedListTree STAR59_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:363:2: ( IMPORT type ( DOT STAR )? semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:363:4: IMPORT type ( DOT STAR )? semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            IMPORT56=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importDirective950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT56_tree = (LinkedListTree)adaptor.create(IMPORT56);
            root_0 = (LinkedListTree)adaptor.becomeRoot(IMPORT56_tree, root_0);
            }
            pushFollow(FOLLOW_type_in_importDirective953);
            type57=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type57.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:363:17: ( DOT STAR )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:363:19: DOT STAR
                    {
                    DOT58=(Token)match(input,DOT,FOLLOW_DOT_in_importDirective957); if (state.failed) return retval;
                    STAR59=(Token)match(input,STAR,FOLLOW_STAR_in_importDirective960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR59_tree = (LinkedListTree)adaptor.create(STAR59);
                    adaptor.addChild(root_0, STAR59_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_semi_in_importDirective965);
            semi60=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi60.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "importDirective"

    public static class modifiers_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifiers"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:371:1: modifiers : ( modifier )* -> ^( MODIFIERS ( modifier )* ) ;
    public final AS3Parser.modifiers_return modifiers() throws RecognitionException {
        AS3Parser.modifiers_return retval = new AS3Parser.modifiers_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.modifier_return modifier61 = null;


        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:372:2: ( ( modifier )* -> ^( MODIFIERS ( modifier )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:372:4: ( modifier )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:372:4: ( modifier )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==IDENT||(LA16_2>=USE && LA16_2<=NAMESPACE)||(LA16_2>=DYNAMIC && LA16_2<=CLASS)||(LA16_2>=INTERFACE && LA16_2<=CONST)||(LA16_2>=IS && LA16_2<=AS)) ) {
                        alt16=1;
                    }


                    }
                    break;
                case DYNAMIC:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==IDENT||(LA16_3>=USE && LA16_3<=NAMESPACE)||(LA16_3>=DYNAMIC && LA16_3<=CLASS)||(LA16_3>=INTERFACE && LA16_3<=CONST)||(LA16_3>=IS && LA16_3<=AS)) ) {
                        alt16=1;
                    }


                    }
                    break;
                case FINAL:
                case INTERNAL:
                case OVERRIDE:
                case PRIVATE:
                case PROTECTED:
                case PUBLIC:
                case STATIC:
                case NATIVE:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:372:4: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_modifiers981);
            	    modifier61=modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_modifier.add(modifier61.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 373:3: -> ^( MODIFIERS ( modifier )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:373:6: ^( MODIFIERS ( modifier )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(MODIFIERS, "MODIFIERS"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:373:19: ( modifier )*
                while ( stream_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_modifier.nextTree());

                }
                stream_modifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "modifiers"

    public static class modifier_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:376:1: modifier : ( DYNAMIC | FINAL | INTERNAL | OVERRIDE | PRIVATE | PROTECTED | PUBLIC | STATIC | NATIVE | IDENT );
    public final AS3Parser.modifier_return modifier() throws RecognitionException {
        AS3Parser.modifier_return retval = new AS3Parser.modifier_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set62=null;

        LinkedListTree set62_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:377:2: ( DYNAMIC | FINAL | INTERNAL | OVERRIDE | PRIVATE | PROTECTED | PUBLIC | STATIC | NATIVE | IDENT )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set62=(Token)input.LT(1);
            if ( input.LA(1)==IDENT||(input.LA(1)>=DYNAMIC && input.LA(1)<=NATIVE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set62));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class semi_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semi"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:393:1: semi : ( SEMI | EOF | RBRACE );
    public final AS3Parser.semi_return semi() throws RecognitionException {
        AS3Parser.semi_return retval = new AS3Parser.semi_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token SEMI63=null;
        Token EOF64=null;
        Token RBRACE65=null;

        LinkedListTree SEMI63_tree=null;
        LinkedListTree EOF64_tree=null;
        LinkedListTree RBRACE65_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate
        	boolean onBrace=false;
        	
        	if (retval.start.getText() != null && retval.start.getText().equals("}"))
        	{
        		onBrace=true;
        		//we don't want to consume the '}' during the prediction phase
        		if (state.backtracking > 0)
        		{
        			retval.stop = retval.start;
        			return retval;
        		}
        	}
        	
        	if (findVirtualHiddenToken(retval))
        	{
        		retval.stop = retval.start;
        		return retval;
        	}

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:418:2: ( SEMI | EOF | RBRACE )
            int alt17=3;
            switch ( input.LA(1) ) {
            case SEMI:
                {
                alt17=1;
                }
                break;
            case EOF:
                {
                alt17=2;
                }
                break;
            case RBRACE:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:418:4: SEMI
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    SEMI63=(Token)match(input,SEMI,FOLLOW_SEMI_in_semi1073); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:419:4: EOF
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    EOF64=(Token)match(input,EOF,FOLLOW_EOF_in_semi1079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EOF64_tree = (LinkedListTree)adaptor.create(EOF64);
                    adaptor.addChild(root_0, EOF64_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:420:4: RBRACE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    RBRACE65=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_semi1085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACE65_tree = (LinkedListTree)adaptor.create(RBRACE65);
                    adaptor.addChild(root_0, RBRACE65_tree);
                    }
                    if ( state.backtracking==0 ) {

                      			input.rewind(marker); 
                      			
                      			if (onBrace)
                      			{
                      				retval.start=input.LT(-1);
                      				retval.stop=retval.start;
                      				retval.tree=null;
                      				return retval;
                      			}
                      		
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "semi"

    public static class classDefinition_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:439:1: classDefinition[LinkedListTree mods] : CLASS ident classExtendsClause classImplementsClause classTypeBlock -> ^( CLASS_DEF ident ( classExtendsClause )? ( classImplementsClause )? classTypeBlock ) ;
    public final AS3Parser.classDefinition_return classDefinition(LinkedListTree mods) throws RecognitionException {
        AS3Parser.classDefinition_return retval = new AS3Parser.classDefinition_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token CLASS66=null;
        AS3Parser.ident_return ident67 = null;

        AS3Parser.classExtendsClause_return classExtendsClause68 = null;

        AS3Parser.classImplementsClause_return classImplementsClause69 = null;

        AS3Parser.classTypeBlock_return classTypeBlock70 = null;


        LinkedListTree CLASS66_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_classExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule classExtendsClause");
        RewriteRuleSubtreeStream stream_classTypeBlock=new RewriteRuleSubtreeStream(adaptor,"rule classTypeBlock");
        RewriteRuleSubtreeStream stream_classImplementsClause=new RewriteRuleSubtreeStream(adaptor,"rule classImplementsClause");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:440:2: ( CLASS ident classExtendsClause classImplementsClause classTypeBlock -> ^( CLASS_DEF ident ( classExtendsClause )? ( classImplementsClause )? classTypeBlock ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:440:4: CLASS ident classExtendsClause classImplementsClause classTypeBlock
            {
            if ( state.backtracking==0 ) {
               retval.start = mods.getStartToken(); 
            }
            CLASS66=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDefinition1111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS66);

            pushFollow(FOLLOW_ident_in_classDefinition1113);
            ident67=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident67.getTree());
            pushFollow(FOLLOW_classExtendsClause_in_classDefinition1117);
            classExtendsClause68=classExtendsClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classExtendsClause.add(classExtendsClause68.getTree());
            pushFollow(FOLLOW_classImplementsClause_in_classDefinition1121);
            classImplementsClause69=classImplementsClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classImplementsClause.add(classImplementsClause69.getTree());
            pushFollow(FOLLOW_classTypeBlock_in_classDefinition1125);
            classTypeBlock70=classTypeBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classTypeBlock.add(classTypeBlock70.getTree());


            // AST REWRITE
            // elements: ident, classImplementsClause, classExtendsClause, classTypeBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 445:3: -> ^( CLASS_DEF ident ( classExtendsClause )? ( classImplementsClause )? classTypeBlock )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:445:6: ^( CLASS_DEF ident ( classExtendsClause )? ( classImplementsClause )? classTypeBlock )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(CLASS_DEF, "CLASS_DEF"), root_1);

                adaptor.addChild(root_1, mods);
                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:445:33: ( classExtendsClause )?
                if ( stream_classExtendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_classExtendsClause.nextTree());

                }
                stream_classExtendsClause.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:445:53: ( classImplementsClause )?
                if ( stream_classImplementsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_classImplementsClause.nextTree());

                }
                stream_classImplementsClause.reset();
                adaptor.addChild(root_1, stream_classTypeBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "classDefinition"

    public static class classExtendsClause_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classExtendsClause"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:448:1: classExtendsClause : ( EXTENDS type )? ;
    public final AS3Parser.classExtendsClause_return classExtendsClause() throws RecognitionException {
        AS3Parser.classExtendsClause_return retval = new AS3Parser.classExtendsClause_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token EXTENDS71=null;
        AS3Parser.type_return type72 = null;


        LinkedListTree EXTENDS71_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:449:2: ( ( EXTENDS type )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:449:4: ( EXTENDS type )?
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:449:4: ( EXTENDS type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EXTENDS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:449:6: EXTENDS type
                    {
                    EXTENDS71=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_classExtendsClause1160); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS71_tree = (LinkedListTree)adaptor.create(EXTENDS71);
                    root_0 = (LinkedListTree)adaptor.becomeRoot(EXTENDS71_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_classExtendsClause1163);
                    type72=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type72.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "classExtendsClause"

    public static class classImplementsClause_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classImplementsClause"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:452:1: classImplementsClause : ( IMPLEMENTS type ( COMMA type )* )? ;
    public final AS3Parser.classImplementsClause_return classImplementsClause() throws RecognitionException {
        AS3Parser.classImplementsClause_return retval = new AS3Parser.classImplementsClause_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IMPLEMENTS73=null;
        Token COMMA75=null;
        AS3Parser.type_return type74 = null;

        AS3Parser.type_return type76 = null;


        LinkedListTree IMPLEMENTS73_tree=null;
        LinkedListTree COMMA75_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:453:2: ( ( IMPLEMENTS type ( COMMA type )* )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:453:4: ( IMPLEMENTS type ( COMMA type )* )?
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:453:4: ( IMPLEMENTS type ( COMMA type )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IMPLEMENTS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:453:6: IMPLEMENTS type ( COMMA type )*
                    {
                    IMPLEMENTS73=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_classImplementsClause1179); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS73_tree = (LinkedListTree)adaptor.create(IMPLEMENTS73);
                    root_0 = (LinkedListTree)adaptor.becomeRoot(IMPLEMENTS73_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_classImplementsClause1182);
                    type74=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type74.getTree());
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:453:23: ( COMMA type )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:453:25: COMMA type
                    	    {
                    	    COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_classImplementsClause1186); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_classImplementsClause1189);
                    	    type76=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type76.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "classImplementsClause"

    public static class interfaceDefinition_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDefinition"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:461:1: interfaceDefinition[LinkedListTree mods] : INTERFACE ident interfaceExtendsClause interfaceTypeBlock -> ^( INTERFACE_DEF ident ( interfaceExtendsClause )? interfaceTypeBlock ) ;
    public final AS3Parser.interfaceDefinition_return interfaceDefinition(LinkedListTree mods) throws RecognitionException {
        AS3Parser.interfaceDefinition_return retval = new AS3Parser.interfaceDefinition_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token INTERFACE77=null;
        AS3Parser.ident_return ident78 = null;

        AS3Parser.interfaceExtendsClause_return interfaceExtendsClause79 = null;

        AS3Parser.interfaceTypeBlock_return interfaceTypeBlock80 = null;


        LinkedListTree INTERFACE77_tree=null;
        RewriteRuleTokenStream stream_INTERFACE=new RewriteRuleTokenStream(adaptor,"token INTERFACE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_interfaceExtendsClause=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtendsClause");
        RewriteRuleSubtreeStream stream_interfaceTypeBlock=new RewriteRuleSubtreeStream(adaptor,"rule interfaceTypeBlock");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:462:2: ( INTERFACE ident interfaceExtendsClause interfaceTypeBlock -> ^( INTERFACE_DEF ident ( interfaceExtendsClause )? interfaceTypeBlock ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:462:4: INTERFACE ident interfaceExtendsClause interfaceTypeBlock
            {
            if ( state.backtracking==0 ) {
               retval.start = mods.getStartToken(); 
            }
            INTERFACE77=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDefinition1216); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTERFACE.add(INTERFACE77);

            pushFollow(FOLLOW_ident_in_interfaceDefinition1218);
            ident78=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident78.getTree());
            pushFollow(FOLLOW_interfaceExtendsClause_in_interfaceDefinition1222);
            interfaceExtendsClause79=interfaceExtendsClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_interfaceExtendsClause.add(interfaceExtendsClause79.getTree());
            pushFollow(FOLLOW_interfaceTypeBlock_in_interfaceDefinition1226);
            interfaceTypeBlock80=interfaceTypeBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_interfaceTypeBlock.add(interfaceTypeBlock80.getTree());


            // AST REWRITE
            // elements: interfaceExtendsClause, ident, interfaceTypeBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 466:3: -> ^( INTERFACE_DEF ident ( interfaceExtendsClause )? interfaceTypeBlock )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:466:6: ^( INTERFACE_DEF ident ( interfaceExtendsClause )? interfaceTypeBlock )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(INTERFACE_DEF, "INTERFACE_DEF"), root_1);

                adaptor.addChild(root_1, mods);
                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:466:37: ( interfaceExtendsClause )?
                if ( stream_interfaceExtendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceExtendsClause.nextTree());

                }
                stream_interfaceExtendsClause.reset();
                adaptor.addChild(root_1, stream_interfaceTypeBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceDefinition"

    public static class interfaceExtendsClause_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceExtendsClause"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:469:1: interfaceExtendsClause : ( EXTENDS type ( COMMA type )* )? ;
    public final AS3Parser.interfaceExtendsClause_return interfaceExtendsClause() throws RecognitionException {
        AS3Parser.interfaceExtendsClause_return retval = new AS3Parser.interfaceExtendsClause_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token EXTENDS81=null;
        Token COMMA83=null;
        AS3Parser.type_return type82 = null;

        AS3Parser.type_return type84 = null;


        LinkedListTree EXTENDS81_tree=null;
        LinkedListTree COMMA83_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:470:2: ( ( EXTENDS type ( COMMA type )* )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:470:4: ( EXTENDS type ( COMMA type )* )?
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:470:4: ( EXTENDS type ( COMMA type )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EXTENDS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:470:6: EXTENDS type ( COMMA type )*
                    {
                    EXTENDS81=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_interfaceExtendsClause1258); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS81_tree = (LinkedListTree)adaptor.create(EXTENDS81);
                    root_0 = (LinkedListTree)adaptor.becomeRoot(EXTENDS81_tree, root_0);
                    }
                    pushFollow(FOLLOW_type_in_interfaceExtendsClause1261);
                    type82=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type82.getTree());
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:470:20: ( COMMA type )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:470:22: COMMA type
                    	    {
                    	    COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceExtendsClause1265); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_interfaceExtendsClause1268);
                    	    type84=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type84.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceExtendsClause"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:477:1: functionDefinition[LinkedListTree mods] : FUNCTION ident parameterDeclarationList ( typeExpression )? block -> ^( FUNCTION_DEF ident parameterDeclarationList ( typeExpression )? ( block )? ) ;
    public final AS3Parser.functionDefinition_return functionDefinition(LinkedListTree mods) throws RecognitionException {
        AS3Parser.functionDefinition_return retval = new AS3Parser.functionDefinition_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token FUNCTION85=null;
        AS3Parser.ident_return ident86 = null;

        AS3Parser.parameterDeclarationList_return parameterDeclarationList87 = null;

        AS3Parser.typeExpression_return typeExpression88 = null;

        AS3Parser.block_return block89 = null;


        LinkedListTree FUNCTION85_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parameterDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule parameterDeclarationList");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:478:2: ( FUNCTION ident parameterDeclarationList ( typeExpression )? block -> ^( FUNCTION_DEF ident parameterDeclarationList ( typeExpression )? ( block )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:478:4: FUNCTION ident parameterDeclarationList ( typeExpression )? block
            {
            if ( state.backtracking==0 ) {
               retval.start = mods.getStartToken(); 
            }
            FUNCTION85=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDefinition1293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION85);

            pushFollow(FOLLOW_ident_in_functionDefinition1297);
            ident86=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident86.getTree());
            pushFollow(FOLLOW_parameterDeclarationList_in_functionDefinition1301);
            parameterDeclarationList87=parameterDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameterDeclarationList.add(parameterDeclarationList87.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:482:3: ( typeExpression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==COLON) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:482:3: typeExpression
                    {
                    pushFollow(FOLLOW_typeExpression_in_functionDefinition1305);
                    typeExpression88=typeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression88.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_functionDefinition1310);
            block89=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block89.getTree());


            // AST REWRITE
            // elements: parameterDeclarationList, ident, block, typeExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 484:3: -> ^( FUNCTION_DEF ident parameterDeclarationList ( typeExpression )? ( block )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:484:6: ^( FUNCTION_DEF ident parameterDeclarationList ( typeExpression )? ( block )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF"), root_1);

                adaptor.addChild(root_1, mods);
                adaptor.addChild(root_1, stream_ident.nextTree());
                adaptor.addChild(root_1, stream_parameterDeclarationList.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:487:5: ( typeExpression )?
                if ( stream_typeExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeExpression.nextTree());

                }
                stream_typeExpression.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:488:5: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class variableDefinition_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDefinition"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:497:1: variableDefinition[LinkedListTree mods] : vm= variableModifier variableDeclarator ( COMMA variableDeclarator )* semi -> ^( VARIABLE_DEF $vm ( variableDeclarator )+ ) ;
    public final AS3Parser.variableDefinition_return variableDefinition(LinkedListTree mods) throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.variableDefinition_return retval = new AS3Parser.variableDefinition_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COMMA91=null;
        AS3Parser.variableModifier_return vm = null;

        AS3Parser.variableDeclarator_return variableDeclarator90 = null;

        AS3Parser.variableDeclarator_return variableDeclarator92 = null;

        AS3Parser.semi_return semi93 = null;


        LinkedListTree COMMA91_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");
        RewriteRuleSubtreeStream stream_variableModifier=new RewriteRuleSubtreeStream(adaptor,"rule variableModifier");

        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:502:2: (vm= variableModifier variableDeclarator ( COMMA variableDeclarator )* semi -> ^( VARIABLE_DEF $vm ( variableDeclarator )+ ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:502:4: vm= variableModifier variableDeclarator ( COMMA variableDeclarator )* semi
            {
            pushFollow(FOLLOW_variableModifier_in_variableDefinition1406);
            vm=variableModifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableModifier.add(vm.getTree());
            pushFollow(FOLLOW_variableDeclarator_in_variableDefinition1408);
            variableDeclarator90=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator90.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:502:43: ( COMMA variableDeclarator )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:502:45: COMMA variableDeclarator
            	    {
            	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableDefinition1412); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA91);

            	    pushFollow(FOLLOW_variableDeclarator_in_variableDefinition1414);
            	    variableDeclarator92=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator92.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            pushFollow(FOLLOW_semi_in_variableDefinition1419);
            semi93=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semi.add(semi93.getTree());


            // AST REWRITE
            // elements: vm, variableDeclarator
            // token labels: 
            // rule labels: vm, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_vm=new RewriteRuleSubtreeStream(adaptor,"rule vm",vm!=null?vm.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 503:3: -> ^( VARIABLE_DEF $vm ( variableDeclarator )+ )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:503:6: ^( VARIABLE_DEF $vm ( variableDeclarator )+ )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(VARIABLE_DEF, "VARIABLE_DEF"), root_1);

                adaptor.addChild(root_1, mods);
                adaptor.addChild(root_1, stream_vm.nextTree());
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclarator.nextTree());

                }
                stream_variableDeclarator.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "variableDefinition"

    public static class classTypeBlock_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classTypeBlock"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:510:1: classTypeBlock : LBRACE ( classTypeBlockEntry )* RBRACE -> ^( TYPE_BLOCK ( classTypeBlockEntry )* ) ;
    public final AS3Parser.classTypeBlock_return classTypeBlock() throws RecognitionException {
        AS3Parser.classTypeBlock_return retval = new AS3Parser.classTypeBlock_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE94=null;
        Token RBRACE96=null;
        AS3Parser.classTypeBlockEntry_return classTypeBlockEntry95 = null;


        LinkedListTree LBRACE94_tree=null;
        LinkedListTree RBRACE96_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classTypeBlockEntry=new RewriteRuleSubtreeStream(adaptor,"rule classTypeBlockEntry");

        	if (packageBlockParse)
        	{
        		retval.tree = (LinkedListTree) adaptor.create(TYPE_BLOCK, "TYPE_BLOCK");
        		parseBlock(retval);
        		return retval;
        	}

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:519:2: ( LBRACE ( classTypeBlockEntry )* RBRACE -> ^( TYPE_BLOCK ( classTypeBlockEntry )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:519:4: LBRACE ( classTypeBlockEntry )* RBRACE
            {
            LBRACE94=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classTypeBlock1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE94);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:520:3: ( classTypeBlockEntry )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LBRACE||LA25_0==IDENT||LA25_0==LBRACK||LA25_0==INCLUDE||(LA25_0>=USE && LA25_0<=IMPORT)||(LA25_0>=DYNAMIC && LA25_0<=NATIVE)||(LA25_0>=FUNCTION && LA25_0<=CONST)||(LA25_0>=IS && LA25_0<=AS)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:520:3: classTypeBlockEntry
            	    {
            	    pushFollow(FOLLOW_classTypeBlockEntry_in_classTypeBlock1461);
            	    classTypeBlockEntry95=classTypeBlockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classTypeBlockEntry.add(classTypeBlockEntry95.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            RBRACE96=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classTypeBlock1466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE96);



            // AST REWRITE
            // elements: classTypeBlockEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 522:3: -> ^( TYPE_BLOCK ( classTypeBlockEntry )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:522:6: ^( TYPE_BLOCK ( classTypeBlockEntry )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(TYPE_BLOCK, "TYPE_BLOCK"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:522:20: ( classTypeBlockEntry )*
                while ( stream_classTypeBlockEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_classTypeBlockEntry.nextTree());

                }
                stream_classTypeBlockEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "classTypeBlock"

    public static class classTypeBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classTypeBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:525:1: classTypeBlockEntry : ( ( configIdent LBRACE )=> configBlockEntry | ( LBRACE )=> staticBlockEntry | (a= annotations m= modifiers ( fieldDefinitionBlockEntry[$a.tree,$m.tree] | classMethodDefinitionBlockEntry[$a.tree,$m.tree] | staticLinkEntry ) ) );
    public final AS3Parser.classTypeBlockEntry_return classTypeBlockEntry() throws RecognitionException {
        AS3Parser.classTypeBlockEntry_return retval = new AS3Parser.classTypeBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.annotations_return a = null;

        AS3Parser.modifiers_return m = null;

        AS3Parser.configBlockEntry_return configBlockEntry97 = null;

        AS3Parser.staticBlockEntry_return staticBlockEntry98 = null;

        AS3Parser.fieldDefinitionBlockEntry_return fieldDefinitionBlockEntry99 = null;

        AS3Parser.classMethodDefinitionBlockEntry_return classMethodDefinitionBlockEntry100 = null;

        AS3Parser.staticLinkEntry_return staticLinkEntry101 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:526:2: ( ( configIdent LBRACE )=> configBlockEntry | ( LBRACE )=> staticBlockEntry | (a= annotations m= modifiers ( fieldDefinitionBlockEntry[$a.tree,$m.tree] | classMethodDefinitionBlockEntry[$a.tree,$m.tree] | staticLinkEntry ) ) )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:527:3: ( configIdent LBRACE )=> configBlockEntry
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_configBlockEntry_in_classTypeBlockEntry1499);
                    configBlockEntry97=configBlockEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configBlockEntry97.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:529:3: ( LBRACE )=> staticBlockEntry
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_staticBlockEntry_in_classTypeBlockEntry1512);
                    staticBlockEntry98=staticBlockEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlockEntry98.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:531:3: (a= annotations m= modifiers ( fieldDefinitionBlockEntry[$a.tree,$m.tree] | classMethodDefinitionBlockEntry[$a.tree,$m.tree] | staticLinkEntry ) )
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:531:3: (a= annotations m= modifiers ( fieldDefinitionBlockEntry[$a.tree,$m.tree] | classMethodDefinitionBlockEntry[$a.tree,$m.tree] | staticLinkEntry ) )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:532:4: a= annotations m= modifiers ( fieldDefinitionBlockEntry[$a.tree,$m.tree] | classMethodDefinitionBlockEntry[$a.tree,$m.tree] | staticLinkEntry )
                    {
                    pushFollow(FOLLOW_annotations_in_classTypeBlockEntry1527);
                    a=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.start = placeholder((a!=null?((LinkedListTree)a.tree):null)); 
                    }
                    pushFollow(FOLLOW_modifiers_in_classTypeBlockEntry1537);
                    m=modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       placeholder((m!=null?((LinkedListTree)m.tree):null)); 
                    }
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:534:4: ( fieldDefinitionBlockEntry[$a.tree,$m.tree] | classMethodDefinitionBlockEntry[$a.tree,$m.tree] | staticLinkEntry )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case NAMESPACE:
                        {
                        int LA26_1 = input.LA(2);

                        if ( (LA26_1==IDENT||(LA26_1>=USE && LA26_1<=NAMESPACE)||LA26_1==DYNAMIC||(LA26_1>=GET && LA26_1<=SET)||(LA26_1>=IS && LA26_1<=AS)) ) {
                            alt26=1;
                        }
                        else if ( (LA26_1==EOF||(LA26_1>=RBRACE && LA26_1<=SEMI)) ) {
                            alt26=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FUNCTION:
                        {
                        alt26=2;
                        }
                        break;
                    case IDENT:
                    case USE:
                    case DYNAMIC:
                    case GET:
                    case SET:
                    case IS:
                    case AS:
                        {
                        alt26=3;
                        }
                        break;
                    case VAR:
                    case CONST:
                        {
                        alt26=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:535:6: fieldDefinitionBlockEntry[$a.tree,$m.tree]
                            {
                            pushFollow(FOLLOW_fieldDefinitionBlockEntry_in_classTypeBlockEntry1552);
                            fieldDefinitionBlockEntry99=fieldDefinitionBlockEntry((a!=null?((LinkedListTree)a.tree):null), (m!=null?((LinkedListTree)m.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDefinitionBlockEntry99.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:536:7: classMethodDefinitionBlockEntry[$a.tree,$m.tree]
                            {
                            pushFollow(FOLLOW_classMethodDefinitionBlockEntry_in_classTypeBlockEntry1562);
                            classMethodDefinitionBlockEntry100=classMethodDefinitionBlockEntry((a!=null?((LinkedListTree)a.tree):null), (m!=null?((LinkedListTree)m.tree):null));

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, classMethodDefinitionBlockEntry100.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:537:7: staticLinkEntry
                            {
                            pushFollow(FOLLOW_staticLinkEntry_in_classTypeBlockEntry1571);
                            staticLinkEntry101=staticLinkEntry();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, staticLinkEntry101.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "classTypeBlockEntry"

    public static class interfaceTypeBlock_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceTypeBlock"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:542:1: interfaceTypeBlock : LBRACE ( interfaceTypeBlockEntry )* RBRACE -> ^( TYPE_BLOCK ( interfaceTypeBlockEntry )* ) ;
    public final AS3Parser.interfaceTypeBlock_return interfaceTypeBlock() throws RecognitionException {
        AS3Parser.interfaceTypeBlock_return retval = new AS3Parser.interfaceTypeBlock_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE102=null;
        Token RBRACE104=null;
        AS3Parser.interfaceTypeBlockEntry_return interfaceTypeBlockEntry103 = null;


        LinkedListTree LBRACE102_tree=null;
        LinkedListTree RBRACE104_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_interfaceTypeBlockEntry=new RewriteRuleSubtreeStream(adaptor,"rule interfaceTypeBlockEntry");

        	if (packageBlockParse)
        	{
        		retval.tree = (LinkedListTree) adaptor.create(TYPE_BLOCK, "TYPE_BLOCK");
        		parseBlock(retval);
        		return retval;
        	}

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:551:2: ( LBRACE ( interfaceTypeBlockEntry )* RBRACE -> ^( TYPE_BLOCK ( interfaceTypeBlockEntry )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:551:4: LBRACE ( interfaceTypeBlockEntry )* RBRACE
            {
            LBRACE102=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceTypeBlock1596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE102);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:552:3: ( interfaceTypeBlockEntry )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LBRACE||LA28_0==IDENT||LA28_0==LBRACK||LA28_0==INCLUDE||LA28_0==USE||LA28_0==IMPORT||LA28_0==FUNCTION) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:552:3: interfaceTypeBlockEntry
            	    {
            	    pushFollow(FOLLOW_interfaceTypeBlockEntry_in_interfaceTypeBlock1600);
            	    interfaceTypeBlockEntry103=interfaceTypeBlockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_interfaceTypeBlockEntry.add(interfaceTypeBlockEntry103.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            RBRACE104=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceTypeBlock1605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE104);



            // AST REWRITE
            // elements: interfaceTypeBlockEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 554:3: -> ^( TYPE_BLOCK ( interfaceTypeBlockEntry )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:554:6: ^( TYPE_BLOCK ( interfaceTypeBlockEntry )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(TYPE_BLOCK, "TYPE_BLOCK"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:554:20: ( interfaceTypeBlockEntry )*
                while ( stream_interfaceTypeBlockEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceTypeBlockEntry.nextTree());

                }
                stream_interfaceTypeBlockEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceTypeBlock"

    public static class interfaceTypeBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceTypeBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:557:1: interfaceTypeBlockEntry : ( ( configIdent LBRACE )=> configBlockEntry | ( LBRACE )=> staticBlockEntry | (a= annotations ( interfaceMethodDefinitionBlockEntry[$a.tree] ) ) );
    public final AS3Parser.interfaceTypeBlockEntry_return interfaceTypeBlockEntry() throws RecognitionException {
        AS3Parser.interfaceTypeBlockEntry_return retval = new AS3Parser.interfaceTypeBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.annotations_return a = null;

        AS3Parser.configBlockEntry_return configBlockEntry105 = null;

        AS3Parser.staticBlockEntry_return staticBlockEntry106 = null;

        AS3Parser.interfaceMethodDefinitionBlockEntry_return interfaceMethodDefinitionBlockEntry107 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:558:2: ( ( configIdent LBRACE )=> configBlockEntry | ( LBRACE )=> staticBlockEntry | (a= annotations ( interfaceMethodDefinitionBlockEntry[$a.tree] ) ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENT) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred5_AS3()) ) {
                    alt29=1;
                }
                else if ( (true) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA29_0==LBRACE) && (synpred6_AS3())) {
                alt29=2;
            }
            else if ( (LA29_0==LBRACK||LA29_0==INCLUDE||LA29_0==USE||LA29_0==IMPORT||LA29_0==FUNCTION) ) {
                alt29=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:559:3: ( configIdent LBRACE )=> configBlockEntry
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_configBlockEntry_in_interfaceTypeBlockEntry1639);
                    configBlockEntry105=configBlockEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configBlockEntry105.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:561:3: ( LBRACE )=> staticBlockEntry
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_staticBlockEntry_in_interfaceTypeBlockEntry1652);
                    staticBlockEntry106=staticBlockEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlockEntry106.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:563:3: (a= annotations ( interfaceMethodDefinitionBlockEntry[$a.tree] ) )
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:563:3: (a= annotations ( interfaceMethodDefinitionBlockEntry[$a.tree] ) )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:564:4: a= annotations ( interfaceMethodDefinitionBlockEntry[$a.tree] )
                    {
                    pushFollow(FOLLOW_annotations_in_interfaceTypeBlockEntry1668);
                    a=annotations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.start = placeholder((a!=null?((LinkedListTree)a.tree):null)); 
                    }
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:565:4: ( interfaceMethodDefinitionBlockEntry[$a.tree] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:566:5: interfaceMethodDefinitionBlockEntry[$a.tree]
                    {
                    pushFollow(FOLLOW_interfaceMethodDefinitionBlockEntry_in_interfaceTypeBlockEntry1682);
                    interfaceMethodDefinitionBlockEntry107=interfaceMethodDefinitionBlockEntry((a!=null?((LinkedListTree)a.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceMethodDefinitionBlockEntry107.getTree());

                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceTypeBlockEntry"

    public static class configBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "configBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:576:1: configBlockEntry : configIdent LBRACE ( classTypeBlockEntry )* RBRACE -> ^( COMPILE_CONFIG configIdent ^( BLOCK ( classTypeBlockEntry )* ) ) ;
    public final AS3Parser.configBlockEntry_return configBlockEntry() throws RecognitionException {
        AS3Parser.configBlockEntry_return retval = new AS3Parser.configBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE109=null;
        Token RBRACE111=null;
        AS3Parser.configIdent_return configIdent108 = null;

        AS3Parser.classTypeBlockEntry_return classTypeBlockEntry110 = null;


        LinkedListTree LBRACE109_tree=null;
        LinkedListTree RBRACE111_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classTypeBlockEntry=new RewriteRuleSubtreeStream(adaptor,"rule classTypeBlockEntry");
        RewriteRuleSubtreeStream stream_configIdent=new RewriteRuleSubtreeStream(adaptor,"rule configIdent");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:577:2: ( configIdent LBRACE ( classTypeBlockEntry )* RBRACE -> ^( COMPILE_CONFIG configIdent ^( BLOCK ( classTypeBlockEntry )* ) ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:578:3: configIdent LBRACE ( classTypeBlockEntry )* RBRACE
            {
            pushFollow(FOLLOW_configIdent_in_configBlockEntry1713);
            configIdent108=configIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_configIdent.add(configIdent108.getTree());
            LBRACE109=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_configBlockEntry1715); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE109);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:578:22: ( classTypeBlockEntry )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==LBRACE||LA30_0==IDENT||LA30_0==LBRACK||LA30_0==INCLUDE||(LA30_0>=USE && LA30_0<=IMPORT)||(LA30_0>=DYNAMIC && LA30_0<=NATIVE)||(LA30_0>=FUNCTION && LA30_0<=CONST)||(LA30_0>=IS && LA30_0<=AS)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:578:22: classTypeBlockEntry
            	    {
            	    pushFollow(FOLLOW_classTypeBlockEntry_in_configBlockEntry1717);
            	    classTypeBlockEntry110=classTypeBlockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classTypeBlockEntry.add(classTypeBlockEntry110.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            RBRACE111=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_configBlockEntry1720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE111);



            // AST REWRITE
            // elements: configIdent, classTypeBlockEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 579:3: -> ^( COMPILE_CONFIG configIdent ^( BLOCK ( classTypeBlockEntry )* ) )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:579:6: ^( COMPILE_CONFIG configIdent ^( BLOCK ( classTypeBlockEntry )* ) )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(COMPILE_CONFIG, "COMPILE_CONFIG"), root_1);

                adaptor.addChild(root_1, stream_configIdent.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:579:36: ^( BLOCK ( classTypeBlockEntry )* )
                {
                LinkedListTree root_2 = (LinkedListTree)adaptor.nil();
                root_2 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(BLOCK, "BLOCK"), root_2);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:579:45: ( classTypeBlockEntry )*
                while ( stream_classTypeBlockEntry.hasNext() ) {
                    adaptor.addChild(root_2, stream_classTypeBlockEntry.nextTree());

                }
                stream_classTypeBlockEntry.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "configBlockEntry"

    public static class staticBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:586:1: staticBlockEntry : LBRACE ( blockEntry )* RBRACE -> ^( STATIC_BLOCK ( blockEntry )* ) ;
    public final AS3Parser.staticBlockEntry_return staticBlockEntry() throws RecognitionException {
        AS3Parser.staticBlockEntry_return retval = new AS3Parser.staticBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE112=null;
        Token RBRACE114=null;
        AS3Parser.blockEntry_return blockEntry113 = null;


        LinkedListTree LBRACE112_tree=null;
        LinkedListTree RBRACE114_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockEntry=new RewriteRuleSubtreeStream(adaptor,"rule blockEntry");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:587:2: ( LBRACE ( blockEntry )* RBRACE -> ^( STATIC_BLOCK ( blockEntry )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:587:4: LBRACE ( blockEntry )* RBRACE
            {
            LBRACE112=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_staticBlockEntry1756); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE112);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:587:11: ( blockEntry )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==LBRACE||(LA31_0>=SEMI && LA31_0<=IDENT)||LA31_0==LBRACK||LA31_0==LPAREN||(LA31_0>=INCLUDE && LA31_0<=IMPORT)||(LA31_0>=DYNAMIC && LA31_0<=FINAL)||LA31_0==OVERRIDE||(LA31_0>=STATIC && LA31_0<=NATIVE)||(LA31_0>=FUNCTION && LA31_0<=IF)||(LA31_0>=FOR && LA31_0<=EACH)||(LA31_0>=THROW && LA31_0<=TRY)||LA31_0==SWITCH||(LA31_0>=DEFAULT && LA31_0<=VOID)||(LA31_0>=PLUS && LA31_0<=MINUS)||(LA31_0>=INC && LA31_0<=BNOT)||(LA31_0>=UNDEFINED && LA31_0<=FLOAT_LITERAL)||LA31_0==E4X_ATTRI) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:587:11: blockEntry
            	    {
            	    pushFollow(FOLLOW_blockEntry_in_staticBlockEntry1758);
            	    blockEntry113=blockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockEntry.add(blockEntry113.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            RBRACE114=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_staticBlockEntry1761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE114);



            // AST REWRITE
            // elements: blockEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 588:3: -> ^( STATIC_BLOCK ( blockEntry )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:588:6: ^( STATIC_BLOCK ( blockEntry )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(STATIC_BLOCK, "STATIC_BLOCK"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:588:22: ( blockEntry )*
                while ( stream_blockEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockEntry.nextTree());

                }
                stream_blockEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "staticBlockEntry"

    public static class staticLinkEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticLinkEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:591:1: staticLinkEntry : ident semi -> ^( STATIC_LINK ident ) ;
    public final AS3Parser.staticLinkEntry_return staticLinkEntry() throws RecognitionException {
        AS3Parser.staticLinkEntry_return retval = new AS3Parser.staticLinkEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.ident_return ident115 = null;

        AS3Parser.semi_return semi116 = null;


        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:592:2: ( ident semi -> ^( STATIC_LINK ident ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:592:4: ident semi
            {
            pushFollow(FOLLOW_ident_in_staticLinkEntry1785);
            ident115=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident115.getTree());
            pushFollow(FOLLOW_semi_in_staticLinkEntry1787);
            semi116=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semi.add(semi116.getTree());


            // AST REWRITE
            // elements: ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 593:3: -> ^( STATIC_LINK ident )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:593:6: ^( STATIC_LINK ident )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(STATIC_LINK, "STATIC_LINK"), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "staticLinkEntry"

    public static class fieldDefinitionBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDefinitionBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:602:1: fieldDefinitionBlockEntry[LinkedListTree annos, Tree mods] : vm= variableModifier variableDeclarator ( COMMA variableDeclarator )* semi -> ^( FIELD_DEF $vm ( variableDeclarator )+ ) ;
    public final AS3Parser.fieldDefinitionBlockEntry_return fieldDefinitionBlockEntry(LinkedListTree annos, Tree mods) throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.fieldDefinitionBlockEntry_return retval = new AS3Parser.fieldDefinitionBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COMMA118=null;
        AS3Parser.variableModifier_return vm = null;

        AS3Parser.variableDeclarator_return variableDeclarator117 = null;

        AS3Parser.variableDeclarator_return variableDeclarator119 = null;

        AS3Parser.semi_return semi120 = null;


        LinkedListTree COMMA118_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclarator=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarator");
        RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");
        RewriteRuleSubtreeStream stream_variableModifier=new RewriteRuleSubtreeStream(adaptor,"rule variableModifier");

        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:607:2: (vm= variableModifier variableDeclarator ( COMMA variableDeclarator )* semi -> ^( FIELD_DEF $vm ( variableDeclarator )+ ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:607:4: vm= variableModifier variableDeclarator ( COMMA variableDeclarator )* semi
            {
            pushFollow(FOLLOW_variableModifier_in_fieldDefinitionBlockEntry1829);
            vm=variableModifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableModifier.add(vm.getTree());
            pushFollow(FOLLOW_variableDeclarator_in_fieldDefinitionBlockEntry1831);
            variableDeclarator117=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator117.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:607:43: ( COMMA variableDeclarator )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:607:45: COMMA variableDeclarator
            	    {
            	    COMMA118=(Token)match(input,COMMA,FOLLOW_COMMA_in_fieldDefinitionBlockEntry1835); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA118);

            	    pushFollow(FOLLOW_variableDeclarator_in_fieldDefinitionBlockEntry1837);
            	    variableDeclarator119=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclarator.add(variableDeclarator119.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            pushFollow(FOLLOW_semi_in_fieldDefinitionBlockEntry1842);
            semi120=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semi.add(semi120.getTree());


            // AST REWRITE
            // elements: variableDeclarator, vm
            // token labels: 
            // rule labels: vm, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_vm=new RewriteRuleSubtreeStream(adaptor,"rule vm",vm!=null?vm.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 608:3: -> ^( FIELD_DEF $vm ( variableDeclarator )+ )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:608:6: ^( FIELD_DEF $vm ( variableDeclarator )+ )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FIELD_DEF, "FIELD_DEF"), root_1);

                adaptor.addChild(root_1, annos);
                adaptor.addChild(root_1, mods);
                adaptor.addChild(root_1, stream_vm.nextTree());
                if ( !(stream_variableDeclarator.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclarator.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclarator.nextTree());

                }
                stream_variableDeclarator.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "fieldDefinitionBlockEntry"

    public static class classMethodDefinitionBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMethodDefinitionBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:615:1: classMethodDefinitionBlockEntry[LinkedListTree annos, Tree mods] : FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? block -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? ) ;
    public final AS3Parser.classMethodDefinitionBlockEntry_return classMethodDefinitionBlockEntry(LinkedListTree annos, Tree mods) throws RecognitionException {
        AS3Parser.classMethodDefinitionBlockEntry_return retval = new AS3Parser.classMethodDefinitionBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token FUNCTION121=null;
        AS3Parser.optionalAccessorRole_return r = null;

        AS3Parser.ident_return ident122 = null;

        AS3Parser.parameterDeclarationList_return parameterDeclarationList123 = null;

        AS3Parser.typeExpression_return typeExpression124 = null;

        AS3Parser.block_return block125 = null;


        LinkedListTree FUNCTION121_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");
        RewriteRuleSubtreeStream stream_optionalAccessorRole=new RewriteRuleSubtreeStream(adaptor,"rule optionalAccessorRole");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parameterDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule parameterDeclarationList");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:616:2: ( FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? block -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:616:4: FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? block
            {
            if ( state.backtracking==0 ) {
               retval.start = annos.getStartToken(); 
            }
            FUNCTION121=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_classMethodDefinitionBlockEntry1882); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION121);

            pushFollow(FOLLOW_optionalAccessorRole_in_classMethodDefinitionBlockEntry1888);
            r=optionalAccessorRole();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_optionalAccessorRole.add(r.getTree());
            if ( state.backtracking==0 ) {
               placeholder((r!=null?((LinkedListTree)r.tree):null)); 
            }
            pushFollow(FOLLOW_ident_in_classMethodDefinitionBlockEntry1895);
            ident122=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident122.getTree());
            pushFollow(FOLLOW_parameterDeclarationList_in_classMethodDefinitionBlockEntry1899);
            parameterDeclarationList123=parameterDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameterDeclarationList.add(parameterDeclarationList123.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:621:3: ( typeExpression )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==COLON) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:621:3: typeExpression
                    {
                    pushFollow(FOLLOW_typeExpression_in_classMethodDefinitionBlockEntry1903);
                    typeExpression124=typeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression124.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_classMethodDefinitionBlockEntry1908);
            block125=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block125.getTree());


            // AST REWRITE
            // elements: parameterDeclarationList, ident, block, optionalAccessorRole, typeExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 623:3: -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:623:6: ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ( block )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(METHOD_DEF, "METHOD_DEF"), root_1);

                adaptor.addChild(root_1, annos);
                adaptor.addChild(root_1, mods);
                adaptor.addChild(root_1, stream_optionalAccessorRole.nextTree());
                adaptor.addChild(root_1, stream_ident.nextTree());
                adaptor.addChild(root_1, stream_parameterDeclarationList.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:626:5: ( typeExpression )?
                if ( stream_typeExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeExpression.nextTree());

                }
                stream_typeExpression.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:627:5: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "classMethodDefinitionBlockEntry"

    public static class interfaceMethodDefinitionBlockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceMethodDefinitionBlockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:630:1: interfaceMethodDefinitionBlockEntry[LinkedListTree annos] : FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? semi -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ) ;
    public final AS3Parser.interfaceMethodDefinitionBlockEntry_return interfaceMethodDefinitionBlockEntry(LinkedListTree annos) throws RecognitionException {
        AS3Parser.interfaceMethodDefinitionBlockEntry_return retval = new AS3Parser.interfaceMethodDefinitionBlockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token FUNCTION126=null;
        AS3Parser.optionalAccessorRole_return r = null;

        AS3Parser.ident_return ident127 = null;

        AS3Parser.parameterDeclarationList_return parameterDeclarationList128 = null;

        AS3Parser.typeExpression_return typeExpression129 = null;

        AS3Parser.semi_return semi130 = null;


        LinkedListTree FUNCTION126_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");
        RewriteRuleSubtreeStream stream_optionalAccessorRole=new RewriteRuleSubtreeStream(adaptor,"rule optionalAccessorRole");
        RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");
        RewriteRuleSubtreeStream stream_parameterDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule parameterDeclarationList");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:631:2: ( FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? semi -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:631:4: FUNCTION r= optionalAccessorRole ident parameterDeclarationList ( typeExpression )? semi
            {
            if ( state.backtracking==0 ) {
               retval.start = annos.getStartToken(); 
            }
            FUNCTION126=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_interfaceMethodDefinitionBlockEntry1980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION126);

            pushFollow(FOLLOW_optionalAccessorRole_in_interfaceMethodDefinitionBlockEntry1986);
            r=optionalAccessorRole();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_optionalAccessorRole.add(r.getTree());
            if ( state.backtracking==0 ) {
               placeholder((r!=null?((LinkedListTree)r.tree):null)); 
            }
            pushFollow(FOLLOW_ident_in_interfaceMethodDefinitionBlockEntry1993);
            ident127=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident127.getTree());
            pushFollow(FOLLOW_parameterDeclarationList_in_interfaceMethodDefinitionBlockEntry1997);
            parameterDeclarationList128=parameterDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameterDeclarationList.add(parameterDeclarationList128.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:636:3: ( typeExpression )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==COLON) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:636:3: typeExpression
                    {
                    pushFollow(FOLLOW_typeExpression_in_interfaceMethodDefinitionBlockEntry2001);
                    typeExpression129=typeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression129.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semi_in_interfaceMethodDefinitionBlockEntry2006);
            semi130=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semi.add(semi130.getTree());


            // AST REWRITE
            // elements: typeExpression, optionalAccessorRole, parameterDeclarationList, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 638:3: -> ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:638:6: ^( METHOD_DEF optionalAccessorRole ident parameterDeclarationList ( typeExpression )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(METHOD_DEF, "METHOD_DEF"), root_1);

                adaptor.addChild(root_1, annos);
                adaptor.addChild(root_1, stream_optionalAccessorRole.nextTree());
                adaptor.addChild(root_1, stream_ident.nextTree());
                adaptor.addChild(root_1, stream_parameterDeclarationList.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:641:5: ( typeExpression )?
                if ( stream_typeExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeExpression.nextTree());

                }
                stream_typeExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceMethodDefinitionBlockEntry"

    public static class optionalAccessorRole_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionalAccessorRole"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:645:1: optionalAccessorRole : ( accessorRole )? -> ^( ACCESSOR_ROLE ( accessorRole )? ) ;
    public final AS3Parser.optionalAccessorRole_return optionalAccessorRole() throws RecognitionException {
        AS3Parser.optionalAccessorRole_return retval = new AS3Parser.optionalAccessorRole_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.accessorRole_return accessorRole131 = null;


        RewriteRuleSubtreeStream stream_accessorRole=new RewriteRuleSubtreeStream(adaptor,"rule accessorRole");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:646:2: ( ( accessorRole )? -> ^( ACCESSOR_ROLE ( accessorRole )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:646:4: ( accessorRole )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:646:4: ( accessorRole )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==GET) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==IDENT||(LA35_1>=USE && LA35_1<=NAMESPACE)||LA35_1==DYNAMIC||(LA35_1>=GET && LA35_1<=SET)||(LA35_1>=IS && LA35_1<=AS)) ) {
                    alt35=1;
                }
            }
            else if ( (LA35_0==SET) ) {
                int LA35_3 = input.LA(2);

                if ( (LA35_3==IDENT||(LA35_3>=USE && LA35_3<=NAMESPACE)||LA35_3==DYNAMIC||(LA35_3>=GET && LA35_3<=SET)||(LA35_3>=IS && LA35_3<=AS)) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:646:4: accessorRole
                    {
                    pushFollow(FOLLOW_accessorRole_in_optionalAccessorRole2065);
                    accessorRole131=accessorRole();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_accessorRole.add(accessorRole131.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: accessorRole
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 647:3: -> ^( ACCESSOR_ROLE ( accessorRole )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:647:6: ^( ACCESSOR_ROLE ( accessorRole )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ACCESSOR_ROLE, "ACCESSOR_ROLE"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:647:23: ( accessorRole )?
                if ( stream_accessorRole.hasNext() ) {
                    adaptor.addChild(root_1, stream_accessorRole.nextTree());

                }
                stream_accessorRole.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "optionalAccessorRole"

    public static class accessorRole_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accessorRole"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:650:1: accessorRole : ( GET | SET );
    public final AS3Parser.accessorRole_return accessorRole() throws RecognitionException {
        AS3Parser.accessorRole_return retval = new AS3Parser.accessorRole_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set132=null;

        LinkedListTree set132_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:651:2: ( GET | SET )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set132=(Token)input.LT(1);
            if ( (input.LA(1)>=GET && input.LA(1)<=SET) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set132));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "accessorRole"

    public static class block_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:659:1: block : LBRACE ( blockEntry )* RBRACE -> ^( BLOCK ( blockEntry )* ) ;
    public final AS3Parser.block_return block() throws RecognitionException {
        AS3Parser.block_return retval = new AS3Parser.block_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE133=null;
        Token RBRACE135=null;
        AS3Parser.blockEntry_return blockEntry134 = null;


        LinkedListTree LBRACE133_tree=null;
        LinkedListTree RBRACE135_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockEntry=new RewriteRuleSubtreeStream(adaptor,"rule blockEntry");

        	if (typeBlockParse)
        	{
        		retval.tree = (LinkedListTree) adaptor.create(BLOCK, "BLOCK");
        		parseBlock(retval);
        		return retval;
        	}

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:668:2: ( LBRACE ( blockEntry )* RBRACE -> ^( BLOCK ( blockEntry )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:668:4: LBRACE ( blockEntry )* RBRACE
            {
            LBRACE133=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2116); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE133);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:668:11: ( blockEntry )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LBRACE||(LA36_0>=SEMI && LA36_0<=IDENT)||LA36_0==LBRACK||LA36_0==LPAREN||(LA36_0>=INCLUDE && LA36_0<=IMPORT)||(LA36_0>=DYNAMIC && LA36_0<=FINAL)||LA36_0==OVERRIDE||(LA36_0>=STATIC && LA36_0<=NATIVE)||(LA36_0>=FUNCTION && LA36_0<=IF)||(LA36_0>=FOR && LA36_0<=EACH)||(LA36_0>=THROW && LA36_0<=TRY)||LA36_0==SWITCH||(LA36_0>=DEFAULT && LA36_0<=VOID)||(LA36_0>=PLUS && LA36_0<=MINUS)||(LA36_0>=INC && LA36_0<=BNOT)||(LA36_0>=UNDEFINED && LA36_0<=FLOAT_LITERAL)||LA36_0==E4X_ATTRI) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:668:11: blockEntry
            	    {
            	    pushFollow(FOLLOW_blockEntry_in_block2118);
            	    blockEntry134=blockEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockEntry.add(blockEntry134.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            RBRACE135=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE135);



            // AST REWRITE
            // elements: blockEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 669:3: -> ^( BLOCK ( blockEntry )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:669:6: ^( BLOCK ( blockEntry )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:669:15: ( blockEntry )*
                while ( stream_blockEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockEntry.nextTree());

                }
                stream_blockEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockEntry_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockEntry"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:672:1: blockEntry : statement ;
    public final AS3Parser.blockEntry_return blockEntry() throws RecognitionException {
        AS3Parser.blockEntry_return retval = new AS3Parser.blockEntry_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.statement_return statement136 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:673:2: ( statement )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:674:3: statement
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_statement_in_blockEntry2147);
            statement136=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement136.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "blockEntry"

    public static class statement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:681:1: statement options {k=1; } : ({...}? block | statementTail );
    public final AS3Parser.statement_return statement() throws RecognitionException {
        AS3Parser.statement_return retval = new AS3Parser.statement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.block_return block137 = null;

        AS3Parser.statementTail_return statementTail138 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:686:2: ({...}? block | statementTail )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:686:4: {...}? block
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    if ( !(( input.LA(1) == LBRACE )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement2177);
                    block137=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block137.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:688:4: statementTail
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement2183);
                    statementTail138=statementTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementTail138.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementTail_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementTail"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:691:1: statementTail : ( declarationStatement | expressionStatement | ifStatement | ( FOR EACH )=> forEachStatement | forStatement | whileStatement | doWhileStatement | continueStatement | breakStatement | returnStatement | withStatement | labelStatement | switchStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | includeDirective | importDirective | useNamespaceDirective | configBlockDirective | emptyStatement ) ;
    public final AS3Parser.statementTail_return statementTail() throws RecognitionException {
        AS3Parser.statementTail_return retval = new AS3Parser.statementTail_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.declarationStatement_return declarationStatement139 = null;

        AS3Parser.expressionStatement_return expressionStatement140 = null;

        AS3Parser.ifStatement_return ifStatement141 = null;

        AS3Parser.forEachStatement_return forEachStatement142 = null;

        AS3Parser.forStatement_return forStatement143 = null;

        AS3Parser.whileStatement_return whileStatement144 = null;

        AS3Parser.doWhileStatement_return doWhileStatement145 = null;

        AS3Parser.continueStatement_return continueStatement146 = null;

        AS3Parser.breakStatement_return breakStatement147 = null;

        AS3Parser.returnStatement_return returnStatement148 = null;

        AS3Parser.withStatement_return withStatement149 = null;

        AS3Parser.labelStatement_return labelStatement150 = null;

        AS3Parser.switchStatement_return switchStatement151 = null;

        AS3Parser.throwStatement_return throwStatement152 = null;

        AS3Parser.tryStatement_return tryStatement153 = null;

        AS3Parser.defaultXMLNamespaceStatement_return defaultXMLNamespaceStatement154 = null;

        AS3Parser.includeDirective_return includeDirective155 = null;

        AS3Parser.importDirective_return importDirective156 = null;

        AS3Parser.useNamespaceDirective_return useNamespaceDirective157 = null;

        AS3Parser.configBlockDirective_return configBlockDirective158 = null;

        AS3Parser.emptyStatement_return emptyStatement159 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:692:2: ( ( declarationStatement | expressionStatement | ifStatement | ( FOR EACH )=> forEachStatement | forStatement | whileStatement | doWhileStatement | continueStatement | breakStatement | returnStatement | withStatement | labelStatement | switchStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | includeDirective | importDirective | useNamespaceDirective | configBlockDirective | emptyStatement ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:692:4: ( declarationStatement | expressionStatement | ifStatement | ( FOR EACH )=> forEachStatement | forStatement | whileStatement | doWhileStatement | continueStatement | breakStatement | returnStatement | withStatement | labelStatement | switchStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | includeDirective | importDirective | useNamespaceDirective | configBlockDirective | emptyStatement )
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:692:4: ( declarationStatement | expressionStatement | ifStatement | ( FOR EACH )=> forEachStatement | forStatement | whileStatement | doWhileStatement | continueStatement | breakStatement | returnStatement | withStatement | labelStatement | switchStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | includeDirective | importDirective | useNamespaceDirective | configBlockDirective | emptyStatement )
            int alt38=21;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:692:5: declarationStatement
                    {
                    pushFollow(FOLLOW_declarationStatement_in_statementTail2195);
                    declarationStatement139=declarationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationStatement139.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:693:4: expressionStatement
                    {
                    pushFollow(FOLLOW_expressionStatement_in_statementTail2200);
                    expressionStatement140=expressionStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStatement140.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:694:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statementTail2205);
                    ifStatement141=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement141.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:696:4: ( FOR EACH )=> forEachStatement
                    {
                    pushFollow(FOLLOW_forEachStatement_in_statementTail2218);
                    forEachStatement142=forEachStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forEachStatement142.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:697:4: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_statementTail2223);
                    forStatement143=forStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatement143.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:698:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statementTail2228);
                    whileStatement144=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement144.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:699:4: doWhileStatement
                    {
                    pushFollow(FOLLOW_doWhileStatement_in_statementTail2233);
                    doWhileStatement145=doWhileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileStatement145.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:701:4: continueStatement
                    {
                    pushFollow(FOLLOW_continueStatement_in_statementTail2240);
                    continueStatement146=continueStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatement146.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:702:4: breakStatement
                    {
                    pushFollow(FOLLOW_breakStatement_in_statementTail2245);
                    breakStatement147=breakStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatement147.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:703:4: returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_statementTail2250);
                    returnStatement148=returnStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement148.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:704:4: withStatement
                    {
                    pushFollow(FOLLOW_withStatement_in_statementTail2255);
                    withStatement149=withStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement149.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:705:4: labelStatement
                    {
                    pushFollow(FOLLOW_labelStatement_in_statementTail2260);
                    labelStatement150=labelStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labelStatement150.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:706:4: switchStatement
                    {
                    pushFollow(FOLLOW_switchStatement_in_statementTail2265);
                    switchStatement151=switchStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatement151.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:707:4: throwStatement
                    {
                    pushFollow(FOLLOW_throwStatement_in_statementTail2270);
                    throwStatement152=throwStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, throwStatement152.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:708:4: tryStatement
                    {
                    pushFollow(FOLLOW_tryStatement_in_statementTail2275);
                    tryStatement153=tryStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStatement153.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:710:4: defaultXMLNamespaceStatement
                    {
                    pushFollow(FOLLOW_defaultXMLNamespaceStatement_in_statementTail2281);
                    defaultXMLNamespaceStatement154=defaultXMLNamespaceStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultXMLNamespaceStatement154.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:711:4: includeDirective
                    {
                    pushFollow(FOLLOW_includeDirective_in_statementTail2286);
                    includeDirective155=includeDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, includeDirective155.getTree());

                    }
                    break;
                case 18 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:712:5: importDirective
                    {
                    pushFollow(FOLLOW_importDirective_in_statementTail2292);
                    importDirective156=importDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, importDirective156.getTree());

                    }
                    break;
                case 19 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:713:4: useNamespaceDirective
                    {
                    pushFollow(FOLLOW_useNamespaceDirective_in_statementTail2297);
                    useNamespaceDirective157=useNamespaceDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, useNamespaceDirective157.getTree());

                    }
                    break;
                case 20 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:715:4: configBlockDirective
                    {
                    pushFollow(FOLLOW_configBlockDirective_in_statementTail2304);
                    configBlockDirective158=configBlockDirective();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, configBlockDirective158.getTree());

                    }
                    break;
                case 21 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:717:4: emptyStatement
                    {
                    pushFollow(FOLLOW_emptyStatement_in_statementTail2312);
                    emptyStatement159=emptyStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyStatement159.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "statementTail"

    public static class variableModifier_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableModifier"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:724:1: variableModifier : ( VAR | CONST | NAMESPACE );
    public final AS3Parser.variableModifier_return variableModifier() throws RecognitionException {
        AS3Parser.variableModifier_return retval = new AS3Parser.variableModifier_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set160=null;

        LinkedListTree set160_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:725:2: ( VAR | CONST | NAMESPACE )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set160=(Token)input.LT(1);
            if ( input.LA(1)==NAMESPACE||(input.LA(1)>=VAR && input.LA(1)<=CONST) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set160));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "variableModifier"

    public static class variableDeclarator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:731:1: variableDeclarator : ident ( typeExpression )? ( variableInitializer )? -> ^( VAR_DEC ident ( typeExpression )? ( variableInitializer )? ) ;
    public final AS3Parser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        AS3Parser.variableDeclarator_return retval = new AS3Parser.variableDeclarator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.ident_return ident161 = null;

        AS3Parser.typeExpression_return typeExpression162 = null;

        AS3Parser.variableInitializer_return variableInitializer163 = null;


        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");
        RewriteRuleSubtreeStream stream_variableInitializer=new RewriteRuleSubtreeStream(adaptor,"rule variableInitializer");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:732:2: ( ident ( typeExpression )? ( variableInitializer )? -> ^( VAR_DEC ident ( typeExpression )? ( variableInitializer )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:732:4: ident ( typeExpression )? ( variableInitializer )?
            {
            pushFollow(FOLLOW_ident_in_variableDeclarator2351);
            ident161=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident161.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:732:10: ( typeExpression )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COLON) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:732:10: typeExpression
                    {
                    pushFollow(FOLLOW_typeExpression_in_variableDeclarator2353);
                    typeExpression162=typeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression162.getTree());

                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:732:26: ( variableInitializer )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ASSIGN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:732:26: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator2356);
                    variableInitializer163=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variableInitializer.add(variableInitializer163.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: typeExpression, ident, variableInitializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 733:3: -> ^( VAR_DEC ident ( typeExpression )? ( variableInitializer )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:733:6: ^( VAR_DEC ident ( typeExpression )? ( variableInitializer )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(VAR_DEC, "VAR_DEC"), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:733:23: ( typeExpression )?
                if ( stream_typeExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeExpression.nextTree());

                }
                stream_typeExpression.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:733:39: ( variableInitializer )?
                if ( stream_variableInitializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableInitializer.nextTree());

                }
                stream_variableInitializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class declarationStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarationStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:737:1: declarationStatement : declaration semi ;
    public final AS3Parser.declarationStatement_return declarationStatement() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.declarationStatement_return retval = new AS3Parser.declarationStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.declaration_return declaration164 = null;

        AS3Parser.semi_return semi165 = null;




        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:742:2: ( declaration semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:742:4: declaration semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_declaration_in_declarationStatement2397);
            declaration164=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration164.getTree());
            pushFollow(FOLLOW_semi_in_declarationStatement2399);
            semi165=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi165.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "declarationStatement"

    public static class declaration_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:746:1: declaration : variableModifier variableDeclarator declarationTail ;
    public final AS3Parser.declaration_return declaration() throws RecognitionException {
        AS3Parser.declaration_return retval = new AS3Parser.declaration_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.variableModifier_return variableModifier166 = null;

        AS3Parser.variableDeclarator_return variableDeclarator167 = null;

        AS3Parser.declarationTail_return declarationTail168 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:747:2: ( variableModifier variableDeclarator declarationTail )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:747:4: variableModifier variableDeclarator declarationTail
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_variableModifier_in_declaration2411);
            variableModifier166=variableModifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(variableModifier166.getTree(), root_0);
            pushFollow(FOLLOW_variableDeclarator_in_declaration2414);
            variableDeclarator167=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator167.getTree());
            pushFollow(FOLLOW_declarationTail_in_declaration2416);
            declarationTail168=declarationTail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declarationTail168.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class declarationTail_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarationTail"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:751:1: declarationTail : ( COMMA variableDeclarator )* ;
    public final AS3Parser.declarationTail_return declarationTail() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.declarationTail_return retval = new AS3Parser.declarationTail_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COMMA169=null;
        AS3Parser.variableDeclarator_return variableDeclarator170 = null;


        LinkedListTree COMMA169_tree=null;


        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:756:3: ( ( COMMA variableDeclarator )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:756:5: ( COMMA variableDeclarator )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:756:5: ( COMMA variableDeclarator )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:756:7: COMMA variableDeclarator
            	    {
            	    COMMA169=(Token)match(input,COMMA,FOLLOW_COMMA_in_declarationTail2441); if (state.failed) return retval;
            	    pushFollow(FOLLOW_variableDeclarator_in_declarationTail2444);
            	    variableDeclarator170=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarator170.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "declarationTail"

    public static class variableInitializer_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitializer"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:760:1: variableInitializer : ASSIGN assignmentExpression ;
    public final AS3Parser.variableInitializer_return variableInitializer() throws RecognitionException {
        AS3Parser.variableInitializer_return retval = new AS3Parser.variableInitializer_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token ASSIGN171=null;
        AS3Parser.assignmentExpression_return assignmentExpression172 = null;


        LinkedListTree ASSIGN171_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:761:2: ( ASSIGN assignmentExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:761:4: ASSIGN assignmentExpression
            {
            root_0 = (LinkedListTree)adaptor.nil();

            ASSIGN171=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableInitializer2459); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN171_tree = (LinkedListTree)adaptor.create(ASSIGN171);
            root_0 = (LinkedListTree)adaptor.becomeRoot(ASSIGN171_tree, root_0);
            }
            pushFollow(FOLLOW_assignmentExpression_in_variableInitializer2462);
            assignmentExpression172=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression172.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class emptyStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emptyStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:764:1: emptyStatement : SEMI ;
    public final AS3Parser.emptyStatement_return emptyStatement() throws RecognitionException {
        AS3Parser.emptyStatement_return retval = new AS3Parser.emptyStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token SEMI173=null;

        LinkedListTree SEMI173_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:765:2: ( SEMI )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:765:4: SEMI
            {
            root_0 = (LinkedListTree)adaptor.nil();

            SEMI173=(Token)match(input,SEMI,FOLLOW_SEMI_in_emptyStatement2473); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "emptyStatement"

    public static class expressionStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:772:1: expressionStatement : expressionList semi -> ^( EXPR_STMNT expressionList ) ;
    public final AS3Parser.expressionStatement_return expressionStatement() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.expressionStatement_return retval = new AS3Parser.expressionStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.expressionList_return expressionList174 = null;

        AS3Parser.semi_return semi175 = null;


        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");

        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:777:2: ( expressionList semi -> ^( EXPR_STMNT expressionList ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:777:4: expressionList semi
            {
            pushFollow(FOLLOW_expressionList_in_expressionStatement2499);
            expressionList174=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionList.add(expressionList174.getTree());
            pushFollow(FOLLOW_semi_in_expressionStatement2501);
            semi175=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semi.add(semi175.getTree());


            // AST REWRITE
            // elements: expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 778:3: -> ^( EXPR_STMNT expressionList )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:778:6: ^( EXPR_STMNT expressionList )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(EXPR_STMNT, "EXPR_STMNT"), root_1);

                adaptor.addChild(root_1, stream_expressionList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "expressionStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:785:1: ifStatement : IF condition statement ( ( ELSE )=> elseClause )? ;
    public final AS3Parser.ifStatement_return ifStatement() throws RecognitionException {
        AS3Parser.ifStatement_return retval = new AS3Parser.ifStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IF176=null;
        AS3Parser.condition_return condition177 = null;

        AS3Parser.statement_return statement178 = null;

        AS3Parser.elseClause_return elseClause179 = null;


        LinkedListTree IF176_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:786:2: ( IF condition statement ( ( ELSE )=> elseClause )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:786:4: IF condition statement ( ( ELSE )=> elseClause )?
            {
            root_0 = (LinkedListTree)adaptor.nil();

            IF176=(Token)match(input,IF,FOLLOW_IF_in_ifStatement2528); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF176_tree = (LinkedListTree)adaptor.create(IF176);
            root_0 = (LinkedListTree)adaptor.becomeRoot(IF176_tree, root_0);
            }
            pushFollow(FOLLOW_condition_in_ifStatement2531);
            condition177=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition177.getTree());
            pushFollow(FOLLOW_statement_in_ifStatement2533);
            statement178=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement178.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:787:3: ( ( ELSE )=> elseClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ELSE) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred8_AS3()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:787:5: ( ELSE )=> elseClause
                    {
                    pushFollow(FOLLOW_elseClause_in_ifStatement2544);
                    elseClause179=elseClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elseClause179.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class elseClause_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseClause"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:790:1: elseClause : ELSE statement ;
    public final AS3Parser.elseClause_return elseClause() throws RecognitionException {
        AS3Parser.elseClause_return retval = new AS3Parser.elseClause_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token ELSE180=null;
        AS3Parser.statement_return statement181 = null;


        LinkedListTree ELSE180_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:791:2: ( ELSE statement )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:791:4: ELSE statement
            {
            root_0 = (LinkedListTree)adaptor.nil();

            ELSE180=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseClause2558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE180_tree = (LinkedListTree)adaptor.create(ELSE180);
            root_0 = (LinkedListTree)adaptor.becomeRoot(ELSE180_tree, root_0);
            }
            pushFollow(FOLLOW_statement_in_elseClause2561);
            statement181=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement181.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "elseClause"

    public static class condition_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:794:1: condition : LPAREN expression RPAREN -> ^( CONDITION expression ) ;
    public final AS3Parser.condition_return condition() throws RecognitionException {
        AS3Parser.condition_return retval = new AS3Parser.condition_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LPAREN182=null;
        Token RPAREN184=null;
        AS3Parser.expression_return expression183 = null;


        LinkedListTree LPAREN182_tree=null;
        LinkedListTree RPAREN184_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:795:2: ( LPAREN expression RPAREN -> ^( CONDITION expression ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:795:4: LPAREN expression RPAREN
            {
            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition2572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            pushFollow(FOLLOW_expression_in_condition2574);
            expression183=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression183.getTree());
            RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition2576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 796:3: -> ^( CONDITION expression )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:796:6: ^( CONDITION expression )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class forEachStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forEachStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:803:1: forEachStatement : f= FOR EACH LPAREN forInClause RPAREN statement -> ^( FOR_EACH[$f] forInClause statement ) ;
    public final AS3Parser.forEachStatement_return forEachStatement() throws RecognitionException {
        AS3Parser.forEachStatement_return retval = new AS3Parser.forEachStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token f=null;
        Token EACH185=null;
        Token LPAREN186=null;
        Token RPAREN188=null;
        AS3Parser.forInClause_return forInClause187 = null;

        AS3Parser.statement_return statement189 = null;


        LinkedListTree f_tree=null;
        LinkedListTree EACH185_tree=null;
        LinkedListTree LPAREN186_tree=null;
        LinkedListTree RPAREN188_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forInClause=new RewriteRuleSubtreeStream(adaptor,"rule forInClause");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:804:2: (f= FOR EACH LPAREN forInClause RPAREN statement -> ^( FOR_EACH[$f] forInClause statement ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:804:4: f= FOR EACH LPAREN forInClause RPAREN statement
            {
            f=(Token)match(input,FOR,FOLLOW_FOR_in_forEachStatement2605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(f);

            EACH185=(Token)match(input,EACH,FOLLOW_EACH_in_forEachStatement2607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EACH.add(EACH185);

            LPAREN186=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forEachStatement2609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN186);

            pushFollow(FOLLOW_forInClause_in_forEachStatement2611);
            forInClause187=forInClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_forInClause.add(forInClause187.getTree());
            RPAREN188=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forEachStatement2613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN188);

            pushFollow(FOLLOW_statement_in_forEachStatement2617);
            statement189=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement189.getTree());


            // AST REWRITE
            // elements: statement, forInClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 806:3: -> ^( FOR_EACH[$f] forInClause statement )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:806:6: ^( FOR_EACH[$f] forInClause statement )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_EACH, f), root_1);

                adaptor.addChild(root_1, stream_forInClause.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "forEachStatement"

    public static class forStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:813:1: forStatement : f= FOR LPAREN ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) ) ;
    public final AS3Parser.forStatement_return forStatement() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.forStatement_return retval = new AS3Parser.forStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token f=null;
        Token LPAREN190=null;
        Token RPAREN192=null;
        Token RPAREN195=null;
        AS3Parser.forInClause_return forInClause191 = null;

        AS3Parser.statement_return statement193 = null;

        AS3Parser.traditionalForClause_return traditionalForClause194 = null;

        AS3Parser.statement_return statement196 = null;


        LinkedListTree f_tree=null;
        LinkedListTree LPAREN190_tree=null;
        LinkedListTree RPAREN192_tree=null;
        LinkedListTree RPAREN195_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_traditionalForClause=new RewriteRuleSubtreeStream(adaptor,"rule traditionalForClause");
        RewriteRuleSubtreeStream stream_forInClause=new RewriteRuleSubtreeStream(adaptor,"rule forInClause");

        	((InOperator_scope)InOperator_stack.peek()).allowed = false;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:818:2: (f= FOR LPAREN ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:818:4: f= FOR LPAREN ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) )
            {
            f=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement2659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(f);

            LPAREN190=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStatement2661); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN190);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:819:3: ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:820:4: ( forInClauseDecl IN )=> forInClause RPAREN statement
                    {
                    pushFollow(FOLLOW_forInClause_in_forStatement2676);
                    forInClause191=forInClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forInClause.add(forInClause191.getTree());
                    RPAREN192=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStatement2678); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN192);

                    pushFollow(FOLLOW_statement_in_forStatement2680);
                    statement193=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement193.getTree());


                    // AST REWRITE
                    // elements: forInClause, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 821:4: -> ^( FOR_IN[$f] forInClause statement )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:821:7: ^( FOR_IN[$f] forInClause statement )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_IN, f), root_1);

                        adaptor.addChild(root_1, stream_forInClause.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:823:4: traditionalForClause RPAREN statement
                    {
                    pushFollow(FOLLOW_traditionalForClause_in_forStatement2706);
                    traditionalForClause194=traditionalForClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_traditionalForClause.add(traditionalForClause194.getTree());
                    RPAREN195=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStatement2708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN195);

                    pushFollow(FOLLOW_statement_in_forStatement2710);
                    statement196=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement196.getTree());


                    // AST REWRITE
                    // elements: traditionalForClause, statement, f
                    // token labels: f
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 824:4: -> ^( $f traditionalForClause statement )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:824:7: ^( $f traditionalForClause statement )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_f.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_traditionalForClause.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class traditionalForClause_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "traditionalForClause"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:828:1: traditionalForClause : a= forInit SEMI b= forCond SEMI c= forIter ;
    public final AS3Parser.traditionalForClause_return traditionalForClause() throws RecognitionException {
        AS3Parser.traditionalForClause_return retval = new AS3Parser.traditionalForClause_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token SEMI197=null;
        Token SEMI198=null;
        AS3Parser.forInit_return a = null;

        AS3Parser.forCond_return b = null;

        AS3Parser.forIter_return c = null;


        LinkedListTree SEMI197_tree=null;
        LinkedListTree SEMI198_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:829:2: (a= forInit SEMI b= forCond SEMI c= forIter )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:829:4: a= forInit SEMI b= forCond SEMI c= forIter
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_forInit_in_traditionalForClause2743);
            a=forInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());
            if ( state.backtracking==0 ) {
              placeholder((a!=null?((LinkedListTree)a.tree):null));
            }
            SEMI197=(Token)match(input,SEMI,FOLLOW_SEMI_in_traditionalForClause2747); if (state.failed) return retval;
            pushFollow(FOLLOW_forCond_in_traditionalForClause2755);
            b=forCond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, b.getTree());
            if ( state.backtracking==0 ) {
              placeholder((b!=null?((LinkedListTree)b.tree):null));
            }
            SEMI198=(Token)match(input,SEMI,FOLLOW_SEMI_in_traditionalForClause2759); if (state.failed) return retval;
            pushFollow(FOLLOW_forIter_in_traditionalForClause2767);
            c=forIter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
            if ( state.backtracking==0 ) {
              placeholder((c!=null?((LinkedListTree)c.tree):null));
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "traditionalForClause"

    public static class forInClause_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInClause"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:834:1: forInClause : forInClauseDecl IN forInClauseTail ;
    public final AS3Parser.forInClause_return forInClause() throws RecognitionException {
        AS3Parser.forInClause_return retval = new AS3Parser.forInClause_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IN200=null;
        AS3Parser.forInClauseDecl_return forInClauseDecl199 = null;

        AS3Parser.forInClauseTail_return forInClauseTail201 = null;


        LinkedListTree IN200_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:835:2: ( forInClauseDecl IN forInClauseTail )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:835:4: forInClauseDecl IN forInClauseTail
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_forInClauseDecl_in_forInClause2781);
            forInClauseDecl199=forInClauseDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, forInClauseDecl199.getTree());
            IN200=(Token)match(input,IN,FOLLOW_IN_in_forInClause2783); if (state.failed) return retval;
            pushFollow(FOLLOW_forInClauseTail_in_forInClause2786);
            forInClauseTail201=forInClauseTail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, forInClauseTail201.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "forInClause"

    public static class forInClauseDecl_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInClauseDecl"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:838:1: forInClauseDecl : ( declaration | ident );
    public final AS3Parser.forInClauseDecl_return forInClauseDecl() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.forInClauseDecl_return retval = new AS3Parser.forInClauseDecl_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.declaration_return declaration202 = null;

        AS3Parser.ident_return ident203 = null;




        	((InOperator_scope)InOperator_stack.peek()).allowed = false;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:843:2: ( declaration | ident )
            int alt44=2;
            switch ( input.LA(1) ) {
            case NAMESPACE:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==IDENT||(LA44_1>=USE && LA44_1<=NAMESPACE)||LA44_1==DYNAMIC||(LA44_1>=GET && LA44_1<=SET)||(LA44_1>=IS && LA44_1<=AS)) ) {
                    alt44=1;
                }
                else if ( (LA44_1==IN) ) {
                    alt44=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case IDENT:
            case USE:
            case DYNAMIC:
            case GET:
            case SET:
            case IS:
            case AS:
                {
                alt44=2;
                }
                break;
            case VAR:
            case CONST:
                {
                alt44=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:843:4: declaration
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_declaration_in_forInClauseDecl2807);
                    declaration202=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration202.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:843:18: ident
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_forInClauseDecl2811);
                    ident203=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident203.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forInClauseDecl"

    public static class forInClauseTail_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInClauseTail"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:847:1: forInClauseTail : expressionList ;
    public final AS3Parser.forInClauseTail_return forInClauseTail() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.forInClauseTail_return retval = new AS3Parser.forInClauseTail_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.expressionList_return expressionList204 = null;




        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:852:2: ( expressionList )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:852:4: expressionList
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_expressionList_in_forInClauseTail2833);
            expressionList204=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList204.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forInClauseTail"

    public static class forInit_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:856:1: forInit : ( declaration | expressionList )? -> ^( FOR_INIT ( declaration )? ( expressionList )? ) ;
    public final AS3Parser.forInit_return forInit() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.forInit_return retval = new AS3Parser.forInit_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.declaration_return declaration205 = null;

        AS3Parser.expressionList_return expressionList206 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

        	((InOperator_scope)InOperator_stack.peek()).allowed = false;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:861:2: ( ( declaration | expressionList )? -> ^( FOR_INIT ( declaration )? ( expressionList )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:861:4: ( declaration | expressionList )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:861:4: ( declaration | expressionList )?
            int alt45=3;
            switch ( input.LA(1) ) {
                case NAMESPACE:
                    {
                    switch ( input.LA(2) ) {
                        case IDENT:
                        case USE:
                        case NAMESPACE:
                        case DYNAMIC:
                        case GET:
                        case SET:
                            {
                            alt45=1;
                            }
                            break;
                        case IS:
                            {
                            int LA45_5 = input.LA(3);

                            if ( (LA45_5==SEMI||LA45_5==COMMA||LA45_5==ASSIGN||LA45_5==COLON) ) {
                                alt45=1;
                            }
                            else if ( (LA45_5==LBRACE||LA45_5==IDENT||LA45_5==LBRACK||LA45_5==LPAREN||LA45_5==STRING_LITERAL||LA45_5==NAMESPACE||(LA45_5>=DYNAMIC && LA45_5<=FINAL)||LA45_5==OVERRIDE||(LA45_5>=STATIC && LA45_5<=NATIVE)||(LA45_5>=FUNCTION && LA45_5<=SET)||LA45_5==EACH||LA45_5==VOID||(LA45_5>=PLUS && LA45_5<=MINUS)||(LA45_5>=INC && LA45_5<=BNOT)||(LA45_5>=UNDEFINED && LA45_5<=FLOAT_LITERAL)||LA45_5==E4X_ATTRI) ) {
                                alt45=2;
                            }
                            }
                            break;
                        case AS:
                            {
                            int LA45_6 = input.LA(3);

                            if ( (LA45_6==SEMI||LA45_6==COMMA||LA45_6==ASSIGN||LA45_6==COLON) ) {
                                alt45=1;
                            }
                            else if ( (LA45_6==LBRACE||LA45_6==IDENT||LA45_6==LBRACK||LA45_6==LPAREN||LA45_6==STRING_LITERAL||LA45_6==NAMESPACE||(LA45_6>=DYNAMIC && LA45_6<=FINAL)||LA45_6==OVERRIDE||(LA45_6>=STATIC && LA45_6<=NATIVE)||(LA45_6>=FUNCTION && LA45_6<=SET)||LA45_6==EACH||LA45_6==VOID||(LA45_6>=PLUS && LA45_6<=MINUS)||(LA45_6>=INC && LA45_6<=BNOT)||(LA45_6>=UNDEFINED && LA45_6<=FLOAT_LITERAL)||LA45_6==E4X_ATTRI) ) {
                                alt45=2;
                            }
                            }
                            break;
                        case SEMI:
                        case DBL_COLON:
                        case LBRACK:
                        case LPAREN:
                        case COMMA:
                        case ASSIGN:
                        case DOT:
                        case STAR:
                        case IN:
                        case POST:
                        case GT:
                        case DIV_ASSIGN:
                        case MOD_ASSIGN:
                        case PLUS_ASSIGN:
                        case MINUS_ASSIGN:
                        case SL_ASSIGN:
                        case BAND_ASSIGN:
                        case BXOR_ASSIGN:
                        case BOR_ASSIGN:
                        case LAND_ASSIGN:
                        case LOR_ASSIGN:
                        case QUESTION:
                        case LOR:
                        case LAND:
                        case BOR:
                        case BXOR:
                        case BAND:
                        case STRICT_EQUAL:
                        case STRICT_NOT_EQUAL:
                        case NOT_EQUAL:
                        case EQUAL:
                        case LT:
                        case LE:
                        case INSTANCEOF:
                        case SL:
                        case PLUS:
                        case MINUS:
                        case DIV:
                        case MOD:
                        case INC:
                        case DEC:
                        case E4X_DESC:
                            {
                            alt45=2;
                            }
                            break;
                    }

                    }
                    break;
                case LBRACE:
                case IDENT:
                case LBRACK:
                case LPAREN:
                case STRING_LITERAL:
                case DYNAMIC:
                case FINAL:
                case OVERRIDE:
                case STATIC:
                case NATIVE:
                case FUNCTION:
                case GET:
                case SET:
                case EACH:
                case VOID:
                case PLUS:
                case MINUS:
                case INC:
                case DEC:
                case DELETE:
                case TYPEOF:
                case LNOT:
                case BNOT:
                case UNDEFINED:
                case THIS:
                case SUPER:
                case NEW:
                case NULL:
                case FALSE:
                case TRUE:
                case XML_LITERAL:
                case REGEXP_LITERAL:
                case HEX_LITERAL:
                case DECIMAL_LITERAL:
                case OCTAL_LITERAL:
                case FLOAT_LITERAL:
                case E4X_ATTRI:
                    {
                    alt45=2;
                    }
                    break;
                case VAR:
                case CONST:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:861:6: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_forInit2858);
                    declaration205=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration205.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:861:20: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forInit2862);
                    expressionList206=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList206.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: declaration, expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 862:3: -> ^( FOR_INIT ( declaration )? ( expressionList )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:862:6: ^( FOR_INIT ( declaration )? ( expressionList )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_INIT, "FOR_INIT"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:862:18: ( declaration )?
                if ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:862:31: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forCond_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forCond"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:865:1: forCond : ( expressionList )? -> ^( FOR_CONDITION ( expressionList )? ) ;
    public final AS3Parser.forCond_return forCond() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.forCond_return retval = new AS3Parser.forCond_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.expressionList_return expressionList207 = null;


        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:870:2: ( ( expressionList )? -> ^( FOR_CONDITION ( expressionList )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:870:4: ( expressionList )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:870:4: ( expressionList )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LBRACE||LA46_0==IDENT||LA46_0==LBRACK||LA46_0==LPAREN||LA46_0==STRING_LITERAL||LA46_0==NAMESPACE||(LA46_0>=DYNAMIC && LA46_0<=FINAL)||LA46_0==OVERRIDE||(LA46_0>=STATIC && LA46_0<=NATIVE)||(LA46_0>=FUNCTION && LA46_0<=SET)||LA46_0==EACH||LA46_0==VOID||(LA46_0>=PLUS && LA46_0<=MINUS)||(LA46_0>=INC && LA46_0<=BNOT)||(LA46_0>=UNDEFINED && LA46_0<=FLOAT_LITERAL)||LA46_0==E4X_ATTRI) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:870:4: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forCond2902);
                    expressionList207=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList207.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 871:3: -> ^( FOR_CONDITION ( expressionList )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:871:6: ^( FOR_CONDITION ( expressionList )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_CONDITION, "FOR_CONDITION"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:871:23: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forCond"

    public static class forIter_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forIter"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:874:1: forIter : ( expressionList )? -> ^( FOR_ITERATOR ( expressionList )? ) ;
    public final AS3Parser.forIter_return forIter() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.forIter_return retval = new AS3Parser.forIter_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.expressionList_return expressionList208 = null;


        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:879:2: ( ( expressionList )? -> ^( FOR_ITERATOR ( expressionList )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:879:4: ( expressionList )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:879:4: ( expressionList )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==LBRACE||LA47_0==IDENT||LA47_0==LBRACK||LA47_0==LPAREN||LA47_0==STRING_LITERAL||LA47_0==NAMESPACE||(LA47_0>=DYNAMIC && LA47_0<=FINAL)||LA47_0==OVERRIDE||(LA47_0>=STATIC && LA47_0<=NATIVE)||(LA47_0>=FUNCTION && LA47_0<=SET)||LA47_0==EACH||LA47_0==VOID||(LA47_0>=PLUS && LA47_0<=MINUS)||(LA47_0>=INC && LA47_0<=BNOT)||(LA47_0>=UNDEFINED && LA47_0<=FLOAT_LITERAL)||LA47_0==E4X_ATTRI) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:879:4: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_forIter2937);
                    expressionList208=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList208.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 880:3: -> ^( FOR_ITERATOR ( expressionList )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:880:6: ^( FOR_ITERATOR ( expressionList )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FOR_ITERATOR, "FOR_ITERATOR"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:880:22: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.nextTree());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "forIter"

    public static class throwStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throwStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:887:1: throwStatement : THROW expression semi ;
    public final AS3Parser.throwStatement_return throwStatement() throws RecognitionException {
        AS3Parser.throwStatement_return retval = new AS3Parser.throwStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token THROW209=null;
        AS3Parser.expression_return expression210 = null;

        AS3Parser.semi_return semi211 = null;


        LinkedListTree THROW209_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:888:2: ( THROW expression semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:888:4: THROW expression semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            THROW209=(Token)match(input,THROW,FOLLOW_THROW_in_throwStatement2966); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            THROW209_tree = (LinkedListTree)adaptor.create(THROW209);
            root_0 = (LinkedListTree)adaptor.becomeRoot(THROW209_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_throwStatement2969);
            expression210=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression210.getTree());
            pushFollow(FOLLOW_semi_in_throwStatement2971);
            semi211=semi();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "throwStatement"

    public static class tryStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:891:1: tryStatement : TRY block ( finallyBlock | ( catchBlock )+ ( finallyBlock )? ) -> ^( TRY block ( catchBlock )* ( finallyBlock )? ) ;
    public final AS3Parser.tryStatement_return tryStatement() throws RecognitionException {
        AS3Parser.tryStatement_return retval = new AS3Parser.tryStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token TRY212=null;
        AS3Parser.block_return block213 = null;

        AS3Parser.finallyBlock_return finallyBlock214 = null;

        AS3Parser.catchBlock_return catchBlock215 = null;

        AS3Parser.finallyBlock_return finallyBlock216 = null;


        LinkedListTree TRY212_tree=null;
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleSubtreeStream stream_catchBlock=new RewriteRuleSubtreeStream(adaptor,"rule catchBlock");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_finallyBlock=new RewriteRuleSubtreeStream(adaptor,"rule finallyBlock");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:892:2: ( TRY block ( finallyBlock | ( catchBlock )+ ( finallyBlock )? ) -> ^( TRY block ( catchBlock )* ( finallyBlock )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:892:4: TRY block ( finallyBlock | ( catchBlock )+ ( finallyBlock )? )
            {
            TRY212=(Token)match(input,TRY,FOLLOW_TRY_in_tryStatement2983); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY212);

            pushFollow(FOLLOW_block_in_tryStatement2987);
            block213=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block213.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:894:2: ( finallyBlock | ( catchBlock )+ ( finallyBlock )? )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==FINALLY) ) {
                alt50=1;
            }
            else if ( (LA50_0==CATCH) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:894:4: finallyBlock
                    {
                    pushFollow(FOLLOW_finallyBlock_in_tryStatement2992);
                    finallyBlock214=finallyBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_finallyBlock.add(finallyBlock214.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:895:4: ( catchBlock )+ ( finallyBlock )?
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:895:4: ( catchBlock )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==CATCH) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:895:4: catchBlock
                    	    {
                    	    pushFollow(FOLLOW_catchBlock_in_tryStatement2997);
                    	    catchBlock215=catchBlock();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_catchBlock.add(catchBlock215.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:896:3: ( finallyBlock )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==FINALLY) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:896:3: finallyBlock
                            {
                            pushFollow(FOLLOW_finallyBlock_in_tryStatement3002);
                            finallyBlock216=finallyBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_finallyBlock.add(finallyBlock216.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: block, TRY, catchBlock, finallyBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 898:3: -> ^( TRY block ( catchBlock )* ( finallyBlock )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:898:6: ^( TRY block ( catchBlock )* ( finallyBlock )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:898:19: ( catchBlock )*
                while ( stream_catchBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_catchBlock.nextTree());

                }
                stream_catchBlock.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:898:31: ( finallyBlock )?
                if ( stream_finallyBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_finallyBlock.nextTree());

                }
                stream_finallyBlock.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "tryStatement"

    public static class catchBlock_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchBlock"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:901:1: catchBlock : CATCH LPAREN ident ( typeExpression )? RPAREN block -> ^( CATCH ident ( typeExpression )? block ) ;
    public final AS3Parser.catchBlock_return catchBlock() throws RecognitionException {
        AS3Parser.catchBlock_return retval = new AS3Parser.catchBlock_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token CATCH217=null;
        Token LPAREN218=null;
        Token RPAREN221=null;
        AS3Parser.ident_return ident219 = null;

        AS3Parser.typeExpression_return typeExpression220 = null;

        AS3Parser.block_return block222 = null;


        LinkedListTree CATCH217_tree=null;
        LinkedListTree LPAREN218_tree=null;
        LinkedListTree RPAREN221_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:902:2: ( CATCH LPAREN ident ( typeExpression )? RPAREN block -> ^( CATCH ident ( typeExpression )? block ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:902:4: CATCH LPAREN ident ( typeExpression )? RPAREN block
            {
            CATCH217=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchBlock3035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH217);

            LPAREN218=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchBlock3037); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN218);

            pushFollow(FOLLOW_ident_in_catchBlock3039);
            ident219=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident219.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:902:23: ( typeExpression )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:902:23: typeExpression
                    {
                    pushFollow(FOLLOW_typeExpression_in_catchBlock3041);
                    typeExpression220=typeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression220.getTree());

                    }
                    break;

            }

            RPAREN221=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchBlock3044); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN221);

            pushFollow(FOLLOW_block_in_catchBlock3048);
            block222=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block222.getTree());


            // AST REWRITE
            // elements: CATCH, typeExpression, block, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 904:3: -> ^( CATCH ident ( typeExpression )? block )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:904:6: ^( CATCH ident ( typeExpression )? block )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:904:21: ( typeExpression )?
                if ( stream_typeExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeExpression.nextTree());

                }
                stream_typeExpression.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "catchBlock"

    public static class finallyBlock_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finallyBlock"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:907:1: finallyBlock : FINALLY block ;
    public final AS3Parser.finallyBlock_return finallyBlock() throws RecognitionException {
        AS3Parser.finallyBlock_return retval = new AS3Parser.finallyBlock_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token FINALLY223=null;
        AS3Parser.block_return block224 = null;


        LinkedListTree FINALLY223_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:908:2: ( FINALLY block )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:908:4: FINALLY block
            {
            root_0 = (LinkedListTree)adaptor.nil();

            FINALLY223=(Token)match(input,FINALLY,FOLLOW_FINALLY_in_finallyBlock3076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FINALLY223_tree = (LinkedListTree)adaptor.create(FINALLY223);
            root_0 = (LinkedListTree)adaptor.becomeRoot(FINALLY223_tree, root_0);
            }
            pushFollow(FOLLOW_block_in_finallyBlock3079);
            block224=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block224.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "finallyBlock"

    public static class switchStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:915:1: switchStatement : SWITCH condition switchBlock ;
    public final AS3Parser.switchStatement_return switchStatement() throws RecognitionException {
        AS3Parser.switchStatement_return retval = new AS3Parser.switchStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token SWITCH225=null;
        AS3Parser.condition_return condition226 = null;

        AS3Parser.switchBlock_return switchBlock227 = null;


        LinkedListTree SWITCH225_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:916:2: ( SWITCH condition switchBlock )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:916:4: SWITCH condition switchBlock
            {
            root_0 = (LinkedListTree)adaptor.nil();

            SWITCH225=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement3094); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH225_tree = (LinkedListTree)adaptor.create(SWITCH225);
            root_0 = (LinkedListTree)adaptor.becomeRoot(SWITCH225_tree, root_0);
            }
            pushFollow(FOLLOW_condition_in_switchStatement3097);
            condition226=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition226.getTree());
            pushFollow(FOLLOW_switchBlock_in_switchStatement3101);
            switchBlock227=switchBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBlock227.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "switchStatement"

    public static class switchBlock_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchBlock"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:920:1: switchBlock : LBRACE ( caseStatement )* ( defaultStatement )? RBRACE -> ^( BLOCK ( caseStatement )* ( defaultStatement )? ) ;
    public final AS3Parser.switchBlock_return switchBlock() throws RecognitionException {
        AS3Parser.switchBlock_return retval = new AS3Parser.switchBlock_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE228=null;
        Token RBRACE231=null;
        AS3Parser.caseStatement_return caseStatement229 = null;

        AS3Parser.defaultStatement_return defaultStatement230 = null;


        LinkedListTree LBRACE228_tree=null;
        LinkedListTree RBRACE231_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_caseStatement=new RewriteRuleSubtreeStream(adaptor,"rule caseStatement");
        RewriteRuleSubtreeStream stream_defaultStatement=new RewriteRuleSubtreeStream(adaptor,"rule defaultStatement");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:921:2: ( LBRACE ( caseStatement )* ( defaultStatement )? RBRACE -> ^( BLOCK ( caseStatement )* ( defaultStatement )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:921:4: LBRACE ( caseStatement )* ( defaultStatement )? RBRACE
            {
            LBRACE228=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_switchBlock3112); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE228);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:922:3: ( caseStatement )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==CASE) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:922:5: caseStatement
            	    {
            	    pushFollow(FOLLOW_caseStatement_in_switchBlock3118);
            	    caseStatement229=caseStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseStatement.add(caseStatement229.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:923:3: ( defaultStatement )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==DEFAULT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:923:5: defaultStatement
                    {
                    pushFollow(FOLLOW_defaultStatement_in_switchBlock3127);
                    defaultStatement230=defaultStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defaultStatement.add(defaultStatement230.getTree());

                    }
                    break;

            }

            RBRACE231=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_switchBlock3134); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE231);



            // AST REWRITE
            // elements: defaultStatement, caseStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 925:3: -> ^( BLOCK ( caseStatement )* ( defaultStatement )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:925:6: ^( BLOCK ( caseStatement )* ( defaultStatement )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:925:15: ( caseStatement )*
                while ( stream_caseStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseStatement.nextTree());

                }
                stream_caseStatement.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:925:30: ( defaultStatement )?
                if ( stream_defaultStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultStatement.nextTree());

                }
                stream_defaultStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "switchBlock"

    public static class caseStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:928:1: caseStatement : CASE expression COLON l= switchStatementList ;
    public final AS3Parser.caseStatement_return caseStatement() throws RecognitionException {
        AS3Parser.caseStatement_return retval = new AS3Parser.caseStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token CASE232=null;
        Token COLON234=null;
        AS3Parser.switchStatementList_return l = null;

        AS3Parser.expression_return expression233 = null;


        LinkedListTree CASE232_tree=null;
        LinkedListTree COLON234_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:929:2: ( CASE expression COLON l= switchStatementList )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:929:4: CASE expression COLON l= switchStatementList
            {
            root_0 = (LinkedListTree)adaptor.nil();

            CASE232=(Token)match(input,CASE,FOLLOW_CASE_in_caseStatement3161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE232_tree = (LinkedListTree)adaptor.create(CASE232);
            root_0 = (LinkedListTree)adaptor.becomeRoot(CASE232_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_caseStatement3164);
            expression233=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression233.getTree());
            COLON234=(Token)match(input,COLON,FOLLOW_COLON_in_caseStatement3166); if (state.failed) return retval;
            pushFollow(FOLLOW_switchStatementList_in_caseStatement3171);
            l=switchStatementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());
            if ( state.backtracking==0 ) {
               placeholder((l!=null?((LinkedListTree)l.tree):null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "caseStatement"

    public static class defaultStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:932:1: defaultStatement : DEFAULT COLON l= switchStatementList ;
    public final AS3Parser.defaultStatement_return defaultStatement() throws RecognitionException {
        AS3Parser.defaultStatement_return retval = new AS3Parser.defaultStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token DEFAULT235=null;
        Token COLON236=null;
        AS3Parser.switchStatementList_return l = null;


        LinkedListTree DEFAULT235_tree=null;
        LinkedListTree COLON236_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:933:2: ( DEFAULT COLON l= switchStatementList )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:933:4: DEFAULT COLON l= switchStatementList
            {
            root_0 = (LinkedListTree)adaptor.nil();

            DEFAULT235=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStatement3185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT235_tree = (LinkedListTree)adaptor.create(DEFAULT235);
            root_0 = (LinkedListTree)adaptor.becomeRoot(DEFAULT235_tree, root_0);
            }
            COLON236=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStatement3188); if (state.failed) return retval;
            pushFollow(FOLLOW_switchStatementList_in_defaultStatement3193);
            l=switchStatementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());
            if ( state.backtracking==0 ) {
               placeholder((l!=null?((LinkedListTree)l.tree):null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "defaultStatement"

    public static class switchStatementList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatementList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:936:1: switchStatementList : ( statement )* -> ^( SWITCH_STATEMENT_LIST ( statement )* ) ;
    public final AS3Parser.switchStatementList_return switchStatementList() throws RecognitionException {
        AS3Parser.switchStatementList_return retval = new AS3Parser.switchStatementList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.statement_return statement237 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:937:2: ( ( statement )* -> ^( SWITCH_STATEMENT_LIST ( statement )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:937:4: ( statement )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:937:4: ( statement )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==DEFAULT) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==IDENT) ) {
                        alt54=1;
                    }


                }
                else if ( (LA54_0==LBRACE||(LA54_0>=SEMI && LA54_0<=IDENT)||LA54_0==LBRACK||LA54_0==LPAREN||(LA54_0>=INCLUDE && LA54_0<=IMPORT)||(LA54_0>=DYNAMIC && LA54_0<=FINAL)||LA54_0==OVERRIDE||(LA54_0>=STATIC && LA54_0<=NATIVE)||(LA54_0>=FUNCTION && LA54_0<=IF)||(LA54_0>=FOR && LA54_0<=EACH)||(LA54_0>=THROW && LA54_0<=TRY)||LA54_0==SWITCH||(LA54_0>=WHILE && LA54_0<=VOID)||(LA54_0>=PLUS && LA54_0<=MINUS)||(LA54_0>=INC && LA54_0<=BNOT)||(LA54_0>=UNDEFINED && LA54_0<=FLOAT_LITERAL)||LA54_0==E4X_ATTRI) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:937:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_switchStatementList3206);
            	    statement237=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement237.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 937:15: -> ^( SWITCH_STATEMENT_LIST ( statement )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:937:18: ^( SWITCH_STATEMENT_LIST ( statement )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(SWITCH_STATEMENT_LIST, "SWITCH_STATEMENT_LIST"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:937:43: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "switchStatementList"

    public static class whileStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:944:1: whileStatement : WHILE condition statement ;
    public final AS3Parser.whileStatement_return whileStatement() throws RecognitionException {
        AS3Parser.whileStatement_return retval = new AS3Parser.whileStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token WHILE238=null;
        AS3Parser.condition_return condition239 = null;

        AS3Parser.statement_return statement240 = null;


        LinkedListTree WHILE238_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:945:2: ( WHILE condition statement )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:945:4: WHILE condition statement
            {
            root_0 = (LinkedListTree)adaptor.nil();

            WHILE238=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement3233); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE238_tree = (LinkedListTree)adaptor.create(WHILE238);
            root_0 = (LinkedListTree)adaptor.becomeRoot(WHILE238_tree, root_0);
            }
            pushFollow(FOLLOW_condition_in_whileStatement3236);
            condition239=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition239.getTree());
            pushFollow(FOLLOW_statement_in_whileStatement3238);
            statement240=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement240.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class doWhileStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doWhileStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:948:1: doWhileStatement : DO statement WHILE condition semi ;
    public final AS3Parser.doWhileStatement_return doWhileStatement() throws RecognitionException {
        AS3Parser.doWhileStatement_return retval = new AS3Parser.doWhileStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token DO241=null;
        Token WHILE243=null;
        AS3Parser.statement_return statement242 = null;

        AS3Parser.condition_return condition244 = null;

        AS3Parser.semi_return semi245 = null;


        LinkedListTree DO241_tree=null;
        LinkedListTree WHILE243_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:949:2: ( DO statement WHILE condition semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:949:4: DO statement WHILE condition semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            DO241=(Token)match(input,DO,FOLLOW_DO_in_doWhileStatement3249); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DO241_tree = (LinkedListTree)adaptor.create(DO241);
            root_0 = (LinkedListTree)adaptor.becomeRoot(DO241_tree, root_0);
            }
            pushFollow(FOLLOW_statement_in_doWhileStatement3252);
            statement242=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement242.getTree());
            WHILE243=(Token)match(input,WHILE,FOLLOW_WHILE_in_doWhileStatement3254); if (state.failed) return retval;
            pushFollow(FOLLOW_condition_in_doWhileStatement3257);
            condition244=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition244.getTree());
            pushFollow(FOLLOW_semi_in_doWhileStatement3259);
            semi245=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi245.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "doWhileStatement"

    public static class withStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:956:1: withStatement : WITH condition statement ;
    public final AS3Parser.withStatement_return withStatement() throws RecognitionException {
        AS3Parser.withStatement_return retval = new AS3Parser.withStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token WITH246=null;
        AS3Parser.condition_return condition247 = null;

        AS3Parser.statement_return statement248 = null;


        LinkedListTree WITH246_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:957:2: ( WITH condition statement )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:957:4: WITH condition statement
            {
            root_0 = (LinkedListTree)adaptor.nil();

            WITH246=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement3274); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WITH246_tree = (LinkedListTree)adaptor.create(WITH246);
            root_0 = (LinkedListTree)adaptor.becomeRoot(WITH246_tree, root_0);
            }
            pushFollow(FOLLOW_condition_in_withStatement3277);
            condition247=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition247.getTree());
            pushFollow(FOLLOW_statement_in_withStatement3279);
            statement248=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement248.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "withStatement"

    public static class labelStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "labelStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:964:1: labelStatement : IDENT COLON statement -> ^( LABEL_STMNT IDENT statement ) ;
    public final AS3Parser.labelStatement_return labelStatement() throws RecognitionException {
        AS3Parser.labelStatement_return retval = new AS3Parser.labelStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IDENT249=null;
        Token COLON250=null;
        AS3Parser.statement_return statement251 = null;


        LinkedListTree IDENT249_tree=null;
        LinkedListTree COLON250_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:965:2: ( IDENT COLON statement -> ^( LABEL_STMNT IDENT statement ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:965:4: IDENT COLON statement
            {
            IDENT249=(Token)match(input,IDENT,FOLLOW_IDENT_in_labelStatement3294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT249);

            COLON250=(Token)match(input,COLON,FOLLOW_COLON_in_labelStatement3296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON250);

            pushFollow(FOLLOW_statement_in_labelStatement3298);
            statement251=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement251.getTree());


            // AST REWRITE
            // elements: statement, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 966:3: -> ^( LABEL_STMNT IDENT statement )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:966:6: ^( LABEL_STMNT IDENT statement )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(LABEL_STMNT, "LABEL_STMNT"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "labelStatement"

    public static class returnStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:973:1: returnStatement : RETURN ( expression )? semi ;
    public final AS3Parser.returnStatement_return returnStatement() throws RecognitionException {
        AS3Parser.returnStatement_return retval = new AS3Parser.returnStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token RETURN252=null;
        AS3Parser.expression_return expression253 = null;

        AS3Parser.semi_return semi254 = null;


        LinkedListTree RETURN252_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:974:2: ( RETURN ( expression )? semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:974:4: RETURN ( expression )? semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            RETURN252=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStatement3327); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RETURN252_tree = (LinkedListTree)adaptor.create(RETURN252);
            root_0 = (LinkedListTree)adaptor.becomeRoot(RETURN252_tree, root_0);
            }
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:974:12: ( expression )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LBRACE||LA55_0==IDENT||LA55_0==LBRACK||LA55_0==LPAREN||LA55_0==STRING_LITERAL||LA55_0==NAMESPACE||(LA55_0>=DYNAMIC && LA55_0<=FINAL)||LA55_0==OVERRIDE||(LA55_0>=STATIC && LA55_0<=NATIVE)||(LA55_0>=FUNCTION && LA55_0<=SET)||LA55_0==EACH||LA55_0==VOID||(LA55_0>=PLUS && LA55_0<=MINUS)||(LA55_0>=INC && LA55_0<=BNOT)||(LA55_0>=UNDEFINED && LA55_0<=FLOAT_LITERAL)||LA55_0==E4X_ATTRI) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:974:12: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement3330);
                    expression253=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression253.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semi_in_returnStatement3333);
            semi254=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi254.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    public static class continueStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:977:1: continueStatement : CONTINUE ( ident )? semi ;
    public final AS3Parser.continueStatement_return continueStatement() throws RecognitionException {
        AS3Parser.continueStatement_return retval = new AS3Parser.continueStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token CONTINUE255=null;
        AS3Parser.ident_return ident256 = null;

        AS3Parser.semi_return semi257 = null;


        LinkedListTree CONTINUE255_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:978:2: ( CONTINUE ( ident )? semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:978:4: CONTINUE ( ident )? semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            CONTINUE255=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement3344); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE255_tree = (LinkedListTree)adaptor.create(CONTINUE255);
            root_0 = (LinkedListTree)adaptor.becomeRoot(CONTINUE255_tree, root_0);
            }
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:978:14: ( ident )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENT||(LA56_0>=USE && LA56_0<=NAMESPACE)||LA56_0==DYNAMIC||(LA56_0>=GET && LA56_0<=SET)||(LA56_0>=IS && LA56_0<=AS)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:978:14: ident
                    {
                    pushFollow(FOLLOW_ident_in_continueStatement3347);
                    ident256=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident256.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semi_in_continueStatement3350);
            semi257=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi257.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "continueStatement"

    public static class breakStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:981:1: breakStatement : BREAK ( ident )? semi ;
    public final AS3Parser.breakStatement_return breakStatement() throws RecognitionException {
        AS3Parser.breakStatement_return retval = new AS3Parser.breakStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token BREAK258=null;
        AS3Parser.ident_return ident259 = null;

        AS3Parser.semi_return semi260 = null;


        LinkedListTree BREAK258_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:982:2: ( BREAK ( ident )? semi )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:982:4: BREAK ( ident )? semi
            {
            root_0 = (LinkedListTree)adaptor.nil();

            BREAK258=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStatement3361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK258_tree = (LinkedListTree)adaptor.create(BREAK258);
            root_0 = (LinkedListTree)adaptor.becomeRoot(BREAK258_tree, root_0);
            }
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:982:11: ( ident )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENT||(LA57_0>=USE && LA57_0<=NAMESPACE)||LA57_0==DYNAMIC||(LA57_0>=GET && LA57_0<=SET)||(LA57_0>=IS && LA57_0<=AS)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:982:11: ident
                    {
                    pushFollow(FOLLOW_ident_in_breakStatement3364);
                    ident259=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident259.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semi_in_breakStatement3367);
            semi260=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, semi260.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "breakStatement"

    public static class defaultXMLNamespaceStatement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultXMLNamespaceStatement"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:985:1: defaultXMLNamespaceStatement : DEFAULT xmlKeyword NAMESPACE ASSIGN expression semi -> ^( DEFAULT_XML_NAMESPACE expression ) ;
    public final AS3Parser.defaultXMLNamespaceStatement_return defaultXMLNamespaceStatement() throws RecognitionException {
        AS3Parser.defaultXMLNamespaceStatement_return retval = new AS3Parser.defaultXMLNamespaceStatement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token DEFAULT261=null;
        Token NAMESPACE263=null;
        Token ASSIGN264=null;
        AS3Parser.xmlKeyword_return xmlKeyword262 = null;

        AS3Parser.expression_return expression265 = null;

        AS3Parser.semi_return semi266 = null;


        LinkedListTree DEFAULT261_tree=null;
        LinkedListTree NAMESPACE263_tree=null;
        LinkedListTree ASSIGN264_tree=null;
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semi=new RewriteRuleSubtreeStream(adaptor,"rule semi");
        RewriteRuleSubtreeStream stream_xmlKeyword=new RewriteRuleSubtreeStream(adaptor,"rule xmlKeyword");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:986:2: ( DEFAULT xmlKeyword NAMESPACE ASSIGN expression semi -> ^( DEFAULT_XML_NAMESPACE expression ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:986:4: DEFAULT xmlKeyword NAMESPACE ASSIGN expression semi
            {
            DEFAULT261=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultXMLNamespaceStatement3378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT261);

            pushFollow(FOLLOW_xmlKeyword_in_defaultXMLNamespaceStatement3380);
            xmlKeyword262=xmlKeyword();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_xmlKeyword.add(xmlKeyword262.getTree());
            NAMESPACE263=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultXMLNamespaceStatement3382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAMESPACE.add(NAMESPACE263);

            ASSIGN264=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_defaultXMLNamespaceStatement3384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN264);

            pushFollow(FOLLOW_expression_in_defaultXMLNamespaceStatement3386);
            expression265=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression265.getTree());
            pushFollow(FOLLOW_semi_in_defaultXMLNamespaceStatement3388);
            semi266=semi();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semi.add(semi266.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 987:3: -> ^( DEFAULT_XML_NAMESPACE expression )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:987:6: ^( DEFAULT_XML_NAMESPACE expression )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(DEFAULT_XML_NAMESPACE, "DEFAULT_XML_NAMESPACE"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "defaultXMLNamespaceStatement"

    public static class typeExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:999:1: typeExpression : c= COLON type -> ^( TYPE_SPEC[$c] type ) ;
    public final AS3Parser.typeExpression_return typeExpression() throws RecognitionException {
        AS3Parser.typeExpression_return retval = new AS3Parser.typeExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token c=null;
        AS3Parser.type_return type267 = null;


        LinkedListTree c_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1000:2: (c= COLON type -> ^( TYPE_SPEC[$c] type ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1000:4: c= COLON type
            {
            c=(Token)match(input,COLON,FOLLOW_COLON_in_typeExpression3422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(c);

            pushFollow(FOLLOW_type_in_typeExpression3424);
            type267=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type267.getTree());


            // AST REWRITE
            // elements: type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1001:3: -> ^( TYPE_SPEC[$c] type )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1001:6: ^( TYPE_SPEC[$c] type )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(TYPE_SPEC, c), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "typeExpression"

    public static class type_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1004:1: type : ( qualifiedName | VOID | STAR ) -> ^( TYPE ( qualifiedName )? ( VOID )? ( STAR )? ) ;
    public final AS3Parser.type_return type() throws RecognitionException {
        AS3Parser.type_return retval = new AS3Parser.type_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token VOID269=null;
        Token STAR270=null;
        AS3Parser.qualifiedName_return qualifiedName268 = null;


        LinkedListTree VOID269_tree=null;
        LinkedListTree STAR270_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleSubtreeStream stream_qualifiedName=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedName");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1005:2: ( ( qualifiedName | VOID | STAR ) -> ^( TYPE ( qualifiedName )? ( VOID )? ( STAR )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1005:4: ( qualifiedName | VOID | STAR )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1005:4: ( qualifiedName | VOID | STAR )
            int alt58=3;
            switch ( input.LA(1) ) {
            case IDENT:
            case NAMESPACE:
            case DYNAMIC:
            case FINAL:
            case INTERNAL:
            case OVERRIDE:
            case STATIC:
            case NATIVE:
            case GET:
            case SET:
            case EACH:
            case DEFAULT:
                {
                alt58=1;
                }
                break;
            case VOID:
                {
                alt58=2;
                }
                break;
            case STAR:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1005:6: qualifiedName
                    {
                    pushFollow(FOLLOW_qualifiedName_in_type3452);
                    qualifiedName268=qualifiedName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualifiedName.add(qualifiedName268.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1005:22: VOID
                    {
                    VOID269=(Token)match(input,VOID,FOLLOW_VOID_in_type3456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID269);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1005:29: STAR
                    {
                    STAR270=(Token)match(input,STAR,FOLLOW_STAR_in_type3460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR270);


                    }
                    break;

            }



            // AST REWRITE
            // elements: VOID, qualifiedName, STAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1006:3: -> ^( TYPE ( qualifiedName )? ( VOID )? ( STAR )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1006:6: ^( TYPE ( qualifiedName )? ( VOID )? ( STAR )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(TYPE, "TYPE"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1006:14: ( qualifiedName )?
                if ( stream_qualifiedName.hasNext() ) {
                    adaptor.addChild(root_1, stream_qualifiedName.nextTree());

                }
                stream_qualifiedName.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1006:29: ( VOID )?
                if ( stream_VOID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VOID.nextNode());

                }
                stream_VOID.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1006:35: ( STAR )?
                if ( stream_STAR.hasNext() ) {
                    adaptor.addChild(root_1, stream_STAR.nextNode());

                }
                stream_STAR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class qualifiedName_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedName"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1009:1: qualifiedName : standardQualifiedName ( typePostfixSyntax )? ;
    public final AS3Parser.qualifiedName_return qualifiedName() throws RecognitionException {
        AS3Parser.qualifiedName_return retval = new AS3Parser.qualifiedName_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.standardQualifiedName_return standardQualifiedName271 = null;

        AS3Parser.typePostfixSyntax_return typePostfixSyntax272 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1010:2: ( standardQualifiedName ( typePostfixSyntax )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1010:4: standardQualifiedName ( typePostfixSyntax )?
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_standardQualifiedName_in_qualifiedName3492);
            standardQualifiedName271=standardQualifiedName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, standardQualifiedName271.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1010:26: ( typePostfixSyntax )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==POST) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1010:28: typePostfixSyntax
                    {
                    pushFollow(FOLLOW_typePostfixSyntax_in_qualifiedName3496);
                    typePostfixSyntax272=typePostfixSyntax();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typePostfixSyntax272.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "qualifiedName"

    public static class standardQualifiedName_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "standardQualifiedName"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1013:1: standardQualifiedName : typeSpecifier ( DOT typeSpecifier )* ;
    public final AS3Parser.standardQualifiedName_return standardQualifiedName() throws RecognitionException {
        AS3Parser.standardQualifiedName_return retval = new AS3Parser.standardQualifiedName_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token DOT274=null;
        AS3Parser.typeSpecifier_return typeSpecifier273 = null;

        AS3Parser.typeSpecifier_return typeSpecifier275 = null;


        LinkedListTree DOT274_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1014:2: ( typeSpecifier ( DOT typeSpecifier )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1014:4: typeSpecifier ( DOT typeSpecifier )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_typeSpecifier_in_standardQualifiedName3511);
            typeSpecifier273=typeSpecifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeSpecifier273.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1014:18: ( DOT typeSpecifier )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==DOT) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==IDENT||LA60_2==NAMESPACE||(LA60_2>=DYNAMIC && LA60_2<=OVERRIDE)||(LA60_2>=STATIC && LA60_2<=NATIVE)||(LA60_2>=GET && LA60_2<=SET)||LA60_2==EACH||LA60_2==DEFAULT) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1014:20: DOT typeSpecifier
            	    {
            	    DOT274=(Token)match(input,DOT,FOLLOW_DOT_in_standardQualifiedName3515); if (state.failed) return retval;
            	    pushFollow(FOLLOW_typeSpecifier_in_standardQualifiedName3518);
            	    typeSpecifier275=typeSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeSpecifier275.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "standardQualifiedName"

    public static class typeSpecifier_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeSpecifier"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1017:1: typeSpecifier : ( IDENT | notQuiteReservedWord | INTERNAL | DEFAULT );
    public final AS3Parser.typeSpecifier_return typeSpecifier() throws RecognitionException {
        AS3Parser.typeSpecifier_return retval = new AS3Parser.typeSpecifier_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IDENT276=null;
        Token INTERNAL278=null;
        Token DEFAULT279=null;
        AS3Parser.notQuiteReservedWord_return notQuiteReservedWord277 = null;


        LinkedListTree IDENT276_tree=null;
        LinkedListTree INTERNAL278_tree=null;
        LinkedListTree DEFAULT279_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1017:14: ( IDENT | notQuiteReservedWord | INTERNAL | DEFAULT )
            int alt61=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt61=1;
                }
                break;
            case NAMESPACE:
            case DYNAMIC:
            case FINAL:
            case OVERRIDE:
            case STATIC:
            case NATIVE:
            case GET:
            case SET:
            case EACH:
                {
                alt61=2;
                }
                break;
            case INTERNAL:
                {
                alt61=3;
                }
                break;
            case DEFAULT:
                {
                alt61=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1018:2: IDENT
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    IDENT276=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeSpecifier3531); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT276_tree = (LinkedListTree)adaptor.create(IDENT276);
                    adaptor.addChild(root_0, IDENT276_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1018:10: notQuiteReservedWord
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_notQuiteReservedWord_in_typeSpecifier3535);
                    notQuiteReservedWord277=notQuiteReservedWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notQuiteReservedWord277.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1018:33: INTERNAL
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    INTERNAL278=(Token)match(input,INTERNAL,FOLLOW_INTERNAL_in_typeSpecifier3539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNAL278_tree = (LinkedListTree)adaptor.create(INTERNAL278);
                    adaptor.addChild(root_0, INTERNAL278_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1018:44: DEFAULT
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    DEFAULT279=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_typeSpecifier3543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT279_tree = (LinkedListTree)adaptor.create(DEFAULT279);
                    adaptor.addChild(root_0, DEFAULT279_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "typeSpecifier"

    public static class namespaceName_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespaceName"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1025:1: namespaceName : ( IDENT | reservedNamespace );
    public final AS3Parser.namespaceName_return namespaceName() throws RecognitionException {
        AS3Parser.namespaceName_return retval = new AS3Parser.namespaceName_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IDENT280=null;
        AS3Parser.reservedNamespace_return reservedNamespace281 = null;


        LinkedListTree IDENT280_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1026:2: ( IDENT | reservedNamespace )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENT) ) {
                alt62=1;
            }
            else if ( (LA62_0==INTERNAL||(LA62_0>=PRIVATE && LA62_0<=PUBLIC)) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1026:4: IDENT
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    IDENT280=(Token)match(input,IDENT,FOLLOW_IDENT_in_namespaceName3558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT280_tree = (LinkedListTree)adaptor.create(IDENT280);
                    adaptor.addChild(root_0, IDENT280_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1026:12: reservedNamespace
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_reservedNamespace_in_namespaceName3562);
                    reservedNamespace281=reservedNamespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reservedNamespace281.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "namespaceName"

    public static class reservedNamespace_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reservedNamespace"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1029:1: reservedNamespace : ( PUBLIC | PRIVATE | PROTECTED | INTERNAL );
    public final AS3Parser.reservedNamespace_return reservedNamespace() throws RecognitionException {
        AS3Parser.reservedNamespace_return retval = new AS3Parser.reservedNamespace_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set282=null;

        LinkedListTree set282_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1030:2: ( PUBLIC | PRIVATE | PROTECTED | INTERNAL )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set282=(Token)input.LT(1);
            if ( input.LA(1)==INTERNAL||(input.LA(1)>=PRIVATE && input.LA(1)<=PUBLIC) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set282));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "reservedNamespace"

    public static class typePostfixSyntax_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typePostfixSyntax"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1036:1: typePostfixSyntax : POST ( standardQualifiedName | STAR ) ( typePostfixSyntax )? GT -> ^( TYPE_POSTFIX ( standardQualifiedName )? ( STAR )? ( typePostfixSyntax )? ) ;
    public final AS3Parser.typePostfixSyntax_return typePostfixSyntax() throws RecognitionException {
        AS3Parser.typePostfixSyntax_return retval = new AS3Parser.typePostfixSyntax_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token POST283=null;
        Token STAR285=null;
        Token GT287=null;
        AS3Parser.standardQualifiedName_return standardQualifiedName284 = null;

        AS3Parser.typePostfixSyntax_return typePostfixSyntax286 = null;


        LinkedListTree POST283_tree=null;
        LinkedListTree STAR285_tree=null;
        LinkedListTree GT287_tree=null;
        RewriteRuleTokenStream stream_POST=new RewriteRuleTokenStream(adaptor,"token POST");
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleSubtreeStream stream_standardQualifiedName=new RewriteRuleSubtreeStream(adaptor,"rule standardQualifiedName");
        RewriteRuleSubtreeStream stream_typePostfixSyntax=new RewriteRuleSubtreeStream(adaptor,"rule typePostfixSyntax");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1037:2: ( POST ( standardQualifiedName | STAR ) ( typePostfixSyntax )? GT -> ^( TYPE_POSTFIX ( standardQualifiedName )? ( STAR )? ( typePostfixSyntax )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1037:4: POST ( standardQualifiedName | STAR ) ( typePostfixSyntax )? GT
            {
            POST283=(Token)match(input,POST,FOLLOW_POST_in_typePostfixSyntax3599); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POST.add(POST283);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1037:9: ( standardQualifiedName | STAR )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDENT||LA63_0==NAMESPACE||(LA63_0>=DYNAMIC && LA63_0<=OVERRIDE)||(LA63_0>=STATIC && LA63_0<=NATIVE)||(LA63_0>=GET && LA63_0<=SET)||LA63_0==EACH||LA63_0==DEFAULT) ) {
                alt63=1;
            }
            else if ( (LA63_0==STAR) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1037:11: standardQualifiedName
                    {
                    pushFollow(FOLLOW_standardQualifiedName_in_typePostfixSyntax3603);
                    standardQualifiedName284=standardQualifiedName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_standardQualifiedName.add(standardQualifiedName284.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1037:35: STAR
                    {
                    STAR285=(Token)match(input,STAR,FOLLOW_STAR_in_typePostfixSyntax3607); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR285);


                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1037:42: ( typePostfixSyntax )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==POST) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1037:44: typePostfixSyntax
                    {
                    pushFollow(FOLLOW_typePostfixSyntax_in_typePostfixSyntax3613);
                    typePostfixSyntax286=typePostfixSyntax();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typePostfixSyntax.add(typePostfixSyntax286.getTree());

                    }
                    break;

            }

            GT287=(Token)match(input,GT,FOLLOW_GT_in_typePostfixSyntax3618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GT.add(GT287);



            // AST REWRITE
            // elements: typePostfixSyntax, STAR, standardQualifiedName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1038:3: -> ^( TYPE_POSTFIX ( standardQualifiedName )? ( STAR )? ( typePostfixSyntax )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1038:6: ^( TYPE_POSTFIX ( standardQualifiedName )? ( STAR )? ( typePostfixSyntax )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(TYPE_POSTFIX, "TYPE_POSTFIX"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1038:22: ( standardQualifiedName )?
                if ( stream_standardQualifiedName.hasNext() ) {
                    adaptor.addChild(root_1, stream_standardQualifiedName.nextTree());

                }
                stream_standardQualifiedName.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1038:45: ( STAR )?
                if ( stream_STAR.hasNext() ) {
                    adaptor.addChild(root_1, stream_STAR.nextNode());

                }
                stream_STAR.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1038:51: ( typePostfixSyntax )?
                if ( stream_typePostfixSyntax.hasNext() ) {
                    adaptor.addChild(root_1, stream_typePostfixSyntax.nextTree());

                }
                stream_typePostfixSyntax.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "typePostfixSyntax"

    public static class ident_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ident"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1041:1: ident : ( IDENT | i= USE -> IDENT[$i] | xmlKeyword | i= DYNAMIC -> IDENT[$i] | i= NAMESPACE -> IDENT[$i] | i= IS -> IDENT[$i] | i= AS -> IDENT[$i] | i= GET -> IDENT[$i] | i= SET -> IDENT[$i] );
    public final AS3Parser.ident_return ident() throws RecognitionException {
        AS3Parser.ident_return retval = new AS3Parser.ident_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token i=null;
        Token IDENT288=null;
        AS3Parser.xmlKeyword_return xmlKeyword289 = null;


        LinkedListTree i_tree=null;
        LinkedListTree IDENT288_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_NAMESPACE=new RewriteRuleTokenStream(adaptor,"token NAMESPACE");
        RewriteRuleTokenStream stream_DYNAMIC=new RewriteRuleTokenStream(adaptor,"token DYNAMIC");

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1042:2: ( IDENT | i= USE -> IDENT[$i] | xmlKeyword | i= DYNAMIC -> IDENT[$i] | i= NAMESPACE -> IDENT[$i] | i= IS -> IDENT[$i] | i= AS -> IDENT[$i] | i= GET -> IDENT[$i] | i= SET -> IDENT[$i] )
            int alt65=9;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1042:4: IDENT
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    IDENT288=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident3648); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT288_tree = (LinkedListTree)adaptor.create(IDENT288);
                    adaptor.addChild(root_0, IDENT288_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1043:4: i= USE
                    {
                    i=(Token)match(input,USE,FOLLOW_USE_in_ident3655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE.add(i);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1043:10: -> IDENT[$i]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1044:4: xmlKeyword
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlKeyword_in_ident3665);
                    xmlKeyword289=xmlKeyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, xmlKeyword289.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1045:4: i= DYNAMIC
                    {
                    i=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_ident3673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DYNAMIC.add(i);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1045:14: -> IDENT[$i]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1046:4: i= NAMESPACE
                    {
                    i=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_ident3685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE.add(i);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1046:16: -> IDENT[$i]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1047:4: i= IS
                    {
                    i=(Token)match(input,IS,FOLLOW_IS_in_ident3697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(i);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1047:9: -> IDENT[$i]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1048:4: i= AS
                    {
                    i=(Token)match(input,AS,FOLLOW_AS_in_ident3709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS.add(i);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1048:9: -> IDENT[$i]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1049:4: i= GET
                    {
                    i=(Token)match(input,GET,FOLLOW_GET_in_ident3721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GET.add(i);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1049:10: -> IDENT[$i]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1050:4: i= SET
                    {
                    i=(Token)match(input,SET,FOLLOW_SET_in_ident3733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(i);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1050:10: -> IDENT[$i]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(IDENT, i));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "ident"

    public static class expression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1059:1: expression : assignmentExpression ;
    public final AS3Parser.expression_return expression() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.expression_return retval = new AS3Parser.expression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.assignmentExpression_return assignmentExpression290 = null;




        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1064:2: ( assignmentExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1064:4: assignmentExpression
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_expression3765);
            assignmentExpression290=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression290.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expressionList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1068:1: expressionList : assignmentExpression ( COMMA assignmentExpression )* -> ( assignmentExpression )+ ;
    public final AS3Parser.expressionList_return expressionList() throws RecognitionException {
        AS3Parser.expressionList_return retval = new AS3Parser.expressionList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COMMA292=null;
        AS3Parser.assignmentExpression_return assignmentExpression291 = null;

        AS3Parser.assignmentExpression_return assignmentExpression293 = null;


        LinkedListTree COMMA292_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1069:2: ( assignmentExpression ( COMMA assignmentExpression )* -> ( assignmentExpression )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1069:4: assignmentExpression ( COMMA assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expressionList3777);
            assignmentExpression291=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression291.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1069:25: ( COMMA assignmentExpression )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==COMMA) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1069:27: COMMA assignmentExpression
            	    {
            	    COMMA292=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList3781); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA292);

            	    pushFollow(FOLLOW_assignmentExpression_in_expressionList3783);
            	    assignmentExpression293=assignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression293.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);



            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1070:3: -> ( assignmentExpression )+
            {
                if ( !(stream_assignmentExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_0, stream_assignmentExpression.nextTree());

                }
                stream_assignmentExpression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1076:1: assignmentExpression : conditionalExpression ( ( assignmentOperator )=>o= assignmentOperator assignmentExpression )* ;
    public final AS3Parser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        AS3Parser.assignmentExpression_return retval = new AS3Parser.assignmentExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.assignmentOperator_return o = null;

        AS3Parser.conditionalExpression_return conditionalExpression294 = null;

        AS3Parser.assignmentExpression_return assignmentExpression295 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1077:2: ( conditionalExpression ( ( assignmentOperator )=>o= assignmentOperator assignmentExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1077:4: conditionalExpression ( ( assignmentOperator )=>o= assignmentOperator assignmentExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression3807);
            conditionalExpression294=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression294.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1077:26: ( ( assignmentOperator )=>o= assignmentOperator assignmentExpression )*
            loop67:
            do {
                int alt67=2;
                alt67 = dfa67.predict(input);
                switch (alt67) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1077:28: ( assignmentOperator )=>o= assignmentOperator assignmentExpression
            	    {
            	    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression3822);
            	    o=assignmentOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression3825);
            	    assignmentExpression295=assignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression295.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1086:1: assignmentOperator : ( ASSIGN | ( ( '*' '=' )=> '*' '=' -> STAR_ASSIGN[\"*=\"] ) | DIV_ASSIGN | MOD_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | SL_ASSIGN | ( ( '>' '>' '=' )=> '>' '>' '=' -> SR_ASSIGN[\">>=\"] ) | ( ( '>' '>' '>' '=' )=> '>' '>' '>' '=' -> BSR_ASSIGN[\">>>=\"] ) | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LAND_ASSIGN | LOR_ASSIGN );
    public final AS3Parser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        AS3Parser.assignmentOperator_return retval = new AS3Parser.assignmentOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token ASSIGN296=null;
        Token char_literal297=null;
        Token char_literal298=null;
        Token DIV_ASSIGN299=null;
        Token MOD_ASSIGN300=null;
        Token PLUS_ASSIGN301=null;
        Token MINUS_ASSIGN302=null;
        Token SL_ASSIGN303=null;
        Token char_literal304=null;
        Token char_literal305=null;
        Token char_literal306=null;
        Token char_literal307=null;
        Token char_literal308=null;
        Token char_literal309=null;
        Token char_literal310=null;
        Token BAND_ASSIGN311=null;
        Token BXOR_ASSIGN312=null;
        Token BOR_ASSIGN313=null;
        Token LAND_ASSIGN314=null;
        Token LOR_ASSIGN315=null;

        LinkedListTree ASSIGN296_tree=null;
        LinkedListTree char_literal297_tree=null;
        LinkedListTree char_literal298_tree=null;
        LinkedListTree DIV_ASSIGN299_tree=null;
        LinkedListTree MOD_ASSIGN300_tree=null;
        LinkedListTree PLUS_ASSIGN301_tree=null;
        LinkedListTree MINUS_ASSIGN302_tree=null;
        LinkedListTree SL_ASSIGN303_tree=null;
        LinkedListTree char_literal304_tree=null;
        LinkedListTree char_literal305_tree=null;
        LinkedListTree char_literal306_tree=null;
        LinkedListTree char_literal307_tree=null;
        LinkedListTree char_literal308_tree=null;
        LinkedListTree char_literal309_tree=null;
        LinkedListTree char_literal310_tree=null;
        LinkedListTree BAND_ASSIGN311_tree=null;
        LinkedListTree BXOR_ASSIGN312_tree=null;
        LinkedListTree BOR_ASSIGN313_tree=null;
        LinkedListTree LAND_ASSIGN314_tree=null;
        LinkedListTree LOR_ASSIGN315_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1087:2: ( ASSIGN | ( ( '*' '=' )=> '*' '=' -> STAR_ASSIGN[\"*=\"] ) | DIV_ASSIGN | MOD_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | SL_ASSIGN | ( ( '>' '>' '=' )=> '>' '>' '=' -> SR_ASSIGN[\">>=\"] ) | ( ( '>' '>' '>' '=' )=> '>' '>' '>' '=' -> BSR_ASSIGN[\">>>=\"] ) | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LAND_ASSIGN | LOR_ASSIGN )
            int alt68=14;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1087:5: ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    ASSIGN296=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentOperator3847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN296_tree = (LinkedListTree)adaptor.create(ASSIGN296);
                    adaptor.addChild(root_0, ASSIGN296_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1089:4: ( ( '*' '=' )=> '*' '=' -> STAR_ASSIGN[\"*=\"] )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1089:4: ( ( '*' '=' )=> '*' '=' -> STAR_ASSIGN[\"*=\"] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1089:6: ( '*' '=' )=> '*' '='
                    {
                    char_literal297=(Token)match(input,STAR,FOLLOW_STAR_in_assignmentOperator3862); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(char_literal297);

                    char_literal298=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentOperator3864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal298);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1089:26: -> STAR_ASSIGN[\"*=\"]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(STAR_ASSIGN, "*="));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1090:4: DIV_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    DIV_ASSIGN299=(Token)match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_assignmentOperator3875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIV_ASSIGN299_tree = (LinkedListTree)adaptor.create(DIV_ASSIGN299);
                    adaptor.addChild(root_0, DIV_ASSIGN299_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1091:4: MOD_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    MOD_ASSIGN300=(Token)match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_assignmentOperator3880); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MOD_ASSIGN300_tree = (LinkedListTree)adaptor.create(MOD_ASSIGN300);
                    adaptor.addChild(root_0, MOD_ASSIGN300_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1092:4: PLUS_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    PLUS_ASSIGN301=(Token)match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_assignmentOperator3885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS_ASSIGN301_tree = (LinkedListTree)adaptor.create(PLUS_ASSIGN301);
                    adaptor.addChild(root_0, PLUS_ASSIGN301_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1093:4: MINUS_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    MINUS_ASSIGN302=(Token)match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_assignmentOperator3890); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS_ASSIGN302_tree = (LinkedListTree)adaptor.create(MINUS_ASSIGN302);
                    adaptor.addChild(root_0, MINUS_ASSIGN302_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1094:4: SL_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    SL_ASSIGN303=(Token)match(input,SL_ASSIGN,FOLLOW_SL_ASSIGN_in_assignmentOperator3895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SL_ASSIGN303_tree = (LinkedListTree)adaptor.create(SL_ASSIGN303);
                    adaptor.addChild(root_0, SL_ASSIGN303_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1097:4: ( ( '>' '>' '=' )=> '>' '>' '=' -> SR_ASSIGN[\">>=\"] )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1097:4: ( ( '>' '>' '=' )=> '>' '>' '=' -> SR_ASSIGN[\">>=\"] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1097:6: ( '>' '>' '=' )=> '>' '>' '='
                    {
                    char_literal304=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator3913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal304);

                    char_literal305=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator3915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal305);

                    char_literal306=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentOperator3917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal306);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1097:34: -> SR_ASSIGN[\">>=\"]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(SR_ASSIGN, ">>="));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 9 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1098:4: ( ( '>' '>' '>' '=' )=> '>' '>' '>' '=' -> BSR_ASSIGN[\">>>=\"] )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1098:4: ( ( '>' '>' '>' '=' )=> '>' '>' '>' '=' -> BSR_ASSIGN[\">>>=\"] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1098:6: ( '>' '>' '>' '=' )=> '>' '>' '>' '='
                    {
                    char_literal307=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator3943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal307);

                    char_literal308=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator3945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal308);

                    char_literal309=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator3947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal309);

                    char_literal310=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentOperator3949); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal310);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1098:42: -> BSR_ASSIGN[\">>>=\"]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(BSR_ASSIGN, ">>>="));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 10 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1099:4: BAND_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    BAND_ASSIGN311=(Token)match(input,BAND_ASSIGN,FOLLOW_BAND_ASSIGN_in_assignmentOperator3961); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BAND_ASSIGN311_tree = (LinkedListTree)adaptor.create(BAND_ASSIGN311);
                    adaptor.addChild(root_0, BAND_ASSIGN311_tree);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1100:4: BXOR_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    BXOR_ASSIGN312=(Token)match(input,BXOR_ASSIGN,FOLLOW_BXOR_ASSIGN_in_assignmentOperator3966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BXOR_ASSIGN312_tree = (LinkedListTree)adaptor.create(BXOR_ASSIGN312);
                    adaptor.addChild(root_0, BXOR_ASSIGN312_tree);
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1101:4: BOR_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    BOR_ASSIGN313=(Token)match(input,BOR_ASSIGN,FOLLOW_BOR_ASSIGN_in_assignmentOperator3971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOR_ASSIGN313_tree = (LinkedListTree)adaptor.create(BOR_ASSIGN313);
                    adaptor.addChild(root_0, BOR_ASSIGN313_tree);
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1102:4: LAND_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    LAND_ASSIGN314=(Token)match(input,LAND_ASSIGN,FOLLOW_LAND_ASSIGN_in_assignmentOperator3976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LAND_ASSIGN314_tree = (LinkedListTree)adaptor.create(LAND_ASSIGN314);
                    adaptor.addChild(root_0, LAND_ASSIGN314_tree);
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1103:4: LOR_ASSIGN
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    LOR_ASSIGN315=(Token)match(input,LOR_ASSIGN,FOLLOW_LOR_ASSIGN_in_assignmentOperator3981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOR_ASSIGN315_tree = (LinkedListTree)adaptor.create(LOR_ASSIGN315);
                    adaptor.addChild(root_0, LOR_ASSIGN315_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1108:1: conditionalExpression : ( logicalOrExpression -> logicalOrExpression ) ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )? ;
    public final AS3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        AS3Parser.conditionalExpression_return retval = new AS3Parser.conditionalExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token QUESTION317=null;
        AS3Parser.logicalOrExpression_return logicalOrExpression316 = null;

        AS3Parser.conditionalSubExpression_return conditionalSubExpression318 = null;


        LinkedListTree QUESTION317_tree=null;
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_logicalOrExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalOrExpression");
        RewriteRuleSubtreeStream stream_conditionalSubExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalSubExpression");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1109:2: ( ( logicalOrExpression -> logicalOrExpression ) ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1109:4: ( logicalOrExpression -> logicalOrExpression ) ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1109:4: ( logicalOrExpression -> logicalOrExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1109:6: logicalOrExpression
            {
            pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression3996);
            logicalOrExpression316=logicalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalOrExpression.add(logicalOrExpression316.getTree());


            // AST REWRITE
            // elements: logicalOrExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1109:26: -> logicalOrExpression
            {
                adaptor.addChild(root_0, stream_logicalOrExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1110:3: ( QUESTION conditionalSubExpression -> ^( QUESTION $conditionalExpression conditionalSubExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==QUESTION) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1111:4: QUESTION conditionalSubExpression
                    {
                    QUESTION317=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression4011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION317);

                    pushFollow(FOLLOW_conditionalSubExpression_in_conditionalExpression4013);
                    conditionalSubExpression318=conditionalSubExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditionalSubExpression.add(conditionalSubExpression318.getTree());


                    // AST REWRITE
                    // elements: QUESTION, conditionalExpression, conditionalSubExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1112:4: -> ^( QUESTION $conditionalExpression conditionalSubExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1112:7: ^( QUESTION $conditionalExpression conditionalSubExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_QUESTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_conditionalSubExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalSubExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalSubExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1117:1: conditionalSubExpression : assignmentExpression COLON assignmentExpression ;
    public final AS3Parser.conditionalSubExpression_return conditionalSubExpression() throws RecognitionException {
        AS3Parser.conditionalSubExpression_return retval = new AS3Parser.conditionalSubExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COLON320=null;
        AS3Parser.assignmentExpression_return assignmentExpression319 = null;

        AS3Parser.assignmentExpression_return assignmentExpression321 = null;


        LinkedListTree COLON320_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1118:2: ( assignmentExpression COLON assignmentExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1118:4: assignmentExpression COLON assignmentExpression
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_conditionalSubExpression4046);
            assignmentExpression319=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression319.getTree());
            COLON320=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalSubExpression4048); if (state.failed) return retval;
            pushFollow(FOLLOW_assignmentExpression_in_conditionalSubExpression4051);
            assignmentExpression321=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression321.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalSubExpression"

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalOrExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1123:1: logicalOrExpression : logicalAndExpression (o= logicalOrOperator logicalAndExpression )* ;
    public final AS3Parser.logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        AS3Parser.logicalOrExpression_return retval = new AS3Parser.logicalOrExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.logicalOrOperator_return o = null;

        AS3Parser.logicalAndExpression_return logicalAndExpression322 = null;

        AS3Parser.logicalAndExpression_return logicalAndExpression323 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1124:2: ( logicalAndExpression (o= logicalOrOperator logicalAndExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1124:4: logicalAndExpression (o= logicalOrOperator logicalAndExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression4064);
            logicalAndExpression322=logicalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression322.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1125:3: (o= logicalOrOperator logicalAndExpression )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==LOR) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1125:5: o= logicalOrOperator logicalAndExpression
            	    {
            	    pushFollow(FOLLOW_logicalOrOperator_in_logicalOrExpression4072);
            	    o=logicalOrOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression4075);
            	    logicalAndExpression323=logicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression323.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "logicalOrExpression"

    public static class logicalOrOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalOrOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1129:1: logicalOrOperator : LOR ;
    public final AS3Parser.logicalOrOperator_return logicalOrOperator() throws RecognitionException {
        AS3Parser.logicalOrOperator_return retval = new AS3Parser.logicalOrOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LOR324=null;

        LinkedListTree LOR324_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1130:2: ( LOR )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1130:4: LOR
            {
            root_0 = (LinkedListTree)adaptor.nil();

            LOR324=(Token)match(input,LOR,FOLLOW_LOR_in_logicalOrOperator4092); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOR324_tree = (LinkedListTree)adaptor.create(LOR324);
            adaptor.addChild(root_0, LOR324_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "logicalOrOperator"

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalAndExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1134:1: logicalAndExpression : bitwiseOrExpression (o= logicalAndOperator bitwiseOrExpression )* ;
    public final AS3Parser.logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        AS3Parser.logicalAndExpression_return retval = new AS3Parser.logicalAndExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.logicalAndOperator_return o = null;

        AS3Parser.bitwiseOrExpression_return bitwiseOrExpression325 = null;

        AS3Parser.bitwiseOrExpression_return bitwiseOrExpression326 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1135:2: ( bitwiseOrExpression (o= logicalAndOperator bitwiseOrExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1135:4: bitwiseOrExpression (o= logicalAndOperator bitwiseOrExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression4104);
            bitwiseOrExpression325=bitwiseOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOrExpression325.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1136:3: (o= logicalAndOperator bitwiseOrExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==LAND) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1136:5: o= logicalAndOperator bitwiseOrExpression
            	    {
            	    pushFollow(FOLLOW_logicalAndOperator_in_logicalAndExpression4112);
            	    o=logicalAndOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression4115);
            	    bitwiseOrExpression326=bitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOrExpression326.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "logicalAndExpression"

    public static class logicalAndOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalAndOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1139:1: logicalAndOperator : LAND ;
    public final AS3Parser.logicalAndOperator_return logicalAndOperator() throws RecognitionException {
        AS3Parser.logicalAndOperator_return retval = new AS3Parser.logicalAndOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LAND327=null;

        LinkedListTree LAND327_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1140:2: ( LAND )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1140:4: LAND
            {
            root_0 = (LinkedListTree)adaptor.nil();

            LAND327=(Token)match(input,LAND,FOLLOW_LAND_in_logicalAndOperator4131); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LAND327_tree = (LinkedListTree)adaptor.create(LAND327);
            adaptor.addChild(root_0, LAND327_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "logicalAndOperator"

    public static class bitwiseOrExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseOrExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1145:1: bitwiseOrExpression : bitwiseXorExpression (o= BOR bitwiseXorExpression )* ;
    public final AS3Parser.bitwiseOrExpression_return bitwiseOrExpression() throws RecognitionException {
        AS3Parser.bitwiseOrExpression_return retval = new AS3Parser.bitwiseOrExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token o=null;
        AS3Parser.bitwiseXorExpression_return bitwiseXorExpression328 = null;

        AS3Parser.bitwiseXorExpression_return bitwiseXorExpression329 = null;


        LinkedListTree o_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1146:2: ( bitwiseXorExpression (o= BOR bitwiseXorExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1146:4: bitwiseXorExpression (o= BOR bitwiseXorExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression4144);
            bitwiseXorExpression328=bitwiseXorExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXorExpression328.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1147:3: (o= BOR bitwiseXorExpression )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==BOR) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1147:5: o= BOR bitwiseXorExpression
            	    {
            	    o=(Token)match(input,BOR,FOLLOW_BOR_in_bitwiseOrExpression4152); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    o_tree = (LinkedListTree)adaptor.create(o);
            	    root_0 = (LinkedListTree)adaptor.becomeRoot(o_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression4155);
            	    bitwiseXorExpression329=bitwiseXorExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXorExpression329.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate(o_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseOrExpression"

    public static class bitwiseXorExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXorExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1152:1: bitwiseXorExpression : bitwiseAndExpression (o= BXOR bitwiseAndExpression )* ;
    public final AS3Parser.bitwiseXorExpression_return bitwiseXorExpression() throws RecognitionException {
        AS3Parser.bitwiseXorExpression_return retval = new AS3Parser.bitwiseXorExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token o=null;
        AS3Parser.bitwiseAndExpression_return bitwiseAndExpression330 = null;

        AS3Parser.bitwiseAndExpression_return bitwiseAndExpression331 = null;


        LinkedListTree o_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1153:2: ( bitwiseAndExpression (o= BXOR bitwiseAndExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1153:4: bitwiseAndExpression (o= BXOR bitwiseAndExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression4173);
            bitwiseAndExpression330=bitwiseAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAndExpression330.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1154:3: (o= BXOR bitwiseAndExpression )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==BXOR) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1154:5: o= BXOR bitwiseAndExpression
            	    {
            	    o=(Token)match(input,BXOR,FOLLOW_BXOR_in_bitwiseXorExpression4181); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    o_tree = (LinkedListTree)adaptor.create(o);
            	    root_0 = (LinkedListTree)adaptor.becomeRoot(o_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression4184);
            	    bitwiseAndExpression331=bitwiseAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseAndExpression331.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate(o_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXorExpression"

    public static class bitwiseAndExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseAndExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1159:1: bitwiseAndExpression : equalityExpression (o= BAND equalityExpression )* ;
    public final AS3Parser.bitwiseAndExpression_return bitwiseAndExpression() throws RecognitionException {
        AS3Parser.bitwiseAndExpression_return retval = new AS3Parser.bitwiseAndExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token o=null;
        AS3Parser.equalityExpression_return equalityExpression332 = null;

        AS3Parser.equalityExpression_return equalityExpression333 = null;


        LinkedListTree o_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1160:2: ( equalityExpression (o= BAND equalityExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1160:4: equalityExpression (o= BAND equalityExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression4202);
            equalityExpression332=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression332.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1161:3: (o= BAND equalityExpression )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==BAND) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1161:5: o= BAND equalityExpression
            	    {
            	    o=(Token)match(input,BAND,FOLLOW_BAND_in_bitwiseAndExpression4210); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    o_tree = (LinkedListTree)adaptor.create(o);
            	    root_0 = (LinkedListTree)adaptor.becomeRoot(o_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression4213);
            	    equalityExpression333=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression333.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate(o_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseAndExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1165:1: equalityExpression : relationalExpression (o= equalityOperator relationalExpression )* ;
    public final AS3Parser.equalityExpression_return equalityExpression() throws RecognitionException {
        AS3Parser.equalityExpression_return retval = new AS3Parser.equalityExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.equalityOperator_return o = null;

        AS3Parser.relationalExpression_return relationalExpression334 = null;

        AS3Parser.relationalExpression_return relationalExpression335 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1166:2: ( relationalExpression (o= equalityOperator relationalExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1166:4: relationalExpression (o= equalityOperator relationalExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4230);
            relationalExpression334=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression334.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1167:3: (o= equalityOperator relationalExpression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=STRICT_EQUAL && LA75_0<=EQUAL)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1167:5: o= equalityOperator relationalExpression
            	    {
            	    pushFollow(FOLLOW_equalityOperator_in_equalityExpression4238);
            	    o=equalityOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4241);
            	    relationalExpression335=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression335.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class equalityOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1170:1: equalityOperator : ( STRICT_EQUAL | STRICT_NOT_EQUAL | NOT_EQUAL | EQUAL );
    public final AS3Parser.equalityOperator_return equalityOperator() throws RecognitionException {
        AS3Parser.equalityOperator_return retval = new AS3Parser.equalityOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set336=null;

        LinkedListTree set336_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1171:2: ( STRICT_EQUAL | STRICT_NOT_EQUAL | NOT_EQUAL | EQUAL )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set336=(Token)input.LT(1);
            if ( (input.LA(1)>=STRICT_EQUAL && input.LA(1)<=EQUAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set336));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "equalityOperator"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1179:1: relationalExpression : shiftExpression ( ( relationalOperator )=>o= relationalOperator shiftExpression )* ;
    public final AS3Parser.relationalExpression_return relationalExpression() throws RecognitionException {
        AS3Parser.relationalExpression_return retval = new AS3Parser.relationalExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.relationalOperator_return o = null;

        AS3Parser.shiftExpression_return shiftExpression337 = null;

        AS3Parser.shiftExpression_return shiftExpression338 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1180:2: ( shiftExpression ( ( relationalOperator )=>o= relationalOperator shiftExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1180:4: shiftExpression ( ( relationalOperator )=>o= relationalOperator shiftExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4288);
            shiftExpression337=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression337.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1181:3: ( ( relationalOperator )=>o= relationalOperator shiftExpression )*
            loop76:
            do {
                int alt76=2;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1181:5: ( relationalOperator )=>o= relationalOperator shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOperator_in_relationalExpression4301);
            	    o=relationalOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4304);
            	    shiftExpression338=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression338.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1185:1: relationalOperator : ( ( ( '>' )=> '>' -> GT[\">\"] ) | ( ( '>' '=' )=> '>' '=' -> GE[\">=\"] ) | ({...}? IN | LT | LE | IS | AS | INSTANCEOF ) );
    public final AS3Parser.relationalOperator_return relationalOperator() throws RecognitionException {
        AS3Parser.relationalOperator_return retval = new AS3Parser.relationalOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token char_literal339=null;
        Token char_literal340=null;
        Token char_literal341=null;
        Token IN342=null;
        Token LT343=null;
        Token LE344=null;
        Token IS345=null;
        Token AS346=null;
        Token INSTANCEOF347=null;

        LinkedListTree char_literal339_tree=null;
        LinkedListTree char_literal340_tree=null;
        LinkedListTree char_literal341_tree=null;
        LinkedListTree IN342_tree=null;
        LinkedListTree LT343_tree=null;
        LinkedListTree LE344_tree=null;
        LinkedListTree IS345_tree=null;
        LinkedListTree AS346_tree=null;
        LinkedListTree INSTANCEOF347_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1186:2: ( ( ( '>' )=> '>' -> GT[\">\"] ) | ( ( '>' '=' )=> '>' '=' -> GE[\">=\"] ) | ({...}? IN | LT | LE | IS | AS | INSTANCEOF ) )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1187:3: ( ( '>' )=> '>' -> GT[\">\"] )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1187:3: ( ( '>' )=> '>' -> GT[\">\"] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1187:5: ( '>' )=> '>'
                    {
                    char_literal339=(Token)match(input,GT,FOLLOW_GT_in_relationalOperator4331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal339);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1187:17: -> GT[\">\"]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(GT, ">"));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1188:4: ( ( '>' '=' )=> '>' '=' -> GE[\">=\"] )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1188:4: ( ( '>' '=' )=> '>' '=' -> GE[\">=\"] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1188:6: ( '>' '=' )=> '>' '='
                    {
                    char_literal340=(Token)match(input,GT,FOLLOW_GT_in_relationalOperator4353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal340);

                    char_literal341=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_relationalOperator4355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal341);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1188:26: -> GE[\">=\"]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(GE, ">="));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:4: ({...}? IN | LT | LE | IS | AS | INSTANCEOF )
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:4: ({...}? IN | LT | LE | IS | AS | INSTANCEOF )
                    int alt77=6;
                    switch ( input.LA(1) ) {
                    case IN:
                        {
                        alt77=1;
                        }
                        break;
                    case LT:
                        {
                        alt77=2;
                        }
                        break;
                    case LE:
                        {
                        alt77=3;
                        }
                        break;
                    case IS:
                        {
                        alt77=4;
                        }
                        break;
                    case AS:
                        {
                        alt77=5;
                        }
                        break;
                    case INSTANCEOF:
                        {
                        alt77=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:6: {...}? IN
                            {
                            if ( !((((InOperator_scope)InOperator_stack.peek()).allowed)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "relationalOperator", "$InOperator::allowed");
                            }
                            IN342=(Token)match(input,IN,FOLLOW_IN_in_relationalOperator4370); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            IN342_tree = (LinkedListTree)adaptor.create(IN342);
                            adaptor.addChild(root_0, IN342_tree);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:35: LT
                            {
                            LT343=(Token)match(input,LT,FOLLOW_LT_in_relationalOperator4374); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LT343_tree = (LinkedListTree)adaptor.create(LT343);
                            adaptor.addChild(root_0, LT343_tree);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:40: LE
                            {
                            LE344=(Token)match(input,LE,FOLLOW_LE_in_relationalOperator4378); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LE344_tree = (LinkedListTree)adaptor.create(LE344);
                            adaptor.addChild(root_0, LE344_tree);
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:45: IS
                            {
                            IS345=(Token)match(input,IS,FOLLOW_IS_in_relationalOperator4382); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            IS345_tree = (LinkedListTree)adaptor.create(IS345);
                            adaptor.addChild(root_0, IS345_tree);
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:50: AS
                            {
                            AS346=(Token)match(input,AS,FOLLOW_AS_in_relationalOperator4386); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AS346_tree = (LinkedListTree)adaptor.create(AS346);
                            adaptor.addChild(root_0, AS346_tree);
                            }

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1189:55: INSTANCEOF
                            {
                            INSTANCEOF347=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_relationalOperator4390); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INSTANCEOF347_tree = (LinkedListTree)adaptor.create(INSTANCEOF347);
                            adaptor.addChild(root_0, INSTANCEOF347_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "relationalOperator"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1193:1: shiftExpression : additiveExpression (o= shiftOperator additiveExpression )* ;
    public final AS3Parser.shiftExpression_return shiftExpression() throws RecognitionException {
        AS3Parser.shiftExpression_return retval = new AS3Parser.shiftExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.shiftOperator_return o = null;

        AS3Parser.additiveExpression_return additiveExpression348 = null;

        AS3Parser.additiveExpression_return additiveExpression349 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1194:2: ( additiveExpression (o= shiftOperator additiveExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1194:4: additiveExpression (o= shiftOperator additiveExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4404);
            additiveExpression348=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression348.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1195:3: (o= shiftOperator additiveExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==GT) ) {
                    int LA79_1 = input.LA(2);

                    if ( (LA79_1==GT) ) {
                        int LA79_4 = input.LA(3);

                        if ( (LA79_4==GT) ) {
                            int LA79_5 = input.LA(4);

                            if ( (LA79_5==LBRACE||LA79_5==IDENT||LA79_5==LBRACK||LA79_5==LPAREN||LA79_5==STRING_LITERAL||LA79_5==NAMESPACE||(LA79_5>=DYNAMIC && LA79_5<=FINAL)||LA79_5==OVERRIDE||(LA79_5>=STATIC && LA79_5<=NATIVE)||(LA79_5>=FUNCTION && LA79_5<=SET)||LA79_5==EACH||LA79_5==VOID||(LA79_5>=PLUS && LA79_5<=MINUS)||(LA79_5>=INC && LA79_5<=BNOT)||(LA79_5>=UNDEFINED && LA79_5<=FLOAT_LITERAL)||LA79_5==E4X_ATTRI) ) {
                                alt79=1;
                            }


                        }
                        else if ( (LA79_4==LBRACE||LA79_4==IDENT||LA79_4==LBRACK||LA79_4==LPAREN||LA79_4==STRING_LITERAL||LA79_4==NAMESPACE||(LA79_4>=DYNAMIC && LA79_4<=FINAL)||LA79_4==OVERRIDE||(LA79_4>=STATIC && LA79_4<=NATIVE)||(LA79_4>=FUNCTION && LA79_4<=SET)||LA79_4==EACH||LA79_4==VOID||(LA79_4>=PLUS && LA79_4<=MINUS)||(LA79_4>=INC && LA79_4<=BNOT)||(LA79_4>=UNDEFINED && LA79_4<=FLOAT_LITERAL)||LA79_4==E4X_ATTRI) ) {
                            alt79=1;
                        }


                    }


                }
                else if ( (LA79_0==SL) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1195:5: o= shiftOperator additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOperator_in_shiftExpression4412);
            	    o=shiftOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4415);
            	    additiveExpression349=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression349.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class shiftOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1199:1: shiftOperator : ( SL | ( ( '>' '>' )=> '>' '>' -> SR[\">>\"] ) | ( ( '>' '>' '>' )=> '>' '>' '>' -> BSR[\">>>\"] ) );
    public final AS3Parser.shiftOperator_return shiftOperator() throws RecognitionException {
        AS3Parser.shiftOperator_return retval = new AS3Parser.shiftOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token SL350=null;
        Token char_literal351=null;
        Token char_literal352=null;
        Token char_literal353=null;
        Token char_literal354=null;
        Token char_literal355=null;

        LinkedListTree SL350_tree=null;
        LinkedListTree char_literal351_tree=null;
        LinkedListTree char_literal352_tree=null;
        LinkedListTree char_literal353_tree=null;
        LinkedListTree char_literal354_tree=null;
        LinkedListTree char_literal355_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1200:2: ( SL | ( ( '>' '>' )=> '>' '>' -> SR[\">>\"] ) | ( ( '>' '>' '>' )=> '>' '>' '>' -> BSR[\">>>\"] ) )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1200:4: SL
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    SL350=(Token)match(input,SL,FOLLOW_SL_in_shiftOperator4432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SL350_tree = (LinkedListTree)adaptor.create(SL350);
                    adaptor.addChild(root_0, SL350_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1201:4: ( ( '>' '>' )=> '>' '>' -> SR[\">>\"] )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1201:4: ( ( '>' '>' )=> '>' '>' -> SR[\">>\"] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1201:6: ( '>' '>' )=> '>' '>'
                    {
                    char_literal351=(Token)match(input,GT,FOLLOW_GT_in_shiftOperator4447); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal351);

                    char_literal352=(Token)match(input,GT,FOLLOW_GT_in_shiftOperator4449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal352);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1201:26: -> SR[\">>\"]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(SR, ">>"));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1202:4: ( ( '>' '>' '>' )=> '>' '>' '>' -> BSR[\">>>\"] )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1202:4: ( ( '>' '>' '>' )=> '>' '>' '>' -> BSR[\">>>\"] )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1202:6: ( '>' '>' '>' )=> '>' '>' '>'
                    {
                    char_literal353=(Token)match(input,GT,FOLLOW_GT_in_shiftOperator4473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal353);

                    char_literal354=(Token)match(input,GT,FOLLOW_GT_in_shiftOperator4475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal354);

                    char_literal355=(Token)match(input,GT,FOLLOW_GT_in_shiftOperator4477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal355);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1202:34: -> BSR[\">>>\"]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(BSR, ">>>"));

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "shiftOperator"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1206:1: additiveExpression : multiplicativeExpression (o= additiveOperator multiplicativeExpression )* ;
    public final AS3Parser.additiveExpression_return additiveExpression() throws RecognitionException {
        AS3Parser.additiveExpression_return retval = new AS3Parser.additiveExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.additiveOperator_return o = null;

        AS3Parser.multiplicativeExpression_return multiplicativeExpression356 = null;

        AS3Parser.multiplicativeExpression_return multiplicativeExpression357 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1207:2: ( multiplicativeExpression (o= additiveOperator multiplicativeExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1207:4: multiplicativeExpression (o= additiveOperator multiplicativeExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4495);
            multiplicativeExpression356=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression356.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1208:3: (o= additiveOperator multiplicativeExpression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( ((LA81_0>=PLUS && LA81_0<=MINUS)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1208:5: o= additiveOperator multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_additiveOperator_in_additiveExpression4503);
            	    o=additiveOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4506);
            	    multiplicativeExpression357=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression357.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class additiveOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1211:1: additiveOperator : ( PLUS | MINUS );
    public final AS3Parser.additiveOperator_return additiveOperator() throws RecognitionException {
        AS3Parser.additiveOperator_return retval = new AS3Parser.additiveOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set358=null;

        LinkedListTree set358_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1212:2: ( PLUS | MINUS )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set358=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set358));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "additiveOperator"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1218:1: multiplicativeExpression : unaryExpression (o= multiplicativeOperator unaryExpression )* ;
    public final AS3Parser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        AS3Parser.multiplicativeExpression_return retval = new AS3Parser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.multiplicativeOperator_return o = null;

        AS3Parser.unaryExpression_return unaryExpression359 = null;

        AS3Parser.unaryExpression_return unaryExpression360 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1219:2: ( unaryExpression (o= multiplicativeOperator unaryExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1219:4: unaryExpression (o= multiplicativeOperator unaryExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4541);
            unaryExpression359=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression359.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1220:3: (o= multiplicativeOperator unaryExpression )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==STAR) ) {
                    int LA82_2 = input.LA(2);

                    if ( (LA82_2==LBRACE||LA82_2==IDENT||LA82_2==LBRACK||LA82_2==LPAREN||LA82_2==STRING_LITERAL||LA82_2==NAMESPACE||(LA82_2>=DYNAMIC && LA82_2<=FINAL)||LA82_2==OVERRIDE||(LA82_2>=STATIC && LA82_2<=NATIVE)||(LA82_2>=FUNCTION && LA82_2<=SET)||LA82_2==EACH||LA82_2==VOID||(LA82_2>=PLUS && LA82_2<=MINUS)||(LA82_2>=INC && LA82_2<=BNOT)||(LA82_2>=UNDEFINED && LA82_2<=FLOAT_LITERAL)||LA82_2==E4X_ATTRI) ) {
                        alt82=1;
                    }


                }
                else if ( ((LA82_0>=DIV && LA82_0<=MOD)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1220:5: o= multiplicativeOperator unaryExpression
            	    {
            	    pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression4550);
            	    o=multiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(o.getTree(), root_0);
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4553);
            	    unaryExpression360=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression360.getTree());
            	    if ( state.backtracking==0 ) {
            	      demarcate((o!=null?((LinkedListTree)o.tree):null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class multiplicativeOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1224:1: multiplicativeOperator : (s= STAR -> MULT[$s] | DIV | MOD );
    public final AS3Parser.multiplicativeOperator_return multiplicativeOperator() throws RecognitionException {
        AS3Parser.multiplicativeOperator_return retval = new AS3Parser.multiplicativeOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token s=null;
        Token DIV361=null;
        Token MOD362=null;

        LinkedListTree s_tree=null;
        LinkedListTree DIV361_tree=null;
        LinkedListTree MOD362_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1225:2: (s= STAR -> MULT[$s] | DIV | MOD )
            int alt83=3;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt83=1;
                }
                break;
            case DIV:
                {
                alt83=2;
                }
                break;
            case MOD:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1225:4: s= STAR
                    {
                    s=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicativeOperator4572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(s);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1225:11: -> MULT[$s]
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(MULT, s));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1226:4: DIV
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    DIV361=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicativeOperator4582); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIV361_tree = (LinkedListTree)adaptor.create(DIV361);
                    adaptor.addChild(root_0, DIV361_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1227:4: MOD
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    MOD362=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicativeOperator4587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MOD362_tree = (LinkedListTree)adaptor.create(MOD362);
                    adaptor.addChild(root_0, MOD362_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeOperator"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1236:1: unaryExpression : (inc= INC unaryExpression -> ^( PRE_INC[$inc] unaryExpression ) | de= DEC unaryExpression -> ^( PRE_DEC[$de] unaryExpression ) | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | PLUS unaryExpression -> ^( UNARY_PLUS unaryExpression ) | unaryExpressionNotPlusMinus );
    public final AS3Parser.unaryExpression_return unaryExpression() throws RecognitionException {
        AS3Parser.unaryExpression_return retval = new AS3Parser.unaryExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token inc=null;
        Token de=null;
        Token MINUS365=null;
        Token PLUS367=null;
        AS3Parser.unaryExpression_return unaryExpression363 = null;

        AS3Parser.unaryExpression_return unaryExpression364 = null;

        AS3Parser.unaryExpression_return unaryExpression366 = null;

        AS3Parser.unaryExpression_return unaryExpression368 = null;

        AS3Parser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus369 = null;


        LinkedListTree inc_tree=null;
        LinkedListTree de_tree=null;
        LinkedListTree MINUS365_tree=null;
        LinkedListTree PLUS367_tree=null;
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1237:2: (inc= INC unaryExpression -> ^( PRE_INC[$inc] unaryExpression ) | de= DEC unaryExpression -> ^( PRE_DEC[$de] unaryExpression ) | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | PLUS unaryExpression -> ^( UNARY_PLUS unaryExpression ) | unaryExpressionNotPlusMinus )
            int alt84=5;
            switch ( input.LA(1) ) {
            case INC:
                {
                alt84=1;
                }
                break;
            case DEC:
                {
                alt84=2;
                }
                break;
            case MINUS:
                {
                alt84=3;
                }
                break;
            case PLUS:
                {
                alt84=4;
                }
                break;
            case LBRACE:
            case IDENT:
            case LBRACK:
            case LPAREN:
            case STRING_LITERAL:
            case NAMESPACE:
            case DYNAMIC:
            case FINAL:
            case OVERRIDE:
            case STATIC:
            case NATIVE:
            case FUNCTION:
            case GET:
            case SET:
            case EACH:
            case VOID:
            case DELETE:
            case TYPEOF:
            case LNOT:
            case BNOT:
            case UNDEFINED:
            case THIS:
            case SUPER:
            case NEW:
            case NULL:
            case FALSE:
            case TRUE:
            case XML_LITERAL:
            case REGEXP_LITERAL:
            case HEX_LITERAL:
            case DECIMAL_LITERAL:
            case OCTAL_LITERAL:
            case FLOAT_LITERAL:
            case E4X_ATTRI:
                {
                alt84=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1237:4: inc= INC unaryExpression
                    {
                    inc=(Token)match(input,INC,FOLLOW_INC_in_unaryExpression4606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INC.add(inc);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4608);
                    unaryExpression363=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression363.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1237:28: -> ^( PRE_INC[$inc] unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1237:31: ^( PRE_INC[$inc] unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PRE_INC, inc), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1238:4: de= DEC unaryExpression
                    {
                    de=(Token)match(input,DEC,FOLLOW_DEC_in_unaryExpression4626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEC.add(de);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4628);
                    unaryExpression364=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression364.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1238:27: -> ^( PRE_DEC[$de] unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1238:30: ^( PRE_DEC[$de] unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PRE_DEC, de), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1239:4: MINUS unaryExpression
                    {
                    MINUS365=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression4644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS365);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4646);
                    unaryExpression366=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression366.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1239:26: -> ^( UNARY_MINUS unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1239:29: ^( UNARY_MINUS unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1240:4: PLUS unaryExpression
                    {
                    PLUS367=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression4661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS367);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4663);
                    unaryExpression368=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression368.getTree());


                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1240:25: -> ^( UNARY_PLUS unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1240:28: ^( UNARY_PLUS unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(UNARY_PLUS, "UNARY_PLUS"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1241:4: unaryExpressionNotPlusMinus
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4678);
                    unaryExpressionNotPlusMinus369=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus369.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1245:1: unaryExpressionNotPlusMinus : ( DELETE postfixExpression -> ^( DELETE postfixExpression ) | VOID unaryExpression -> ^( VOID unaryExpression ) | TYPEOF unaryExpression -> ^( TYPEOF unaryExpression ) | LNOT unaryExpression -> ^( LNOT unaryExpression ) | BNOT unaryExpression -> ^( BNOT unaryExpression ) | postfixExpression );
    public final AS3Parser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        AS3Parser.unaryExpressionNotPlusMinus_return retval = new AS3Parser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token DELETE370=null;
        Token VOID372=null;
        Token TYPEOF374=null;
        Token LNOT376=null;
        Token BNOT378=null;
        AS3Parser.postfixExpression_return postfixExpression371 = null;

        AS3Parser.unaryExpression_return unaryExpression373 = null;

        AS3Parser.unaryExpression_return unaryExpression375 = null;

        AS3Parser.unaryExpression_return unaryExpression377 = null;

        AS3Parser.unaryExpression_return unaryExpression379 = null;

        AS3Parser.postfixExpression_return postfixExpression380 = null;


        LinkedListTree DELETE370_tree=null;
        LinkedListTree VOID372_tree=null;
        LinkedListTree TYPEOF374_tree=null;
        LinkedListTree LNOT376_tree=null;
        LinkedListTree BNOT378_tree=null;
        RewriteRuleTokenStream stream_LNOT=new RewriteRuleTokenStream(adaptor,"token LNOT");
        RewriteRuleTokenStream stream_BNOT=new RewriteRuleTokenStream(adaptor,"token BNOT");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_TYPEOF=new RewriteRuleTokenStream(adaptor,"token TYPEOF");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1246:2: ( DELETE postfixExpression -> ^( DELETE postfixExpression ) | VOID unaryExpression -> ^( VOID unaryExpression ) | TYPEOF unaryExpression -> ^( TYPEOF unaryExpression ) | LNOT unaryExpression -> ^( LNOT unaryExpression ) | BNOT unaryExpression -> ^( BNOT unaryExpression ) | postfixExpression )
            int alt85=6;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt85=1;
                }
                break;
            case VOID:
                {
                alt85=2;
                }
                break;
            case TYPEOF:
                {
                alt85=3;
                }
                break;
            case LNOT:
                {
                alt85=4;
                }
                break;
            case BNOT:
                {
                alt85=5;
                }
                break;
            case LBRACE:
            case IDENT:
            case LBRACK:
            case LPAREN:
            case STRING_LITERAL:
            case NAMESPACE:
            case DYNAMIC:
            case FINAL:
            case OVERRIDE:
            case STATIC:
            case NATIVE:
            case FUNCTION:
            case GET:
            case SET:
            case EACH:
            case UNDEFINED:
            case THIS:
            case SUPER:
            case NEW:
            case NULL:
            case FALSE:
            case TRUE:
            case XML_LITERAL:
            case REGEXP_LITERAL:
            case HEX_LITERAL:
            case DECIMAL_LITERAL:
            case OCTAL_LITERAL:
            case FLOAT_LITERAL:
            case E4X_ATTRI:
                {
                alt85=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1246:4: DELETE postfixExpression
                    {
                    DELETE370=(Token)match(input,DELETE,FOLLOW_DELETE_in_unaryExpressionNotPlusMinus4690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DELETE.add(DELETE370);

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4692);
                    postfixExpression371=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression371.getTree());


                    // AST REWRITE
                    // elements: DELETE, postfixExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1246:29: -> ^( DELETE postfixExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1246:32: ^( DELETE postfixExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_DELETE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_postfixExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1247:4: VOID unaryExpression
                    {
                    VOID372=(Token)match(input,VOID,FOLLOW_VOID_in_unaryExpressionNotPlusMinus4707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VOID.add(VOID372);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4709);
                    unaryExpression373=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression373.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, VOID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1247:25: -> ^( VOID unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1247:28: ^( VOID unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_VOID.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1248:4: TYPEOF unaryExpression
                    {
                    TYPEOF374=(Token)match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryExpressionNotPlusMinus4724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPEOF.add(TYPEOF374);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4726);
                    unaryExpression375=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression375.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, TYPEOF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1248:27: -> ^( TYPEOF unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1248:30: ^( TYPEOF unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_TYPEOF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1249:4: LNOT unaryExpression
                    {
                    LNOT376=(Token)match(input,LNOT,FOLLOW_LNOT_in_unaryExpressionNotPlusMinus4741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LNOT.add(LNOT376);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4743);
                    unaryExpression377=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression377.getTree());


                    // AST REWRITE
                    // elements: LNOT, unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1249:25: -> ^( LNOT unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1249:28: ^( LNOT unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_LNOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1250:4: BNOT unaryExpression
                    {
                    BNOT378=(Token)match(input,BNOT,FOLLOW_BNOT_in_unaryExpressionNotPlusMinus4758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BNOT.add(BNOT378);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4760);
                    unaryExpression379=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression379.getTree());


                    // AST REWRITE
                    // elements: unaryExpression, BNOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1250:25: -> ^( BNOT unaryExpression )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1250:28: ^( BNOT unaryExpression )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_BNOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1251:4: postfixExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4775);
                    postfixExpression380=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression380.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1254:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final AS3Parser.postfixExpression_return postfixExpression() throws RecognitionException {
        AS3Parser.postfixExpression_return retval = new AS3Parser.postfixExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.leftHandSideExpression_return leftHandSideExpression381 = null;

        AS3Parser.postfixOperator_return postfixOperator382 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1255:2: ( leftHandSideExpression ( postfixOperator )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1255:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4786);
            leftHandSideExpression381=leftHandSideExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression381.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1255:27: ( postfixOperator )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=INC && LA86_0<=DEC)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1255:29: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4790);
                    postfixOperator382=postfixOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (LinkedListTree)adaptor.becomeRoot(postfixOperator382.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class postfixOperator_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixOperator"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1258:1: postfixOperator : (inc= INC -> ^( POST_INC[$inc] ) | de= DEC -> ^( POST_DEC[$de] ) );
    public final AS3Parser.postfixOperator_return postfixOperator() throws RecognitionException {
        AS3Parser.postfixOperator_return retval = new AS3Parser.postfixOperator_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token inc=null;
        Token de=null;

        LinkedListTree inc_tree=null;
        LinkedListTree de_tree=null;
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1259:2: (inc= INC -> ^( POST_INC[$inc] ) | de= DEC -> ^( POST_DEC[$de] ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==INC) ) {
                alt87=1;
            }
            else if ( (LA87_0==DEC) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1259:4: inc= INC
                    {
                    inc=(Token)match(input,INC,FOLLOW_INC_in_postfixOperator4807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INC.add(inc);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1259:12: -> ^( POST_INC[$inc] )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1259:15: ^( POST_INC[$inc] )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(POST_INC, inc), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1260:4: de= DEC
                    {
                    de=(Token)match(input,DEC,FOLLOW_DEC_in_postfixOperator4823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEC.add(de);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1260:11: -> ^( POST_DEC[$de] )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1260:14: ^( POST_DEC[$de] )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(POST_DEC, de), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "postfixOperator"

    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftHandSideExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1263:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( ( argumentList -> ^( FUNCTION_CALL $leftHandSideExpression argumentList ) ) | ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACCESS $leftHandSideExpression expression ) ) | ( DOT eitherIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier ) ) | typePostfixSyntax -> ^( $leftHandSideExpression memberExpression typePostfixSyntax ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $leftHandSideExpression expression ) | DBL_COLON eitherIdentifier -> ^( DBL_COLON $leftHandSideExpression eitherIdentifier ) | DOT e4xAttributeIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression e4xAttributeIdentifier ) | E4X_DESC e4xExpression -> ^( E4X_DESC $leftHandSideExpression e4xExpression ) )* ;
    public final AS3Parser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        AS3Parser.leftHandSideExpression_return retval = new AS3Parser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token rb=null;
        Token LBRACK385=null;
        Token DOT387=null;
        Token DOT390=null;
        Token LPAREN391=null;
        Token RPAREN393=null;
        Token DBL_COLON394=null;
        Token DOT396=null;
        Token E4X_DESC398=null;
        AS3Parser.memberExpression_return memberExpression383 = null;

        AS3Parser.argumentList_return argumentList384 = null;

        AS3Parser.expression_return expression386 = null;

        AS3Parser.eitherIdentifier_return eitherIdentifier388 = null;

        AS3Parser.typePostfixSyntax_return typePostfixSyntax389 = null;

        AS3Parser.expression_return expression392 = null;

        AS3Parser.eitherIdentifier_return eitherIdentifier395 = null;

        AS3Parser.e4xAttributeIdentifier_return e4xAttributeIdentifier397 = null;

        AS3Parser.e4xExpression_return e4xExpression399 = null;


        LinkedListTree rb_tree=null;
        LinkedListTree LBRACK385_tree=null;
        LinkedListTree DOT387_tree=null;
        LinkedListTree DOT390_tree=null;
        LinkedListTree LPAREN391_tree=null;
        LinkedListTree RPAREN393_tree=null;
        LinkedListTree DBL_COLON394_tree=null;
        LinkedListTree DOT396_tree=null;
        LinkedListTree E4X_DESC398_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_E4X_DESC=new RewriteRuleTokenStream(adaptor,"token E4X_DESC");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_DBL_COLON=new RewriteRuleTokenStream(adaptor,"token DBL_COLON");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_eitherIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule eitherIdentifier");
        RewriteRuleSubtreeStream stream_typePostfixSyntax=new RewriteRuleSubtreeStream(adaptor,"rule typePostfixSyntax");
        RewriteRuleSubtreeStream stream_e4xAttributeIdentifier=new RewriteRuleSubtreeStream(adaptor,"rule e4xAttributeIdentifier");
        RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");
        RewriteRuleSubtreeStream stream_e4xExpression=new RewriteRuleSubtreeStream(adaptor,"rule e4xExpression");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1264:2: ( ( memberExpression -> memberExpression ) ( ( argumentList -> ^( FUNCTION_CALL $leftHandSideExpression argumentList ) ) | ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACCESS $leftHandSideExpression expression ) ) | ( DOT eitherIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier ) ) | typePostfixSyntax -> ^( $leftHandSideExpression memberExpression typePostfixSyntax ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $leftHandSideExpression expression ) | DBL_COLON eitherIdentifier -> ^( DBL_COLON $leftHandSideExpression eitherIdentifier ) | DOT e4xAttributeIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression e4xAttributeIdentifier ) | E4X_DESC e4xExpression -> ^( E4X_DESC $leftHandSideExpression e4xExpression ) )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1265:2: ( memberExpression -> memberExpression ) ( ( argumentList -> ^( FUNCTION_CALL $leftHandSideExpression argumentList ) ) | ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACCESS $leftHandSideExpression expression ) ) | ( DOT eitherIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier ) ) | typePostfixSyntax -> ^( $leftHandSideExpression memberExpression typePostfixSyntax ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $leftHandSideExpression expression ) | DBL_COLON eitherIdentifier -> ^( DBL_COLON $leftHandSideExpression eitherIdentifier ) | DOT e4xAttributeIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression e4xAttributeIdentifier ) | E4X_DESC e4xExpression -> ^( E4X_DESC $leftHandSideExpression e4xExpression ) )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1265:2: ( memberExpression -> memberExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1266:3: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression4848);
            memberExpression383=memberExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_memberExpression.add(memberExpression383.getTree());


            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1266:22: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1268:2: ( ( argumentList -> ^( FUNCTION_CALL $leftHandSideExpression argumentList ) ) | ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACCESS $leftHandSideExpression expression ) ) | ( DOT eitherIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier ) ) | typePostfixSyntax -> ^( $leftHandSideExpression memberExpression typePostfixSyntax ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $leftHandSideExpression expression ) | DBL_COLON eitherIdentifier -> ^( DBL_COLON $leftHandSideExpression eitherIdentifier ) | DOT e4xAttributeIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression e4xAttributeIdentifier ) | E4X_DESC e4xExpression -> ^( E4X_DESC $leftHandSideExpression e4xExpression ) )*
            loop88:
            do {
                int alt88=9;
                alt88 = dfa88.predict(input);
                switch (alt88) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1269:3: ( argumentList -> ^( FUNCTION_CALL $leftHandSideExpression argumentList ) )
            	    {
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1269:3: ( argumentList -> ^( FUNCTION_CALL $leftHandSideExpression argumentList ) )
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1269:4: argumentList
            	    {
            	    pushFollow(FOLLOW_argumentList_in_leftHandSideExpression4865);
            	    argumentList384=argumentList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argumentList.add(argumentList384.getTree());


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, argumentList
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1269:19: -> ^( FUNCTION_CALL $leftHandSideExpression argumentList )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1269:22: ^( FUNCTION_CALL $leftHandSideExpression argumentList )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_argumentList.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }

            	    if ( state.backtracking==0 ) {
            	      demarcate(root_0.getFirstChild());
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1270:5: ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACCESS $leftHandSideExpression expression ) )
            	    {
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1270:5: ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACCESS $leftHandSideExpression expression ) )
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1270:6: LBRACK expression rb= RBRACK
            	    {
            	    LBRACK385=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression4890); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK385);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4892);
            	    expression386=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression386.getTree());
            	    rb=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression4896); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RBRACK.add(rb);



            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1270:34: -> ^( ARRAY_ACCESS $leftHandSideExpression expression )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1270:37: ^( ARRAY_ACCESS $leftHandSideExpression expression )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }

            	    if ( state.backtracking==0 ) {
            	      demarcate(root_0.getFirstChild()); root_0.getFirstChild().setStopToken((LinkedListToken)rb);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1271:5: ( DOT eitherIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier ) )
            	    {
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1271:5: ( DOT eitherIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier ) )
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1271:6: DOT eitherIdentifier
            	    {
            	    DOT387=(Token)match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4919); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT387);

            	    pushFollow(FOLLOW_eitherIdentifier_in_leftHandSideExpression4921);
            	    eitherIdentifier388=eitherIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eitherIdentifier.add(eitherIdentifier388.getTree());


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, eitherIdentifier
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1271:28: -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1271:31: ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_eitherIdentifier.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }

            	    if ( state.backtracking==0 ) {
            	      demarcate(root_0.getFirstChild());
            	    }

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1272:5: typePostfixSyntax
            	    {
            	    pushFollow(FOLLOW_typePostfixSyntax_in_leftHandSideExpression4944);
            	    typePostfixSyntax389=typePostfixSyntax();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typePostfixSyntax.add(typePostfixSyntax389.getTree());


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, typePostfixSyntax, memberExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1272:24: -> ^( $leftHandSideExpression memberExpression typePostfixSyntax )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1272:27: ^( $leftHandSideExpression memberExpression typePostfixSyntax )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_memberExpression.nextTree());
            	        adaptor.addChild(root_1, stream_typePostfixSyntax.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1273:5: DOT LPAREN expression RPAREN
            	    {
            	    DOT390=(Token)match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4964); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT390);

            	    LPAREN391=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_leftHandSideExpression4966); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN391);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression4968);
            	    expression392=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression392.getTree());
            	    RPAREN393=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_leftHandSideExpression4970); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN393);



            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1273:34: -> ^( E4X_FILTER $leftHandSideExpression expression )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1273:37: ^( E4X_FILTER $leftHandSideExpression expression )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(E4X_FILTER, "E4X_FILTER"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1274:5: DBL_COLON eitherIdentifier
            	    {
            	    DBL_COLON394=(Token)match(input,DBL_COLON,FOLLOW_DBL_COLON_in_leftHandSideExpression4989); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DBL_COLON.add(DBL_COLON394);

            	    pushFollow(FOLLOW_eitherIdentifier_in_leftHandSideExpression4991);
            	    eitherIdentifier395=eitherIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eitherIdentifier.add(eitherIdentifier395.getTree());


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, DBL_COLON, eitherIdentifier
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1274:32: -> ^( DBL_COLON $leftHandSideExpression eitherIdentifier )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1274:35: ^( DBL_COLON $leftHandSideExpression eitherIdentifier )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_DBL_COLON.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_eitherIdentifier.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 7 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1275:5: DOT e4xAttributeIdentifier
            	    {
            	    DOT396=(Token)match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression5010); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT396);

            	    pushFollow(FOLLOW_e4xAttributeIdentifier_in_leftHandSideExpression5012);
            	    e4xAttributeIdentifier397=e4xAttributeIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_e4xAttributeIdentifier.add(e4xAttributeIdentifier397.getTree());


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, e4xAttributeIdentifier
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1275:32: -> ^( FIELD_ACCESS $leftHandSideExpression e4xAttributeIdentifier )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1275:35: ^( FIELD_ACCESS $leftHandSideExpression e4xAttributeIdentifier )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FIELD_ACCESS, "FIELD_ACCESS"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e4xAttributeIdentifier.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 8 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1276:5: E4X_DESC e4xExpression
            	    {
            	    E4X_DESC398=(Token)match(input,E4X_DESC,FOLLOW_E4X_DESC_in_leftHandSideExpression5031); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_E4X_DESC.add(E4X_DESC398);

            	    pushFollow(FOLLOW_e4xExpression_in_leftHandSideExpression5033);
            	    e4xExpression399=e4xExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_e4xExpression.add(e4xExpression399.getTree());


            	    // AST REWRITE
            	    // elements: e4xExpression, leftHandSideExpression, E4X_DESC
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (LinkedListTree)adaptor.nil();
            	    // 1276:28: -> ^( E4X_DESC $leftHandSideExpression e4xExpression )
            	    {
            	        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1276:31: ^( E4X_DESC $leftHandSideExpression e4xExpression )
            	        {
            	        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
            	        root_1 = (LinkedListTree)adaptor.becomeRoot(stream_E4X_DESC.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e4xExpression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "leftHandSideExpression"

    public static class eitherIdentifier_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eitherIdentifier"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1280:1: eitherIdentifier : IDENT ;
    public final AS3Parser.eitherIdentifier_return eitherIdentifier() throws RecognitionException {
        AS3Parser.eitherIdentifier_return retval = new AS3Parser.eitherIdentifier_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IDENT400=null;

        LinkedListTree IDENT400_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1281:2: ( IDENT )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1281:4: IDENT
            {
            root_0 = (LinkedListTree)adaptor.nil();

            IDENT400=(Token)match(input,IDENT,FOLLOW_IDENT_in_eitherIdentifier5064); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT400_tree = (LinkedListTree)adaptor.create(IDENT400);
            adaptor.addChild(root_0, IDENT400_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "eitherIdentifier"

    public static class memberExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1286:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final AS3Parser.memberExpression_return memberExpression() throws RecognitionException {
        AS3Parser.memberExpression_return retval = new AS3Parser.memberExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.primaryExpression_return primaryExpression401 = null;

        AS3Parser.functionExpression_return functionExpression402 = null;

        AS3Parser.newExpression_return newExpression403 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1287:2: ( primaryExpression | functionExpression | newExpression )
            int alt89=3;
            switch ( input.LA(1) ) {
            case LBRACE:
            case IDENT:
            case LBRACK:
            case LPAREN:
            case STRING_LITERAL:
            case NAMESPACE:
            case DYNAMIC:
            case FINAL:
            case OVERRIDE:
            case STATIC:
            case NATIVE:
            case GET:
            case SET:
            case EACH:
            case UNDEFINED:
            case THIS:
            case SUPER:
            case NULL:
            case FALSE:
            case TRUE:
            case XML_LITERAL:
            case REGEXP_LITERAL:
            case HEX_LITERAL:
            case DECIMAL_LITERAL:
            case OCTAL_LITERAL:
            case FLOAT_LITERAL:
            case E4X_ATTRI:
                {
                alt89=1;
                }
                break;
            case FUNCTION:
                {
                alt89=2;
                }
                break;
            case NEW:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1287:4: primaryExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression5077);
                    primaryExpression401=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression401.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1288:4: functionExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression5082);
                    functionExpression402=functionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression402.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1289:4: newExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression5087);
                    newExpression403=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression403.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "memberExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1292:1: primaryExpression : primaryExpressionHelper ;
    public final AS3Parser.primaryExpression_return primaryExpression() throws RecognitionException {
        AS3Parser.primaryExpression_return retval = new AS3Parser.primaryExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.primaryExpressionHelper_return primaryExpressionHelper404 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1293:2: ( primaryExpressionHelper )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1293:4: primaryExpressionHelper
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_primaryExpressionHelper_in_primaryExpression5098);
            primaryExpressionHelper404=primaryExpressionHelper();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpressionHelper404.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class primaryExpressionHelper_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpressionHelper"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1296:1: primaryExpressionHelper : ( UNDEFINED | THIS | SUPER | identiferLiteral | constant | arrayLiteral | objectLiteral | encapsulatedExpression | e4xAttributeIdentifier );
    public final AS3Parser.primaryExpressionHelper_return primaryExpressionHelper() throws RecognitionException {
        AS3Parser.primaryExpressionHelper_return retval = new AS3Parser.primaryExpressionHelper_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token UNDEFINED405=null;
        Token THIS406=null;
        Token SUPER407=null;
        AS3Parser.identiferLiteral_return identiferLiteral408 = null;

        AS3Parser.constant_return constant409 = null;

        AS3Parser.arrayLiteral_return arrayLiteral410 = null;

        AS3Parser.objectLiteral_return objectLiteral411 = null;

        AS3Parser.encapsulatedExpression_return encapsulatedExpression412 = null;

        AS3Parser.e4xAttributeIdentifier_return e4xAttributeIdentifier413 = null;


        LinkedListTree UNDEFINED405_tree=null;
        LinkedListTree THIS406_tree=null;
        LinkedListTree SUPER407_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1297:2: ( UNDEFINED | THIS | SUPER | identiferLiteral | constant | arrayLiteral | objectLiteral | encapsulatedExpression | e4xAttributeIdentifier )
            int alt90=9;
            switch ( input.LA(1) ) {
            case UNDEFINED:
                {
                alt90=1;
                }
                break;
            case THIS:
                {
                alt90=2;
                }
                break;
            case SUPER:
                {
                alt90=3;
                }
                break;
            case IDENT:
            case NAMESPACE:
            case DYNAMIC:
            case FINAL:
            case OVERRIDE:
            case STATIC:
            case NATIVE:
            case GET:
            case SET:
            case EACH:
                {
                alt90=4;
                }
                break;
            case STRING_LITERAL:
            case NULL:
            case FALSE:
            case TRUE:
            case XML_LITERAL:
            case REGEXP_LITERAL:
            case HEX_LITERAL:
            case DECIMAL_LITERAL:
            case OCTAL_LITERAL:
            case FLOAT_LITERAL:
                {
                alt90=5;
                }
                break;
            case LBRACK:
                {
                alt90=6;
                }
                break;
            case LBRACE:
                {
                alt90=7;
                }
                break;
            case LPAREN:
                {
                alt90=8;
                }
                break;
            case E4X_ATTRI:
                {
                alt90=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1297:4: UNDEFINED
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    UNDEFINED405=(Token)match(input,UNDEFINED,FOLLOW_UNDEFINED_in_primaryExpressionHelper5109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNDEFINED405_tree = (LinkedListTree)adaptor.create(UNDEFINED405);
                    adaptor.addChild(root_0, UNDEFINED405_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1298:4: THIS
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    THIS406=(Token)match(input,THIS,FOLLOW_THIS_in_primaryExpressionHelper5114); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS406_tree = (LinkedListTree)adaptor.create(THIS406);
                    adaptor.addChild(root_0, THIS406_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1299:4: SUPER
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    SUPER407=(Token)match(input,SUPER,FOLLOW_SUPER_in_primaryExpressionHelper5119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER407_tree = (LinkedListTree)adaptor.create(SUPER407);
                    adaptor.addChild(root_0, SUPER407_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1300:4: identiferLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_identiferLiteral_in_primaryExpressionHelper5124);
                    identiferLiteral408=identiferLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identiferLiteral408.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1301:4: constant
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primaryExpressionHelper5129);
                    constant409=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant409.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1302:4: arrayLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpressionHelper5134);
                    arrayLiteral410=arrayLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLiteral410.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1303:4: objectLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpressionHelper5139);
                    objectLiteral411=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral411.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1304:4: encapsulatedExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_encapsulatedExpression_in_primaryExpressionHelper5144);
                    encapsulatedExpression412=encapsulatedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, encapsulatedExpression412.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1305:4: e4xAttributeIdentifier
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_e4xAttributeIdentifier_in_primaryExpressionHelper5149);
                    e4xAttributeIdentifier413=e4xAttributeIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e4xAttributeIdentifier413.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpressionHelper"

    public static class newExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1309:1: newExpression : NEW primaryExpression ;
    public final AS3Parser.newExpression_return newExpression() throws RecognitionException {
        AS3Parser.newExpression_return retval = new AS3Parser.newExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token NEW414=null;
        AS3Parser.primaryExpression_return primaryExpression415 = null;


        LinkedListTree NEW414_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1310:2: ( NEW primaryExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1310:4: NEW primaryExpression
            {
            root_0 = (LinkedListTree)adaptor.nil();

            NEW414=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression5161); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEW414_tree = (LinkedListTree)adaptor.create(NEW414);
            root_0 = (LinkedListTree)adaptor.becomeRoot(NEW414_tree, root_0);
            }
            pushFollow(FOLLOW_primaryExpression_in_newExpression5164);
            primaryExpression415=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression415.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class identiferLiteral_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identiferLiteral"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1317:1: identiferLiteral : ( IDENT | notQuiteReservedWord );
    public final AS3Parser.identiferLiteral_return identiferLiteral() throws RecognitionException {
        AS3Parser.identiferLiteral_return retval = new AS3Parser.identiferLiteral_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IDENT416=null;
        AS3Parser.notQuiteReservedWord_return notQuiteReservedWord417 = null;


        LinkedListTree IDENT416_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1318:2: ( IDENT | notQuiteReservedWord )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==IDENT) ) {
                alt91=1;
            }
            else if ( (LA91_0==NAMESPACE||(LA91_0>=DYNAMIC && LA91_0<=FINAL)||LA91_0==OVERRIDE||(LA91_0>=STATIC && LA91_0<=NATIVE)||(LA91_0>=GET && LA91_0<=SET)||LA91_0==EACH) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1318:4: IDENT
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    IDENT416=(Token)match(input,IDENT,FOLLOW_IDENT_in_identiferLiteral5180); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT416_tree = (LinkedListTree)adaptor.create(IDENT416);
                    adaptor.addChild(root_0, IDENT416_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1319:4: notQuiteReservedWord
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_notQuiteReservedWord_in_identiferLiteral5186);
                    notQuiteReservedWord417=notQuiteReservedWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notQuiteReservedWord417.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "identiferLiteral"

    public static class constant_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1323:1: constant : ( NULL | FALSE | TRUE | numericLiteral | stringLiteral | XML_LITERAL | REGEXP_LITERAL );
    public final AS3Parser.constant_return constant() throws RecognitionException {
        AS3Parser.constant_return retval = new AS3Parser.constant_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token NULL418=null;
        Token FALSE419=null;
        Token TRUE420=null;
        Token XML_LITERAL423=null;
        Token REGEXP_LITERAL424=null;
        AS3Parser.numericLiteral_return numericLiteral421 = null;

        AS3Parser.stringLiteral_return stringLiteral422 = null;


        LinkedListTree NULL418_tree=null;
        LinkedListTree FALSE419_tree=null;
        LinkedListTree TRUE420_tree=null;
        LinkedListTree XML_LITERAL423_tree=null;
        LinkedListTree REGEXP_LITERAL424_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1324:2: ( NULL | FALSE | TRUE | numericLiteral | stringLiteral | XML_LITERAL | REGEXP_LITERAL )
            int alt92=7;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt92=1;
                }
                break;
            case FALSE:
                {
                alt92=2;
                }
                break;
            case TRUE:
                {
                alt92=3;
                }
                break;
            case HEX_LITERAL:
            case DECIMAL_LITERAL:
            case OCTAL_LITERAL:
            case FLOAT_LITERAL:
                {
                alt92=4;
                }
                break;
            case STRING_LITERAL:
                {
                alt92=5;
                }
                break;
            case XML_LITERAL:
                {
                alt92=6;
                }
                break;
            case REGEXP_LITERAL:
                {
                alt92=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1325:3: NULL
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    NULL418=(Token)match(input,NULL,FOLLOW_NULL_in_constant5202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL418_tree = (LinkedListTree)adaptor.create(NULL418);
                    adaptor.addChild(root_0, NULL418_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1326:4: FALSE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    FALSE419=(Token)match(input,FALSE,FOLLOW_FALSE_in_constant5207); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE419_tree = (LinkedListTree)adaptor.create(FALSE419);
                    adaptor.addChild(root_0, FALSE419_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1327:4: TRUE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    TRUE420=(Token)match(input,TRUE,FOLLOW_TRUE_in_constant5212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE420_tree = (LinkedListTree)adaptor.create(TRUE420);
                    adaptor.addChild(root_0, TRUE420_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1328:4: numericLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_constant5217);
                    numericLiteral421=numericLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteral421.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1329:4: stringLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_constant5222);
                    stringLiteral422=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral422.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1331:5: XML_LITERAL
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    XML_LITERAL423=(Token)match(input,XML_LITERAL,FOLLOW_XML_LITERAL_in_constant5229); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XML_LITERAL423_tree = (LinkedListTree)adaptor.create(XML_LITERAL423);
                    adaptor.addChild(root_0, XML_LITERAL423_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1333:4: REGEXP_LITERAL
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    REGEXP_LITERAL424=(Token)match(input,REGEXP_LITERAL,FOLLOW_REGEXP_LITERAL_in_constant5235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGEXP_LITERAL424_tree = (LinkedListTree)adaptor.create(REGEXP_LITERAL424);
                    adaptor.addChild(root_0, REGEXP_LITERAL424_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteral"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1358:1: numericLiteral : ( HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOAT_LITERAL );
    public final AS3Parser.numericLiteral_return numericLiteral() throws RecognitionException {
        AS3Parser.numericLiteral_return retval = new AS3Parser.numericLiteral_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set425=null;

        LinkedListTree set425_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1359:2: ( HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOAT_LITERAL )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set425=(Token)input.LT(1);
            if ( (input.LA(1)>=HEX_LITERAL && input.LA(1)<=FLOAT_LITERAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set425));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"

    public static class stringLiteral_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteral"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1366:1: stringLiteral : STRING_LITERAL ;
    public final AS3Parser.stringLiteral_return stringLiteral() throws RecognitionException {
        AS3Parser.stringLiteral_return retval = new AS3Parser.stringLiteral_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token STRING_LITERAL426=null;

        LinkedListTree STRING_LITERAL426_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1367:2: ( STRING_LITERAL )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1367:4: STRING_LITERAL
            {
            root_0 = (LinkedListTree)adaptor.nil();

            STRING_LITERAL426=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteral5278); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LITERAL426_tree = (LinkedListTree)adaptor.create(STRING_LITERAL426);
            adaptor.addChild(root_0, STRING_LITERAL426_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "stringLiteral"

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLiteral"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1375:1: arrayLiteral : LBRACK ( elementList )? RBRACK -> ^( ARRAY_LITERAL ( elementList )? ) ;
    public final AS3Parser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        AS3Parser.arrayLiteral_return retval = new AS3Parser.arrayLiteral_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACK427=null;
        Token RBRACK429=null;
        AS3Parser.elementList_return elementList428 = null;


        LinkedListTree LBRACK427_tree=null;
        LinkedListTree RBRACK429_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleSubtreeStream stream_elementList=new RewriteRuleSubtreeStream(adaptor,"rule elementList");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1376:2: ( LBRACK ( elementList )? RBRACK -> ^( ARRAY_LITERAL ( elementList )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1376:4: LBRACK ( elementList )? RBRACK
            {
            LBRACK427=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral5294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACK.add(LBRACK427);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1376:11: ( elementList )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LBRACE||LA93_0==IDENT||LA93_0==LBRACK||(LA93_0>=LPAREN && LA93_0<=COMMA)||LA93_0==STRING_LITERAL||LA93_0==NAMESPACE||(LA93_0>=DYNAMIC && LA93_0<=FINAL)||LA93_0==OVERRIDE||(LA93_0>=STATIC && LA93_0<=NATIVE)||(LA93_0>=FUNCTION && LA93_0<=SET)||LA93_0==EACH||LA93_0==VOID||(LA93_0>=PLUS && LA93_0<=MINUS)||(LA93_0>=INC && LA93_0<=BNOT)||(LA93_0>=UNDEFINED && LA93_0<=FLOAT_LITERAL)||LA93_0==E4X_ATTRI) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1376:11: elementList
                    {
                    pushFollow(FOLLOW_elementList_in_arrayLiteral5296);
                    elementList428=elementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elementList.add(elementList428.getTree());

                    }
                    break;

            }

            RBRACK429=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral5299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACK.add(RBRACK429);



            // AST REWRITE
            // elements: elementList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1377:3: -> ^( ARRAY_LITERAL ( elementList )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1377:6: ^( ARRAY_LITERAL ( elementList )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ARRAY_LITERAL, "ARRAY_LITERAL"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1377:23: ( elementList )?
                if ( stream_elementList.hasNext() ) {
                    adaptor.addChild(root_1, stream_elementList.nextTree());

                }
                stream_elementList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"

    public static class elementList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1381:1: elementList : ( COMMA | nonemptyElementList );
    public final AS3Parser.elementList_return elementList() throws RecognitionException {
        AS3Parser.elementList_return retval = new AS3Parser.elementList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COMMA430=null;
        AS3Parser.nonemptyElementList_return nonemptyElementList431 = null;


        LinkedListTree COMMA430_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1382:2: ( COMMA | nonemptyElementList )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==COMMA) ) {
                alt94=1;
            }
            else if ( (LA94_0==LBRACE||LA94_0==IDENT||LA94_0==LBRACK||LA94_0==LPAREN||LA94_0==STRING_LITERAL||LA94_0==NAMESPACE||(LA94_0>=DYNAMIC && LA94_0<=FINAL)||LA94_0==OVERRIDE||(LA94_0>=STATIC && LA94_0<=NATIVE)||(LA94_0>=FUNCTION && LA94_0<=SET)||LA94_0==EACH||LA94_0==VOID||(LA94_0>=PLUS && LA94_0<=MINUS)||(LA94_0>=INC && LA94_0<=BNOT)||(LA94_0>=UNDEFINED && LA94_0<=FLOAT_LITERAL)||LA94_0==E4X_ATTRI) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1382:4: COMMA
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    COMMA430=(Token)match(input,COMMA,FOLLOW_COMMA_in_elementList5324); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1383:4: nonemptyElementList
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_nonemptyElementList_in_elementList5330);
                    nonemptyElementList431=nonemptyElementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonemptyElementList431.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "elementList"

    public static class nonemptyElementList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonemptyElementList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1387:1: nonemptyElementList : assignmentExpression ( COMMA assignmentExpression )* ;
    public final AS3Parser.nonemptyElementList_return nonemptyElementList() throws RecognitionException {
        AS3Parser.nonemptyElementList_return retval = new AS3Parser.nonemptyElementList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COMMA433=null;
        AS3Parser.assignmentExpression_return assignmentExpression432 = null;

        AS3Parser.assignmentExpression_return assignmentExpression434 = null;


        LinkedListTree COMMA433_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1388:2: ( assignmentExpression ( COMMA assignmentExpression )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1388:4: assignmentExpression ( COMMA assignmentExpression )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_nonemptyElementList5342);
            assignmentExpression432=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression432.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1388:25: ( COMMA assignmentExpression )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==COMMA) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1388:27: COMMA assignmentExpression
            	    {
            	    COMMA433=(Token)match(input,COMMA,FOLLOW_COMMA_in_nonemptyElementList5346); if (state.failed) return retval;
            	    pushFollow(FOLLOW_assignmentExpression_in_nonemptyElementList5349);
            	    assignmentExpression434=assignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression434.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "nonemptyElementList"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1396:1: objectLiteral : LBRACE ( fieldList )? RBRACE -> ^( OBJECT_LITERAL ( fieldList )? ) ;
    public final AS3Parser.objectLiteral_return objectLiteral() throws RecognitionException {
        AS3Parser.objectLiteral_return retval = new AS3Parser.objectLiteral_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE435=null;
        Token RBRACE437=null;
        AS3Parser.fieldList_return fieldList436 = null;


        LinkedListTree LBRACE435_tree=null;
        LinkedListTree RBRACE437_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1397:2: ( LBRACE ( fieldList )? RBRACE -> ^( OBJECT_LITERAL ( fieldList )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1397:4: LBRACE ( fieldList )? RBRACE
            {
            LBRACE435=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral5368); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE435);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1397:11: ( fieldList )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==IDENT||LA96_0==STRING_LITERAL||LA96_0==NAMESPACE||(LA96_0>=DYNAMIC && LA96_0<=FINAL)||LA96_0==OVERRIDE||(LA96_0>=STATIC && LA96_0<=NATIVE)||(LA96_0>=GET && LA96_0<=SET)||LA96_0==EACH||(LA96_0>=HEX_LITERAL && LA96_0<=FLOAT_LITERAL)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1397:11: fieldList
                    {
                    pushFollow(FOLLOW_fieldList_in_objectLiteral5370);
                    fieldList436=fieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldList.add(fieldList436.getTree());

                    }
                    break;

            }

            RBRACE437=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral5373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE437);



            // AST REWRITE
            // elements: fieldList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1398:3: -> ^( OBJECT_LITERAL ( fieldList )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1398:6: ^( OBJECT_LITERAL ( fieldList )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(OBJECT_LITERAL, "OBJECT_LITERAL"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1398:24: ( fieldList )?
                if ( stream_fieldList.hasNext() ) {
                    adaptor.addChild(root_1, stream_fieldList.nextTree());

                }
                stream_fieldList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "objectLiteral"

    public static class fieldList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1402:1: fieldList : literalField ( COMMA ( literalField )? )* ;
    public final AS3Parser.fieldList_return fieldList() throws RecognitionException {
        AS3Parser.fieldList_return retval = new AS3Parser.fieldList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COMMA439=null;
        AS3Parser.literalField_return literalField438 = null;

        AS3Parser.literalField_return literalField440 = null;


        LinkedListTree COMMA439_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1403:2: ( literalField ( COMMA ( literalField )? )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1403:4: literalField ( COMMA ( literalField )? )*
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_literalField_in_fieldList5398);
            literalField438=literalField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, literalField438.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1403:17: ( COMMA ( literalField )? )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==COMMA) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1403:19: COMMA ( literalField )?
            	    {
            	    COMMA439=(Token)match(input,COMMA,FOLLOW_COMMA_in_fieldList5402); if (state.failed) return retval;
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1403:26: ( literalField )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==IDENT||LA97_0==STRING_LITERAL||LA97_0==NAMESPACE||(LA97_0>=DYNAMIC && LA97_0<=FINAL)||LA97_0==OVERRIDE||(LA97_0>=STATIC && LA97_0<=NATIVE)||(LA97_0>=GET && LA97_0<=SET)||LA97_0==EACH||(LA97_0>=HEX_LITERAL && LA97_0<=FLOAT_LITERAL)) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1403:26: literalField
            	            {
            	            pushFollow(FOLLOW_literalField_in_fieldList5405);
            	            literalField440=literalField();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, literalField440.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class literalField_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literalField"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1407:1: literalField : fieldName COLON element -> ^( OBJECT_FIELD fieldName element ) ;
    public final AS3Parser.literalField_return literalField() throws RecognitionException {
        AS3Parser.literalField_return retval = new AS3Parser.literalField_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token COLON442=null;
        AS3Parser.fieldName_return fieldName441 = null;

        AS3Parser.element_return element443 = null;


        LinkedListTree COLON442_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        RewriteRuleSubtreeStream stream_fieldName=new RewriteRuleSubtreeStream(adaptor,"rule fieldName");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1408:2: ( fieldName COLON element -> ^( OBJECT_FIELD fieldName element ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1408:4: fieldName COLON element
            {
            pushFollow(FOLLOW_fieldName_in_literalField5421);
            fieldName441=fieldName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldName.add(fieldName441.getTree());
            COLON442=(Token)match(input,COLON,FOLLOW_COLON_in_literalField5423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON442);

            pushFollow(FOLLOW_element_in_literalField5425);
            element443=element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_element.add(element443.getTree());


            // AST REWRITE
            // elements: element, fieldName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1409:3: -> ^( OBJECT_FIELD fieldName element )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1409:6: ^( OBJECT_FIELD fieldName element )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(OBJECT_FIELD, "OBJECT_FIELD"), root_1);

                adaptor.addChild(root_1, stream_fieldName.nextTree());
                adaptor.addChild(root_1, stream_element.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "literalField"

    public static class fieldName_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldName"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1413:1: fieldName : ( identiferLiteral | numericLiteral | stringLiteral );
    public final AS3Parser.fieldName_return fieldName() throws RecognitionException {
        AS3Parser.fieldName_return retval = new AS3Parser.fieldName_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.identiferLiteral_return identiferLiteral444 = null;

        AS3Parser.numericLiteral_return numericLiteral445 = null;

        AS3Parser.stringLiteral_return stringLiteral446 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1414:2: ( identiferLiteral | numericLiteral | stringLiteral )
            int alt99=3;
            switch ( input.LA(1) ) {
            case IDENT:
            case NAMESPACE:
            case DYNAMIC:
            case FINAL:
            case OVERRIDE:
            case STATIC:
            case NATIVE:
            case GET:
            case SET:
            case EACH:
                {
                alt99=1;
                }
                break;
            case HEX_LITERAL:
            case DECIMAL_LITERAL:
            case OCTAL_LITERAL:
            case FLOAT_LITERAL:
                {
                alt99=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt99=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1414:4: identiferLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_identiferLiteral_in_fieldName5451);
                    identiferLiteral444=identiferLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identiferLiteral444.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1415:4: numericLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_fieldName5456);
                    numericLiteral445=numericLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numericLiteral445.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1416:4: stringLiteral
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_stringLiteral_in_fieldName5461);
                    stringLiteral446=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringLiteral446.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "fieldName"

    public static class element_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1420:1: element : assignmentExpression ;
    public final AS3Parser.element_return element() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.element_return retval = new AS3Parser.element_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.assignmentExpression_return assignmentExpression447 = null;




        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1425:2: ( assignmentExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1425:4: assignmentExpression
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_element5483);
            assignmentExpression447=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression447.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "element"

    public static class functionExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1432:1: functionExpression : FUNCTION functionCommon -> ^( FUNC_DEF functionCommon ) ;
    public final AS3Parser.functionExpression_return functionExpression() throws RecognitionException {
        AS3Parser.functionExpression_return retval = new AS3Parser.functionExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token FUNCTION448=null;
        AS3Parser.functionCommon_return functionCommon449 = null;


        LinkedListTree FUNCTION448_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleSubtreeStream stream_functionCommon=new RewriteRuleSubtreeStream(adaptor,"rule functionCommon");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1433:2: ( FUNCTION functionCommon -> ^( FUNC_DEF functionCommon ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1433:4: FUNCTION functionCommon
            {
            FUNCTION448=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression5498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION448);

            pushFollow(FOLLOW_functionCommon_in_functionExpression5500);
            functionCommon449=functionCommon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionCommon.add(functionCommon449.getTree());


            // AST REWRITE
            // elements: functionCommon
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1434:3: -> ^( FUNC_DEF functionCommon )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1434:6: ^( FUNC_DEF functionCommon )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_functionCommon.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "functionExpression"

    public static class castExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1437:1: castExpression : ident ( typePostfixSyntax )? argumentList -> ^( FUNC_DEF ident typePostfixSyntax ( argumentList )? ) ;
    public final AS3Parser.castExpression_return castExpression() throws RecognitionException {
        AS3Parser.castExpression_return retval = new AS3Parser.castExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.ident_return ident450 = null;

        AS3Parser.typePostfixSyntax_return typePostfixSyntax451 = null;

        AS3Parser.argumentList_return argumentList452 = null;


        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_typePostfixSyntax=new RewriteRuleSubtreeStream(adaptor,"rule typePostfixSyntax");
        RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1438:2: ( ident ( typePostfixSyntax )? argumentList -> ^( FUNC_DEF ident typePostfixSyntax ( argumentList )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1438:4: ident ( typePostfixSyntax )? argumentList
            {
            pushFollow(FOLLOW_ident_in_castExpression5523);
            ident450=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident450.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1438:10: ( typePostfixSyntax )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==POST) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1438:10: typePostfixSyntax
                    {
                    pushFollow(FOLLOW_typePostfixSyntax_in_castExpression5525);
                    typePostfixSyntax451=typePostfixSyntax();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typePostfixSyntax.add(typePostfixSyntax451.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_argumentList_in_castExpression5528);
            argumentList452=argumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argumentList.add(argumentList452.getTree());


            // AST REWRITE
            // elements: ident, argumentList, typePostfixSyntax
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1439:3: -> ^( FUNC_DEF ident typePostfixSyntax ( argumentList )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1439:6: ^( FUNC_DEF ident typePostfixSyntax ( argumentList )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(FUNC_DEF, "FUNC_DEF"), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                adaptor.addChild(root_1, stream_typePostfixSyntax.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1439:42: ( argumentList )?
                if ( stream_argumentList.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentList.nextTree());

                }
                stream_argumentList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "castExpression"

    public static class functionCommon_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCommon"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1442:1: functionCommon : functionSignature block ;
    public final AS3Parser.functionCommon_return functionCommon() throws RecognitionException {
        AS3Parser.functionCommon_return retval = new AS3Parser.functionCommon_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.functionSignature_return functionSignature453 = null;

        AS3Parser.block_return block454 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1443:2: ( functionSignature block )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1443:4: functionSignature block
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_functionSignature_in_functionCommon5556);
            functionSignature453=functionSignature();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSignature453.getTree());
            pushFollow(FOLLOW_block_in_functionCommon5558);
            block454=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block454.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "functionCommon"

    public static class functionSignature_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionSignature"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1446:1: functionSignature : parameterDeclarationList ( typeExpression )? ;
    public final AS3Parser.functionSignature_return functionSignature() throws RecognitionException {
        AS3Parser.functionSignature_return retval = new AS3Parser.functionSignature_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.parameterDeclarationList_return parameterDeclarationList455 = null;

        AS3Parser.typeExpression_return typeExpression456 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1447:2: ( parameterDeclarationList ( typeExpression )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1447:4: parameterDeclarationList ( typeExpression )?
            {
            root_0 = (LinkedListTree)adaptor.nil();

            pushFollow(FOLLOW_parameterDeclarationList_in_functionSignature5569);
            parameterDeclarationList455=parameterDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterDeclarationList455.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1447:29: ( typeExpression )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==COLON) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1447:29: typeExpression
                    {
                    pushFollow(FOLLOW_typeExpression_in_functionSignature5571);
                    typeExpression456=typeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExpression456.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "functionSignature"

    public static class parameterDeclarationList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDeclarationList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1452:1: parameterDeclarationList : LPAREN ( parameterDeclaration ( COMMA parameterDeclaration )* )? RPAREN -> ^( PARAMS ( parameterDeclaration )* ) ;
    public final AS3Parser.parameterDeclarationList_return parameterDeclarationList() throws RecognitionException {
        AS3Parser.parameterDeclarationList_return retval = new AS3Parser.parameterDeclarationList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LPAREN457=null;
        Token COMMA459=null;
        Token RPAREN461=null;
        AS3Parser.parameterDeclaration_return parameterDeclaration458 = null;

        AS3Parser.parameterDeclaration_return parameterDeclaration460 = null;


        LinkedListTree LPAREN457_tree=null;
        LinkedListTree COMMA459_tree=null;
        LinkedListTree RPAREN461_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_parameterDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule parameterDeclaration");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1453:2: ( LPAREN ( parameterDeclaration ( COMMA parameterDeclaration )* )? RPAREN -> ^( PARAMS ( parameterDeclaration )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1453:4: LPAREN ( parameterDeclaration ( COMMA parameterDeclaration )* )? RPAREN
            {
            LPAREN457=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameterDeclarationList5585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN457);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1454:3: ( parameterDeclaration ( COMMA parameterDeclaration )* )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==IDENT||(LA103_0>=USE && LA103_0<=NAMESPACE)||LA103_0==DYNAMIC||(LA103_0>=GET && LA103_0<=SET)||LA103_0==CONST||(LA103_0>=IS && LA103_0<=AS)||LA103_0==REST) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1454:5: parameterDeclaration ( COMMA parameterDeclaration )*
                    {
                    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList5592);
                    parameterDeclaration458=parameterDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameterDeclaration.add(parameterDeclaration458.getTree());
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1454:26: ( COMMA parameterDeclaration )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==COMMA) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1454:27: COMMA parameterDeclaration
                    	    {
                    	    COMMA459=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameterDeclarationList5595); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA459);

                    	    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList5597);
                    	    parameterDeclaration460=parameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_parameterDeclaration.add(parameterDeclaration460.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN461=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameterDeclarationList5607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN461);



            // AST REWRITE
            // elements: parameterDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1456:3: -> ^( PARAMS ( parameterDeclaration )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1456:6: ^( PARAMS ( parameterDeclaration )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARAMS, "PARAMS"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1456:16: ( parameterDeclaration )*
                while ( stream_parameterDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterDeclaration.nextTree());

                }
                stream_parameterDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "parameterDeclarationList"

    public static class parameterDeclaration_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDeclaration"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1459:1: parameterDeclaration : ( basicParameterDeclaration | parameterRestDeclaration );
    public final AS3Parser.parameterDeclaration_return parameterDeclaration() throws RecognitionException {
        AS3Parser.parameterDeclaration_return retval = new AS3Parser.parameterDeclaration_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.basicParameterDeclaration_return basicParameterDeclaration462 = null;

        AS3Parser.parameterRestDeclaration_return parameterRestDeclaration463 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1460:2: ( basicParameterDeclaration | parameterRestDeclaration )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==IDENT||(LA104_0>=USE && LA104_0<=NAMESPACE)||LA104_0==DYNAMIC||(LA104_0>=GET && LA104_0<=SET)||LA104_0==CONST||(LA104_0>=IS && LA104_0<=AS)) ) {
                alt104=1;
            }
            else if ( (LA104_0==REST) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1460:4: basicParameterDeclaration
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_basicParameterDeclaration_in_parameterDeclaration5631);
                    basicParameterDeclaration462=basicParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, basicParameterDeclaration462.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1461:4: parameterRestDeclaration
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_parameterRestDeclaration_in_parameterDeclaration5637);
                    parameterRestDeclaration463=parameterRestDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameterRestDeclaration463.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "parameterDeclaration"

    public static class basicParameterDeclaration_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basicParameterDeclaration"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1464:1: basicParameterDeclaration : ( CONST )? ident ( typeExpression )? ( parameterDefault )? -> ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? ) ;
    public final AS3Parser.basicParameterDeclaration_return basicParameterDeclaration() throws RecognitionException {
        AS3Parser.basicParameterDeclaration_return retval = new AS3Parser.basicParameterDeclaration_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token CONST464=null;
        AS3Parser.ident_return ident465 = null;

        AS3Parser.typeExpression_return typeExpression466 = null;

        AS3Parser.parameterDefault_return parameterDefault467 = null;


        LinkedListTree CONST464_tree=null;
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_typeExpression=new RewriteRuleSubtreeStream(adaptor,"rule typeExpression");
        RewriteRuleSubtreeStream stream_parameterDefault=new RewriteRuleSubtreeStream(adaptor,"rule parameterDefault");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:2: ( ( CONST )? ident ( typeExpression )? ( parameterDefault )? -> ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:4: ( CONST )? ident ( typeExpression )? ( parameterDefault )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:4: ( CONST )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==CONST) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:4: CONST
                    {
                    CONST464=(Token)match(input,CONST,FOLLOW_CONST_in_basicParameterDeclaration5648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST.add(CONST464);


                    }
                    break;

            }

            pushFollow(FOLLOW_ident_in_basicParameterDeclaration5651);
            ident465=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident465.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:17: ( typeExpression )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==COLON) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:17: typeExpression
                    {
                    pushFollow(FOLLOW_typeExpression_in_basicParameterDeclaration5653);
                    typeExpression466=typeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeExpression.add(typeExpression466.getTree());

                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:33: ( parameterDefault )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==ASSIGN) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1465:33: parameterDefault
                    {
                    pushFollow(FOLLOW_parameterDefault_in_basicParameterDeclaration5656);
                    parameterDefault467=parameterDefault();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameterDefault.add(parameterDefault467.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ident, CONST, parameterDefault, typeExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1466:3: -> ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1466:6: ^( PARAM ( CONST )? ident ( typeExpression )? ( parameterDefault )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARAM, "PARAM"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1466:15: ( CONST )?
                if ( stream_CONST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CONST.nextNode());

                }
                stream_CONST.reset();
                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1466:28: ( typeExpression )?
                if ( stream_typeExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeExpression.nextTree());

                }
                stream_typeExpression.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1466:44: ( parameterDefault )?
                if ( stream_parameterDefault.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterDefault.nextTree());

                }
                stream_parameterDefault.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "basicParameterDeclaration"

    public static class parameterDefault_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterDefault"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1469:1: parameterDefault : ASSIGN assignmentExpression ;
    public final AS3Parser.parameterDefault_return parameterDefault() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.parameterDefault_return retval = new AS3Parser.parameterDefault_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token ASSIGN468=null;
        AS3Parser.assignmentExpression_return assignmentExpression469 = null;


        LinkedListTree ASSIGN468_tree=null;


        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1475:2: ( ASSIGN assignmentExpression )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1475:4: ASSIGN assignmentExpression
            {
            root_0 = (LinkedListTree)adaptor.nil();

            ASSIGN468=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_parameterDefault5702); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN468_tree = (LinkedListTree)adaptor.create(ASSIGN468);
            root_0 = (LinkedListTree)adaptor.becomeRoot(ASSIGN468_tree, root_0);
            }
            pushFollow(FOLLOW_assignmentExpression_in_parameterDefault5705);
            assignmentExpression469=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression469.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "parameterDefault"

    public static class parameterRestDeclaration_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterRestDeclaration"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1478:1: parameterRestDeclaration : REST ( ident )? -> ^( PARAM REST ( ident )? ) ;
    public final AS3Parser.parameterRestDeclaration_return parameterRestDeclaration() throws RecognitionException {
        AS3Parser.parameterRestDeclaration_return retval = new AS3Parser.parameterRestDeclaration_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token REST470=null;
        AS3Parser.ident_return ident471 = null;


        LinkedListTree REST470_tree=null;
        RewriteRuleTokenStream stream_REST=new RewriteRuleTokenStream(adaptor,"token REST");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1479:2: ( REST ( ident )? -> ^( PARAM REST ( ident )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1479:4: REST ( ident )?
            {
            REST470=(Token)match(input,REST,FOLLOW_REST_in_parameterRestDeclaration5716); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REST.add(REST470);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1479:9: ( ident )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==IDENT||(LA108_0>=USE && LA108_0<=NAMESPACE)||LA108_0==DYNAMIC||(LA108_0>=GET && LA108_0<=SET)||(LA108_0>=IS && LA108_0<=AS)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1479:9: ident
                    {
                    pushFollow(FOLLOW_ident_in_parameterRestDeclaration5718);
                    ident471=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident471.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ident, REST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1480:3: -> ^( PARAM REST ( ident )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1480:6: ^( PARAM REST ( ident )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARAM, "PARAM"), root_1);

                adaptor.addChild(root_1, stream_REST.nextNode());
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1480:20: ( ident )?
                if ( stream_ident.hasNext() ) {
                    adaptor.addChild(root_1, stream_ident.nextTree());

                }
                stream_ident.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "parameterRestDeclaration"

    public static class argumentList_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentList"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1483:1: argumentList : ( LPAREN expressionList RPAREN -> ^( ARGUMENTS expressionList ) | LPAREN RPAREN -> ARGUMENTS );
    public final AS3Parser.argumentList_return argumentList() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.argumentList_return retval = new AS3Parser.argumentList_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LPAREN472=null;
        Token RPAREN474=null;
        Token LPAREN475=null;
        Token RPAREN476=null;
        AS3Parser.expressionList_return expressionList473 = null;


        LinkedListTree LPAREN472_tree=null;
        LinkedListTree RPAREN474_tree=null;
        LinkedListTree LPAREN475_tree=null;
        LinkedListTree RPAREN476_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");

        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1488:2: ( LPAREN expressionList RPAREN -> ^( ARGUMENTS expressionList ) | LPAREN RPAREN -> ARGUMENTS )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==LPAREN) ) {
                int LA109_1 = input.LA(2);

                if ( (LA109_1==RPAREN) ) {
                    alt109=2;
                }
                else if ( (LA109_1==LBRACE||LA109_1==IDENT||LA109_1==LBRACK||LA109_1==LPAREN||LA109_1==STRING_LITERAL||LA109_1==NAMESPACE||(LA109_1>=DYNAMIC && LA109_1<=FINAL)||LA109_1==OVERRIDE||(LA109_1>=STATIC && LA109_1<=NATIVE)||(LA109_1>=FUNCTION && LA109_1<=SET)||LA109_1==EACH||LA109_1==VOID||(LA109_1>=PLUS && LA109_1<=MINUS)||(LA109_1>=INC && LA109_1<=BNOT)||(LA109_1>=UNDEFINED && LA109_1<=FLOAT_LITERAL)||LA109_1==E4X_ATTRI) ) {
                    alt109=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1488:4: LPAREN expressionList RPAREN
                    {
                    LPAREN472=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentList5755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN472);

                    pushFollow(FOLLOW_expressionList_in_argumentList5757);
                    expressionList473=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList473.getTree());
                    RPAREN474=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentList5759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN474);



                    // AST REWRITE
                    // elements: expressionList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1489:3: -> ^( ARGUMENTS expressionList )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1489:6: ^( ARGUMENTS expressionList )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                        adaptor.addChild(root_1, stream_expressionList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1490:4: LPAREN RPAREN
                    {
                    LPAREN475=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_argumentList5776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN475);

                    RPAREN476=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_argumentList5778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN476);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 1491:3: -> ARGUMENTS
                    {
                        adaptor.addChild(root_0, (LinkedListTree)adaptor.create(ARGUMENTS, "ARGUMENTS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "argumentList"

    public static class vectorInitializer_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vectorInitializer"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1494:1: vectorInitializer : LT type GT arrayLiteral -> ^( VECTOR_INIT type arrayLiteral ) ;
    public final AS3Parser.vectorInitializer_return vectorInitializer() throws RecognitionException {
        AS3Parser.vectorInitializer_return retval = new AS3Parser.vectorInitializer_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LT477=null;
        Token GT479=null;
        AS3Parser.type_return type478 = null;

        AS3Parser.arrayLiteral_return arrayLiteral480 = null;


        LinkedListTree LT477_tree=null;
        LinkedListTree GT479_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_arrayLiteral=new RewriteRuleSubtreeStream(adaptor,"rule arrayLiteral");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1495:2: ( LT type GT arrayLiteral -> ^( VECTOR_INIT type arrayLiteral ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1496:3: LT type GT arrayLiteral
            {
            LT477=(Token)match(input,LT,FOLLOW_LT_in_vectorInitializer5797); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LT.add(LT477);

            pushFollow(FOLLOW_type_in_vectorInitializer5799);
            type478=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type478.getTree());
            GT479=(Token)match(input,GT,FOLLOW_GT_in_vectorInitializer5801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GT.add(GT479);

            pushFollow(FOLLOW_arrayLiteral_in_vectorInitializer5803);
            arrayLiteral480=arrayLiteral();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayLiteral.add(arrayLiteral480.getTree());


            // AST REWRITE
            // elements: type, arrayLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1497:3: -> ^( VECTOR_INIT type arrayLiteral )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1497:6: ^( VECTOR_INIT type arrayLiteral )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(VECTOR_INIT, "VECTOR_INIT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_arrayLiteral.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "vectorInitializer"

    public static class encapsulatedExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "encapsulatedExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1505:1: encapsulatedExpression : LPAREN assignmentExpression RPAREN -> ^( ENCPS_EXPR assignmentExpression ) ;
    public final AS3Parser.encapsulatedExpression_return encapsulatedExpression() throws RecognitionException {
        InOperator_stack.push(new InOperator_scope());

        AS3Parser.encapsulatedExpression_return retval = new AS3Parser.encapsulatedExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LPAREN481=null;
        Token RPAREN483=null;
        AS3Parser.assignmentExpression_return assignmentExpression482 = null;


        LinkedListTree LPAREN481_tree=null;
        LinkedListTree RPAREN483_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");

        	((InOperator_scope)InOperator_stack.peek()).allowed = true;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1510:2: ( LPAREN assignmentExpression RPAREN -> ^( ENCPS_EXPR assignmentExpression ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1510:4: LPAREN assignmentExpression RPAREN
            {
            LPAREN481=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_encapsulatedExpression5843); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN481);

            pushFollow(FOLLOW_assignmentExpression_in_encapsulatedExpression5845);
            assignmentExpression482=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression482.getTree());
            RPAREN483=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_encapsulatedExpression5847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN483);



            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 1511:3: -> ^( ENCPS_EXPR assignmentExpression )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1511:6: ^( ENCPS_EXPR assignmentExpression )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ENCPS_EXPR, "ENCPS_EXPR"), root_1);

                adaptor.addChild(root_1, stream_assignmentExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
            InOperator_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "encapsulatedExpression"

    public static class e4xExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "e4xExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1514:1: e4xExpression : ( STAR | e4xAttributeIdentifier | e4xFilterPredicate | eitherIdentifier );
    public final AS3Parser.e4xExpression_return e4xExpression() throws RecognitionException {
        AS3Parser.e4xExpression_return retval = new AS3Parser.e4xExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token STAR484=null;
        AS3Parser.e4xAttributeIdentifier_return e4xAttributeIdentifier485 = null;

        AS3Parser.e4xFilterPredicate_return e4xFilterPredicate486 = null;

        AS3Parser.eitherIdentifier_return eitherIdentifier487 = null;


        LinkedListTree STAR484_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1515:2: ( STAR | e4xAttributeIdentifier | e4xFilterPredicate | eitherIdentifier )
            int alt110=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt110=1;
                }
                break;
            case E4X_ATTRI:
                {
                alt110=2;
                }
                break;
            case LPAREN:
                {
                alt110=3;
                }
                break;
            case IDENT:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1515:4: STAR
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    STAR484=(Token)match(input,STAR,FOLLOW_STAR_in_e4xExpression5870); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR484_tree = (LinkedListTree)adaptor.create(STAR484);
                    adaptor.addChild(root_0, STAR484_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1516:4: e4xAttributeIdentifier
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_e4xAttributeIdentifier_in_e4xExpression5875);
                    e4xAttributeIdentifier485=e4xAttributeIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e4xAttributeIdentifier485.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1517:4: e4xFilterPredicate
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_e4xFilterPredicate_in_e4xExpression5880);
                    e4xFilterPredicate486=e4xFilterPredicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e4xFilterPredicate486.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1518:4: eitherIdentifier
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_eitherIdentifier_in_e4xExpression5885);
                    eitherIdentifier487=eitherIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eitherIdentifier487.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "e4xExpression"

    public static class e4xAttributeIdentifier_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "e4xAttributeIdentifier"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1521:1: e4xAttributeIdentifier : E4X_ATTRI ( eitherIdentifier | STAR | LBRACK expression RBRACK ) ;
    public final AS3Parser.e4xAttributeIdentifier_return e4xAttributeIdentifier() throws RecognitionException {
        AS3Parser.e4xAttributeIdentifier_return retval = new AS3Parser.e4xAttributeIdentifier_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token E4X_ATTRI488=null;
        Token STAR490=null;
        Token LBRACK491=null;
        Token RBRACK493=null;
        AS3Parser.eitherIdentifier_return eitherIdentifier489 = null;

        AS3Parser.expression_return expression492 = null;


        LinkedListTree E4X_ATTRI488_tree=null;
        LinkedListTree STAR490_tree=null;
        LinkedListTree LBRACK491_tree=null;
        LinkedListTree RBRACK493_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1522:2: ( E4X_ATTRI ( eitherIdentifier | STAR | LBRACK expression RBRACK ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1522:4: E4X_ATTRI ( eitherIdentifier | STAR | LBRACK expression RBRACK )
            {
            root_0 = (LinkedListTree)adaptor.nil();

            E4X_ATTRI488=(Token)match(input,E4X_ATTRI,FOLLOW_E4X_ATTRI_in_e4xAttributeIdentifier5896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            E4X_ATTRI488_tree = (LinkedListTree)adaptor.create(E4X_ATTRI488);
            adaptor.addChild(root_0, E4X_ATTRI488_tree);
            }
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1523:3: ( eitherIdentifier | STAR | LBRACK expression RBRACK )
            int alt111=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt111=1;
                }
                break;
            case STAR:
                {
                alt111=2;
                }
                break;
            case LBRACK:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1524:4: eitherIdentifier
                    {
                    pushFollow(FOLLOW_eitherIdentifier_in_e4xAttributeIdentifier5905);
                    eitherIdentifier489=eitherIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eitherIdentifier489.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1525:5: STAR
                    {
                    STAR490=(Token)match(input,STAR,FOLLOW_STAR_in_e4xAttributeIdentifier5911); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR490_tree = (LinkedListTree)adaptor.create(STAR490);
                    adaptor.addChild(root_0, STAR490_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1526:5: LBRACK expression RBRACK
                    {
                    LBRACK491=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_e4xAttributeIdentifier5917); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACK491_tree = (LinkedListTree)adaptor.create(LBRACK491);
                    adaptor.addChild(root_0, LBRACK491_tree);
                    }
                    pushFollow(FOLLOW_expression_in_e4xAttributeIdentifier5919);
                    expression492=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression492.getTree());
                    RBRACK493=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_e4xAttributeIdentifier5921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACK493_tree = (LinkedListTree)adaptor.create(RBRACK493);
                    adaptor.addChild(root_0, RBRACK493_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "e4xAttributeIdentifier"

    public static class e4xFilterPredicate_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "e4xFilterPredicate"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1530:1: e4xFilterPredicate : LPAREN expression RPAREN ;
    public final AS3Parser.e4xFilterPredicate_return e4xFilterPredicate() throws RecognitionException {
        AS3Parser.e4xFilterPredicate_return retval = new AS3Parser.e4xFilterPredicate_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LPAREN494=null;
        Token RPAREN496=null;
        AS3Parser.expression_return expression495 = null;


        LinkedListTree LPAREN494_tree=null;
        LinkedListTree RPAREN496_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1531:2: ( LPAREN expression RPAREN )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1531:4: LPAREN expression RPAREN
            {
            root_0 = (LinkedListTree)adaptor.nil();

            LPAREN494=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_e4xFilterPredicate5936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN494_tree = (LinkedListTree)adaptor.create(LPAREN494);
            adaptor.addChild(root_0, LPAREN494_tree);
            }
            pushFollow(FOLLOW_expression_in_e4xFilterPredicate5938);
            expression495=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression495.getTree());
            RPAREN496=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_e4xFilterPredicate5940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN496_tree = (LinkedListTree)adaptor.create(RPAREN496);
            adaptor.addChild(root_0, RPAREN496_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "e4xFilterPredicate"

    public static class xmlKeyword_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlKeyword"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1534:1: xmlKeyword : {...}? IDENT ;
    public final AS3Parser.xmlKeyword_return xmlKeyword() throws RecognitionException {
        AS3Parser.xmlKeyword_return retval = new AS3Parser.xmlKeyword_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token IDENT497=null;

        LinkedListTree IDENT497_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1535:2: ({...}? IDENT )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1535:4: {...}? IDENT
            {
            root_0 = (LinkedListTree)adaptor.nil();

            if ( !((input.LT(1).getText().equals("xml"))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "xmlKeyword", "input.LT(1).getText().equals(\"xml\")");
            }
            IDENT497=(Token)match(input,IDENT,FOLLOW_IDENT_in_xmlKeyword5953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT497_tree = (LinkedListTree)adaptor.create(IDENT497);
            adaptor.addChild(root_0, IDENT497_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "xmlKeyword"

    public static class notQuiteReservedWord_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notQuiteReservedWord"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1538:1: notQuiteReservedWord : ( NATIVE | EACH | GET | SET | NAMESPACE | DYNAMIC | FINAL | OVERRIDE | STATIC );
    public final AS3Parser.notQuiteReservedWord_return notQuiteReservedWord() throws RecognitionException {
        AS3Parser.notQuiteReservedWord_return retval = new AS3Parser.notQuiteReservedWord_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set498=null;

        LinkedListTree set498_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1539:2: ( NATIVE | EACH | GET | SET | NAMESPACE | DYNAMIC | FINAL | OVERRIDE | STATIC )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set498=(Token)input.LT(1);
            if ( input.LA(1)==NAMESPACE||(input.LA(1)>=DYNAMIC && input.LA(1)<=FINAL)||input.LA(1)==OVERRIDE||(input.LA(1)>=STATIC && input.LA(1)<=NATIVE)||(input.LA(1)>=GET && input.LA(1)<=SET)||input.LA(1)==EACH ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set498));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "notQuiteReservedWord"

    public static class allKeywords_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "allKeywords"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1542:1: allKeywords : ( reservedWord | notQuiteReservedWord ) ;
    public final AS3Parser.allKeywords_return allKeywords() throws RecognitionException {
        AS3Parser.allKeywords_return retval = new AS3Parser.allKeywords_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        AS3Parser.reservedWord_return reservedWord499 = null;

        AS3Parser.notQuiteReservedWord_return notQuiteReservedWord500 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1543:2: ( ( reservedWord | notQuiteReservedWord ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1543:4: ( reservedWord | notQuiteReservedWord )
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1543:4: ( reservedWord | notQuiteReservedWord )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==PACKAGE||LA112_0==INCLUDE||LA112_0==USE||LA112_0==IMPORT||LA112_0==INTERNAL||(LA112_0>=PRIVATE && LA112_0<=PUBLIC)||(LA112_0>=CLASS && LA112_0<=FUNCTION)||(LA112_0>=VAR && LA112_0<=FOR)||(LA112_0>=IN && LA112_0<=CASE)||(LA112_0>=DEFAULT && LA112_0<=VOID)||(LA112_0>=IS && LA112_0<=AS)||LA112_0==INSTANCEOF||(LA112_0>=DELETE && LA112_0<=TYPEOF)||(LA112_0>=THIS && LA112_0<=TRUE)) ) {
                alt112=1;
            }
            else if ( (LA112_0==NAMESPACE||(LA112_0>=DYNAMIC && LA112_0<=FINAL)||LA112_0==OVERRIDE||(LA112_0>=STATIC && LA112_0<=NATIVE)||(LA112_0>=GET && LA112_0<=SET)||LA112_0==EACH) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1543:6: reservedWord
                    {
                    pushFollow(FOLLOW_reservedWord_in_allKeywords6011);
                    reservedWord499=reservedWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reservedWord499.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1543:21: notQuiteReservedWord
                    {
                    pushFollow(FOLLOW_notQuiteReservedWord_in_allKeywords6015);
                    notQuiteReservedWord500=notQuiteReservedWord();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notQuiteReservedWord500.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "allKeywords"

    public static class reservedWord_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reservedWord"
    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1546:1: reservedWord : ( AS | BREAK | CASE | CATCH | CLASS | CONST | CONTINUE | DEFAULT | DELETE | DO | ELSE | EXTENDS | FALSE | FINALLY | FOR | FUNCTION | IF | IMPLEMENTS | IMPORT | IN | INSTANCEOF | INTERFACE | INTERNAL | IS | NEW | NULL | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SUPER | SWITCH | THIS | THROW | TRUE | TRY | TYPEOF | USE | VAR | VOID | WHILE | WITH | INCLUDE ) ;
    public final AS3Parser.reservedWord_return reservedWord() throws RecognitionException {
        AS3Parser.reservedWord_return retval = new AS3Parser.reservedWord_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set501=null;

        LinkedListTree set501_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1547:2: ( ( AS | BREAK | CASE | CATCH | CLASS | CONST | CONTINUE | DEFAULT | DELETE | DO | ELSE | EXTENDS | FALSE | FINALLY | FOR | FUNCTION | IF | IMPLEMENTS | IMPORT | IN | INSTANCEOF | INTERFACE | INTERNAL | IS | NEW | NULL | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SUPER | SWITCH | THIS | THROW | TRUE | TRY | TYPEOF | USE | VAR | VOID | WHILE | WITH | INCLUDE ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1548:2: ( AS | BREAK | CASE | CATCH | CLASS | CONST | CONTINUE | DEFAULT | DELETE | DO | ELSE | EXTENDS | FALSE | FINALLY | FOR | FUNCTION | IF | IMPLEMENTS | IMPORT | IN | INSTANCEOF | INTERFACE | INTERNAL | IS | NEW | NULL | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SUPER | SWITCH | THIS | THROW | TRUE | TRY | TYPEOF | USE | VAR | VOID | WHILE | WITH | INCLUDE )
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set501=(Token)input.LT(1);
            if ( input.LA(1)==PACKAGE||input.LA(1)==INCLUDE||input.LA(1)==USE||input.LA(1)==IMPORT||input.LA(1)==INTERNAL||(input.LA(1)>=PRIVATE && input.LA(1)<=PUBLIC)||(input.LA(1)>=CLASS && input.LA(1)<=FUNCTION)||(input.LA(1)>=VAR && input.LA(1)<=FOR)||(input.LA(1)>=IN && input.LA(1)<=CASE)||(input.LA(1)>=DEFAULT && input.LA(1)<=VOID)||(input.LA(1)>=IS && input.LA(1)<=AS)||input.LA(1)==INSTANCEOF||(input.LA(1)>=DELETE && input.LA(1)<=TYPEOF)||(input.LA(1)>=THIS && input.LA(1)<=TRUE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set501));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "reservedWord"

    // $ANTLR start synpred1_AS3
    public final void synpred1_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:346:5: ( ident DOT )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:346:6: ident DOT
        {
        pushFollow(FOLLOW_ident_in_synpred1_AS3857);
        ident();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred1_AS3859); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_AS3

    // $ANTLR start synpred3_AS3
    public final void synpred3_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:527:3: ( configIdent LBRACE )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:527:4: configIdent LBRACE
        {
        pushFollow(FOLLOW_configIdent_in_synpred3_AS31493);
        configIdent();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred3_AS31495); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_AS3

    // $ANTLR start synpred4_AS3
    public final void synpred4_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:529:3: ( LBRACE )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:529:4: LBRACE
        {
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred4_AS31508); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_AS3

    // $ANTLR start synpred5_AS3
    public final void synpred5_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:559:3: ( configIdent LBRACE )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:559:4: configIdent LBRACE
        {
        pushFollow(FOLLOW_configIdent_in_synpred5_AS31633);
        configIdent();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred5_AS31635); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_AS3

    // $ANTLR start synpred6_AS3
    public final void synpred6_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:561:3: ( LBRACE )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:561:4: LBRACE
        {
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred6_AS31648); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_AS3

    // $ANTLR start synpred7_AS3
    public final void synpred7_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:696:4: ( FOR EACH )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:696:5: FOR EACH
        {
        match(input,FOR,FOLLOW_FOR_in_synpred7_AS32212); if (state.failed) return ;
        match(input,EACH,FOLLOW_EACH_in_synpred7_AS32214); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_AS3

    // $ANTLR start synpred8_AS3
    public final void synpred8_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:787:5: ( ELSE )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:787:6: ELSE
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred8_AS32540); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_AS3

    // $ANTLR start synpred9_AS3
    public final void synpred9_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:820:4: ( forInClauseDecl IN )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:820:5: forInClauseDecl IN
        {
        pushFollow(FOLLOW_forInClauseDecl_in_synpred9_AS32671);
        forInClauseDecl();

        state._fsp--;
        if (state.failed) return ;
        match(input,IN,FOLLOW_IN_in_synpred9_AS32673); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_AS3

    // $ANTLR start synpred10_AS3
    public final void synpred10_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1077:28: ( assignmentOperator )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1077:29: assignmentOperator
        {
        pushFollow(FOLLOW_assignmentOperator_in_synpred10_AS33812);
        assignmentOperator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_AS3

    // $ANTLR start synpred11_AS3
    public final void synpred11_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1089:6: ( '*' '=' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1089:7: '*' '='
        {
        match(input,STAR,FOLLOW_STAR_in_synpred11_AS33856); if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred11_AS33858); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_AS3

    // $ANTLR start synpred12_AS3
    public final void synpred12_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1097:6: ( '>' '>' '=' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1097:7: '>' '>' '='
        {
        match(input,GT,FOLLOW_GT_in_synpred12_AS33905); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred12_AS33907); if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred12_AS33909); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_AS3

    // $ANTLR start synpred13_AS3
    public final void synpred13_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1098:6: ( '>' '>' '>' '=' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1098:7: '>' '>' '>' '='
        {
        match(input,GT,FOLLOW_GT_in_synpred13_AS33933); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred13_AS33935); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred13_AS33937); if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred13_AS33939); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_AS3

    // $ANTLR start synpred14_AS3
    public final void synpred14_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1181:5: ( relationalOperator )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1181:6: relationalOperator
        {
        pushFollow(FOLLOW_relationalOperator_in_synpred14_AS34295);
        relationalOperator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_AS3

    // $ANTLR start synpred15_AS3
    public final void synpred15_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1187:5: ( '>' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1187:6: '>'
        {
        match(input,GT,FOLLOW_GT_in_synpred15_AS34327); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_AS3

    // $ANTLR start synpred16_AS3
    public final void synpred16_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1188:6: ( '>' '=' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1188:7: '>' '='
        {
        match(input,GT,FOLLOW_GT_in_synpred16_AS34347); if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred16_AS34349); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_AS3

    // $ANTLR start synpred17_AS3
    public final void synpred17_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1201:6: ( '>' '>' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1201:7: '>' '>'
        {
        match(input,GT,FOLLOW_GT_in_synpred17_AS34441); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred17_AS34443); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_AS3

    // $ANTLR start synpred18_AS3
    public final void synpred18_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1202:6: ( '>' '>' '>' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1202:7: '>' '>' '>'
        {
        match(input,GT,FOLLOW_GT_in_synpred18_AS34465); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred18_AS34467); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred18_AS34469); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_AS3

    // Delegated rules

    public final boolean synpred7_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_AS3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA14_eotS =
        "\24\uffff";
    static final String DFA14_eofS =
        "\24\uffff";
    static final String DFA14_minS =
        "\1\117\1\126\1\124\2\126\2\124\2\126\6\uffff\1\117\1\uffff\1\117"+
        "\2\uffff";
    static final String DFA14_maxS =
        "\1\u00b7\10\126\6\uffff\1\u00b7\1\uffff\1\u00b7\2\uffff";
    static final String DFA14_acceptS =
        "\11\uffff\1\2\5\3\1\uffff\1\5\1\uffff\1\1\1\4";
    static final String DFA14_specialS =
        "\1\5\1\3\1\uffff\1\1\1\0\2\uffff\1\4\1\2\13\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\10\uffff\1\11\1\2\1\4\2\uffff\1\16\1\3\1\12\1\13\1\12"+
            "\3\uffff\2\12\5\uffff\1\7\1\10\5\uffff\1\12\10\uffff\1\14\6"+
            "\uffff\1\15\2\uffff\1\5\1\6\47\uffff\11\11",
            "\1\17",
            "\2\20\1\21",
            "\1\21",
            "\1\21",
            "\2\20\1\21",
            "\2\20\1\21",
            "\1\21",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\10\uffff\1\22\1\uffff\1\23\2\uffff\5\23\3\uffff\2\23"+
            "\5\uffff\2\23\5\uffff\1\23\10\uffff\1\23\6\uffff\1\23\53\uffff"+
            "\11\22",
            "",
            "\1\23\10\uffff\1\22\1\uffff\1\23\2\uffff\5\23\3\uffff\2\23"+
            "\5\uffff\2\23\5\uffff\1\23\10\uffff\1\23\6\uffff\1\23\53\uffff"+
            "\11\22",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "342:1: metaTagParam : ( ident ASSIGN constant -> ^( ASSIGN ident constant ) | constant -> constant | ( ident DOT )=> type -> type | ident ASSIGN ( ident DOT )=> type -> ^( ASSIGN ident type ) | ident -> ident );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_4==ASSIGN) ) {s = 17;}

                        else if ( (synpred1_AS3()) ) {s = 14;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_3==ASSIGN) ) {s = 17;}

                        else if ( (synpred1_AS3()) ) {s = 14;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_8==ASSIGN) ) {s = 17;}

                        else if ( (synpred1_AS3()) ) {s = 14;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_1==ASSIGN) ) {s = 15;}

                        else if ( (synpred1_AS3()) ) {s = 14;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_7==ASSIGN) ) {s = 17;}

                        else if ( (synpred1_AS3()) ) {s = 14;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==IDENT) ) {s = 1;}

                        else if ( (LA14_0==USE) ) {s = 2;}

                        else if ( (LA14_0==DYNAMIC) ) {s = 3;}

                        else if ( (LA14_0==NAMESPACE) ) {s = 4;}

                        else if ( (LA14_0==IS) ) {s = 5;}

                        else if ( (LA14_0==AS) ) {s = 6;}

                        else if ( (LA14_0==GET) ) {s = 7;}

                        else if ( (LA14_0==SET) ) {s = 8;}

                        else if ( (LA14_0==STRING_LITERAL||(LA14_0>=NULL && LA14_0<=FLOAT_LITERAL)) ) {s = 9;}

                        else if ( (LA14_0==FINAL||LA14_0==OVERRIDE||(LA14_0>=STATIC && LA14_0<=NATIVE)||LA14_0==EACH) && (synpred1_AS3())) {s = 10;}

                        else if ( (LA14_0==INTERNAL) && (synpred1_AS3())) {s = 11;}

                        else if ( (LA14_0==DEFAULT) && (synpred1_AS3())) {s = 12;}

                        else if ( (LA14_0==VOID) && (synpred1_AS3())) {s = 13;}

                        else if ( (LA14_0==STAR) && (synpred1_AS3())) {s = 14;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\21\uffff";
    static final String DFA27_eofS =
        "\21\uffff";
    static final String DFA27_minS =
        "\1\114\1\0\17\uffff";
    static final String DFA27_maxS =
        "\1\u0087\1\0\17\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\1\3\14\uffff\1\1";
    static final String DFA27_specialS =
        "\1\0\1\1\17\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\2\uffff\1\1\1\uffff\1\3\5\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\11\3\4\uffff\5\3\26\uffff\2\3",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "525:1: classTypeBlockEntry : ( ( configIdent LBRACE )=> configBlockEntry | ( LBRACE )=> staticBlockEntry | (a= annotations m= modifiers ( fieldDefinitionBlockEntry[$a.tree,$m.tree] | classMethodDefinitionBlockEntry[$a.tree,$m.tree] | staticLinkEntry ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==IDENT) ) {s = 1;}

                        else if ( (LA27_0==LBRACE) && (synpred4_AS3())) {s = 2;}

                        else if ( (LA27_0==LBRACK||LA27_0==INCLUDE||(LA27_0>=USE && LA27_0<=IMPORT)||(LA27_0>=DYNAMIC && LA27_0<=NATIVE)||(LA27_0>=FUNCTION && LA27_0<=CONST)||(LA27_0>=IS && LA27_0<=AS)) ) {s = 3;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_AS3()) ) {s = 16;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\57\uffff";
    static final String DFA37_eofS =
        "\57\uffff";
    static final String DFA37_minS =
        "\1\114\1\0\55\uffff";
    static final String DFA37_maxS =
        "\1\u00b9\1\0\55\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\2\53\uffff\1\1";
    static final String DFA37_specialS =
        "\1\uffff\1\0\55\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\3\uffff\5\2\2\uffff"+
            "\2\2\1\uffff\1\2\3\uffff\2\2\4\uffff\6\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\2\uffff\10\2\34\uffff\2\2\2\uffff\6\2\1\uffff"+
            "\15\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "681:1: statement options {k=1; } : ({...}? block | statementTail );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == LBRACE )) ) {s = 46;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\35\uffff";
    static final String DFA38_eofS =
        "\1\uffff\1\2\1\uffff\1\2\21\uffff\2\4\4\uffff\1\2\1\uffff";
    static final String DFA38_minS =
        "\1\114\1\115\1\uffff\1\115\2\uffff\1\123\16\uffff\2\114\1\uffff"+
        "\1\117\2\uffff\1\114\1\uffff";
    static final String DFA38_maxS =
        "\1\u00b9\1\u00aa\1\uffff\1\u00aa\2\uffff\1\163\16\uffff\2\u00b9"+
        "\1\uffff\1\117\2\uffff\1\u00aa\1\uffff";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\2\uffff\1\14\1\uffff\1"+
        "\4\1\5\1\uffff\1\24";
    static final String DFA38_specialS =
        "\6\uffff\1\0\26\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\2\1\uffff\1\24\1\3\1\uffff\1\2\1\uffff\1\2\3\uffff\1\21"+
            "\1\2\1\23\1\1\1\22\2\uffff\2\2\1\uffff\1\2\3\uffff\2\2\4\uffff"+
            "\3\2\2\4\1\5\1\uffff\1\6\1\2\1\uffff\1\16\1\17\2\uffff\1\15"+
            "\2\uffff\1\20\1\7\1\10\1\14\1\13\1\11\1\12\1\2\34\uffff\2\2"+
            "\2\uffff\6\2\1\uffff\15\2\1\uffff\1\2",
            "\2\2\1\4\2\2\1\uffff\2\2\1\uffff\1\2\2\uffff\2\4\1\uffff\2"+
            "\2\1\4\15\uffff\2\4\6\uffff\1\2\17\uffff\2\2\1\25\1\26\36\2"+
            "\4\uffff\1\2",
            "",
            "\2\2\1\uffff\1\30\1\2\1\uffff\2\2\1\uffff\1\2\5\uffff\2\2"+
            "\26\uffff\1\2\6\uffff\1\27\10\uffff\42\2\4\uffff\1\2",
            "",
            "",
            "\1\32\37\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\2\2\4\1\2\1\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\4\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\2\2\1\uffff\1\2\3\uffff\2\2\4\uffff"+
            "\3\2\5\uffff\1\2\7\uffff\1\4\7\uffff\1\2\34\uffff\2\2\2\uffff"+
            "\6\2\1\uffff\15\2\1\uffff\1\2",
            "\1\2\2\4\1\2\1\uffff\1\2\1\uffff\1\2\1\4\1\uffff\1\4\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\2\2\1\uffff\1\2\3\uffff\2\2\4\uffff"+
            "\3\2\5\uffff\1\2\7\uffff\1\4\7\uffff\1\2\34\uffff\2\2\2\uffff"+
            "\6\2\1\uffff\15\2\1\uffff\1\2",
            "",
            "\1\33",
            "",
            "",
            "\1\34\2\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\5\uffff\2\2"+
            "\26\uffff\1\2\17\uffff\42\2\4\uffff\1\2",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "692:4: ( declarationStatement | expressionStatement | ifStatement | ( FOR EACH )=> forEachStatement | forStatement | whileStatement | doWhileStatement | continueStatement | breakStatement | returnStatement | withStatement | labelStatement | switchStatement | throwStatement | tryStatement | defaultXMLNamespaceStatement | includeDirective | importDirective | useNamespaceDirective | configBlockDirective | emptyStatement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA38_6==EACH) && (synpred7_AS3())) {s = 25;}

                        else if ( (LA38_6==LPAREN) ) {s = 26;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\45\uffff";
    static final String DFA43_eofS =
        "\45\uffff";
    static final String DFA43_minS =
        "\1\114\2\0\1\uffff\2\0\2\uffff\2\0\33\uffff";
    static final String DFA43_maxS =
        "\1\u00b9\2\0\1\uffff\2\0\2\uffff\2\0\33\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\1\2\uffff\2\1\2\uffff\1\2\32\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\1\uffff\1\3\1\4\2\uffff\1\5\1\6\33\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\12\1\uffff\1\12\1\2\1\uffff\1\12\1\uffff\1\12\4\uffff\1"+
            "\12\1\3\1\1\3\uffff\1\4\1\12\1\uffff\1\12\3\uffff\2\12\4\uffff"+
            "\1\12\1\10\1\11\2\5\3\uffff\1\12\17\uffff\1\12\2\uffff\1\6\1"+
            "\7\30\uffff\2\12\2\uffff\6\12\1\uffff\15\12\1\uffff\1\12",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "819:3: ( ( forInClauseDecl IN )=> forInClause RPAREN statement -> ^( FOR_IN[$f] forInClause statement ) | traditionalForClause RPAREN statement -> ^( $f traditionalForClause statement ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==NAMESPACE) ) {s = 1;}

                        else if ( (LA43_0==IDENT) ) {s = 2;}

                        else if ( (LA43_0==USE) && (synpred9_AS3())) {s = 3;}

                        else if ( (LA43_0==DYNAMIC) ) {s = 4;}

                        else if ( ((LA43_0>=VAR && LA43_0<=CONST)) ) {s = 5;}

                        else if ( (LA43_0==IS) && (synpred9_AS3())) {s = 6;}

                        else if ( (LA43_0==AS) && (synpred9_AS3())) {s = 7;}

                        else if ( (LA43_0==GET) ) {s = 8;}

                        else if ( (LA43_0==SET) ) {s = 9;}

                        else if ( (LA43_0==LBRACE||LA43_0==SEMI||LA43_0==LBRACK||LA43_0==LPAREN||LA43_0==STRING_LITERAL||LA43_0==FINAL||LA43_0==OVERRIDE||(LA43_0>=STATIC && LA43_0<=NATIVE)||LA43_0==FUNCTION||LA43_0==EACH||LA43_0==VOID||(LA43_0>=PLUS && LA43_0<=MINUS)||(LA43_0>=INC && LA43_0<=BNOT)||(LA43_0>=UNDEFINED && LA43_0<=FLOAT_LITERAL)||LA43_0==E4X_ATTRI) ) {s = 10;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_AS3()) ) {s = 7;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred9_AS3()||(synpred9_AS3()&&(input.LT(1).getText().equals("xml"))))) ) {s = 7;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_4 = input.LA(1);

                         
                        int index43_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_AS3()) ) {s = 7;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index43_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_AS3()) ) {s = 7;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_8 = input.LA(1);

                         
                        int index43_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_AS3()) ) {s = 7;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index43_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_9 = input.LA(1);

                         
                        int index43_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_AS3()) ) {s = 7;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index43_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\13\uffff";
    static final String DFA65_eofS =
        "\13\uffff";
    static final String DFA65_minS =
        "\1\117\1\0\11\uffff";
    static final String DFA65_maxS =
        "\1\u0087\1\0\11\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\1\1\3";
    static final String DFA65_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\11\uffff\1\2\1\4\3\uffff\1\3\15\uffff\1\7\1\10\30\uffff"+
            "\1\5\1\6",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "1041:1: ident : ( IDENT | i= USE -> IDENT[$i] | xmlKeyword | i= DYNAMIC -> IDENT[$i] | i= NAMESPACE -> IDENT[$i] | i= IS -> IDENT[$i] | i= AS -> IDENT[$i] | i= GET -> IDENT[$i] | i= SET -> IDENT[$i] );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((input.LT(1).getText().equals("xml"))))) ) {s = 9;}

                        else if ( ((input.LT(1).getText().equals("xml"))) ) {s = 10;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\20\uffff";
    static final String DFA67_eofS =
        "\1\1\17\uffff";
    static final String DFA67_minS =
        "\1\115\1\uffff\15\0\1\uffff";
    static final String DFA67_maxS =
        "\1\u0091\1\uffff\15\0\1\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA67_specialS =
        "\2\uffff\1\10\1\11\1\3\1\4\1\6\1\12\1\14\1\2\1\1\1\0\1\13\1\7\1"+
        "\5\1\uffff}>";
    static final String[] DFA67_transitionS = {
            "\2\1\3\uffff\1\1\1\uffff\2\1\1\2\6\uffff\1\3\26\uffff\1\1\6"+
            "\uffff\1\1\11\uffff\1\11\2\uffff\1\4\1\5\1\6\1\7\1\10\1\12\1"+
            "\13\1\14\1\15\1\16",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "()* loopback of 1077:26: ( ( assignmentOperator )=>o= assignmentOperator assignmentExpression )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_5 = input.LA(1);

                         
                        int index67_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_3 = input.LA(1);

                         
                        int index67_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_3);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_7 = input.LA(1);

                         
                        int index67_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_7);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_AS3()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\21\uffff";
    static final String DFA68_eofS =
        "\21\uffff";
    static final String DFA68_minS =
        "\1\126\7\uffff\1\u0085\5\uffff\1\126\2\uffff";
    static final String DFA68_maxS =
        "\1\u0091\7\uffff\1\u0085\5\uffff\1\u0085\2\uffff";
    static final String DFA68_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\15"+
        "\1\16\1\uffff\1\10\1\11";
    static final String DFA68_specialS =
        "\1\1\15\uffff\1\0\2\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\6\uffff\1\2\47\uffff\1\10\2\uffff\1\3\1\4\1\5\1\6\1\7"+
            "\1\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\17\56\uffff\1\20",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "1086:1: assignmentOperator : ( ASSIGN | ( ( '*' '=' )=> '*' '=' -> STAR_ASSIGN[\"*=\"] ) | DIV_ASSIGN | MOD_ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | SL_ASSIGN | ( ( '>' '>' '=' )=> '>' '>' '=' -> SR_ASSIGN[\">>=\"] ) | ( ( '>' '>' '>' '=' )=> '>' '>' '>' '=' -> BSR_ASSIGN[\">>>=\"] ) | BAND_ASSIGN | BXOR_ASSIGN | BOR_ASSIGN | LAND_ASSIGN | LOR_ASSIGN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA68_14==ASSIGN) && (synpred12_AS3())) {s = 15;}

                        else if ( (LA68_14==GT) && (synpred13_AS3())) {s = 16;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_0 = input.LA(1);

                         
                        int index68_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA68_0==ASSIGN) ) {s = 1;}

                        else if ( (LA68_0==STAR) && (synpred11_AS3())) {s = 2;}

                        else if ( (LA68_0==DIV_ASSIGN) ) {s = 3;}

                        else if ( (LA68_0==MOD_ASSIGN) ) {s = 4;}

                        else if ( (LA68_0==PLUS_ASSIGN) ) {s = 5;}

                        else if ( (LA68_0==MINUS_ASSIGN) ) {s = 6;}

                        else if ( (LA68_0==SL_ASSIGN) ) {s = 7;}

                        else if ( (LA68_0==GT) ) {s = 8;}

                        else if ( (LA68_0==BAND_ASSIGN) ) {s = 9;}

                        else if ( (LA68_0==BXOR_ASSIGN) ) {s = 10;}

                        else if ( (LA68_0==BOR_ASSIGN) ) {s = 11;}

                        else if ( (LA68_0==LAND_ASSIGN) ) {s = 12;}

                        else if ( (LA68_0==LOR_ASSIGN) ) {s = 13;}

                         
                        input.seek(index68_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\42\uffff";
    static final String DFA76_eofS =
        "\1\1\41\uffff";
    static final String DFA76_minS =
        "\1\115\16\uffff\1\0\11\uffff\1\0\10\uffff";
    static final String DFA76_maxS =
        "\1\u009e\16\uffff\1\0\11\uffff\1\0\10\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\2\33\uffff\5\1";
    static final String DFA76_specialS =
        "\1\0\16\uffff\1\1\11\uffff\1\2\10\uffff}>";
    static final String[] DFA76_transitionS = {
            "\2\1\3\uffff\1\1\1\uffff\3\1\6\uffff\1\1\26\uffff\1\31\6\uffff"+
            "\1\1\11\uffff\1\17\1\37\1\40\24\1\1\35\1\36\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "()* loopback of 1181:3: ( ( relationalOperator )=>o= relationalOperator shiftExpression )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_0 = input.LA(1);

                         
                        int index76_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA76_0==EOF||(LA76_0>=RBRACE && LA76_0<=SEMI)||LA76_0==RBRACK||(LA76_0>=COMMA && LA76_0<=ASSIGN)||LA76_0==STAR||LA76_0==COLON||(LA76_0>=DIV_ASSIGN && LA76_0<=EQUAL)) ) {s = 1;}

                        else if ( (LA76_0==GT) ) {s = 15;}

                        else if ( (LA76_0==IN) ) {s = 25;}

                        else if ( (LA76_0==LT) && (synpred14_AS3())) {s = 29;}

                        else if ( (LA76_0==LE) && (synpred14_AS3())) {s = 30;}

                        else if ( (LA76_0==IS) && (synpred14_AS3())) {s = 31;}

                        else if ( (LA76_0==AS) && (synpred14_AS3())) {s = 32;}

                        else if ( (LA76_0==INSTANCEOF) && (synpred14_AS3())) {s = 33;}

                         
                        input.seek(index76_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_AS3()) ) {s = 33;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred14_AS3()&&(((InOperator_scope)InOperator_stack.peek()).allowed))) ) {s = 33;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\40\uffff";
    static final String DFA78_eofS =
        "\1\uffff\1\37\36\uffff";
    static final String DFA78_minS =
        "\1\164\1\114\36\uffff";
    static final String DFA78_maxS =
        "\1\u009e\1\u00b9\36\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\3\1\2\34\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\36\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\2\20\uffff\1\1\2\2\24\uffff\3\2",
            "\1\32\2\uffff\1\20\1\uffff\1\31\1\uffff\1\33\2\uffff\1\3\1"+
            "\uffff\1\26\1\uffff\1\21\3\uffff\2\21\1\uffff\1\21\3\uffff\2"+
            "\21\4\uffff\1\35\2\21\5\uffff\1\21\17\uffff\1\11\34\uffff\1"+
            "\7\1\6\2\uffff\1\4\1\5\1\10\1\12\1\13\1\14\1\uffff\1\15\1\16"+
            "\1\17\1\36\1\22\1\23\1\24\1\27\1\30\4\25\1\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "1185:1: relationalOperator : ( ( ( '>' )=> '>' -> GT[\">\"] ) | ( ( '>' '=' )=> '>' '=' -> GE[\">=\"] ) | ({...}? IN | LT | LE | IS | AS | INSTANCEOF ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA78_1==ASSIGN) && (synpred16_AS3())) {s = 3;}

                        else if ( (LA78_1==INC) && (synpred15_AS3())) {s = 4;}

                        else if ( (LA78_1==DEC) && (synpred15_AS3())) {s = 5;}

                        else if ( (LA78_1==MINUS) && (synpred15_AS3())) {s = 6;}

                        else if ( (LA78_1==PLUS) && (synpred15_AS3())) {s = 7;}

                        else if ( (LA78_1==DELETE) && (synpred15_AS3())) {s = 8;}

                        else if ( (LA78_1==VOID) && (synpred15_AS3())) {s = 9;}

                        else if ( (LA78_1==TYPEOF) && (synpred15_AS3())) {s = 10;}

                        else if ( (LA78_1==LNOT) && (synpred15_AS3())) {s = 11;}

                        else if ( (LA78_1==BNOT) && (synpred15_AS3())) {s = 12;}

                        else if ( (LA78_1==UNDEFINED) && (synpred15_AS3())) {s = 13;}

                        else if ( (LA78_1==THIS) && (synpred15_AS3())) {s = 14;}

                        else if ( (LA78_1==SUPER) && (synpred15_AS3())) {s = 15;}

                        else if ( (LA78_1==IDENT) && (synpred15_AS3())) {s = 16;}

                        else if ( (LA78_1==NAMESPACE||(LA78_1>=DYNAMIC && LA78_1<=FINAL)||LA78_1==OVERRIDE||(LA78_1>=STATIC && LA78_1<=NATIVE)||(LA78_1>=GET && LA78_1<=SET)||LA78_1==EACH) && (synpred15_AS3())) {s = 17;}

                        else if ( (LA78_1==NULL) && (synpred15_AS3())) {s = 18;}

                        else if ( (LA78_1==FALSE) && (synpred15_AS3())) {s = 19;}

                        else if ( (LA78_1==TRUE) && (synpred15_AS3())) {s = 20;}

                        else if ( ((LA78_1>=HEX_LITERAL && LA78_1<=FLOAT_LITERAL)) && (synpred15_AS3())) {s = 21;}

                        else if ( (LA78_1==STRING_LITERAL) && (synpred15_AS3())) {s = 22;}

                        else if ( (LA78_1==XML_LITERAL) && (synpred15_AS3())) {s = 23;}

                        else if ( (LA78_1==REGEXP_LITERAL) && (synpred15_AS3())) {s = 24;}

                        else if ( (LA78_1==LBRACK) && (synpred15_AS3())) {s = 25;}

                        else if ( (LA78_1==LBRACE) && (synpred15_AS3())) {s = 26;}

                        else if ( (LA78_1==LPAREN) && (synpred15_AS3())) {s = 27;}

                        else if ( (LA78_1==E4X_ATTRI) && (synpred15_AS3())) {s = 28;}

                        else if ( (LA78_1==FUNCTION) && (synpred15_AS3())) {s = 29;}

                        else if ( (LA78_1==NEW) && (synpred15_AS3())) {s = 30;}

                        else if ( (LA78_1==EOF) && (synpred15_AS3())) {s = 31;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\40\uffff";
    static final String DFA80_eofS =
        "\40\uffff";
    static final String DFA80_minS =
        "\1\u0085\1\uffff\1\u0085\1\114\34\uffff";
    static final String DFA80_maxS =
        "\1\u009f\1\uffff\1\u0085\1\u00b9\34\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\33\2";
    static final String DFA80_specialS =
        "\3\uffff\1\0\34\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\2\31\uffff\1\1",
            "",
            "\1\3",
            "\1\33\2\uffff\1\21\1\uffff\1\32\1\uffff\1\34\4\uffff\1\27"+
            "\1\uffff\1\22\3\uffff\2\22\1\uffff\1\22\3\uffff\2\22\4\uffff"+
            "\1\36\2\22\5\uffff\1\22\17\uffff\1\12\1\uffff\1\4\32\uffff\1"+
            "\10\1\7\2\uffff\1\5\1\6\1\11\1\13\1\14\1\15\1\uffff\1\16\1\17"+
            "\1\20\1\37\1\23\1\24\1\25\1\30\1\31\4\26\1\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "1199:1: shiftOperator : ( SL | ( ( '>' '>' )=> '>' '>' -> SR[\">>\"] ) | ( ( '>' '>' '>' )=> '>' '>' '>' -> BSR[\">>>\"] ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_3 = input.LA(1);

                         
                        int index80_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA80_3==GT) && (synpred18_AS3())) {s = 4;}

                        else if ( (LA80_3==INC) && (synpred17_AS3())) {s = 5;}

                        else if ( (LA80_3==DEC) && (synpred17_AS3())) {s = 6;}

                        else if ( (LA80_3==MINUS) && (synpred17_AS3())) {s = 7;}

                        else if ( (LA80_3==PLUS) && (synpred17_AS3())) {s = 8;}

                        else if ( (LA80_3==DELETE) && (synpred17_AS3())) {s = 9;}

                        else if ( (LA80_3==VOID) && (synpred17_AS3())) {s = 10;}

                        else if ( (LA80_3==TYPEOF) && (synpred17_AS3())) {s = 11;}

                        else if ( (LA80_3==LNOT) && (synpred17_AS3())) {s = 12;}

                        else if ( (LA80_3==BNOT) && (synpred17_AS3())) {s = 13;}

                        else if ( (LA80_3==UNDEFINED) && (synpred17_AS3())) {s = 14;}

                        else if ( (LA80_3==THIS) && (synpred17_AS3())) {s = 15;}

                        else if ( (LA80_3==SUPER) && (synpred17_AS3())) {s = 16;}

                        else if ( (LA80_3==IDENT) && (synpred17_AS3())) {s = 17;}

                        else if ( (LA80_3==NAMESPACE||(LA80_3>=DYNAMIC && LA80_3<=FINAL)||LA80_3==OVERRIDE||(LA80_3>=STATIC && LA80_3<=NATIVE)||(LA80_3>=GET && LA80_3<=SET)||LA80_3==EACH) && (synpred17_AS3())) {s = 18;}

                        else if ( (LA80_3==NULL) && (synpred17_AS3())) {s = 19;}

                        else if ( (LA80_3==FALSE) && (synpred17_AS3())) {s = 20;}

                        else if ( (LA80_3==TRUE) && (synpred17_AS3())) {s = 21;}

                        else if ( ((LA80_3>=HEX_LITERAL && LA80_3<=FLOAT_LITERAL)) && (synpred17_AS3())) {s = 22;}

                        else if ( (LA80_3==STRING_LITERAL) && (synpred17_AS3())) {s = 23;}

                        else if ( (LA80_3==XML_LITERAL) && (synpred17_AS3())) {s = 24;}

                        else if ( (LA80_3==REGEXP_LITERAL) && (synpred17_AS3())) {s = 25;}

                        else if ( (LA80_3==LBRACK) && (synpred17_AS3())) {s = 26;}

                        else if ( (LA80_3==LBRACE) && (synpred17_AS3())) {s = 27;}

                        else if ( (LA80_3==LPAREN) && (synpred17_AS3())) {s = 28;}

                        else if ( (LA80_3==E4X_ATTRI) && (synpred17_AS3())) {s = 29;}

                        else if ( (LA80_3==FUNCTION) && (synpred17_AS3())) {s = 30;}

                        else if ( (LA80_3==NEW) && (synpred17_AS3())) {s = 31;}

                         
                        input.seek(index80_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\13\uffff";
    static final String DFA88_eofS =
        "\1\1\12\uffff";
    static final String DFA88_minS =
        "\1\115\3\uffff\1\117\6\uffff";
    static final String DFA88_maxS =
        "\1\u00aa\3\uffff\1\u00b9\6\uffff";
    static final String DFA88_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\uffff\1\4\1\6\1\10\1\5\1\3\1\7";
    static final String DFA88_specialS =
        "\13\uffff}>";
    static final String[] DFA88_transitionS = {
            "\2\1\1\uffff\1\6\1\3\1\1\1\2\3\1\5\uffff\1\4\1\1\26\uffff\1"+
            "\1\6\uffff\1\1\10\uffff\1\5\41\1\4\uffff\1\7",
            "",
            "",
            "",
            "\1\11\3\uffff\1\10\145\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "()* loopback of 1268:2: ( ( argumentList -> ^( FUNCTION_CALL $leftHandSideExpression argumentList ) ) | ( LBRACK expression rb= RBRACK -> ^( ARRAY_ACCESS $leftHandSideExpression expression ) ) | ( DOT eitherIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression eitherIdentifier ) ) | typePostfixSyntax -> ^( $leftHandSideExpression memberExpression typePostfixSyntax ) | DOT LPAREN expression RPAREN -> ^( E4X_FILTER $leftHandSideExpression expression ) | DBL_COLON eitherIdentifier -> ^( DBL_COLON $leftHandSideExpression eitherIdentifier ) | DOT e4xAttributeIdentifier -> ^( FIELD_ACCESS $leftHandSideExpression e4xAttributeIdentifier ) | E4X_DESC e4xExpression -> ^( E4X_DESC $leftHandSideExpression e4xExpression ) )*";
        }
    }
 

    public static final BitSet FOLLOW_asCompilationUnit_in_compilationUnit368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_packageBlockEntry_in_mxmlScriptUnit399 = new BitSet(new long[]{0x0000000000000002L,0x0000CCFFCE82C000L});
    public static final BitSet FOLLOW_statement_in_program427 = new BitSet(new long[]{0x0000000000000002L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_packageDecl_in_asCompilationUnit457 = new BitSet(new long[]{0x0000000000000000L,0x0000CCFFCE82C000L});
    public static final BitSet FOLLOW_packageBlockEntry_in_asCompilationUnit461 = new BitSet(new long[]{0x0000000000000000L,0x0000CCFFCE82C000L});
    public static final BitSet FOLLOW_EOF_in_asCompilationUnit466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDecl479 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4009000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_packageDecl482 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4009000L,0x0000000000000008L});
    public static final BitSet FOLLOW_packageBlock_in_packageDecl485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_packageBlock497 = new BitSet(new long[]{0x0000000000000000L,0x0000CCFFCE82E000L});
    public static final BitSet FOLLOW_packageBlockEntry_in_packageBlock499 = new BitSet(new long[]{0x0000000000000000L,0x0000CCFFCE82E000L});
    public static final BitSet FOLLOW_RBRACE_in_packageBlock502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_packageBlockEntry533 = new BitSet(new long[]{0x0000000000000000L,0x0000CCFFCE828000L});
    public static final BitSet FOLLOW_modifiers_in_packageBlockEntry541 = new BitSet(new long[]{0x0000000000000000L,0x0000CCFFCE828000L});
    public static final BitSet FOLLOW_classDefinition_in_packageBlockEntry550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDefinition_in_packageBlockEntry557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDefinition_in_packageBlockEntry564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_packageBlockEntry571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_packageBlockEntry583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_endOfFile598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotations615 = new BitSet(new long[]{0x0000000000000002L,0x000000000A828000L});
    public static final BitSet FOLLOW_configBlockDirective_in_annotation649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metaDirective_in_annotation656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_includeDirective_in_annotation662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importDirective_in_annotation669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useNamespaceDirective_in_annotation676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_configIdent696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_DBL_COLON_in_configIdent698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_configIdent701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configIdent_in_configBlockDirective715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_configBlockDirective717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_metaDirective742 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_metaDirective744 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_metaDirectiveList_in_metaDirective746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACK_in_metaDirective749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMI_in_metaDirective751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_metaDirectiveList781 = new BitSet(new long[]{0x0000000000000000L,0x10083063E7208000L,0x00FF8000000000C8L});
    public static final BitSet FOLLOW_metaTagParam_in_metaDirectiveList785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_COMMA_in_metaDirectiveList789 = new BitSet(new long[]{0x0000000000000000L,0x10083063E7008000L,0x00FF8000000000C8L});
    public static final BitSet FOLLOW_metaTagParam_in_metaDirectiveList791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_RPAREN_in_metaDirectiveList799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_metaTagParam827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_metaTagParam829 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x00FF800000000000L});
    public static final BitSet FOLLOW_constant_in_metaTagParam831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_metaTagParam846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_metaTagParam863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_metaTagParam872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_metaTagParam874 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_metaTagParam883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_metaTagParam898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_includeDirective914 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_includeDirective917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_includeDirective919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_useNamespaceDirective931 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_useNamespaceDirective934 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_useNamespaceDirective936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_useNamespaceDirective938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDirective950 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_importDirective953 = new BitSet(new long[]{0x0000000000000000L,0x0000000010006000L});
    public static final BitSet FOLLOW_DOT_in_importDirective957 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_STAR_in_importDirective960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_importDirective965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_modifiers981 = new BitSet(new long[]{0x0000000000000002L,0x0000007FC0008000L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_semi1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semi1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semi1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDefinition1111 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_classDefinition1113 = new BitSet(new long[]{0x0000000000000000L,0x0000030000001000L});
    public static final BitSet FOLLOW_classExtendsClause_in_classDefinition1117 = new BitSet(new long[]{0x0000000000000000L,0x0000030000001000L});
    public static final BitSet FOLLOW_classImplementsClause_in_classDefinition1121 = new BitSet(new long[]{0x0000000000000000L,0x0000030000001000L});
    public static final BitSet FOLLOW_classTypeBlock_in_classDefinition1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_classExtendsClause1160 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_classExtendsClause1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_classImplementsClause1179 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_classImplementsClause1182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_classImplementsClause1186 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_classImplementsClause1189 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDefinition1216 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_interfaceDefinition1218 = new BitSet(new long[]{0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_interfaceExtendsClause_in_interfaceDefinition1222 = new BitSet(new long[]{0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_interfaceTypeBlock_in_interfaceDefinition1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_interfaceExtendsClause1258 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_interfaceExtendsClause1261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_interfaceExtendsClause1265 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_interfaceExtendsClause1268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDefinition1293 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_functionDefinition1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_functionDefinition1301 = new BitSet(new long[]{0x0000000000000000L,0x0800000000001000L});
    public static final BitSet FOLLOW_typeExpression_in_functionDefinition1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_functionDefinition1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifier_in_variableDefinition1406 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinition1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000106000L});
    public static final BitSet FOLLOW_COMMA_in_variableDefinition1412 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinition1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000106000L});
    public static final BitSet FOLLOW_semi_in_variableDefinition1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classTypeBlock1457 = new BitSet(new long[]{0x0000000000000000L,0x0000F87FCE82B000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_classTypeBlockEntry_in_classTypeBlock1461 = new BitSet(new long[]{0x0000000000000000L,0x0000F87FCE82B000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_RBRACE_in_classTypeBlock1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configBlockEntry_in_classTypeBlockEntry1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlockEntry_in_classTypeBlockEntry1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_classTypeBlockEntry1527 = new BitSet(new long[]{0x0000000000000000L,0x0000F87FCE829000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_modifiers_in_classTypeBlockEntry1537 = new BitSet(new long[]{0x0000000000000000L,0x0000F87FCE829000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_fieldDefinitionBlockEntry_in_classTypeBlockEntry1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classMethodDefinitionBlockEntry_in_classTypeBlockEntry1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticLinkEntry_in_classTypeBlockEntry1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceTypeBlock1596 = new BitSet(new long[]{0x0000000000000000L,0x000008000A82B000L});
    public static final BitSet FOLLOW_interfaceTypeBlockEntry_in_interfaceTypeBlock1600 = new BitSet(new long[]{0x0000000000000000L,0x000008000A82B000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceTypeBlock1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configBlockEntry_in_interfaceTypeBlockEntry1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlockEntry_in_interfaceTypeBlockEntry1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotations_in_interfaceTypeBlockEntry1668 = new BitSet(new long[]{0x0000000000000000L,0x000008000A829000L});
    public static final BitSet FOLLOW_interfaceMethodDefinitionBlockEntry_in_interfaceTypeBlockEntry1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configIdent_in_configBlockEntry1713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LBRACE_in_configBlockEntry1715 = new BitSet(new long[]{0x0000000000000000L,0x0000F87FCE82B000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_classTypeBlockEntry_in_configBlockEntry1717 = new BitSet(new long[]{0x0000000000000000L,0x0000F87FCE82B000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_RBRACE_in_configBlockEntry1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_staticBlockEntry1756 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AF000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_blockEntry_in_staticBlockEntry1758 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AF000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_RBRACE_in_staticBlockEntry1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_staticLinkEntry1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_staticLinkEntry1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifier_in_fieldDefinitionBlockEntry1829 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDefinitionBlockEntry1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000106000L});
    public static final BitSet FOLLOW_COMMA_in_fieldDefinitionBlockEntry1835 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_variableDeclarator_in_fieldDefinitionBlockEntry1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000106000L});
    public static final BitSet FOLLOW_semi_in_fieldDefinitionBlockEntry1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_classMethodDefinitionBlockEntry1882 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_optionalAccessorRole_in_classMethodDefinitionBlockEntry1888 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_classMethodDefinitionBlockEntry1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_classMethodDefinitionBlockEntry1899 = new BitSet(new long[]{0x0000000000000000L,0x0800000000001000L});
    public static final BitSet FOLLOW_typeExpression_in_classMethodDefinitionBlockEntry1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_classMethodDefinitionBlockEntry1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_interfaceMethodDefinitionBlockEntry1980 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_optionalAccessorRole_in_interfaceMethodDefinitionBlockEntry1986 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_interfaceMethodDefinitionBlockEntry1993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_interfaceMethodDefinitionBlockEntry1997 = new BitSet(new long[]{0x0000000000000000L,0x0800000000006000L});
    public static final BitSet FOLLOW_typeExpression_in_interfaceMethodDefinitionBlockEntry2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_interfaceMethodDefinitionBlockEntry2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accessorRole_in_optionalAccessorRole2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_accessorRole0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2116 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AF000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_blockEntry_in_block2118 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AF000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_RBRACE_in_block2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockEntry2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarationStatement_in_statementTail2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_statementTail2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statementTail2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statementTail2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStatement_in_statementTail2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelStatement_in_statementTail2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultXMLNamespaceStatement_in_statementTail2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_includeDirective_in_statementTail2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importDirective_in_statementTail2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useNamespaceDirective_in_statementTail2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configBlockDirective_in_statementTail2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_variableModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_variableDeclarator2351 = new BitSet(new long[]{0x0000000000000002L,0x0800000000400000L});
    public static final BitSet FOLLOW_typeExpression_in_variableDeclarator2353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarationStatement2397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_declarationStatement2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifier_in_declaration2411 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_variableDeclarator_in_declaration2414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_declarationTail_in_declaration2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_declarationTail2441 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_variableDeclarator_in_declarationTail2444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableInitializer2459 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableInitializer2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_emptyStatement2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_expressionStatement2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_expressionStatement2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement2528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_condition_in_ifStatement2531 = new BitSet(new long[]{0x0000000000000000L,0xF26FF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_ifStatement2533 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_elseClause_in_ifStatement2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseClause2558 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_elseClause2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_condition2572 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_condition2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_condition2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forEachStatement2605 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_EACH_in_forEachStatement2607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_forEachStatement2609 = new BitSet(new long[]{0x0000000000000000L,0x0000F00046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_forInClause_in_forEachStatement2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_forEachStatement2613 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_forEachStatement2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement2659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement2661 = new BitSet(new long[]{0x0000000000000000L,0x0008F862C70AD000L,0x02FFFBF3000000C8L});
    public static final BitSet FOLLOW_forInClause_in_forStatement2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement2678 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_forStatement2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_traditionalForClause_in_forStatement2706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement2708 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_forStatement2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInit_in_traditionalForClause2743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMI_in_traditionalForClause2747 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50AD000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_forCond_in_traditionalForClause2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SEMI_in_traditionalForClause2759 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_forIter_in_traditionalForClause2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInClauseDecl_in_forInClause2781 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_IN_in_forInClause2783 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_forInClauseTail_in_forInClause2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_forInClauseDecl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_forInClauseDecl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInClauseTail2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_forInit2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forInit2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forCond2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_forIter2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement2966 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_throwStatement2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_throwStatement2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement2983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_tryStatement2987 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_finallyBlock_in_tryStatement2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchBlock_in_tryStatement2997 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_finallyBlock_in_tryStatement3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchBlock3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_catchBlock3037 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_catchBlock3039 = new BitSet(new long[]{0x0000000000000000L,0x0800000000200000L});
    public static final BitSet FOLLOW_typeExpression_in_catchBlock3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_catchBlock3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_catchBlock3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyBlock3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_finallyBlock3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_condition_in_switchStatement3097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_switchBlock_in_switchStatement3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_switchBlock3112 = new BitSet(new long[]{0x0000000000000000L,0x1400000000002000L});
    public static final BitSet FOLLOW_caseStatement_in_switchBlock3118 = new BitSet(new long[]{0x0000000000000000L,0x1400000000002000L});
    public static final BitSet FOLLOW_defaultStatement_in_switchBlock3127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RBRACE_in_switchBlock3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStatement3161 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_caseStatement3164 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStatement3166 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_switchStatementList_in_caseStatement3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStatement3185 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStatement3188 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_switchStatementList_in_defaultStatement3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_switchStatementList3206 = new BitSet(new long[]{0x0000000000000002L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_WHILE_in_whileStatement3233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_condition_in_whileStatement3236 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_whileStatement3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doWhileStatement3249 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_doWhileStatement3252 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WHILE_in_doWhileStatement3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_condition_in_doWhileStatement3257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_doWhileStatement3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement3274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_condition_in_withStatement3277 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_withStatement3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_labelStatement3294 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_COLON_in_labelStatement3296 = new BitSet(new long[]{0x0000000000000000L,0xF26DF862CF8AD000L,0x02FFFBF30000000FL});
    public static final BitSet FOLLOW_statement_in_labelStatement3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement3327 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50AF000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_returnStatement3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_returnStatement3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement3344 = new BitSet(new long[]{0x0000000000000000L,0x000030004600E000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_continueStatement3347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_continueStatement3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement3361 = new BitSet(new long[]{0x0000000000000000L,0x000030004600E000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_breakStatement3364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_breakStatement3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultXMLNamespaceStatement3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_xmlKeyword_in_defaultXMLNamespaceStatement3380 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultXMLNamespaceStatement3382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_defaultXMLNamespaceStatement3384 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_defaultXMLNamespaceStatement3386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_semi_in_defaultXMLNamespaceStatement3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeExpression3422 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_typeExpression3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_type3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_type3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_standardQualifiedName_in_qualifiedName3492 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typePostfixSyntax_in_qualifiedName3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeSpecifier_in_standardQualifiedName3511 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_DOT_in_standardQualifiedName3515 = new BitSet(new long[]{0x0000000000000000L,0x10083063C4008000L});
    public static final BitSet FOLLOW_typeSpecifier_in_standardQualifiedName3518 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_IDENT_in_typeSpecifier3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notQuiteReservedWord_in_typeSpecifier3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNAL_in_typeSpecifier3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_typeSpecifier3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_namespaceName3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reservedNamespace_in_namespaceName3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reservedNamespace0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POST_in_typePostfixSyntax3599 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L});
    public static final BitSet FOLLOW_standardQualifiedName_in_typePostfixSyntax3603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_STAR_in_typePostfixSyntax3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_typePostfixSyntax_in_typePostfixSyntax3613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_typePostfixSyntax3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_ident3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlKeyword_in_ident3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_ident3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_ident3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_ident3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_ident3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_ident3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_ident3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList3777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_expressionList3781 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList3783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression3807 = new BitSet(new long[]{0x0000000000000002L,0x0000000020400000L,0x000000000003FF20L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression3822 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression3825 = new BitSet(new long[]{0x0000000000000002L,0x0000000020400000L,0x000000000003FF20L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentOperator3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_assignmentOperator3862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentOperator3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_assignmentOperator3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_assignmentOperator3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_assignmentOperator3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_assignmentOperator3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SL_ASSIGN_in_assignmentOperator3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator3913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator3915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentOperator3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator3943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator3945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_assignmentOperator3947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentOperator3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAND_ASSIGN_in_assignmentOperator3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BXOR_ASSIGN_in_assignmentOperator3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOR_ASSIGN_in_assignmentOperator3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAND_ASSIGN_in_assignmentOperator3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOR_ASSIGN_in_assignmentOperator3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression3996 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression4011 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_conditionalSubExpression_in_conditionalExpression4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalSubExpression4046 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalSubExpression4048 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalSubExpression4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression4064 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_logicalOrOperator_in_logicalOrExpression4072 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression4075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LOR_in_logicalOrOperator4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression4104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_logicalAndOperator_in_logicalAndExpression4112 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression4115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LAND_in_logicalAndOperator4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression4144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_BOR_in_bitwiseOrExpression4152 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression4155 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression4173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_BXOR_in_bitwiseXorExpression4181 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression4184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression4202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BAND_in_bitwiseAndExpression4210 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression4213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_equalityOperator_in_equalityExpression4238 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_set_in_equalityOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4288 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x00000000700000E0L});
    public static final BitSet FOLLOW_relationalOperator_in_relationalExpression4301 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4304 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x00000000700000E0L});
    public static final BitSet FOLLOW_GT_in_relationalOperator4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOperator4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_relationalOperator4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relationalOperator4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_relationalOperator4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_relationalOperator4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_relationalOperator4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_relationalOperator4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_relationalOperator4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000020L});
    public static final BitSet FOLLOW_shiftOperator_in_shiftExpression4412 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000020L});
    public static final BitSet FOLLOW_SL_in_shiftOperator4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOperator4447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_shiftOperator4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_shiftOperator4473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_shiftOperator4475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_shiftOperator4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_additiveOperator_in_additiveExpression4503 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_set_in_additiveOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4541 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression4550 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4553 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_STAR_in_multiplicativeOperator4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeOperator4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_multiplicativeOperator4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryExpression4606 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryExpression4626 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression4644 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression4661 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryExpressionNotPlusMinus4690 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryExpressionNotPlusMinus4707 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryExpressionNotPlusMinus4724 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LNOT_in_unaryExpressionNotPlusMinus4741 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BNOT_in_unaryExpressionNotPlusMinus4758 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression4848 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_argumentList_in_leftHandSideExpression4865 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression4890 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression4896 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_eitherIdentifier_in_leftHandSideExpression4921 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_typePostfixSyntax_in_leftHandSideExpression4944 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_leftHandSideExpression4966 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression4968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_leftHandSideExpression4970 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_DBL_COLON_in_leftHandSideExpression4989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_eitherIdentifier_in_leftHandSideExpression4991 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression5010 = new BitSet(new long[]{0x0000000000000000L,0x00083062C50A9000L,0x02FFB80000000000L});
    public static final BitSet FOLLOW_e4xAttributeIdentifier_in_leftHandSideExpression5012 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_E4X_DESC_in_leftHandSideExpression5031 = new BitSet(new long[]{0x0000000000000000L,0x00083062E50A9000L,0x02FFB80000000000L});
    public static final BitSet FOLLOW_e4xExpression_in_leftHandSideExpression5033 = new BitSet(new long[]{0x0000000000000002L,0x00000000100B0000L,0x0000040000000010L});
    public static final BitSet FOLLOW_IDENT_in_eitherIdentifier5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpressionHelper_in_primaryExpression5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEFINED_in_primaryExpressionHelper5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpressionHelper5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpressionHelper5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identiferLiteral_in_primaryExpressionHelper5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primaryExpressionHelper5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpressionHelper5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpressionHelper5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_encapsulatedExpression_in_primaryExpressionHelper5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_e4xAttributeIdentifier_in_primaryExpressionHelper5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression5161 = new BitSet(new long[]{0x0000000000000000L,0x00083062C50A9000L,0x02FFB80000000000L});
    public static final BitSet FOLLOW_primaryExpression_in_newExpression5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identiferLiteral5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notQuiteReservedWord_in_identiferLiteral5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_constant5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constant5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constant5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_constant5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_constant5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_LITERAL_in_constant5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_LITERAL_in_constant5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringLiteral5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral5294 = new BitSet(new long[]{0x0000000000000000L,0x00083862C51E9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_elementList_in_arrayLiteral5296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_elementList5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonemptyElementList_in_elementList5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_nonemptyElementList5342 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_nonemptyElementList5346 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_assignmentExpression_in_nonemptyElementList5349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral5368 = new BitSet(new long[]{0x0000000000000000L,0x00083062C500A000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_fieldList_in_objectLiteral5370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literalField_in_fieldList5398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMA_in_fieldList5402 = new BitSet(new long[]{0x0000000000000002L,0x00083062C5108000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_literalField_in_fieldList5405 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_fieldName_in_literalField5421 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_COLON_in_literalField5423 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_element_in_literalField5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identiferLiteral_in_fieldName5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_fieldName5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_fieldName5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_element5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_functionCommon_in_functionExpression5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_castExpression5523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typePostfixSyntax_in_castExpression5525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_argumentList_in_castExpression5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionSignature_in_functionCommon5556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_functionCommon5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_functionSignature5569 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_typeExpression_in_functionSignature5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parameterDeclarationList5585 = new BitSet(new long[]{0x0000000000000000L,0x0000B00046208000L,0x01000000000000C0L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList5592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_COMMA_in_parameterDeclarationList5595 = new BitSet(new long[]{0x0000000000000000L,0x0000B00046008000L,0x01000000000000C0L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList5597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_RPAREN_in_parameterDeclarationList5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicParameterDeclaration_in_parameterDeclaration5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterRestDeclaration_in_parameterDeclaration5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_basicParameterDeclaration5648 = new BitSet(new long[]{0x0000000000000000L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_basicParameterDeclaration5651 = new BitSet(new long[]{0x0000000000000002L,0x0800000000400000L});
    public static final BitSet FOLLOW_typeExpression_in_basicParameterDeclaration5653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_parameterDefault_in_basicParameterDeclaration5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_parameterDefault5702 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_assignmentExpression_in_parameterDefault5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REST_in_parameterRestDeclaration5716 = new BitSet(new long[]{0x0000000000000002L,0x0000300046008000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ident_in_parameterRestDeclaration5718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentList5755 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expressionList_in_argumentList5757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentList5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_argumentList5776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_argumentList5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_vectorInitializer5797 = new BitSet(new long[]{0x0000000000000000L,0x10083063E4008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_type_in_vectorInitializer5799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_vectorInitializer5801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_arrayLiteral_in_vectorInitializer5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_encapsulatedExpression5843 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_assignmentExpression_in_encapsulatedExpression5845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_encapsulatedExpression5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_e4xExpression5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_e4xAttributeIdentifier_in_e4xExpression5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_e4xFilterPredicate_in_e4xExpression5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eitherIdentifier_in_e4xExpression5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_E4X_ATTRI_in_e4xAttributeIdentifier5896 = new BitSet(new long[]{0x0000000000000000L,0x0000000020028000L});
    public static final BitSet FOLLOW_eitherIdentifier_in_e4xAttributeIdentifier5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_e4xAttributeIdentifier5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_e4xAttributeIdentifier5917 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_e4xAttributeIdentifier5919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACK_in_e4xAttributeIdentifier5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_e4xFilterPredicate5936 = new BitSet(new long[]{0x0000000000000000L,0x00083862C50A9000L,0x02FFFBF300000008L});
    public static final BitSet FOLLOW_expression_in_e4xFilterPredicate5938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RPAREN_in_e4xFilterPredicate5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_xmlKeyword5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_notQuiteReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reservedWord_in_allKeywords6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notQuiteReservedWord_in_allKeywords6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reservedWord6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_synpred1_AS3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DOT_in_synpred1_AS3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configIdent_in_synpred3_AS31493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred3_AS31495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_synpred4_AS31508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_configIdent_in_synpred5_AS31633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred5_AS31635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_synpred6_AS31648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_synpred7_AS32212 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_EACH_in_synpred7_AS32214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred8_AS32540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInClauseDecl_in_synpred9_AS32671 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_IN_in_synpred9_AS32673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperator_in_synpred10_AS33812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_synpred11_AS33856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred11_AS33858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred12_AS33905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_synpred12_AS33907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred12_AS33909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred13_AS33933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_synpred13_AS33935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_synpred13_AS33937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred13_AS33939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOperator_in_synpred14_AS34295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred15_AS34327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred16_AS34347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred16_AS34349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred17_AS34441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_synpred17_AS34443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred18_AS34465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_synpred18_AS34467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_synpred18_AS34469 = new BitSet(new long[]{0x0000000000000002L});

}