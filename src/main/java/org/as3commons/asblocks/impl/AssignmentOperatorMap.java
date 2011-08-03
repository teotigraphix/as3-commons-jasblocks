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
import org.as3commons.asblocks.dom.AssignmentOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class AssignmentOperatorMap
{
	private final static Map<Integer, AssignmentOperator> OPERATORS_BY_TYPE = 
		new HashMap<Integer, AssignmentOperator>();
	private final static Map<AssignmentOperator, LinkedListToken> TYPES_BY_OPERATOR = 
		new HashMap<AssignmentOperator, LinkedListToken>();	
	
	static {
		mapOp(AS3Parser.PLUS_ASSIGN, "+=", AssignmentOperator.ADD_ASSIGN);
		mapOp(AS3Parser.ASSIGN, "=", AssignmentOperator.ASSIGN);
		mapOp(AS3Parser.BAND_ASSIGN, "&=", AssignmentOperator.BITAND_ASSIGN);
		mapOp(AS3Parser.BOR_ASSIGN, "|=", AssignmentOperator.BITOR_ASSIGN);
		mapOp(AS3Parser.BXOR_ASSIGN, "^=", AssignmentOperator.BITXOR_ASSIGN);
		mapOp(AS3Parser.DIV_ASSIGN, "/=", AssignmentOperator.DIV_ASSIGN);
		mapOp(AS3Parser.MOD_ASSIGN, "%=", AssignmentOperator.MOD_ASSIGN);
		mapOp(AS3Parser.STAR_ASSIGN, "*=", AssignmentOperator.MUL_ASSIGN);
		mapOp(AS3Parser.SL_ASSIGN, "<<=", AssignmentOperator.SL_ASSIGN);
		mapOp(AS3Parser.SR_ASSIGN, ">>=", AssignmentOperator.SR_ASSIGN);
		mapOp(AS3Parser.BSR_ASSIGN, ">>=", AssignmentOperator.SRU_ASSIGN);
		mapOp(AS3Parser.MINUS_ASSIGN, "-=", AssignmentOperator.SUB_ASSIGN);
	}	
	
	AssignmentOperatorMap()
	{
	}
	
	private static void mapOp(int type, String text, AssignmentOperator operator) {
		OPERATORS_BY_TYPE.put(new Integer(type), operator);
		TYPES_BY_OPERATOR.put(operator, new LinkedListToken(type, text));
	}	
	
	public static AssignmentOperator opFromType(int type)
	{
		AssignmentOperator op = (AssignmentOperator) OPERATORS_BY_TYPE.get(new Integer(type));
		if (op == null)
			throw new IllegalArgumentException("No operator for token-type " + ASTUtils.tokenName(type));
		return op;
	}

	public static void initialiseFromOp(AssignmentOperator operator,
										Token tok)
	{
		LinkedListToken type = (LinkedListToken) TYPES_BY_OPERATOR.get(operator);
		if (type == null)
			throw new IllegalArgumentException("No operator for Op " + operator);
		
		tok.setType(type.getType());
		tok.setText(type.getText());
	}
}
