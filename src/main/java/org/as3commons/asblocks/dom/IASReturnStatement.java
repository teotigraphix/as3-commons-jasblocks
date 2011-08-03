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

/**
 * A return statement with optional expression; <code>return;</code> or 
 * <code>return expression;</code>.
 * 
 * <pre>
 * IASBlock block = factory.newBlock();
 * IASReturnStatement cs = block.newReturn();
 * </pre>
 * 
 * <p>Will produce;</p>
 * <pre>
 * {
 *     return;
 * }
 * </pre>
 * 
 * <pre>
 * IASBlock block = factory.newBlock();
 * IASReturnStatement cs = block.parseNewReturn("foo[bar]");
 * </pre>
 * 
 * <p>Will produce;</p>
 * <pre>
 * {
 *     return foo[bar];
 * }
 * </pre>
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.IStatementContainer#newReturn()
 * @see org.as3commons.asblocks.dom.IStatementContainer#newReturn(IASExpression)
 * @see org.as3commons.asblocks.dom.IStatementContainer#parseNewReturn(String)
 */
public interface IASReturnStatement extends IASStatement
{
	//--------------------------------------------------------------------------
	//
	//  Properties
	//
	//--------------------------------------------------------------------------
	
	//----------------------------------
	//  expression
	//----------------------------------
	
	/**
	 * The return expression if any.
	 */
	public IASExpression getExpression();
	
	/**
	 * @see #getExpression()
	 * 
	 * @param value The <code>IASExpression</code>.
	 */
	public void setExpression(IASExpression value);
	
	/**
	 * Parses the <code>String</code> expression into an <code>IASExpression</code>.
	 * @param value The <code>String</code> expression.
	 */
	public void parseExpression(String value);
	
	/**
	 * Returns the <code>IASExpression</code> as a <code>String</code>.
	 * 
	 * @return The <code>IASExpression</code> <code>String</code> value.
	 */
	public String getExpressionString();
}
