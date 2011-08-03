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

package org.as3commons.asblocks.dom;

import java.util.List;

/**
 * A script element aware of the <code>IASMethod</code>.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 */
public interface IASMethodAware
{
	//--------------------------------------------------------------------------
	//
	//  Properties
	//
	//--------------------------------------------------------------------------

	//----------------------------------
	//  methods
	//----------------------------------

	/**
	 * Returns the <code>List</code> of <code>IASMethod</code> held on this type.
	 * 
	 * <p>The property always returns a <code>List</code> regardless of methods defined.
	 * The property will not return <code>null</code>.</p>
	 */
	public List<IASMethod> getMethods();

	//--------------------------------------------------------------------------
	//
	//  Methods
	//
	//--------------------------------------------------------------------------

	/**
	 * Creates, appends and returns a new <code>IASMethod</code> instance.
	 * 
	 * @param name The <code>String</code> name of the method.
	 * @param visibility The <code>Visibility</code> of the method.
	 * @param returnType The return type of the method.
	 * @return A new <code>IASMethod</code> instance appended to the type.
	 */
	public IASMethod newMethod(String name, Visibility visibility,
			String returnType);

	/**
	 * Creates, appends and returns a new <code>IASMethod</code> instance with
	 * no return type.
	 * 
	 * @param name The <code>String</code> name of the method.
	 * @param visibility The <code>Visibility</code> of the method.
	 * @return A new <code>IASMethod</code> instance appended to the type.
	 */
	public IASMethod newMethod(String name, Visibility visibility);

	/**
	 * Creates, appends and returns a new <code>IASMethod</code> instance with
	 * <code>Visibility.DEFAULT</code> return type.
	 * 
	 * @param name The <code>String</code> name of the method.
	 * @return A new <code>IASMethod</code> instance appended to the type.
	 */
	public IASMethod newMethod(String name);

	/**
	 * Returns an <code>IASMethod</code> instance if found or <code>null</code> 
	 * if the type does not contain a method by name.
	 * 
	 * @return The <code>IASMethod</code> instance by name or <code>null</code>.
	 */
	public IASMethod getMethod(String name);

	/**
	 * Attempts to remove an <code>IASMethod</code> instance by name.
	 * 
	 * @param name The <code>String</code> name of the method.
	 * @return An <code>IASMethod</code> indicating whether a method by name was 
	 * found and removed (<code>IASMethod</code>), or (<code>null</code>) if not.
	 */
	public IASMethod removeMethod(String name);
}
