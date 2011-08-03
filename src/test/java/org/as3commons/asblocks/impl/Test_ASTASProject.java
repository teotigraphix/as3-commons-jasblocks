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

import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.IASProject;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.junit.Test;

public class Test_ASTASProject extends TestCase
{
	IASProject project;

	public void setUp()
	{
		project = new ASFactory().newEmptyASProject(".");
		assertEquals(".", project.getOutputLocation());
	}

	@Test
	public void test_compilationUnits()
	{
		assertEmpty(project.getCompilationUnits());
		IASCompilationUnit unit = project.newClass("Test");
		assertEquals(1, project.getCompilationUnits().size());
		assertEquals("Test", project.getCompilationUnits().get(0).getType().getName());
		project.removeCompilationUnit(unit);
		assertEmpty(project.getCompilationUnits());
		unit = project.newInterface("ITest");
		assertEquals(1, project.getCompilationUnits().size());
		assertEquals("ITest", project.getCompilationUnits().get(0).getType().getName());

		CodeMirror.assertReflection(new ASFactory(), unit);
	}

	@Test
	public void test_classPathEntries()
	{
		assertEmpty(project.getClassPathEntries());
		project.addClassPath(".");
		assertEquals(1, project.getClassPathEntries().size());
		project.removeClassPath(".");
		assertEmpty(project.getClassPathEntries());
	}

	@Test
	public void test_sourcePathEntries()
	{
		assertEmpty(project.getSourcePathEntries());
		project.addSourcePath(".");
		assertEquals(1, project.getSourcePathEntries().size());
		project.removeSourcePath(".");
		assertEmpty(project.getSourcePathEntries());
	}

	@Test
	public void test_addSourcePath()
	{
		//project.addSourcePath("C:\\Users\\Teoti\\Documents\\Flash\\libraries\\"
		//		+ "flex_sdk_4.5.0.20967\\frameworks\\projects\\framework\\src");
		project.addSourcePath("C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\as-blocks\\as3commons-asblocks-dom");
	}

	@Test
	public void test_resourceRoots()
	{
		// TODO impl unit test
	}

	@Test
	public void test_outputLocation()
	{
		// TODO impl unit test
	}

	@Test
	public void test_newClass()
	{
		// TODO impl unit test
	}

	@Test
	public void test_newInterface()
	{
		// TODO impl unit test
	}

	@Test
	public void test_newFunction()
	{
		// TODO impl unit test
	}

	@Test
	public void test_newNamespace()
	{
		// TODO impl unit test
	}

	@Test
	public void test_readAll()
	{
		// TODO impl unit test
	}

	@Test
	public void test_writeAll()
	{
		// TODO impl unit test
	}

	@Test
	public void testClasspath()
	{
		//		assertEmpty(project.getClassPathEntries());
		project.addClassPath(".");
		assertEquals(1, project.getClassPathEntries().size());
		project.removeClassPath(".");
		assertEmpty(project.getClassPathEntries());
	}

	private static void assertEmpty(List<?> list)
	{
		assertEquals(Collections.EMPTY_LIST, list);
	}
}