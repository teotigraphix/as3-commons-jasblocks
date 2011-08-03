/*
 * ASDoc.g
 * 
 * Copyright (c) 2007 David Holroyd
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

grammar ASDoc;


options {
	k = 4;
	output=AST;
	ASTLabelType=LinkedListTree;
	language=Java;
}

tokens {
	ASDOC;
	INLINE_TAG;
	DESCRIPTION;
	PARA_TAG;
	TEXT_LINE;
	VIRTUAL_WS;
}

@parser::header {
package org.as3commons.asblocks.parser.antlr.asdoc;

import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.antlr.runtime.MismatchedTokenException;
import org.as3commons.asblocks.impl.TokenBuilder;
}

@lexer::header {
package org.as3commons.asblocks.parser.antlr.asdoc;
}

// disable standard error handling; be strict
@rulecatch { }

@parser::members {
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

}
@lexer::members {
	//protected void mismatch(IntStream input, int ttype, BitSet follow)
	//	throws RecognitionException
	//{
	//	throw new MismatchedTokenException(ttype, input);
	//}
}

commentBody
	:	d=description {placeholder($d.tree);}
		paragraphTag*
		EOF
		-> ^(ASDOC description paragraphTag*)
	;


description
	:	textLine*
		-> ^(DESCRIPTION textLine*)
	;

textLine
	:	textLineStart
		textLineContent*
		(NL | EOF!)
	|	NL
	;

textLineStart
	:	(LBRACE ATWORD)=> inlineTag
	|	WORD | STARS | WS | LBRACE | RBRACE | AT
	;

textLineContent
	:	(LBRACE ATWORD)=> inlineTag
	|	WORD | STARS | WS | LBRACE | RBRACE | AT | ATWORD
	;

inlineTag
	:	LBRACE ATWORD inlineTagContent* RBRACE
		-> ^(INLINE_TAG ATWORD inlineTagContent*)
	;

inlineTagContent
	:	WORD | STARS | WS | AT | NL
	;

paragraphTag
	:	ATWORD paragraphTagTail
		-> ^(PARA_TAG ATWORD paragraphTagTail)
	;

paragraphTagTail
	:	textLineContent*
		(	NL textLine*
		|	EOF
		)
		-> textLineContent* NL? textLine*
	;

STARS:		'*'+;

LBRACE:		'{';
RBRACE:		'}';
AT:		'@';

WS:		(' ' | '\t')+;

NL
options {
	k=*;
}
	:		('\r\n' | '\r' | '\n') WS? (STARS (' ' | '\t')?)?;

ATWORD:		'@' WORD WORD_TAIL;

WORD:		~('\n' | ' ' | '\r' | '\t' | '{' | '}' | '@')
		WORD_TAIL;

fragment
WORD_TAIL:	(~('\n' | ' ' | '\r' | '\t' | '{' | '}'))*;
