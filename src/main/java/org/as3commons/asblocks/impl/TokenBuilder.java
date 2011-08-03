////////////////////////////////////////////////////////////////////////////////
// Copyright 2011 Michael Schmalle - Teoti Graphix, LLC
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
// http://www.apache.org/licenses/LICENSE-2.0 
// 
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and 
// limitations under the License
// 
// Author: Michael Schmalle, Principal Architect
// mschmalle at teotigraphix dot com
////////////////////////////////////////////////////////////////////////////////

package org.as3commons.asblocks.impl;

import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.PlaceholderLinkedListToken;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class TokenBuilder
{
	private TokenBuilder()
	{
	}

	public static LinkedListToken newToken(int type, String text)
	{
		return new LinkedListToken(type, text);
	}

	public static LinkedListToken newNewline()
	{
		LinkedListToken nl = newToken(AS3Parser.EOL, "\n");
		nl.setChannel(AS3Parser.HIDDEN);
		return nl;
	}

	public static LinkedListToken newSpace()
	{
		return newWhiteSpace(" ");
	}

	public static LinkedListToken newWhiteSpace(String indentStr)
	{
		LinkedListToken ws = newToken(AS3Parser.WS, indentStr);
		ws.setChannel(AS3Parser.HIDDEN);
		return ws;
	}

	//public static LinkedListToken newASDocWhiteSpace(String value)
	//{
	//	LinkedListToken ws = newToken(ASDocParser.VIRTUAL_WS, value);
	//	ws.setChannel(ASDocParser.HIDDEN);
	//	return ws;
	//}
	
	public static LinkedListToken newClass()
	{
		return newToken(AS3Parser.CLASS, "class");
	}

	public static LinkedListToken newVar()
	{
		return newToken(AS3Parser.VAR, "var");
	}

	public static LinkedListToken newComma()
	{
		return newToken(AS3Parser.COMMA, ",");
	}

	public static LinkedListToken newColon()
	{
		return newToken(AS3Parser.COLON, ":");
	}

	public static LinkedListToken newSLComment(String text)
	{
		return newToken(AS3Parser.SL_COMMENT, text);
	}

	public static LinkedListToken newLParen()
	{
		return newToken(AS3Parser.LPAREN, "(");
	}

	public static LinkedListToken newSemi()
	{
		return newToken(AS3Parser.SEMI, ";");
	}

	public static LinkedListToken newRParen()
	{
		return newToken(AS3Parser.RPAREN, ")");
	}

	public static LinkedListToken newIn()
	{
		return newToken(AS3Parser.IN, "in");
	}

	public static LinkedListToken newWhile()
	{
		return newToken(AS3Parser.WHILE, "while");
	}

	public static LinkedListToken newMLComment(String text)
	{
		return newToken(AS3Parser.ML_COMMENT, text);
	}

	public static LinkedListToken newEach()
	{
		return newToken(AS3Parser.EACH, "each");
	}

	public static LinkedListToken newConst()
	{
		return newToken(AS3Parser.CONST, "const");
	}

	public static LinkedListToken newInterface()
	{
		return newToken(AS3Parser.INTERFACE, "interface");
	}

	public static LinkedListToken newFunction()
	{
		return newToken(AS3Parser.FUNCTION, "function");
	}

	public static LinkedListToken newPlaceholder(LinkedListTree held)
	{
		return new PlaceholderLinkedListToken(held);
	}

	public static LinkedListToken newPlus()
	{
		return newToken(AS3Parser.PLUS, "+");
	}

	public static LinkedListToken newAnd()
	{
		return newToken(AS3Parser.LAND, "&&");
	}

	public static LinkedListToken newBitAnd()
	{
		return newToken(AS3Parser.BAND, "&");
	}

	public static LinkedListToken newBitOr()
	{
		return newToken(AS3Parser.BOR, "|");
	}

	public static LinkedListToken newBitXor()
	{
		return newToken(AS3Parser.BXOR, "^");
	}

	public static LinkedListToken newDiv()
	{
		return newToken(AS3Parser.DIV, "/");
	}

	public static LinkedListToken newEquals()
	{
		return newToken(AS3Parser.EQUAL, "==");
	}

	public static LinkedListToken newGreaterEquals()
	{
		return newToken(AS3Parser.GE, ">=");
	}

	public static LinkedListToken newGreater()
	{
		return newToken(AS3Parser.GT, ">");
	}

	public static LinkedListToken newLessEquals()
	{
		return newToken(AS3Parser.LE, "<=");
	}

	public static LinkedListToken newLess()
	{
		return newToken(AS3Parser.LT, "<");
	}

	public static LinkedListToken newModulo()
	{
		return newToken(AS3Parser.MOD, "%");
	}

	public static LinkedListToken newStar()
	{
		return newToken(AS3Parser.STAR, "*");
	}

	public static LinkedListToken newNotEquals()
	{
		return newToken(AS3Parser.NOT_EQUAL, "!=");
	}

	public static LinkedListToken newOr()
	{
		return newToken(AS3Parser.LOR, "||");
	}

	public static LinkedListToken newShiftLeft()
	{
		return newToken(AS3Parser.SL, "<<");
	}

	public static LinkedListToken newShiftRight()
	{
		return newToken(AS3Parser.SR, ">>");
	}

	public static LinkedListToken newShiftRightUnsigned()
	{
		return newToken(AS3Parser.BSR, ">>>");
	}

	public static LinkedListToken newMinus()
	{
		return newToken(AS3Parser.MINUS, "-");
	}

	public static LinkedListToken newPreDec()
	{
		return newToken(AS3Parser.PRE_DEC, "--");
	}

	public static LinkedListToken newPreInc()
	{
		return newToken(AS3Parser.PRE_INC, "++");
	}

	public static LinkedListToken newNot()
	{
		return newToken(AS3Parser.LNOT, "!");
	}

	public static LinkedListToken newPostDec()
	{
		return newToken(AS3Parser.POST_DEC, "--");
	}

	public static LinkedListToken newPostInc()
	{
		return newToken(AS3Parser.POST_INC, "++");
	}

	public static LinkedListToken newLBrack()
	{
		return newToken(AS3Parser.LBRACK, "[");
	}

	public static LinkedListToken newRBrack()
	{
		return newToken(AS3Parser.RBRACK, "]");
	}

	public static LinkedListToken newAssign()
	{
		return newToken(AS3Parser.ASSIGN, "=");
	}

	public static LinkedListToken newAddAssign()
	{
		return newToken(AS3Parser.PLUS_ASSIGN, "+=");
	}

	public static LinkedListToken newBitAndAssign()
	{
		return newToken(AS3Parser.BAND_ASSIGN, "&=");
	}

	public static LinkedListToken newBitOrAssign()
	{
		return newToken(AS3Parser.BOR_ASSIGN, "|=");
	}

	public static LinkedListToken newBitXorAssign()
	{
		return newToken(AS3Parser.BXOR_ASSIGN, "^=");
	}

	public static LinkedListToken newDivAssign()
	{
		return newToken(AS3Parser.DIV_ASSIGN, "/=");
	}

	public static LinkedListToken newModAssign()
	{
		return newToken(AS3Parser.MOD_ASSIGN, "%=");
	}

	public static LinkedListToken newMulAssign()
	{
		return newToken(AS3Parser.STAR_ASSIGN, "*=");
	}

	public static LinkedListToken newSLAssign()
	{
		return newToken(AS3Parser.SL_ASSIGN, "<<=");
	}

	public static LinkedListToken newSRAssign()
	{
		return newToken(AS3Parser.SR_ASSIGN, ">>=");
	}

	public static LinkedListToken newSRUAssign()
	{
		return newToken(AS3Parser.BSR_ASSIGN, ">>>=");
	}

	public static LinkedListToken newSubAssign()
	{
		return newToken(AS3Parser.MINUS_ASSIGN, "-=");
	}

	public static LinkedListToken newDot()
	{
		return newToken(AS3Parser.DOT, ".");
	}

	public static LinkedListToken newQuestion()
	{
		return newToken(AS3Parser.QUESTION, "?");
	}

	public static LinkedListToken newE4XDescendant()
	{
		return newToken(AS3Parser.E4X_DESC, "..");
	}

	public static LinkedListToken newAt()
	{
		return newToken(AS3Parser.E4X_ATTRI, "@");
	}

	public static LinkedListToken newMult()
	{
		return newToken(AS3Parser.MULT, "*");
	}

	public static LinkedListToken newDefault()
	{
		return newToken(AS3Parser.DEFAULT, "default");
	}

	public static LinkedListToken newXml()
	{
		return newToken(-2, "xml");
	}

	public static LinkedListToken newNamespace()
	{
		return newToken(AS3Parser.NAMESPACE, "namespace");
	}
}
