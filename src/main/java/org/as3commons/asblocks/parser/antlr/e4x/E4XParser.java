// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g 2011-07-28 18:48:41

package org.as3commons.asblocks.parser.antlr.e4x;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class E4XParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMPILATION_UNIT", "XML_ROOT_ELEMENT", "XML_EMPTY_ELEMENT", "XML_ELEMENT", "XML_ELEMENT_CONTENT", "XML_TAG_CONTENT", "XML_ATTRIBUTE", "XML_LIST", "XML_COMMENT", "XML_CDATA", "XML_PI", "XML_LCHEVRON", "RCLOSE", "XML_RCHEVRON", "LCLOSE", "XML_NAME", "XML_TEXT", "XML_ATTRIBUTE_VALUE", "WS", "EOL", "XML_NAME_START", "XML_NAME_PART", "UNICODE_LETTER", "UNICODE_DIGIT", "'<>'", "'</>'", "'{'", "'}'", "'='"
    };
    public static final int EOF=-1;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public E4XParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public E4XParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return E4XParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g"; }


    	// disable standard error handling; be strict
    	//protected void mismatch(IntStream input, int ttype, BitSet follow)
    	//	throws RecognitionException
    	//{
    	//	throw new MismatchedTokenException(ttype, input);
    	//}

    	private E4XLexer lexer;
    	private CharStream cs;

    	public void setInput(E4XLexer lexer, CharStream cs)
    	{
    		this.lexer = lexer;
    		this.cs = cs;
    	}

    	/**
    	 * Returns the input left unconsumed after the last parse operation.
    	 * Because of lookahead in the parser, there is no guarantee that the
    	 * lexer has not consumed input ahead of the current parse-point for
    	 * any abritrary rule. This method is only intended to grab the
    	 * remaining input after recognising 'xmlPrimary'.
    	 */
    	public String getInputTail()
    	{
    		return cs.substring(cs.index() - 1, cs.size() - 1);
    	}


    public static class compilationUnit_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:86:1: compilationUnit : xmlPrimary -> ^( COMPILATION_UNIT xmlPrimary ) ;
    public final E4XParser.compilationUnit_return compilationUnit() throws RecognitionException {
        E4XParser.compilationUnit_return retval = new E4XParser.compilationUnit_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlPrimary_return xmlPrimary1 = null;


        RewriteRuleSubtreeStream stream_xmlPrimary=new RewriteRuleSubtreeStream(adaptor,"rule xmlPrimary");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:87:2: ( xmlPrimary -> ^( COMPILATION_UNIT xmlPrimary ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:87:4: xmlPrimary
            {
            pushFollow(FOLLOW_xmlPrimary_in_compilationUnit119);
            xmlPrimary1=xmlPrimary();

            state._fsp--;

            stream_xmlPrimary.add(xmlPrimary1.getTree());


            // AST REWRITE
            // elements: xmlPrimary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 88:3: -> ^( COMPILATION_UNIT xmlPrimary )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:88:6: ^( COMPILATION_UNIT xmlPrimary )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                adaptor.addChild(root_1, stream_xmlPrimary.nextTree());

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
    // $ANTLR end "compilationUnit"

    public static class xmlPrimary_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlPrimary"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:91:1: xmlPrimary : ( xmlInitialiser | xmlListInitialiser ) -> ^( XML_ROOT_ELEMENT xmlInitialiser ( xmlListInitialiser )? ) ;
    public final E4XParser.xmlPrimary_return xmlPrimary() throws RecognitionException {
        E4XParser.xmlPrimary_return retval = new E4XParser.xmlPrimary_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlInitialiser_return xmlInitialiser2 = null;

        E4XParser.xmlListInitialiser_return xmlListInitialiser3 = null;


        RewriteRuleSubtreeStream stream_xmlInitialiser=new RewriteRuleSubtreeStream(adaptor,"rule xmlInitialiser");
        RewriteRuleSubtreeStream stream_xmlListInitialiser=new RewriteRuleSubtreeStream(adaptor,"rule xmlListInitialiser");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:2: ( ( xmlInitialiser | xmlListInitialiser ) -> ^( XML_ROOT_ELEMENT xmlInitialiser ( xmlListInitialiser )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:4: ( xmlInitialiser | xmlListInitialiser )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:4: ( xmlInitialiser | xmlListInitialiser )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=XML_COMMENT && LA1_0<=XML_LCHEVRON)) ) {
                alt1=1;
            }
            else if ( (LA1_0==28) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:6: xmlInitialiser
                    {
                    pushFollow(FOLLOW_xmlInitialiser_in_xmlPrimary144);
                    xmlInitialiser2=xmlInitialiser();

                    state._fsp--;

                    stream_xmlInitialiser.add(xmlInitialiser2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:23: xmlListInitialiser
                    {
                    pushFollow(FOLLOW_xmlListInitialiser_in_xmlPrimary148);
                    xmlListInitialiser3=xmlListInitialiser();

                    state._fsp--;

                    stream_xmlListInitialiser.add(xmlListInitialiser3.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: xmlListInitialiser, xmlInitialiser
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 93:3: -> ^( XML_ROOT_ELEMENT xmlInitialiser ( xmlListInitialiser )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:93:6: ^( XML_ROOT_ELEMENT xmlInitialiser ( xmlListInitialiser )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ROOT_ELEMENT, "XML_ROOT_ELEMENT"), root_1);

                adaptor.addChild(root_1, stream_xmlInitialiser.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:93:41: ( xmlListInitialiser )?
                if ( stream_xmlListInitialiser.hasNext() ) {
                    adaptor.addChild(root_1, stream_xmlListInitialiser.nextTree());

                }
                stream_xmlListInitialiser.reset();

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
    // $ANTLR end "xmlPrimary"

    public static class xmlInitialiser_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlInitialiser"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:96:1: xmlInitialiser : ( xmlMarkup )* xmlElement ;
    public final E4XParser.xmlInitialiser_return xmlInitialiser() throws RecognitionException {
        E4XParser.xmlInitialiser_return retval = new E4XParser.xmlInitialiser_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlMarkup_return xmlMarkup4 = null;

        E4XParser.xmlElement_return xmlElement5 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:2: ( ( xmlMarkup )* xmlElement )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:4: ( xmlMarkup )* xmlElement
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:4: ( xmlMarkup )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=XML_COMMENT && LA2_0<=XML_PI)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:4: xmlMarkup
            	    {
            	    pushFollow(FOLLOW_xmlMarkup_in_xmlInitialiser176);
            	    xmlMarkup4=xmlMarkup();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xmlMarkup4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_xmlElement_in_xmlInitialiser179);
            xmlElement5=xmlElement();

            state._fsp--;

            adaptor.addChild(root_0, xmlElement5.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "xmlInitialiser"

    public static class xmlListInitialiser_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlListInitialiser"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:100:1: xmlListInitialiser : '<>' ( xmlElementContent )* '</>' -> ^( XML_LIST ( xmlElementContent )* ) ;
    public final E4XParser.xmlListInitialiser_return xmlListInitialiser() throws RecognitionException {
        E4XParser.xmlListInitialiser_return retval = new E4XParser.xmlListInitialiser_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token string_literal6=null;
        Token string_literal8=null;
        E4XParser.xmlElementContent_return xmlElementContent7 = null;


        LinkedListTree string_literal6_tree=null;
        LinkedListTree string_literal8_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_xmlElementContent=new RewriteRuleSubtreeStream(adaptor,"rule xmlElementContent");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:2: ( '<>' ( xmlElementContent )* '</>' -> ^( XML_LIST ( xmlElementContent )* ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:4: '<>' ( xmlElementContent )* '</>'
            {
            string_literal6=(Token)match(input,28,FOLLOW_28_in_xmlListInitialiser190);  
            stream_28.add(string_literal6);

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:9: ( xmlElementContent )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=XML_COMMENT && LA3_0<=XML_LCHEVRON)||(LA3_0>=XML_NAME && LA3_0<=EOL)||LA3_0==30||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:9: xmlElementContent
            	    {
            	    pushFollow(FOLLOW_xmlElementContent_in_xmlListInitialiser192);
            	    xmlElementContent7=xmlElementContent();

            	    state._fsp--;

            	    stream_xmlElementContent.add(xmlElementContent7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            string_literal8=(Token)match(input,29,FOLLOW_29_in_xmlListInitialiser195);  
            stream_29.add(string_literal8);



            // AST REWRITE
            // elements: xmlElementContent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 102:3: -> ^( XML_LIST ( xmlElementContent )* )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:102:6: ^( XML_LIST ( xmlElementContent )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_LIST, "XML_LIST"), root_1);

                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:102:17: ( xmlElementContent )*
                while ( stream_xmlElementContent.hasNext() ) {
                    adaptor.addChild(root_1, stream_xmlElementContent.nextTree());

                }
                stream_xmlElementContent.reset();

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
    // $ANTLR end "xmlListInitialiser"

    public static class xmlMarkup_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlMarkup"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:105:1: xmlMarkup : ( XML_COMMENT | XML_CDATA | XML_PI );
    public final E4XParser.xmlMarkup_return xmlMarkup() throws RecognitionException {
        E4XParser.xmlMarkup_return retval = new E4XParser.xmlMarkup_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set9=null;

        LinkedListTree set9_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:106:2: ( XML_COMMENT | XML_CDATA | XML_PI )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=XML_COMMENT && input.LA(1)<=XML_PI) ) {
                input.consume();
                adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set9));
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
    // $ANTLR end "xmlMarkup"

    public static class xmlElement_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlElement"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:111:1: xmlElement : ( XML_LCHEVRON xmlTagContent -> xmlTagContent ) ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) ) ;
    public final E4XParser.xmlElement_return xmlElement() throws RecognitionException {
        E4XParser.xmlElement_return retval = new E4XParser.xmlElement_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token XML_LCHEVRON10=null;
        Token RCLOSE12=null;
        Token XML_RCHEVRON13=null;
        Token LCLOSE15=null;
        Token XML_RCHEVRON17=null;
        E4XParser.xmlTagContent_return xmlTagContent11 = null;

        E4XParser.xmlElementContent_return xmlElementContent14 = null;

        E4XParser.xmlTagName_return xmlTagName16 = null;


        LinkedListTree XML_LCHEVRON10_tree=null;
        LinkedListTree RCLOSE12_tree=null;
        LinkedListTree XML_RCHEVRON13_tree=null;
        LinkedListTree LCLOSE15_tree=null;
        LinkedListTree XML_RCHEVRON17_tree=null;
        RewriteRuleTokenStream stream_XML_RCHEVRON=new RewriteRuleTokenStream(adaptor,"token XML_RCHEVRON");
        RewriteRuleTokenStream stream_RCLOSE=new RewriteRuleTokenStream(adaptor,"token RCLOSE");
        RewriteRuleTokenStream stream_XML_LCHEVRON=new RewriteRuleTokenStream(adaptor,"token XML_LCHEVRON");
        RewriteRuleTokenStream stream_LCLOSE=new RewriteRuleTokenStream(adaptor,"token LCLOSE");
        RewriteRuleSubtreeStream stream_xmlTagName=new RewriteRuleSubtreeStream(adaptor,"rule xmlTagName");
        RewriteRuleSubtreeStream stream_xmlTagContent=new RewriteRuleSubtreeStream(adaptor,"rule xmlTagContent");
        RewriteRuleSubtreeStream stream_xmlElementContent=new RewriteRuleSubtreeStream(adaptor,"rule xmlElementContent");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:2: ( ( XML_LCHEVRON xmlTagContent -> xmlTagContent ) ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:4: ( XML_LCHEVRON xmlTagContent -> xmlTagContent ) ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) )
            {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:4: ( XML_LCHEVRON xmlTagContent -> xmlTagContent )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:5: XML_LCHEVRON xmlTagContent
            {
            XML_LCHEVRON10=(Token)match(input,XML_LCHEVRON,FOLLOW_XML_LCHEVRON_in_xmlElement239);  
            stream_XML_LCHEVRON.add(XML_LCHEVRON10);

            pushFollow(FOLLOW_xmlTagContent_in_xmlElement241);
            xmlTagContent11=xmlTagContent();

            state._fsp--;

            stream_xmlTagContent.add(xmlTagContent11.getTree());


            // AST REWRITE
            // elements: xmlTagContent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 112:32: -> xmlTagContent
            {
                adaptor.addChild(root_0, stream_xmlTagContent.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:113:3: ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RCLOSE) ) {
                alt5=1;
            }
            else if ( (LA5_0==XML_RCHEVRON) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:114:4: RCLOSE
                    {
                    RCLOSE12=(Token)match(input,RCLOSE,FOLLOW_RCLOSE_in_xmlElement255);  
                    stream_RCLOSE.add(RCLOSE12);



                    // AST REWRITE
                    // elements: xmlElement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 115:4: -> ^( XML_EMPTY_ELEMENT $xmlElement)
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:115:7: ^( XML_EMPTY_ELEMENT $xmlElement)
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_EMPTY_ELEMENT, "XML_EMPTY_ELEMENT"), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:117:4: XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON
                    {
                    XML_RCHEVRON13=(Token)match(input,XML_RCHEVRON,FOLLOW_XML_RCHEVRON_in_xmlElement278);  
                    stream_XML_RCHEVRON.add(XML_RCHEVRON13);

                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:117:17: ( xmlElementContent )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=XML_COMMENT && LA4_0<=XML_LCHEVRON)||(LA4_0>=XML_NAME && LA4_0<=EOL)||LA4_0==30||LA4_0==32) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:117:17: xmlElementContent
                    	    {
                    	    pushFollow(FOLLOW_xmlElementContent_in_xmlElement280);
                    	    xmlElementContent14=xmlElementContent();

                    	    state._fsp--;

                    	    stream_xmlElementContent.add(xmlElementContent14.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    LCLOSE15=(Token)match(input,LCLOSE,FOLLOW_LCLOSE_in_xmlElement283);  
                    stream_LCLOSE.add(LCLOSE15);

                    pushFollow(FOLLOW_xmlTagName_in_xmlElement285);
                    xmlTagName16=xmlTagName();

                    state._fsp--;

                    stream_xmlTagName.add(xmlTagName16.getTree());
                    XML_RCHEVRON17=(Token)match(input,XML_RCHEVRON,FOLLOW_XML_RCHEVRON_in_xmlElement287);  
                    stream_XML_RCHEVRON.add(XML_RCHEVRON17);



                    // AST REWRITE
                    // elements: xmlElement, xmlElementContent
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LinkedListTree)adaptor.nil();
                    // 118:4: -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) )
                    {
                        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:118:7: ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ELEMENT, "XML_ELEMENT"), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:118:33: ^( XML_ELEMENT_CONTENT ( xmlElementContent )* )
                        {
                        LinkedListTree root_2 = (LinkedListTree)adaptor.nil();
                        root_2 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ELEMENT_CONTENT, "XML_ELEMENT_CONTENT"), root_2);

                        // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:118:56: ( xmlElementContent )*
                        while ( stream_xmlElementContent.hasNext() ) {
                            adaptor.addChild(root_2, stream_xmlElementContent.nextTree());

                        }
                        stream_xmlElementContent.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
    // $ANTLR end "xmlElement"

    public static class xmlTagContent_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlTagContent"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:122:1: xmlTagContent : xmlTagName ( xmlAttributes )? -> ^( XML_TAG_CONTENT xmlTagName ( xmlAttributes )? ) ;
    public final E4XParser.xmlTagContent_return xmlTagContent() throws RecognitionException {
        E4XParser.xmlTagContent_return retval = new E4XParser.xmlTagContent_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlTagName_return xmlTagName18 = null;

        E4XParser.xmlAttributes_return xmlAttributes19 = null;


        RewriteRuleSubtreeStream stream_xmlAttributes=new RewriteRuleSubtreeStream(adaptor,"rule xmlAttributes");
        RewriteRuleSubtreeStream stream_xmlTagName=new RewriteRuleSubtreeStream(adaptor,"rule xmlTagName");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:2: ( xmlTagName ( xmlAttributes )? -> ^( XML_TAG_CONTENT xmlTagName ( xmlAttributes )? ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:4: xmlTagName ( xmlAttributes )?
            {
            pushFollow(FOLLOW_xmlTagName_in_xmlTagContent324);
            xmlTagName18=xmlTagName();

            state._fsp--;

            stream_xmlTagName.add(xmlTagName18.getTree());
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:15: ( xmlAttributes )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==XML_NAME||LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:15: xmlAttributes
                    {
                    pushFollow(FOLLOW_xmlAttributes_in_xmlTagContent326);
                    xmlAttributes19=xmlAttributes();

                    state._fsp--;

                    stream_xmlAttributes.add(xmlAttributes19.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: xmlAttributes, xmlTagName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 124:3: -> ^( XML_TAG_CONTENT xmlTagName ( xmlAttributes )? )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:124:6: ^( XML_TAG_CONTENT xmlTagName ( xmlAttributes )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_TAG_CONTENT, "XML_TAG_CONTENT"), root_1);

                adaptor.addChild(root_1, stream_xmlTagName.nextTree());
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:124:36: ( xmlAttributes )?
                if ( stream_xmlAttributes.hasNext() ) {
                    adaptor.addChild(root_1, stream_xmlAttributes.nextTree());

                }
                stream_xmlAttributes.reset();

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
    // $ANTLR end "xmlTagContent"

    public static class xmlTagName_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlTagName"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:127:1: xmlTagName : ( xmlEmbeddedExpression | XML_NAME );
    public final E4XParser.xmlTagName_return xmlTagName() throws RecognitionException {
        E4XParser.xmlTagName_return retval = new E4XParser.xmlTagName_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token XML_NAME21=null;
        E4XParser.xmlEmbeddedExpression_return xmlEmbeddedExpression20 = null;


        LinkedListTree XML_NAME21_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:128:2: ( xmlEmbeddedExpression | XML_NAME )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==XML_NAME) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:128:4: xmlEmbeddedExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlTagName353);
                    xmlEmbeddedExpression20=xmlEmbeddedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlEmbeddedExpression20.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:129:4: XML_NAME
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    XML_NAME21=(Token)match(input,XML_NAME,FOLLOW_XML_NAME_in_xmlTagName358); 
                    XML_NAME21_tree = (LinkedListTree)adaptor.create(XML_NAME21);
                    adaptor.addChild(root_0, XML_NAME21_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "xmlTagName"

    public static class xmlEmbeddedExpression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlEmbeddedExpression"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:132:1: xmlEmbeddedExpression : '{' expression '}' -> expression ;
    public final E4XParser.xmlEmbeddedExpression_return xmlEmbeddedExpression() throws RecognitionException {
        E4XParser.xmlEmbeddedExpression_return retval = new E4XParser.xmlEmbeddedExpression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token char_literal22=null;
        Token char_literal24=null;
        E4XParser.expression_return expression23 = null;


        LinkedListTree char_literal22_tree=null;
        LinkedListTree char_literal24_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:133:2: ( '{' expression '}' -> expression )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:133:4: '{' expression '}'
            {
            char_literal22=(Token)match(input,30,FOLLOW_30_in_xmlEmbeddedExpression369);  
            stream_30.add(char_literal22);

            pushFollow(FOLLOW_expression_in_xmlEmbeddedExpression371);
            expression23=expression();

            state._fsp--;

            stream_expression.add(expression23.getTree());
            char_literal24=(Token)match(input,31,FOLLOW_31_in_xmlEmbeddedExpression373);  
            stream_31.add(char_literal24);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 133:23: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

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
    // $ANTLR end "xmlEmbeddedExpression"

    public static class expression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:137:1: expression : ( xmlText | xmlEmbeddedExpression )+ ;
    public final E4XParser.expression_return expression() throws RecognitionException {
        E4XParser.expression_return retval = new E4XParser.expression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlText_return xmlText25 = null;

        E4XParser.xmlEmbeddedExpression_return xmlEmbeddedExpression26 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:138:2: ( ( xmlText | xmlEmbeddedExpression )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:139:3: ( xmlText | xmlEmbeddedExpression )+
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:139:3: ( xmlText | xmlEmbeddedExpression )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=XML_NAME && LA8_0<=EOL)||LA8_0==32) ) {
                    alt8=1;
                }
                else if ( (LA8_0==30) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:140:4: xmlText
            	    {
            	    pushFollow(FOLLOW_xmlText_in_expression396);
            	    xmlText25=xmlText();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xmlText25.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:142:4: xmlEmbeddedExpression
            	    {
            	    pushFollow(FOLLOW_xmlEmbeddedExpression_in_expression406);
            	    xmlEmbeddedExpression26=xmlEmbeddedExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xmlEmbeddedExpression26.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class xmlText_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlText"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:146:1: xmlText : ( XML_TEXT | XML_NAME | XML_ATTRIBUTE_VALUE | '=' | WS | EOL );
    public final E4XParser.xmlText_return xmlText() throws RecognitionException {
        E4XParser.xmlText_return retval = new E4XParser.xmlText_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set27=null;

        LinkedListTree set27_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:147:2: ( XML_TEXT | XML_NAME | XML_ATTRIBUTE_VALUE | '=' | WS | EOL )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set27=(Token)input.LT(1);
            if ( (input.LA(1)>=XML_NAME && input.LA(1)<=EOL)||input.LA(1)==32 ) {
                input.consume();
                adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set27));
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
    // $ANTLR end "xmlText"

    public static class xmlAttributes_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlAttributes"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:152:1: xmlAttributes : ( xmlEmbeddedExpression | xmlAttribute )+ ;
    public final E4XParser.xmlAttributes_return xmlAttributes() throws RecognitionException {
        E4XParser.xmlAttributes_return retval = new E4XParser.xmlAttributes_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlEmbeddedExpression_return xmlEmbeddedExpression28 = null;

        E4XParser.xmlAttribute_return xmlAttribute29 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:153:2: ( ( xmlEmbeddedExpression | xmlAttribute )+ )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:153:4: ( xmlEmbeddedExpression | xmlAttribute )+
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:153:4: ( xmlEmbeddedExpression | xmlAttribute )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }
                else if ( (LA9_0==XML_NAME) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:154:4: xmlEmbeddedExpression
            	    {
            	    pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlAttributes460);
            	    xmlEmbeddedExpression28=xmlEmbeddedExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xmlEmbeddedExpression28.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:156:4: xmlAttribute
            	    {
            	    pushFollow(FOLLOW_xmlAttribute_in_xmlAttributes470);
            	    xmlAttribute29=xmlAttribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xmlAttribute29.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "xmlAttributes"

    public static class xmlAttribute_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlAttribute"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:160:1: xmlAttribute : XML_NAME '=' xmlAttributeValue -> ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue ) ;
    public final E4XParser.xmlAttribute_return xmlAttribute() throws RecognitionException {
        E4XParser.xmlAttribute_return retval = new E4XParser.xmlAttribute_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token XML_NAME30=null;
        Token char_literal31=null;
        E4XParser.xmlAttributeValue_return xmlAttributeValue32 = null;


        LinkedListTree XML_NAME30_tree=null;
        LinkedListTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_XML_NAME=new RewriteRuleTokenStream(adaptor,"token XML_NAME");
        RewriteRuleSubtreeStream stream_xmlAttributeValue=new RewriteRuleSubtreeStream(adaptor,"rule xmlAttributeValue");
        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:161:2: ( XML_NAME '=' xmlAttributeValue -> ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue ) )
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:161:4: XML_NAME '=' xmlAttributeValue
            {
            XML_NAME30=(Token)match(input,XML_NAME,FOLLOW_XML_NAME_in_xmlAttribute486);  
            stream_XML_NAME.add(XML_NAME30);

            char_literal31=(Token)match(input,32,FOLLOW_32_in_xmlAttribute488);  
            stream_32.add(char_literal31);

            pushFollow(FOLLOW_xmlAttributeValue_in_xmlAttribute491);
            xmlAttributeValue32=xmlAttributeValue();

            state._fsp--;

            stream_xmlAttributeValue.add(xmlAttributeValue32.getTree());


            // AST REWRITE
            // elements: XML_NAME, xmlAttributeValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 162:3: -> ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue )
            {
                // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:162:6: ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ATTRIBUTE, "XML_ATTRIBUTE"), root_1);

                adaptor.addChild(root_1, stream_XML_NAME.nextNode());
                adaptor.addChild(root_1, stream_xmlAttributeValue.nextTree());

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
    // $ANTLR end "xmlAttribute"

    public static class xmlAttributeValue_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlAttributeValue"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:165:1: xmlAttributeValue : ( xmlEmbeddedExpression | XML_ATTRIBUTE_VALUE );
    public final E4XParser.xmlAttributeValue_return xmlAttributeValue() throws RecognitionException {
        E4XParser.xmlAttributeValue_return retval = new E4XParser.xmlAttributeValue_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token XML_ATTRIBUTE_VALUE34=null;
        E4XParser.xmlEmbeddedExpression_return xmlEmbeddedExpression33 = null;


        LinkedListTree XML_ATTRIBUTE_VALUE34_tree=null;

        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:166:2: ( xmlEmbeddedExpression | XML_ATTRIBUTE_VALUE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==XML_ATTRIBUTE_VALUE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:166:4: xmlEmbeddedExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlAttributeValue514);
                    xmlEmbeddedExpression33=xmlEmbeddedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlEmbeddedExpression33.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:167:4: XML_ATTRIBUTE_VALUE
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    XML_ATTRIBUTE_VALUE34=(Token)match(input,XML_ATTRIBUTE_VALUE,FOLLOW_XML_ATTRIBUTE_VALUE_in_xmlAttributeValue519); 
                    XML_ATTRIBUTE_VALUE34_tree = (LinkedListTree)adaptor.create(XML_ATTRIBUTE_VALUE34);
                    adaptor.addChild(root_0, XML_ATTRIBUTE_VALUE34_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "xmlAttributeValue"

    public static class xmlElementContent_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlElementContent"
    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:170:1: xmlElementContent : ( xmlEmbeddedExpression | xmlMarkup | xmlText | xmlElement );
    public final E4XParser.xmlElementContent_return xmlElementContent() throws RecognitionException {
        E4XParser.xmlElementContent_return retval = new E4XParser.xmlElementContent_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlEmbeddedExpression_return xmlEmbeddedExpression35 = null;

        E4XParser.xmlMarkup_return xmlMarkup36 = null;

        E4XParser.xmlText_return xmlText37 = null;

        E4XParser.xmlElement_return xmlElement38 = null;



        try {
            // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:171:2: ( xmlEmbeddedExpression | xmlMarkup | xmlText | xmlElement )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case XML_COMMENT:
            case XML_CDATA:
            case XML_PI:
                {
                alt11=2;
                }
                break;
            case XML_NAME:
            case XML_TEXT:
            case XML_ATTRIBUTE_VALUE:
            case WS:
            case EOL:
            case 32:
                {
                alt11=3;
                }
                break;
            case XML_LCHEVRON:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:171:4: xmlEmbeddedExpression
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlEmbeddedExpression_in_xmlElementContent531);
                    xmlEmbeddedExpression35=xmlEmbeddedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlEmbeddedExpression35.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:172:4: xmlMarkup
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlMarkup_in_xmlElementContent536);
                    xmlMarkup36=xmlMarkup();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlMarkup36.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:173:4: xmlText
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlText_in_xmlElementContent541);
                    xmlText37=xmlText();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlText37.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\jas-blocks\\jasblocks-antlr\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:174:4: xmlElement
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlElement_in_xmlElementContent546);
                    xmlElement38=xmlElement();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlElement38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (LinkedListTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
             finally {
        }
        return retval;
    }
    // $ANTLR end "xmlElementContent"

    // Delegated rules


 

    public static final BitSet FOLLOW_xmlPrimary_in_compilationUnit119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlInitialiser_in_xmlPrimary144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlListInitialiser_in_xmlPrimary148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlMarkup_in_xmlInitialiser176 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_xmlElement_in_xmlInitialiser179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_xmlListInitialiser190 = new BitSet(new long[]{0x0000000160F8F000L});
    public static final BitSet FOLLOW_xmlElementContent_in_xmlListInitialiser192 = new BitSet(new long[]{0x0000000160F8F000L});
    public static final BitSet FOLLOW_29_in_xmlListInitialiser195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xmlMarkup0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_LCHEVRON_in_xmlElement239 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_xmlTagContent_in_xmlElement241 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_RCLOSE_in_xmlElement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_RCHEVRON_in_xmlElement278 = new BitSet(new long[]{0x0000000140FCF000L});
    public static final BitSet FOLLOW_xmlElementContent_in_xmlElement280 = new BitSet(new long[]{0x0000000140FCF000L});
    public static final BitSet FOLLOW_LCLOSE_in_xmlElement283 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_xmlTagName_in_xmlElement285 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_XML_RCHEVRON_in_xmlElement287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlTagName_in_xmlTagContent324 = new BitSet(new long[]{0x0000000040080002L});
    public static final BitSet FOLLOW_xmlAttributes_in_xmlTagContent326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlTagName353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_NAME_in_xmlTagName358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_xmlEmbeddedExpression369 = new BitSet(new long[]{0x0000000140F80000L});
    public static final BitSet FOLLOW_expression_in_xmlEmbeddedExpression371 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_xmlEmbeddedExpression373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlText_in_expression396 = new BitSet(new long[]{0x0000000140F80002L});
    public static final BitSet FOLLOW_xmlEmbeddedExpression_in_expression406 = new BitSet(new long[]{0x0000000140F80002L});
    public static final BitSet FOLLOW_set_in_xmlText0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlAttributes460 = new BitSet(new long[]{0x0000000040080002L});
    public static final BitSet FOLLOW_xmlAttribute_in_xmlAttributes470 = new BitSet(new long[]{0x0000000040080002L});
    public static final BitSet FOLLOW_XML_NAME_in_xmlAttribute486 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_xmlAttribute488 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_xmlAttributeValue_in_xmlAttribute491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlAttributeValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_ATTRIBUTE_VALUE_in_xmlAttributeValue519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEmbeddedExpression_in_xmlElementContent531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlMarkup_in_xmlElementContent536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlText_in_xmlElementContent541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlElement_in_xmlElementContent546 = new BitSet(new long[]{0x0000000000000002L});

}