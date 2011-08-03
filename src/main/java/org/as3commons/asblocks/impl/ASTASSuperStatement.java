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

import java.util.List;

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASSuperStatement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class ASTASSuperStatement extends ASTScriptElement implements
		IASSuperStatement
{

	public ASTASSuperStatement(LinkedListTree ast)
	{
		super(ast);
	}

	@Override
	public IASExpression getTarget()
	{

		return null;
	}

	@Override
	public void setTarget(IASExpression value)
	{

	}

	@Override
	public List<IASExpression> getArguments()
	{
		return ArgumentUtils.astToExpressionList(ArgumentUtils.findArgs(ast));
	}

	@Override
	public void setArguments(List<IASExpression> value)
	{
		ArgumentUtils.overwriteArgsWithExpressionList(ArgumentUtils.findArgs(ast), value);
	}

}
