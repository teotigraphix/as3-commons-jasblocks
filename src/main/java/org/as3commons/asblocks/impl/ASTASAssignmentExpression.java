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

import org.as3commons.asblocks.dom.AssignmentOperator;
import org.as3commons.asblocks.dom.IASAssignmentExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class ASTASAssignmentExpression extends ASTExpression implements
		IASAssignmentExpression
{

	public ASTASAssignmentExpression(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASExpression getLeftExpression()
	{
		return ExpressionBuilder.build(ast.getFirstChild());
	}

	@Override
	public void setLeftExpression(IASExpression value)
	{
		setSubexpression(0, value);
	}

	@Override
	public AssignmentOperator getOperator()
	{
		return AssignmentOperatorMap.opFromType(ast.getType());
	}

	@Override
	public void setOperator(AssignmentOperator value)
	{
		AssignmentOperatorMap.initialiseFromOp(value, ast.getToken());
	}

	@Override
	public IASExpression getRightExpression()
	{
		return ExpressionBuilder.build(ast.getLastChild());
	}

	@Override
	public void setRightExpression(IASExpression value)
	{
		setSubexpression(1, value);
	}

	private void setSubexpression(int index, IASExpression subexpression)
	{
		ASTExpression sub = (ASTExpression) subexpression;
		LinkedListTree subExpr = sub.getAST();
		ASTBuilder.assertNoParent("expression", subExpr);
		// TODO: handle operator precedence issues
		ast.setChildWithTokens(index, subExpr);
	}
}
