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
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASInterfaceType;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.Visibility;

import junit.framework.TestCase;

public class Test_ASTASInterfaceType extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASInterfaceType iface;

	protected void setUp()
	{
		ASFactory fact = new ASFactory();
		unit = fact.newInterface("Test");
		iface = (IASInterfaceType) unit.getType();
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	public void testParent()
	{
		assertTrue(iface.getParent() instanceof IASPackage);
	}
	
	public void testParse() throws IOException
	{
		String source = "package foo.bar {"
				+ " public interface Blat extends Bing,Bong {"
				+ " function func(arg:Number, foo):Boolean;"
				+ " }" + " }";
		StringReader reader = new StringReader(source);

		ASFactory fact = new ASFactory();
		IASCompilationUnit unit = fact.newParser().parseIn(reader);

		// check that everything looks as it should,
		assertEquals("foo.bar", unit.getPackageName());
		IASInterfaceType iface = (IASInterfaceType) unit.getType();
		assertEquals("Blat", iface.getName());

		assertEquals(Arrays.asList(new String[] { "Bing", "Bong" }),
				iface.getSuperInterfaces());

		IASMethod meth = iface.getMethod("func");
		assertNotNull(meth);
		assertEquals("func", meth.getName());

		// compare the re-serialised code with the original input,
		StringWriter writer = new StringWriter();
		fact.newWriter().write(writer, unit);
		assertEquals(source, writer.toString());
	}

	public void testName()
	{
		assertEquals("Test", iface.getName());
		iface.setName("Another");
		assertEquals("Another", iface.getName());
	}

	public void testMethods()
	{
		IASMethod foo = iface.newMethod("foo", Visibility.PUBLIC, null);
		iface.newMethod("removeme", Visibility.PUBLIC, null);
		iface.newMethod("bar", Visibility.PUBLIC, null);

		iface.removeMethod("removeme");

		List<IASMethod> methods = iface.getMethods();
		assertEquals(2, methods.size());
		IASMethod meth0 = (IASMethod) methods.get(0);
		assertEquals("foo", meth0.getName());
		IASMethod meth1 = (IASMethod) methods.get(1);
		assertEquals("bar", meth1.getName());

		assertEquals(foo.getName(), iface.getMethod("foo").getName());

		//		try
		//		{
		//			meth1.addStmt("helloWorld()");
		//			fail("adding code to interface method should fail");
		//		}
		//		catch (SyntaxException e)
		//		{
		//			// expected
		//		}
	}

	public void testSuper()
	{
		assertEquals(0, iface.getSuperInterfaces().size());
		iface.addSuperInterface("InterfaceTestA");
		iface.addSuperInterface("InterfaceTestB");
		iface.addSuperInterface("pkg.InterfaceTestC");

		assertEquals(3, iface.getSuperInterfaces().size());
		iface.removeSuperInterface("InterfaceTestB");

		List<String> interfaces = iface.getSuperInterfaces();
		assertEquals(2, interfaces.size());
		String interface0 = (String) interfaces.get(0);
		assertEquals("InterfaceTestA", interface0);
		String interface1 = (String) interfaces.get(1);
		assertEquals("pkg.InterfaceTestC", interface1);
	}

	public void testReplaceSuper()
	{
		String source = "package foo.bar {"
				+ " public interface Blat extends com.example.Bing {" + " }"
				+ " }";
		StringReader reader = new StringReader(source);

		unit = fact.newParser().parseIn(reader);
		IASInterfaceType iface = (IASInterfaceType) unit.getType();
		assertEquals("com.example.Bing", iface.getSuperInterfaces().get(0));
		iface.removeSuperInterface("com.example.Bing");
		iface.addSuperInterface("Bing");
	}

	public void testPackage()
	{
		unit.setPackageName("testpkg");
	}
}