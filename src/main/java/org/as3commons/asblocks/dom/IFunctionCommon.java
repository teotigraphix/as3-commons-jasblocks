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
 * Clients implement this interface to add function common api.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.IASFunctionExpression
 * @see org.as3commons.asblocks.dom.IASFunctionType
 * @see org.as3commons.asblocks.dom.IASMethod
 */
public interface IFunctionCommon
{
	//--------------------------------------------------------------------------
	//
	//  Properties
	//
	//--------------------------------------------------------------------------

	//----------------------------------
	//  parameters
	//----------------------------------

	/**
	 * Returns a list of the formal arguments accepted by this ActionScript
	 * method.  Note that the resulting list is not modifiable.
	 * 
	 * @see #addParam(String, String)
	 */
	public List<IASParameter> getParameters();

	//----------------------------------
	//  hasParameter
	//----------------------------------

	/**
	 * Returns a <code>Boolean</code> indicating whether the function contains 
	 * a parameter list.
	 */
	public boolean hasParameters();

	//----------------------------------
	//  returnType
	//----------------------------------

	/**
	 * The return type of the function, this value may include a period.
	 * 
	 * <p>If a period is found in the type, the type is considered a
	 * qualified type else it is a simple type.</p>
	 */
	public String getType();

	/**
	 * @private
	 */
	public void setType(String value);

	//----------------------------------
	//  qualifiedReturnType
	//----------------------------------

	/**
	 * The qualified return type (resolved from imports or package).
	 */
	//	String getQualifiedReturnType();	

	//--------------------------------------------------------------------------
	//
	//  Methods
	//
	//--------------------------------------------------------------------------

	/**
	 * Adds a parameter to the function's parameter list.
	 * 
	 * @param name The <code>String</code> name of the parameter to add.
	 * @param type The <code>String</code> type of the parameter (may include
	 * a period for a qualified type).
	 * @param defaultValue The <code>String</code> default value of the type.
	 * This is the value found after the <code>=</code> sign.
	 * @return A new <code>IParameter</code> instance or throws and error if a
	 * parameter is found with the same name.
	 * @throws org.as3commons.asblocks.ASBlocksSyntaxError 
	 * a parameter name already exists
	 */
	public IASParameter addParameter(String name, String type,
			String defaultValue);
	
	/**
	 * @see #addParameter(String, String, String)
	 */
	public IASParameter addParameter(String name, String type);

	/**
	 * Removes a parameter from the function's parameter list.
	 * 
	 * @param name The <code>String</code> name of the parameter to remove.
	 * @return A <code>IParameter</code> instance if removed or <code>null</code> 
	 * if the parameter was not found. 
	 */
	public IASParameter removeParameter(String name);

	/**
	 * Adds a rest parameter to the end of the function's parameter list.
	 * 
	 * @param name The <code>String</code> name of the rest parameter to add.
	 * @return A new <code>IParameter</code> instance or throws and error if a
	 * rest parameter already exists.
	 * @throws org.as3commons.asblocks.ASBlocksSyntaxError 
	 * only one rest parameter allowed
	 */
	public IASParameter addRestParameter(String name);

	/**
	 * Removes the rest parameter from the function's parameter list.
	 * 
	 * @return A <code>IParameter</code> instance if the rest removed or 
	 * <code>null</code> if the rest parameter was not found. 
	 */
	//	IParameter removeRestParameter();

	/**
	 * Returns an <code>IParameter</code> instance by name.
	 * 
	 * @param name The <code>String</code> name of the parameter.
	 * @return An <code>IParameter</code> instance the same name or <code>null</code>
	 * if not found.
	 */
	//	IParameter getParameter(String name);

	/**
	 * Returns a <code>Boolean</code> indicating whether the function contains
	 * a parameter by name.
	 * 
	 * @param name The <code>String</code> name of the parameter.
	 * @return A <code>Boolean</code> indicating whether the parameter exists.
	 */
	//	boolean hasParameter(String name);

	/**
	 * Returns a <code>Boolean</code> indicating whether the function contains
	 * a rest parameter.
	 * 
	 * @return A <code>Boolean</code> indicating whether the rest parameter exists.
	 */
	//	boolean hasRestParameter();	
}
