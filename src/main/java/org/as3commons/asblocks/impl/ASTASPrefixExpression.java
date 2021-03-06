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

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASPrefixExpression;
import org.as3commons.asblocks.dom.PrefixOperator;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class ASTASPrefixExpression extends ASTExpression implements
		IASPrefixExpression
{

	public ASTASPrefixExpression(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASExpression getExpression()
	{
		return ExpressionBuilder.build(ast.getFirstChild());
	}

	@Override
	public void setExpression(IASExpression value)
	{
		ASTExpression sub = (ASTExpression) value;
		// TODO: handle operator precedence issues
		ast.setChildWithTokens(0, sub.getAST());
	}

	@Override
	public PrefixOperator getOperator()
	{
		return PrefixOperatorMap.opFromType(ast.getType());
	}

	@Override
	public void setOperator(PrefixOperator value)
	{
		PrefixOperatorMap.initializeFromOp(value, ast.getToken());
	}

}
