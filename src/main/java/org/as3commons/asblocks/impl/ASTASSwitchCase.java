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
import org.as3commons.asblocks.dom.IASSwitchCase;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class ASTASSwitchCase extends ContainerDelegate implements IASSwitchCase
{
	private static final int INDEX_LABELVAL = 0;

	private static final int INDEX_CONTAINER = 1;

	public ASTASSwitchCase(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASExpression getLabel()
	{
		return ExpressionBuilder.build(getChild(INDEX_LABELVAL));
	}

	@Override
	public void setLabel(IASExpression value)
	{
		// TODO implement ASTASSwitchCase.setLabel()

	}

	@Override
	public void parseLabel(String value)
	{
		LinkedListTree label = AS3FragmentParser.parseExpression(value);
		ast.setChildWithTokens(INDEX_LABELVAL, label);
	}

	@Override
	public String getLabelString()
	{
		return ASTUtils.stringifyNode(getChild(INDEX_LABELVAL));
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		return new ASTStatementList(getChild(INDEX_CONTAINER));
	}

	private LinkedListTree getChild(int index)
	{
		return (LinkedListTree) ast.getChild(index);
	}
}
