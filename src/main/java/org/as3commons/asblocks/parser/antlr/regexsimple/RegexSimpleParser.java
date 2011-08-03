// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g 2011-07-10 10:19:17

package org.as3commons.asblocks.parser.antlr.regexsimple;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

/**
 * Provides a simple scanner that can recognose the extent of a regular
 * expression within the surrounding actionscript program, without parsing
 * it 'fully'.  This should be the simplest possible handling that
 * will allow the 'outer' actionscript grammar to find the end of the
 * regular expression literal, anc continue parsing the rest of the code.
 */
public class RegexSimpleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "REGEXP_LITERAL", "REGEXP_BODY", "REGEXP_FLAGS", "REGEXP_DELIMITER", "REGEXP_CHAR", "REGEXP_FLAG", "CONTINUING_IDENTIFIER_CHAR_OR_ESCAPE", "NULL_ESCAPE", "ORDINARY_REGEXP_CHAR", "ESC", "NON_TERMINATOR", "TERMINATOR", "CONTINUING_IDENTIFIER_CHAR", "HEX_ESCAPE", "UNICODE_ALPHANUMERIC", "HEX_DIGIT"
    };
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


        public RegexSimpleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RegexSimpleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RegexSimpleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g"; }


    	// disable standard error handling; be strict
    	//protected void mismatch(IntStream input, int ttype, BitSet follow)
    	//	throws RecognitionException
    	//{
    	//	throw new MismatchedTokenException(ttype, input);
    	//}

    	private RegexSimpleLexer lexer;
    	private CharStream cs;

    	public void setInput(RegexSimpleLexer lexer, CharStream cs)
    	{
    		this.lexer = lexer;
    		this.cs = cs;
    	}

    	/**
    	 * Returns the input left unconsumed after the last parse operation.
    	 * Because of lookahead in the parser, there is no guarantee that the
    	 * lexer has not consumed input ahead of the current parse-point for
    	 * any abritrary rule. This method is only intended to grab the
    	 * remaining input after recognising 'regexpLiteral'.
    	 */
    	public String getInputTail()
    	{
    		return cs.substring(cs.index() - 1, cs.size() - 1);
    	}


    public static class regexpLiteral_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "regexpLiteral"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:87:1: regexpLiteral : s= REGEXP_DELIMITER regexpBody REGEXP_DELIMITER ( regexpFlags )? -> ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? ) ;
    public final RegexSimpleParser.regexpLiteral_return regexpLiteral() throws RecognitionException {
        RegexSimpleParser.regexpLiteral_return retval = new RegexSimpleParser.regexpLiteral_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token s=null;
        Token REGEXP_DELIMITER2=null;
        RegexSimpleParser.regexpBody_return regexpBody1 = null;

        RegexSimpleParser.regexpFlags_return regexpFlags3 = null;


        LinkedListTree s_tree=null;
        LinkedListTree REGEXP_DELIMITER2_tree=null;
        RewriteRuleTokenStream stream_REGEXP_DELIMITER=new RewriteRuleTokenStream(adaptor,"token REGEXP_DELIMITER");
        RewriteRuleSubtreeStream stream_regexpBody=new RewriteRuleSubtreeStream(adaptor,"rule regexpBody");
        RewriteRuleSubtreeStream stream_regexpFlags=new RewriteRuleSubtreeStream(adaptor,"rule regexpFlags");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:88:2: (s= REGEXP_DELIMITER regexpBody REGEXP_DELIMITER ( regexpFlags )? -> ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:88:4: s= REGEXP_DELIMITER regexpBody REGEXP_DELIMITER ( regexpFlags )?
            {
            s=(Token)match(input,REGEXP_DELIMITER,FOLLOW_REGEXP_DELIMITER_in_regexpLiteral93);  
            stream_REGEXP_DELIMITER.add(s);

            pushFollow(FOLLOW_regexpBody_in_regexpLiteral95);
            regexpBody1=regexpBody();

            state._fsp--;

            stream_regexpBody.add(regexpBody1.getTree());
            REGEXP_DELIMITER2=(Token)match(input,REGEXP_DELIMITER,FOLLOW_REGEXP_DELIMITER_in_regexpLiteral97);  
            stream_REGEXP_DELIMITER.add(REGEXP_DELIMITER2);

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:89:3: ( regexpFlags )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==REGEXP_FLAG) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:89:3: regexpFlags
                    {
                    pushFollow(FOLLOW_regexpFlags_in_regexpLiteral101);
                    regexpFlags3=regexpFlags();

                    state._fsp--;

                    stream_regexpFlags.add(regexpFlags3.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: regexpBody, regexpFlags
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 90:3: -> ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:90:6: ^( REGEXP_LITERAL[$s] regexpBody ( regexpFlags )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(REGEXP_LITERAL, s), root_1);

                adaptor.addChild(root_1, stream_regexpBody.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:90:38: ( regexpFlags )?
                if ( stream_regexpFlags.hasNext() ) {
                    adaptor.addChild(root_1, stream_regexpFlags.nextTree());

                }
                stream_regexpFlags.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "regexpLiteral"

    public static class regexpBody_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "regexpBody"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:93:1: regexpBody : ( bodyChar )+ -> ^( REGEXP_BODY ( bodyChar )+ ) ;
    public final RegexSimpleParser.regexpBody_return regexpBody() throws RecognitionException {
        RegexSimpleParser.regexpBody_return retval = new RegexSimpleParser.regexpBody_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        RegexSimpleParser.bodyChar_return bodyChar4 = null;


        RewriteRuleSubtreeStream stream_bodyChar=new RewriteRuleSubtreeStream(adaptor,"rule bodyChar");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:94:2: ( ( bodyChar )+ -> ^( REGEXP_BODY ( bodyChar )+ ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:94:4: ( bodyChar )+
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:94:4: ( bodyChar )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=REGEXP_CHAR && LA2_0<=REGEXP_FLAG)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:94:4: bodyChar
            	    {
            	    pushFollow(FOLLOW_bodyChar_in_regexpBody127);
            	    bodyChar4=bodyChar();

            	    state._fsp--;

            	    stream_bodyChar.add(bodyChar4.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);



            // AST REWRITE
            // elements: bodyChar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 95:3: -> ^( REGEXP_BODY ( bodyChar )+ )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:95:6: ^( REGEXP_BODY ( bodyChar )+ )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(REGEXP_BODY, "REGEXP_BODY"), root_1);

                if ( !(stream_bodyChar.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_bodyChar.hasNext() ) {
                    adaptor.addChild(root_1, stream_bodyChar.nextTree());

                }
                stream_bodyChar.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "regexpBody"

    public static class bodyChar_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bodyChar"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:98:1: bodyChar : ( REGEXP_CHAR | REGEXP_FLAG );
    public final RegexSimpleParser.bodyChar_return bodyChar() throws RecognitionException {
        RegexSimpleParser.bodyChar_return retval = new RegexSimpleParser.bodyChar_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set5=null;

        LinkedListTree set5_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:99:2: ( REGEXP_CHAR | REGEXP_FLAG )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set5=(Token)input.LT(1);
            if ( (input.LA(1)>=REGEXP_CHAR && input.LA(1)<=REGEXP_FLAG) ) {
                input.consume();
                adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set5));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "bodyChar"

    public static class regexpFlags_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "regexpFlags"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:102:1: regexpFlags : ( REGEXP_FLAG )+ -> ^( REGEXP_FLAGS ( REGEXP_FLAG )+ ) ;
    public final RegexSimpleParser.regexpFlags_return regexpFlags() throws RecognitionException {
        RegexSimpleParser.regexpFlags_return retval = new RegexSimpleParser.regexpFlags_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token REGEXP_FLAG6=null;

        LinkedListTree REGEXP_FLAG6_tree=null;
        RewriteRuleTokenStream stream_REGEXP_FLAG=new RewriteRuleTokenStream(adaptor,"token REGEXP_FLAG");

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:103:2: ( ( REGEXP_FLAG )+ -> ^( REGEXP_FLAGS ( REGEXP_FLAG )+ ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:103:4: ( REGEXP_FLAG )+
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:103:4: ( REGEXP_FLAG )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==REGEXP_FLAG) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:103:4: REGEXP_FLAG
            	    {
            	    REGEXP_FLAG6=(Token)match(input,REGEXP_FLAG,FOLLOW_REGEXP_FLAG_in_regexpFlags165);  
            	    stream_REGEXP_FLAG.add(REGEXP_FLAG6);


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



            // AST REWRITE
            // elements: REGEXP_FLAG
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 104:3: -> ^( REGEXP_FLAGS ( REGEXP_FLAG )+ )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\regexsimple\\RegexSimple.g:104:6: ^( REGEXP_FLAGS ( REGEXP_FLAG )+ )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(REGEXP_FLAGS, "REGEXP_FLAGS"), root_1);

                if ( !(stream_REGEXP_FLAG.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_REGEXP_FLAG.hasNext() ) {
                    adaptor.addChild(root_1, stream_REGEXP_FLAG.nextNode());

                }
                stream_REGEXP_FLAG.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "regexpFlags"

    // Delegated rules


 

    public static final BitSet FOLLOW_REGEXP_DELIMITER_in_regexpLiteral93 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_regexpBody_in_regexpLiteral95 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_REGEXP_DELIMITER_in_regexpLiteral97 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_regexpFlags_in_regexpLiteral101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bodyChar_in_regexpBody127 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_set_in_bodyChar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEXP_FLAG_in_regexpFlags165 = new BitSet(new long[]{0x0000000000000202L});

}