// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g 2011-10-21 10:37:07

package org.as3commons.asblocks.parser.antlr.e4x;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class E4XParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMPILATION_UNIT", "XML_ROOT_ELEMENT", "XML_EMPTY_ELEMENT", "XML_ELEMENT", "XML_ELEMENT_CONTENT", "XML_TAG_CONTENT", "XML_ATTRIBUTE", "XML_LIST", "XML_COMMENT", "XML_CDATA", "XML_PI", "XML_LCHEVRON", "RCLOSE", "XML_RCHEVRON", "LCLOSE", "XML_NAME", "XML_TEXT", "XML_ATTRIBUTE_VALUE", "WS", "EOL", "XML_NAME_START", "XML_NAME_PART", "UNICODE_LETTER", "UNICODE_DIGIT", "'<>'", "'</>'", "'='"
    };
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
    public String getGrammarFileName() { return "C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g"; }


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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:86:1: compilationUnit : xmlPrimary -> ^( COMPILATION_UNIT xmlPrimary ) ;
    public final E4XParser.compilationUnit_return compilationUnit() throws RecognitionException {
        E4XParser.compilationUnit_return retval = new E4XParser.compilationUnit_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlPrimary_return xmlPrimary1 = null;


        RewriteRuleSubtreeStream stream_xmlPrimary=new RewriteRuleSubtreeStream(adaptor,"rule xmlPrimary");
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:87:2: ( xmlPrimary -> ^( COMPILATION_UNIT xmlPrimary ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:87:4: xmlPrimary
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
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:88:6: ^( COMPILATION_UNIT xmlPrimary )
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:91:1: xmlPrimary : ( xmlInitialiser | xmlListInitialiser ) -> ^( XML_ROOT_ELEMENT xmlInitialiser ( xmlListInitialiser )? ) ;
    public final E4XParser.xmlPrimary_return xmlPrimary() throws RecognitionException {
        E4XParser.xmlPrimary_return retval = new E4XParser.xmlPrimary_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlInitialiser_return xmlInitialiser2 = null;

        E4XParser.xmlListInitialiser_return xmlListInitialiser3 = null;


        RewriteRuleSubtreeStream stream_xmlInitialiser=new RewriteRuleSubtreeStream(adaptor,"rule xmlInitialiser");
        RewriteRuleSubtreeStream stream_xmlListInitialiser=new RewriteRuleSubtreeStream(adaptor,"rule xmlListInitialiser");
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:2: ( ( xmlInitialiser | xmlListInitialiser ) -> ^( XML_ROOT_ELEMENT xmlInitialiser ( xmlListInitialiser )? ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:4: ( xmlInitialiser | xmlListInitialiser )
            {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:4: ( xmlInitialiser | xmlListInitialiser )
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
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:6: xmlInitialiser
                    {
                    pushFollow(FOLLOW_xmlInitialiser_in_xmlPrimary144);
                    xmlInitialiser2=xmlInitialiser();

                    state._fsp--;

                    stream_xmlInitialiser.add(xmlInitialiser2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:92:23: xmlListInitialiser
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
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:93:6: ^( XML_ROOT_ELEMENT xmlInitialiser ( xmlListInitialiser )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ROOT_ELEMENT, "XML_ROOT_ELEMENT"), root_1);

                adaptor.addChild(root_1, stream_xmlInitialiser.nextTree());
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:93:41: ( xmlListInitialiser )?
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:96:1: xmlInitialiser : ( xmlMarkup )* xmlElement ;
    public final E4XParser.xmlInitialiser_return xmlInitialiser() throws RecognitionException {
        E4XParser.xmlInitialiser_return retval = new E4XParser.xmlInitialiser_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlMarkup_return xmlMarkup4 = null;

        E4XParser.xmlElement_return xmlElement5 = null;



        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:2: ( ( xmlMarkup )* xmlElement )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:4: ( xmlMarkup )* xmlElement
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:4: ( xmlMarkup )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=XML_COMMENT && LA2_0<=XML_PI)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:97:4: xmlMarkup
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:100:1: xmlListInitialiser : '<>' ( xmlElementContent )* '</>' -> ^( XML_LIST ( xmlElementContent )* ) ;
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
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:2: ( '<>' ( xmlElementContent )* '</>' -> ^( XML_LIST ( xmlElementContent )* ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:4: '<>' ( xmlElementContent )* '</>'
            {
            string_literal6=(Token)match(input,28,FOLLOW_28_in_xmlListInitialiser190);  
            stream_28.add(string_literal6);

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:9: ( xmlElementContent )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=XML_COMMENT && LA3_0<=XML_LCHEVRON)||(LA3_0>=XML_NAME && LA3_0<=EOL)||LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:101:9: xmlElementContent
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
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:102:6: ^( XML_LIST ( xmlElementContent )* )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_LIST, "XML_LIST"), root_1);

                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:102:17: ( xmlElementContent )*
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:105:1: xmlMarkup : ( XML_COMMENT | XML_CDATA | XML_PI );
    public final E4XParser.xmlMarkup_return xmlMarkup() throws RecognitionException {
        E4XParser.xmlMarkup_return retval = new E4XParser.xmlMarkup_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set9=null;

        LinkedListTree set9_tree=null;

        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:106:2: ( XML_COMMENT | XML_CDATA | XML_PI )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:111:1: xmlElement : ( XML_LCHEVRON xmlTagContent -> xmlTagContent ) ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) ) ;
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
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:2: ( ( XML_LCHEVRON xmlTagContent -> xmlTagContent ) ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:4: ( XML_LCHEVRON xmlTagContent -> xmlTagContent ) ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) )
            {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:4: ( XML_LCHEVRON xmlTagContent -> xmlTagContent )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:112:5: XML_LCHEVRON xmlTagContent
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

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:113:3: ( RCLOSE -> ^( XML_EMPTY_ELEMENT $xmlElement) | XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON -> ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) ) )
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
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:114:4: RCLOSE
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
                        // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:115:7: ^( XML_EMPTY_ELEMENT $xmlElement)
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
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:117:4: XML_RCHEVRON ( xmlElementContent )* LCLOSE xmlTagName XML_RCHEVRON
                    {
                    XML_RCHEVRON13=(Token)match(input,XML_RCHEVRON,FOLLOW_XML_RCHEVRON_in_xmlElement278);  
                    stream_XML_RCHEVRON.add(XML_RCHEVRON13);

                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:117:17: ( xmlElementContent )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=XML_COMMENT && LA4_0<=XML_LCHEVRON)||(LA4_0>=XML_NAME && LA4_0<=EOL)||LA4_0==30) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:117:17: xmlElementContent
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
                    // elements: xmlElementContent, xmlElement
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
                        // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:118:7: ^( XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT ( xmlElementContent )* ) )
                        {
                        LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                        root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ELEMENT, "XML_ELEMENT"), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:118:33: ^( XML_ELEMENT_CONTENT ( xmlElementContent )* )
                        {
                        LinkedListTree root_2 = (LinkedListTree)adaptor.nil();
                        root_2 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_ELEMENT_CONTENT, "XML_ELEMENT_CONTENT"), root_2);

                        // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:118:56: ( xmlElementContent )*
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:122:1: xmlTagContent : xmlTagName ( xmlAttributes )? -> ^( XML_TAG_CONTENT xmlTagName ( xmlAttributes )? ) ;
    public final E4XParser.xmlTagContent_return xmlTagContent() throws RecognitionException {
        E4XParser.xmlTagContent_return retval = new E4XParser.xmlTagContent_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlTagName_return xmlTagName18 = null;

        E4XParser.xmlAttributes_return xmlAttributes19 = null;


        RewriteRuleSubtreeStream stream_xmlAttributes=new RewriteRuleSubtreeStream(adaptor,"rule xmlAttributes");
        RewriteRuleSubtreeStream stream_xmlTagName=new RewriteRuleSubtreeStream(adaptor,"rule xmlTagName");
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:2: ( xmlTagName ( xmlAttributes )? -> ^( XML_TAG_CONTENT xmlTagName ( xmlAttributes )? ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:4: xmlTagName ( xmlAttributes )?
            {
            pushFollow(FOLLOW_xmlTagName_in_xmlTagContent324);
            xmlTagName18=xmlTagName();

            state._fsp--;

            stream_xmlTagName.add(xmlTagName18.getTree());
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:15: ( xmlAttributes )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==XML_NAME) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:123:15: xmlAttributes
                    {
                    pushFollow(FOLLOW_xmlAttributes_in_xmlTagContent326);
                    xmlAttributes19=xmlAttributes();

                    state._fsp--;

                    stream_xmlAttributes.add(xmlAttributes19.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: xmlTagName, xmlAttributes
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
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:124:6: ^( XML_TAG_CONTENT xmlTagName ( xmlAttributes )? )
                {
                LinkedListTree root_1 = (LinkedListTree)adaptor.nil();
                root_1 = (LinkedListTree)adaptor.becomeRoot((LinkedListTree)adaptor.create(XML_TAG_CONTENT, "XML_TAG_CONTENT"), root_1);

                adaptor.addChild(root_1, stream_xmlTagName.nextTree());
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:124:36: ( xmlAttributes )?
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:127:1: xmlTagName : XML_NAME ;
    public final E4XParser.xmlTagName_return xmlTagName() throws RecognitionException {
        E4XParser.xmlTagName_return retval = new E4XParser.xmlTagName_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token XML_NAME20=null;

        LinkedListTree XML_NAME20_tree=null;

        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:128:2: ( XML_NAME )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:130:2: XML_NAME
            {
            root_0 = (LinkedListTree)adaptor.nil();

            XML_NAME20=(Token)match(input,XML_NAME,FOLLOW_XML_NAME_in_xmlTagName357); 
            XML_NAME20_tree = (LinkedListTree)adaptor.create(XML_NAME20);
            adaptor.addChild(root_0, XML_NAME20_tree);


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

    public static class expression_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:138:1: expression : ( xmlText )+ ;
    public final E4XParser.expression_return expression() throws RecognitionException {
        E4XParser.expression_return retval = new E4XParser.expression_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlText_return xmlText21 = null;



        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:139:2: ( ( xmlText )+ )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:140:3: ( xmlText )+
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:140:3: ( xmlText )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=XML_NAME && LA7_0<=EOL)||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:141:4: xmlText
            	    {
            	    pushFollow(FOLLOW_xmlText_in_expression377);
            	    xmlText21=xmlText();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xmlText21.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:147:1: xmlText : ( XML_TEXT | XML_NAME | XML_ATTRIBUTE_VALUE | '=' | WS | EOL );
    public final E4XParser.xmlText_return xmlText() throws RecognitionException {
        E4XParser.xmlText_return retval = new E4XParser.xmlText_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token set22=null;

        LinkedListTree set22_tree=null;

        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:148:2: ( XML_TEXT | XML_NAME | XML_ATTRIBUTE_VALUE | '=' | WS | EOL )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:
            {
            root_0 = (LinkedListTree)adaptor.nil();

            set22=(Token)input.LT(1);
            if ( (input.LA(1)>=XML_NAME && input.LA(1)<=EOL)||input.LA(1)==30 ) {
                input.consume();
                adaptor.addChild(root_0, (LinkedListTree)adaptor.create(set22));
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:153:1: xmlAttributes : ( xmlAttribute )+ ;
    public final E4XParser.xmlAttributes_return xmlAttributes() throws RecognitionException {
        E4XParser.xmlAttributes_return retval = new E4XParser.xmlAttributes_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlAttribute_return xmlAttribute23 = null;



        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:154:2: ( ( xmlAttribute )+ )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:154:4: ( xmlAttribute )+
            {
            root_0 = (LinkedListTree)adaptor.nil();

            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:154:4: ( xmlAttribute )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==XML_NAME) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:157:4: xmlAttribute
            	    {
            	    pushFollow(FOLLOW_xmlAttribute_in_xmlAttributes444);
            	    xmlAttribute23=xmlAttribute();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xmlAttribute23.getTree());

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
    // $ANTLR end "xmlAttributes"

    public static class xmlAttribute_return extends ParserRuleReturnScope {
        LinkedListTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xmlAttribute"
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:161:1: xmlAttribute : XML_NAME '=' xmlAttributeValue -> ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue ) ;
    public final E4XParser.xmlAttribute_return xmlAttribute() throws RecognitionException {
        E4XParser.xmlAttribute_return retval = new E4XParser.xmlAttribute_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token XML_NAME24=null;
        Token char_literal25=null;
        E4XParser.xmlAttributeValue_return xmlAttributeValue26 = null;


        LinkedListTree XML_NAME24_tree=null;
        LinkedListTree char_literal25_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_XML_NAME=new RewriteRuleTokenStream(adaptor,"token XML_NAME");
        RewriteRuleSubtreeStream stream_xmlAttributeValue=new RewriteRuleSubtreeStream(adaptor,"rule xmlAttributeValue");
        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:162:2: ( XML_NAME '=' xmlAttributeValue -> ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue ) )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:162:4: XML_NAME '=' xmlAttributeValue
            {
            XML_NAME24=(Token)match(input,XML_NAME,FOLLOW_XML_NAME_in_xmlAttribute460);  
            stream_XML_NAME.add(XML_NAME24);

            char_literal25=(Token)match(input,30,FOLLOW_30_in_xmlAttribute462);  
            stream_30.add(char_literal25);

            pushFollow(FOLLOW_xmlAttributeValue_in_xmlAttribute465);
            xmlAttributeValue26=xmlAttributeValue();

            state._fsp--;

            stream_xmlAttributeValue.add(xmlAttributeValue26.getTree());


            // AST REWRITE
            // elements: xmlAttributeValue, XML_NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LinkedListTree)adaptor.nil();
            // 163:3: -> ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue )
            {
                // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:163:6: ^( XML_ATTRIBUTE XML_NAME xmlAttributeValue )
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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:166:1: xmlAttributeValue : XML_ATTRIBUTE_VALUE ;
    public final E4XParser.xmlAttributeValue_return xmlAttributeValue() throws RecognitionException {
        E4XParser.xmlAttributeValue_return retval = new E4XParser.xmlAttributeValue_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        Token XML_ATTRIBUTE_VALUE27=null;

        LinkedListTree XML_ATTRIBUTE_VALUE27_tree=null;

        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:167:2: ( XML_ATTRIBUTE_VALUE )
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:169:2: XML_ATTRIBUTE_VALUE
            {
            root_0 = (LinkedListTree)adaptor.nil();

            XML_ATTRIBUTE_VALUE27=(Token)match(input,XML_ATTRIBUTE_VALUE,FOLLOW_XML_ATTRIBUTE_VALUE_in_xmlAttributeValue492); 
            XML_ATTRIBUTE_VALUE27_tree = (LinkedListTree)adaptor.create(XML_ATTRIBUTE_VALUE27);
            adaptor.addChild(root_0, XML_ATTRIBUTE_VALUE27_tree);


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
    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:172:1: xmlElementContent : ( xmlMarkup | xmlText | xmlElement );
    public final E4XParser.xmlElementContent_return xmlElementContent() throws RecognitionException {
        E4XParser.xmlElementContent_return retval = new E4XParser.xmlElementContent_return();
        retval.start = input.LT(1);

        LinkedListTree root_0 = null;

        E4XParser.xmlMarkup_return xmlMarkup28 = null;

        E4XParser.xmlText_return xmlText29 = null;

        E4XParser.xmlElement_return xmlElement30 = null;



        try {
            // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:173:2: ( xmlMarkup | xmlText | xmlElement )
            int alt9=3;
            switch ( input.LA(1) ) {
            case XML_COMMENT:
            case XML_CDATA:
            case XML_PI:
                {
                alt9=1;
                }
                break;
            case XML_NAME:
            case XML_TEXT:
            case XML_ATTRIBUTE_VALUE:
            case WS:
            case EOL:
            case 30:
                {
                alt9=2;
                }
                break;
            case XML_LCHEVRON:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:174:3: xmlMarkup
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlMarkup_in_xmlElementContent508);
                    xmlMarkup28=xmlMarkup();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlMarkup28.getTree());

                    }
                    break;
                case 2 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:175:4: xmlText
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlText_in_xmlElementContent513);
                    xmlText29=xmlText();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlText29.getTree());

                    }
                    break;
                case 3 :
                    // C:\\projects\\jasblocks\\as3-commons-jasblocks\\src\\main\\java\\org\\as3commons\\asblocks\\parser\\antlr\\e4x\\E4X.g:176:4: xmlElement
                    {
                    root_0 = (LinkedListTree)adaptor.nil();

                    pushFollow(FOLLOW_xmlElement_in_xmlElementContent518);
                    xmlElement30=xmlElement();

                    state._fsp--;

                    adaptor.addChild(root_0, xmlElement30.getTree());

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
    public static final BitSet FOLLOW_28_in_xmlListInitialiser190 = new BitSet(new long[]{0x0000000060F8F000L});
    public static final BitSet FOLLOW_xmlElementContent_in_xmlListInitialiser192 = new BitSet(new long[]{0x0000000060F8F000L});
    public static final BitSet FOLLOW_29_in_xmlListInitialiser195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xmlMarkup0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_LCHEVRON_in_xmlElement239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_xmlTagContent_in_xmlElement241 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_RCLOSE_in_xmlElement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_RCHEVRON_in_xmlElement278 = new BitSet(new long[]{0x0000000040FCF000L});
    public static final BitSet FOLLOW_xmlElementContent_in_xmlElement280 = new BitSet(new long[]{0x0000000040FCF000L});
    public static final BitSet FOLLOW_LCLOSE_in_xmlElement283 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_xmlTagName_in_xmlElement285 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_XML_RCHEVRON_in_xmlElement287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlTagName_in_xmlTagContent324 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_xmlAttributes_in_xmlTagContent326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_NAME_in_xmlTagName357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlText_in_expression377 = new BitSet(new long[]{0x0000000040F80002L});
    public static final BitSet FOLLOW_set_in_xmlText0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_xmlAttributes444 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_XML_NAME_in_xmlAttribute460 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_xmlAttribute462 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_xmlAttributeValue_in_xmlAttribute465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XML_ATTRIBUTE_VALUE_in_xmlAttributeValue492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlMarkup_in_xmlElementContent508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlText_in_xmlElementContent513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlElement_in_xmlElementContent518 = new BitSet(new long[]{0x0000000000000002L});

}