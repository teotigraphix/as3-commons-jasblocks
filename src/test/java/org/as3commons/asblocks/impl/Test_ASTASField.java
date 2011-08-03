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

import junit.framework.TestCase;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.Visibility;

public class Test_ASTASField extends TestCase
{

	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASField field;

	protected void setUp()
	{
		unit = fact.newClass("Test");
		IASClassType clazz = (IASClassType) unit.getType();
		field = clazz.newField("test", Visibility.PUBLIC, "Bar");
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	public void testParent()
	{
		assertTrue(field.getParent() instanceof IASClassType);
	}

	public void test_hasModifier()
	{
		assertTrue(field.hasModifier("public"));
		assertFalse(field.hasModifier("static"));
		field.setStatic(true);
		assertTrue(field.hasModifier("static"));
		field.setVisibility(Visibility.PRIVATE);
		assertFalse(field.hasModifier("public"));
		assertTrue(field.hasModifier("private"));
		assertTrue(field.hasModifier("static"));
	}

	public void testName()
	{
		assertEquals("test", field.getName());
		field.setName("foobar");
		assertEquals("foobar", field.getName());
		try
		{
			field.setName("bad.name");
			fail("should not have accepted field name containing '.'");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	public void testNamespaceVisibility()
	{
		assertFalse("new fields should not have namespace by default", field.hasNamespaceVisibility());
		field.setNamespaceVisibility("my_space");
		assertTrue("changing to namespace failed", field.hasNamespaceVisibility());
		assertEquals("my_space", field.getNamespaceVisibility());
		// change to protected
		field.setVisibility(Visibility.PROTECTED);
		assertFalse("namespace not deleted when chaning to protected", field.hasNamespaceVisibility());
		// add static
		field.setStatic(true);
		assertTrue("setting static when just removed namespace failed", field.isStatic());
		field.setNamespaceVisibility("my_universe");
		assertTrue(field.isStatic());
		assertTrue(field.hasNamespaceVisibility());
		assertEquals("my_universe", field.getNamespaceVisibility());
		// change const (shouldn't even affect it) don't think this is legal
		field.setConstant(true);
		assertTrue(field.isStatic());
		assertTrue(field.hasNamespaceVisibility());
		assertTrue(field.isConstant());
		assertEquals("my_universe", field.getNamespaceVisibility());
	}

	public void testStatic()
	{
		assertFalse("new fields should be non-static by default", field.isStatic());
		field.setStatic(false);
		assertFalse("seting non-static when already non-static should be ok", field.isStatic());
		field.setStatic(true);
		assertTrue("changing to static failed", field.isStatic());
		field.setStatic(true);
		assertTrue("static static when already static didn't work", field.isStatic());
		field.setStatic(false);
		assertFalse("removing static again didn't work", field.isStatic());
	}

	public void testInit() throws IOException
	{
		// should no none to start with,
		assertNull(field.getInitializer());
		/*
		field.setInitializer(fact.newStringLiteral("foo"));
		assertTrue(field.getInitializer() instanceof ASStringLiteral);

		field.setInitializer("1");
		assertTrue(field.getInitializer() instanceof ASIntegerLiteral);

		field.setInitializer((String)null);  // remove it again
		assertNull(field.getInitializer());

		field.setInitializer((Expression)null);  // when already absent
		

		// complicated initialiser value,
		field.setInitializer("function() { trace('test'); }");
		*/
		CodeMirror.assertReflection(fact, unit);
	}

	public void testRenameWithInit()
	{
		/*
		field.setInitializer(fact.newStringLiteral("foo"));
		assertTrue(field.getInitializer() instanceof ASStringLiteral);

		field.setName("foo");
		// renaming the field should cause the initialiser to vanish
		assertNotNull(field.getInitializer());
		*/
	}

	public void testDocComment()
	{
	}

	public void testType()
	{
		assertEquals("Bar", field.getType());
		// overwrite the old type,
		field.setType("Foo");
		assertEquals("Foo", field.getType());

		field.setType(null);
		assertNull(field.getType());
		field.setType(null); // when already absent

		field.setType("Foo");
		assertEquals("Foo", field.getType());

	}

	public void testNamespace()
	{
		assertFalse(field.isNamespace());
		field.setNamespace(true);
		assertTrue(field.isNamespace());
		field.setNamespace(false);
		assertFalse(field.isNamespace());

		// set it to the value it already has,
		field.setNamespace(false);
		assertFalse(field.isNamespace());
		
		IASField ns1 = ((IASClassType)unit.getType()).newField("my_namespace", Visibility.PROTECTED, null);
		assertFalse(ns1.isNamespace());
		ns1.setNamespace(true);
		ns1.setInitializer(fact.newStringLiteral("foo/bar"));
		assertTrue(ns1.isNamespace());
	}

	public void testConst()
	{
		assertFalse(field.isConstant());
		field.setConstant(true);
		assertTrue(field.isConstant());
		field.setConstant(false);
		assertFalse(field.isConstant());

		// set it to the value it already has,
		field.setConstant(false);
		assertFalse(field.isConstant());
	}

	public void testConstSerialisation() throws IOException
	{
		field.setConstant(true);
		field.setName("renamed");
		unit = CodeMirror.assertReflection(fact, unit);
		field = ((IASClassType) unit.getType()).getField("renamed");
		assertNotNull(field);
		assertTrue(field.isConstant());
	}
}