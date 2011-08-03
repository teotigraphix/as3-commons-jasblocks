/*
License:
  Currently there's no license restriction.You could use,modify it as you like.:)

*/
/*
@Author He.Ye (email:heyesh@cn.ibm.com)

Known Issue that is incompatible with Ecma-262(ECMAScript3 Specification)
1.[Lexer rule]RegularExpressionFirstChar must NOT be > , to avoid the consusable with XML Literal />

Known Issue that is incompatible with Ecma-357(ECMAScript for XML (E4X) Specification)
1. XMLName Lexer rule follows Ecma-262 Identifier rule (BUT can be a Reserved Word)

November 2008: Ernest Pasour - patched to add 'void' type as a valid function return type.
                             - interleaved helper code into grammar for purposes of supporting format/indent tool.
                             - changed memberExpression, callExpression and several others to use code from another grammar that handles function calls correctly.
                             - added ability to parse namespaces (double colon) in the code. ex. mOutputArea.mx_internal::getTextField();
                             - added support for binding declarations. ex. [Exclude(name="horizontalScrollBarStyleName", kind="style")]
                                                                           [IconFile("Accordion.png")] 
                                                                           [RequiresDataBinding(true)]
                             - added support for include directives
                             - added support for 'is' operator
                             - added support for '.*' in imports
                             - added support of 'as' operator
                             - added 'use namespace' directive
                             - added default xml namespace directive
                             - fixed implements to take a typeList instead of just a single type
                             - fixed formalParameterList to allow a single parameter that is an ellipsis
                             - added fileContents rule to allow a package declaration plus any combination of classes/interfaces/statements/directives afterward (i.e. outside the package)
                             	-I think this is the change that forced me to add -Xmx512m on the command line to prevent JDK OutOfMemoryError while processing the file.
                             - fixed identifierLiteral to allow keywords that aren't reserved
                             - fixed to allow xml attribute to allow any keyword to be used as an attribute name
                             - added support for xml attribute expressions ( ex. x.y.(@name=="abc").length()); )
                             - changed code that handles virtual semicolon to do lookahead for EOL/LineComment/MLComment instead of promoting token from non-hidden to hidden, which causes problems with the parser prediction phase
                             - fixed to allow trailing commas in array specifier, since that seems to be legal
January 2009				 - fixed to allow type specifier on ellipsis parameter.  Ex. override flash_proxy function callProperty(name:*, ... args:Array):*
February 2009				 - removed MUL_ASSIGN because of ambiguity with '*' type: ex. var x:*=2;
March 2009                   - added support for double negation ex. !!true or ~~true
                             - added support for conditional compiler code (ex. Config::debug {})
April 2009                   - added missing operators &&= and ||=
                             - added support for nested Vector declarations.  (ex. var nssets:Vector.<Vector.<String>> = new Vector.<Vector.<String>>(n+1);)
May 2009					 - fixed e4x to handle tagnames/attributes with hyphens/dots/colons (ex. <array-table></array-table>
							 - fixed e4x to allow var layers:XMLList = xmlData..ns::g.(@inkscape::groupmode =="layer");                             
June 2009                    - added ability to not indent at package level.  This is the way Adobe's example code is done, although the auto indent on carriage return in their editor doesn't agree
                             - added support for methods named "get" and "set".  I didn't think it was legal, but it appears to be.  This makes the grammar a little ambiguous, but it seems to work.
August 2009                  - added support for e4x attr names that are variable expressions.  Ex. <foo {attr}="value"/>
                             - added support for conditional blocks at the member level.  Ex. around a function or variable.  Grammar changes for packageElement and mxmlEmbedded, to support both AS classes and AS code fragments embedded within mxml.
October 2009                 - added support for using namespace to access members  Ex. mx_internal::functionCall(true);    
December 2009				 - fixed classBodyElement and interfaceElement to handle conditional blocks around their elements
                             - reordered labelledStatement, emptyStatement, and expression statement to be at end of statement rule so
                             	    that all the items with keyword lookahead get processed first.  There were some issues with labelled
                             	    statements that just started cropping up when I made minor changes.
                             - fixed findVirtualTokens to kick out early if the current token is one of the handled tokens (;, EOF, }) rather
                                    than performing the search for a virtual semicolon regardless.
                             - changed to require a VAR keyword before decl in for initializer.  Grammar was ambiguous before.       
                             - removed enumeration of particular string escape sequences because the compiler does "the right thing" under the covers.
                             - changed UNDERSCORE and DOLLAR to fragments because they are legal by themselves as identifiers, but the lexer was treating them as a top level token instead of part of the IDENTIFIER rule
January 2010                 - added -/+ to numeric literal for bindable arguments.  The parse didn't fail, but the item wasn't treated as a metadata tag.
July 2010                    - fixed metatags to allow keywords to be used as attributes (ex. [Inspectable(category="Style", default="1")] )
August 2010                  - fixed Vector to allow array initializer. ex. var v:Vector.<int>=new < int > [1, 2, 3]; 
September 2010				 - added support for Vector.<*>
                             - added support for (sharedDataViz.dataKind)::entitySortField
November 2010                - added support for metatag with scoped identifiers (ex. [MessageHandler(selector=MessageChannel.PNL)])
							 - added handling for non-breaking space char (00a0), which is apparently legal in actionscript files
							 - added ability to handle regular expressions containing '>'.  Ex. />abc/g
March 2011                   - nwo allow metatags that start with @ (ex. @Embed).  Not sure if this is really legal or not.						 							 
Currently building with Antlr 3.1.1                              
                             
*/
grammar AS3_;
options
{
    backtrack=true;
    memoize=true;
    output=AST;
    //TokenLabelType=ASCommonToken;
    //ASTLabelType=ASCommonTree;
}

tokens{
    AS          =   'as';
    BREAK       =   'break';
    CASE        =   'case';
    CATCH       =   'catch';
    CLASS       =   'class';
    CONST       =   'const';
    CONTINUE    =   'continue';
    DEFAULT     =   'default';
    DELETE      =   'delete';
    DO          =   'do';
    ELSE        =   'else';
    EXTENDS     =   'extends';
    FALSE       =   'false';
    FINALLY     =   'finally';
    FOR         =   'for';
    FUNCTION    =   'function';
    IF          =   'if';
    IMPLEMENTS  =   'implements';
    IMPORT      =   'import';
    IN          =   'in';
    INSTANCEOF  =   'instanceof';
    INTERFACE   =   'interface';
    INTERNAL    =   'internal';
    IS          =   'is';
    NATIVE      =   'native';
    NEW         =   'new';
    NULL        =   'null';
    PACKAGE     =   'package';  
    PRIVATE     =   'private';
    PROTECTED   =   'protected';
    PUBLIC      =   'public';
    RETURN      =   'return';
    SUPER       =   'super';
    SWITCH      =   'switch';
    THIS        =   'this';
    THROW       =   'throw';
    TO          =   'to';
    TRUE        =   'true';
    TRY         =   'try';
    TYPEOF      =   'typeof';
    USE         =   'use';
    VAR         =   'var';
    VOID        =   'void';
    WHILE       =   'while';
    WITH        =   'with';
    
    // KEYWORDs but can be identifier
    EACH        =   'each';
    GET         =   'get';
    SET         =   'set';
    NAMESPACE   =   'namespace';
    INCLUDE     =   'include';
    DYNAMIC     =   'dynamic';
    FINAL       =   'final';
    OVERRIDE    =   'override';
    STATIC      =   'static';
    
    // Future KEYWORDS
    //ABSTRACT    =   'abstract';
    //BOOLEAN     =   'boolean';
    //BYTE        =   'byte';
    //CAST        =   'cast';
    //CHAR        =   'char';
    //DEBUGGER    =   'debugger';
    //DOUBLE      =   'double';
    //ENUM        =   'enum';
    //EXPORT      =   'export';
    //FLOAT       =   'float';
    //GOTO        =   'goto';
    //INTRINSIC   =   'intrinsic';
    //LONG        =   'long';
    //PROTOTYPE   =   'prototype';
    //SHORT       =   'short';
    //SYNCHRONIZED=   'synchronized';
    //THROWS      =   'throws';
    //TO          =   'to';
    //TRANSIENT   =   'transient';
    //TYPE        =   'type';
    //VIRTUAL     =   'virtual';
    //VOLATILE    =   'volatile';
    
    SEMI        = ';' ;
    LCURLY      = '{' ;
    RCURLY      = '}' ;
    LPAREN      = '(' ;
    RPAREN      = ')' ;
    LBRACK      = '[' ;
    RBRACK      = ']' ;
    DOT         = '.' ;
    COMMA       = ',' ;
    LT          = '<' ;
    GT          = '>' ;
    LTE         = '<=' ;
    GTE; //         = '>=' ;
    EQ          = '==' ;
    NEQ         = '!=' ;
    SAME        = '===' ;
    NSAME       = '!==' ;
    PLUS        = '+' ;
    SUB         = '-' ;
    STAR        = '*' ;
    DIV         = '/' ; 
    MOD         = '%' ;
    INC         = '++' ;
    DEC         = '--' ;
    SHL         = '<<' ;
    SHR;//         = '>>' ;
    SHU;//         = '>>>' ;
    AND         = '&' ;
    OR          = '|' ;
    XOR         = '^' ;
    NOT         = '!' ;
    INV         = '~' ;
    LAND        = '&&' ;
    LOR         = '||' ;
    QUE         = '?' ;
    COLON       = ':' ;
    ASSIGN      = '=' ;
//    MUL_ASSIGN  = '*=' ;
    DIV_ASSIGN  = '/=' ;
    MOD_ASSIGN  = '%=' ;
    ADD_ASSIGN  = '+=' ;
    SUB_ASSIGN  = '-=' ;
    SHL_ASSIGN  = '<<=';
    SHR_ASSIGN;//  = '>>=';
    SHU_ASSIGN;//  = '>>>=';
    LAND_ASSIGN = '&&=';
    LOR_ASSIGN  = '||=';
    AND_ASSIGN  = '&=' ;
    XOR_ASSIGN  = '^=' ;
    OR_ASSIGN   = '|=' ;
    ELLIPSIS    = '...';
    XML_ELLIPSIS='..';
    XML_TEND    = '/>';
    XML_E_TEND  = '</';
    XML_NS_OP   = '::';
    XML_AT      = '@';
    XML_LS_STD  = '<>';
    XML_LS_END  = '</>';
}
@header{
package flexprettyprint.handlers;
}
@lexer::header{
package flexprettyprint.handlers;
import heyesh.app.language.as3.parser.UnicodeUtil;
}
@lexer::members
{
    /**  */
    private Token lastDefaultCnlToken = null;
    
    // override
    public Token nextToken()
    {
        Token result = super.nextToken();
        if (result!=null && result.getChannel() != AS3_exParser.CHANNEL_WHITESPACE )
        {
            lastDefaultCnlToken = result;
        }
        return result;      
    }
    
public void reset()
{
	super.reset(); // reset all recognizer state variables
	if (input instanceof ANTLRStringStream)
	{
		((ANTLRStringStream)input).reset();
	}
}
    

	//TODO: fix this so that regular expression embedded within xml text will work
    private final boolean isRegularExpression(){
        if(lastDefaultCnlToken!=null){
            switch(lastDefaultCnlToken.getType()){
                case NULL :
                case TRUE :
                case FALSE:
                case THIS :
                case SUPER:
                case IDENTIFIER:
                case HEX_NUMBER_LITERAL:
                case DEC_NUMBER_LITERAL:
                case SINGLE_QUOTE_LITERAL:
                case DOUBLE_QUOTE_LITERAL:
                case RCURLY:
                case RBRACK:
                case RPAREN:
                	//this is an attempt to not think something is a regular expression if it happens
                	//to be part of a mathematical expression.
                    return false;
                default:
                    break;
            }
        }

        System.out.println("start to predict if is a RegularExpression");
        // start to predict if the next is a regular expression
        int next = -1;
        int index=1;
        boolean success = false;
        if((next=input.LA(index)) != '/'){
            success = false;
            return success;
        }
        index++;
        // check the first regular character
        next=input.LA(index);
        if(next == '\r' || next == '\n' || 
        	next == '*' || //starts a comment
        	next == '/'  //if no regex content?
        	//|| next == '>' //I think the idea of failing on /> is to prevent conflicts with other tokens, but I think that is irrelevant since I've made this context sensitive.
         	){
            success = false;
            return success;
        }else if(next == '\\'){
            next=input.LA(index+1);
            if(next == '\r' || next == '\n'){
                success=false;
                return success;
            }
            // we omit the escape sequence \ u XXXX or \ x XX
            index++;
        }
        index++;
        // check the body of regular character
        while((next=input.LA(index))!=-1){
            //System.out.println("char["+index+"] = ("+(char)next+")");
            switch(next){
                case '\r':
                case '\n':
                    success = false;
                    return success;
                case '\\':
                    next=input.LA(index+1);
                    if(next == '\r' || next == '\n'){
                        success=false;
                        return success;
                    }
                    // we omit the escape sequence \ u XXXX or \ x XX
                    index++;
                    break;
                case '/':
                    success = true;
                    return success;
            }            
            index++;
        }
        return success;
    }
        
   /**
    * <pre> judge if is a XMLName </pre>
    * @param ch character
    * @return if is a XMLName return true
    */
    static final boolean isXMLText(int ch){
        System.out.println("isXMLText start");
        return (ch!='{'&&ch!='<'&&!(isUnicodeIdentifierPart(ch)));
    }
        
    /*---------------------------UNICODE_INDENTIFER START------------------------------------------*/    
    private static final boolean isUnicodeIdentifierPart(int ch){
        return ch=='$'||ch=='_'||UnicodeUtil.isUnicodeLetter(ch)||UnicodeUtil.isUnicodeDigit(ch)||UnicodeUtil.isUnicodeCombiningMark(ch)||UnicodeUtil.isUnicodeConnectorPunctuation(ch);
    }
    
    private final void consumeIdentifierUnicodeStart() throws RecognitionException, NoViableAltException{
        int ch = input.LA(1);
        if (UnicodeUtil.isUnicodeLetter(ch) || ch=='$' || ch=='_')
        {
            matchAny();
            do
            {
                ch = input.LA(1);
                if (isUnicodeIdentifierPart(ch))
                {
                    mIDENT_PART();
                }
                else
                {
                    return;
                }
            }
            while (true);
        }
        else
        {
            throw new NoViableAltException();
        }
    }

    /*---------------------------UNICODE_INDENTIFER END------------------------------------------*/
    private final void debugMethod(String methodName,String text){
        System.out.println("recognized as <<"+methodName+">> text=("+text+")");
    }    
}
@parser::members{
   
   		//options
private List<Exception> mParseErrors;
		
private ASPrettyPrinter mPrinter;
private CommonTokenStream mRawTokens;
private int mStatementCount=0;

private List<Integer> mCodeBlockStack=new ArrayList<Integer>(); //this is used for tracking which block I'm in so that I can handle the open brace differently depending on context
private boolean mIsFunctionDecl; //flag that tells me whether the function body is associated with an expression or a declaration
private List<IfElseBlockTracker> mIfElseBlocks=new ArrayList<IfElseBlockTracker>();
private List<Boolean> mXMLTextContentStack=new ArrayList<Boolean>();

private boolean mInFunctionParameterDecl=false; //set during formal parameter list so that I know where variable decls came from
private boolean mInEqualAlignDecl=false; //only set to true for variable statement declarations (not ones in the parameter list, for loops, etc.)

public AS3_exParser(ASPrettyPrinter printer, CommonTokenStream tokenStream)
{
	this(tokenStream, new RecognizerSharedState());
	mRawTokens=tokenStream;
    mPrinter=printer;
    mStatementCount=0;
}

private static class IfElseBlockTracker
{
	public boolean mBlockFlag=false;
	public boolean mBlockFlagSet=false;
}

public void addIfElseBlockTracker()
{
	mIfElseBlocks.add(new IfElseBlockTracker());
}

public void popIfElseBlockTracker()
{
	if (mIfElseBlocks.size()>0)
		mIfElseBlocks.remove(mIfElseBlocks.size()-1);
}

public IfElseBlockTracker getCurrentIfElseTracker()
{
	if (mIfElseBlocks.size()>0)
		return mIfElseBlocks.get(mIfElseBlocks.size()-1);
		
	return null;
}

public void setBlockFlag(boolean flag)
{
	IfElseBlockTracker tracker=getCurrentIfElseTracker();
	if (tracker!=null)
	{
		//don't set if already set
		if (tracker.mBlockFlagSet)
			return;
			
		tracker.mBlockFlag=flag;
		tracker.mBlockFlagSet=true;
	}
}

public void markBlockFlag()
{
	IfElseBlockTracker tracker=getCurrentIfElseTracker();
	if (tracker!=null)
		tracker.mBlockFlagSet=true;
}

public void clearBlockFlag()
{
	IfElseBlockTracker tracker=getCurrentIfElseTracker();
	if (tracker!=null)
		tracker.mBlockFlagSet=false;
}

public boolean isBlockFlag()
{
	IfElseBlockTracker tracker=getCurrentIfElseTracker();
	if (tracker!=null)
		return tracker.mBlockFlag;
		
	return false;
}

private void popBlockStack()
{
	if (mCodeBlockStack.size()>0)
	{
		mCodeBlockStack.remove(mCodeBlockStack.size()-1);
	}
}

private void setXMLTextContentFlag()
{
	if (mXMLTextContentStack.size()>0)
	{
		mXMLTextContentStack.set(mXMLTextContentStack.size()-1, true);
	}
}

private void pushXMLTextContentFlag()
{
	mXMLTextContentStack.add(false);
}

private boolean popXMLTextContentFlag()
{
	if (mXMLTextContentStack.size()>0)
	{
		int index=mXMLTextContentStack.size()-1;
		boolean value=mXMLTextContentStack.get(index);
		mXMLTextContentStack.remove(index);
		return value;
	}
	return false;
}

private void emitXMLBreak(Token tok, boolean before)
{
	WrapOptions options=mPrinter.getXMLWrapOptions();
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS))
	{
		mPrinter.saveWrapChar(tok, ASPrettyPrinter.Break_XML_code, before, false, -1, "");
	}
}

public boolean foundNextLT()
{
   int i=1;
   while (true)
   {
       Token token=input.LT(i);
       if (token.getText()!=null && token.getText().startsWith("<"))
          return (i>1);
       if (token.getType()==EOF)
          return false;
       i++;   
   }
}

public void changeTokensUpToNextLT()
{
   int i=1;
   while (true)
   {
       Token t=input.LT(i);
       if (t.getText()!=null && t.getText().startsWith("<"))
          return;
       if (t.getType()==EOF)
          return;
       t.setType(XML_TEXT);          
          
       i++;   
   }
}

//this is for '.' and other similar characters that might cause a break
private void wrapEmit(Token item, int breakType)
{
	pushExpressionIndent(); //needs to be matched with a popIndent later
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean breakBefore=options.isBeforeSeparator();
	if (breakType==ASPrettyPrinter.Break_Assignment_code || breakType==ASPrettyPrinter.Break_Parameter_Assignment_code)
		breakBefore=options.isBeforeAssignmentOperator();
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS) && breakBefore)
	{
		insertMaxColumnCR();
	}
	emit(item);
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS) && !breakBefore)
	{
		insertMaxColumnCR();
	}
	
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS))
	{
		mPrinter.saveWrapChar(item, breakType, (breakType==ASPrettyPrinter.Break_Keyword_code) ? true : breakBefore, false, -1, "");
	}
}

//this is for binary operators
private void indentEmit(Token operator, int breakType)
{
	pushExpressionIndent(); //needs to be matched with a popIndent later
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean breakBefore=options.isBeforeSeparator();
	if (breakType==ASPrettyPrinter.Break_Arithmetic_Ops_code)
		breakBefore=options.isBeforeArithmeticOperator();
	else if (breakType==ASPrettyPrinter.Break_Logical_Ops_code || breakType==ASPrettyPrinter.Break_Ternary_code)
		breakBefore=options.isBeforeLogicalOperator();
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS) && breakBefore)
	{
		insertMaxColumnCR();
	}
	char firstChar=0;
	if (operator.getText().length()>0)
		firstChar=operator.getText().charAt(0);
	if (firstChar!=0)
	{
		if (Character.isJavaIdentifierPart(firstChar))
			insertWS(1); //add 1 space around text operators (ex. 'as', 'instanceof')
		else
			insertWS(mPrinter.getExpressionSpacesAroundSymbolicOperators()); //add configurable symbolic operator value
	}	
	emit(operator);
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS) && !breakBefore)
	{
		insertMaxColumnCR();
	}
	
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS))
	{
		mPrinter.saveWrapChar(operator, breakType, breakBefore, false, -1, "");
	}
	
	if (firstChar!=0)
	{
		if (Character.isJavaIdentifierPart(firstChar))
			insertWS(1); //add 1 space around text operators (ex. 'as', 'instanceof')
		else
			insertWS(mPrinter.getExpressionSpacesAroundSymbolicOperators()); //add configurable symbolic operator value
	}	
}

private boolean pushWrapInfo(WrapOptions options, boolean newLevel)
{
	if (mPrinter.isDoFormat())
	{
		if (options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN)
		{
			mPrinter.createWrapContext(newLevel);
			return true;
		}
	}
	
	return false;
}

private boolean pushFormatType(WrapOptions options, boolean lazy)
{
	if (mPrinter.isDoFormat())
	{
		int formatMode=0;
		if (options.getWrapType()==WrapOptions.WRAP_DONT_PROCESS)
		{
			formatMode=ASPrettyPrinter.FORMAT_INDENT;
		}
		else if (options.getWrapType()==WrapOptions.WRAP_FORMAT_NO_CRs)
		{
			formatMode=ASPrettyPrinter.FORMAT_NOCRs;
		}
		else if (options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS)
		{
			formatMode=ASPrettyPrinter.FORMAT_OnlyAddCRs;
		}
		else
		{
			//if we didn't have a restrictive format, we want to make sure we're using the full format
			formatMode=ASPrettyPrinter.FORMAT_ALL;
		}

		if (formatMode>0)
		{
//		    if (formatMode==mPrinter.getFormatMode())
//		    	return false; //no need to nest format modes of the same type
		    	
			if (lazy)
				mPrinter.pushLazyFormat(formatMode);
			else
				mPrinter.pushFormatMode(formatMode);
			return true;
		}
		
	} 
	
	return false;
}

private void emitCRForTag(WrapOptions options)
{
	if (options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS)
	{
		insertMaxColumnCR();
	}
	else if (options.getWrapType()==WrapOptions.WRAP_BY_TAG)
	{
		insertCR(false);
	}

}

private boolean emitCommaWithSpacingAndCRs(WrapOptions options, Token comma, boolean pushedIndent, int firstParmLocation, String contextType)
{
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS) && options.isBeforeSeparator())
	{
		insertMaxColumnCR();
	}
	
	if (!pushedIndent)
	{
		pushedIndent=true;
		pushExpressionIndent();
	}
	
    insertWS(mPrinter.getSpacesBeforeComma());
    emit(comma); 
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS) && !options.isBeforeSeparator())
	{
		insertMaxColumnCR();
	}
	if ((options.getWrapType()==WrapOptions.WRAP_BY_COLUMN || options.getWrapType()==WrapOptions.WRAP_BY_COLUMN_ONLY_ADD_CRS))
	{
		mPrinter.saveWrapChar(comma, ASPrettyPrinter.Break_Commas_code, options.isBeforeSeparator(), options.getIndentStyle()==WrapOptions.WRAP_STYLE_INDENT_TO_WRAP_ELEMENT, firstParmLocation, contextType);
	}
	insertWS(mPrinter.getSpacesAfterComma());
	return pushedIndent;
}

    public boolean findVirtualHiddenToken(ParserRuleReturnScope retval)
    {
    		//the point of this method is to look for something that can serve as a semicolon.  So a carriage return
    		//or a comment containing a carriage return will fit the bill.
            int index = retval.start.getTokenIndex();
            if(index<0){
                index = input.size();
            }
            else
            {
            	Token lt=input.get(index);
            	if (lt.getType()==EOF || lt.getType()==SEMI || lt.getType()==RCURLY)
            		return false;
            }
            
/*            //we are on the next regular channel token after the rule.  So we walk backward to determine if between
            //the rule and this token is a single line comment, multiline comment, or new line that can serve as the
            //end token.  If so, then we 'promote' that token by returning it as the 'end' token of the rule (in place
            //of the semi colon).
	        for (int ix = index - 1; ix >= 0; ix--){
	            Token lt = input.get(ix);
	            int type = lt.getType();
	            if(lt.getChannel() == Token.DEFAULT_CHANNEL)
	                break;
	            if (type == EOL || type==COMMENT_SINGLELINE || (type == COMMENT_MULTILINE && lt.getText().matches("/.*\r\n|\r|\n")))
	            {
	            	retval.start=lt;
	                return true;
	            }
	        }*/
            
            
            //the token index is pointing to the next default channel token, which is not what we want.
            //We want to walk backward to the previous default channel token (first loop), and then walk forward
            //again looking for EOL/comments (2nd loop)
            int ix=index-1;
            for (; ix >= 0; ix--){
                Token lt = input.get(ix);
                if(lt.getChannel() == Token.DEFAULT_CHANNEL)
                    break;
            }
            
            //walk forward again
            ix++; //to move to next token that's not default channel
            for (;ix<input.size();ix++) //now search for the next "statement ender"
            {
                Token lt = input.get(ix);
                int type = lt.getType();
                if (lt.getChannel() == Token.DEFAULT_CHANNEL)
                    break;
                if (type == EOL || type==COMMENT_SINGLELINE || (type == COMMENT_MULTILINE && lt.getText().matches("/.*\r\n|\r|\n")))
                {
                	retval.start=lt;
                    return true;
                }
            }

            return false;

    }

public void reportError(RecognitionException e)
{
    if (mParseErrors==null)
    	mParseErrors=new ArrayList<Exception>();
    mParseErrors.add(e);
    super.reportError(e);
}
		
private void insertWS(int amt)
{
    mPrinter.insertWS(amt);
}

private void insertLines(int amt)
{
	insertLines(amt, true);
}

private void insertVariableDeclAssignmentWhitespace(Token equalToken, boolean before)
{
	if (mPrinter.isDoFormat() && !mPrinter.isInParameterDecl() && mPrinter.isKeepingExcessDeclWhitespace())
	{
		int spaceCount=0;
		if (before)
		{
			Token testToken=mRawTokens.get(equalToken.getTokenIndex()-1);
			if (testToken.getChannel()==CHANNEL_WHITESPACE)
			{
				//if the token before the whitespace is a carriage return, we *don't* want to apply this "preserve whitespace" logic
				Token prevTok=mRawTokens.get(equalToken.getTokenIndex()-2);
				if (!(prevTok.getChannel()==CHANNEL_SLCOMMENT || prevTok.getChannel()==CHANNEL_EOL))
				{
					if (testToken.getText().indexOf('\t')>=0)
					{
						spaceCount=mPrinter.getColumnForIndex(equalToken, 0)-mPrinter.getColumnForIndex(testToken, 0);
					}
					else
					{
					    spaceCount=testToken.getText().length();
					}
				}
			}
		}
		else
		{
			Token testToken=mRawTokens.get(equalToken.getTokenIndex()+1);
			if (testToken.getChannel()==CHANNEL_WHITESPACE)
			{
				//if the token after the whitespace is a carriage return, we *don't* want to apply this "preserve whitespace" logic
				//I think we only care about actual EOL here, not sl comment or ml comment, since there is actual text before the CR,
				//even if it's not 'code' text.
				Token nextTok=mRawTokens.get(equalToken.getTokenIndex()+2);
				if (!(nextTok.getChannel()==CHANNEL_EOL))
				{
					if (testToken.getText().indexOf('\t')>=0)
					{
						spaceCount=mPrinter.getColumnForIndex(testToken, testToken.getText().length())-mPrinter.getColumnForIndex(equalToken, equalToken.getText().length());
					}
					else
					{
					    spaceCount=testToken.getText().length();
					}
				}
			}
		}
		
		if (spaceCount>mPrinter.getSpacesAroundAssignment())
		{
			insertWS(spaceCount);
			return;
		}
	}
	
	insertWS(mPrinter.isInParameterDecl() ? mPrinter.getAdvancedSpacesAroundAssignmentInOptionalParameters() : mPrinter.getSpacesAroundAssignment());
}

//this method is for inserting blank lines before elements, based on the format settings
private void insertLines(int amt, boolean inCodeBlock)
{
    //don't add blank lines if not inside a block
	if (!mPrinter.isHardIndent())
	    return;
	//don't add blank lines if the wrapper is a labeled statement indent
	if (mPrinter.isLabeledIndent())
		return;
		
	//don't add blank lines if we are at start of block
	if (inCodeBlock)
	{
		if (!mPrinter.isCanAddCRsAtBlockStart() && mPrinter.isAtBlockStart())
		{
			return;
		}
	}
	
    for (int i=0;i<amt;i++)
    {
        mPrinter.insertCR(true);
    }
}

private void insertMaxColumnCR()
{
	mPrinter.insertCRBeyondMaxCol();
}

private void insertStatementCR()
{
	if (!mPrinter.isLabeledIndent())
		insertCR(false);
}

boolean isFirstImport=true;
boolean isFirstClassSeen=false;
boolean isSeenPackage=false;
private void addBlankLinesBeforeFirstImport()
{
	//only add blank lines for before first import in 'package' area.  The assumption is that all the 
	// imports are together, or this setting doesn't really make sense.
	int linesToAdd=mPrinter.getBlankLinesBeforeImports();
	if (isFirstImport && !isFirstClassSeen && isSeenPackage)
	{
		isFirstImport=false;
		for (int i=0;i<linesToAdd;i++)
		{
			insertCR(true);
		}
	}
}
		
private void insertCR(boolean override)
{
    mPrinter.insertCR(override);
}
	
private void pushLabeledIndent()
{
	pushExpressionIndent(); //push an expression indent so that it won't further indent the nested statement 
	mPrinter.makeLabeledIndent();
}
	
private void pushIndent(boolean hardIndent)
{
	mPrinter.pushIndent(hardIndent ? ASPrettyPrinter.BRACE_INDENT : ASPrettyPrinter.STATEMENT_INDENT);
}

private void pushExpressionIndent()
{
	mPrinter.pushIndent(ASPrettyPrinter.EXPRESSION_INDENT);
}

private boolean pushLazyParmIndent(boolean alreadyPushed, int indentStyle)
{
	if (!alreadyPushed)
	{
		if (!mPrinter.isUseAdvancedWrapping() && indentStyle==WrapOptions.WRAP_STYLE_INDENT_TO_WRAP_ELEMENT)
			mPrinter.pushLazyIndent(ASPrettyPrinter.EXPRESSION_INDENT_NEXTITEM);
		else
			pushLazyIndent();
	}
	return true;
}

private void pushLazyIndent()
{
	mPrinter.pushLazyIndent(ASPrettyPrinter.EXPRESSION_INDENT);
}

private void popIndent()
{
    mPrinter.popIndent();
}
		
private void leftCurlyNewlineHandler(boolean checkBraceIndent)
{
   if (mPrinter.isCRBeforeOpenBrace(mCodeBlockStack) || (checkBraceIndent && mPrinter.getIndentType(0)==mPrinter.BRACE_INDENT))
   {
       insertCR(false);
       insertWS(1); //add a space here just in case newlines can't be added
   }
   else
       insertWS(1);
}
		
private void emit(Token tok)
{
    mPrinter.emit(tok);
}
		    
		
public List<Exception> getParseErrors()
{
    return mParseErrors;
}
		
/*        boolean isNotReservedWord(String name) {
        String[] reserveWords = new String[]
            {
                "as",
                "break",
                "case",
                "catch",
                "class",
                "const",
                "continue",
                "default",
                "delete",
                "do",
                "else",
                "extends",
                "false",
                "finally",
                "for",
                "function",
                "if",
                "implements",
                "import",
                "in",
                "instanceof",
                "interface",
                "internal",
                "is",
                "native",
                "new",
                "null",
                "package",
                "private",
                "protected",
                "public",
                "return",
                "super",
                "switch",
                "this",
                "throw",
                "to",
                "true",
                "try",
                "typeof",
                "use",
                "var",
                "void",
                "while",
                "with"
            };
        for (int i = 0; i<reserveWords.length; i++) {
            if ( reserveWords[i].equals(name) ) {
                return false;
            }
        }
        return true;
    }
    */
    
/*    private final void promoteEOL(ParserRuleReturnScope rule)
    {
        System.out.println("start promoteEOL <<let HIDDENT Token EOL be visible>>");
        Token lt = input.LT(1);
        int index = lt.getTokenIndex();
        if(index<0){
            index = input.size();
        }
        int la = lt.getType();
        
        for (int ix = index - 1; ix >= 0; ix--){
            lt = input.get(ix);
            int type = lt.getType();
            if (type == EOL || (type == COMMENT_MULTILINE && lt.getText().matches("/.*\r\n|\r|\n"))){
                lt.setChannel(Token.DEFAULT_CHANNEL);
                input.seek(lt.getTokenIndex());
                System.out.println("promoteEOL : HIDDEN Token ("+lt+") is set to DEFAULT");
                if (rule != null){
                    System.out.println("promoteEOL :  startToken set as "+lt);
                    rule.start = lt;
                }
                return;
            }else if(lt.getChannel() == Token.DEFAULT_CHANNEL){
                break;
            }
        }
        System.out.println("");
    }
  */
    
    public static final int CHANNEL_SLCOMMENT=43;
    public static final int CHANNEL_MLCOMMENT=42;
    public static final int CHANNEL_WHITESPACE=41;
    public static final int CHANNEL_EOL=40;
    
    private final boolean promoteWhitespace()
    {
    	//find the current lookahead token
        Token lt = input.LT(1);
        int index = lt.getTokenIndex();
        if(index<0){
            index = input.size();
        }

		//walk backward through tokens to see if the previous token is whitespace.
        for (int ix = index - 1; ix >= 0; ix--){
            lt = input.get(ix);
            int channel=lt.getChannel();
            if (channel == CHANNEL_EOL || channel ==  CHANNEL_WHITESPACE){
                return true;
            } else if(channel == Token.DEFAULT_CHANNEL){
                break;
            }
        }
        return false;
    }
}
// Lexer Helper Rule

fragment UNDERSCORE  : '_';
fragment DOLLAR      : '$';

fragment ALPHABET            :    'a'..'z'|'A'..'Z';

fragment NUMBER              :    '0' .. '9';   

fragment HEX_DIGIT           :    ('0' .. '9'|'a'..'f'|'A'..'F') ;

fragment CR                  :    '\r';

fragment LF                  :    '\n';

fragment UNICODE_ESCAPE      :    '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;

//changed to accept any backslash escape because the compiler seems to be very lenient.
fragment ESCAPE_SEQUENCE     :   
							//	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
                            //     |   UNICODE_ESCAPE
                            	 '\\' '\\'
                            	| '\\' ~('\\')
                                 ;
// Lexer Ignored Rule
EOL  
@after{
    debugMethod("EOL",$text);
}                        
    :    (CR LF | CR | LF)        
    { $channel = AS3_exParser.CHANNEL_EOL; };

WHITESPACE
@after{
    debugMethod("WHITESPACE",$text);
}
    :   (('\u0020'|'\u0009'|'\u000B'|'\u00A0'|'\u000C')|('\u001C'..'\u001F'))+              { $channel = AS3_exParser.CHANNEL_WHITESPACE; }
    ;
    
COMMENT_MULTILINE           
@after{
    debugMethod("COMMENT_MULTILINE",$text);
}
    :   '/*' ( options {greedy=false;} : . )* '*/'         { $channel = AS3_exParser.CHANNEL_MLCOMMENT; };

COMMENT_SINGLELINE
@after{
    debugMethod("COMMENT_SINGLELINE",$text);
}      
    :   '//' ~( CR | LF )* (CR LF | CR | LF)                          { $channel = AS3_exParser.CHANNEL_SLCOMMENT; };

// $<StringLiteral

SINGLE_QUOTE_LITERAL
@after{
    debugMethod("SINGLE_QUOTE_LITERAL",$text);
}          
    :   '\'' ( ESCAPE_SEQUENCE | ~('\\'|'\'') )* '\'';
DOUBLE_QUOTE_LITERAL         
@after{
    debugMethod("DOUBLE_QUOTE_LITERAL",$text);
} 
    :   '"'  ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"';

// $>

// $<RegularExpressionLiteral

REGULAR_EXPR_LITERAL
@after{
    debugMethod("REGULAR_EXPR_LITERAL",$text);
}
    :   {isRegularExpression()}? => DIV REGULAR_EXPR_BODY DIV REGULAR_EXPR_FLAG*
    ;
    
fragment REGULAR_EXPR_BODY
    :   REGULAR_EXPR_FIRST_CHAR REGULAR_EXPR_CHAR*
    ;   

// add > to the cannot be first char list
fragment REGULAR_EXPR_FIRST_CHAR
    :   ~(CR | LF |'*'|'\\'|'/') //|'>')
    |   BACKSLASH_SEQUENCE
    ;

fragment REGULAR_EXPR_CHAR
    :   ~(CR | LF |'\\'|'/')
    |   BACKSLASH_SEQUENCE
    ;

fragment BACKSLASH_SEQUENCE:    '\\' ~(CR | LF);    
    
fragment REGULAR_EXPR_FLAG :    IDENT_PART ;

// $>

// $<NumberLiteral

HEX_NUMBER_LITERAL           
@after{
    debugMethod("HEX_NUMBER_LITERAL",$text);
} 
    : '0' ('X'|'x') HEX_DIGIT+ ;

fragment DEC_NUMBER          :  NUMBER+ '.' NUMBER* | '.' NUMBER+ | NUMBER+ ;

DEC_NUMBER_LITERAL
@after{
    debugMethod("DEC_NUMBER_LITERAL",$text);
} 
    :  DEC_NUMBER EXPONENT? ;

fragment EXPONENT            : ('e'|'E') ('+'|'-')? NUMBER+ ;

// $>

IDENTIFIER
@after{
    debugMethod("Identifier",$text);
} 
    :   IDENT_NAME_ASCII_START
    |   UNICODE_ESCAPE+
    |   {consumeIdentifierUnicodeStart();}
    ;
       
fragment IDENT_NAME_ASCII_START   : IDENT_ASCII_START IDENT_PART*;

fragment IDENT_ASCII_START        : ALPHABET | DOLLAR | UNDERSCORE;
    
fragment IDENT_PART 
@after{
    debugMethod("IDENT_PART",$text);
} 
    :   (IDENT_ASCII_START) => IDENT_ASCII_START
    |   NUMBER
    |   {isUnicodeIdentifierPart(input.LA(1))}? {matchAny();}
    ;
    
XML_COMMENT
@after{
    debugMethod("XML_COMMENT",$text);
}                  
    :   '<!--' ( options {greedy=false;} : . )* '-->';
    
XML_CDATA options {k=8;}
@after{
    debugMethod("XML_CDATA",$text);
}    
    :   '<![CDATA' ( options {greedy=false;} : . )* ']]>' ;
     
XML_PI
@after{
    debugMethod("XML_PI",$text);
}                      
    :   '<?' ( options {greedy=false;} : . )* '?>'; 

// SourceCharacters but no embedded left-curly { or less-than <    
XML_TEXT 
@after{
    debugMethod("XMLText",$text);
}   
    : '\u0020'..'\u003b'
    | '\u003d'..'\u007a'
    | '\u007c'..'\u007e'
    | {isXMLText(input.LA(1))}?{matchAny();}
    ;

    
// $<Literal

booleanLiteral                     :   T=TRUE {emit($T);} | F=FALSE{emit($F);} ;

numericLiteral                     :   D=DEC_NUMBER_LITERAL {emit($D);} | H=HEX_NUMBER_LITERAL {emit($H);};

stringLiteral                      :   S=SINGLE_QUOTE_LITERAL{emit($S);} | D=DOUBLE_QUOTE_LITERAL {emit($D);};

regularExpresionLiteral            :   R=REGULAR_EXPR_LITERAL {emit($R);};

identifierLiteral                  :   /*{isNotReservedWord(input.LT(1).getText())}?*/ I=IDENTIFIER{emit($I);} | notQuiteReservedWord ; 

xmlNameLiteral                     :   (I=IDENTIFIER{emit($I);} | allKeywords) ( {!promoteWhitespace()}?=> (s=SUB {emit($s);} | d=DOT {emit($d);} | c=COLON {emit($c);}) {!promoteWhitespace()}?=> (I2=IDENTIFIER {emit($I2);} | allKeywords))*
									; 

literal                            :   N=NULL {emit($N);} | booleanLiteral | numericLiteral | stringLiteral | regularExpresionLiteral;
// $>

xmlMarkup                          :   xmlComment | xmlCDATA | xmlPI;
xmlComment                         :   x=XML_COMMENT {emit($x);} ;  
xmlCDATA                           :   x=XML_CDATA {emit($x);}; 
xmlPI                              :   x=XML_PI {emit($x);} ; 
xmlExprEval                        :   L=LCURLY {emit($L);pushIndent(true);} expression R=RCURLY{popIndent();emit($R);} ; 


xmlTextElement
    :
		allKeywords {/*TODO: see if I can change token type*/} 
    | lexToken=(   DEC_NUMBER_LITERAL 
    | 	HEX_NUMBER_LITERAL
    |   SINGLE_QUOTE_LITERAL 
    | 	DOUBLE_QUOTE_LITERAL
    |   IDENTIFIER 
    |   XML_TEXT  //used to have a '+' on this item
    |   DIV 
    | 	SEMI 
//    | 	LCURLY //not allowed in xml text
    | 	RCURLY 
    | 	LPAREN 
    | 	RPAREN 
    |	LBRACK 
    |	RBRACK      
    |	DOT         
    |	COMMA       
//    |	LT          //not allowed in xml text
    |	GT          
    |	LTE         
//    |	GTE         
    |	EQ          
    |	NEQ         
    |	SAME        
    |	NSAME       
    |	PLUS        
    |	SUB         
    |	STAR        
    |	MOD         
    |	INC         
    |	DEC         
    |	SHL         
//    |	SHR         
//    |	SHU         
    |	AND         
    |	OR          
    |	XOR         
    |	NOT         
    |	INV         
    |	LAND        
    |	LOR         
    |	QUE         
    |	COLON       
    |	ASSIGN      
//    |	UNDERSCORE  
//    |	DOLLAR      
//    |	MUL_ASSIGN
    |	DIV_ASSIGN
    |	MOD_ASSIGN
    |	ADD_ASSIGN
    |	SUB_ASSIGN
    |	SHL_ASSIGN
//    |	SHR_ASSIGN
//    |	SHU_ASSIGN
    |	AND_ASSIGN
    |	XOR_ASSIGN
    |	OR_ASSIGN
    |   LOR_ASSIGN
    |   LAND_ASSIGN
    |	ELLIPSIS    
    |	XML_ELLIPSIS
    |	XML_NS_OP
    |	XML_AT
//    |	XML_LS_STD
 //   |	XML_LS_END
    ) 
    {
        lexToken.setType(XML_TEXT); 
        emit($lexToken);
    }
    ;

xmlText
    : 
    (xmlTextElement)+ 
    ;

// it's a helper rule,should not be a tree.
xmlPrimaryExpression 
    :   xmlPropertyIdentifier
    |   xmlInitialiser
    |   xmlListInitialiser
    ;                                                                      

/* 
    XMLPropertyIdentifier can be a primary expression, but also can be a propertySuffixReference
    see example
        :   var xml:XML = <soap:Envelope soap:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/>;
            var soapNS:Namespace = message.namespace("soap");
            trace(xml.@soapNS::encodingStyle); //-> it's a propertySuffixReference Call
            with(xml){
                trace(@soapNS::encodingStyle); //-> it's a primaryExpression Call
            }
*/
xmlPropertyIdentifier
      :   xmlAttributeIdentifier
      |   xmlQualifiedIdentifier
      |   s=STAR {emit($s);}                                    
      ;    

xmlAttributeIdentifier
    :   at=XML_AT {emit($at);} 
        (
           xmlQualifiedIdentifier
           | xmlPropertySelector
           | indexSuffix
        )                                                        
    ; 
    
xmlPropertySelector
    :   xmlNameLiteral 
    |   s=STAR {emit($s);}
    ;

xmlQualifiedIdentifier
    :   xmlPropertySelector  x=XML_NS_OP {wrapEmit($x, ASPrettyPrinter.Break_Other_Connectors_code);}                 
    (
        xmlPropertySelector
        | indexSuffix
    )
    {popIndent();}
    ;

xmlInitialiser
    :   xmlMarkup
    |   xmlElement
    ;
    
//xmlTagEnd
//	:
//	(('/' '>')=> t1='/' t2='>'
 //   { $t1.getLine() == $t2.getLine() && 
 //     $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine()}?
  //	    -> XML_TEND) {t1.setText("/>");}        
//	;
    
xmlElement
@init
{
	WrapOptions options=mPrinter.getXMLWrapOptions();
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
}
    :
    {pushedFormat=pushFormatType(options, true);}
    {pushedWrapInfo=pushWrapInfo(options, true);}
    {emitCRForTag(options);}
    L=LT {emit($L);}{emitXMLBreak($L, true);}{pushIndent(true);} xmlTagName xmlAttributes? 
    (
        x=XML_TEND {emit($x);}
    //	te=xmlTagEnd
    	//{emit($te.start);}
        {emitCRForTag(options);}
        {popIndent();}
        | 
        G=GT {emit($G);pushXMLTextContentFlag();} xmlElementContent[false]? 
        x=XML_E_TEND {popIndent();}{emit($x);}{if (!popXMLTextContentFlag()) emitXMLBreak($x, true);} 
        xmlTagName G=GT{emit($G);}{emitCRForTag(options);} 
    )
    {
	    if (pushedWrapInfo) mPrinter.popWrapContext();
	    if (pushedFormat)
	    	mPrinter.popFormatMode();
    }
    ; 
    
xmlAttributes
    :   xmlAttribute+
    ;      
    
xmlTagName
    :   xmlExprEval
	| xmlNameLiteral
    ; 

xmlAttribute
    :  {promoteWhitespace()}? {insertWS(1);} xmlTagName A=ASSIGN {emit($A);} 
    (
        xmlExprEval
        | stringLiteral
    )
    ;
       
xmlElementContent[boolean crAfterTags]
    :  xmlElementContentHelper[crAfterTags]+
    ;

xmlElementContentHelper[boolean crAfterTags]
    : xmlExprEval {if (crAfterTags) insertCR(false);setXMLTextContentFlag();}
    | xmlMarkup {if (crAfterTags) insertCR(false);}
    | xmlElement {if (crAfterTags) insertCR(false);}
    | {mPrinter.pushFormatMode(ASPrettyPrinter.FORMAT_INDENT);}xmlText{mPrinter.popFormatMode();} {if (crAfterTags) insertCR(false);setXMLTextContentFlag();}
	;

xmlListInitialiser
@init
{
	WrapOptions options=mPrinter.getXMLWrapOptions();
	boolean pushedFormat=false;
}
    :
		{pushedFormat=pushFormatType(options, true);}    
        {insertCR(false);} x=XML_LS_STD 
  		{emit($x);}{insertCR(false);}{pushIndent(true);}
  		xmlElementContent[true]? 
  		{insertCR(false);} x=XML_LS_END {popIndent();}{emit($x);}{insertCR(false);}
	    {
		    if (pushedFormat)
		    	mPrinter.popFormatMode();
	    }
    ;

// semic rule
semic
@init
{
    // Mark current position so we can unconsume a RBRACE.
    int marker = input.mark();
    // Promote EOL if appropriate
    boolean onBrace=false;
    if (retval.start.getText()!=null && retval.start.getText().equals("}"))
    {
    	onBrace=true;
		if (state.backtracking>0)
		{
			retval.stop=retval.start;
		    return retval; //we don't want to consume the '}' during the prediction phase
		}    	
    }
    	
    if (findVirtualHiddenToken(retval))
    {
       retval.stop=retval.start;
       return retval;
    }
       
 //   promoteEOL(retval);
}
    :   S=SEMI{emit($S);} 
    |   E=EOF{emit($E);} 
    |   R=RCURLY { input.rewind(marker); 
                    if (onBrace)
                    {
                         retval.start=input.LT(-1);
                         retval.stop=retval.start;
                         retval.tree=null;
                         return retval;
                    }
                 }
//    |   C=COMMENT_MULTILINE {emit($C);} // (with EOL in it)
//    |   {isNextTokenHiddenVirtualSemi(retval)}?  E=EOL {emit($E);} 
    ;


fileContents
	: (packageDeclaration? packageElement*) | EOF
	;

// $<Package Declaration

packageDeclaration
	:   p=PACKAGE {isSeenPackage=true;{insertCR(false);}emit($p);pushExpressionIndent();} ({insertWS(1);} type)? {popIndent();} 
	    l=LCURLY 
	    {
	  	   mCodeBlockStack.add(ASPrettyPrinter.BraceContext_package_code);
	       leftCurlyNewlineHandler(false);
	       emit($l);
	       {mPrinter.addDeclEqualsBlock();}
	       if (mPrinter.isIndentAtPackageLevel())
	          pushIndent(true);
	       mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
	    } 
	    packageElement* 
	    {
	    	if (mPrinter.isIndentAtPackageLevel())
	            popIndent();
	    } 
	    {mPrinter.popDeclEqualsBlock();}
	    r=RCURLY {insertCR(false);emit($r);popBlockStack();popBlockStack();}
	;
			
//this is for actionscript embedded within mxml.  I believe that the semantics are that the code in
//the mx:Script blocks are embedded inside a virtual class declaration, so anything that is normally
//allowed inside a class should be okay.  However, imports are okay too.
mxmlEmbedded
	:
		({insertCR(false);} conditionalCompilerOption 
			l=LCURLY
			{ 
				mCodeBlockStack.add(ASPrettyPrinter.BraceContext_Conditional_code);
				leftCurlyNewlineHandler(false);
	    		emit($l);pushIndent(true);
	    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
	    	}
			mxmlEmbedded
			{popIndent();} r=RCURLY {insertCR(false);emit($r);popBlockStack();popBlockStack();} 
	     | propertyDeclaration | functionDeclaration | statement | directive | interfaceFunctionDeclaration
	    )*  
	    EOF?
	;
				
packageElement
    :
    	{insertCR(false);} conditionalCompilerOption 
			l=LCURLY
			{ 
				mCodeBlockStack.add(ASPrettyPrinter.BraceContext_Conditional_code);
				leftCurlyNewlineHandler(false);
	    		emit($l);pushIndent(true);
	    		{mPrinter.addDeclEqualsBlock();}
	    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
	    	}
			packageElement*
			{mPrinter.popDeclEqualsBlock();}
			{popIndent();} r=RCURLY {insertCR(false);emit($r);popBlockStack();popBlockStack();}	   
    	| classOrInterfaceDecl | propertyDeclaration | functionDeclaration | interfaceFunctionDeclaration | statement | directive
    ;

importDeclaration
	:
	{mPrinter.markDeclEqualsContextChange();}   
	{insertCR(false);addBlankLinesBeforeFirstImport();} i=IMPORT {emit($i);} type (D=DOT {emit($D);} S=STAR{emit($S);} )? semic 
	;

classOrInterfaceDecl
	:   {mPrinter.setBindingContext(ASPrettyPrinter.BindingContext_Class);} (conditionalDirAndBindingDecls)? {pushLazyIndent();}{insertCR(false);}{insertLines(mPrinter.getBlankLinesBeforeClass(), false);isFirstClassSeen=true;} memberModifiers? (interfaceDeclaration | classDeclaration)
	;
	
directive
	:
	{pushLazyIndent();}{insertCR(false);}(bindingDecl | includeDirective | useNamespaceDirective | importDeclaration | /*namespaceDirective |*/ defaultXMLNamespaceDirective){popIndent();}
	;
	
conditionalDirAndBindingDecls
	: {insertCR(false);} 	
	  {mPrinter.markBindablePos(true);}
	  conditionalCompilerOption 
      {mPrinter.setBindableMode();}
	  ({insertCR(false);} bindingDecl)*
	;
	
xmlKeyword
	: {input.LT(1).getText().equalsIgnoreCase("xml")}? I=IDENTIFIER {emit($I);} 
	;
	
conditionalCompilerOption
	:
	identifierLiteral x=XML_NS_OP {emit($x);} identifierLiteral
	;
	
defaultXMLNamespaceDirective
@init
{
	boolean pushedFormat=false;
    WrapOptions options=mPrinter.getExpressionWrapOptions();
}
	:
	{mPrinter.markDeclEqualsContextChange();}
	{pushedFormat=pushFormatType(options, true);} 
	D=DEFAULT {emit($D);} xmlKeyword 
	//namespace
	N=NAMESPACE {emit($N);} 
	A=ASSIGN {insertWS(mPrinter.getSpacesAroundAssignment());emit($A);insertWS(mPrinter.getSpacesAroundAssignment());} assignmentExpression semic
	{
   	    if (pushedFormat)
   	    {
   	    	mPrinter.popFormatMode();
   	    }
	} 
	;	
	
bindingDecl
@init
{boolean bindable=false;
 boolean pushedIndent=false;
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
 WrapOptions options=mPrinter.getExpressionWrapOptions();
}
	:
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
	   L=LBRACK  
		  (XA=XML_AT)? I=IDENTIFIER 
		  	{
		  		bindable=mPrinter.isDirectiveForNextElement($I.getText());
		  		if (bindable)
		  			mPrinter.markBindablePos(false); //call this to mark position *before* we send any of the tokens to the printer
		  		emit($L); }
		  		{if (XA!=null)
		  		    emit($XA); 
		  		emit($I);
		  		mPrinter.setLastBindableTagName($I.getText());
		  	} 
		(L=LPAREN {emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInArgumentLists());}
		     (bindingDeclArg (C=COMMA {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} bindingDeclArg)*)? 
		R=RPAREN{insertWS(mPrinter.getAdvancedSpacesInsideParensInArgumentLists());emit($R);}
	       )? 
	   R=RBRACK{emit($R);} (s=SEMI {emit($s);})?
	   {
        	if (pushedWrapInfo)
        		mPrinter.popWrapContext();
	        if (pushedIndent)
    	    	popIndent();
    	    if (pushedFormat)
    	    {
    	    	mPrinter.popFormatMode();
    	    }
	   	if (bindable)
	   	{
	   		mPrinter.setBindableMode();
	   	}
	   } 
	;
	
includeDirective
	:
	{mPrinter.markDeclEqualsContextChange();} 
	I=INCLUDE{emit($I);} stringLiteral semic  
	;
	
bindingDeclArg
	:
	//TODO: figure out what's actually legal here
//	(I=IDENTIFIER {emit($I);} E=ASSIGN {emit($E);})? expression  
//	| I=IDENTIFIER{emit($I);} 
//	| T=TRUE {emit($T);} 
//	| F=FALSE{emit($F);}
   
    (eitherIdentifier E=ASSIGN {insertWS(mPrinter.getAdvancedSpacesAroundAssignmentInMetatags()); emit($E); insertWS(mPrinter.getAdvancedSpacesAroundAssignmentInMetatags());} )? 
	(
		stringLiteral | (P=PLUS {emit($P);} | S=SUB {emit($S);} )? numericLiteral | (eitherIdentifier (D=DOT {emit($D);} eitherIdentifier)* )  
	);

// $>

// $<Class / Interface Body

interfaceDeclaration
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
	:   
	    i=INTERFACE {emit($i);} type 
		(e=EXTENDS 
			{pushedWrapInfo=pushWrapInfo(options, true);} {wrapEmit($e, ASPrettyPrinter.Break_Keyword_code);} 
			typeList
			{if (pushedWrapInfo) mPrinter.popWrapContext();}{popIndent();} 
		)? 
		{popIndent();}
        interfaceBody
	;	

interfaceBody
	:   l=LCURLY 
	    {
	    	mCodeBlockStack.add(ASPrettyPrinter.BraceContext_interface_code);
	    	leftCurlyNewlineHandler(false);
	    	emit($l);pushIndent(true);
	    	{mPrinter.addDeclEqualsBlock();}
	    	mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
	    } 
	    interfaceElement* 
	    {popIndent();} 
	    {mPrinter.popDeclEqualsBlock();}
	    r=RCURLY {insertCR(false);emit($r);popBlockStack();popBlockStack();}
	;	

classDeclaration
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
	:	
	    c=CLASS {emit($c);} type 
		( E=EXTENDS 
			{pushedWrapInfo=pushWrapInfo(options, true);}{wrapEmit($E, ASPrettyPrinter.Break_Keyword_code);}
			type
			{if (pushedWrapInfo) mPrinter.popWrapContext();}{popIndent();}
		)? 
		( I=IMPLEMENTS 
			{pushedWrapInfo=pushWrapInfo(options, true);} {wrapEmit($I, ASPrettyPrinter.Break_Keyword_code);} 
			typeList
			{if (pushedWrapInfo) mPrinter.popWrapContext();}{popIndent();}
		)? 
		{popIndent();}
        classBody 
    ;  
    
  

classBody
	:   L=LCURLY 
		{
			mCodeBlockStack.add(ASPrettyPrinter.BraceContext_class_code);
			leftCurlyNewlineHandler(false);
			emit($L);pushIndent(true);
			{mPrinter.addDeclEqualsBlock();}
			mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
		} 
		classBodyElement* 
		{popIndent();} 
		{mPrinter.popDeclEqualsBlock();}
		R=RCURLY{insertCR(false);emit($R);popBlockStack();popBlockStack();} 
	;

// $>
	 
// $<Class/Interface Element

classBodyElement
    : (conditionalCompilerOption LCURLY)=>
  	    	{insertCR(false);} conditionalCompilerOption 
			l=LCURLY
			{ 
				mCodeBlockStack.add(ASPrettyPrinter.BraceContext_Conditional_code);
				leftCurlyNewlineHandler(false);
	    		emit($l);pushIndent(true);
	    		{mPrinter.addDeclEqualsBlock();}
	    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
	    	}
			classBodyElement*
			{popIndent();}
			{mPrinter.popDeclEqualsBlock();} 
			r=RCURLY {insertCR(false);emit($r);popBlockStack();popBlockStack();}	   
    | propertyDeclaration | functionDeclaration | statement | directive
	;

interfaceElement
    : (conditionalCompilerOption LCURLY)=>
   	    	{insertCR(false);} conditionalCompilerOption 
			l=LCURLY
			{ 
				mCodeBlockStack.add(ASPrettyPrinter.BraceContext_Conditional_code);
				leftCurlyNewlineHandler(false);
	    		emit($l);pushIndent(true);
	    		{mPrinter.addDeclEqualsBlock();}
	    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
	    	}
			interfaceElement*
			{popIndent();}
			{mPrinter.popDeclEqualsBlock();} 
			r=RCURLY {insertCR(false);emit($r);popBlockStack();popBlockStack();}	   
    | propertyDeclaration | interfaceFunctionDeclaration | statement| directive
    ;

// $>
	 


// $<InterfaceFunction Declaration

interfaceFunctionDeclaration
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedWrapInfo=false;
}
    :    {mPrinter.setBindingContext(ASPrettyPrinter.BindingContext_Function);} (conditionalDirAndBindingDecls)? {insertCR(false);} memberModifiers? F=FUNCTION {emit($F);}
       // getOrSet? 
    (S=SET{emit($S);} | G=GET{emit($G);} )?
    {pushedWrapInfo=pushWrapInfo(options, true);} 
	(I=IDENTIFIER {emit($I);} | notQuiteReservedWord) formalParameterList (C=COLON {insertWS(mPrinter.getAdvancedSpacesBeforeColonsInFunctionTypes()); emit($C);insertWS(mPrinter.getAdvancedSpacesAfterColonsInFunctionTypes());} type)? semic
    {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;

// $>

// $<Property Declaration

propertyDeclaration
	:    {insertLines(mPrinter.getBlankLinesBeforeProperties());mPrinter.setBindingContext(ASPrettyPrinter.BindingContext_Property);} (conditionalDirAndBindingDecls)? {insertCR(false);}{pushLazyIndent();} memberModifiers? (variableStatement | constantVarStatement | namespaceDirective ) {popIndent();}{mPrinter.adjustLastLineIndent();}
	;

// $>

// $<Function Definition (13)

functionDeclaration
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedWrapInfo=false;
}
    :    {mPrinter.setBindingContext(ASPrettyPrinter.BindingContext_Function);} (conditionalDirAndBindingDecls)? {pushLazyIndent();}{insertCR(false);insertLines(mPrinter.getBlankLinesBeforeFunction());} memberModifiers? F=FUNCTION {emit($F);}
    (funcType=(SET|GET) {emit($funcType);})?
    {pushedWrapInfo=pushWrapInfo(options, true);} 
	(I=IDENTIFIER {emit($I);} | notQuiteReservedWord) formalParameterList (C=COLON {insertWS(mPrinter.getAdvancedSpacesBeforeColonsInFunctionTypes());emit($C);insertWS(mPrinter.getAdvancedSpacesAfterColonsInFunctionTypes());} type)? {popIndent();mIsFunctionDecl=true;}
    {if (pushedWrapInfo) mPrinter.popWrapContext();}
    functionBody 
    ;

functionExpression
		//pop the indent to remove the lazy indent that is added by the surrounding expression.  Then add an indent
		//back at the end so that when the surrounding expression pops it will leave the correct number of indents.  Yuck.
	:   F=FUNCTION {emit($F);pushIndent(false);} (I=IDENTIFIER{emit($I);})? formalParameterList (C=COLON {insertWS(mPrinter.getAdvancedSpacesBeforeColonsInFunctionTypes());emit($C);insertWS(mPrinter.getAdvancedSpacesAfterColonsInFunctionTypes());} type)? {mIsFunctionDecl=false;} {popIndent();} 
			{mPrinter.pushFunctionExpressionStatementIndent();}	functionBody {popIndent();} 
    ;

formalParameterList
@init
{
	WrapOptions options=mPrinter.getMethodDeclWrapOptions();
	boolean pushedFormat=false;
	boolean pushedIndent=false;
	boolean pushedWrapInfo=false;
	int firstParm=0;
}
    :   
		{
			mInFunctionParameterDecl=true;
			pushedFormat=pushFormatType(options, true);
			mPrinter.setInParameterDecl(true);
			pushedWrapInfo=pushWrapInfo(options, true);
		}
		L=LPAREN {insertWS(mPrinter.getSpacesBeforeFormalParameters());}{emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInParameterLists());}
        ( ( {pushedIndent=pushLazyParmIndent(pushedIndent, options.getIndentStyle());} {mPrinter.captureNextTextPosition();} variableDeclaration {firstParm=mPrinter.getLastCapturePosition();} 
            ( 
               C=COMMA 
               {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, firstParm, ASPrettyPrinter.Break_SubType_Parameters);}
               variableDeclaration 
            )* 
            ( C=COMMA  {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, firstParm, ASPrettyPrinter.Break_SubType_Parameters);} formalEllipsisParameter)?
           )
           | {pushedIndent=pushLazyParmIndent(pushedIndent, options.getIndentStyle());} formalEllipsisParameter
        )? 
		R=RPAREN {insertWS(mPrinter.getAdvancedSpacesInsideParensInParameterLists());emit($R);}
        
        {
        	 mPrinter.setInParameterDecl(false);
        	if (pushedWrapInfo)
        		mPrinter.popWrapContext();
	        if (pushedIndent)
    	    	popIndent();
    	    if (pushedFormat)
    	    {
    	    	mPrinter.popFormatMode();
    	    }
    	    mInFunctionParameterDecl=false;
        } 
    ;
    
formalEllipsisParameter
    :   E=ELLIPSIS  {emit($E);insertWS(1);} variableIdentifierDecl
    ;   

functionBody
@init
{
	boolean containsStatements=false;
}
    :   L=LCURLY 
    	{
    		mCodeBlockStack.add(mIsFunctionDecl ? ASPrettyPrinter.BraceContext_functionDecl_code : ASPrettyPrinter.BraceContext_functionExpression_code);
    		leftCurlyNewlineHandler(false);
    		emit($L);pushIndent(true);
    		{mPrinter.addDeclEqualsBlock();}
    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
    		insertLines(mPrinter.getBlankLinesToStartFunctions(), false);
    	} 
    		((statement | functionDeclaration) {containsStatements=true;})* {popIndent();}
    		{if (containsStatements)
    			insertLines(mPrinter.getBlankLinesToEndFunctions(), false);
    		 else
				mPrinter.clearAddedWhitespace();    		 	
    		}
    		{mPrinter.popDeclEqualsBlock();} 
    	R=RCURLY   {insertCR(false);emit($R);popBlockStack();popBlockStack();} 
    ;

// $>

// $<Member Modifiers

memberModifiers
    :   memberModifier+
    ;

//each
//	: {input.LT(1).getText().equals("each")}? I=IDENTIFIER{emit($I);} 
//	;
	
memberModifier
    :   x=(
        DYNAMIC
    |   FINAL
    |   INTERNAL
    |   NATIVE
    |   OVERRIDE
    |   PRIVATE
    |   PROTECTED
    |   PUBLIC
    |   STATIC
    |   IDENTIFIER //this is to handle the case of namespaces, which apparently don't have to be before other modifiers
    ) {emit($x);}
    ;

// $>


// statement

// $<Statement

statement
    :
    	{mStatementCount++;}
    (	{mPrinter.inOther();}{setBlockFlag(true);} blockStatement
    |   {insertStatementCR();}directive
    |   {insertStatementCR();}namespaceDirective
    |   {insertStatementCR();} {pushLazyIndent();}constantVarStatement {popIndent();}
    |   {markBlockFlag();insertLines(mPrinter.getBlankLinesBeforeControlStatement());}tryStatement
    |   {markBlockFlag();} switchStatement
    |   {markBlockFlag();insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} withStatement {popBlockStack();}
    |   {pushLazyIndent();} returnStatement {popIndent();}
    |   {pushLazyIndent();} breakStatement {popIndent();}
    |   {pushLazyIndent();} continueStatement {popIndent();}
    |   {mPrinter.inLoop();}{markBlockFlag();insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} forStatement {popBlockStack();}
    |   {mPrinter.inLoop();}{markBlockFlag();insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} forInStatement {popBlockStack();}
    |   {mPrinter.inLoop();}{markBlockFlag();insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} forEachInStatement {popBlockStack();}
    |   {mPrinter.inLoop();}{markBlockFlag();insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} doWhileStatement {popBlockStack();}
    |   {mPrinter.inLoop();}{markBlockFlag();insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} whileStatement {popBlockStack();}
    |   {mPrinter.inCondition();}{insertLines(mPrinter.getBlankLinesBeforeControlStatement());} ifStatement
    |   {insertStatementCR();} {pushLazyIndent();} variableStatement {popIndent();}{mPrinter.adjustLastLineIndent();}
    |   {pushLazyIndent();} throwStatement {popIndent();}
    |   {insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} labelledStatement {popBlockStack();} 
    |   {pushLazyIndent();}{mPrinter.markDeclEqualsContextChange();} 
	    	{
	    		if (mPrinter.statementNeedsCR(input.LT(1)))
	    			insertStatementCR();
		    	else
		    		insertWS(1);
	    	} 
    		expression semic {popIndent();}{mPrinter.adjustLastLineIndent();}
    |   {if (mPrinter.isEmptyStatementsOnNewLine())insertStatementCR();} emptyStatement
    )
    	{mPrinter.inOther();}
    ;

// $>


// $<Block Statement

blockStatement
    :   ({insertCR(false);} conditionalToken=conditionalCompilerOption)? L=LCURLY 
    	{
    		if (conditionalToken!=null)
    			mCodeBlockStack.add(ASPrettyPrinter.BraceContext_Conditional_code);
    		leftCurlyNewlineHandler(conditionalToken==null); //if we have a conditional setting, then we want to have the option of keeping the brace on the same line
    		emit($L);}{pushIndent(true);
    		{mPrinter.addDeclEqualsBlock();}
    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
    	} 
    	statement* {popIndent();} 
    	{mPrinter.popDeclEqualsBlock();}
    	R=RCURLY {insertCR(false);emit($R);popBlockStack();if (conditionalToken!=null) popBlockStack();}
    ;

// $>

throwStatement
	: 	{mPrinter.markDeclEqualsContextChange();}
		T=THROW 
		{
			if (mPrinter.statementNeedsCR($T))
	    		insertStatementCR();
	    	else
	    		insertWS(1);
		}
		{emit($T);} expression semic
	;

// $<Constant Var Statement

constantVarStatement
    :
    {mInEqualAlignDecl=true;}   
    C=CONST  {emit($C);} variableDeclarationList (S=SEMI{emit($S);})?
    {mInEqualAlignDecl=false;}
    ; 
// $>


useNamespaceDirective
@init {
	boolean pushedIndent=false;
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
 WrapOptions options=mPrinter.getExpressionWrapOptions();
}
	:
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
    	{mPrinter.markDeclEqualsContextChange();}
	U=USE  {emit($U);} 
	N=NAMESPACE  {emit($N);} 
	qualifiedIdentifier (C=COMMA {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} qualifiedIdentifier)* semic
	{
    	if (pushedWrapInfo)
    		mPrinter.popWrapContext();
        if (pushedIndent)
	    	popIndent();
	    if (pushedFormat)
	    {
	    	mPrinter.popFormatMode();
	    }
	}
	;    
// $<UseNamespace Statement

// $<Namespace Directive

namespaceDirective
    :   //(memberModifiers)? //namespace
    {mPrinter.markDeclEqualsContextChange();}
    N=NAMESPACE  {emit($N);}{pushExpressionIndent();} 
    qualifiedIdentifier ( A=ASSIGN  {insertWS(mPrinter.getSpacesAroundAssignment());emit($A);insertWS(mPrinter.getSpacesAroundAssignment());} stringLiteral )? semic {popIndent();}
    ;

// $>


// $<Try Statement(12.14)

tryStatement
    : 
    {mPrinter.markDeclEqualsContextChange();}
    {insertStatementCR();} T=TRY {emit($T);} {pushIndent(false);mCodeBlockStack.add(ASPrettyPrinter.BraceContext_try_code);} blockStatement {popIndent();popBlockStack();}
        ( catchClause+ finallyClause
        | catchClause+
        | finallyClause
        )
    ;

catchClause
	: {if (mPrinter.isCRBeforeCatch()) insertCR(false);}{insertWS(1);} C=CATCH {emit($C);insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());}{pushIndent(false);} L=LPAREN {emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInParameterLists());} variableIdentifierDecl R=RPAREN {insertWS(mPrinter.getAdvancedSpacesInsideParensInParameterLists());emit($R);mCodeBlockStack.add(ASPrettyPrinter.BraceContext_catch_code);} blockStatement {popIndent();popBlockStack();}
    ;

finallyClause
    : {if (mPrinter.isCRBeforeCatch()) insertCR(false);}{insertWS(1);} F=FINALLY {emit($F);}{pushIndent(false);mCodeBlockStack.add(ASPrettyPrinter.BraceContext_finally_code);} blockStatement {popIndent();popBlockStack();}
    ;

// $>

// $<Labelled Statement(12.12)

labelledStatement
    :  I=IDENTIFIER {emit($I);}{pushLabeledIndent();} 
    	C=COLON 
    	{
    		emit($C);
    		insertWS(mPrinter.getSpacesAfterLabel());
    	} 
    	statement 
    	{popIndent();}
    ;

// $>

// $<switch Statement(12.11)

switchStatement
    :
    {mPrinter.markDeclEqualsContextChange();}  
    {insertLines(mPrinter.getBlankLinesBeforeControlStatement());}{insertStatementCR();} 
     S=SWITCH {emit($S);
     pushIndent(false);
     insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());}
     {pushExpressionIndent();} parExpression {popIndent();} 
    	L=LCURLY 
    	{
    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);
    		leftCurlyNewlineHandler(false);
    		emit($L);
    		if (mPrinter.isIndentSwitchCases())
    			pushIndent(true);
    		else
    			mPrinter.pushRelativeIndent(ASPrettyPrinter.BRACE_INDENT, -1);
    		{mPrinter.addDeclEqualsBlock();}
    		mCodeBlockStack.add(ASPrettyPrinter.BraceContext_block_code);
    	} 
    	switchBlockStatementGroup* {popIndent();}
    	{mPrinter.popDeclEqualsBlock();} 
    	R=RCURLY{insertCR(false);emit($R);popIndent();popBlockStack();popBlockStack();} 
    ;
    
///* The change here (switchLabel -> switchLabel+) technically makes this grammar
//   ambiguous; but with appropriately greedy parsing it yields the most
 //  appropriate AST, one in which each group, except possibly the last one, has
 //  labels and statements. */
switchBlockStatementGroup
@init
{
    int statementCount=0;
}
    :   {insertCR(false);} switchLabel {pushIndent(false);} 
    	{mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Switch);statementCount=mStatementCount;}
    	statement* 
         {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Switch, mStatementCount-statementCount);}
    	{popIndent();}{insertCR(false);} breakStatement?
    ;
    
switchLabel
    :   C=CASE {emit($C);} {insertWS(1);} expression O=COLON 
    	{
    	emit($O);
    	insertWS(mPrinter.getSpacesAfterLabel());
    	} 
    |   D=DEFAULT {emit($D);} C=COLON
    		{
    			emit($C);
    			insertWS(mPrinter.getSpacesAfterLabel());
    		} 
    ;

// $>

// $<With statement(12.10)

withStatement
@init
{
	int statementStartInOutput=(-1);
	int statementEndInOutput=(-1);
    int statementCount=0;
}
    :   
    {mPrinter.markDeclEqualsContextChange();}
		W=WITH  {emit($W);statementStartInOutput=mPrinter.getCurrentOutputLength();insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());}{pushExpressionIndent();} L=LPAREN  {emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());} expression  R=RPAREN  {insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());emit($R);statementEndInOutput=mPrinter.getCurrentOutputLength();}{popIndent();} {pushIndent(false);}
    	{mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Loop);
      	 mPrinter.captureStatementStart($W, statementStartInOutput);
    	 mPrinter.captureStatementEnd($R, statementEndInOutput);
    	 statementCount=mStatementCount;
    	} 
    	statement 
         {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Loop, mStatementCount-statementCount);}
    	{popIndent();}
    ;

// $>

// $<Return statment (12.9)

returnStatement
    :   R=RETURN 
    	{
    		if (mPrinter.statementNeedsCR($R))
	    		insertStatementCR();
	    	else
	    		insertWS(1);
    	}
    	{emit($R);} ( {insertWS(1);} expression)? semic 
    ;

// $>


// $<Break statement (12.8)

breakStatement
    :   B=BREAK    
    	{
    		if (mPrinter.statementNeedsCR($B))
    			insertStatementCR();
	    	else
	    		insertWS(1);
    	}
    	{emit($B);} (I=IDENTIFIER{emit($I);})? semic
    ;

// $>


// $<Continue statement (12.7)

continueStatement
    :   C=CONTINUE
    	{
    		if (mPrinter.statementNeedsCR($C))
    			insertStatementCR();
	    	else
	    		insertWS(1);
    	} 
    	{emit($C);} (I=IDENTIFIER{emit($I);})? semic
    ;

// $>


// $<For statement 12.6

forStatement
@init
{
	int statementStartInOutput=(-1);
	int statementEndInOutput=(-1);
    int statementCount=0;
}
    :
    	{mPrinter.markDeclEqualsContextChange();}
		F=FOR {emit($F);statementStartInOutput=mPrinter.getCurrentOutputLength();insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());} {pushExpressionIndent();} L=LPAREN {emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());} forControl R=RPAREN {insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());emit($R);}{popIndent();}{pushIndent(false);statementEndInOutput=mPrinter.getCurrentOutputLength();}
    	{mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Loop);
    	 mPrinter.captureStatementStart($F, statementStartInOutput);
    	 mPrinter.captureStatementEnd($R, statementEndInOutput);
    	 statementCount=mStatementCount;
    	} 
    	statement 
         {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Loop, mStatementCount-statementCount);}
    	{popIndent();}
    ;
    
forInStatement
@init
{
	int statementStartInOutput=(-1);
	int statementEndInOutput=(-1);
    int statementCount=0;
}
    :
    	{mPrinter.markDeclEqualsContextChange();}
		F=FOR {emit($F);statementStartInOutput=mPrinter.getCurrentOutputLength();insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());} {pushExpressionIndent();} L=LPAREN {emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());} forInControl R=RPAREN {insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());emit($R);} {popIndent();} {pushIndent(false);statementEndInOutput=mPrinter.getCurrentOutputLength();}
    	{mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Loop);
    	 mPrinter.captureStatementStart($F, statementStartInOutput);
    	 mPrinter.captureStatementEnd($R, statementEndInOutput);
    	 statementCount=mStatementCount;
    	} 
    	statement 
         {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Loop, mStatementCount-statementCount);}
    	{popIndent();}
    ;  
    
forEachInStatement
@init
{
	int statementStartInOutput=(-1);
	int statementEndInOutput=(-1);
    int statementCount=0;
}
    :
    {mPrinter.markDeclEqualsContextChange();}
       F=FOR {emit($F);statementStartInOutput=mPrinter.getCurrentOutputLength();} {pushExpressionIndent();}
     //   each 
    E=EACH {emit($E);insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());} 
	L=LPAREN {emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());} forInControl R=RPAREN {insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());emit($R);statementEndInOutput=mPrinter.getCurrentOutputLength();}{popIndent();}{pushIndent(false);}
   	{mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Loop);
     mPrinter.captureStatementStart($F, statementStartInOutput);
     mPrinter.captureStatementEnd($R, statementEndInOutput);
     statementCount=mStatementCount;
   	} 
    statement 
     {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Loop, mStatementCount-statementCount);}
    {popIndent();}     
	;
forControl
options {k=3;} // be efficient for common case: for (ID ID : ID) ...
    :   forInit? {insertWS(mPrinter.getSpacesBeforeComma());} semic  {insertWS(mPrinter.getSpacesAfterComma());} expression? {insertWS(mPrinter.getSpacesBeforeComma());}semic {insertWS(mPrinter.getSpacesAfterComma());} forUpdate?
    ;

forInControl
options {k=3;} // be efficient for common case: for (ID ID : ID) ...
    :   forInDecl I=IN {insertWS(1);emit($I);} expression
    ;

forInDecl
    :   leftHandSideExpression
    |   V=VAR {emit($V);} variableDeclarationNoIn
    ;

forInit
    :   V=VAR{emit($V);} variableDeclarationNoInList
    |   expressionNoIn
    ;

forUpdate
    :   expression
    ;

// $>


// $<While statement (12.5)

doWhileStatement
@init
{
	int statementCount=0;
}
    :
    {mPrinter.markDeclEqualsContextChange();}
       D=DO {emit($D);} {pushIndent(false);} 
    	{mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Loop);statementCount=mStatementCount;} 
    	statement 
         {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Loop, mStatementCount-statementCount);}
    	{popIndent();}{insertWS(1);}  
    	{
          if (mPrinter.isCRBeforeWhile() || !mPrinter.didLastStatementHaveBraces()) //add CR if explictly asked for or if there were no statement braces   
              insertCR(false);
    	} 
    	W=WHILE {emit($W);{pushExpressionIndent();}insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());} parExpression semic (S=SEMI{emit($S);})? {popIndent();}
    ;

// $>

// $<While statement (12.5)

whileStatement
@init
{
	int statementStartInOutput=(-1);
	int statementEndInOutput=(-1);
	int statementCount=0;
	Token endToken=null;
}
    :
       {mPrinter.markDeclEqualsContextChange();}
       W=WHILE {emit($W);statementStartInOutput=mPrinter.getCurrentOutputLength();insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());}{pushExpressionIndent();} parExpression {endToken=input.LT(-1);statementEndInOutput=mPrinter.getCurrentOutputLength();popIndent();} {pushIndent(false);} 
    	{mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Loop);
    	 mPrinter.captureStatementStart($W, statementStartInOutput);
    	 mPrinter.captureStatementEnd(endToken, statementEndInOutput);
    	 statementCount=mStatementCount;
    	} 
    	statement 
         {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Loop, mStatementCount-statementCount);}
    	{popIndent();}
    ;
    
// $>



// $<If statement (12.5)

ifStatement
@init 
{
   Token tok=null;
   boolean ifOnSameLine=false;
   boolean wasBlock=false;
   boolean needCloseBrace=false;
   int statementStartInOutput=(-1);
   int statementEndInOutput=(-1);
   int statementCount=0;
   Token endToken=null;
}
    :
    	{mPrinter.markDeclEqualsContextChange();}      
        {
           tok=mPrinter.getLastToken(); 
           //if the previous token was not an else, then insert a CR.  Also if it is an 'else' but the setting says to put the 'if' on a new line
           if (!mPrinter.isKeepElseIfOnSameLine() || (tok==null) || !tok.getText().equals("else"))
           {
           		insertStatementCR();
           }

           if (tok!=null && tok.getText().equals("else"))
           {
           		mPrinter.setElseIfState();
           }
        } 
         I=IF 
         {
              emit($I);
              statementStartInOutput=mPrinter.getCurrentOutputLength();
              ifOnSameLine=mPrinter.getElseIfNeedToLoseIndent();
              if (ifOnSameLine)
                  popIndent();
              insertWS(mPrinter.getSpacesBetweenControlKeywordsAndParens());
         }
         {pushExpressionIndent();} 
         parExpression 
         {endToken=input.LT(-1);statementEndInOutput=mPrinter.getCurrentOutputLength();}
         {popIndent();}
         {pushIndent(false);}
         {addIfElseBlockTracker();setBlockFlag(false);clearBlockFlag();}
         {mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);}
		 {mPrinter.addOpenBrace(input, ASPrettyPrinter.BraceAdd_Conditional);
    	  mPrinter.captureStatementStart($I, statementStartInOutput);
    	  mPrinter.captureStatementEnd(endToken, statementEndInOutput);
    	  statementCount=mStatementCount;
		 }
         statement
         {mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Conditional, mStatementCount-statementCount);}
         {popBlockStack();} 
         {wasBlock=isBlockFlag();popIfElseBlockTracker();}
         {popIndent();}
          
         (options {k=1;}:E=ELSE 
	         {
	          Token tempTok=mPrinter.getLastToken();
	          if (mPrinter.isCRBeforeElse() || !wasBlock)//tempTok==null || !tempTok.getText().equals("}")) 
	              insertCR(false);
	         }
	         {insertWS(1);}
	         {emit($E);} 
	         {pushIndent(false);}{mCodeBlockStack.add(ASPrettyPrinter.BraceContext_controlStatement_code);} 
	         {needCloseBrace=mPrinter.addOpenBraceForElse(input);statementCount=mStatementCount;}
	         {mPrinter.inCondition();}
	         statement 
	         {if (needCloseBrace)
	         	mPrinter.addCloseBrace(input.LT(1), ASPrettyPrinter.BraceAdd_Conditional, mStatementCount-statementCount);}
	         {popBlockStack();}{popIndent();})?
			 {if (ifOnSameLine)
            	pushIndent(false);}
	          
    ;
    
// $>   
    

// $<Empty statement (12.3)

emptyStatement 
    :     S=SEMI {emit($S);} 
    ;

// $>


// $<Variable statement 12.2)

variableStatement
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
	boolean pushedIndent=false;
}
    :
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
        (I=IDENTIFIER {emit($I);})? V=VAR {emit($V);mInEqualAlignDecl=true;} variableDeclaration {mInEqualAlignDecl=false;} ( C=COMMA {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} variableDeclaration )* semic
    	{
    		if (pushedIndent)
    			popIndent();
	   	    if (pushedFormat)
	   	    {
	   	    	mPrinter.popFormatMode();
	   	    }
	   	    if (pushedWrapInfo)
	   	    	mPrinter.popWrapContext();
    	} 
    ;
    
variableDeclarationList
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
	boolean pushedIndent=false;
}
    :
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
         variableDeclaration (  C=COMMA {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} variableDeclaration)*
    	{
    		if (pushedIndent)
    			popIndent();
	   	    if (pushedFormat)
	   	    {
	   	    	mPrinter.popFormatMode();
	   	    }
	   	    if (pushedWrapInfo)
	   	    	mPrinter.popWrapContext();
    	}
    ;
    
variableDeclarationNoInList
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
	boolean pushedIndent=false;
}
    :
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
        variableDeclarationNoIn ( C=COMMA {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} variableDeclarationNoIn)*
    	{
    		if (pushedIndent)
    			popIndent();
	   	    if (pushedFormat)
	   	    {
	   	    	mPrinter.popFormatMode();
	   	    }
	   	    if (pushedWrapInfo)
	   	    	mPrinter.popWrapContext();
    	}
    ;
    
variableDeclaration
@init {
	WrapOptions options=mPrinter.getExpressionWrapOptions();
}
    :   variableIdentifierDecl ( A=ASSIGN 
    	{
    		insertVariableDeclAssignmentWhitespace($A, true);
    		{if (mInEqualAlignDecl) mPrinter.augmentDeclEqualPosition();}
    		wrapEmit($A, mInFunctionParameterDecl ? ASPrettyPrinter.Break_Parameter_Assignment_code : ASPrettyPrinter.Break_Assignment_code);
    		{if (mInEqualAlignDecl) mPrinter.captureDeclEqualPosition();}
    		insertVariableDeclAssignmentWhitespace($A, false);
    	} 
    	assignmentExpression {popIndent();})?
    ;

variableDeclarationNoIn
@init {
	WrapOptions options=mPrinter.getExpressionWrapOptions();
}
    :    variableIdentifierDecl ( A=ASSIGN 
         {
          insertVariableDeclAssignmentWhitespace($A, true);
          wrapEmit($A, ASPrettyPrinter.Break_Assignment_code);
          insertVariableDeclAssignmentWhitespace($A, false);
         } 
         assignmentExpressionNoIn {popIndent();})?
    ;
    
variableIdentifierDecl
	:    identifierLiteral ( C=COLON {insertWS(mPrinter.getAdvancedSpacesBeforeColonsInDeclarations());emit($C);insertWS(mPrinter.getAdvancedSpacesAfterColonsInDeclarations());} type )?
    ;
// $>
    
// $<Type / Type List

type:   qualifiedName | S=STAR {emit($S);} | V=VOID {emit($V);} ;

typeList
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
	boolean pushedIndent=false;
}
    :
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
       type (C=COMMA {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} type)*
    	{
    		if (pushedIndent)
    			popIndent();
	   	    if (pushedFormat)
	   	    {
	   	    	mPrinter.popFormatMode();
	   	    }
	   	    if (pushedWrapInfo)
	   	    	mPrinter.popWrapContext();
    	}
    ; 
// $>
     
standardQualifiedName
	:
	typeSpecifier (D=DOT {wrapEmit($D, ASPrettyPrinter.Break_Other_Connectors_code);} typeSpecifier {popIndent();})*
//	(I=IDENTIFIER {emit($I);} ) (D=DOT {emit($D);} (I=IDENTIFIER{emit($I);} ) )*
	;
	
qualifiedName 
    :   
    	standardQualifiedName (typePostfixSyntax)? 
    ;
    
typePostfixSyntax:
	D=DOT
	{emit($D);} 
//	{wrapEmit($D, ASPrettyPrinter.Break_Other_Connectors_code);} 
	L=LT {emit($L);} (standardQualifiedName | st=STAR {emit($st);}) (typePostfixSyntax)? G=GT {emit($G);}
	//{popIndent();}
	;
    
qualifiedIdentifier
    :   /*{isNotReservedWord(input.LT(1).getText())}?*/
    	I=IDENTIFIER {emit($I);} 
    ;


// Expression

parExpression
@init
{
	boolean pushedWrap=false;
	WrapOptions options=mPrinter.getExpressionWrapOptions();
}
    :
    {pushedWrap=pushWrapInfo(options, true);}
	L=LPAREN  {emit($L);insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());} {pushExpressionIndent();} expression  R=RPAREN {insertWS(mPrinter.getAdvancedSpacesInsideParensInOtherPlaces());emit($R);} {popIndent();}
    {if (pushedWrap) mPrinter.popWrapContext();} 
    ;

expression
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
	boolean pushedIndent=false;
}
    :   
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
    	assignmentExpression (  C=COMMA  {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} assignmentExpression)*
    	{
    		if (pushedIndent)
    			popIndent();
	   	    if (pushedFormat)
	   	    {
	   	    	mPrinter.popFormatMode();
	   	    }
	   	    if (pushedWrapInfo)
	   	    	mPrinter.popWrapContext();
    	}
    ;

expressionNoIn
@init{
	WrapOptions options=mPrinter.getExpressionWrapOptions();
	boolean pushedFormat=false;
	boolean pushedWrapInfo=false;
	boolean pushedIndent=false;
}
    :
    	{pushedFormat=pushFormatType(options, true);
    	 pushedWrapInfo=pushWrapInfo(options, true);
    	}
       assignmentExpressionNoIn (  C=COMMA  {pushedIndent=emitCommaWithSpacingAndCRs(options, $C, pushedIndent, -1, ASPrettyPrinter.Break_SubType_Other);} assignmentExpressionNoIn)*
    	{
    		if (pushedIndent)
    			popIndent();
	   	    if (pushedFormat)
	   	    {
	   	    	mPrinter.popFormatMode();
	   	    }
	   	    if (pushedWrapInfo)
	   	    	mPrinter.popWrapContext();
    	}
    ;

//11.13 Assignment Operators
assignmentExpression
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :  
       {pushedWrapInfo=pushWrapInfo(options, true);} 
      (
      		(leftHandSideExpression  assignmentOperator)=> leftHandSideExpression  assignmentOperator  assignmentExpression
    	| conditionalExpression
       )
       {if (pushedWrapInfo)
	   	    mPrinter.popWrapContext();}
    ;


assignmentExpressionNoIn
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :  {pushedWrapInfo=pushWrapInfo(options, true);}
       (
    	   (leftHandSideExpression  assignmentOperator) => leftHandSideExpression  assignmentOperator  assignmentExpressionNoIn
    	|	conditionalExpressionNoIn
    	)
       {if (pushedWrapInfo)
	   	    mPrinter.popWrapContext();}
    ;

assignmentOperator
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
}
	: op=assignmentOperator_int 
	  {insertWS(mPrinter.getSpacesAroundAssignment());
	   emit($op.start);
	   mPrinter.saveWrapChar($op.start, ASPrettyPrinter.Break_Assignment_code, options.isBeforeAssignmentOperator(), false, -1, "");
	   insertWS(mPrinter.getSpacesAroundAssignment());
	  }
	;
	     
assignmentOperator_int
    : ASSIGN 
//    | MUL_ASSIGN
	| s=STAR a=ASSIGN! {s.setText("*=");}
    | DIV_ASSIGN 
    | MOD_ASSIGN 
    | ADD_ASSIGN 
    | SUB_ASSIGN
    | SHL_ASSIGN
//    | SHR_ASSIGN
//    | SHU_ASSIGN 
/*    | (('<' '<' '=')=> t1='<' t2='<' t3='=' 
        { $t1.getLine() == $t2.getLine() &&
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && 
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
      -> SHL_ASSIGN){ t1.setText("<<=");} */
    |   (('>' '>' '=')=> t1='>' t2='>' t3='='
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && 
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
      -> SHR_ASSIGN) {t1.setText(">>=");}

    | (('>' '>' '>' '=')=> t1='>' t2='>' t3='>' t4='='
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&
          $t3.getLine() == $t4.getLine() && 
          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() }?
      -> SHU_ASSIGN) {t1.setText(">>>=");}
    | AND_ASSIGN 
    | XOR_ASSIGN 
    | OR_ASSIGN
    | LOR_ASSIGN
    | LAND_ASSIGN
    ;

//11.12 Conditional Operator ( ?: )
conditionalExpression
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        logicalORExpression ( Q=QUE  {indentEmit($Q, ASPrettyPrinter.Break_Ternary_code);} assignmentExpression  {popIndent();} C=COLON  {indentEmit($C, ASPrettyPrinter.Break_Ternary_code);} assignmentExpression {popIndent();})?
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;
    
conditionalExpressionNoIn
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        logicalORExpressionNoIn ( Q=QUE {indentEmit($Q, ASPrettyPrinter.Break_Ternary_code);} assignmentExpression  {popIndent();} C=COLON  {indentEmit($C, ASPrettyPrinter.Break_Ternary_code);} assignmentExpression {popIndent();})?
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;    
    
//11.11 Binary Logical Operators
logicalORExpression
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        logicalANDExpression ( L=LOR {indentEmit($L, ASPrettyPrinter.Break_Logical_Ops_code);} logicalANDExpression {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ; 
    
logicalORExpressionNoIn
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        logicalANDExpressionNoIn ( L=LOR {indentEmit($L, ASPrettyPrinter.Break_Logical_Ops_code);} logicalANDExpressionNoIn {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;     
    
logicalANDExpression
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        bitwiseORExpression ( L=LAND {indentEmit($L, ASPrettyPrinter.Break_Logical_Ops_code);} bitwiseORExpression {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;
    
logicalANDExpressionNoIn
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        bitwiseORExpressionNoIn ( L=LAND {indentEmit($L, ASPrettyPrinter.Break_Logical_Ops_code);} bitwiseORExpressionNoIn {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;    
    
//11.10 Binary Bitwise Operators
bitwiseORExpression
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        bitwiseXORExpression ( O=OR {indentEmit($O, ASPrettyPrinter.Break_Arithmetic_Ops_code);} bitwiseXORExpression {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;
    
bitwiseORExpressionNoIn
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        bitwiseXORExpressionNoIn ( O=OR {indentEmit($O, ASPrettyPrinter.Break_Arithmetic_Ops_code);} bitwiseXORExpressionNoIn {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;    
    
bitwiseXORExpression
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        bitwiseANDExpression ( x=XOR {indentEmit($x, ASPrettyPrinter.Break_Arithmetic_Ops_code);} bitwiseANDExpression {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;
    
bitwiseXORExpressionNoIn
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        bitwiseANDExpressionNoIn ( x=XOR {indentEmit($x, ASPrettyPrinter.Break_Arithmetic_Ops_code);} bitwiseANDExpressionNoIn {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;    

bitwiseANDExpression
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        equalityExpression ( A=AND {indentEmit($A, ASPrettyPrinter.Break_Arithmetic_Ops_code);} equalityExpression {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;
    
bitwiseANDExpressionNoIn
@init {
    WrapOptions options=mPrinter.getExpressionWrapOptions();
    boolean pushedWrapInfo=false;
}
    :   {pushedWrapInfo=pushWrapInfo(options, true);}
        equalityExpressionNoIn ( A=AND {indentEmit($A, ASPrettyPrinter.Break_Arithmetic_Ops_code);} equalityExpressionNoIn {popIndent();})*
        {if (pushedWrapInfo) mPrinter.popWrapContext();}
    ;    

//11.9 Equality Operators
equalityExpression
    :   
        relationalExpression ( eq=(EQ|NEQ|SAME|NSAME) relationalExpression )*
    ;
    
equalityExpressionNoIn
    :  
        relationalExpressionNoIn ( eq=(EQ|NEQ|SAME|NSAME)   relationalExpressionNoIn )*

    ;    

//11.8 Relational Operators
relationalExpression
    :   
        shiftExpression 
    	(
	    	( g=GT (assign=ASSIGN)? 
		        {if (assign!=null)
		         {
		         	g.setText(">=");
		         	g.setType(GTE);
		         }

		        } 
	          | eq=(IN|LT|LTE|INSTANCEOF|IS|AS)
	        )  
	        shiftExpression 
        )*

    ;
    
relationalExpressionNoIn
    :   
        shiftExpression 
    	(
	    	( g=GT (assign=ASSIGN)? 
		        {if (assign!=null)
		         {
		         	g.setText(">=");
		         	g.setType(GTE);
		         }
		        } 
	          | eq=(LT|LTE|INSTANCEOF|IS|AS) 
	        )  
	        shiftExpression 
        )*
    ;

//11.7 Bitwise Shift Operators
shiftExpression
    :   
        additiveExpression ( 
    		(
    			t1=SHL
    			/*(('<' '<' )=> t1='<' t2='<' 
        		{$t1.getLine() == $t2.getLine() &&
          		$t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
      			-> SHL) {t1.setText("<<");}*/
      		|	(('>' '>')=> t1='>' t2='>'
        		{ $t1.getLine() == $t2.getLine() && 
          			$t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
      			-> SHR) {t1.setText(">>");}
		    | 	(('>' '>' '>')=> t1='>' t2='>' t3='>'
        		{ $t1.getLine() == $t2.getLine() && 
          			$t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&
          			$t2.getLine() == $t3.getLine() && 
          			$t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
      			-> SHU) {t1.setText(">>>");}
    		) 
    		 additiveExpression
    	)*
    ;

//11.6 Additive Operators
additiveExpression
    :  
        multiplicativeExpression ( op=(PLUS|SUB)  multiplicativeExpression )*
    ;

//11.5 Multiplicative Operators
multiplicativeExpression

    : 
        unaryExpression ( op=(STAR|DIV|MOD) unaryExpression )*
    ;

//11.4 Unary Operators
unaryExpression
    :   postfixExpression
    |  op=(NOT | INV)  unaryExpression
    |   unaryOp postfixExpression
    
    
    ;

unaryOp
    :   op=(DELETE | VOID | TYPEOF | INC | DEC | PLUS | SUB | INV | NOT)
    ;


//11.3 Postfix Expressions
postfixExpression
    :   leftHandSideExpression postfixOp?
    ;
    
postfixOp
    :   op=(INC | DEC)
    ;

//These rules came from a grammar by Patrick Hulsmeijer, posted to the ANTLR examples
memberExpression
	: primaryExpression
	| functionExpression
	| newExpression
	;

newExpression
	: N=NEW   primaryExpression
	;

//11.2
leftHandSideExpression
    : 
    memberExpression 
    (
      arguments
      | L=LBRACK  expression R=RBRACK
//      | D=DOT {wrapEmit($D, ASPrettyPrinter.Break_Function_Calls_code);} (eitherIdentifier op=XML_NS_OP {wrapEmit($op, ASPrettyPrinter.Break_Other_Connectors_code);} {popIndent();})? eitherIdentifier {popIndent();}
//      | D=DOT {wrapEmit($D, ASPrettyPrinter.Break_Function_Calls_code);} eitherIdentifier {popIndent();}
      | E=XML_ELLIPSIS eitherIdentifier 
      | D=DOT ( eitherIdentifier |  parExpression) 
      | typePostfixSyntax
      | op=XML_NS_OP  expression
    )*  // | x=XML_AT {emit($x);}
    ;
    
eitherIdentifier
	: I=IDENTIFIER 
	 | xmlPropertyIdentifier
	 | allKeywords
	;
	
typeSpecifier:
	I=IDENTIFIER | notQuiteReservedWord | I=INTERNAL  | D=DEFAULT 
	;
	
notQuiteReservedWord
	: 
	word=(TO | NATIVE | EACH | GET | SET | NAMESPACE | DYNAMIC | FINAL | OVERRIDE | STATIC ) 
	;

allKeywords
	: (reservedWord | notQuiteReservedWord)
	;
reservedWord
	:
    word=(AS          
    | BREAK           
    | CASE  
    | CATCH           
    | CLASS 
    | CONST
    | CONTINUE
    | DEFAULT
    | DELETE
    | DO
    | ELSE
    | EXTENDS
    | FALSE
    | FINALLY
    | FOR
    | FUNCTION
    | IF
	| IMPLEMENTS
    | IMPORT          
    | IN
    | INSTANCEOF      
    | INTERFACE
    | INTERNAL        
    | IS
//    | NATIVE          
    | NEW
    | NULL            
    | PACKAGE  
    | PRIVATE         
    | PROTECTED
    | PUBLIC          
    | RETURN
    | SUPER           
    | SWITCH
    | THIS            
    | THROW
	| TRUE
    | TRY             
    | TYPEOF
    | USE             
    | VAR
    | VOID            
    | WHILE
    | WITH 
//    | EACH            
// 	| GET
//    | SET             
//    | NAMESPACE
    | INCLUDE         
//    | DYNAMIC
//    | FINAL           
//    | OVERRIDE
//    | STATIC)
       )     
	;
	
arguments
	: 
	L=LPAREN 
	  (  assignmentExpression 
	        (  
		        C=COMMA 
		        assignmentExpression 
	        )* 
	  )? 
	R=RPAREN

	;

/*suffix helper rule*/ 
suffix
    :    indexSuffix | propertyReferenceSuffix
    ;
/*code like [i] or [1]*/     
indexSuffix             
    :    L=LBRACK  expression  R=RBRACK
    ;
    
propertyReferenceSuffix
    :    D=DOT   I=IDENTIFIER
    |    D=DOT   xmlPropertyIdentifier 
    |    D=DOT   /*it's a xml only reference match*/
    ;

//11.1 Primary Expression
primaryExpression  
    :    primaryExpressionHelper
    ;
    
/* derived from ECMA-262 basicly. but add super alternative*/
primaryExpressionHelper
    :   T=THIS 
    |   S=SUPER
    |   literal  
    |   arrayLiteral // ARRAY_LITERAL
    |   objectLiteral  // OBJECT_LITERAL
    |   (identifierLiteral x=XML_NS_OP )? identifierLiteral 
    |   xmlPrimaryExpression
    |   parExpression // PAR_EXPRESSION
    |   l=LT  type g=GT  (arrayLiteral)? //Vector initializer with optional array data
    ;

//11.1.5 Object Initialiser
objectLiteral
    :   L=LCURLY  propertyNameAndValueList? R=RCURLY 
    ;

propertyNameAndValueList
    :
       propertyNameAndValue 
    ;

propertyNameAndValue
    :   propertyName C=COLON 
    		assignmentExpression
    ;

propertyName
    :   identifierLiteral 
    |   stringLiteral 
    |   numericLiteral 
    ;

//11.1.4 Array Initialiser
arrayLiteral
    :   L=LBRACK  elementList? R=RBRACK
    ;

elementList
    :
         assignmentExpression 
    	(
    		COMMA 
    		assignmentExpression
    	)* (COMMA )? //allow extra comma on end, because it's apparently tolerated

    ;
