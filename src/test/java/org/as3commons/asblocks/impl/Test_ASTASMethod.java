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
import java.util.List;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.AccessorRole;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASParameter;
import org.as3commons.asblocks.dom.Visibility;

import junit.framework.TestCase;

public class Test_ASTASMethod extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASClassType clazz;
	private IASMethod meth;

	protected void setUp()
	{
		unit = fact.newClass("Test");
		clazz = (IASClassType) unit.getType();
		meth = clazz.newMethod("test", Visibility.PUBLIC, null);
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	public void testParent()
	{
		assertTrue(meth.getParent() instanceof IASClassType);
	}
	
	public void testNamespace()
	{
		assertFalse("new fields should not have namespace by default",
				meth.hasNamespaceVisibility());
		meth.setNamespaceVisibility("my_space");
		assertTrue("changing to namespace failed", meth.hasNamespaceVisibility());
		assertEquals("my_space", meth.getNamespaceVisibility());
		// change to protected
		meth.setVisibility(Visibility.PROTECTED);
		assertFalse("namespace not deleted when chaning to protected",
				meth.hasNamespaceVisibility());
		// add static
		meth.setStatic(true);
		assertTrue("setting static when just removed namespace failed",
				meth.isStatic());
		meth.setNamespaceVisibility("my_universe");
		assertTrue(meth.isStatic());
		assertTrue(meth.hasNamespaceVisibility());
		assertEquals("my_universe", meth.getNamespaceVisibility());
		// change const (shouldn't even affect it) don't think this is legal
		meth.setOverride(true);
		assertTrue(meth.isStatic());
		assertTrue(meth.hasNamespaceVisibility());
		assertTrue(meth.isOverride());
		assertEquals("my_universe", meth.getNamespaceVisibility());
	}
	
	public void test_name()
	{
		assertEquals("test", meth.getName());
		meth.setName("foobar");
		assertEquals("foobar", meth.getName());
		try
		{
			meth.setName("bad.name");
			fail("should not have accepted method name containing '.'");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
		try
		{
			meth.setName("bad:name");
			fail("should not have accepted method name containing ':'");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	public void test_static()
	{
		assertFalse("new methods should be non-static by default", meth.isStatic());
		meth.setStatic(false);
		assertFalse(meth.isStatic());
		meth.setStatic(true);
		assertTrue(meth.isStatic());
		meth.setStatic(true);
		assertTrue(meth.isStatic());
	}

	public void test_accessorRole()
	{
		assertEquals(AccessorRole.NORMAL, meth.getAccessorRole());
		// now add a role,
		meth.setAccessorRole(AccessorRole.GETTER);
		assertEquals(AccessorRole.GETTER, meth.getAccessorRole());
		// change existing role to set
		meth.setAccessorRole(AccessorRole.SETTER);
		assertEquals(AccessorRole.SETTER, meth.getAccessorRole());
		// change existing role to get
		meth.setAccessorRole(AccessorRole.GETTER);
		assertEquals(AccessorRole.GETTER, meth.getAccessorRole());

		// check the AST internals didn't get mangled along the way,
		assertEquals("test", meth.getName());

		meth.setAccessorRole(AccessorRole.NORMAL);
		assertEquals(AccessorRole.NORMAL, meth.getAccessorRole());

		// now add a role back in, but this time as a setter
		meth.setAccessorRole(AccessorRole.SETTER);
		assertEquals(AccessorRole.SETTER, meth.getAccessorRole());

		// squeeze out the last bit of code coverage,
		assertEquals("NORMAL", AccessorRole.NORMAL.toString());
		assertEquals("GETTER", AccessorRole.GETTER.toString());
		assertEquals("SETTER", AccessorRole.SETTER.toString());
	}

	public void test_type() throws IOException
	{
		assertNull(meth.getType());
		meth.setType("pkg.Clazz");
		assertEquals("pkg.Clazz", meth.getType());
		// "void" is a keyword, rather than an IDENT
		meth.setType("void");
		assertEquals("void", meth.getType());
		IASCompilationUnit reflectedUnit = CodeMirror.assertReflection(fact,
				unit);
		IASMethod reflectedMethod = ((IASClassType) reflectedUnit.getType())
				.getMethod(meth.getName());
		assertEquals("void", reflectedMethod.getType());
		meth.setType(null);
		assertNull(meth.getType());
	}

	public void test_protection()
	{
		assertVisibility(Visibility.PUBLIC, meth);
		meth.setVisibility(Visibility.PRIVATE);
		assertVisibility(Visibility.PRIVATE, meth);
		meth.setVisibility(Visibility.PROTECTED);
		assertVisibility(Visibility.PROTECTED, meth);
		meth.setVisibility(Visibility.INTERNAL);
		assertVisibility(Visibility.INTERNAL, meth);
		meth.setVisibility(Visibility.PUBLIC);
		assertVisibility(Visibility.PUBLIC, meth);

		checkSetVisibilityAfterDefault(meth, Visibility.PRIVATE);
		checkSetVisibilityAfterDefault(meth, Visibility.PUBLIC);
		checkSetVisibilityAfterDefault(meth, Visibility.PROTECTED);
		checkSetVisibilityAfterDefault(meth, Visibility.INTERNAL);

		// see what happens when there is no visibility modifier, but
		// there *is* some other kind of modifier keyword,
		meth.setVisibility(Visibility.DEFAULT);
		meth.setStatic(true);
		assertVisibility(Visibility.DEFAULT, meth);

		meth.setVisibility(Visibility.PUBLIC);
		assertVisibility(Visibility.PUBLIC, meth);
		try
		{
			meth.setVisibility(null);
			fail("should reject 'null' visibility");
		}
		catch (Exception e)
		{
			// expected
		}

		// squeeze out the last bit of code coverage,
		assertEquals("public", Visibility.PUBLIC.getName());
		assertEquals("private", Visibility.PRIVATE.getName());
		assertEquals("protected", Visibility.PROTECTED.getName());
		assertEquals("internal", Visibility.INTERNAL.getName());
		assertEquals("[default]", Visibility.DEFAULT.getName());
	}

	private static void assertVisibility(Visibility expectedVisibility,
											IASMethod method)
	{
		assertSame(expectedVisibility, method.getVisibility());
	}

	private static void checkSetVisibilityAfterDefault(IASMethod method,
														Visibility visibility)
	{
		method.setVisibility(Visibility.DEFAULT);
		assertVisibility(Visibility.DEFAULT, method);
		method.setVisibility(visibility);
		assertVisibility(visibility, method);
	}

	public void test_protectionOnCreate()
	{
		meth = clazz.newMethod("testDefault", Visibility.DEFAULT, null);
		assertVisibility(Visibility.DEFAULT, meth);
		meth = clazz.newMethod("testPublic", Visibility.PUBLIC, null);
		assertVisibility(Visibility.PUBLIC, meth);
		meth = clazz.newMethod("testPrivate", Visibility.PRIVATE, null);
		assertVisibility(Visibility.PRIVATE, meth);
		meth = clazz.newMethod("testProtected", Visibility.PROTECTED, null);
		assertVisibility(Visibility.PROTECTED, meth);
		meth = clazz.newMethod("testInternal", Visibility.INTERNAL, null);
		assertVisibility(Visibility.INTERNAL, meth);
	}

	public void test_parameters() throws IOException
	{
		IASParameter foo = meth.addParameter("foo", "Number");
		assertEquals("foo", foo.getName());
		assertEquals("Number", foo.getType());
		foo.setDefaultValue("null");
		foo.setDefaultValue("1"); // reset existing value 
		assertEquals("1", foo.getDefaultValue());
		foo.setDefaultValue(null); // remove value
		try
		{
			foo.setDefaultValue("]");
			fail("should have rejected invalid initializer value");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
		assertNull(foo.getDefaultValue());
		meth.addParameter("bar", null);
		meth.addParameter("blat", null);
		List<IASParameter> args = meth.getParameters();
		assertEquals(3, args.size());
		IASParameter arg0 = (IASParameter) args.get(0);
		assertEquals("foo", arg0.getName());
		assertEquals("Number", arg0.getType());
		assertEquals("foo:Number", arg0.toString());
		arg0.setType("String");
		assertEquals("String", arg0.getType());
		arg0.setType(null);
		assertNull(arg0.getType());
		assertEquals("foo", arg0.toString());
		IASParameter arg1 = (IASParameter) args.get(1);
		assertEquals("bar", arg1.getName());
		assertEquals("bar", arg1.toString());
		assertNull(arg1.getType());
		IASParameter arg2 = (IASParameter) args.get(2);
		arg2.setType("*");
		assertEquals("*", arg2.getType());
		assertEquals("bar", meth.removeParameter("bar").getName());
		assertEquals(2, meth.getParameters().size());
		assertNull(meth.removeParameter("missing"));
		assertEquals(2, meth.getParameters().size());

		IASCompilationUnit unit2 = CodeMirror.assertReflection(fact, unit);
		IASClassType type2 = (IASClassType) unit2.getType();
		IASMethod meth2 = type2.getMethod("test");
		List<IASParameter> args2 = meth2.getParameters();
		IASParameter bar2 = (IASParameter) args2.get(1);
		assertEquals("blat", bar2.getName());
		assertEquals("*", bar2.getType());
	}

	public void test_removeLastParameter()
	{
		meth.addParameter("foo", "Number");
		meth.addRestParameter("bar");
		meth.removeParameter("bar");
		assertEquals(1, meth.getParameters().size());
	}

	public void test_restParameter()
	{
		IASParameter foo = meth.addParameter("foo", "Number");
		assertFalse(foo.isRest());
		IASParameter bar = meth.addRestParameter("bar");
		assertTrue(bar.isRest());
		meth.removeParameter("bar");
		assertEquals(1, meth.getParameters().size());
		IASParameter rest = meth.addRestParameter("..."); // no name
		assertEquals("...", rest.getName());
		meth.removeParameter("...");
		assertEquals(1, meth.getParameters().size());

		rest = meth.addRestParameter("...");
		try
		{
			rest.setDefaultValue("12");
			fail("should not have been able to set a default value for a 'rest' parameter");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
		assertEquals(2, meth.getParameters().size());
	}

	public void test_docComment()
	{
	}
}