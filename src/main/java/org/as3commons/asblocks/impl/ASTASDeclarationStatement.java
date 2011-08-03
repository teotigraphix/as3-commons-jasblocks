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

import org.as3commons.asblocks.dom.IASDeclaration;
import org.as3commons.asblocks.dom.IASDeclarationStatement;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTASDeclarationStatement extends ASTScriptElement implements
		IASDeclarationStatement
{

	public ASTASDeclarationStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public String getName()
	{
		return firstVar().getName();
	}

	@Override
	public String getType()
	{
		return firstVar().getType();
	}

	@Override
	public IASExpression getInitializer()
	{
		return firstVar().getInitializer();
	}

	@Override
	public List<IASDeclaration> getDeclarations()
	{
		List<IASDeclaration> results = new ArrayList<IASDeclaration>();
		for (ASTIterator i = new ASTIterator(ast); i.hasNext();)
		{
			results.add(build(i.next()));
		}
		return Collections.unmodifiableList(results);
	}

	@Override
	public boolean isConstant()
	{
		return ast.getType() == AS3Parser.CONST;
	}

	@Override
	public void setConstant(boolean value)
	{
		if (value)
		{
			ast.token.setType(AS3Parser.CONST);
			ast.token.setText("const");
		}
		else
		{
			ast.token.setType(AS3Parser.VAR);
			ast.token.setText("var");
		}
	}

	private IASDeclaration firstVar()
	{
		return build(ASTUtils.findChildByType(ast, AS3Parser.VAR_DEC));
	}

	private IASDeclaration build(LinkedListTree varDecl)
	{
		return new ASTASDeclaration(varDecl);
	}
}
