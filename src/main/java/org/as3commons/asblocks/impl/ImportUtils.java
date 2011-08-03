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
import org.as3commons.asblocks.dom.IASImportStatement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ImportUtils
{
	public static IASImportStatement newImport(IASExpression target)
	{
		return null;
	}
	
	public static IASImportStatement parseImport(LinkedListTree ast, String target)
	{
		LinkedListTree child = AS3FragmentParser.parseImport(target);
		ASTUtils.addChildWithIndentation(ast, child);
		return new ASTASImportStatement(child);
	}
	
	public static IASImportStatement removeImport(LinkedListTree ast, String target)
	{
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree child;
		while ((child = i.search(AS3Parser.IMPORT)) != null)
		{
			IASImportStatement result = (IASImportStatement) StatementBuilder
					.build(child);
			if (result.getTargetString().equals(target))
			{
				i.remove();
				return result;
			}
		}
		return null;
	}
	
	public static List<IASImportStatement> getImports(LinkedListTree ast)
	{
		List<IASImportStatement> result = new ArrayList<IASImportStatement>();
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree child;
		while ((child = i.search(AS3Parser.IMPORT)) != null)
		{
			IASImportStatement element = (IASImportStatement) StatementBuilder
					.build(child);
			result.add(element);
		}
		return result;
	}
}
