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

import java.io.IOException;

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASArrayLiteral;
import org.as3commons.asblocks.dom.IASAssignmentExpression;
import org.as3commons.asblocks.dom.IASBooleanLiteral;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASIntegerLiteral;
import org.as3commons.asblocks.dom.IASLiteral;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASNullLiteral;
import org.as3commons.asblocks.dom.IASObjectLiteral;
import org.as3commons.asblocks.dom.IASPropertyField;
import org.as3commons.asblocks.dom.IASRegexpLiteral;
import org.as3commons.asblocks.dom.IASStringLiteral;
import org.as3commons.asblocks.dom.IASUndefinedLiteral;
import org.as3commons.asblocks.dom.IASXMLLiteral;
import org.as3commons.asblocks.dom.Visibility;

import junit.framework.TestCase;

public class Test_ASTASLiteral extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASCompilationUnit reflect;
	private IASLiteral literal = null;

	protected void setUp()
	{
		unit = fact.newClass("Test");
		reflect = null;
		literal = null;
	}

	protected void tearDown() throws IOException
	{
		if (literal != null && reflect == null)
		{
			IASClassType clazz = (IASClassType) unit.getType();
			IASMethod meth = clazz.newMethod("test", Visibility.PUBLIC, null);
			//	    meth.newExprStmt(fact.newAssignExpression(
			//		    fact.newExpression(getName()), literal));
			reflect = assertReflection();
		}
	}

	private IASCompilationUnit assertReflection() throws IOException
	{
		return CodeMirror.assertReflection(fact, unit);
	}

	public void testStringLiteral()
	{
		IASStringLiteral lit = fact.newStringLiteral("");
		assertEquals("", lit.getValue());
		lit.setValue("\"");
		assertEquals("\"", lit.getValue());
		literal = lit;
	}

	public void testNumberLiteral()
	{
		IASIntegerLiteral lit = fact.newIntegerLiteral(123);
		assertEquals(123, lit.getValue());
		lit.setValue(0);
		assertEquals(0, lit.getValue());
		literal = lit;
	}

	public void testNullLiteral()
	{
		IASNullLiteral lit = fact.newNullLiteral();
		assertNotNull(lit);
		literal = lit;
	}

	public void testParseNullLiteral()
	{
		IASNullLiteral lit = (IASNullLiteral) fact.newExpression("null");
		assertNotNull(lit);
		literal = lit;
	}

	public void testBoolLiteral()
	{
		IASBooleanLiteral lit = fact.newBooleanLiteral(true);
		assertTrue(lit.getValue());
		lit.setValue(false);
		assertFalse(lit.getValue());

		lit = fact.newBooleanLiteral(false);
		assertFalse(lit.getValue());
		lit.setValue(true);
		assertTrue(lit.getValue());

		ExtraAssertions.assertInstanceof(fact.newExpression("true"), IASBooleanLiteral.class);
		literal = lit;
	}

	public void testUndefinedLiteral()
	{
		IASUndefinedLiteral lit = fact.newUndefinedLiteral();
		assertNotNull(lit);
		literal = lit;
	}

	public void testParseUndefinedLiteral()
	{
		IASUndefinedLiteral lit = (IASUndefinedLiteral) fact.newExpression("undefined");
		assertNotNull(lit);
		literal = lit;
	}

	public void testEmptyArrayLiteral()
	{
		IASArrayLiteral lit = fact.newArrayLiteral();
		assertNotNull(lit);
		ExtraAssertions.assertSize(0, lit.getEntries());
		literal = lit;
	}

	public void testArrayLiteral()
	{
		IASArrayLiteral lit = fact.newArrayLiteral();
		lit.add(fact.newIntegerLiteral(1));
		ExtraAssertions.assertSize(1, lit.getEntries());
		ExtraAssertions.assertInstanceof(lit.getEntries().get(0), IASIntegerLiteral.class);
		lit.add(fact.newStringLiteral("foo"));
		ExtraAssertions.assertSize(2, lit.getEntries());
		ExtraAssertions.assertInstanceof(lit.getEntries().get(1), IASStringLiteral.class);
		literal = lit;
	}

	public void testArrayLiteralRemoveFirst()
	{
		IASArrayLiteral lit = fact.newArrayLiteral();
		lit.add(fact.newIntegerLiteral(1));
		lit.add(fact.newStringLiteral("foo"));
		lit.remove(0);
		ExtraAssertions.assertSize(1, lit.getEntries());
		literal = lit;
	}

	public void testArrayLiteralRemoveLast()
	{
		IASArrayLiteral lit = fact.newArrayLiteral();
		lit.add(fact.newIntegerLiteral(1));
		lit.add(fact.newStringLiteral("foo"));
		lit.remove(1);
		ExtraAssertions.assertSize(1, lit.getEntries());
		literal = lit;
	}

	public void testArrayLiteralRemoveMiddle()
	{
		IASArrayLiteral lit = fact.newArrayLiteral();
		lit.add(fact.newIntegerLiteral(1));
		lit.add(fact.newStringLiteral("foo"));
		lit.add(fact.newBooleanLiteral(false));
		lit.remove(1);
		ExtraAssertions.assertSize(2, lit.getEntries());
		literal = lit;
	}

	public void testParseArrayLiteral()
	{
		literal = (IASArrayLiteral) fact.newExpression("['foo', [1]]");
		assertNotNull(literal);
	}

	public void testEmptyObjectLiteral()
	{
		IASObjectLiteral lit = fact.newObjectLiteral();
		assertNotNull(lit);
		ExtraAssertions.assertSize(0, lit.getFields());
		literal = lit;
	}

	public void testObjectLiteral()
	{
		IASObjectLiteral lit = fact.newObjectLiteral();
		IASPropertyField field = lit.newField("foo", fact.newIntegerLiteral(33));
		assertEquals("foo", field.getName());
		ExtraAssertions.assertInstanceof(field.getValue(), IASIntegerLiteral.class);
		field = lit.newField("bar", fact.newStringLiteral("hello"));
		literal = lit;
	}

	public void testParseObjectLiteral()
	{
		IASAssignmentExpression expr = (IASAssignmentExpression) fact.newExpression("test = {foo:2}");
		literal = (IASLiteral) expr.getRightExpression();
	}

	public void testXMLLiteral()
	{
		IASXMLLiteral lit = fact.newXMLLiteral("<hello>world</hello>");
		assertNotNull(lit);
		literal = lit;
	}

	public void testParseXMLLiteral()
	{
		IASXMLLiteral lit = (IASXMLLiteral) fact.newExpression("<hello>world</hello>");
		assertNotNull(lit);
		literal = lit;
	}

	public void testRegexpLiteral()
	{
		IASRegexpLiteral lit = fact.newRegexpLiteral("\\d+", ASTASRegexpLiteral.FLAG_NONE);
		assertNotNull(lit);
		literal = lit;
	}

	public void testParseRegexpLiteral()
	{
		IASRegexpLiteral lit = (IASRegexpLiteral) fact.newExpression("/[a-z]+-\\d+/i");
		assertNotNull(lit);
		literal = lit;
	}
}
