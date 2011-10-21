// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g 2011-10-21 10:37:07

package org.as3commons.asblocks.parser.antlr.e4x;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class E4XLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int COMPILATION_UNIT=4;
    public static final int XML_ROOT_ELEMENT=5;
    public static final int XML_EMPTY_ELEMENT=6;
    public static final int XML_ELEMENT=7;
    public static final int XML_ELEMENT_CONTENT=8;
    public static final int XML_TAG_CONTENT=9;
    public static final int XML_ATTRIBUTE=10;
    public static final int XML_LIST=11;
    public static final int XML_COMMENT=12;
    public static final int XML_CDATA=13;
    public static final int XML_PI=14;
    public static final int XML_LCHEVRON=15;
    public static final int RCLOSE=16;
    public static final int XML_RCHEVRON=17;
    public static final int LCLOSE=18;
    public static final int XML_NAME=19;
    public static final int XML_TEXT=20;
    public static final int XML_ATTRIBUTE_VALUE=21;
    public static final int WS=22;
    public static final int EOL=23;
    public static final int XML_NAME_START=24;
    public static final int XML_NAME_PART=25;
    public static final int UNICODE_LETTER=26;
    public static final int UNICODE_DIGIT=27;

    // delegates
    // delegators

    public E4XLexer() {;} 
    public E4XLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public E4XLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:12:7: ( '<>' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:12:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:13:7: ( '</>' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:13:9: '</>'
            {
            match("</>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:14:7: ( '=' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "XML_LCHEVRON"
    public final void mXML_LCHEVRON() throws RecognitionException {
        try {
            int _type = XML_LCHEVRON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:181:15: ( '<' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:181:17: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_LCHEVRON"

    // $ANTLR start "XML_RCHEVRON"
    public final void mXML_RCHEVRON() throws RecognitionException {
        try {
            int _type = XML_RCHEVRON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:182:15: ( '>' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:182:17: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_RCHEVRON"

    // $ANTLR start "LCLOSE"
    public final void mLCLOSE() throws RecognitionException {
        try {
            int _type = LCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:184:9: ( '</' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:184:12: '</'
            {
            match("</"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCLOSE"

    // $ANTLR start "RCLOSE"
    public final void mRCLOSE() throws RecognitionException {
        try {
            int _type = RCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:185:9: ( '/>' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:185:12: '/>'
            {
            match("/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCLOSE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:190:4: ( ( ' ' | '\\t' | '\\f' )+ )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:190:6: ( ' ' | '\\t' | '\\f' )+
            {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:190:6: ( ' ' | '\\t' | '\\f' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0=='\f'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            _channel=HIDDEN;

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
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:199:2: ( ( '\\r' '\\n' | '\\r' | '\\n' ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:199:4: ( '\\r' '\\n' | '\\r' | '\\n' )
            {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:199:4: ( '\\r' '\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:200:4: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:201:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:202:5: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "XML_NAME"
    public final void mXML_NAME() throws RecognitionException {
        try {
            int _type = XML_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:208:2: ( XML_NAME_START ( XML_NAME_PART )* )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:208:4: XML_NAME_START ( XML_NAME_PART )*
            {
            mXML_NAME_START(); 
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:208:19: ( XML_NAME_PART )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<=':')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:208:19: XML_NAME_PART
            	    {
            	    mXML_NAME_PART(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_NAME"

    // $ANTLR start "XML_ATTRIBUTE_VALUE"
    public final void mXML_ATTRIBUTE_VALUE() throws RecognitionException {
        try {
            int _type = XML_ATTRIBUTE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:212:2: ( '\\'' ( options {greedy=false; } : . )* '\\'' | '\"' ( options {greedy=false; } : . )* '\"' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\'') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\"') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:212:4: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:212:9: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\'') ) {
                            alt4=2;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:212:37: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:213:4: '\"' ( options {greedy=false; } : . )* '\"'
                    {
                    match('\"'); 
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:213:8: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\"') ) {
                            alt5=2;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:213:36: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_ATTRIBUTE_VALUE"

    // $ANTLR start "XML_PI"
    public final void mXML_PI() throws RecognitionException {
        try {
            int _type = XML_PI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:216:10: ( '<?' ( options {greedy=false; } : . )* '?>' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:216:12: '<?' ( options {greedy=false; } : . )* '?>'
            {
            match("<?"); 

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:216:17: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='?') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='>') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='=')||(LA7_1>='?' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='>')||(LA7_0>='@' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:216:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("?>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_PI"

    // $ANTLR start "XML_COMMENT"
    public final void mXML_COMMENT() throws RecognitionException {
        try {
            int _type = XML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:219:14: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:219:16: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:219:23: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='-') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='-') ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3=='>') ) {
                            alt8=2;
                        }
                        else if ( ((LA8_3>='\u0000' && LA8_3<='=')||(LA8_3>='?' && LA8_3<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<=',')||(LA8_1>='.' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=',')||(LA8_0>='.' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:219:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("-->"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_COMMENT"

    // $ANTLR start "XML_CDATA"
    public final void mXML_CDATA() throws RecognitionException {
        try {
            int _type = XML_CDATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:222:12: ( '<![CDATA[' ( options {greedy=false; } : . )* ']]>' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:222:14: '<![CDATA[' ( options {greedy=false; } : . )* ']]>'
            {
            match("<![CDATA["); 

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:222:26: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==']') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==']') ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3=='>') ) {
                            alt9=2;
                        }
                        else if ( ((LA9_3>='\u0000' && LA9_3<='=')||(LA9_3>='?' && LA9_3<='\uFFFF')) ) {
                            alt9=1;
                        }


                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='\\')||(LA9_1>='^' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='\\')||(LA9_0>='^' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:222:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("]]>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_CDATA"

    // $ANTLR start "XML_NAME_START"
    public final void mXML_NAME_START() throws RecognitionException {
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:224:25: ( UNICODE_LETTER | '_' | ':' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
            {
            if ( input.LA(1)==':'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "XML_NAME_START"

    // $ANTLR start "XML_NAME_PART"
    public final void mXML_NAME_PART() throws RecognitionException {
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:225:24: ( UNICODE_LETTER | UNICODE_DIGIT | '.' | '-' | '_' | ':' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
            {
            if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "XML_NAME_PART"

    // $ANTLR start "UNICODE_LETTER"
    public final void mUNICODE_LETTER() throws RecognitionException {
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:228:25: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "UNICODE_LETTER"

    // $ANTLR start "UNICODE_DIGIT"
    public final void mUNICODE_DIGIT() throws RecognitionException {
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:229:24: ( '0' .. '9' )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:229:26: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_DIGIT"

    // $ANTLR start "XML_TEXT"
    public final void mXML_TEXT() throws RecognitionException {
        try {
            int _type = XML_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:232:2: ( (~ ( XML_LCHEVRON ) ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:232:4: (~ ( XML_LCHEVRON ) )
            {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:232:4: (~ ( XML_LCHEVRON ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:232:5: ~ ( XML_LCHEVRON )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XML_TEXT"

    public void mTokens() throws RecognitionException {
        // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:8: ( T__28 | T__29 | T__30 | XML_LCHEVRON | XML_RCHEVRON | LCLOSE | RCLOSE | WS | EOL | XML_NAME | XML_ATTRIBUTE_VALUE | XML_PI | XML_COMMENT | XML_CDATA | XML_TEXT )
        int alt10=15;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:22: T__30
                {
                mT__30(); 

                }
                break;
            case 4 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:28: XML_LCHEVRON
                {
                mXML_LCHEVRON(); 

                }
                break;
            case 5 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:41: XML_RCHEVRON
                {
                mXML_RCHEVRON(); 

                }
                break;
            case 6 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:54: LCLOSE
                {
                mLCLOSE(); 

                }
                break;
            case 7 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:61: RCLOSE
                {
                mRCLOSE(); 

                }
                break;
            case 8 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:68: WS
                {
                mWS(); 

                }
                break;
            case 9 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:71: EOL
                {
                mEOL(); 

                }
                break;
            case 10 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:75: XML_NAME
                {
                mXML_NAME(); 

                }
                break;
            case 11 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:84: XML_ATTRIBUTE_VALUE
                {
                mXML_ATTRIBUTE_VALUE(); 

                }
                break;
            case 12 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:104: XML_PI
                {
                mXML_PI(); 

                }
                break;
            case 13 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:111: XML_COMMENT
                {
                mXML_COMMENT(); 

                }
                break;
            case 14 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:123: XML_CDATA
                {
                mXML_CDATA(); 

                }
                break;
            case 15 :
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:1:133: XML_TEXT
                {
                mXML_TEXT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\20\2\uffff\1\13\4\uffff\2\13\2\uffff\1\31\16\uffff";
    static final String DFA10_eofS =
        "\34\uffff";
    static final String DFA10_minS =
        "\1\0\1\41\2\uffff\1\76\4\uffff\2\0\2\uffff\1\76\1\uffff\1\55\14"+
        "\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\77\2\uffff\1\76\4\uffff\2\uffff\2\uffff\1\76\1\uffff"+
        "\1\133\14\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\3\1\5\1\uffff\1\10\2\11\1\12\2\uffff\1\17\1\1\1\uffff"+
        "\1\14\1\uffff\1\4\1\3\1\5\1\7\1\10\1\11\1\12\1\13\1\2\1\6\1\15\1"+
        "\16";
    static final String DFA10_specialS =
        "\1\1\10\uffff\1\0\1\2\21\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\13\1\5\1\7\1\13\1\5\1\6\22\13\1\5\1\13\1\12\4\13\1\11\7"+
            "\13\1\4\12\13\1\10\1\13\1\1\1\2\1\3\2\13\32\10\4\13\1\10\1\13"+
            "\32\10\uff85\13",
            "\1\17\15\uffff\1\15\16\uffff\1\14\1\16",
            "",
            "",
            "\1\23",
            "",
            "",
            "",
            "",
            "\0\27",
            "\0\27",
            "",
            "",
            "\1\30",
            "",
            "\1\32\55\uffff\1\33",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | XML_LCHEVRON | XML_RCHEVRON | LCLOSE | RCLOSE | WS | EOL | XML_NAME | XML_ATTRIBUTE_VALUE | XML_PI | XML_COMMENT | XML_CDATA | XML_TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_9 = input.LA(1);

                        s = -1;
                        if ( ((LA10_9>='\u0000' && LA10_9<='\uFFFF')) ) {s = 23;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='<') ) {s = 1;}

                        else if ( (LA10_0=='=') ) {s = 2;}

                        else if ( (LA10_0=='>') ) {s = 3;}

                        else if ( (LA10_0=='/') ) {s = 4;}

                        else if ( (LA10_0=='\t'||LA10_0=='\f'||LA10_0==' ') ) {s = 5;}

                        else if ( (LA10_0=='\r') ) {s = 6;}

                        else if ( (LA10_0=='\n') ) {s = 7;}

                        else if ( (LA10_0==':'||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {s = 8;}

                        else if ( (LA10_0=='\'') ) {s = 9;}

                        else if ( (LA10_0=='\"') ) {s = 10;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||LA10_0=='\u000B'||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='.')||(LA10_0>='0' && LA10_0<='9')||LA10_0==';'||(LA10_0>='?' && LA10_0<='@')||(LA10_0>='[' && LA10_0<='^')||LA10_0=='`'||(LA10_0>='{' && LA10_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_10 = input.LA(1);

                        s = -1;
                        if ( ((LA10_10>='\u0000' && LA10_10<='\uFFFF')) ) {s = 23;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}