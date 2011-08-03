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

import junit.framework.TestCase;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASConfigStatement;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.Visibility;

public class Test_ASTASConfigStatement extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASMethod meth;

	protected void setUp()
	{
		unit = fact.newClass("Test");
		IASClassType clazz = (IASClassType) unit.getType();
		meth = clazz.newMethod("test", Visibility.PUBLIC, null);
	}

	protected void tearDown()
	{
		CodeMirror.assertReflection(fact, unit);
	}
	
	public void test_basic()
	{
		IASConfigStatement conf = meth.parseNewConfig("debug");
		assertNotNull(conf);
		conf.parseStatement("trace('debug')");
	}
	
	public void test_name()
	{
		IASConfigStatement conf = meth.parseNewConfig("debug");
		assertNotNull(conf);
		assertEquals("debug", conf.getName());
		conf.setName("foo");
		assertEquals("foo", conf.getName());
		// test null or empty, cannot allow
		try
		{
			conf.setName("");
			fail("IASConfigStatement.name should not be empty");
		}
		catch (ASBlocksSyntaxError e)
		{
			// TODO: handle exception
		}
	}
}
