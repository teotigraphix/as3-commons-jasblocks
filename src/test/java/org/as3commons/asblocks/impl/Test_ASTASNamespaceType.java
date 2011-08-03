////////////////////////////////////////////////////////////////////////////////
//Copyright 2011 Michael Schmalle - Teoti Graphix, LLC
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0 
//
//Unless required by applicable law or agreed to in writing, software 
//distributed under the License is distributed on an "AS IS" BASIS, 
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and 
//limitations under the License
//
//Author: Michael Schmalle, Principal Architect
//mschmalle at teotigraphix dot com
////////////////////////////////////////////////////////////////////////////////

package org.as3commons.asblocks.impl;

import java.io.IOException;

import junit.framework.TestCase;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASNamespaceType;
import org.junit.Test;

public class Test_ASTASNamespaceType extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASNamespaceType ntype;

	protected void setUp()
	{
		ASFactory fact = new ASFactory();
		unit = fact.newNamespace("foo.bar.outer_space", "http://uuu.universe.com");
		ntype = (IASNamespaceType) unit.getType();
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}
	
	@Test
	public void test_name()
	{
		assertEquals("outer_space", ntype.getName());
		ntype.setName("the_universe");
		assertEquals("the_universe", ntype.getName());
		try
		{
			ntype.setName(null);
			fail("function name should have rejected null value");
		}
		catch (ASBlocksSyntaxError e)
		{
		}
	}
	
	@Test
	public void test_uri()
	{
		assertEquals("http://uuu.universe.com", ntype.getURI());
		ntype.setURI("some/other/place");
		assertEquals("some/other/place", ntype.getURI());
		try
		{
			ntype.setURI(null);
			fail("namespace uri should have rejected null value");
		}
		catch (ASBlocksSyntaxError e)
		{
		}	
	}
	
	@Test
	public void test_comment()
	{
	}
}
