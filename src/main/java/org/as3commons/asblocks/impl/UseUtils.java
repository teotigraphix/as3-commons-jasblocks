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
import java.util.List;

import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class UseUtils
{
	public static IASUseStatement newUse(LinkedListTree findTypeBlock,
			IASExpression name)
	{
		// TODO implement UseUtils.newUse()
		return null;
	}

	public static IASUseStatement parseUse(LinkedListTree ast, String name)
	{
		LinkedListTree child = AS3FragmentParser.parseUseNamespace(name);
		ASTUtils.addChildWithIndentation(ast, child);
		return new ASTASUseStatement(child);
	}

	public static IASUseStatement removeUse(LinkedListTree ast, String name)
	{
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree child;
		while ((child = i.search(AS3Parser.USE)) != null)
		{
			IASUseStatement result = (IASUseStatement) StatementBuilder.build(child);
			if (result.getName().equals(name))
			{
				i.remove();
				return result;
			}
		}
		return null;
	}

	public static List<IASUseStatement> getUses(LinkedListTree ast)
	{
		List<IASUseStatement> result = new ArrayList<IASUseStatement>();
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree child;
		while ((child = i.search(AS3Parser.USE)) != null)
		{
			IASUseStatement element = (IASUseStatement) StatementBuilder.build(child);
			result.add(element);
		}
		return result;
	}

}
