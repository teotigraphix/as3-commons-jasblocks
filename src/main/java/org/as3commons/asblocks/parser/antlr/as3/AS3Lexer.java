// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g 2011-08-16 07:44:02

package org.as3commons.asblocks.parser.antlr.as3;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class AS3Lexer extends Lexer {
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

    	private Token lastToken;

    	public Token nextToken()
    	{
    		CommonToken t = (CommonToken) super.nextToken();
    		if (t.getChannel() != HIDDEN)
    		{
    			lastToken = t;
    		}
    		return t;
    	}

    	/*
    	   Used for resolving ambiguity between operators and constants,
    	   such as division '/' versus the regular expression syntax /hello/
    	*/
    	private boolean constantIsOk()
    	{
    		// I added null for testing
    		if (lastToken == null)
    			return true;
    		int type = lastToken.getType();
    		return type == ASSIGN || type == LPAREN || type == LBRACK
    				|| type == RETURN || type == COLON || type == LNOT
    				|| type == LT || type == GT || type == EQUAL || type == COMMA;
    	}


    // delegates
    // delegators

    public AS3Lexer() {;} 
    public AS3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AS3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g"; }

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1605:8: ( 'final' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1605:10: 'final'
            {
            match("final"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "OVERRIDE"
    public final void mOVERRIDE() throws RecognitionException {
        try {
            int _type = OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1606:10: ( 'override' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1606:12: 'override'
            {
            match("override"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERRIDE"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1607:10: ( 'include' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1607:12: 'include'
            {
            match("include"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1608:8: ( 'throw' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1608:10: 'throw'
            {
            match("throw"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1609:6: ( 'try' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1609:8: 'try'
            {
            match("try"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1610:8: ( 'catch' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1610:10: 'catch'
            {
            match("catch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1611:10: ( 'finally' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1611:12: 'finally'
            {
            match("finally"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1612:7: ( 'void' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1612:9: 'void'
            {
            match("void"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "INSTANCEOF"
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1613:12: ( 'instanceof' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1613:14: 'instanceof'
            {
            match("instanceof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTANCEOF"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1614:10: ( 'delete' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1614:12: 'delete'
            {
            match("delete"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "TYPEOF"
    public final void mTYPEOF() throws RecognitionException {
        try {
            int _type = TYPEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1615:9: ( 'typeof' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1615:11: 'typeof'
            {
            match("typeof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPEOF"

    // $ANTLR start "UNDEFINED"
    public final void mUNDEFINED() throws RecognitionException {
        try {
            int _type = UNDEFINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1616:11: ( 'undefined' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1616:13: 'undefined'
            {
            match("undefined"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDEFINED"

    // $ANTLR start "NATIVE"
    public final void mNATIVE() throws RecognitionException {
        try {
            int _type = NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1618:9: ( 'native' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1618:11: 'native'
            {
            match("native"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATIVE"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1620:10: ( 'package' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1620:12: 'package'
            {
            match("package"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1621:9: ( 'public' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1621:11: 'public'
            {
            match("public"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1622:10: ( 'private' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1622:12: 'private'
            {
            match("private"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1623:11: ( 'protected' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1623:13: 'protected'
            {
            match("protected"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "INTERNAL"
    public final void mINTERNAL() throws RecognitionException {
        try {
            int _type = INTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1624:10: ( 'internal' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1624:12: 'internal'
            {
            match("internal"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERNAL"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1625:10: ( 'function' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1625:12: 'function'
            {
            match("function"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1626:10: ( 'extends' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1626:12: 'extends'
            {
            match("extends"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1627:12: ( 'implements' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1627:14: 'implements'
            {
            match("implements"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1628:6: ( 'var' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1628:8: 'var'
            {
            match("var"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1629:9: ( 'static' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1629:11: 'static'
            {
            match("static"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1630:5: ( 'if' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1630:7: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1631:9: ( 'import' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1631:11: 'import'
            {
            match("import"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1632:6: ( 'for' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1632:8: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "EACH"
    public final void mEACH() throws RecognitionException {
        try {
            int _type = EACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1633:7: ( 'each' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1633:9: 'each'
            {
            match("each"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EACH"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1634:5: ( 'in' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1634:7: 'in'
            {
            match("in"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1635:8: ( 'while' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1635:10: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1636:5: ( 'do' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1636:7: 'do'
            {
            match("do"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1637:9: ( 'switch' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1637:11: 'switch'
            {
            match("switch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1638:7: ( 'case' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1638:9: 'case'
            {
            match("case"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1639:10: ( 'default' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1639:12: 'default'
            {
            match("default"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1640:7: ( 'else' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1640:9: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1641:8: ( 'const' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1641:10: 'const'
            {
            match("const"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1642:8: ( 'class' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1642:10: 'class'
            {
            match("class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1643:11: ( 'interface' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1643:13: 'interface'
            {
            match("interface"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1644:7: ( 'true' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1644:9: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1645:8: ( 'false' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1645:10: 'false'
            {
            match("false"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "DYNAMIC"
    public final void mDYNAMIC() throws RecognitionException {
        try {
            int _type = DYNAMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1646:10: ( 'dynamic' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1646:12: 'dynamic'
            {
            match("dynamic"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DYNAMIC"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1647:6: ( 'use' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1647:8: 'use'
            {
            match("use"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1649:11: ( 'namespace' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1649:13: 'namespace'
            {
            match("namespace"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1650:5: ( 'is' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1650:7: 'is'
            {
            match("is"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1651:5: ( 'as' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1651:7: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1652:6: ( 'get' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1652:8: 'get'
            {
            match("get"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1653:6: ( 'set' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1653:8: 'set'
            {
            match("set"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1654:7: ( 'with' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1654:9: 'with'
            {
            match("with"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1655:9: ( 'return' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1655:11: 'return'
            {
            match("return"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1656:10: ( 'continue' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1656:12: 'continue'
            {
            match("continue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1657:8: ( 'break' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1657:10: 'break'
            {
            match("break"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1658:7: ( 'null' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1658:9: 'null'
            {
            match("null"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1659:6: ( 'new' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1659:8: 'new'
            {
            match("new"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1660:8: ( 'super' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1660:10: 'super'
            {
            match("super"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1661:7: ( 'this' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1661:9: 'this'
            {
            match("this"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1664:10: ( '?' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1664:12: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1665:9: ( '(' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1665:11: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1666:9: ( ')' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1666:11: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1667:9: ( '[' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1667:11: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1668:9: ( ']' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1668:11: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1669:9: ( '{' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1669:11: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1670:9: ( '}' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1670:11: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1671:8: ( ':' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1671:10: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DBL_COLON"
    public final void mDBL_COLON() throws RecognitionException {
        try {
            int _type = DBL_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1672:11: ( '::' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1672:13: '::'
            {
            match("::"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DBL_COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1673:8: ( ',' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1673:10: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1674:9: ( '=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1674:11: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1675:8: ( '==' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1675:10: '=='
            {
            match("=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "STRICT_EQUAL"
    public final void mSTRICT_EQUAL() throws RecognitionException {
        try {
            int _type = STRICT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1676:14: ( '===' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1676:16: '==='
            {
            match("==="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRICT_EQUAL"

    // $ANTLR start "LNOT"
    public final void mLNOT() throws RecognitionException {
        try {
            int _type = LNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1677:7: ( '!' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1677:9: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LNOT"

    // $ANTLR start "BNOT"
    public final void mBNOT() throws RecognitionException {
        try {
            int _type = BNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1678:7: ( '~' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1678:9: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BNOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1679:11: ( '!=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1679:13: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "STRICT_NOT_EQUAL"
    public final void mSTRICT_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = STRICT_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1680:17: ( '!==' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1680:19: '!=='
            {
            match("!=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRICT_NOT_EQUAL"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1681:7: ( '+' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1681:9: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PLUS_ASSIGN"
    public final void mPLUS_ASSIGN() throws RecognitionException {
        try {
            int _type = PLUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1682:13: ( '+=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1682:15: '+='
            {
            match("+="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_ASSIGN"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1683:6: ( '++' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1683:8: '++'
            {
            match("++"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1684:8: ( '-' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1684:10: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MINUS_ASSIGN"
    public final void mMINUS_ASSIGN() throws RecognitionException {
        try {
            int _type = MINUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1685:14: ( '-=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1685:16: '-='
            {
            match("-="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_ASSIGN"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1686:6: ( '--' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1686:8: '--'
            {
            match("--"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1687:7: ( '*' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1687:9: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1690:6: ( '%' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1690:8: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MOD_ASSIGN"
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1691:12: ( '%=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1691:14: '%='
            {
            match("%="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD_ASSIGN"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1697:5: ( '>' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1697:7: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "BXOR"
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1698:7: ( '^' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1698:9: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BXOR"

    // $ANTLR start "BXOR_ASSIGN"
    public final void mBXOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BXOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1699:13: ( '^=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1699:15: '^='
            {
            match("^="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BXOR_ASSIGN"

    // $ANTLR start "BOR"
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1700:6: ( '|' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1700:8: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOR"

    // $ANTLR start "BOR_ASSIGN"
    public final void mBOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1701:12: ( '|=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1701:14: '|='
            {
            match("|="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOR_ASSIGN"

    // $ANTLR start "LOR"
    public final void mLOR() throws RecognitionException {
        try {
            int _type = LOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1702:6: ( '||' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1702:8: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOR"

    // $ANTLR start "BAND"
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1703:7: ( '&' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1703:9: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAND"

    // $ANTLR start "BAND_ASSIGN"
    public final void mBAND_ASSIGN() throws RecognitionException {
        try {
            int _type = BAND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1704:13: ( '&=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1704:15: '&='
            {
            match("&="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAND_ASSIGN"

    // $ANTLR start "LAND"
    public final void mLAND() throws RecognitionException {
        try {
            int _type = LAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1705:7: ( '&&' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1705:9: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAND"

    // $ANTLR start "LAND_ASSIGN"
    public final void mLAND_ASSIGN() throws RecognitionException {
        try {
            int _type = LAND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1706:13: ( '&&=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1706:15: '&&='
            {
            match("&&="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAND_ASSIGN"

    // $ANTLR start "LOR_ASSIGN"
    public final void mLOR_ASSIGN() throws RecognitionException {
        try {
            int _type = LOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1707:12: ( '||=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1707:14: '||='
            {
            match("||="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOR_ASSIGN"

    // $ANTLR start "E4X_ATTRI"
    public final void mE4X_ATTRI() throws RecognitionException {
        try {
            int _type = E4X_ATTRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1708:11: ( '@' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1708:13: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "E4X_ATTRI"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1709:7: ( ';' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1709:9: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "BSLASH"
    public final void mBSLASH() throws RecognitionException {
        try {
            int _type = BSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1710:9: ( '\\\\' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1710:11: '\\\\'
            {
            match('\\'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSLASH"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1712:6: ( '.' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1712:8: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "E4X_DESC"
    public final void mE4X_DESC() throws RecognitionException {
        try {
            int _type = E4X_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1713:10: ( '..' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1713:12: '..'
            {
            match(".."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "E4X_DESC"

    // $ANTLR start "REST"
    public final void mREST() throws RecognitionException {
        try {
            int _type = REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1714:7: ( '...' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1714:9: '...'
            {
            match("..."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REST"

    // $ANTLR start "DIV_ASSIGN"
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1716:12: ( '/=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1716:14: '/='
            {
            match("/="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV_ASSIGN"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1717:5: ( '/' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1717:7: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "POST"
    public final void mPOST() throws RecognitionException {
        try {
            int _type = POST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1719:7: ( '.<' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1719:9: '.<'
            {
            match(".<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POST"

    // $ANTLR start "SL"
    public final void mSL() throws RecognitionException {
        try {
            int _type = SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1721:5: ( '<<' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1721:7: '<<'
            {
            match("<<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL"

    // $ANTLR start "SL_ASSIGN"
    public final void mSL_ASSIGN() throws RecognitionException {
        try {
            int _type = SL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1722:11: ( '<<=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1722:13: '<<='
            {
            match("<<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_ASSIGN"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1723:5: ( '<=' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1723:7: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1724:5: ( '<' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1724:7: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "REGEXP_LITERAL"
    public final void mREGEXP_LITERAL() throws RecognitionException {
        try {
            int _type = REGEXP_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1730:2: ({...}? => '/' REGEX_BODY '/' ( REGEX_POSTFIX )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1730:4: {...}? => '/' REGEX_BODY '/' ( REGEX_POSTFIX )?
            {
            if ( !(( constantIsOk() )) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "REGEXP_LITERAL", " constantIsOk() ");
            }
            match('/'); if (state.failed) return ;
            mREGEX_BODY(); if (state.failed) return ;
            match('/'); if (state.failed) return ;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1730:45: ( REGEX_POSTFIX )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1730:45: REGEX_POSTFIX
                    {
                    mREGEX_POSTFIX(); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP_LITERAL"

    // $ANTLR start "REGEX_POSTFIX"
    public final void mREGEX_POSTFIX() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1734:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1734:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )+
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1734:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "REGEX_POSTFIX"

    // $ANTLR start "REGEX_BODY"
    public final void mREGEX_BODY() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1738:2: ( ( (~ ( '\\n' | '\\r' | '*' | '/' | '\\\\' ) ) | '\\\\' (~ ( '\\n' | '\\r' ) ) ) ( (~ ( '\\n' | '\\r' | '/' | '\\\\' ) ) | '\\\\' (~ ( '\\n' | '\\r' ) ) )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1738:4: ( (~ ( '\\n' | '\\r' | '*' | '/' | '\\\\' ) ) | '\\\\' (~ ( '\\n' | '\\r' ) ) ) ( (~ ( '\\n' | '\\r' | '/' | '\\\\' ) ) | '\\\\' (~ ( '\\n' | '\\r' ) ) )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1738:4: ( (~ ( '\\n' | '\\r' | '*' | '/' | '\\\\' ) ) | '\\\\' (~ ( '\\n' | '\\r' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='\\') ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1739:4: (~ ( '\\n' | '\\r' | '*' | '/' | '\\\\' ) )
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1739:4: (~ ( '\\n' | '\\r' | '*' | '/' | '\\\\' ) )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1739:6: ~ ( '\\n' | '\\r' | '*' | '/' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1741:4: '\\\\' (~ ( '\\n' | '\\r' ) )
                    {
                    match('\\'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1741:8: (~ ( '\\n' | '\\r' ) )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1741:9: ~ ( '\\n' | '\\r' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1743:3: ( (~ ( '\\n' | '\\r' | '/' | '\\\\' ) ) | '\\\\' (~ ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }
                else if ( (LA4_0=='\\') ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1744:4: (~ ( '\\n' | '\\r' | '/' | '\\\\' ) )
            	    {
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1744:4: (~ ( '\\n' | '\\r' | '/' | '\\\\' ) )
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1744:5: ~ ( '\\n' | '\\r' | '/' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1746:4: '\\\\' (~ ( '\\n' | '\\r' ) )
            	    {
            	    match('\\'); if (state.failed) return ;
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1746:8: (~ ( '\\n' | '\\r' ) )
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1746:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "REGEX_BODY"

    // $ANTLR start "XML_LITERAL"
    public final void mXML_LITERAL() throws RecognitionException {
        try {
            int _type = XML_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1751:2: ( ( XML_LITERAL )=> XML_SUBTREE )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1751:4: ( XML_LITERAL )=> XML_SUBTREE
            {
            mXML_SUBTREE(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_LITERAL"

    // $ANTLR start "XML_SUBTREE"
    public final void mXML_SUBTREE() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:2: ( '<' ( IDENT | XML_BINDING ) ( XML_WS | XML_ATTRIBUTE )* ( '>' ( XML_SUBTREE | XML_TEXTNODE | XML_COMMENT | XML_CDATA | XML_BINDING )* '</' IDENT '>' | '/>' ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:4: '<' ( IDENT | XML_BINDING ) ( XML_WS | XML_ATTRIBUTE )* ( '>' ( XML_SUBTREE | XML_TEXTNODE | XML_COMMENT | XML_CDATA | XML_BINDING )* '</' IDENT '>' | '/>' )
            {
            match('<'); if (state.failed) return ;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:8: ( IDENT | XML_BINDING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='$'||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='{') ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:9: IDENT
                    {
                    mIDENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:17: XML_BINDING
                    {
                    mXML_BINDING(); if (state.failed) return ;

                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:30: ( XML_WS | XML_ATTRIBUTE )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||(LA6_0>='\f' && LA6_0<='\r')||LA6_0==' ') ) {
                    alt6=1;
                }
                else if ( (LA6_0=='$'||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:31: XML_WS
            	    {
            	    mXML_WS(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1755:40: XML_ATTRIBUTE
            	    {
            	    mXML_ATTRIBUTE(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:3: ( '>' ( XML_SUBTREE | XML_TEXTNODE | XML_COMMENT | XML_CDATA | XML_BINDING )* '</' IDENT '>' | '/>' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='>') ) {
                alt8=1;
            }
            else if ( (LA8_0=='/') ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:5: '>' ( XML_SUBTREE | XML_TEXTNODE | XML_COMMENT | XML_CDATA | XML_BINDING )* '</' IDENT '>'
                    {
                    match('>'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:9: ( XML_SUBTREE | XML_TEXTNODE | XML_COMMENT | XML_CDATA | XML_BINDING )*
                    loop7:
                    do {
                        int alt7=6;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='<') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='!') ) {
                                int LA7_5 = input.LA(3);

                                if ( (LA7_5=='-') ) {
                                    alt7=3;
                                }
                                else if ( (LA7_5=='[') ) {
                                    alt7=4;
                                }


                            }
                            else if ( (LA7_1=='$'||(LA7_1>='A' && LA7_1<='Z')||LA7_1=='_'||(LA7_1>='a' && LA7_1<='{')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=';')||(LA7_0>='=' && LA7_0<='z')||(LA7_0>='|' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }
                        else if ( (LA7_0=='{') ) {
                            alt7=5;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:10: XML_SUBTREE
                    	    {
                    	    mXML_SUBTREE(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:24: XML_TEXTNODE
                    	    {
                    	    mXML_TEXTNODE(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:39: XML_COMMENT
                    	    {
                    	    mXML_COMMENT(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 4 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:53: XML_CDATA
                    	    {
                    	    mXML_CDATA(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 5 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1756:65: XML_BINDING
                    	    {
                    	    mXML_BINDING(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("</"); if (state.failed) return ;

                    mIDENT(); if (state.failed) return ;
                    match('>'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1758:5: '/>'
                    {
                    match("/>"); if (state.failed) return ;


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_SUBTREE"

    // $ANTLR start "XML_ATTRIBUTE"
    public final void mXML_ATTRIBUTE() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:2: ( IDENT ( XML_WS )* ASSIGN ( XML_WS )* ( STRING_LITERAL | XML_BINDING ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:4: IDENT ( XML_WS )* ASSIGN ( XML_WS )* ( STRING_LITERAL | XML_BINDING )
            {
            mIDENT(); if (state.failed) return ;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:10: ( XML_WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||(LA9_0>='\f' && LA9_0<='\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:10: XML_WS
            	    {
            	    mXML_WS(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            mASSIGN(); if (state.failed) return ;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:25: ( XML_WS )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||(LA10_0>='\f' && LA10_0<='\r')||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:25: XML_WS
            	    {
            	    mXML_WS(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:33: ( STRING_LITERAL | XML_BINDING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"'||LA11_0=='\'') ) {
                alt11=1;
            }
            else if ( (LA11_0=='{') ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:34: STRING_LITERAL
                    {
                    mSTRING_LITERAL(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1763:51: XML_BINDING
                    {
                    mXML_BINDING(); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_ATTRIBUTE"

    // $ANTLR start "XML_BINDING"
    public final void mXML_BINDING() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1767:2: ( '{' XML_AS3_EXPRESSION '}' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1767:4: '{' XML_AS3_EXPRESSION '}'
            {
            match('{'); if (state.failed) return ;
            mXML_AS3_EXPRESSION(); if (state.failed) return ;
            match('}'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_BINDING"

    // $ANTLR start "XML_AS3_EXPRESSION"
    public final void mXML_AS3_EXPRESSION() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1772:2: ( (~ ( '{' | '}' ) )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1772:4: (~ ( '{' | '}' ) )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1772:4: (~ ( '{' | '}' ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='z')||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1772:5: ~ ( '{' | '}' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_AS3_EXPRESSION"

    // $ANTLR start "XML_TEXTNODE"
    public final void mXML_TEXTNODE() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1776:2: ( ( XML_WS | ( '/' ~ '>' )=> '/' | ~ ( '<' | '{' | '/' | XML_WS ) ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1776:4: ( XML_WS | ( '/' ~ '>' )=> '/' | ~ ( '<' | '{' | '/' | XML_WS ) )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1776:4: ( XML_WS | ( '/' ~ '>' )=> '/' | ~ ( '<' | '{' | '/' | XML_WS ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='\t' && LA13_0<='\n')||(LA13_0>='\f' && LA13_0<='\r')||LA13_0==' ') ) {
                alt13=1;
            }
            else if ( (LA13_0=='/') && (synpred2_AS3())) {
                alt13=2;
            }
            else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||LA13_0=='\u000B'||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='!' && LA13_0<='.')||(LA13_0>='0' && LA13_0<=';')||(LA13_0>='=' && LA13_0<='z')||(LA13_0>='|' && LA13_0<='\uFFFF')) ) {
                alt13=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1777:4: XML_WS
                    {
                    mXML_WS(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1778:6: ( '/' ~ '>' )=> '/'
                    {
                    match('/'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1779:6: ~ ( '<' | '{' | '/' | XML_WS )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_TEXTNODE"

    // $ANTLR start "XML_COMMENT"
    public final void mXML_COMMENT() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1784:2: ( '<!--' ( XML_WS | ~ ( '-' | XML_WS ) | ( '-' ~ '-' )=> '-' )* '-->' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1784:4: '<!--' ( XML_WS | ~ ( '-' | XML_WS ) | ( '-' ~ '-' )=> '-' )* '-->'
            {
            match("<!--"); if (state.failed) return ;

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1785:3: ( XML_WS | ~ ( '-' | XML_WS ) | ( '-' ~ '-' )=> '-' )*
            loop14:
            do {
                int alt14=4;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1786:3: XML_WS
            	    {
            	    mXML_WS(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1787:5: ~ ( '-' | XML_WS )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1788:5: ( '-' ~ '-' )=> '-'
            	    {
            	    match('-'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("-->"); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_COMMENT"

    // $ANTLR start "XML_CDATA"
    public final void mXML_CDATA() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1794:2: ( '<![CDATA[' ( XML_WS | ( ']' ~ ']' )=> ']' | ~ ( ']' | XML_WS ) )* ']]>' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1794:4: '<![CDATA[' ( XML_WS | ( ']' ~ ']' )=> ']' | ~ ( ']' | XML_WS ) )* ']]>'
            {
            match("<![CDATA["); if (state.failed) return ;

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1795:3: ( XML_WS | ( ']' ~ ']' )=> ']' | ~ ( ']' | XML_WS ) )*
            loop15:
            do {
                int alt15=4;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1795:5: XML_WS
            	    {
            	    mXML_WS(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1796:12: ( ']' ~ ']' )=> ']'
            	    {
            	    match(']'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1797:12: ~ ( ']' | XML_WS )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\\')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("]]>"); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_CDATA"

    // $ANTLR start "XML_WS"
    public final void mXML_WS() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1803:2: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "XML_WS"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1812:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1812:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1813:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='$'||(LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2059:2: ( '\"' ( ESC | ~ ( '\"' | '\\\\' | '\\n' | '\\r' ) )* '\"' | '\\'' ( ESC | ~ ( '\\'' | '\\\\' | '\\n' | '\\r' ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2059:4: '\"' ( ESC | ~ ( '\"' | '\\\\' | '\\n' | '\\r' ) )* '\"'
                    {
                    match('\"'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2059:8: ( ESC | ~ ( '\"' | '\\\\' | '\\n' | '\\r' ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2059:9: ESC
                    	    {
                    	    mESC(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2059:13: ~ ( '\"' | '\\\\' | '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2060:4: '\\'' ( ESC | ~ ( '\\'' | '\\\\' | '\\n' | '\\r' ) )* '\\''
                    {
                    match('\''); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2060:9: ( ESC | ~ ( '\\'' | '\\\\' | '\\n' | '\\r' ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2060:10: ESC
                    	    {
                    	    mESC(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2060:14: ~ ( '\\'' | '\\\\' | '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            int _type = HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2063:13: ( '0' ( 'x' | 'X' ) ( HEX_DIGIT )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2063:15: '0' ( 'x' | 'X' ) ( HEX_DIGIT )+
            {
            match('0'); if (state.failed) return ;
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2063:29: ( HEX_DIGIT )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='F')||(LA20_0>='a' && LA20_0<='f')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2063:29: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2065:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2065:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2065:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='0') ) {
                alt22=1;
            }
            else if ( ((LA22_0>='1' && LA22_0<='9')) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2065:20: '0'
                    {
                    match('0'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2065:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2065:35: ( '0' .. '9' )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2065:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (state.failed) return ;

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2067:15: ( '0' ( '0' .. '7' )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2067:17: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2067:21: ( '0' .. '7' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='7')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2067:22: '0' .. '7'
            	    {
            	    matchRange('0','7'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "FLOAT_LITERAL"
    public final void mFLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:2: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                alt29=1;
            }
            else if ( (LA29_0=='.') ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:4: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:4: ( '0' .. '9' )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    match('.'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:20: ( '0' .. '9' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:32: ( EXPONENT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='E'||LA26_0=='e') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2070:32: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2071:4: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2071:8: ( '0' .. '9' )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2071:9: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2071:20: ( EXPONENT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='E'||LA28_0=='e') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2071:20: EXPONENT
                            {
                            mEXPONENT(); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT_LITERAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2075:4: ( ( ' ' | '\\t' | '\\f' )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2075:6: ( ' ' | '\\t' | '\\f' )+
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2075:6: ( ' ' | '\\t' | '\\f' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='\t'||LA30_0=='\f'||LA30_0==' ') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2084:2: ( ( '\\r' '\\n' | '\\r' | '\\n' ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2084:4: ( '\\r' '\\n' | '\\r' | '\\n' )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2084:4: ( '\\r' '\\n' | '\\r' | '\\n' )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\r') ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1=='\n') ) {
                    alt31=1;
                }
                else {
                    alt31=2;}
            }
            else if ( (LA31_0=='\n') ) {
                alt31=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2085:4: '\\r' '\\n'
                    {
                    match('\r'); if (state.failed) return ;
                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2086:5: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2087:5: '\\n'
                    {
                    match('\n'); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "BOM"
    public final void mBOM() throws RecognitionException {
        try {
            int _type = BOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2093:5: ( ( '\\u00EF' '\\u00BB' '\\u00BF' | '\\uFEFF' ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2093:7: ( '\\u00EF' '\\u00BB' '\\u00BF' | '\\uFEFF' )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2093:7: ( '\\u00EF' '\\u00BB' '\\u00BF' | '\\uFEFF' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\u00EF') ) {
                alt32=1;
            }
            else if ( (LA32_0=='\uFEFF') ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2093:9: '\\u00EF' '\\u00BB' '\\u00BF'
                    {
                    match('\u00EF'); if (state.failed) return ;
                    match('\u00BB'); if (state.failed) return ;
                    match('\u00BF'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2094:5: '\\uFEFF'
                    {
                    match('\uFEFF'); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOM"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); if (state.failed) return ;

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:9: (~ ( '\\n' | '\\r' ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:10: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:25: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\n') ) {
                alt35=1;
            }
            else if ( (LA35_0=='\r') ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:26: '\\n'
                    {
                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:31: '\\r' ( '\\n' )?
                    {
                    match('\r'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:35: ( '\\n' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='\n') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2100:36: '\\n'
                            {
                            match('\n'); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2106:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2106:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2106:9: ( options {greedy=false; } : . )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='*') ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1=='/') ) {
                        alt36=2;
                    }
                    else if ( ((LA36_1>='\u0000' && LA36_1<='.')||(LA36_1>='0' && LA36_1<='\uFFFF')) ) {
                        alt36=1;
                    }


                }
                else if ( ((LA36_0>='\u0000' && LA36_0<=')')||(LA36_0>='+' && LA36_0<='\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2106:37: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            match("*/"); if (state.failed) return ;

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2111:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2111:4: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2111:14: ( '+' | '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='+'||LA37_0=='-') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2111:25: ( '0' .. '9' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>='0' && LA38_0<='9')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2111:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2115:2: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2115:4: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "OCT_DIGIT"
    public final void mOCT_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2119:2: ( '0' .. '7' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2119:4: '0' .. '7'
            {
            matchRange('0','7'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "OCT_DIGIT"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2123:2: ( CTRLCHAR_ESC | UNICODE_ESC | OCTAL_ESC )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt39=1;
                    }
                    break;
                case 'u':
                    {
                    alt39=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt39=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2123:4: CTRLCHAR_ESC
                    {
                    mCTRLCHAR_ESC(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2124:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2125:4: OCTAL_ESC
                    {
                    mOCTAL_ESC(); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "CTRLCHAR_ESC"
    public final void mCTRLCHAR_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2129:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2129:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); if (state.failed) return ;
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CTRLCHAR_ESC"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\\') ) {
                int LA40_1 = input.LA(2);

                if ( ((LA40_1>='0' && LA40_1<='3')) ) {
                    int LA40_2 = input.LA(3);

                    if ( ((LA40_2>='0' && LA40_2<='7')) ) {
                        int LA40_4 = input.LA(4);

                        if ( ((LA40_4>='0' && LA40_4<='7')) ) {
                            alt40=1;
                        }
                        else {
                            alt40=2;}
                    }
                    else {
                        alt40=3;}
                }
                else if ( ((LA40_1>='4' && LA40_1<='7')) ) {
                    int LA40_3 = input.LA(3);

                    if ( ((LA40_3>='0' && LA40_3<='7')) ) {
                        alt40=2;
                    }
                    else {
                        alt40=3;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:9: ( '0' .. '3' )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:10: '0' .. '3'
                    {
                    matchRange('0','3'); if (state.failed) return ;

                    }

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:20: ( '0' .. '7' )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:21: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:31: ( '0' .. '7' )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2133:32: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2134:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2134:9: ( '0' .. '7' )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2134:10: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }

                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2134:20: ( '0' .. '7' )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2134:21: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2135:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); if (state.failed) return ;
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2135:9: ( '0' .. '7' )
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2135:10: '0' .. '7'
                    {
                    matchRange('0','7'); if (state.failed) return ;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2139:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:2139:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); if (state.failed) return ;
            match('u'); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;
            mHEX_DIGIT(); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:8: ( FINAL | OVERRIDE | INCLUDE | THROW | TRY | CATCH | FINALLY | VOID | INSTANCEOF | DELETE | TYPEOF | UNDEFINED | NATIVE | PACKAGE | PUBLIC | PRIVATE | PROTECTED | INTERNAL | FUNCTION | EXTENDS | IMPLEMENTS | VAR | STATIC | IF | IMPORT | FOR | EACH | IN | WHILE | DO | SWITCH | CASE | DEFAULT | ELSE | CONST | CLASS | INTERFACE | TRUE | FALSE | DYNAMIC | USE | NAMESPACE | IS | AS | GET | SET | WITH | RETURN | CONTINUE | BREAK | NULL | NEW | SUPER | THIS | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | COLON | DBL_COLON | COMMA | ASSIGN | EQUAL | STRICT_EQUAL | LNOT | BNOT | NOT_EQUAL | STRICT_NOT_EQUAL | PLUS | PLUS_ASSIGN | INC | MINUS | MINUS_ASSIGN | DEC | STAR | MOD | MOD_ASSIGN | GT | BXOR | BXOR_ASSIGN | BOR | BOR_ASSIGN | LOR | BAND | BAND_ASSIGN | LAND | LAND_ASSIGN | LOR_ASSIGN | E4X_ATTRI | SEMI | BSLASH | DOT | E4X_DESC | REST | DIV_ASSIGN | DIV | POST | SL | SL_ASSIGN | LE | LT | REGEXP_LITERAL | XML_LITERAL | IDENT | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOAT_LITERAL | WS | EOL | BOM | SL_COMMENT | ML_COMMENT )
        int alt41=117;
        alt41 = dfa41.predict(input);
        switch (alt41) {
            case 1 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:10: FINAL
                {
                mFINAL(); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:16: OVERRIDE
                {
                mOVERRIDE(); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:25: INCLUDE
                {
                mINCLUDE(); if (state.failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:33: THROW
                {
                mTHROW(); if (state.failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:39: TRY
                {
                mTRY(); if (state.failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:43: CATCH
                {
                mCATCH(); if (state.failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:49: FINALLY
                {
                mFINALLY(); if (state.failed) return ;

                }
                break;
            case 8 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:57: VOID
                {
                mVOID(); if (state.failed) return ;

                }
                break;
            case 9 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:62: INSTANCEOF
                {
                mINSTANCEOF(); if (state.failed) return ;

                }
                break;
            case 10 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:73: DELETE
                {
                mDELETE(); if (state.failed) return ;

                }
                break;
            case 11 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:80: TYPEOF
                {
                mTYPEOF(); if (state.failed) return ;

                }
                break;
            case 12 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:87: UNDEFINED
                {
                mUNDEFINED(); if (state.failed) return ;

                }
                break;
            case 13 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:97: NATIVE
                {
                mNATIVE(); if (state.failed) return ;

                }
                break;
            case 14 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:104: PACKAGE
                {
                mPACKAGE(); if (state.failed) return ;

                }
                break;
            case 15 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:112: PUBLIC
                {
                mPUBLIC(); if (state.failed) return ;

                }
                break;
            case 16 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:119: PRIVATE
                {
                mPRIVATE(); if (state.failed) return ;

                }
                break;
            case 17 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:127: PROTECTED
                {
                mPROTECTED(); if (state.failed) return ;

                }
                break;
            case 18 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:137: INTERNAL
                {
                mINTERNAL(); if (state.failed) return ;

                }
                break;
            case 19 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:146: FUNCTION
                {
                mFUNCTION(); if (state.failed) return ;

                }
                break;
            case 20 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:155: EXTENDS
                {
                mEXTENDS(); if (state.failed) return ;

                }
                break;
            case 21 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:163: IMPLEMENTS
                {
                mIMPLEMENTS(); if (state.failed) return ;

                }
                break;
            case 22 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:174: VAR
                {
                mVAR(); if (state.failed) return ;

                }
                break;
            case 23 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:178: STATIC
                {
                mSTATIC(); if (state.failed) return ;

                }
                break;
            case 24 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:185: IF
                {
                mIF(); if (state.failed) return ;

                }
                break;
            case 25 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:188: IMPORT
                {
                mIMPORT(); if (state.failed) return ;

                }
                break;
            case 26 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:195: FOR
                {
                mFOR(); if (state.failed) return ;

                }
                break;
            case 27 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:199: EACH
                {
                mEACH(); if (state.failed) return ;

                }
                break;
            case 28 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:204: IN
                {
                mIN(); if (state.failed) return ;

                }
                break;
            case 29 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:207: WHILE
                {
                mWHILE(); if (state.failed) return ;

                }
                break;
            case 30 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:213: DO
                {
                mDO(); if (state.failed) return ;

                }
                break;
            case 31 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:216: SWITCH
                {
                mSWITCH(); if (state.failed) return ;

                }
                break;
            case 32 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:223: CASE
                {
                mCASE(); if (state.failed) return ;

                }
                break;
            case 33 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:228: DEFAULT
                {
                mDEFAULT(); if (state.failed) return ;

                }
                break;
            case 34 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:236: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;
            case 35 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:241: CONST
                {
                mCONST(); if (state.failed) return ;

                }
                break;
            case 36 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:247: CLASS
                {
                mCLASS(); if (state.failed) return ;

                }
                break;
            case 37 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:253: INTERFACE
                {
                mINTERFACE(); if (state.failed) return ;

                }
                break;
            case 38 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:263: TRUE
                {
                mTRUE(); if (state.failed) return ;

                }
                break;
            case 39 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:268: FALSE
                {
                mFALSE(); if (state.failed) return ;

                }
                break;
            case 40 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:274: DYNAMIC
                {
                mDYNAMIC(); if (state.failed) return ;

                }
                break;
            case 41 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:282: USE
                {
                mUSE(); if (state.failed) return ;

                }
                break;
            case 42 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:286: NAMESPACE
                {
                mNAMESPACE(); if (state.failed) return ;

                }
                break;
            case 43 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:296: IS
                {
                mIS(); if (state.failed) return ;

                }
                break;
            case 44 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:299: AS
                {
                mAS(); if (state.failed) return ;

                }
                break;
            case 45 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:302: GET
                {
                mGET(); if (state.failed) return ;

                }
                break;
            case 46 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:306: SET
                {
                mSET(); if (state.failed) return ;

                }
                break;
            case 47 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:310: WITH
                {
                mWITH(); if (state.failed) return ;

                }
                break;
            case 48 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:315: RETURN
                {
                mRETURN(); if (state.failed) return ;

                }
                break;
            case 49 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:322: CONTINUE
                {
                mCONTINUE(); if (state.failed) return ;

                }
                break;
            case 50 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:331: BREAK
                {
                mBREAK(); if (state.failed) return ;

                }
                break;
            case 51 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:337: NULL
                {
                mNULL(); if (state.failed) return ;

                }
                break;
            case 52 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:342: NEW
                {
                mNEW(); if (state.failed) return ;

                }
                break;
            case 53 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:346: SUPER
                {
                mSUPER(); if (state.failed) return ;

                }
                break;
            case 54 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:352: THIS
                {
                mTHIS(); if (state.failed) return ;

                }
                break;
            case 55 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:357: QUESTION
                {
                mQUESTION(); if (state.failed) return ;

                }
                break;
            case 56 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:366: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 57 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:373: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 58 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:380: LBRACK
                {
                mLBRACK(); if (state.failed) return ;

                }
                break;
            case 59 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:387: RBRACK
                {
                mRBRACK(); if (state.failed) return ;

                }
                break;
            case 60 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:394: LBRACE
                {
                mLBRACE(); if (state.failed) return ;

                }
                break;
            case 61 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:401: RBRACE
                {
                mRBRACE(); if (state.failed) return ;

                }
                break;
            case 62 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:408: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 63 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:414: DBL_COLON
                {
                mDBL_COLON(); if (state.failed) return ;

                }
                break;
            case 64 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:424: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 65 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:430: ASSIGN
                {
                mASSIGN(); if (state.failed) return ;

                }
                break;
            case 66 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:437: EQUAL
                {
                mEQUAL(); if (state.failed) return ;

                }
                break;
            case 67 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:443: STRICT_EQUAL
                {
                mSTRICT_EQUAL(); if (state.failed) return ;

                }
                break;
            case 68 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:456: LNOT
                {
                mLNOT(); if (state.failed) return ;

                }
                break;
            case 69 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:461: BNOT
                {
                mBNOT(); if (state.failed) return ;

                }
                break;
            case 70 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:466: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;

                }
                break;
            case 71 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:476: STRICT_NOT_EQUAL
                {
                mSTRICT_NOT_EQUAL(); if (state.failed) return ;

                }
                break;
            case 72 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:493: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 73 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:498: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 74 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:510: INC
                {
                mINC(); if (state.failed) return ;

                }
                break;
            case 75 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:514: MINUS
                {
                mMINUS(); if (state.failed) return ;

                }
                break;
            case 76 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:520: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 77 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:533: DEC
                {
                mDEC(); if (state.failed) return ;

                }
                break;
            case 78 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:537: STAR
                {
                mSTAR(); if (state.failed) return ;

                }
                break;
            case 79 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:542: MOD
                {
                mMOD(); if (state.failed) return ;

                }
                break;
            case 80 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:546: MOD_ASSIGN
                {
                mMOD_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 81 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:557: GT
                {
                mGT(); if (state.failed) return ;

                }
                break;
            case 82 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:560: BXOR
                {
                mBXOR(); if (state.failed) return ;

                }
                break;
            case 83 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:565: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 84 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:577: BOR
                {
                mBOR(); if (state.failed) return ;

                }
                break;
            case 85 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:581: BOR_ASSIGN
                {
                mBOR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 86 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:592: LOR
                {
                mLOR(); if (state.failed) return ;

                }
                break;
            case 87 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:596: BAND
                {
                mBAND(); if (state.failed) return ;

                }
                break;
            case 88 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:601: BAND_ASSIGN
                {
                mBAND_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 89 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:613: LAND
                {
                mLAND(); if (state.failed) return ;

                }
                break;
            case 90 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:618: LAND_ASSIGN
                {
                mLAND_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 91 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:630: LOR_ASSIGN
                {
                mLOR_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 92 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:641: E4X_ATTRI
                {
                mE4X_ATTRI(); if (state.failed) return ;

                }
                break;
            case 93 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:651: SEMI
                {
                mSEMI(); if (state.failed) return ;

                }
                break;
            case 94 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:656: BSLASH
                {
                mBSLASH(); if (state.failed) return ;

                }
                break;
            case 95 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:663: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 96 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:667: E4X_DESC
                {
                mE4X_DESC(); if (state.failed) return ;

                }
                break;
            case 97 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:676: REST
                {
                mREST(); if (state.failed) return ;

                }
                break;
            case 98 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:681: DIV_ASSIGN
                {
                mDIV_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 99 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:692: DIV
                {
                mDIV(); if (state.failed) return ;

                }
                break;
            case 100 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:696: POST
                {
                mPOST(); if (state.failed) return ;

                }
                break;
            case 101 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:701: SL
                {
                mSL(); if (state.failed) return ;

                }
                break;
            case 102 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:704: SL_ASSIGN
                {
                mSL_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 103 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:714: LE
                {
                mLE(); if (state.failed) return ;

                }
                break;
            case 104 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:717: LT
                {
                mLT(); if (state.failed) return ;

                }
                break;
            case 105 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:720: REGEXP_LITERAL
                {
                mREGEXP_LITERAL(); if (state.failed) return ;

                }
                break;
            case 106 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:735: XML_LITERAL
                {
                mXML_LITERAL(); if (state.failed) return ;

                }
                break;
            case 107 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:747: IDENT
                {
                mIDENT(); if (state.failed) return ;

                }
                break;
            case 108 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:753: STRING_LITERAL
                {
                mSTRING_LITERAL(); if (state.failed) return ;

                }
                break;
            case 109 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:768: HEX_LITERAL
                {
                mHEX_LITERAL(); if (state.failed) return ;

                }
                break;
            case 110 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:780: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); if (state.failed) return ;

                }
                break;
            case 111 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:796: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); if (state.failed) return ;

                }
                break;
            case 112 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:810: FLOAT_LITERAL
                {
                mFLOAT_LITERAL(); if (state.failed) return ;

                }
                break;
            case 113 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:824: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 114 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:827: EOL
                {
                mEOL(); if (state.failed) return ;

                }
                break;
            case 115 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:831: BOM
                {
                mBOM(); if (state.failed) return ;

                }
                break;
            case 116 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:835: SL_COMMENT
                {
                mSL_COMMENT(); if (state.failed) return ;

                }
                break;
            case 117 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1:846: ML_COMMENT
                {
                mML_COMMENT(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred2_AS3
    public final void synpred2_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1778:6: ( '/' ~ '>' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1778:7: '/' ~ '>'
        {
        match('/'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred2_AS3

    // $ANTLR start synpred3_AS3
    public final void synpred3_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1788:5: ( '-' ~ '-' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1788:6: '-' ~ '-'
        {
        match('-'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred3_AS3

    // $ANTLR start synpred4_AS3
    public final void synpred4_AS3_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1796:12: ( ']' ~ ']' )
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\as3\\AS3.g:1796:13: ']' ~ ']'
        {
        match(']'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='\\')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred4_AS3

    public final boolean synpred2_AS3() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_AS3_fragment(); // can never throw exception
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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA14_eotS =
        "\7\uffff\1\11\3\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\2\0\2\uffff\1\0\2\uffff\1\0\3\uffff";
    static final String DFA14_maxS =
        "\2\uffff\2\uffff\1\uffff\2\uffff\1\uffff\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\1\2\1\uffff\2\3\1\uffff\1\3\1\4\1\3";
    static final String DFA14_specialS =
        "\1\2\1\1\2\uffff\1\3\2\uffff\1\0\3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\3\2\2\1\3\2\2\22\3\1\2\14\3\1\1\uffd2\3",
            "\11\6\2\5\1\6\2\5\22\6\1\5\14\6\1\4\uffd2\6",
            "",
            "",
            "\11\6\2\5\1\6\2\5\22\6\1\5\14\6\1\10\20\6\1\7\uffc1\6",
            "",
            "",
            "\11\6\2\5\1\6\2\5\22\6\1\5\14\6\1\12\uffd2\6",
            "",
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
            return "()* loopback of 1785:3: ( XML_WS | ~ ( '-' | XML_WS ) | ( '-' ~ '-' )=> '-' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_7=='-') && (synpred3_AS3())) {s = 10;}

                        else if ( ((LA14_7>='\t' && LA14_7<='\n')||(LA14_7>='\f' && LA14_7<='\r')||LA14_7==' ') && (synpred3_AS3())) {s = 5;}

                        else if ( ((LA14_7>='\u0000' && LA14_7<='\b')||LA14_7=='\u000B'||(LA14_7>='\u000E' && LA14_7<='\u001F')||(LA14_7>='!' && LA14_7<=',')||(LA14_7>='.' && LA14_7<='\uFFFF')) && (synpred3_AS3())) {s = 6;}

                        else s = 9;

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_1=='-') ) {s = 4;}

                        else if ( ((LA14_1>='\t' && LA14_1<='\n')||(LA14_1>='\f' && LA14_1<='\r')||LA14_1==' ') && (synpred3_AS3())) {s = 5;}

                        else if ( ((LA14_1>='\u0000' && LA14_1<='\b')||LA14_1=='\u000B'||(LA14_1>='\u000E' && LA14_1<='\u001F')||(LA14_1>='!' && LA14_1<=',')||(LA14_1>='.' && LA14_1<='\uFFFF')) && (synpred3_AS3())) {s = 6;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='-') ) {s = 1;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||(LA14_0>='\f' && LA14_0<='\r')||LA14_0==' ') ) {s = 2;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||LA14_0=='\u000B'||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='!' && LA14_0<=',')||(LA14_0>='.' && LA14_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_4=='>') ) {s = 7;}

                        else if ( (LA14_4=='-') && (synpred3_AS3())) {s = 8;}

                        else if ( ((LA14_4>='\t' && LA14_4<='\n')||(LA14_4>='\f' && LA14_4<='\r')||LA14_4==' ') && (synpred3_AS3())) {s = 5;}

                        else if ( ((LA14_4>='\u0000' && LA14_4<='\b')||LA14_4=='\u000B'||(LA14_4>='\u000E' && LA14_4<='\u001F')||(LA14_4>='!' && LA14_4<=',')||(LA14_4>='.' && LA14_4<='=')||(LA14_4>='?' && LA14_4<='\uFFFF')) && (synpred3_AS3())) {s = 6;}

                         
                        input.seek(index14_4);
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
    static final String DFA15_eotS =
        "\7\uffff\1\11\3\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\2\0\2\uffff\1\0\2\uffff\1\0\3\uffff";
    static final String DFA15_maxS =
        "\2\uffff\2\uffff\1\uffff\2\uffff\1\uffff\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\1\1\3\1\uffff\2\2\1\uffff\1\2\1\4\1\2";
    static final String DFA15_specialS =
        "\1\1\1\3\2\uffff\1\0\2\uffff\1\2\3\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\3\2\2\1\3\2\2\22\3\1\2\74\3\1\1\uffa2\3",
            "\11\6\2\5\1\6\2\5\22\6\1\5\74\6\1\4\uffa2\6",
            "",
            "",
            "\11\6\2\5\1\6\2\5\22\6\1\5\35\6\1\7\36\6\1\10\uffa2\6",
            "",
            "",
            "\11\6\2\5\1\6\2\5\22\6\1\5\74\6\1\12\uffa2\6",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 1795:3: ( XML_WS | ( ']' ~ ']' )=> ']' | ~ ( ']' | XML_WS ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_4=='>') ) {s = 7;}

                        else if ( (LA15_4==']') && (synpred4_AS3())) {s = 8;}

                        else if ( ((LA15_4>='\t' && LA15_4<='\n')||(LA15_4>='\f' && LA15_4<='\r')||LA15_4==' ') && (synpred4_AS3())) {s = 5;}

                        else if ( ((LA15_4>='\u0000' && LA15_4<='\b')||LA15_4=='\u000B'||(LA15_4>='\u000E' && LA15_4<='\u001F')||(LA15_4>='!' && LA15_4<='=')||(LA15_4>='?' && LA15_4<='\\')||(LA15_4>='^' && LA15_4<='\uFFFF')) && (synpred4_AS3())) {s = 6;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0==']') ) {s = 1;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||(LA15_0>='\f' && LA15_0<='\r')||LA15_0==' ') ) {s = 2;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||LA15_0=='\u000B'||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='!' && LA15_0<='\\')||(LA15_0>='^' && LA15_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_7==']') && (synpred4_AS3())) {s = 10;}

                        else if ( ((LA15_7>='\t' && LA15_7<='\n')||(LA15_7>='\f' && LA15_7<='\r')||LA15_7==' ') && (synpred4_AS3())) {s = 5;}

                        else if ( ((LA15_7>='\u0000' && LA15_7<='\b')||LA15_7=='\u000B'||(LA15_7>='\u000E' && LA15_7<='\u001F')||(LA15_7>='!' && LA15_7<='\\')||(LA15_7>='^' && LA15_7<='\uFFFF')) && (synpred4_AS3())) {s = 6;}

                        else s = 9;

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_1==']') ) {s = 4;}

                        else if ( ((LA15_1>='\t' && LA15_1<='\n')||(LA15_1>='\f' && LA15_1<='\r')||LA15_1==' ') && (synpred4_AS3())) {s = 5;}

                        else if ( ((LA15_1>='\u0000' && LA15_1<='\b')||LA15_1=='\u000B'||(LA15_1>='\u000E' && LA15_1<='\u001F')||(LA15_1>='!' && LA15_1<='\\')||(LA15_1>='^' && LA15_1<='\uFFFF')) && (synpred4_AS3())) {s = 6;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\1\uffff\21\54\7\uffff\1\135\1\uffff\1\137\1\141\1\uffff\1\144"+
        "\1\147\1\uffff\1\151\1\uffff\1\153\1\156\1\161\3\uffff\1\164\1\171"+
        "\1\175\2\uffff\2\u0080\3\uffff\5\54\1\u008b\1\54\1\u008d\1\u008e"+
        "\11\54\1\u009c\22\54\1\u00b1\3\54\2\uffff\1\u00b6\1\uffff\1\u00b8"+
        "\14\uffff\1\u00ba\2\uffff\1\u00bc\1\uffff\1\u00be\3\uffff\1\u00bf"+
        "\4\uffff\1\u00c1\5\uffff\1\u00c2\1\u0080\2\54\1\u00c5\5\54\1\uffff"+
        "\1\54\2\uffff\2\54\1\u00cf\7\54\1\u00d8\2\54\1\uffff\2\54\1\u00dd"+
        "\3\54\1\u00e1\11\54\1\u00eb\3\54\1\uffff\1\u00ef\2\54\16\uffff\2"+
        "\54\1\uffff\10\54\1\u00fc\1\uffff\1\u00fd\2\54\1\u0100\3\54\1\u0104"+
        "\1\uffff\4\54\1\uffff\2\54\1\u010b\1\uffff\5\54\1\u0111\1\u0112"+
        "\2\54\1\uffff\2\54\1\u0117\1\uffff\2\54\1\u011b\1\54\1\u011d\6\54"+
        "\1\u0125\2\uffff\1\54\1\u0127\1\uffff\1\u0128\1\54\1\u012a\1\uffff"+
        "\6\54\1\uffff\5\54\2\uffff\2\54\1\u0138\1\u0139\1\uffff\1\54\1\u013b"+
        "\1\54\1\uffff\1\54\1\uffff\6\54\1\u0144\1\uffff\1\u0145\2\uffff"+
        "\1\54\1\uffff\1\u0147\3\54\1\u014b\2\54\1\u014e\3\54\1\u0152\1\u0153"+
        "\2\uffff\1\u0154\1\uffff\1\u0155\2\54\1\u0158\4\54\2\uffff\1\54"+
        "\1\uffff\1\u015e\1\u015f\1\54\1\uffff\1\54\1\u0162\1\uffff\1\u0163"+
        "\1\54\1\u0165\4\uffff\1\u0166\1\u0167\1\uffff\1\54\1\u0169\2\54"+
        "\1\u016c\2\uffff\2\54\2\uffff\1\54\3\uffff\1\54\1\uffff\1\u0171"+
        "\1\54\1\uffff\1\u0173\1\u0174\1\u0175\1\u0176\1\uffff\1\u0177\5"+
        "\uffff";
    static final String DFA41_eofS =
        "\u0178\uffff";
    static final String DFA41_minS =
        "\1\11\1\141\1\166\1\146\1\150\2\141\1\145\1\156\3\141\1\145\1\150"+
        "\1\163\2\145\1\162\7\uffff\1\72\1\uffff\2\75\1\uffff\1\53\1\55\1"+
        "\uffff\1\75\1\uffff\2\75\1\46\3\uffff\1\56\1\0\1\44\2\uffff\2\56"+
        "\3\uffff\2\156\1\162\1\154\1\145\1\44\1\160\2\44\1\151\1\165\1\160"+
        "\1\163\1\156\1\141\1\151\1\162\1\146\1\44\1\156\1\144\1\145\1\155"+
        "\1\154\1\167\1\143\1\142\1\151\1\164\1\143\1\163\1\141\1\151\1\164"+
        "\1\160\1\151\1\164\1\44\2\164\1\145\2\uffff\1\75\1\uffff\1\75\14"+
        "\uffff\1\75\2\uffff\1\75\1\uffff\1\56\3\uffff\1\0\4\uffff\1\75\5"+
        "\uffff\2\56\1\141\1\143\1\44\1\163\1\162\1\154\1\164\1\145\1\uffff"+
        "\1\154\2\uffff\1\157\1\163\1\44\2\145\1\143\1\145\2\163\1\144\1"+
        "\44\1\145\1\141\1\uffff\1\141\1\145\1\44\1\151\1\145\1\154\1\44"+
        "\1\153\1\154\1\166\1\164\1\145\1\150\1\145\2\164\1\44\1\145\1\154"+
        "\1\150\1\uffff\1\44\1\165\1\141\16\uffff\1\154\1\164\1\uffff\1\145"+
        "\1\162\1\165\1\141\1\162\1\145\1\162\1\167\1\44\1\uffff\1\44\1\157"+
        "\1\150\1\44\1\164\1\151\1\163\1\44\1\uffff\1\164\1\165\1\155\1\146"+
        "\1\uffff\1\166\1\163\1\44\1\uffff\1\141\1\151\1\141\1\145\1\156"+
        "\2\44\1\151\1\143\1\uffff\1\162\1\145\1\44\1\uffff\1\162\1\153\1"+
        "\44\1\151\1\44\1\151\1\144\1\156\1\146\1\155\1\164\1\44\2\uffff"+
        "\1\146\1\44\1\uffff\1\44\1\156\1\44\1\uffff\1\145\1\154\2\151\1"+
        "\145\1\160\1\uffff\1\147\1\143\1\164\1\143\1\144\2\uffff\1\143\1"+
        "\150\2\44\1\uffff\1\156\1\44\1\171\1\uffff\1\157\1\uffff\1\144\1"+
        "\145\1\143\2\141\1\145\1\44\1\uffff\1\44\2\uffff\1\165\1\uffff\1"+
        "\44\1\164\1\143\1\156\1\44\1\141\1\145\1\44\1\145\1\164\1\163\2"+
        "\44\2\uffff\1\44\1\uffff\1\44\1\156\1\145\1\44\1\145\1\154\1\143"+
        "\1\156\2\uffff\1\145\1\uffff\2\44\1\145\1\uffff\1\143\1\44\1\uffff"+
        "\1\44\1\145\1\44\4\uffff\2\44\1\uffff\1\157\1\44\1\145\1\164\1\44"+
        "\2\uffff\1\144\1\145\2\uffff\1\144\3\uffff\1\146\1\uffff\1\44\1"+
        "\163\1\uffff\4\44\1\uffff\1\44\5\uffff";
    static final String DFA41_maxS =
        "\1\ufeff\1\165\1\166\1\163\1\171\2\157\1\171\1\163\2\165\1\170"+
        "\1\167\1\151\1\163\2\145\1\162\7\uffff\1\72\1\uffff\2\75\1\uffff"+
        "\2\75\1\uffff\1\75\1\uffff\1\75\1\174\1\75\3\uffff\1\74\1\uffff"+
        "\1\173\2\uffff\1\170\1\71\3\uffff\2\156\1\162\1\154\1\145\1\172"+
        "\1\160\2\172\1\162\1\171\1\160\1\164\1\156\1\141\1\151\1\162\1\154"+
        "\1\172\1\156\1\144\1\145\1\164\1\154\1\167\1\143\1\142\1\157\1\164"+
        "\1\143\1\163\1\141\1\151\1\164\1\160\1\151\1\164\1\172\2\164\1\145"+
        "\2\uffff\1\75\1\uffff\1\75\14\uffff\1\75\2\uffff\1\75\1\uffff\1"+
        "\56\3\uffff\1\uffff\4\uffff\1\75\5\uffff\2\71\1\141\1\143\1\172"+
        "\1\163\1\162\1\154\1\164\1\145\1\uffff\1\157\2\uffff\1\157\1\163"+
        "\1\172\2\145\1\143\1\145\1\164\1\163\1\144\1\172\1\145\1\141\1\uffff"+
        "\1\141\1\145\1\172\1\151\1\145\1\154\1\172\1\153\1\154\1\166\1\164"+
        "\1\145\1\150\1\145\2\164\1\172\1\145\1\154\1\150\1\uffff\1\172\1"+
        "\165\1\141\16\uffff\1\154\1\164\1\uffff\1\145\1\162\1\165\1\141"+
        "\1\162\1\145\1\162\1\167\1\172\1\uffff\1\172\1\157\1\150\1\172\1"+
        "\164\1\151\1\163\1\172\1\uffff\1\164\1\165\1\155\1\146\1\uffff\1"+
        "\166\1\163\1\172\1\uffff\1\141\1\151\1\141\1\145\1\156\2\172\1\151"+
        "\1\143\1\uffff\1\162\1\145\1\172\1\uffff\1\162\1\153\1\172\1\151"+
        "\1\172\1\151\1\144\2\156\1\155\1\164\1\172\2\uffff\1\146\1\172\1"+
        "\uffff\1\172\1\156\1\172\1\uffff\1\145\1\154\2\151\1\145\1\160\1"+
        "\uffff\1\147\1\143\1\164\1\143\1\144\2\uffff\1\143\1\150\2\172\1"+
        "\uffff\1\156\1\172\1\171\1\uffff\1\157\1\uffff\1\144\1\145\1\143"+
        "\2\141\1\145\1\172\1\uffff\1\172\2\uffff\1\165\1\uffff\1\172\1\164"+
        "\1\143\1\156\1\172\1\141\1\145\1\172\1\145\1\164\1\163\2\172\2\uffff"+
        "\1\172\1\uffff\1\172\1\156\1\145\1\172\1\145\1\154\1\143\1\156\2"+
        "\uffff\1\145\1\uffff\2\172\1\145\1\uffff\1\143\1\172\1\uffff\1\172"+
        "\1\145\1\172\4\uffff\2\172\1\uffff\1\157\1\172\1\145\1\164\1\172"+
        "\2\uffff\1\144\1\145\2\uffff\1\144\3\uffff\1\146\1\uffff\1\172\1"+
        "\163\1\uffff\4\172\1\uffff\1\172\5\uffff";
    static final String DFA41_acceptS =
        "\22\uffff\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\uffff\1\100\2\uffff"+
        "\1\105\2\uffff\1\116\1\uffff\1\121\3\uffff\1\134\1\135\1\136\3\uffff"+
        "\1\153\1\154\2\uffff\1\161\1\162\1\163\51\uffff\1\77\1\76\1\uffff"+
        "\1\101\1\uffff\1\104\1\111\1\112\1\110\1\114\1\115\1\113\1\120\1"+
        "\117\1\123\1\122\1\125\1\uffff\1\124\1\130\1\uffff\1\127\1\uffff"+
        "\1\144\1\137\1\160\1\uffff\1\164\1\165\1\143\1\151\1\uffff\1\147"+
        "\1\150\1\152\1\155\1\156\12\uffff\1\34\1\uffff\1\30\1\53\15\uffff"+
        "\1\36\24\uffff\1\54\3\uffff\1\103\1\102\1\107\1\106\1\133\1\126"+
        "\1\132\1\131\1\141\1\140\1\142\1\146\1\145\1\157\2\uffff\1\32\11"+
        "\uffff\1\5\10\uffff\1\26\4\uffff\1\51\3\uffff\1\64\11\uffff\1\56"+
        "\3\uffff\1\55\14\uffff\1\66\1\46\2\uffff\1\40\3\uffff\1\10\6\uffff"+
        "\1\63\5\uffff\1\33\1\42\4\uffff\1\57\3\uffff\1\1\1\uffff\1\47\7"+
        "\uffff\1\4\1\uffff\1\6\1\43\1\uffff\1\44\15\uffff\1\65\1\35\1\uffff"+
        "\1\62\10\uffff\1\31\1\13\1\uffff\1\12\3\uffff\1\15\2\uffff\1\17"+
        "\3\uffff\1\27\1\37\1\60\1\7\2\uffff\1\3\5\uffff\1\41\1\50\2\uffff"+
        "\1\16\1\20\1\uffff\1\24\1\23\1\2\1\uffff\1\22\2\uffff\1\61\4\uffff"+
        "\1\45\1\uffff\1\14\1\52\1\21\1\11\1\25";
    static final String DFA41_specialS =
        "\52\uffff\1\1\113\uffff\1\0\u0101\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\60\1\61\1\uffff\1\60\1\61\22\uffff\1\60\1\34\1\55\1\uffff"+
            "\1\54\1\41\1\45\1\55\1\23\1\24\1\40\1\36\1\32\1\37\1\51\1\52"+
            "\1\56\11\57\1\31\1\47\1\53\1\33\1\42\1\22\1\46\32\54\1\25\1"+
            "\50\1\26\1\43\1\54\1\uffff\1\16\1\21\1\5\1\7\1\13\1\1\1\17\1"+
            "\54\1\3\4\54\1\11\1\2\1\12\1\54\1\20\1\14\1\4\1\10\1\6\1\15"+
            "\3\54\1\27\1\44\1\30\1\35\160\uffff\1\62\ufe0f\uffff\1\62",
            "\1\66\7\uffff\1\63\5\uffff\1\65\5\uffff\1\64",
            "\1\67",
            "\1\72\6\uffff\1\71\1\70\4\uffff\1\73",
            "\1\74\11\uffff\1\75\6\uffff\1\76",
            "\1\77\12\uffff\1\101\2\uffff\1\100",
            "\1\103\15\uffff\1\102",
            "\1\104\11\uffff\1\105\11\uffff\1\106",
            "\1\107\4\uffff\1\110",
            "\1\111\3\uffff\1\113\17\uffff\1\112",
            "\1\114\20\uffff\1\116\2\uffff\1\115",
            "\1\120\12\uffff\1\121\13\uffff\1\117",
            "\1\124\16\uffff\1\122\1\125\1\uffff\1\123",
            "\1\126\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "",
            "\1\136",
            "\1\140",
            "",
            "\1\143\21\uffff\1\142",
            "\1\146\17\uffff\1\145",
            "",
            "\1\150",
            "",
            "\1\152",
            "\1\154\76\uffff\1\155",
            "\1\160\26\uffff\1\157",
            "",
            "",
            "",
            "\1\162\1\uffff\12\165\2\uffff\1\163",
            "\12\172\1\uffff\2\172\1\uffff\34\172\1\170\4\172\1\167\15"+
            "\172\1\166\uffc2\172",
            "\1\176\27\uffff\1\173\1\174\3\uffff\32\176\4\uffff\1\176\1"+
            "\uffff\33\176",
            "",
            "",
            "\1\165\1\uffff\10\u0081\2\165\36\uffff\1\177\37\uffff\1\177",
            "\1\165\1\uffff\12\u0082",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\2"+
            "\54\1\u0088\17\54\1\u0089\1\u008a\6\54",
            "\1\u008c",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0090\10\uffff\1\u008f",
            "\1\u0092\3\uffff\1\u0091",
            "\1\u0093",
            "\1\u0095\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\5\uffff\1\u009a",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1\6\uffff\1\u00a0",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\5\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "\1\u00b5",
            "",
            "\1\u00b7",
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
            "\1\u00b9",
            "",
            "",
            "\1\u00bb",
            "",
            "\1\u00bd",
            "",
            "",
            "",
            "\12\172\1\uffff\2\172\1\uffff\ufff2\172",
            "",
            "",
            "",
            "",
            "\1\u00c0",
            "",
            "",
            "",
            "",
            "",
            "\1\165\1\uffff\10\u0081\2\165",
            "\1\165\1\uffff\12\u0082",
            "\1\u00c3",
            "\1\u00c4",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb\2\uffff\1\u00cc",
            "",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00f0",
            "\1\u00f1",
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
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u00fe",
            "\1\u00ff",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u011a\16\54",
            "\1\u011c",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0122\7\uffff\1\u0121",
            "\1\u0123",
            "\1\u0124",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "",
            "\1\u0126",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0129",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\u013a",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u013c",
            "",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "",
            "\1\u0146",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u014c",
            "\1\u014d",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0156",
            "\1\u0157",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "",
            "\1\u015d",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0160",
            "",
            "\1\u0161",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0164",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "",
            "",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\u0168",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u016a",
            "\1\u016b",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "",
            "\1\u016d",
            "\1\u016e",
            "",
            "",
            "\1\u016f",
            "",
            "",
            "",
            "\1\u0170",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0172",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( FINAL | OVERRIDE | INCLUDE | THROW | TRY | CATCH | FINALLY | VOID | INSTANCEOF | DELETE | TYPEOF | UNDEFINED | NATIVE | PACKAGE | PUBLIC | PRIVATE | PROTECTED | INTERNAL | FUNCTION | EXTENDS | IMPLEMENTS | VAR | STATIC | IF | IMPORT | FOR | EACH | IN | WHILE | DO | SWITCH | CASE | DEFAULT | ELSE | CONST | CLASS | INTERFACE | TRUE | FALSE | DYNAMIC | USE | NAMESPACE | IS | AS | GET | SET | WITH | RETURN | CONTINUE | BREAK | NULL | NEW | SUPER | THIS | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | COLON | DBL_COLON | COMMA | ASSIGN | EQUAL | STRICT_EQUAL | LNOT | BNOT | NOT_EQUAL | STRICT_NOT_EQUAL | PLUS | PLUS_ASSIGN | INC | MINUS | MINUS_ASSIGN | DEC | STAR | MOD | MOD_ASSIGN | GT | BXOR | BXOR_ASSIGN | BOR | BOR_ASSIGN | LOR | BAND | BAND_ASSIGN | LAND | LAND_ASSIGN | LOR_ASSIGN | E4X_ATTRI | SEMI | BSLASH | DOT | E4X_DESC | REST | DIV_ASSIGN | DIV | POST | SL | SL_ASSIGN | LE | LT | REGEXP_LITERAL | XML_LITERAL | IDENT | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOAT_LITERAL | WS | EOL | BOM | SL_COMMENT | ML_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_118 = input.LA(1);

                         
                        int index41_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA41_118>='\u0000' && LA41_118<='\t')||(LA41_118>='\u000B' && LA41_118<='\f')||(LA41_118>='\u000E' && LA41_118<='\uFFFF')) && (( constantIsOk() ))) {s = 122;}

                        else s = 191;

                         
                        input.seek(index41_118);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_42 = input.LA(1);

                         
                        int index41_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_42=='=') ) {s = 118;}

                        else if ( (LA41_42=='/') ) {s = 119;}

                        else if ( (LA41_42=='*') ) {s = 120;}

                        else if ( ((LA41_42>='\u0000' && LA41_42<='\t')||(LA41_42>='\u000B' && LA41_42<='\f')||(LA41_42>='\u000E' && LA41_42<=')')||(LA41_42>='+' && LA41_42<='.')||(LA41_42>='0' && LA41_42<='<')||(LA41_42>='>' && LA41_42<='\uFFFF')) && (( constantIsOk() ))) {s = 122;}

                        else s = 121;

                         
                        input.seek(index41_42);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}