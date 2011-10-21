/*
 * E4X.g
 * 
 * Copyright (c) 2006 David Holroyd
 * Copyright (c) 2010-2011 Michael Schmalle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grammar E4X;

options {
	k = 2;
	output=AST;
	ASTLabelType=LinkedListTree;
	language=Java;
}

tokens {
	COMPILATION_UNIT;
	XML_ROOT_ELEMENT;
	XML_EMPTY_ELEMENT;
	XML_ELEMENT;
	XML_ELEMENT_CONTENT;
	XML_TAG_CONTENT;
	XML_ATTRIBUTE;
	XML_LIST;
}

@parser::header {
package org.as3commons.asblocks.parser.antlr.e4x;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
}

@lexer::header {
package org.as3commons.asblocks.parser.antlr.e4x;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
}

// disable standard error handling; be strict
@rulecatch { }

@parser::members {
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
}

// see http://www.ecma-international.org/publications/standards/Ecma-357.htm


compilationUnit
	:	xmlPrimary
		-> ^( COMPILATION_UNIT xmlPrimary )
	;

xmlPrimary
	:	( xmlInitialiser | xmlListInitialiser )
		-> ^( XML_ROOT_ELEMENT xmlInitialiser xmlListInitialiser? )
	;

xmlInitialiser
	:	xmlMarkup* xmlElement
	;

xmlListInitialiser
	:	'<>' xmlElementContent* '</>'
		-> ^(XML_LIST xmlElementContent*)
	;

xmlMarkup
	:	XML_COMMENT
	|	XML_CDATA
	|	XML_PI
	;

xmlElement
	:	(XML_LCHEVRON xmlTagContent -> xmlTagContent)
		(
			RCLOSE 
			-> ^(XML_EMPTY_ELEMENT $xmlElement)
			|
			XML_RCHEVRON xmlElementContent* LCLOSE xmlTagName XML_RCHEVRON
			-> ^(XML_ELEMENT $xmlElement ^( XML_ELEMENT_CONTENT xmlElementContent* ) )
		)
	;

xmlTagContent
	:	xmlTagName xmlAttributes?
		-> ^( XML_TAG_CONTENT xmlTagName xmlAttributes? )
	;

xmlTagName
	:	//xmlEmbeddedExpression
	//|	
	XML_NAME
	;
/*
xmlEmbeddedExpression
	:	'{' expression '}' -> expression
	;
*/
// TODO: embed the as3 parser here!
expression
	:
		(
			xmlText
			/*|
			xmlEmbeddedExpression*/
		)+
	;

xmlText
	:	XML_TEXT | XML_NAME | XML_ATTRIBUTE_VALUE | '=' | WS | EOL
	;



xmlAttributes
	:	(
			//xmlEmbeddedExpression
			//|
			xmlAttribute
		)+
	;

xmlAttribute
	:	XML_NAME '='  xmlAttributeValue
		-> ^(XML_ATTRIBUTE XML_NAME xmlAttributeValue)
	;

xmlAttributeValue
	:	//xmlEmbeddedExpression
	//|	
	XML_ATTRIBUTE_VALUE
		;
/* xmlEmbeddedExpression */
xmlElementContent
	:	
		xmlMarkup
	|	xmlText
	|	xmlElement
	;



XML_LCHEVRON		:	'<';
XML_RCHEVRON		:	'>';

LCLOSE 	:	 '</';
RCLOSE 	:	 '/>';

//XML_WS			:	( WS | EOL )+;

// whitespace -- ignored
WS	:	(
			' '
		|	'\t'
		|	'\f'
		)+
		{$channel=HIDDEN;}
	;

EOL	
	:	(
			'\r' '\n'  	// DOS
		|	'\r'    	// Mac
		|	'\n'    	// Unix
		)
		{$channel=HIDDEN;}
	;

XML_NAME
	:	XML_NAME_START XML_NAME_PART*;


XML_ATTRIBUTE_VALUE
	:	'\'' ( options {greedy=false;} : . )* '\''
	|	'"' ( options {greedy=false;} : . )* '"'
	;

XML_PI			:	'<?' ( options {greedy=false;} : . )* '?>';

// TODO: exclude the sequence '--' from being allowed,
XML_COMMENT		:	'<!--' ( options {greedy=false;} : . )* '-->'
			{$channel=HIDDEN;} ;

XML_CDATA		:	'<![CDATA[' ( options {greedy=false;} : . )* ']]>';

fragment XML_NAME_START	:	UNICODE_LETTER | '_' | ':';
fragment XML_NAME_PART	:	UNICODE_LETTER | UNICODE_DIGIT | '.' | '-' | '_' | ':';

// TODO: and the rest of unicode?
fragment UNICODE_LETTER	:	'a'..'z' | 'A'..'Z';
fragment UNICODE_DIGIT	:	'0'..'9';

XML_TEXT
	:	(~(XML_LCHEVRON /*| '{'*/))
	;
