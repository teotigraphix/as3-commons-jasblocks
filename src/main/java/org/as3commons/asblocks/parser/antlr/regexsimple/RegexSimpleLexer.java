// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g 2011-07-10 10:19:17

package org.as3commons.asblocks.parser.antlr.regexsimple;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RegexSimpleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int REGEXP_LITERAL=4;
    public static final int REGEXP_BODY=5;
    public static final int REGEXP_FLAGS=6;
    public static final int REGEXP_DELIMITER=7;
    public static final int REGEXP_CHAR=8;
    public static final int REGEXP_FLAG=9;
    public static final int CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE=10;
    public static final int NULL_ESCAPE=11;
    public static final int ORDINARY_REGEXP_CHAR=12;
    public static final int ESC=13;
    public static final int NON_TERMINATOR=14;
    public static final int TERMINATOR=15;
    public static final int CONTINUING_IDENTIFIER_CHAR=16;
    public static final int HEX_ESCAPE=17;
    public static final int UNICODE_ALPHANUMERIC=18;
    public static final int HEX_DIGIT=19;

    // delegates
    // delegators

    public RegexSimpleLexer() {;} 
    public RegexSimpleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RegexSimpleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g"; }

    // $ANTLR start "REGEXP_DELIMITER"
    public final void mREGEXP_DELIMITER() throws RecognitionException {
        try {
            int _type = REGEXP_DELIMITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:108:2: ( '/' )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:108:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP_DELIMITER"

    // $ANTLR start "REGEXP_FLAG"
    public final void mREGEXP_FLAG() throws RecognitionException {
        try {
            int _type = REGEXP_FLAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:112:2: ( CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE | NULL_ESCAPE )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                alt1=1;
            }
            else if ( (LA1_0=='\\') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='U'||LA1_2=='u'||LA1_2=='x') ) {
                    alt1=1;
                }
                else if ( (LA1_2=='_') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:112:4: CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE
                    {
                    mCONTINUING_IDENTIFIER_CHAR_OR_ESCAPE(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:113:4: NULL_ESCAPE
                    {
                    mNULL_ESCAPE(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP_FLAG"

    // $ANTLR start "REGEXP_CHAR"
    public final void mREGEXP_CHAR() throws RecognitionException {
        try {
            int _type = REGEXP_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:117:2: ( ORDINARY_REGEXP_CHAR | ESC NON_TERMINATOR )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='.')||(LA2_0>='0' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='\\') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:117:4: ORDINARY_REGEXP_CHAR
                    {
                    mORDINARY_REGEXP_CHAR(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:118:4: ESC NON_TERMINATOR
                    {
                    mESC(); 
                    mNON_TERMINATOR(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEXP_CHAR"

    // $ANTLR start "TERMINATOR"
    public final void mTERMINATOR() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:122:2: ( '\\n' | '\\r' )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "TERMINATOR"

    // $ANTLR start "ORDINARY_REGEXP_CHAR"
    public final void mORDINARY_REGEXP_CHAR() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:126:2: (~ ( '\\n' | '\\r' | '\\\\' | '/' ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:126:4: ~ ( '\\n' | '\\r' | '\\\\' | '/' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ORDINARY_REGEXP_CHAR"

    // $ANTLR start "NON_TERMINATOR"
    public final void mNON_TERMINATOR() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:130:2: (~ TERMINATOR )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:130:4: ~ TERMINATOR
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u000E')||(input.LA(1)>='\u0010' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NON_TERMINATOR"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:134:2: ( '\\\\' )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:134:4: '\\\\'
            {
            match('\\'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "NULL_ESCAPE"
    public final void mNULL_ESCAPE() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:138:2: ( ESC '_' )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:138:4: ESC '_'
            {
            mESC(); 
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NULL_ESCAPE"

    // $ANTLR start "CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE"
    public final void mCONTINUING_IDENTIFIER_CHAR_OR_ESCAPE() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:142:2: ( CONTINUING_IDENTIFIER_CHAR | ESC HEX_ESCAPE )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='$'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='\\') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:142:4: CONTINUING_IDENTIFIER_CHAR
                    {
                    mCONTINUING_IDENTIFIER_CHAR(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:143:4: ESC HEX_ESCAPE
                    {
                    mESC(); 
                    mHEX_ESCAPE(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE"

    // $ANTLR start "CONTINUING_IDENTIFIER_CHAR"
    public final void mCONTINUING_IDENTIFIER_CHAR() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:147:2: ( UNICODE_ALPHANUMERIC | '$' | '_' )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CONTINUING_IDENTIFIER_CHAR"

    // $ANTLR start "UNICODE_ALPHANUMERIC"
    public final void mUNICODE_ALPHANUMERIC() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:152:2: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ALPHANUMERIC"

    // $ANTLR start "HEX_ESCAPE"
    public final void mHEX_ESCAPE() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:156:2: ( 'x' HEX_DIGIT HEX_DIGIT | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'x':
                {
                alt4=1;
                }
                break;
            case 'u':
                {
                alt4=2;
                }
                break;
            case 'U':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:156:4: 'x' HEX_DIGIT HEX_DIGIT
                    {
                    match('x'); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:157:4: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('u'); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:158:4: 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('U'); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HEX_ESCAPE"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:162:2: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:1:8: ( REGEXP_DELIMITER | REGEXP_FLAG | REGEXP_CHAR )
        int alt5=3;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:1:10: REGEXP_DELIMITER
                {
                mREGEXP_DELIMITER(); 

                }
                break;
            case 2 :
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:1:27: REGEXP_FLAG
                {
                mREGEXP_FLAG(); 

                }
                break;
            case 3 :
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:1:39: REGEXP_CHAR
                {
                mREGEXP_CHAR(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\6\uffff\3\4\1\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\0\2\uffff\1\0\2\uffff\3\60\1\uffff";
    static final String DFA5_maxS =
        "\1\uffff\2\uffff\1\uffff\2\uffff\3\146\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\2\3\uffff\1\2";
    static final String DFA5_specialS =
        "\1\0\2\uffff\1\1\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\4\1\uffff\2\4\1\uffff\26\4\1\2\12\4\1\1\12\2\7\4\32\2\1"+
            "\4\1\3\2\4\1\2\1\4\32\2\uff85\4",
            "",
            "",
            "\12\4\1\uffff\2\4\1\uffff\107\4\1\10\11\4\1\11\25\4\1\7\2"+
            "\4\1\6\uff87\4",
            "",
            "",
            "\12\5\7\uffff\6\5\32\uffff\6\5",
            "\12\5\7\uffff\6\5\32\uffff\6\5",
            "\12\5\7\uffff\6\5\32\uffff\6\5",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( REGEXP_DELIMITER | REGEXP_FLAG | REGEXP_CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='/') ) {s = 1;}

                        else if ( (LA5_0=='$'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {s = 2;}

                        else if ( (LA5_0=='\\') ) {s = 3;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='#')||(LA5_0>='%' && LA5_0<='.')||(LA5_0>=':' && LA5_0<='@')||LA5_0=='['||(LA5_0>=']' && LA5_0<='^')||LA5_0=='`'||(LA5_0>='{' && LA5_0<='\uFFFF')) ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_3 = input.LA(1);

                        s = -1;
                        if ( (LA5_3=='x') ) {s = 6;}

                        else if ( (LA5_3=='u') ) {s = 7;}

                        else if ( (LA5_3=='U') ) {s = 8;}

                        else if ( (LA5_3=='_') ) {s = 9;}

                        else if ( ((LA5_3>='\u0000' && LA5_3<='\t')||(LA5_3>='\u000B' && LA5_3<='\f')||(LA5_3>='\u000E' && LA5_3<='T')||(LA5_3>='V' && LA5_3<='^')||(LA5_3>='`' && LA5_3<='t')||(LA5_3>='v' && LA5_3<='w')||(LA5_3>='y' && LA5_3<='\uFFFF')) ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}