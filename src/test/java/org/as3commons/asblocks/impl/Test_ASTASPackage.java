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

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASImportStatement;
import org.as3commons.asblocks.dom.IASIncludeStatement;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASUseStatement;

public class Test_ASTASPackage extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASPackage pckg;

	protected void setUp()
	{
		ASFactory fact = new ASFactory();
		unit = fact.newClass("foo.Goo");
		pckg = unit.getPackage();
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	public void testParent()
	{
		assertTrue(pckg.getParent() instanceof IASCompilationUnit);
	}
	
	public void test_qname()
	{
		assertNotNull(unit.getQName());
		assertEquals("foo", unit.getQName().getPackageName());
		assertEquals("Goo", unit.getQName().getLocalName());
		assertEquals("foo.Goo", unit.getQName().toString());
		assertTrue(unit.getQName().isQualified());
		unit.setPackageName(null);
		unit.getType().setName("Boo");
		assertFalse(unit.getQName().isQualified());
		assertNull(unit.getQName().getPackageName());
		assertEquals("Boo", unit.getQName().getLocalName());
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
	
	public void test_name()
	{
		assertEquals("foo", pckg.getName());
		pckg.setName("foo.bar.baz");
		assertEquals("foo.bar.baz", pckg.getName());
		pckg.setName(null);
		assertNull(pckg.getName());
	}

	public void test_type()
	{
		assertNotNull(pckg.getType());
		assertTrue(pckg.getType() instanceof IASClassType);
	}
}
