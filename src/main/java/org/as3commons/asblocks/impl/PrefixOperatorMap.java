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
import org.as3commons.asblocks.dom.PrefixOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class PrefixOperatorMap
{
	private final static Map<Integer, PrefixOperator> OPERATORS_BY_TYPE = 
		new HashMap<Integer, PrefixOperator>();
	private final static Map<PrefixOperator, LinkedListToken> TYPES_BY_OPERATOR = 
		new HashMap<PrefixOperator, LinkedListToken>();	
	
	static {
		mapOp(AS3Parser.UNARY_MINUS, "-", PrefixOperator.NEG);
		mapOp(AS3Parser.LNOT, "!", PrefixOperator.NOT);
		mapOp(AS3Parser.UNARY_PLUS, "+", PrefixOperator.POS);
		mapOp(AS3Parser.PRE_DEC, "--", PrefixOperator.PREDEC);
		mapOp(AS3Parser.PRE_INC, "++", PrefixOperator.PREINC);
	}	
	
	PrefixOperatorMap()
	{
	}
	
	private static void mapOp(int type, String text, PrefixOperator operator) {
		OPERATORS_BY_TYPE.put(new Integer(type), operator);
		TYPES_BY_OPERATOR.put(operator, new LinkedListToken(type, text));
	}	
	
	public static PrefixOperator opFromType(int type)
	{
		PrefixOperator op = (PrefixOperator) OPERATORS_BY_TYPE.get(new Integer(type));
		if (op == null)
			throw new IllegalArgumentException("No operator for token-type " + ASTUtils.tokenName(type));
		return op;
	}

	public static void initializeFromOp(PrefixOperator operator,
										Token tok)
	{
		LinkedListToken type = (LinkedListToken) TYPES_BY_OPERATOR.get(operator);
		if (type == null)
			throw new IllegalArgumentException("No operator for Op " + operator);
		
		tok.setType(type.getType());
		tok.setText(type.getText());
	}
}
