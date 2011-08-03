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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASDeclarationStatement;
import org.as3commons.asblocks.dom.IASDescendantExpression;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASExpressionAttribute;
import org.as3commons.asblocks.dom.IASFieldAccessExpression;
import org.as3commons.asblocks.dom.IASFilterExpression;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASPropertyAttribute;
import org.as3commons.asblocks.dom.IASSimpleNameExpression;
import org.as3commons.asblocks.dom.IASStarAttribute;
import org.as3commons.asblocks.dom.IASXMLLiteral;
import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.e4x.E4XHelper;
import org.as3commons.asblocks.parser.antlr.e4x.E4XParser;

import antlr.debug.ParserReporter;

import junit.framework.TestCase;

public class E4XTests extends TestCase
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

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	/*
		public void testLiteralElement() {
			IASDeclarationStatement decl = (IASDeclarationStatement)meth.addStmt("var x:XML = <element/>");
			IASXMLLiteral init = (IASXMLLiteral)decl.getFirstVarInitializer();
			assertEquals("<element/>", init.getValueString());
		}

		public void testDefaultXMLNamespace() {
			ASDefaultXMLNamespaceStatement stmt = meth.newDefaultXMLNamespace("http://example.com\\");
			assertEquals("http://example.com\\", stmt.getNamespace());
		}

		public void testParseDefaultXMLNamespace() {
			ASDefaultXMLNamespaceStatement stmt
				= (ASDefaultXMLNamespaceStatement)meth.addStmt("default xml namespace = \"http://example.com\\\\\"");
			assertEquals("http://example.com\\", stmt.getNamespace());
		}
	*/
	public void testDescendant_() throws IOException, RecognitionException
	{
		FileInputStream in = new FileInputStream(
				"C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\asblocks-demo\\src\\Main.mxml");

		InputStreamReader reader = new InputStreamReader(in);

		//StringReader reader = new StringReader(
		//		"<mx:Script id=\"{foo.bar.baz}\"><single><foo/></single></mx:Script>");
		
		E4XParser parser = E4XHelper.parserOn(reader);
		ParserRuleReturnScope tree = parser.compilationUnit();
		String result = E4XHelper.convert((LinkedListTree) tree.getTree(), false);
	}

	public void testDescendant()
	{
		IASExpression target = fact.newExpression("a");
		IASExpression selector = fact.newExpression("b");
		IASDescendantExpression expr = fact.newDescendantExpression(target, selector);
		assertNotNull(expr);
		meth.newExpressionStatement(expr);
	}

	public void testParseDescendant()
	{
		IASDescendantExpression expr = (IASDescendantExpression) fact.newExpression("a..b");
		IASExpression target = expr.getTarget();
		ExtraAssertions.assertInstanceof(target, IASSimpleNameExpression.class);
		assertEquals("a", ((IASSimpleNameExpression) target).getName());
		IASExpression query = expr.getQuery();
		ExtraAssertions.assertInstanceof(query, IASSimpleNameExpression.class);
		assertEquals("b", ((IASSimpleNameExpression) query).getName());
	}

	public void testFilterPredicate()
	{
		IASExpression target = fact.newExpression("a");
		IASExpression selector = fact.newExpression("b");
		IASFilterExpression expr = fact.newFilterExpression(target, selector);
		assertNotNull(expr);
		meth.newExpressionStatement(expr);
	}

	public void testParseFilterPredicate()
	{
		IASFilterExpression expr = (IASFilterExpression) fact.newExpression("a.(b)");
		IASExpression target = expr.getTarget();
		ExtraAssertions.assertInstanceof(target, IASSimpleNameExpression.class);
		assertEquals("a", ((IASSimpleNameExpression) target).getName());
		IASExpression query = expr.getQuery();
		ExtraAssertions.assertInstanceof(query, IASSimpleNameExpression.class);
		assertEquals("b", ((IASSimpleNameExpression) query).getName());
	}

	public void testStarAttribute()
	{
		IASStarAttribute expr = fact.newStarAttribute();
		assertNotNull(expr);
		meth.newExpressionStatement(expr);
	}

	public void testParseStarAttribute()
	{
		IASStarAttribute expr = (IASStarAttribute) fact.newExpression("@*");
		assertNotNull(expr);
		meth.newExpressionStatement(expr);
	}

	public void testPropertyAttribute()
	{
		IASPropertyAttribute expr = fact.newPropertyAttribute("test");
		assertNotNull(expr);
		assertEquals("test", expr.getNameString());
		meth.newExpressionStatement(expr);
	}

	public void testParsePropertyAttribute()
	{
		IASPropertyAttribute expr = (IASPropertyAttribute) fact.newExpression("@ns::test");
		assertNotNull(expr);
		assertEquals("ns::test", expr.getNameString());
		meth.newExpressionStatement(expr);
	}

	public void testExpressionAttribute()
	{
		IASExpression expr = fact.newExpression("foo");
		IASExpressionAttribute attrexpr = fact.newExpressionAttribute(expr);
		assertNotNull(attrexpr);
		ExtraAssertions.assertInstanceof(attrexpr.getExpression(), IASSimpleNameExpression.class);
		meth.newExpressionStatement(attrexpr);
	}

	public void testParseExpressionAttribute()
	{
		IASExpressionAttribute expr = (IASExpressionAttribute) fact.newExpression("@[foo]");
		assertNotNull(expr);
		ExtraAssertions.assertInstanceof(expr.getExpression(), IASSimpleNameExpression.class);
		meth.newExpressionStatement(expr);
	}

	public void testParseDescendantExpressionAttribute()
	{
		IASDescendantExpression expr = (IASDescendantExpression) fact.newExpression("a..@*");
		ExtraAssertions.assertInstanceof(expr.getQuery(), IASStarAttribute.class);
		meth.newExpressionStatement(expr);
	}

	public void testParseAttributeProp()
	{
		IASFieldAccessExpression expr = (IASFieldAccessExpression) fact.newExpression("a.@b");
		//		assertEquals(@????????!?!?, expr.getName());
		meth.newExpressionStatement(expr);
	}

	public void testParseStarProp()
	{
		IASFieldAccessExpression expr = (IASFieldAccessExpression) fact.newExpression("a.*");
		//		assertEquals(????????!?!?, expr.getName());
		meth.newExpressionStatement(expr);
	}
}