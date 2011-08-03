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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.as3commons.asblocks.dom.IASMetaTag;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * Various MetaTag utility methods.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class MetaTagUtils
{

	public static boolean hasMetaTags(LinkedListTree ast)
	{
		ASTIterator i = iterTags(ast);
		return i.hasNext();
	}

	public static boolean hasMetaTag(LinkedListTree ast, String name)
	{
		ASTIterator i = iterTags(ast);
		while (i.hasNext())
		{
			LinkedListTree child = i.next();
			if (child.getType() == AS3Parser.METATAG)
			{
				if (toMetaTag(child).getName().equals(name))
					return true;
			}
		}
		return false;
	}

	public static boolean removeMetaTag(LinkedListTree ast)
	{
		// TODO implement MetaTagUtils.removeMetaTag()
		return true;
	}

	public static List<IASMetaTag> getAllMetaTags(LinkedListTree ast)
	{
		ASTIterator i = iterTags(ast);
		List<IASMetaTag> result = new LinkedList<IASMetaTag>();
		while (i.hasNext())
		{
			LinkedListTree child = i.next();
			if (child.getType() == AS3Parser.METATAG)
			{
				result.add(toMetaTag(child));
			}
		}
		return Collections.unmodifiableList(result);
	}

	public static IASMetaTag getFirstMetaTag(LinkedListTree ast, String name)
	{
		ASTIterator i = iterTags(ast);
		while (i.hasNext())
		{
			LinkedListTree child = i.next();
			if (child.getType() == AS3Parser.METATAG)
			{
				ASTASMetaTag tag = toMetaTag(child);
				if (tag.getName().equals(name))
				{
					return tag;
				}
			}
		}
		return null;
	}

	public static List<IASMetaTag> getMetaTagWithName(LinkedListTree ast,
			String name)
	{
		ASTIterator i = iterTags(ast);
		List<IASMetaTag> result = new LinkedList<IASMetaTag>();
		while (i.hasNext())
		{
			LinkedListTree child = i.next();
			if (child.getType() == AS3Parser.METATAG)
			{
				ASTASMetaTag tag = toMetaTag(child);
				if (tag.getName().equals(name))
				{
					result.add(tag);
				}
			}
		}
		return Collections.unmodifiableList(result);
	}

	public static IASMetaTag newMetaTag(LinkedListTree ast, String name)
	{
		LinkedListTree tag = ASTBuilder.newMetadataTag(name);

		if (isType(ast))
		{
			LinkedListTree annotations = findTags(ast);
			ASTUtils.addParenChildWithIndentation(annotations, tag);
			return toMetaTag(tag);
		}

		LinkedListToken trailingnl = TokenBuilder.newNewline();
		tag.getStopToken().appendToken(trailingnl);
		tag.setStopToken(trailingnl);

		String indent = ASTUtils.findIndent(ast);
		if (indent.length() > 0)
		{
			LinkedListToken stopToken = tag.getStopToken();
			LinkedListToken indentTok = TokenBuilder.newWhiteSpace(indent);
			stopToken.appendToken(indentTok);
			tag.setStopToken(indentTok);
		}

		LinkedListTree annotations = findTags(ast);
		annotations.addChildWithTokens(tag);
		return toMetaTag(tag);
	}

	private static ASTIterator iterTags(LinkedListTree ast)
	{
		return new ASTIterator(findTags(ast));
	}

	private static LinkedListTree findTags(LinkedListTree ast)
	{
		return ASTUtils.findChildByType(ast, AS3Parser.ANNOTATIONS);
	}

	private static ASTASMetaTag toMetaTag(LinkedListTree tag)
	{
		ASTUtils.assertAS3TokenTypeIs(AS3Parser.METATAG, tag.getType());
		return new ASTASMetaTag(tag);
	}

	private static boolean isType(LinkedListTree ast)
	{
		return ast.getParent().getType() == AS3Parser.PACKAGE;
	}

}