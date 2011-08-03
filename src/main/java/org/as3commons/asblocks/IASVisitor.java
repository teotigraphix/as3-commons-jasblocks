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

package org.as3commons.asblocks;

import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.IASFunctionType;
import org.as3commons.asblocks.dom.IASInterfaceType;
import org.as3commons.asblocks.dom.IASMember;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASNamespaceType;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASType;

/**
 * Visits nodes walked by an <code>IASWalker</code>.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.IASWalker
 */
public interface IASVisitor
{
	//--------------------------------------------------------------------------
	//
	//  Methods
	//
	//--------------------------------------------------------------------------

	/**
	 * Visits an <code>IASProject</code> and recurses through all nodes
	 * in the AST tree.
	 * 
	 * @param element The <code>IASProject</code>.
	 */
	public void visitProject(IASProject element);

	/**
	 * Visits an <code>IASCompilationUnit</code> of the <code>IASProject</code>.
	 * 
	 * @param element The <code>IASCompilationUnit</code> of the 
	 * <code>IASProject</code>.
	 */
	public void visitCompilationUnit(IASCompilationUnit element);

	/**
	 * Visits an <code>IASPackage</code> of the <code>IASCompilationUnit</code>.
	 * 
	 * @param element The <code>IASPackage</code> of the 
	 * <code>IASCompilationUnit</code>.
	 */
	public void visitPackage(IASPackage element);

	/**
	 * Called just before <code>visitClass()</code> or 
	 * <code>visitInterface()</code>. 
	 * 
	 * @param element The <code>IASType</code> of the 
	 * <code>IASCompilationUnit</code>.
	 */
	public void visitType(IASType element);

	/**
	 * Visits an <code>IASClassType</code> of the <code>IASPackage</code>.
	 * 
	 * @param element The <code>IASClassType</code> of the 
	 * <code>IASPackage</code>.
	 */
	public void visitClass(IASClassType element);

	/**
	 * Visits an <code>IASInterfaceType</code> of the <code>IASPackage</code>.
	 * 
	 * @param element The <code>IASInterfaceType</code> of the 
	 * <code>IASPackage</code>.
	 */
	public void visitInterface(IASInterfaceType element);

	/**
	 * Visits an <code>IASFunctionType</code> of the <code>IASPackage</code>.
	 * 
	 * @param element The <code>IASFunctionType</code> of the 
	 * <code>IASPackage</code>.
	 */
	public void visitFunction(IASFunctionType element);

	/**
	 * Visits an <code>IASNamespaceType</code> of the <code>IASPackage</code>.
	 * 
	 * @param element The <code>IASNamespaceType</code> of the 
	 * <code>IASPackage</code>.
	 */
	public void visitNamespace(IASNamespaceType element);

	/**
	 * Called just before <code>visitMethod()</code> or 
	 * <code>visitField()</code>. 
	 * 
	 * @param element The <code>IASMember</code> of the 
	 * <code>IASType</code>.
	 */
	public void visitMember(IASMember element);

	/**
	 * Visits an <code>IASMethod</code> of the <code>IASType</code>.
	 * 
	 * @param element The <code>IASMethod</code> of the 
	 * <code>IASType</code>.
	 */
	public void visitMethod(IASMethod element);

	/**
	 * Visits an <code>IASField</code> of the <code>IASType</code>.
	 * 
	 * @param element The <code>IASField</code> of the 
	 * <code>IASType</code>.
	 */
	public void visitField(IASField element);
}
