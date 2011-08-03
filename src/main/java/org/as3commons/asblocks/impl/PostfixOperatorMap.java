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
import org.as3commons.asblocks.dom.PostfixOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class PostfixOperatorMap
{
	private final static Map<Integer, PostfixOperator> OPERATORS_BY_TYPE = 
		new HashMap<Integer, PostfixOperator>();
	private final static Map<PostfixOperator, LinkedListToken> TYPES_BY_OPERATOR = 
		new HashMap<PostfixOperator, LinkedListToken>();	
	
	static {
		mapOp(AS3Parser.POST_DEC, "--", PostfixOperator.POSTDEC);
		mapOp(AS3Parser.POST_INC, "++", PostfixOperator.POSTINC);
	}	
	
	PostfixOperatorMap()
	{
	}
	
	private static void mapOp(int type, String text, PostfixOperator operator) {
		OPERATORS_BY_TYPE.put(new Integer(type), operator);
		TYPES_BY_OPERATOR.put(operator, new LinkedListToken(type, text));
	}	
	
	public static PostfixOperator opFromType(int type)
	{
		PostfixOperator op = (PostfixOperator) OPERATORS_BY_TYPE.get(new Integer(type));
		if (op == null)
			throw new IllegalArgumentException("No operator for token-type " + ASTUtils.tokenName(type));
		return op;
	}

	public static void initializeFromOp(PostfixOperator operator,
										Token tok)
	{
		LinkedListToken type = (LinkedListToken) TYPES_BY_OPERATOR.get(operator);
		if (type == null)
			throw new IllegalArgumentException("No operator for Op " + operator);
		
		tok.setType(type.getType());
		tok.setText(type.getText());
	}
}
