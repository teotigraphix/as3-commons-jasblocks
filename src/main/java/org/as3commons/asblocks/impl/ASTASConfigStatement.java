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

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASConfigStatement;
import org.as3commons.asblocks.dom.IStatementContainer;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASConfigStatement extends ContainerDelegate implements
		IASConfigStatement
{
	private static final int INDEX_DBL_COLON = 0;
	
	private static final int INDEX_STATEMENT = 1;
	
	public ASTASConfigStatement(LinkedListTree ast)
	{
		super(ast);
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.COMPILE_CONFIG, ast.getType());
	}

	@Override
	public void setName(String value)
	{
		if (value == null || value.equals(""))
		{
			throw new ASBlocksSyntaxError("Config name cannot be null or and ampty string");
		}
		// should always be IDENT, safe to change token text
		name().getToken().setText(value);
	}

	@Override
	public String getName()
	{
		return name().getText();
	}

	@Override
	protected IStatementContainer getStatementContainer()
	{
		return new ASTStatementList(getChild(INDEX_STATEMENT));
	}

	private LinkedListTree getChild(int index)
	{
		return (LinkedListTree) ast.getChild(index);
	}

	private LinkedListTree name()
	{
		return getChild(INDEX_DBL_COLON).getLastChild();
	}
}
