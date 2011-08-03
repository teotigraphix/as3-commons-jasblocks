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

import org.as3commons.asblocks.dom.ASQName;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASFunctionType;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASType;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * The <code>IASCompilationUnit</code> implementation.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public class ASTASCompilationUnit extends ASTScriptElement implements
		IASCompilationUnit
{
	//--------------------------------------------------------------------------
	//
	//  IASCompilationUnit API :: Properties
	//
	//--------------------------------------------------------------------------

	@Override
	public String getQualifiedName()
	{
		return getQName().getQualifiedName();
	}

	@Override
	public String getName()
	{
		return getType().getName();
	}

	@Override
	public ASQName getQName()
	{
		return new ASQName(getPackageName(), getType().getName());
	}

	@Override
	public String getPackageName()
	{
		return getPackage().getName();
	}

	@Override
	public void setPackageName(String value)
	{
		getPackage().setName(value);
	}

	@Override
	public IASPackage getPackage()
	{
		LinkedListTree pkg = findPackage();
		if (pkg == null)
			return null;

		return new ASTASPackage(pkg);
	}

	@Override
	public IASType getType()
	{
		IASPackage pkg = getPackage();
		if (pkg == null)
			return null;

		return pkg.getType();
	}

	//--------------------------------------------------------------------------
	//
	//  Constructor
	//
	//--------------------------------------------------------------------------

	/**
	 * Constructor.
	 */
	public ASTASCompilationUnit()
	{
		this(null);
	}
	
	/**
	 * Constructor.
	 */
	public ASTASCompilationUnit(LinkedListTree ast)
	{
		super(ast);
	}

	//--------------------------------------------------------------------------
	//
	//  Protected :: Methods
	//
	//--------------------------------------------------------------------------

	/**
	 * @private
	 */
	protected LinkedListTree findPackage()
	{
		return ASTUtils.findChildByType(ast, AS3Parser.PACKAGE);
	}

	@Override
	public List<IASType> getInnerTypes()
	{
		List<IASType> result = new ArrayList<IASType>();
		ASTIterator i = unitBlockIterator();
		LinkedListTree child;
		while ((child = i.search(AS3Parser.CLASS_DEF)) != null)
		{
			result.add(new ASTASClassType(child));
		}
		return result;
	}

	@Override
	public List<IASFunctionType> getInnerFunctions()
	{
		List<IASFunctionType> result = new ArrayList<IASFunctionType>();
		ASTIterator i = unitBlockIterator();
		LinkedListTree child;
		while ((child = i.search(AS3Parser.FUNC_DEF)) != null)
		{
			result.add(new ASTASFunctionType(child));
		}
		return result;
	}

	protected ASTIterator unitBlockIterator()
	{
		return new ASTIterator(ast);
	}
}
