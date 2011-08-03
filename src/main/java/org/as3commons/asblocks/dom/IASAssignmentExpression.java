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
 * An assignment expression; <code>a = b;</code>, <code>a += b;</code>
 * or <code>a -= b;</code>.
 * 
 * <pre>
 * IASExpression left = factory.newExpression("myAnswer");
 * IASExpression right = factory.newExpression("4");
 * IASAssignmentExpression expression = factory.newAssignmentExpression(left, right);
 * </pre>
 * 
 * <p>Will produce <code>myAnswer = 4</code>.</p>
 * 
 * <pre>
 * IASExpression left = factory.newExpression("myAnswer");
 * IASExpression right = factory.newExpression("4");
 * IASAssignmentExpression expression = factory.newAssignmentExpression(left, right);
 * expression.setRightExpression(factory.newExpression("otherAnswer = 4"));
 * </pre>
 * 
 * <p>Will produce <code>myAnswer = otherAnswer = 4</code>.</p>
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.AssignmentOperator
 * 
 * @see org.as3commons.asblocks.ASFactory#newAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newAddAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newBitAndAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newBitOrAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newBitXorAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newDivideAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newModuloAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newMultiplyAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newShiftLeftAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newShiftRightAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newShiftRightUnsignedAssignExpression(IASExpression, IASExpression)
 * @see org.as3commons.asblocks.ASFactory#newSubtractAssignExpression(IASExpression, IASExpression)
 */
public interface IASAssignmentExpression extends IASExpression
{
	//--------------------------------------------------------------------------
	//
	//  Properties
	//
	//--------------------------------------------------------------------------
	
	//----------------------------------
	//  leftExpression
	//----------------------------------
	
	/**
	 * The <code>IASExpression</code> contained on the left side of the assignment.
	 */
	public IASExpression getLeftExpression();
	
	/**
	 * @see #getLeftExpression()
	 */
	public void setLeftExpression(IASExpression value);
	
	//----------------------------------
	//  operator
	//----------------------------------
	
	/**
	 * The assignment's operator eg; <code>=</code>, <code>+=</code>,
	 * <code>&=</code>, ect.
	 */
	public AssignmentOperator getOperator();
	
	/**
	 * @see #getOperator()
	 */
	public void setOperator(AssignmentOperator value);
	
	//----------------------------------
	//  rightExpression
	//----------------------------------
	
	/**
	 * The <code>IASExpression</code> contained on the right side of the assignment.
	 */
	public IASExpression getRightExpression();
	
	/**
	 * @see #setRightExpression()
	 */
	public void setRightExpression(IASExpression value);
}
