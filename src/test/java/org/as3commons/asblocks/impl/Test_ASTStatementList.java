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
import org.as3commons.asblocks.dom.IASArrayAccessExpression;
import org.as3commons.asblocks.dom.IASBinaryExpression;
import org.as3commons.asblocks.dom.IASBlock;
import org.as3commons.asblocks.dom.IASBooleanLiteral;
import org.as3commons.asblocks.dom.IASBreakStatement;
import org.as3commons.asblocks.dom.IASCatchClause;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASContinueStatement;
import org.as3commons.asblocks.dom.IASDeclaration;
import org.as3commons.asblocks.dom.IASDeclarationStatement;
import org.as3commons.asblocks.dom.IASDefaultXMLNamespaceStatement;
import org.as3commons.asblocks.dom.IASDoWhileStatement;
import org.as3commons.asblocks.dom.IASExpression;
import org.as3commons.asblocks.dom.IASExpressionStatement;
import org.as3commons.asblocks.dom.IASFieldAccessExpression;
import org.as3commons.asblocks.dom.IASFinallyClause;
import org.as3commons.asblocks.dom.IASForEachInStatement;
import org.as3commons.asblocks.dom.IASForInStatement;
import org.as3commons.asblocks.dom.IASForStatement;
import org.as3commons.asblocks.dom.IASInvocationExpression;
import org.as3commons.asblocks.dom.IASIfStatement;
import org.as3commons.asblocks.dom.IASIntegerLiteral;
import org.as3commons.asblocks.dom.IASLabelStatement;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASPostfixExpression;
import org.as3commons.asblocks.dom.IASPrefixExpression;
import org.as3commons.asblocks.dom.IASReturnStatement;
import org.as3commons.asblocks.dom.IASSimpleNameExpression;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.IASStringLiteral;
import org.as3commons.asblocks.dom.IASSwitchCase;
import org.as3commons.asblocks.dom.IASSwitchDefault;
import org.as3commons.asblocks.dom.IASSwitchLabel;
import org.as3commons.asblocks.dom.IASSwitchStatement;
import org.as3commons.asblocks.dom.IASThrowStatement;
import org.as3commons.asblocks.dom.IASTryStatement;
import org.as3commons.asblocks.dom.IASUseStatement;
import org.as3commons.asblocks.dom.IASWhileStatement;
import org.as3commons.asblocks.dom.IASWithStatement;
import org.as3commons.asblocks.dom.Visibility;
import org.junit.Test;

public class Test_ASTStatementList extends TestCase
{
	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASClassType clazz;
	private IASMethod method;
	private IASCompilationUnit reflect;

	protected void setUp()
	{
		unit = fact.newClass("Test");
		clazz = (IASClassType) unit.getType();
		method = clazz.newMethod("test", Visibility.PUBLIC, null);
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	@Test
	public void test_hasStatements()
	{
		assertFalse(method.hasStatements());
		IASStatement statement = method.parseStatement("bar");
		assertTrue(method.hasStatements());
		method.removeStatement(statement);
		assertFalse(method.hasStatements());
	}

	@Test
	public void test_getStatements()
	{
		method.parseStatement("foo");
		IASStatement statement = method.parseStatement("bar");
		method.parseStatement("baz");
		List<IASStatement> children = method.getStatements();
		assertEquals(3, children.size());
		method.removeStatement(statement);
		children = method.getStatements();
		assertEquals(2, children.size());
		IASExpressionStatement es = (IASExpressionStatement) children.get(1);
		IASSimpleNameExpression name = (IASSimpleNameExpression) es.getExpression();
		assertEquals("baz", name.getName());
	}

	@Test
	public void test_addStatement()
	{
		IASStatement statement = fact.newStatement("trace('Hello Foo!')");
		method.addStatement(statement);
		// try to add the same statement again
		try
		{
			method.addStatement(statement);
			fail("The same IASStatement cannot be added to the same contianer");
		}
		catch (ASBlocksSyntaxError e)
		{
		}

	}

	@Test
	public void test_parseStatement()
	{
		IASStatement statement = method.parseStatement("trace('Hello Foo!')");
		ExtraAssertions.assertInstanceof(statement, IASExpressionStatement.class);
	}

	@Test
	public void test_removeStatement()
	{
		// TODO check begin and end removal
		method.parseStatement("foo");
		IASStatement statement = method.parseStatement("bar");
		method.parseStatement("baz");
		List<IASStatement> children = method.getStatements();
		assertEquals(3, children.size());
		method.removeStatement(statement);
		children = method.getStatements();
		assertEquals(2, children.size());
		IASExpressionStatement es = (IASExpressionStatement) children.get(1);
		IASSimpleNameExpression name = (IASSimpleNameExpression) es.getExpression();
		assertEquals("baz", name.getName());
	}

	@Test
	public void test_parseExpressionStatement()
	{
		assertEquals(0, method.getStatements().size());
		IASExpressionStatement statement = method.parseNewExpressionStatement("foo.bar()");
		assertNotNull(statement);
		ExtraAssertions.assertInstanceof(statement.getExpression(), IASInvocationExpression.class);
		assertEquals(1, method.getStatements().size());
	}

	@Test
	public void test_newExpressionStatement()
	{
		IASExpression expression = fact.newExpression("foo[bar]");
		assertEquals(0, method.getStatements().size());
		IASExpressionStatement statement = method.newExpressionStatement(expression);
		assertNotNull(statement);
		ExtraAssertions.assertInstanceof(statement.getExpression(), IASArrayAccessExpression.class);
		assertEquals(1, method.getStatements().size());
	}

	@Test
	public void test_addComment()
	{
		method.addComment(" An inline foo");
		method.parseStatement("foo");
		method.addComment(" An inline bar");
		method.parseStatement("bar");
	}

	@Test
	public void test_newIf()
	{
		IASIfStatement parsedIfStmt = method.parseNewIf("a == b");
		assertNotNull(parsedIfStmt);
		IASIfStatement ifStatement = method.newIf(fact.newExpression("a == b"));
		ifStatement.parseStatement("trace('then true!')");
		assertNull(ifStatement.getElseStatement());
		ifStatement.getElse().parseStatement("trace('else false!')");
		IASStatement elseStatement = ifStatement.getElseStatement();
		assertNotNull(elseStatement);
		assertEquals("a == b", ifStatement.getConditionString());
		ifStatement.setCondition(fact.newExpression("b == a"));
		assertEquals("b == a", ifStatement.getConditionString());
		ExtraAssertions.assertInstanceof(ifStatement.getCondition(), IASBinaryExpression.class);
		ifStatement.setCondition(fact.newBooleanLiteral(true));
		assertTrue(((IASBooleanLiteral) ifStatement.getCondition()).getValue());
	}

	@Test
	public void test_newIf_elseIf()
	{
		IASIfStatement stub = (IASIfStatement) fact.newStatement("if (true) {\n}");
		IASIfStatement ist = method.parseNewIf("a == b");
		ist.parseStatement("trace('if')");
		ist.setElseStatement(stub);
		assertEquals(stub, ist.getElseStatement());
		stub.parseStatement("trace('else if')");
		stub.getElse().parseStatement("trace('else')");
	}
	
	@Test
	public void test_if_Parse()
	{
		IASIfStatement ifStmt = (IASIfStatement) method.parseStatement("if (foo) blah();");
		assertNotNull(ifStmt.getThenStatement());
		ExtraAssertions.assertInstanceof(ifStmt.getThenStatement(), IASExpressionStatement.class);
		try
		{
			// no block in the 'if', so SyntaxException is expected,
			ifStmt.getStatements();
			fail();
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	@Test
	public void test_ifElseIf_Parse()
	{
		IASIfStatement ifStmt = (IASIfStatement) method.parseStatement("if (foo) {blah();} else if (bar) {other();}");
		assertNotNull(ifStmt.getElseStatement());
		ExtraAssertions.assertInstanceof(ifStmt.getElseStatement(), IASIfStatement.class);
		try
		{
			ifStmt.getElse();
			fail("should not allow access to block from else-clause when else-clause contains other stmt type");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	@Test
	public void test_newFor()
	{
		IASForStatement forStmt = method.newFor(null, null, null);
		forStmt.parseStatement("trace(\"foo bar!\")");
		assertNull(forStmt.getInitializerString());
		assertNull(forStmt.getConditionString());
		assertNull(forStmt.getIteratorString());
		//		forStmt.parseInitializer("var j");
		//		forStmt.parseCondition("j<10");
		//		forStmt.parseIterator("j++");

		forStmt.setInitializer(fact.newDeclaration("j = 0"));
		forStmt.setCondition(fact.newExpression("j<10"));
		forStmt.setIterator(fact.newExpression("j++"));

		assertEquals("var j = 0", forStmt.getInitializerString());
		assertEquals("j<10", forStmt.getConditionString());
		assertEquals("j++", forStmt.getIteratorString());
		ExtraAssertions.assertInstanceof(forStmt.getInitializer(), IASDeclarationStatement.class);
		ExtraAssertions.assertInstanceof(forStmt.getCondition(), IASBinaryExpression.class);
		ExtraAssertions.assertInstanceof(forStmt.getIterator(), IASPostfixExpression.class);

		forStmt = method.parseNewFor("const i", "i<10", "i++");
		forStmt.parseStatement("trace(i)");
		assertEquals("const i", forStmt.getInitializerString());
		assertEquals("i<10", forStmt.getConditionString());
		assertEquals("i++", forStmt.getIteratorString());

		forStmt.setInitializer(null);
		forStmt.setCondition(null);
		forStmt.setIterator(null);

		assertNull(forStmt.getInitializerString());
		assertNull(forStmt.getConditionString());
		assertNull(forStmt.getIteratorString());

		forStmt.setInitializer(fact.newDeclaration("k=0"));
		assertEquals("var k=0", forStmt.getInitializerString());
		ExtraAssertions.assertInstanceof(forStmt.getInitializer(), IASDeclarationStatement.class);
		forStmt.setCondition(fact.newBooleanLiteral(true));
		ExtraAssertions.assertInstanceof(forStmt.getCondition(), IASBooleanLiteral.class);
		forStmt.setIterator(fact.newExpression("++i"));
		ExtraAssertions.assertInstanceof(forStmt.getIterator(), IASPrefixExpression.class);
	}

	@Test
	public void test_newForIn()
	{
		IASForInStatement forInStmt = method.parseNewForIn("var i", "obj.arry");
		forInStmt.parseStatement("trace(i)");

		assertEquals("var i", forInStmt.getInitializerString());
		assertEquals("obj.arry", forInStmt.getIteratorString());
		ExtraAssertions.assertInstanceof(forInStmt.getIterator(), IASFieldAccessExpression.class);

		forInStmt.parseInitializer("j");
		forInStmt.parseIterator("obj");
		assertEquals("j", forInStmt.getInitializerString());
		assertEquals("obj", forInStmt.getIteratorString());
		forInStmt.setIterator(fact.newExpression("obj.blah"));
	}

	@Test
	public void test_newForEachIn()
	{
		IASForEachInStatement forInStmt = method.parseNewForEachIn("var i", "obj.arry");
		forInStmt.parseStatement("trace(i)");

		assertEquals("var i", forInStmt.getInitializerString());
		assertEquals("obj.arry", forInStmt.getIteratorString());
		ExtraAssertions.assertInstanceof(forInStmt.getIterator(), IASFieldAccessExpression.class);

		forInStmt.parseInitializer("j");
		forInStmt.parseIterator("obj");
		assertEquals("j", forInStmt.getInitializerString());
		assertEquals("obj", forInStmt.getIteratorString());
		forInStmt.setIterator(fact.newExpression("obj.blah"));
	}

	@Test
	public void test_newWhile()
	{
		IASWhileStatement whileStmt = method.newWhile(fact.newExpression("test()"));
		whileStmt.parseStatement("trace(result())");
		assertEquals("test()", whileStmt.getConditionString());
		whileStmt.setCondition(fact.newExpression("a == b"));
		assertEquals("a == b", whileStmt.getConditionString());
		ExtraAssertions.assertInstanceof(whileStmt.getCondition(), IASBinaryExpression.class);
		ExtraAssertions.assertInstanceof(whileStmt.getBody(), IASBlock.class);
	}

	@Test
	public void test_while_condition()
	{
		IASExpression left = fact.newExpression("a");
		IASExpression right = fact.newExpression("b");
		IASWhileStatement whileStmt = method.newWhile(fact.newAndExpression(left, right));
		whileStmt.parseStatement("trace(result())");
		assertEquals("a && b", whileStmt.getConditionString());
		whileStmt.setCondition(fact.newBooleanLiteral(true));
		ExtraAssertions.assertInstanceof(whileStmt.getCondition(), IASBooleanLiteral.class);
	}

	@Test
	public void test_newDoWhile_Expression()
	{
		IASDoWhileStatement doWhileStmt = method.parseNewDoWhile("test()");
		doWhileStmt.parseStatement("trace(result())");
		assertEquals("test()", doWhileStmt.getConditionString());
		doWhileStmt.parseCondition("a == b");
		assertEquals("a == b", doWhileStmt.getConditionString());
		ExtraAssertions.assertInstanceof(doWhileStmt.getCondition(), IASBinaryExpression.class);
		doWhileStmt.setCondition(fact.newBooleanLiteral(true));
	}

	@Test
	public void test_newSwitch()
	{
		IASSwitchStatement swtch = method.parseNewSwitch("foo");
		IASSwitchCase cas = swtch.newCase("1");
		assertFalse("Empty case statement claims to contain code", cas.hasStatements());
		cas.parseStatement("trace(1)");
		assertEquals("1", cas.getLabelString());
		ExtraAssertions.assertInstanceof(cas.getLabel(), IASIntegerLiteral.class);
		cas.parseLabel("2");
		assertEquals("2", cas.getLabelString());
		IASSwitchDefault def = swtch.newDefault();
		def.parseStatement("trace('default')");
		List<IASSwitchLabel> labels = swtch.getLabels();
		ExtraAssertions.assertSize(2, labels);
		ExtraAssertions.assertInstanceof(labels.get(0), IASSwitchCase.class);
		ExtraAssertions.assertInstanceof(labels.get(1), IASSwitchDefault.class);

		// condition tests,
		assertNotNull(swtch.getCondition());
		swtch.setCondition(fact.newIntegerLiteral(333));
		assertTrue(swtch.getCondition() instanceof IASIntegerLiteral);
		assertEquals(333, ((IASIntegerLiteral) swtch.getCondition()).getValue());
	}

	@Test
	public void test_newSwitch_parseCondition()
	{
		IASSwitchStatement swtch = method.parseNewSwitch("foo");
		IASSwitchCase cas = swtch.newCase("1");
		cas.addComment(" bla");
		swtch.parseCondition("foo[bar]");
		assertEquals("foo[bar]", swtch.getConditionString());
	}
	
	@Test
	public void test_newWith()
	{
		IASWithStatement with = method.parseNewWith("foo");
		with.parseStatement("trace(test)");
		assertEquals("foo", with.getScopeString());
		with.parseScope("foo.bar");
		assertEquals("foo.bar", with.getScopeString());
		ExtraAssertions.assertInstanceof(with.getScope(), IASFieldAccessExpression.class);
		with.setScope(fact.newExpression("bar.foo"));
		ExtraAssertions.assertInstanceof(with.getScope(), IASFieldAccessExpression.class);
		ExtraAssertions.assertInstanceof(with.getBody(), IASBlock.class);
	}

	@Test
	public void test_newDeclaration_Parse()
	{
		IASDeclarationStatement decl = (IASDeclarationStatement) method.parseStatement("var a=1, b:String='2'");
		List<IASDeclaration> vars = decl.getDeclarations();
		ExtraAssertions.assertSize(2, vars);

		IASDeclaration a = (IASDeclaration) vars.get(0);
		assertEquals("a", a.getName());
		assertNull(a.getType());
		ExtraAssertions.assertInstanceof(a.getInitializer(), IASIntegerLiteral.class);

		IASDeclaration b = (IASDeclaration) vars.get(1);
		assertEquals("b", b.getName());
		assertEquals("String", b.getType());
		ExtraAssertions.assertInstanceof(b.getInitializer(), IASStringLiteral.class);
	}

	@Test
	public void test_newDeclaration_Expression()
	{
		IASDeclarationStatement decl = method.parseNewDeclaration("a=1");
		assertFalse(decl.isConstant());
		decl.setConstant(false); // should not change the result
		assertFalse(decl.isConstant());

		assertEquals("a", decl.getName());
		assertNull(decl.getType());
		ExtraAssertions.assertInstanceof(decl.getInitializer(), IASIntegerLiteral.class);

		decl.setConstant(true);
		assertTrue(decl.isConstant());

		List<IASDeclaration> vars = decl.getDeclarations();
		ExtraAssertions.assertSize(1, vars);
		IASDeclaration var = (IASDeclaration) vars.get(0);
		assertEquals("a", var.getName());
		assertNull(var.getType());
		ExtraAssertions.assertInstanceof(var.getInitializer(), IASIntegerLiteral.class);
	}

	@Test
	public void test_newReturn() throws IOException
	{
		IASReturnStatement returnStmt = method.newReturn();
		assertNull(returnStmt.getExpressionString());
		returnStmt.parseExpression("false");
		assertEquals("false", returnStmt.getExpressionString());
		ExtraAssertions.assertInstanceof(returnStmt.getExpression(), IASBooleanLiteral.class);
		returnStmt.setExpression(fact.newIntegerLiteral(2));
		ExtraAssertions.assertInstanceof(returnStmt.getExpression(), IASIntegerLiteral.class);
		assertFirstReflectedStatementIsA(IASReturnStatement.class);
	}

	@Test
	public void test_return_remove()
	{
		// TODO need to remove the extra space between the return and expr
		// right now it's still there
		IASReturnStatement returnStmt = method.parseNewReturn("true");
		assertEquals("true", returnStmt.getExpressionString());
		returnStmt.parseExpression(null);
		assertNull(returnStmt.getExpressionString());
		assertNull(returnStmt.getExpression());

		// test removal when there's already nothing to remove,
		returnStmt.parseExpression(null);
	}

	@Test
	public void test_blockEmpty()
	{
		assertFalse(method.hasStatements());
		method.addComment(" a comment");
		assertFalse(method.hasStatements());
		method.parseStatement("return foo");
		assertTrue(method.hasStatements());
	}

	@Test
	public void test_ifBlockReplace()
	{
		IASIfStatement ifStmt = method.parseNewIf("foo");
		IASBlock block = new ASFactory().newBlock();
		block.addComment("test new block");
		block.newReturn();
		ifStmt.setThen(block);
		IASBlock b = (IASBlock) ifStmt.getThenStatement();
		assertTrue(b.hasStatements());

	}

	@SuppressWarnings("unused")
	@Test
	public void test_block_parse()
	{
		// TODO get this to indent correctly
		IASBlock stmt = (IASBlock) method.parseStatement("{ }");
	}

	@Test
	public void test_newBreak()
	{
		IASStatement brk = method.parseStatement("break");
		ExtraAssertions.assertInstanceof(brk, IASBreakStatement.class);
		method.newBreak();
	}

	@Test
	public void test_newBreak_label()
	{
		IASStatement brk = method.parseStatement("break foo");
		ExtraAssertions.assertInstanceof(brk, IASBreakStatement.class);
		IASBreakStatement b = method.newBreak("foo");
		assertEquals("foo", b.getLabelString());
		// remove the label
		b.setLabel(null);
		assertNull(b.getLabelString());
		// set expression
		//b.setLabel(fact.newSimpleNameExpression("bar"));
		//assertEquals("bar", b.getLabelString());
	}

	@Test
	public void test_superStatementNoArg()
	{
		//IASSuperStatement stmt = method.newSuper(Collections.EMPTY_LIST);
		//assertEquals(0, stmt.getArguments().size());
	}

	@Test
	public void test_SuperStatement()
	{
		//List args = Collections.singletonList(fact.newIntegerLiteral(1));
		//IASSuperStatement stmt = method.newSuper(args);
		//assertEquals(1, stmt.getArguments().size());
		//IASExpression arg = (IASExpression) stmt.getArguments().get(0);
		//assertEquals(1, ((IASIntegerLiteral) arg).getValue());
	}

	@Test
	public void test_ParseSuper()
	{
		//IASSuperStatement stmt = (IASSuperStatement)method.parseStatement("super()");
		//assertEquals(0, stmt.getArguments().size());
	}

	@Test
	public void test_newTryCatch_String()
	{
		IASTryStatement tryStmt = method.parseNewTryCatch("e", "Exception");
		tryStmt.parseStatement("trace('trying')");
		List<IASCatchClause> catches = tryStmt.getCatchClauses();
		ExtraAssertions.assertSize(1, catches);
		assertEquals(1, catches.size());
		IASCatchClause eCatch = (IASCatchClause) catches.get(0);
		eCatch.parseStatement("trace('catching e')");
		assertEquals("e", eCatch.getName());
		assertEquals("Exception", eCatch.getType());
		assertNull(tryStmt.getFinallyClause());
		IASCatchClause fCatch = tryStmt.newCatchClause("f", "Error");
		fCatch.parseStatement("trace('catching f')");
	}

	@Test
	public void test_newTryFinally()
	{
		IASTryStatement tryStmt = method.newTryFinally();
		IASFinallyClause finallyClause = tryStmt.getFinallyClause();
		assertNotNull(finallyClause);
		assertFalse(finallyClause.hasStatements());
		finallyClause.parseStatement("trace('hello')");
		assertTrue(finallyClause.hasStatements());
		try
		{
			finallyClause = tryStmt.newFinallyClause();
			fail("shouldn't be able to add another finally-clause");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	@Test
	public void test_parseTrayCatchFinally()
	{
		IASTryStatement tryStmt = (IASTryStatement) method.parseStatement("try {"
				+ "} catch (e) {"
				+ "} catch (f:Exception) {"
				+ "} finally {"
				+ "}");
		List<IASCatchClause> catches = tryStmt.getCatchClauses();
		ExtraAssertions.assertSize(2, catches);

		IASCatchClause catch0 = (IASCatchClause) catches.get(0);
		assertEquals("e", catch0.getName());
		assertNull(catch0.getType());

		IASCatchClause catch1 = (IASCatchClause) catches.get(1);
		assertEquals("f", catch1.getName());
		assertEquals("Exception", catch1.getType());

		assertNotNull(tryStmt.getFinallyClause());
	}

	@Test
	public void test_newContinue()
	{
		IASContinueStatement continueStmt = method.newContinue();
		assertNotNull(continueStmt);
		ExtraAssertions.assertInstanceof(method.parseStatement("continue"), IASContinueStatement.class);
	}

	@Test
	public void test_newContinue_label()
	{
		IASStatement cnt = method.parseStatement("continue foo");
		ExtraAssertions.assertInstanceof(cnt, IASContinueStatement.class);
		IASContinueStatement b = method.newContinue("foo");
		assertEquals("foo", b.getLabel());
		// remove the label
		b.setLabel(null);
		assertNull(b.getLabel());
		// set expression
		//b.setLabel(fact.newSimpleNameExpression("bar"));
		//assertEquals("bar", b.getLabelString());
	}

	@Test
	public void test_newThrow_Expression()
	{
		IASExpression t = fact.newExpression("new Error()");
		IASThrowStatement throwStmt = method.newThrow(t);
		//ExtraAssertions.assertInstanceof(throwStmt.getExpression(), IASNewExpression.class);
		ExtraAssertions.assertInstanceof(throwStmt.getExpression(), IASInvocationExpression.class);
	}

	@Test
	public void test_newThrow_parse()
	{
		IASThrowStatement throwStmt = (IASThrowStatement) method.parseStatement("throw \"oops\"");
		ExtraAssertions.assertInstanceof(throwStmt.getExpression(), IASStringLiteral.class);
	}

	@Test
	public void test_newDefaultXMLNamespace_String()
	{
		IASDefaultXMLNamespaceStatement ns = (IASDefaultXMLNamespaceStatement) method.parseStatement("default xml namespace = \"hello.org\"");
		assertEquals("hello.org", ns.getNamespace());
	}

	@Test
	public void test_newLabelStatement()
	{
		IASLabelStatement label = method.parseNewLabel("foo");
		assertEquals("foo", label.getLabel());

		label.setLabel("bar");
		assertEquals("bar", label.getLabel());

		label.parseNewIf("true");

		IASBlock block = fact.newBlock();
		block.parseStatement("foo.bar()");

		label.setStatement(block);

		IASIfStatement ifs = (IASIfStatement) fact.newStatement("if (true) {\n}");
		ifs.parseStatement("ifs()");
		label.setStatement(ifs);

		assertEquals(ifs, label.getStatement());
	}

	@Test
	public void test_newUse()
	{
		IASUseStatement us = method.newUse(fact.newExpression("the_universe"));
		assertEquals("the_universe", us.getName());
		
		us = method.parseNewUse("space");
		assertEquals("space", us.getName());
	}
	
	@SuppressWarnings("rawtypes")
	private void assertFirstReflectedStatementIsA(Class expectedClass)
			throws IOException
	{
		reflect = assertReflection();
		IASClassType clazz = (IASClassType) reflect.getType();
		IASMethod meth = clazz.getMethod("test");
		List<IASStatement> statements = meth.getStatements();
		Object stmt = statements.get(0);
		assertTrue("Expected instance of " + expectedClass.getName() + ", got "
				+ stmt.getClass().getName(), expectedClass.isInstance(stmt));
	}

	private IASCompilationUnit assertReflection() throws IOException
	{
		return CodeMirror.assertReflection(fact, unit);
	}
}
