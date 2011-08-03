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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * Helpers for dealing with the modifiers list.
 */
class ModifierUtils
{

	private static class ModInfo
	{
		public int tokenType;
		public Visibility vis;
		public String keyword;

		public ModInfo(int tokenType, Visibility vis, String keyword)
		{
			this.tokenType = tokenType;
			this.vis = vis;
			this.keyword = keyword;
		}
	}

	private static Map<Integer, ModInfo> modinfoByTokenType = new HashMap<Integer, ModInfo>();
	private static Map<Visibility, ModInfo> modinfoByVisibility = new HashMap<Visibility, ModInfo>();

	static
	{
		mapMod(AS3Parser.PRIVATE, Visibility.PRIVATE, "private");
		mapMod(AS3Parser.PUBLIC, Visibility.PUBLIC, "public");
		mapMod(AS3Parser.PROTECTED, Visibility.PROTECTED, "protected");
		mapMod(AS3Parser.INTERNAL, Visibility.INTERNAL, "internal");
		mapMod(AS3Parser.NAMESPACE, Visibility.NAMESPACE, null);
		mapMod(Integer.MIN_VALUE, Visibility.DEFAULT, null);
	}

	private static void mapMod(int tokenType, Visibility vis, String keyword)
	{
		ModInfo inf = new ModInfo(tokenType, vis, keyword);
		modinfoByTokenType.put(new Integer(tokenType), inf);
		modinfoByVisibility.put(vis, inf);
	}

	private static ModInfo getModInfo(int tokenType)
	{
		return (ModInfo) modinfoByTokenType.get(new Integer(tokenType));
	}

	private static ModInfo getModInfo(Visibility vis)
	{
		ModInfo result = (ModInfo) modinfoByVisibility.get(vis);
		if (result == null)
		{
			throw new IllegalArgumentException("unknown kind of visibility: "
					+ vis);
		}
		return result;
	}

	public static Visibility getVisibility(LinkedListTree modifiers)
	{
		if (modifiers == null)
			return Visibility.DEFAULT;
		
		for (ASTIterator i = new ASTIterator(modifiers); i.hasNext();)
		{
			LinkedListTree mod = i.next();
			ModInfo modInfo = getModInfo(mod.getType());
			if (modInfo != null)
			{
				return modInfo.vis;
			}
		}
		return Visibility.DEFAULT;
	}

	private static boolean hasModifierFlag(LinkedListTree modifiers, int type)
	{
		for (ASTIterator i = new ASTIterator(modifiers); i.hasNext();)
		{
			LinkedListTree mod = i.next();
			if (mod.getType() == type)
				return true;
		}
		return false;
	}

	public static boolean hasModifier(LinkedListTree modifiers, String modifier)
	{
		if (modifiers == null)
			return false;
		
		for (ASTIterator i = new ASTIterator(modifiers); i.hasNext();)
		{
			LinkedListTree mod = i.next();
			if (mod.getText().equals(modifier))
				return true;
		}
		return false;
	}

	public static List<String> getModifiers(LinkedListTree modifiers)
	{
		if (modifiers == null)
			return null;
		List<String> result = new ArrayList<String>();
		for (ASTIterator i = new ASTIterator(modifiers); i.hasNext();)
		{
			LinkedListTree mod = i.next();
			result.add(mod.getText());
		}
		return result;
	}

	public static boolean isDynamic(LinkedListTree modifiers)
	{
		return hasModifierFlag(modifiers, AS3Parser.DYNAMIC);
	}

	public static boolean isOverride(LinkedListTree modifiers)
	{
		return hasModifierFlag(modifiers, AS3Parser.OVERRIDE);
	}

	public static boolean isFinal(LinkedListTree modifiers)
	{
		return hasModifierFlag(modifiers, AS3Parser.FINAL);
	}

	public static boolean isNamespace(LinkedListTree modifiers)
	{
		return hasModifierFlag(modifiers, AS3Parser.IDENT);
	}

	public static void setDynamic(LinkedListTree modifiers, boolean value)
	{
		setModifierFlag(modifiers, value, AS3Parser.DYNAMIC, "dynamic");
	}

	public static void setOverride(LinkedListTree modifiers, boolean value)
	{
		setModifierFlag(modifiers, value, AS3Parser.OVERRIDE, "override");
	}

	public static void setFinal(LinkedListTree modifiers, boolean value)
	{
		setModifierFlag(modifiers, value, AS3Parser.FINAL, "final");
	}

	private static void setModifierFlag(LinkedListTree modifiers, boolean flag,
			int type, String text)
	{
		for (ASTIterator i = new ASTIterator(modifiers); i.hasNext();)
		{
			LinkedListTree mod = i.next();
			if (mod.getType() == type)
			{
				if (flag)
					return;
				else
				{
					i.remove();
					if (modifiers.getChildCount() == 0)
					{
						deleteAllChildTokens(modifiers);
					}
				}
				return;
			}
		}
		if (flag)
		{
			LinkedListTree node = ASTUtils.newAST(type, text);
			node.appendToken(TokenBuilder.newSpace());
			modifiers.addChildWithTokens(node);
		}
	}

	public static void setVisibility(LinkedListTree modifiers,
			Visibility protection)
	{
		ModInfo modInfo = getModInfo(protection);
		removeNamespace(modifiers);
		for (ASTIterator i = new ASTIterator(modifiers); i.hasNext();)
		{
			LinkedListTree mod = i.next();
			if (isVisibilityKeyword(mod))
			{
				if (modInfo.keyword == null)
				{
					i.remove();
					if (modifiers.getChildCount() == 0)
					{
						deleteAllChildTokens(modifiers);
					}
				}
				else
				{
					mod.token.setType(modInfo.tokenType);
					mod.token.setText(modInfo.keyword);
				}
				return;
			}
		}
		LinkedListTree mod = ASTUtils.newAST(modInfo.tokenType, modInfo.keyword);
		if (!protection.equals(Visibility.DEFAULT))
		{
			mod.appendToken(TokenBuilder.newSpace());
		}
		modifiers.addChildWithTokens(mod);
	}

	private static void removeNamespace(LinkedListTree modifiers)
	{
		LinkedListTree ast = ASTUtils.findChildByType(modifiers, AS3Parser.IDENT);
		if (ast != null)
		{
			modifiers.deleteChild(modifiers.getIndexOfChild(ast));
		}
	}

	private static boolean isVisibilityKeyword(LinkedListTree mod)
	{
		return getModInfo(mod.getType()) != null;
	}

	private static void deleteAllChildTokens(LinkedListTree modifiers)
	{
		for (LinkedListToken tok = modifiers.getStartToken(); tok != null
				&& tok != modifiers.getStopToken();)
		{
			LinkedListToken next = tok.getNext();
			tok.deleteToken();
			tok = next;
		}
		modifiers.setStartToken(null);
		modifiers.setStopToken(null);
	}

	/**
	 * Constructs a new MODIFIERS node which represents the given
	 * visibility as an AST containing either "public", "private",
	 * "protected", "internal" or no children (i.e. default visibility).
	 */
	public static LinkedListTree toModifiers(Visibility visibility)
	{
		if (Visibility.DEFAULT.equals(visibility))
		{
			return ASTUtils.newPlaceholderAST(AS3Parser.MODIFIERS);
		}
		LinkedListTree modifiers = ASTUtils.newImaginaryAST(AS3Parser.MODIFIERS);
		ModInfo modInfo = getModInfo(visibility);
		LinkedListTree mod = ASTUtils.newAST(modInfo.tokenType, modInfo.keyword);
		mod.appendToken(TokenBuilder.newSpace());
		modifiers.addChildWithTokens(mod);
		return modifiers;
	}

	public static void setNamespace(LinkedListTree modifiers, String name)
	{
		// Special, cannot be PUBLIC, PROTECTED, PRIVATE or INTERNAL
		setVisibility(modifiers, Visibility.DEFAULT);
		setModifierFlag(modifiers, true, AS3Parser.IDENT, name);
	}

	public static String getNamespace(LinkedListTree modifiers)
	{
		LinkedListTree ast = ASTUtils.findChildByType(modifiers, AS3Parser.IDENT);
		if (ast == null)
			return null;
		return ast.getText();
	}

}
