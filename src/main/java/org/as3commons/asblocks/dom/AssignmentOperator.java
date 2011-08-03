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

import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

/**
 * An assignment operator for the <code>IASAssignmentExpression</code>.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.IASAssignmentExpression
 */
public enum AssignmentOperator
{
	/**
	 * +=
	 */
	ADD_ASSIGN(AS3Parser.PLUS_ASSIGN, "+="),
	
	/**
	 * =
	 */
	ASSIGN(AS3Parser.ASSIGN, "="),
	
	/**
	 * &=
	 */
	BITAND_ASSIGN(AS3Parser.BAND_ASSIGN, "&="),
	
	/**
	 * |=
	 */
	BITOR_ASSIGN(AS3Parser.BOR_ASSIGN, "|="),
	
	/**
	 * ^=
	 */
	BITXOR_ASSIGN(AS3Parser.BXOR_ASSIGN, "^="),
	
	/**
	 * /=
	 */
	DIV_ASSIGN(AS3Parser.DIV_ASSIGN, "/="),
	
	/**
	 * %=
	 */
	MOD_ASSIGN(AS3Parser.MOD_ASSIGN, "%="),
	
	/**
	 * *=
	 */
	MUL_ASSIGN(AS3Parser.STAR_ASSIGN, "*="),
	
	/**
	 * &lt;&lt;=
	 */
	SL_ASSIGN(AS3Parser.SL_ASSIGN, "<<="),
	
	/**
	 * &gt;&gt;=
	 */
	SR_ASSIGN(AS3Parser.SR_ASSIGN, ">>="),
	
	/**
	 * &gt;&gt;&gt;=
	 */
	SRU_ASSIGN(AS3Parser.BSR_ASSIGN, ">>>="),
	
	/**
	 * -=
	 */
	SUB_ASSIGN(AS3Parser.MINUS_ASSIGN, "-=");
	
	/**
	 * @private
	 */
	private final int type;
	
	/**
	 * @private
	 */
	private final String operator;
		
	
	/**
	 * @private
	 */
	AssignmentOperator(int type, String operator)
	{
		this.type = type;
		this.operator = operator;
	}
	
	/**
	 * Returns the operator.
	 */
	public String getOperator()
	{
		return operator;
	}
	
	/**
	 * The AS3Parser type.
	 */
	public int getType()
	{
		return type;
	}
}
