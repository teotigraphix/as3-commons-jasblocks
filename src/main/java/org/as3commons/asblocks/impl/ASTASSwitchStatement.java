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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASSwitchCase;
import org.as3commons.asblocks.dom.IASSwitchDefault;
import org.as3commons.asblocks.dom.IASSwitchLabel;
import org.as3commons.asblocks.dom.IASSwitchStatement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASSwitchStatement extends ASTScriptElement implements
		IASSwitchStatement
{

	public ASTASSwitchStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASExpression getCondition()
	{
		return ExpressionBuilder.build(condition().getFirstChild());
	}

	@Override
	public void setCondition(IASExpression value)
	{
		condition().setChildWithTokens(0, toAST(value));
	}

	@Override
	public void parseCondition(String value)
	{
		LinkedListTree cond = AS3FragmentParser.parseCondition(value);
		ast.setChildWithTokens(0, cond);
	}

	@Override
	public String getConditionString()
	{
		return ASTUtils.stringifyNode(condition().getFirstChild());
	}

	@Override
	public List<IASSwitchLabel> getLabels()
	{
		List<IASSwitchLabel> results = new ArrayList<IASSwitchLabel>();
		ASTIterator i = new ASTIterator(block());
		while (i.hasNext())
		{
			results.add(buildLabel(i.next()));
		}
		return Collections.unmodifiableList(results);
	}

	@Override
	public IASSwitchCase newCase(String label)
	{
		LinkedListTree caseStmt = ASTUtils.newAST(AS3Parser.CASE, "case");
		caseStmt.appendToken(TokenBuilder.newSpace());
		caseStmt.addChildWithTokens(AS3FragmentParser.parseExpression(label));
		caseStmt.appendToken(TokenBuilder.newColon());
		LinkedListTree stmtList = ASTUtils.newPlaceholderAST(AS3Parser.SWITCH_STATEMENT_LIST);
		caseStmt.addChildWithTokens(stmtList);
		ASTUtils.addChildWithIndentation(block(), caseStmt);
		return new ASTASSwitchCase(caseStmt);
	}

	@Override
	public IASSwitchDefault newDefault()
	{
		LinkedListTree defaultStmt = ASTUtils.newAST(AS3Parser.DEFAULT, "default");
		defaultStmt.appendToken(TokenBuilder.newColon());
		LinkedListTree stmtList = ASTUtils.newPlaceholderAST(AS3Parser.SWITCH_STATEMENT_LIST);
		defaultStmt.addChildWithTokens(stmtList);
		ASTUtils.addChildWithIndentation(block(), defaultStmt);
		return new ASTASSwitchDefault(defaultStmt);
	}

	private IASSwitchLabel buildLabel(LinkedListTree lab)
	{
		switch (lab.getType())
		{
		case AS3Parser.CASE:
			return new ASTASSwitchCase(lab);
		case AS3Parser.DEFAULT:
			return new ASTASSwitchDefault(lab);
		default:
			throw new IllegalArgumentException("unhandled node type "
					+ ASTUtils.tokenNameFromAST(lab));
		}
	}

	private LinkedListTree condition()
	{
		return ast.getFirstChild();
	}

	private LinkedListTree block()
	{
		return ast.getLastChild();
	}

}
