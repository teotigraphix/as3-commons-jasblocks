// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g 2011-08-06 09:36:50

package org.as3commons.asblocks.parser.antlr.asdoc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ASDocLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ASDOC=4;
    public static final int INLINE_TAG=5;
    public static final int DESCRIPTION=6;
    public static final int PARA_TAG=7;
    public static final int TEXT_LINE=8;
    public static final int VIRTUAL_WS=9;
    public static final int NL=10;
    public static final int WORD=11;
    public static final int STARS=12;
    public static final int WS=13;
    public static final int LBRACE=14;
    public static final int RBRACE=15;
    public static final int AT=16;
    public static final int ATWORD=17;
    public static final int WORD_TAIL=18;

    	//protected void mismatch(IntStream input, int ttype, BitSet follow)
    	//	throws RecognitionException
    	//{
    	//	throw new MismatchedTokenException(ttype, input);
    	//}


    // delegates
    // delegators

    public ASDocLexer() {;} 
    public ASDocLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ASDocLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g"; }

    // $ANTLR start "STARS"
    public final void mSTARS() throws RecognitionException {
        try {
            int _type = STARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:131:6: ( ( '*' )+ ( ' ' | '\\t' )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:131:9: ( '*' )+ ( ' ' | '\\t' )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:131:9: ( '*' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:131:9: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:131:14: ( ' ' | '\\t' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\t'||LA2_0==' ') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:
                    {
                    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "STARS"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:133:7: ( '{' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:133:10: '{'
            {
            match('{'); 

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
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:134:7: ( '}' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:134:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:135:3: ( '@' )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:135:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:137:3: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:137:6: ( ' ' | '\\t' )+
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:137:6: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:2: ( ( '\\r\\n' | '\\r' | '\\n' ) ( WS )? ( STARS )? )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:5: ( '\\r\\n' | '\\r' | '\\n' ) ( WS )? ( STARS )?
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:5: ( '\\r\\n' | '\\r' | '\\n' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='\n') ) {
                    alt4=1;
                }
                else {
                    alt4=2;}
            }
            else if ( (LA4_0=='\n') ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:6: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:15: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:22: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:28: ( WS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\t'||LA5_0==' ') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:28: WS
                    {
                    mWS(); 

                    }
                    break;

            }

            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:32: ( STARS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='*') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:143:33: STARS
                    {
                    mSTARS(); 

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
    // $ANTLR end "NL"

    // $ANTLR start "ATWORD"
    public final void mATWORD() throws RecognitionException {
        try {
            int _type = ATWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:148:7: ( ( WS )? '@' WORD WORD_TAIL )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:148:10: ( WS )? '@' WORD WORD_TAIL
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:148:10: ( WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\t'||LA7_0==' ') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:148:10: WS
                    {
                    mWS(); 

                    }
                    break;

            }

            match('@'); 
            mWORD(); 
            mWORD_TAIL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATWORD"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:150:5: (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' | '@' ) WORD_TAIL )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:150:8: ~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' | '@' ) WORD_TAIL
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mWORD_TAIL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "WORD_TAIL"
    public final void mWORD_TAIL() throws RecognitionException {
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:154:10: ( (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' ) )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:154:12: (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' ) )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:154:12: (~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||(LA8_0>='!' && LA8_0<='z')||LA8_0=='|'||(LA8_0>='~' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:154:13: ~ ( '\\n' | ' ' | '\\r' | '\\t' | '{' | '}' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "WORD_TAIL"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:8: ( STARS | LBRACE | RBRACE | AT | WS | NL | ATWORD | WORD )
        int alt9=8;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:10: STARS
                {
                mSTARS(); 

                }
                break;
            case 2 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:16: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 3 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:23: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 4 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:30: AT
                {
                mAT(); 

                }
                break;
            case 5 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:33: WS
                {
                mWS(); 

                }
                break;
            case 6 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:36: NL
                {
                mNL(); 

                }
                break;
            case 7 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:39: ATWORD
                {
                mATWORD(); 

                }
                break;
            case 8 :
                // C:\\Users\\Teoti\\Documents\\Flash\\ws-as-blocks\\as3commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:1:46: WORD
                {
                mWORD(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\10\2\uffff\1\12\1\14\3\uffff\1\10\3\uffff";
    static final String DFA9_eofS =
        "\15\uffff";
    static final String DFA9_minS =
        "\2\0\2\uffff\1\0\1\11\3\uffff\1\0\3\uffff";
    static final String DFA9_maxS =
        "\2\uffff\2\uffff\1\uffff\1\100\3\uffff\1\uffff\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\1\10\1\1\1\uffff\1\4\1\7\1\5";
    static final String DFA9_specialS =
        "\1\1\1\2\2\uffff\1\0\4\uffff\1\3\3\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\7\1\5\1\6\2\7\1\6\22\7\1\5\11\7\1\1\25\7\1\4\72\7\1\2\1"+
            "\7\1\3\uff82\7",
            "\11\7\2\uffff\2\7\1\uffff\22\7\1\uffff\11\7\1\11\120\7\1\uffff"+
            "\1\7\1\uffff\uff82\7",
            "",
            "",
            "\11\13\2\uffff\2\13\1\uffff\22\13\1\uffff\37\13\1\uffff\72"+
            "\13\1\uffff\1\13\1\uffff\uff82\13",
            "\1\5\26\uffff\1\5\37\uffff\1\13",
            "",
            "",
            "",
            "\11\7\2\uffff\2\7\1\uffff\22\7\1\uffff\11\7\1\11\120\7\1\uffff"+
            "\1\7\1\uffff\uff82\7",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STARS | LBRACE | RBRACE | AT | WS | NL | ATWORD | WORD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_4 = input.LA(1);

                        s = -1;
                        if ( ((LA9_4>='\u0000' && LA9_4<='\b')||(LA9_4>='\u000B' && LA9_4<='\f')||(LA9_4>='\u000E' && LA9_4<='\u001F')||(LA9_4>='!' && LA9_4<='?')||(LA9_4>='A' && LA9_4<='z')||LA9_4=='|'||(LA9_4>='~' && LA9_4<='\uFFFF')) ) {s = 11;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='*') ) {s = 1;}

                        else if ( (LA9_0=='{') ) {s = 2;}

                        else if ( (LA9_0=='}') ) {s = 3;}

                        else if ( (LA9_0=='@') ) {s = 4;}

                        else if ( (LA9_0=='\t'||LA9_0==' ') ) {s = 5;}

                        else if ( (LA9_0=='\n'||LA9_0=='\r') ) {s = 6;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='!' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='?')||(LA9_0>='A' && LA9_0<='z')||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {s = 7;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_1 = input.LA(1);

                        s = -1;
                        if ( (LA9_1=='*') ) {s = 9;}

                        else if ( ((LA9_1>='\u0000' && LA9_1<='\b')||(LA9_1>='\u000B' && LA9_1<='\f')||(LA9_1>='\u000E' && LA9_1<='\u001F')||(LA9_1>='!' && LA9_1<=')')||(LA9_1>='+' && LA9_1<='z')||LA9_1=='|'||(LA9_1>='~' && LA9_1<='\uFFFF')) ) {s = 7;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_9 = input.LA(1);

                        s = -1;
                        if ( (LA9_9=='*') ) {s = 9;}

                        else if ( ((LA9_9>='\u0000' && LA9_9<='\b')||(LA9_9>='\u000B' && LA9_9<='\f')||(LA9_9>='\u000E' && LA9_9<='\u001F')||(LA9_9>='!' && LA9_9<=')')||(LA9_9>='+' && LA9_9<='z')||LA9_9=='|'||(LA9_9>='~' && LA9_9<='\uFFFF')) ) {s = 7;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}