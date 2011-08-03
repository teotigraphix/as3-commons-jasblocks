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

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASCatchClause;
import org.as3commons.asblocks.dom.IASFinallyClause;
import org.as3commons.asblocks.dom.IASTryStatement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASTryStatement extends ContainerDelegate implements
		IASTryStatement
{

	public ASTASTryStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public List<IASCatchClause> getCatchClauses()
	{
		List<IASCatchClause> results = new ArrayList<IASCatchClause>();
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree catchClause;
		while ((catchClause = i.search(AS3Parser.CATCH)) != null)
		{
			results.add(new ASTASCatchClause(catchClause));
		}
		return Collections.unmodifiableList(results);
	}

	@Override
	public IASFinallyClause getFinallyClause()
	{
		LinkedListTree finallyClause = finallyClause();
		if (finallyClause == null)
			return null;
		return new ASTASFinallyClause(finallyClause);
	}

	@Override
	public IASCatchClause newCatchClause(String name, String type)
	{
		LinkedListTree catchClause = ASTStatementBuilder.newCatchClauseAST(name, type);
		LinkedListToken space = TokenBuilder.newSpace();
		catchClause.getStartToken().prependToken(space);
		catchClause.setStartToken(space);
		if (finallyClause() == null)
		{
			ast.addChildWithTokens(catchClause);
		}
		else
		{
			ast.addChildAtWithTokens(ast.getChildCount() - 1, catchClause);
		}
		String indent = ASTUtils.findIndent(ast);
		ASTUtils.increaseIndentAfterFirstLine(catchClause, indent);
		return new ASTASCatchClause(catchClause);
	}

	@Override
	public IASCatchClause removeCatch(IASCatchClause statement)
	{
		// TODO implement ASTASTryStatement.removeCatch()
		return null;
	}

	@Override
	public IASFinallyClause newFinallyClause()
	{
		LinkedListTree finallyClause = finallyClause();

		if (finallyClause != null)
		{
			throw new ASBlocksSyntaxError("only one finally-clause allowed");
		}
		finallyClause = ASTStatementBuilder.newFinallyClauseAST();
		LinkedListToken space = TokenBuilder.newSpace();
		finallyClause.getStartToken().prependToken(space);
		finallyClause.setStartToken(space);
		ast.addChildWithTokens(finallyClause);

		String indent = ASTUtils.findIndent(ast);
		ASTUtils.increaseIndentAfterFirstLine(finallyClause, indent);

		return new ASTASFinallyClause(finallyClause);
	}

	@Override
	public IASFinallyClause removeFinally()
	{
		// TODO implement ASTASTryStatement.removeFinally()
		return null;
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		return new ASTStatementList(ast.getFirstChild());
	}

	private LinkedListTree finallyClause()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.FINALLY);
	}
}
