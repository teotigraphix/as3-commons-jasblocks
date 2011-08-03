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

import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASImportStatement;
import org.as3commons.asblocks.dom.IASIncludeStatement;
import org.as3commons.asblocks.dom.IASMetaTag;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASType;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * The <code>IASPackage</code> implementation.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class ASTASPackage extends ASTScriptElement implements IASPackage
{
	@Override
	public ASQName getQName()
	{
		return ASQName.create(getName());
	}

	@Override
	public String getPackageName()
	{
		return getName();
	}

	@Override
	public String getQualifiedName()
	{
		return getName();
	}

	//--------------------------------------------------------------------------
	//
	//  IASPackage API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASCompilationUnit getParent()
	{
		return new ASTASCompilationUnit(ast.getParent());
	}

	@Override
	public String getName()
	{
		LinkedListTree first = ast.getFirstChild();
		if (first.getType() == AS3Parser.TYPE)
			return ASTUtils.typeText(first);

		return null;
	}

	@Override
	public void setName(String value)
	{
		ASTIterator i = new ASTIterator(ast);
		LinkedListTree first = i.next();

		// null name given, so remove any existing name,
		if (value == null && first.getType() == AS3Parser.TYPE)
		{
			i.remove();
			return;
		}

		// otherwise, add or replace the name given,
		LinkedListTree newName = AS3FragmentParser.parseType(value);
		if (first.getType() == AS3Parser.TYPE)
		{
			i.replace(newName);
			// add again since the replacement removed the space
			newName.appendToken(TokenBuilder.newSpace());
		}
		else
		{
			// current should be at block, insert before block
			i.insertBeforeCurrent(newName);
			newName.appendToken(TokenBuilder.newSpace());
		}
	}

	@Override
	public IASType getType()
	{
		LinkedListTree block = ASTUtils.findChildByType(ast, AS3Parser.BLOCK);
		return TypeBuilder.build(block.getLastChild());
	}

	//--------------------------------------------------------------------------
	//
	//  IMetaTagAware API
	//
	//--------------------------------------------------------------------------

	@Override
	public List<IASMetaTag> getMetaTags()
	{
		return MetaTagUtils.getAllMetaTags(findBlock());
	}

	@Override
	public IASMetaTag newMetaTag(String name)
	{
		return MetaTagUtils.newMetaTag(findBlock(), name);
	}

	@Override
	public IASMetaTag getMetaTag(String name)
	{
		return MetaTagUtils.getFirstMetaTag(findBlock(), name);
	}

	@Override
	public List<IASMetaTag> getAllMetaTags(String name)
	{
		return MetaTagUtils.getMetaTagWithName(findBlock(), name);
	}

	@Override
	public boolean hasMetaTag(String name)
	{
		return MetaTagUtils.hasMetaTags(findBlock());
	}

	@Override
	public boolean removeMetaTag(IASMetaTag metaTag)
	{
		return MetaTagUtils.removeMetaTag(((ASTASMetaTag) metaTag).getAST());
	}

	//--------------------------------------------------------------------------
	//
	//  IImportAware API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASImportStatement newImport(IASExpression target)
	{
		return ImportUtils.newImport(target);
	}

	@Override
	public IASImportStatement parseImport(String target)
	{
		return ImportUtils.parseImport(findAnnotations(), target);
	}

	@Override
	public IASImportStatement removeImport(String target)
	{
		return ImportUtils.removeImport(findAnnotations(), target);
	}

	@Override
	public List<IASImportStatement> getImports()
	{
		return ImportUtils.getImports(findAnnotations());
	}

	//--------------------------------------------------------------------------
	//
	//  IIncludeAware API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASIncludeStatement newInclude(IASExpression path)
	{
		return IncludeUtils.newInclude(findAnnotations(), path);
	}

	@Override
	public IASIncludeStatement parseInclude(String path)
	{
		return IncludeUtils.parseInclude(findAnnotations(), path);
	}

	@Override
	public IASIncludeStatement removeInclude(String path)
	{
		return IncludeUtils.removeInclude(findAnnotations(), path);
	}

	@Override
	public List<IASIncludeStatement> getIncludes()
	{
		return IncludeUtils.getIncludes(findAnnotations());
	}

	//--------------------------------------------------------------------------
	//
	//  IUseAware API
	//
	//--------------------------------------------------------------------------

	@Override
	public IASUseStatement newUse(IASExpression name)
	{
		return UseUtils.newUse(findAnnotations(), name);
	}

	@Override
	public IASUseStatement parseUse(String name)
	{
		return UseUtils.parseUse(findAnnotations(), name);
	}

	@Override
	public IASUseStatement removeUse(String name)
	{
		return UseUtils.removeUse(findAnnotations(), name);
	}

	@Override
	public List<IASUseStatement> getUses()
	{
		return UseUtils.getUses(findAnnotations());
	}

	//--------------------------------------------------------------------------
	//
	//  Constructor
	//
	//--------------------------------------------------------------------------

	/**
	 * Constructor.
	 * 
	 * COMPILATION_UNIT/PACKAGE
	 */
	public ASTASPackage(LinkedListTree ast)
	{
		super(ast);
	}

	private LinkedListTree findBlock()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.BLOCK);
	}

	private LinkedListTree findAnnotations()
	{
		// this is screwy since all package annotations get put into the 
		return ASTUtils.findChildByType(findBlock(), AS3Parser.ANNOTATIONS);
	}

}
