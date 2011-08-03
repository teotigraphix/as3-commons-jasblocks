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

import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class MethodAwareUtils
{
	public static List<IASMethod> getMethods(LinkedListTree ast)
	{
		List<IASMethod> results = new ArrayList<IASMethod>();
		for (ASTIterator i = blockIterator(ast); i.hasNext();)
		{
			LinkedListTree member = i.next();
			if (member.getType() == AS3Parser.METHOD_DEF)
			{
				results.add(new ASTASMethod(member));
			}
		}
		return results;
	}

	public static IASMethod getMethod(LinkedListTree ast, String name)
	{
		for (ASTIterator i = blockIterator(ast); i.hasNext();)
		{
			LinkedListTree member = i.next();
			if (member.getType() == AS3Parser.METHOD_DEF)
			{
				IASMethod meth = new ASTASMethod(member);
				if (meth.getName().equals(name))
					return meth;
			}
		}
		return null;
	}

	public static IASMethod removeMethod(LinkedListTree ast, String name)
	{
		for (ASTIterator i = blockIterator(ast); i.hasNext();)
		{
			LinkedListTree member = i.next();
			if (member.getType() == AS3Parser.METHOD_DEF)
			{
				IASMethod meth = new ASTASMethod(member);
				if (meth.getName().equals(name))
				{
					i.remove();
					return meth;
				}
			}
		}
		return null;
	}

	private static ASTIterator blockIterator(LinkedListTree ast)
	{
		return new ASTIterator(findTypeBlock(ast));
	}

	private static LinkedListTree findTypeBlock(LinkedListTree ast)
	{
		return ASTUtils.findChildByType(ast, AS3Parser.TYPE_BLOCK);
	}
}
