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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import junit.framework.TestCase;

public class TestAS3FragmentParser extends TestCase
{

	public void testParseStatement() throws Exception
	{
		assertParseMethodFailsFor("parseStatement", "+-");
	}

	public void testParseExprStatement() throws Exception
	{
		assertParseMethodFailsFor("parseExprStatement", "");
	}

	public void testParseCondition() throws Exception
	{
		assertParseMethodFailsFor("parseCondition", "");
	}

	public void testParseExpr() throws Exception
	{
		assertParseMethodFailsFor("parseExpression", "");
	}

	public void testParseExprList() throws Exception
	{
		assertParseMethodFailsFor("parseExprList", "");
	}

	public void testParseIdent() throws Exception
	{
//		assertParseMethodFailsFor("parseIdent", "");
	}

	public void testParseParameterDefault() throws Exception
	{
		assertParseMethodFailsFor("parseParameterDefault", "");
	}

	public void testParseForInit() throws Exception
	{
		assertParseMethodFailsFor("parseForInit", "+-");
		assertParseMethodFailsFor("parseForInit", "class");
	}

	public void testParseForCond() throws Exception
	{
		assertParseMethodFailsFor("parseForCond", "+-");
		assertParseMethodFailsFor("parseForCond", "class");
	}

	public void testParseForIter() throws Exception
	{
		assertParseMethodFailsFor("parseForIter", "+-");
		assertParseMethodFailsFor("parseForIter", "class");
	}

	public void testParseImport() throws Exception
	{
		assertParseMethodFailsFor("parseImport", "");
	}

	public void testParseTypeSpec() throws Exception
	{
		assertParseMethodFailsFor("parseTypeSpec", "");
		assertParseMethodFailsFor("parseTypeSpec", "String*");
	}

	public void testParseForInVar() throws Exception
	{
		assertParseMethodFailsFor("parseForInVar", "");
	}

	public void testParseForInIterated() throws Exception
	{
		assertParseMethodFailsFor("parseForInIterated", "");
	}

	public void testParseVariableDeclarator() throws Exception
	{
		assertParseMethodFailsFor("parseVariableDeclarator", "");
	}

	private static void assertParseMethodFailsFor(String methodName,
													String input)
			throws Exception
	{
		Method meth = AS3FragmentParser.class.getMethod(methodName,
				new Class[] { String.class });
		try
		{
			meth.invoke(null, new Object[] { input });
			fail(methodName + "(\"" + input + "\") should fail");
		}
		catch (InvocationTargetException e)
		{
			// expected
		}
	}
}
