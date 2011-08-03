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

import junit.framework.TestCase;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.IASImportStatement;
import org.as3commons.asblocks.dom.IASIncludeStatement;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASType;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.dom.Visibility;

public class Test_ASTASClassType extends TestCase
{

	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASPackage pckg;
	private IASClassType clazz;

	protected void setUp()
	{
		ASFactory fact = new ASFactory();
		unit = fact.newClass("Test");
		pckg = (IASPackage) unit.getPackage();
		clazz = (IASClassType) unit.getType();
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	public void testParent()
	{
		assertTrue(clazz.getParent() instanceof IASPackage);
	}
	
	public void test_newImp()
	{
		pckg.parseImport("foo.bar");
		pckg.parseImport("foo");
		pckg.parseImport("foo.bar.baz.*");
		
		assertEquals(3, pckg.getImports().size());
		assertEquals("foo.bar", pckg.getImports().get(0).getTargetString());
		assertEquals("foo", pckg.getImports().get(1).getTargetString());
		assertEquals("foo.bar.baz.*", pckg.getImports().get(2).getTargetString());
		
		IASImportStatement statement = pckg.removeImport("foo.bar");
		assertNotNull(statement);
		
		assertEquals(2, pckg.getImports().size());
		assertEquals("foo", pckg.getImports().get(0).getTargetString());
		assertEquals("foo.bar.baz.*", pckg.getImports().get(1).getTargetString());
		
		IASImportStatement e1 = pckg.getImports().get(0);
		e1.parseTarget("foo.Baz");
		assertEquals("foo.Baz", e1.getTargetString());
	}

	public void test_newUse()
	{
		pckg.parseUse("the_universe");
		pckg.parseUse("life");
		pckg.parseUse("and_everything");
		
		assertEquals(3, pckg.getUses().size());
		assertEquals("the_universe", pckg.getUses().get(0).getName());
		assertEquals("life", pckg.getUses().get(1).getName());
		assertEquals("and_everything", pckg.getUses().get(2).getName());
		
		IASUseStatement statement = pckg.removeUse("life");
		assertNotNull(statement);
		
		assertEquals(2, pckg.getUses().size());
		assertEquals("the_universe", pckg.getUses().get(0).getName());
		assertEquals("and_everything", pckg.getUses().get(1).getName());
		
		IASUseStatement e1 = pckg.getUses().get(0);
		e1.setName("the_universe_and_everything");
		assertEquals("the_universe_and_everything", e1.getName());		
	}
	
	public void test_newInclude()
	{
		pckg.parseInclude("my.as");
		pckg.parseInclude("your.as");
		pckg.parseInclude("../../their/other.as");
		
		assertEquals(3, pckg.getIncludes().size());
		assertEquals("my.as", pckg.getIncludes().get(0).getTargetString());
		assertEquals("your.as", pckg.getIncludes().get(1).getTargetString());
		assertEquals("../../their/other.as", pckg.getIncludes().get(2).getTargetString());
		
		IASIncludeStatement statement = pckg.removeInclude("my.as");
		assertNotNull(statement);
		
		assertEquals(2, pckg.getIncludes().size());
		assertEquals("your.as", pckg.getIncludes().get(0).getTargetString());
		assertEquals("../../their/other.as", pckg.getIncludes().get(1).getTargetString());
		
		IASIncludeStatement e1 = pckg.getIncludes().get(0);
		e1.parseTarget("your/other.as");
		assertEquals("your/other.as", e1.getTargetString());
	}
	
	public void testName()
	{
		assertEquals("Test", clazz.getName());
		clazz.setName("Another");
		assertEquals("Another", clazz.getName());
	}

	public void testMethods()
	{
		IASMethod foo = clazz.newMethod("foo", Visibility.PUBLIC, null);
		clazz.newMethod("removeme", Visibility.PUBLIC, null);
		clazz.newMethod("bar", Visibility.PUBLIC, null);

		clazz.removeMethod("removeme");

		List<IASMethod> methods = clazz.getMethods();
		assertEquals(2, methods.size());
		IASMethod meth0 = (IASMethod) methods.get(0);
		assertEquals("foo", meth0.getName());
		IASMethod meth1 = (IASMethod) methods.get(1);
		assertEquals("bar", meth1.getName());

		assertEquals(foo.getName(), clazz.getMethod("foo").getName());
		assertNull(clazz.getMethod("missing"));

		// no exception should be raised,
		clazz.removeMethod("missing");
	}

	public void testFields()
	{
		clazz.newField("foo", Visibility.PUBLIC, null);
		clazz.newField("removeme", Visibility.PUBLIC, null);
		clazz.newField("bar", Visibility.PRIVATE, "Boolean");

		assertEquals("foo", clazz.getField("foo").getName());

		assertEquals(3, clazz.getFields().size());
		clazz.removeField("removeme");

		List<IASField> fields = clazz.getFields();
		assertEquals(2, fields.size());

		IASField field0 = (IASField) fields.get(0);
		assertEquals("foo", field0.getName());
		IASField field1 = (IASField) fields.get(1);
		assertEquals("bar", field1.getName());

		assertEquals(null, clazz.getField("missing"));
		
		// check no exception raised,
		clazz.removeField("missing");
	}

	public void testSuper() throws IOException
	{
		assertNull(clazz.getSuperClass());
		clazz.setSuperClass("com.example.SuperTest");
		assertEquals("com.example.SuperTest", clazz.getSuperClass());
		// replace the original type name,
		clazz.setSuperClass("SuperTest");
		CodeMirror.assertReflection(fact, unit);
		clazz.setSuperClass(null);
		assertNull(clazz.getSuperClass());
	}

	public void testImplements()
	{
		assertEquals(0, clazz.getImplementedInterfaces().size());
		clazz.addImplementedInterface("InterfaceTestA");
		clazz.addImplementedInterface("InterfaceTestB");
		clazz.addImplementedInterface("pkg.InterfaceTestC");

		assertEquals(3, clazz.getImplementedInterfaces().size());
		clazz.removeImplementedInterface("InterfaceTestB");

		List<String> interfaces = clazz.getImplementedInterfaces();
		assertEquals(2, interfaces.size());
		String interface0 = (String) interfaces.get(0);
		assertEquals("InterfaceTestA", interface0);
		String interface1 = (String) interfaces.get(1);
		assertEquals("pkg.InterfaceTestC", interface1);
	}

	public void testRemoveImplements()
	{
		clazz.addImplementedInterface("InterfaceTest");
		clazz.removeImplementedInterface("InterfaceTest");
		// tearDown() will assert that the code still parses, which
		// it shouldn't do if the interface name is removed, but the
		// 'implements' keyword isn't.
	}

	public void testDocComment()
	{
	}

	public void testPackage()
	{
		assertNull(unit.getPackageName());
		unit.setPackageName("test.foo");
		assertEquals("test.foo", unit.getPackageName());
		unit.setPackageName("test.bar");
		assertEquals("test.bar", unit.getPackageName());
		unit.setPackageName(null);
		assertNull(unit.getPackageName());
	}

	public void testVisibility()
	{
		assertEquals(Visibility.PUBLIC, clazz.getVisibility());
		clazz.setVisibility(Visibility.DEFAULT);
		assertEquals(Visibility.DEFAULT, clazz.getVisibility());
	}

	public void testDynamic()
	{
		assertFalse(clazz.isDynamic());
		clazz.setDynamic(false);
		// set false when already false,
		assertFalse(clazz.isDynamic());
		clazz.setDynamic(true);
		assertTrue(clazz.isDynamic());
		// set true when already true,
		clazz.setDynamic(true);
		assertTrue(clazz.isDynamic());
	}

	public void testFinal()
	{
		assertFalse(clazz.isFinal());
		clazz.setFinal(false);
		// set false when already false,
		assertFalse(clazz.isFinal());
		clazz.setFinal(true);
		assertTrue(clazz.isFinal());
		// set true when already true,
		clazz.setFinal(true);
		assertTrue(clazz.isFinal());
	}

	public void testRemoveModifiers()
	{
		// set the 'final' keyword
		clazz.setFinal(true);
		// remove the 'public' keyword added by default in setUp()
		clazz.setVisibility(Visibility.DEFAULT);
		// now, test removing the 'final' flag, which should also be
		// the only remaining modifier,
		clazz.setFinal(false);
	}

	public void testImports() throws IOException
	{
		IASCompilationUnit unit = fact.newClass("Test");

		IASType type = unit.getType();
		assertEquals(0, type.getImports().size());

		type.parseImport("foo.bar.Baz");
		assertEquals(1, type.getImports().size());
		assertEquals("foo.bar.Baz", type.getImports().get(0).getTargetString());

		type.parseImport("foo.bar.*");
		assertEquals(2, type.getImports().size());
		assertEquals("foo.bar.Baz", type.getImports().get(0).getTargetString());
		assertEquals("foo.bar.*", type.getImports().get(1).getTargetString());

		assertNotNull(type.removeImport("foo.bar.Baz"));
		assertEquals(1, type.getImports().size());
		assertEquals("foo.bar.*", type.getImports().get(0).getTargetString());

		assertNull(type.removeImport("missing"));

		assertNotNull(type.removeImport("foo.bar.*"));
		assertEquals(0, type.getImports().size());

	}

	public void testInvalidImport()
	{
		IASCompilationUnit unit = fact.newClass("Test");

		IASType type = unit.getType();

		try
		{
			type.parseImport("--invalid code--");
			fail("should have failed on invalid import");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}
}