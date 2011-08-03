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
 * An assignment operator for the <code>IASBinaryExpression</code>.
 * 
 * @author Michael Schmalle
 * @copyright Teoti Graphix, LLC
 * @since 1.0
 * 
 * @see org.as3commons.asblocks.dom.IASBinaryExpression
 */
public enum BinaryOperator
{
	/**
	 * +
	 */
	ADD(AS3Parser.PLUS, "+"),

	/**
	 * &amp;&amp;
	 */
	AND(AS3Parser.LAND, "&&"),

	/**
	 * &amp;
	 */
	BITAND(AS3Parser.BAND, "&"),

	/**
	 * |
	 */
	BITOR(AS3Parser.BOR, "|"),

	/**
	 * ^
	 */
	BITXOR(AS3Parser.BXOR, "^"),

	/**
	 * /
	 */
	DIV(AS3Parser.DIV, "/"),

	/**
	 * ==
	 */
	EQ(AS3Parser.EQUAL, "=="),

	/**
	 * &gt;=
	 */
	GE(AS3Parser.GE, ">="),

	/**
	 * &gt;
	 */
	GT(AS3Parser.GT, ">"),

	/**
	 * &lt;=
	 */
	LE(AS3Parser.LE, "<="),

	/**
	 * &lt;
	 */
	LT(AS3Parser.LT, "<"),

	/**
	 * %
	 */
	MOD(AS3Parser.MOD, "%"),

	/**
	 * *
	 */
	MUL(AS3Parser.MULT, "*"),

	/**
	 * !=
	 */
	NE(AS3Parser.NOT_EQUAL, "!="),

	/**
	 * ||
	 */
	OR(AS3Parser.LOR, "||"),

	/**
	 * &lt;&lt;
	 */
	SL(AS3Parser.SL, "<<"),

	/**
	 * &gt;&gt;&gt;
	 */
	SR(AS3Parser.SR, ">>"),

	/**
	 * &gt;&gt;
	 */
	SRU(AS3Parser.BSR, ">>>"),

	/**
	 * -
	 */
	SUB(AS3Parser.MINUS, "-");

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
	BinaryOperator(int type, String operator)
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
