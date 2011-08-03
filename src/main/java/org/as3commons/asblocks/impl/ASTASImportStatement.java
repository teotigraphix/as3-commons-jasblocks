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

import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASImportStatement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class ASTASImportStatement extends ASTScriptElement implements
		IASImportStatement
{

	public ASTASImportStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASExpression getTarget()
	{
		// TODO implement ASTASImportStatement.getTarget()
		return null;
	}

	@Override
	public void setTarget(IASExpression value)
	{
		// TODO implement ASTASImportStatement.setTarget()

	}

	@Override
	public String getTargetString()
	{
		return ASTUtils.importText(ast);
	}

	@Override
	public void parseTarget(String name)
	{
		LinkedListTree child = AS3FragmentParser.parseImport(name);
		ast.setChildWithTokens(0, child.getFirstChild());
	}

	@Override
	public ASQName getQName()
	{
		return ASQName.create(getTargetString());
	}

}
