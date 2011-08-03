// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g 2011-07-23 09:26:22

package org.as3commons.asblocks.parser.antlr.asdoc;

import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.antlr.runtime.MismatchedTokenException;
import org.as3commons.asblocks.impl.TokenBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class ASDocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASDOC", "INLINE_TAG", "DESCRIPTION", "PARA_TAG", "TEXT_LINE", "VIRTUAL_WS", "NL", "WORD", "STARS", "WS", "LBRACE", "RBRACE", "AT", "ATWORD", "WORD_TAIL"
    };
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

    // delegates
    // delegators


        public ASDocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ASDocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ASDocParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g"; }


    	//protected void mismatch(IntStream input, int ttype, BitSet follow)
    	//	throws RecognitionException
    	//{
    	//	throw new MismatchedTokenException(ttype, input);
    	//}

    	private void placeholder(LinkedListTree imaginary) {
    		
    		if (imaginary.getChildCount() > 0)
    			return;

    		LinkedListToken tok = (LinkedListToken) input.LT(1);
    		LinkedListToken placeholder = TokenBuilder.newPlaceholder(imaginary);
    		tok.prependToken(placeholder);
    	}



    public static class commentBody_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commentBody"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:81:1: commentBody : d= description ( paragraphTag )* EOF -> ^( ASDOC description ( paragraphTag )* ) ;
    public final ASDocParser.commentBody_return commentBody() throws RecognitionException {
        ASDocParser.commentBody_return retval = new ASDocParser.commentBody_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token EOF2=null;
        ASDocParser.description_return d = null;

        ASDocParser.paragraphTag_return paragraphTag1 = null;


        LinkedListTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_paragraphTag=new RewriteRuleSubtreeStream(adaptor,"rule paragraphTag");
        RewriteRuleSubtreeStream stream_description=new RewriteRuleSubtreeStream(adaptor,"rule description");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:82:2: (d= description ( paragraphTag )* EOF -> ^( ASDOC description ( paragraphTag )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:82:4: d= description ( paragraphTag )* EOF
            {
            pushFollow(FOLLOW_description_in_commentBody119);
            d=description();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_description.add(d.getTree());
            if ( state.backtracking==0 ) {
              placeholder((d!=null?((LinkedListTree)d.tree):null));
            }
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:83:3: ( paragraphTag )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ATWORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:83:3: paragraphTag
            	    {
            	    pushFollow(FOLLOW_paragraphTag_in_commentBody125);
            	    paragraphTag1=paragraphTag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_paragraphTag.add(paragraphTag1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_commentBody130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);



            // AST REWRITE
            // elements: paragraphTag, description
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 85:3: -> ^( ASDOC description ( paragraphTag )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:85:6: ^( ASDOC description ( paragraphTag )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(ASDOC, "ASDOC"), root_1);

                adaptor.addChild(root_1, stream_description.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:85:26: ( paragraphTag )*
                while ( stream_paragraphTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_paragraphTag.nextTree());

                }
                stream_paragraphTag.reset();

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
    // $ANTLR end "commentBody"

    public static class description_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "description"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:89:1: description : ( textLine )* -> ^( DESCRIPTION ( textLine )* ) ;
    public final ASDocParser.description_return description() throws RecognitionException {
        ASDocParser.description_return retval = new ASDocParser.description_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        ASDocParser.textLine_return textLine3 = null;


        RewriteRuleSubtreeStream stream_textLine=new RewriteRuleSubtreeStream(adaptor,"rule textLine");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:90:2: ( ( textLine )* -> ^( DESCRIPTION ( textLine )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:90:4: ( textLine )*
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:90:4: ( textLine )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:90:4: textLine
            	    {
            	    pushFollow(FOLLOW_textLine_in_description155);
            	    textLine3=textLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_textLine.add(textLine3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: textLine
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 91:3: -> ^( DESCRIPTION ( textLine )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:91:6: ^( DESCRIPTION ( textLine )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(DESCRIPTION, "DESCRIPTION"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:91:20: ( textLine )*
                while ( stream_textLine.hasNext() ) {
                    adaptor.addChild(root_1, stream_textLine.nextTree());

                }
                stream_textLine.reset();

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
    // $ANTLR end "description"

    public static class textLine_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textLine"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:94:1: textLine : ( textLineStart ( textLineContent )* ( NL | EOF ) | NL );
    public final ASDocParser.textLine_return textLine() throws RecognitionException {
        ASDocParser.textLine_return retval = new ASDocParser.textLine_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token NL6=null;
        Token EOF7=null;
        Token NL8=null;
        ASDocParser.textLineStart_return textLineStart4 = null;

        ASDocParser.textLineContent_return textLineContent5 = null;


        LinkedListTree NL6_tree=null;
        LinkedListTree EOF7_tree=null;
        LinkedListTree NL8_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:95:2: ( textLineStart ( textLineContent )* ( NL | EOF ) | NL )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=WORD && LA5_0<=AT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==NL) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:95:4: textLineStart ( textLineContent )* ( NL | EOF )
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_textLineStart_in_textLine178);
                    textLineStart4=textLineStart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textLineStart4.getTree());
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:96:3: ( textLineContent )*
                    loop3:
                    do {
                        int alt3=2;
                        alt3 = dfa3.predict(input);
                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:96:3: textLineContent
                    	    {
                    	    pushFollow(FOLLOW_textLineContent_in_textLine182);
                    	    textLineContent5=textLineContent();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, textLineContent5.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:97:3: ( NL | EOF )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NL) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==EOF) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:97:4: NL
                            {
                            NL6=(Token)match(input,NL,FOLLOW_NL_in_textLine188); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NL6_tree = (LinkedListTree)adaptor.create(NL6);
                            adaptor.addChild(root_0, NL6_tree);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:97:9: EOF
                            {
                            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_textLine192); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:98:4: NL
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    NL8=(Token)match(input,NL,FOLLOW_NL_in_textLine199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NL8_tree = (LinkedListTree)adaptor.create(NL8);
                    adaptor.addChild(root_0, NL8_tree);
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
    // $ANTLR end "textLine"

    public static class textLineStart_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textLineStart"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:101:1: textLineStart : ( ( LBRACE ATWORD )=> inlineTag | WORD | STARS | WS | LBRACE | RBRACE | AT );
    public final ASDocParser.textLineStart_return textLineStart() throws RecognitionException {
        ASDocParser.textLineStart_return retval = new ASDocParser.textLineStart_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token WORD10=null;
        Token STARS11=null;
        Token WS12=null;
        Token LBRACE13=null;
        Token RBRACE14=null;
        Token AT15=null;
        ASDocParser.inlineTag_return inlineTag9 = null;


        LinkedListTree WORD10_tree=null;
        LinkedListTree STARS11_tree=null;
        LinkedListTree WS12_tree=null;
        LinkedListTree LBRACE13_tree=null;
        LinkedListTree RBRACE14_tree=null;
        LinkedListTree AT15_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:102:2: ( ( LBRACE ATWORD )=> inlineTag | WORD | STARS | WS | LBRACE | RBRACE | AT )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:102:4: ( LBRACE ATWORD )=> inlineTag
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_inlineTag_in_textLineStart217);
                    inlineTag9=inlineTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inlineTag9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:103:4: WORD
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    WORD10=(Token)match(input,WORD,FOLLOW_WORD_in_textLineStart222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD10_tree = (LinkedListTree)adaptor.create(WORD10);
                    adaptor.addChild(root_0, WORD10_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:103:11: STARS
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    STARS11=(Token)match(input,STARS,FOLLOW_STARS_in_textLineStart226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STARS11_tree = (LinkedListTree)adaptor.create(STARS11);
                    adaptor.addChild(root_0, STARS11_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:103:19: WS
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    WS12=(Token)match(input,WS,FOLLOW_WS_in_textLineStart230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WS12_tree = (LinkedListTree)adaptor.create(WS12);
                    adaptor.addChild(root_0, WS12_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:103:24: LBRACE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    LBRACE13=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_textLineStart234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACE13_tree = (LinkedListTree)adaptor.create(LBRACE13);
                    adaptor.addChild(root_0, LBRACE13_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:103:33: RBRACE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    RBRACE14=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_textLineStart238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACE14_tree = (LinkedListTree)adaptor.create(RBRACE14);
                    adaptor.addChild(root_0, RBRACE14_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:103:42: AT
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    AT15=(Token)match(input,AT,FOLLOW_AT_in_textLineStart242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT15_tree = (LinkedListTree)adaptor.create(AT15);
                    adaptor.addChild(root_0, AT15_tree);
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
    // $ANTLR end "textLineStart"

    public static class textLineContent_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textLineContent"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:106:1: textLineContent : ( ( LBRACE ATWORD )=> inlineTag | WORD | STARS | WS | LBRACE | RBRACE | AT | ATWORD );
    public final ASDocParser.textLineContent_return textLineContent() throws RecognitionException {
        ASDocParser.textLineContent_return retval = new ASDocParser.textLineContent_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token WORD17=null;
        Token STARS18=null;
        Token WS19=null;
        Token LBRACE20=null;
        Token RBRACE21=null;
        Token AT22=null;
        Token ATWORD23=null;
        ASDocParser.inlineTag_return inlineTag16 = null;


        LinkedListTree WORD17_tree=null;
        LinkedListTree STARS18_tree=null;
        LinkedListTree WS19_tree=null;
        LinkedListTree LBRACE20_tree=null;
        LinkedListTree RBRACE21_tree=null;
        LinkedListTree AT22_tree=null;
        LinkedListTree ATWORD23_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:107:2: ( ( LBRACE ATWORD )=> inlineTag | WORD | STARS | WS | LBRACE | RBRACE | AT | ATWORD )
            int alt7=8;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:107:4: ( LBRACE ATWORD )=> inlineTag
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_inlineTag_in_textLineContent260);
                    inlineTag16=inlineTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inlineTag16.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:108:4: WORD
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    WORD17=(Token)match(input,WORD,FOLLOW_WORD_in_textLineContent265); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD17_tree = (LinkedListTree)adaptor.create(WORD17);
                    adaptor.addChild(root_0, WORD17_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:108:11: STARS
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    STARS18=(Token)match(input,STARS,FOLLOW_STARS_in_textLineContent269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STARS18_tree = (LinkedListTree)adaptor.create(STARS18);
                    adaptor.addChild(root_0, STARS18_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:108:19: WS
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    WS19=(Token)match(input,WS,FOLLOW_WS_in_textLineContent273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WS19_tree = (LinkedListTree)adaptor.create(WS19);
                    adaptor.addChild(root_0, WS19_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:108:24: LBRACE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    LBRACE20=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_textLineContent277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACE20_tree = (LinkedListTree)adaptor.create(LBRACE20);
                    adaptor.addChild(root_0, LBRACE20_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:108:33: RBRACE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    RBRACE21=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_textLineContent281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACE21_tree = (LinkedListTree)adaptor.create(RBRACE21);
                    adaptor.addChild(root_0, RBRACE21_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:108:42: AT
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    AT22=(Token)match(input,AT,FOLLOW_AT_in_textLineContent285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT22_tree = (LinkedListTree)adaptor.create(AT22);
                    adaptor.addChild(root_0, AT22_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:108:47: ATWORD
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    ATWORD23=(Token)match(input,ATWORD,FOLLOW_ATWORD_in_textLineContent289); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ATWORD23_tree = (LinkedListTree)adaptor.create(ATWORD23);
                    adaptor.addChild(root_0, ATWORD23_tree);
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
    // $ANTLR end "textLineContent"

    public static class inlineTag_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inlineTag"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:111:1: inlineTag : LBRACE ATWORD ( inlineTagContent )* RBRACE -> ^( INLINE_TAG ATWORD ( inlineTagContent )* ) ;
    public final ASDocParser.inlineTag_return inlineTag() throws RecognitionException {
        ASDocParser.inlineTag_return retval = new ASDocParser.inlineTag_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token LBRACE24=null;
        Token ATWORD25=null;
        Token RBRACE27=null;
        ASDocParser.inlineTagContent_return inlineTagContent26 = null;


        LinkedListTree LBRACE24_tree=null;
        LinkedListTree ATWORD25_tree=null;
        LinkedListTree RBRACE27_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_ATWORD=new RewriteRuleTokenStream(adaptor,"token ATWORD");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_inlineTagContent=new RewriteRuleSubtreeStream(adaptor,"rule inlineTagContent");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:112:2: ( LBRACE ATWORD ( inlineTagContent )* RBRACE -> ^( INLINE_TAG ATWORD ( inlineTagContent )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:112:4: LBRACE ATWORD ( inlineTagContent )* RBRACE
            {
            LBRACE24=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_inlineTag300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE24);

            ATWORD25=(Token)match(input,ATWORD,FOLLOW_ATWORD_in_inlineTag302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATWORD.add(ATWORD25);

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:112:18: ( inlineTagContent )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=NL && LA8_0<=WS)||LA8_0==AT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:112:18: inlineTagContent
            	    {
            	    pushFollow(FOLLOW_inlineTagContent_in_inlineTag304);
            	    inlineTagContent26=inlineTagContent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inlineTagContent.add(inlineTagContent26.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RBRACE27=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_inlineTag307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE27);



            // AST REWRITE
            // elements: inlineTagContent, ATWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 113:3: -> ^( INLINE_TAG ATWORD ( inlineTagContent )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:113:6: ^( INLINE_TAG ATWORD ( inlineTagContent )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(INLINE_TAG, "INLINE_TAG"), root_1);

                adaptor.addChild(root_1, stream_ATWORD.nextNode());
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:113:26: ( inlineTagContent )*
                while ( stream_inlineTagContent.hasNext() ) {
                    adaptor.addChild(root_1, stream_inlineTagContent.nextTree());

                }
                stream_inlineTagContent.reset();

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
    // $ANTLR end "inlineTag"

    public static class inlineTagContent_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inlineTagContent"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:116:1: inlineTagContent : ( WORD | STARS | WS | AT | NL );
    public final ASDocParser.inlineTagContent_return inlineTagContent() throws RecognitionException {
        ASDocParser.inlineTagContent_return retval = new ASDocParser.inlineTagContent_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set28=null;

        LinkedListTree set28_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:117:2: ( WORD | STARS | WS | AT | NL )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set28=(Token)input.LT(1);
            if ( (input.LA(1)>=NL && input.LA(1)<=WS)||input.LA(1)==AT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set28));
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
    // $ANTLR end "inlineTagContent"

    public static class paragraphTag_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paragraphTag"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:120:1: paragraphTag : ATWORD paragraphTagTail -> ^( PARA_TAG ATWORD paragraphTagTail ) ;
    public final ASDocParser.paragraphTag_return paragraphTag() throws RecognitionException {
        ASDocParser.paragraphTag_return retval = new ASDocParser.paragraphTag_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token ATWORD29=null;
        ASDocParser.paragraphTagTail_return paragraphTagTail30 = null;


        LinkedListTree ATWORD29_tree=null;
        RewriteRuleTokenStream stream_ATWORD=new RewriteRuleTokenStream(adaptor,"token ATWORD");
        RewriteRuleSubtreeStream stream_paragraphTagTail=new RewriteRuleSubtreeStream(adaptor,"rule paragraphTagTail");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:121:2: ( ATWORD paragraphTagTail -> ^( PARA_TAG ATWORD paragraphTagTail ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:121:4: ATWORD paragraphTagTail
            {
            ATWORD29=(Token)match(input,ATWORD,FOLLOW_ATWORD_in_paragraphTag358); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ATWORD.add(ATWORD29);

            pushFollow(FOLLOW_paragraphTagTail_in_paragraphTag360);
            paragraphTagTail30=paragraphTagTail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paragraphTagTail.add(paragraphTagTail30.getTree());


            // AST REWRITE
            // elements: ATWORD, paragraphTagTail
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 122:3: -> ^( PARA_TAG ATWORD paragraphTagTail )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:122:6: ^( PARA_TAG ATWORD paragraphTagTail )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(PARA_TAG, "PARA_TAG"), root_1);

                adaptor.addChild(root_1, stream_ATWORD.nextNode());
                adaptor.addChild(root_1, stream_paragraphTagTail.nextTree());

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
    // $ANTLR end "paragraphTag"

    public static class paragraphTagTail_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paragraphTagTail"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:125:1: paragraphTagTail : ( textLineContent )* ( NL ( textLine )* | EOF ) -> ( textLineContent )* ( NL )? ( textLine )* ;
    public final ASDocParser.paragraphTagTail_return paragraphTagTail() throws RecognitionException {
        ASDocParser.paragraphTagTail_return retval = new ASDocParser.paragraphTagTail_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token NL32=null;
        Token EOF34=null;
        ASDocParser.textLineContent_return textLineContent31 = null;

        ASDocParser.textLine_return textLine33 = null;


        LinkedListTree NL32_tree=null;
        LinkedListTree EOF34_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_textLineContent=new RewriteRuleSubtreeStream(adaptor,"rule textLineContent");
        RewriteRuleSubtreeStream stream_textLine=new RewriteRuleSubtreeStream(adaptor,"rule textLine");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:126:2: ( ( textLineContent )* ( NL ( textLine )* | EOF ) -> ( textLineContent )* ( NL )? ( textLine )* )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:126:4: ( textLineContent )* ( NL ( textLine )* | EOF )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:126:4: ( textLineContent )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:126:4: textLineContent
            	    {
            	    pushFollow(FOLLOW_textLineContent_in_paragraphTagTail383);
            	    textLineContent31=textLineContent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_textLineContent.add(textLineContent31.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:127:3: ( NL ( textLine )* | EOF )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NL) ) {
                alt11=1;
            }
            else if ( (LA11_0==EOF) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:127:5: NL ( textLine )*
                    {
                    NL32=(Token)match(input,NL,FOLLOW_NL_in_paragraphTagTail390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL32);

                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:127:8: ( textLine )*
                    loop10:
                    do {
                        int alt10=2;
                        alt10 = dfa10.predict(input);
                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:127:8: textLine
                    	    {
                    	    pushFollow(FOLLOW_textLine_in_paragraphTagTail392);
                    	    textLine33=textLine();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_textLine.add(textLine33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:128:5: EOF
                    {
                    EOF34=(Token)match(input,EOF,FOLLOW_EOF_in_paragraphTagTail399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOF.add(EOF34);


                    }
                    break;

            }



            // AST REWRITE
            // elements: textLineContent, textLine, NL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 130:3: -> ( textLineContent )* ( NL )? ( textLine )*
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:130:6: ( textLineContent )*
                while ( stream_textLineContent.hasNext() ) {
                    adaptor.addChild(root_0, stream_textLineContent.nextTree());

                }
                stream_textLineContent.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:130:23: ( NL )?
                if ( stream_NL.hasNext() ) {
                    adaptor.addChild(root_0, stream_NL.nextNode());

                }
                stream_NL.reset();
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:130:27: ( textLine )*
                while ( stream_textLine.hasNext() ) {
                    adaptor.addChild(root_0, stream_textLine.nextTree());

                }
                stream_textLine.reset();

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
    // $ANTLR end "paragraphTagTail"

    // $ANTLR start synpred1_ASDoc
    public final void synpred1_ASDoc_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:102:4: ( LBRACE ATWORD )
        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:102:5: LBRACE ATWORD
        {
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred1_ASDoc211); if (state.failed) return ;
        match(input,ATWORD,FOLLOW_ATWORD_in_synpred1_ASDoc213); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_ASDoc

    // $ANTLR start synpred2_ASDoc
    public final void synpred2_ASDoc_fragment() throws RecognitionException {   
        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:107:4: ( LBRACE ATWORD )
        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\asdoc\\ASDoc.g:107:5: LBRACE ATWORD
        {
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred2_ASDoc254); if (state.failed) return ;
        match(input,ATWORD,FOLLOW_ATWORD_in_synpred2_ASDoc256); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_ASDoc

    // Delegated rules

    public final boolean synpred2_ASDoc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ASDoc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ASDoc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ASDoc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\1\1\11\uffff";
    static final String DFA2_minS =
        "\1\12\11\uffff";
    static final String DFA2_maxS =
        "\1\21\11\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\7\3\1\1",
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 90:4: ( textLine )*";
        }
    }
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\1\1\11\uffff";
    static final String DFA3_minS =
        "\1\12\11\uffff";
    static final String DFA3_maxS =
        "\1\21\11\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\7\3",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 96:3: ( textLineContent )*";
        }
    }
    static final String DFA6_eotS =
        "\120\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\10\5\uffff\1\10\10\uffff\1\10\1\uffff\1\10\2\uffff\3"+
        "\10\70\uffff";
    static final String DFA6_minS =
        "\1\13\1\12\5\uffff\1\12\10\uffff\1\12\1\0\1\12\2\uffff\3\12\1\uffff"+
        "\2\0\3\uffff\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3"+
        "\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
    static final String DFA6_maxS =
        "\1\20\1\21\5\uffff\1\21\10\uffff\1\21\1\0\1\21\2\uffff\3\21\1\uffff"+
        "\2\0\3\uffff\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3"+
        "\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\6\1\7\1\uffff\1\5\42\uffff\1\1\44\uffff";
    static final String DFA6_specialS =
        "\21\uffff\1\0\7\uffff\1\1\1\2\3\uffff\1\3\1\4\1\5\1\6\12\uffff"+
        "\1\7\1\10\1\11\2\uffff\1\12\1\13\1\14\1\uffff\1\15\1\16\1\17\2\uffff"+
        "\1\20\1\21\1\22\1\uffff\1\23\1\24\1\25\2\uffff\1\26\1\27\1\30\1"+
        "\uffff\1\31\1\32\1\33\2\uffff\1\34\1\35\1\36\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\3\1\4\1\1\1\5\1\6",
            "\7\10\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\20\1\22\1\25\1\26\1\10\1\21\1\27\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\1\32\1\36\1\37\1\10\1\31\1\40\1\10",
            "\1\uffff",
            "\1\55\1\56\1\61\1\62\1\10\1\54\1\63\1\10",
            "",
            "",
            "\1\66\1\67\1\72\1\73\1\10\1\65\1\74\1\10",
            "\1\77\1\100\1\103\1\104\1\10\1\76\1\105\1\10",
            "\1\110\1\111\1\114\1\115\1\10\1\107\1\116\1\10",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "101:1: textLineStart : ( ( LBRACE ATWORD )=> inlineTag | WORD | STARS | WS | LBRACE | RBRACE | AT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_17 = input.LA(1);

                         
                        int index6_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_25 = input.LA(1);

                         
                        int index6_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_26 = input.LA(1);

                         
                        int index6_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_26);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_30 = input.LA(1);

                         
                        int index6_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_30);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_31 = input.LA(1);

                         
                        int index6_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_31);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_32 = input.LA(1);

                         
                        int index6_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_33 = input.LA(1);

                         
                        int index6_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_44 = input.LA(1);

                         
                        int index6_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_44);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_45 = input.LA(1);

                         
                        int index6_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_45);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_46 = input.LA(1);

                         
                        int index6_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_46);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_49 = input.LA(1);

                         
                        int index6_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_49);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_50 = input.LA(1);

                         
                        int index6_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_50);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA6_51 = input.LA(1);

                         
                        int index6_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_51);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA6_53 = input.LA(1);

                         
                        int index6_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_53);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA6_54 = input.LA(1);

                         
                        int index6_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_54);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA6_55 = input.LA(1);

                         
                        int index6_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_55);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA6_58 = input.LA(1);

                         
                        int index6_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_58);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA6_59 = input.LA(1);

                         
                        int index6_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_59);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA6_60 = input.LA(1);

                         
                        int index6_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_60);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA6_62 = input.LA(1);

                         
                        int index6_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_62);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA6_63 = input.LA(1);

                         
                        int index6_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_63);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA6_64 = input.LA(1);

                         
                        int index6_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_64);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA6_67 = input.LA(1);

                         
                        int index6_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_67);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA6_68 = input.LA(1);

                         
                        int index6_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_68);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA6_69 = input.LA(1);

                         
                        int index6_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_69);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA6_71 = input.LA(1);

                         
                        int index6_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_71);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA6_72 = input.LA(1);

                         
                        int index6_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_72);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA6_73 = input.LA(1);

                         
                        int index6_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_73);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA6_76 = input.LA(1);

                         
                        int index6_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_76);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA6_77 = input.LA(1);

                         
                        int index6_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_77);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA6_78 = input.LA(1);

                         
                        int index6_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ASDoc()) ) {s = 43;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index6_78);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\121\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\2\uffff\3"+
        "\11\70\uffff";
    static final String DFA7_minS =
        "\1\13\1\12\6\uffff\1\12\10\uffff\1\12\1\0\1\12\2\uffff\3\12\1\uffff"+
        "\2\0\3\uffff\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3"+
        "\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
    static final String DFA7_maxS =
        "\2\21\6\uffff\1\21\10\uffff\1\21\1\0\1\21\2\uffff\3\21\1\uffff"+
        "\2\0\3\uffff\4\0\12\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3"+
        "\0\1\uffff\3\0\2\uffff\3\0\1\uffff\3\0\2\uffff\3\0\1\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\uffff\1\5\42\uffff\1\1\44\uffff";
    static final String DFA7_specialS =
        "\22\uffff\1\0\7\uffff\1\1\1\2\3\uffff\1\3\1\4\1\5\1\6\12\uffff"+
        "\1\7\1\10\1\11\2\uffff\1\12\1\13\1\14\1\uffff\1\15\1\16\1\17\2\uffff"+
        "\1\20\1\21\1\22\1\uffff\1\23\1\24\1\25\2\uffff\1\26\1\27\1\30\1"+
        "\uffff\1\31\1\32\1\33\2\uffff\1\34\1\35\1\36\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\3\1\4\1\1\1\5\1\6\1\7",
            "\7\11\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\23\1\26\1\27\1\11\1\22\1\30\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\1\33\1\37\1\40\1\11\1\32\1\41\1\11",
            "\1\uffff",
            "\1\56\1\57\1\62\1\63\1\11\1\55\1\64\1\11",
            "",
            "",
            "\1\67\1\70\1\73\1\74\1\11\1\66\1\75\1\11",
            "\1\100\1\101\1\104\1\105\1\11\1\77\1\106\1\11",
            "\1\111\1\112\1\115\1\116\1\11\1\110\1\117\1\11",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "106:1: textLineContent : ( ( LBRACE ATWORD )=> inlineTag | WORD | STARS | WS | LBRACE | RBRACE | AT | ATWORD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_18 = input.LA(1);

                         
                        int index7_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_26 = input.LA(1);

                         
                        int index7_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_27 = input.LA(1);

                         
                        int index7_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_27);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_31 = input.LA(1);

                         
                        int index7_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_31);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_32 = input.LA(1);

                         
                        int index7_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_32);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_33 = input.LA(1);

                         
                        int index7_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_33);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_34 = input.LA(1);

                         
                        int index7_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_34);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_45 = input.LA(1);

                         
                        int index7_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_45);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_46 = input.LA(1);

                         
                        int index7_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_46);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_47 = input.LA(1);

                         
                        int index7_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_47);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_50 = input.LA(1);

                         
                        int index7_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_50);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_51 = input.LA(1);

                         
                        int index7_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_51);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_52 = input.LA(1);

                         
                        int index7_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_52);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA7_54 = input.LA(1);

                         
                        int index7_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_54);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA7_55 = input.LA(1);

                         
                        int index7_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_55);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA7_56 = input.LA(1);

                         
                        int index7_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_56);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA7_59 = input.LA(1);

                         
                        int index7_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_59);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA7_60 = input.LA(1);

                         
                        int index7_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_60);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA7_61 = input.LA(1);

                         
                        int index7_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_61);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA7_63 = input.LA(1);

                         
                        int index7_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_63);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA7_64 = input.LA(1);

                         
                        int index7_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_64);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA7_65 = input.LA(1);

                         
                        int index7_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_65);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA7_68 = input.LA(1);

                         
                        int index7_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_68);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA7_69 = input.LA(1);

                         
                        int index7_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_69);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA7_70 = input.LA(1);

                         
                        int index7_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_70);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA7_72 = input.LA(1);

                         
                        int index7_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_72);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA7_73 = input.LA(1);

                         
                        int index7_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_73);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA7_74 = input.LA(1);

                         
                        int index7_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_74);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA7_77 = input.LA(1);

                         
                        int index7_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_77);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA7_78 = input.LA(1);

                         
                        int index7_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_78);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA7_79 = input.LA(1);

                         
                        int index7_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ASDoc()) ) {s = 44;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_79);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\1\1\11\uffff";
    static final String DFA9_minS =
        "\1\12\11\uffff";
    static final String DFA9_maxS =
        "\1\21\11\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\7\3",
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
            return "()* loopback of 126:4: ( textLineContent )*";
        }
    }
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\1\1\11\uffff";
    static final String DFA10_minS =
        "\1\12\11\uffff";
    static final String DFA10_maxS =
        "\1\21\11\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\7\3\1\1",
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
            return "()* loopback of 127:8: ( textLine )*";
        }
    }
 

    public static final BitSet FOLLOW_description_in_commentBody119 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_paragraphTag_in_commentBody125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EOF_in_commentBody130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textLine_in_description155 = new BitSet(new long[]{0x000000000001FC02L});
    public static final BitSet FOLLOW_textLineStart_in_textLine178 = new BitSet(new long[]{0x000000000003FC00L});
    public static final BitSet FOLLOW_textLineContent_in_textLine182 = new BitSet(new long[]{0x000000000003FC00L});
    public static final BitSet FOLLOW_NL_in_textLine188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_textLine192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_textLine199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineTag_in_textLineStart217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_textLineStart222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARS_in_textLineStart226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_textLineStart230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_textLineStart234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_textLineStart238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_textLineStart242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inlineTag_in_textLineContent260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_textLineContent265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARS_in_textLineContent269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_textLineContent273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_textLineContent277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_textLineContent281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_textLineContent285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATWORD_in_textLineContent289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_inlineTag300 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ATWORD_in_inlineTag302 = new BitSet(new long[]{0x000000000001BC00L});
    public static final BitSet FOLLOW_inlineTagContent_in_inlineTag304 = new BitSet(new long[]{0x000000000001BC00L});
    public static final BitSet FOLLOW_RBRACE_in_inlineTag307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inlineTagContent0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATWORD_in_paragraphTag358 = new BitSet(new long[]{0x000000000003FC00L});
    public static final BitSet FOLLOW_paragraphTagTail_in_paragraphTag360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textLineContent_in_paragraphTagTail383 = new BitSet(new long[]{0x000000000003FC00L});
    public static final BitSet FOLLOW_NL_in_paragraphTagTail390 = new BitSet(new long[]{0x000000000001FC00L});
    public static final BitSet FOLLOW_textLine_in_paragraphTagTail392 = new BitSet(new long[]{0x000000000001FC02L});
    public static final BitSet FOLLOW_EOF_in_paragraphTagTail399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_synpred1_ASDoc211 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ATWORD_in_synpred1_ASDoc213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_synpred2_ASDoc254 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ATWORD_in_synpred2_ASDoc256 = new BitSet(new long[]{0x0000000000000002L});

}