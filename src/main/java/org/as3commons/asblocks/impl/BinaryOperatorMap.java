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

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.Token;
import org.as3commons.asblocks.dom.BinaryOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class BinaryOperatorMap
{
	private final static Map<Integer, BinaryOperator> OPERATORS_BY_TYPE = 
		new HashMap<Integer, BinaryOperator>();
	private final static Map<BinaryOperator, LinkedListToken> TYPES_BY_OPERATOR = 
		new HashMap<BinaryOperator, LinkedListToken>();	
	
	static {
		mapOp(AS3Parser.PLUS, "+", BinaryOperator.ADD);
		mapOp(AS3Parser.LAND, "&&", BinaryOperator.AND);
		mapOp(AS3Parser.BAND, "&", BinaryOperator.BITAND);
		mapOp(AS3Parser.BOR, "|", BinaryOperator.BITOR);
		mapOp(AS3Parser.BXOR, "^", BinaryOperator.BITXOR);
		mapOp(AS3Parser.DIV, "/", BinaryOperator.DIV);
		mapOp(AS3Parser.EQUAL, "==", BinaryOperator.EQ);
		mapOp(AS3Parser.GE, ">=", BinaryOperator.GE);
		mapOp(AS3Parser.GT, ">", BinaryOperator.GT);
		mapOp(AS3Parser.LE, "<=", BinaryOperator.LE);
		mapOp(AS3Parser.LT, "<", BinaryOperator.LT);
		mapOp(AS3Parser.MOD, "%", BinaryOperator.MOD);
		mapOp(AS3Parser.MULT, "*", BinaryOperator.MUL);
		mapOp(AS3Parser.NOT_EQUAL, "!=", BinaryOperator.NE);
		mapOp(AS3Parser.LOR, "||", BinaryOperator.OR);
		mapOp(AS3Parser.SL, "<<", BinaryOperator.SL);
		mapOp(AS3Parser.SR, ">>", BinaryOperator.SR);
		mapOp(AS3Parser.BSR, ">>>", BinaryOperator.SRU);
		mapOp(AS3Parser.MINUS, "-", BinaryOperator.SUB);
	}	
	
	BinaryOperatorMap()
	{
	}
	
	private static void mapOp(int type, String text, BinaryOperator operator) {
		OPERATORS_BY_TYPE.put(new Integer(type), operator);
		TYPES_BY_OPERATOR.put(operator, new LinkedListToken(type, text));
	}	
	
	public static BinaryOperator opFromType(int type)
	{
		BinaryOperator op = (BinaryOperator) OPERATORS_BY_TYPE.get(new Integer(type));
		if (op == null)
			throw new IllegalArgumentException("No operator for token-type " + ASTUtils.tokenName(type));
		return op;
	}

	public static void initializeFromOp(BinaryOperator operator,
										Token tok)
	{
		LinkedListToken type = (LinkedListToken) TYPES_BY_OPERATOR.get(operator);
		if (type == null)
			throw new IllegalArgumentException("No operator for Op " + operator);
		
		tok.setType(type.getType());
		tok.setText(type.getText());
	}
}
