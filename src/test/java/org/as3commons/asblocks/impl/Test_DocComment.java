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
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Iterator;

import junit.framework.TestCase;

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.IASParser;
import org.as3commons.asblocks.IASWriter;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASMethodAware;
import org.as3commons.asblocks.dom.IASParameter;
import org.as3commons.asblocks.dom.IDocComment;
import org.as3commons.asblocks.dom.IDocTag;
import org.as3commons.asblocks.dom.Visibility;
import org.junit.Test;

public class Test_DocComment extends TestCase
{

	private ASFactory fact = new ASFactory();
	private IASCompilationUnit unit;
	private IASClassType clazz;

	protected void setUp()
	{
		ASFactory fact = new ASFactory();
		unit = fact.newClass("Test");
		clazz = (IASClassType) unit.getType();
	}

	protected void tearDown() throws IOException
	{
		CodeMirror.assertReflection(fact, unit);
	}

	@Test
	public void test_getShortDescription()
	{
		String desc = "Start of the comment.\n" + " More lines.\n" + "<pre>\n"
				+ "    code();\n" + "    moreCode();\n" + "</pre>\n"
				+ "Last line.";

		clazz.setDescription(desc);
		assertEquals("\nStart of the comment.\n More lines.\n<pre>\n"
				+ "    code();\n    moreCode();\n</pre>\nLast line.\n", clazz.getDescription());

		clazz.setDescription("The short desc all the way to a period newline.\n   More content.");
		assertEquals("The short desc all the way to a period newline.\n   "
				+ "More content.", clazz.getDescription().trim());
		
		// the short description is always trimmed before it is returned
		assertEquals("The short desc all the way to a period newline.", clazz.getDocumentation().getShortDescription());
	}

	@Test
	public void test_getLongDescription()
	{
		clazz.setDescription("The short desc all the way to a period newline.\n   More content.  \n Long desc more.\n");
		assertEquals("The short desc all the way to a period newline.\n   More content.  \n Long desc more.", clazz.getDescription().trim());
	
		assertEquals("More content.  \n Long desc more.", clazz.getDocumentation().getLongDescription());
	}
	
	//@Test
	public void _test_comment()
	{
		//IDocComment documentation = clazz.getDocumentation();

		clazz.getDocumentation().setDescription("A test description with a \n nelinw and another\n newline.");
		clazz.getDocumentation().newDocTag("author", "mike schmalle");
		clazz.getDocumentation().setDescription(null);
		clazz.getDocumentation().setDescription("A new value\n of text.");
		clazz.getDocumentation().setDescription(null);
		// set two descriptions i a row
		clazz.getDocumentation().setDescription("A test description with a \n nelinw and another\n newline.");
		clazz.getDocumentation().setDescription("A new value\n of text.");

		IDocComment documentation = clazz.getDocumentation();

		IDocTag tag = documentation.findFirstTag("author");
		documentation.removeDocTag(tag);

		clazz.getDocumentation().newDocTag("author", "mike schmalle1");
		clazz.getDocumentation().newDocTag("author", "mike schmalle2");
		clazz.getDocumentation().setDescription("A new value\n of text.2");

		documentation = clazz.getDocumentation();
		tag = documentation.findFirstTag("author");
		documentation.removeDocTag(tag);
		documentation = clazz.getDocumentation();
		tag = documentation.findFirstTag("author");
		documentation.removeDocTag(tag);
	}

	public void testEndOfCommentMarker()
	{
		try
		{
			clazz.getDocumentation().setDescription("*/");
			fail("should not allow '*/' within a doc-comment");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	public void testParaEndOfCommentMarker()
	{
		try
		{
			clazz.getDocumentation().newDocTag("foo", "*/");
			fail("should not allow '*/' within a doc-comment");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	public void testSetNewDescription()
	{
		clazz.setDescription("hello");
		assertEquals("hello", clazz.getDescription().trim());
	}

	public void testSetBadDescription()
	{
		try
		{
			clazz.setDescription("hello\n@param foo great");
			fail("should have rejected description with trailing tagged-paragraph");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	public void testGetDescriptionNoDocs()
	{
		assertNull(clazz.getDescription());
	}

	public void testRemoveDescription()
	{
		clazz.setDescription(null);
		assertEquals(null, clazz.getDescription());
	}

	public void testGetExistingDescription()
	{
		clazz.getDocumentation().setDescription("hello world");
		clazz.getDocumentation().newDocTag("param", "foo bar");
		assertEquals("hello world", clazz.getDescription().trim());
	}

	public void testNewArgNoDocs()
	{
		IASMethod meth = clazz.newMethod("test", Visibility.PUBLIC, "void");
		IASParameter test = meth.addParameter("test", "String");
		assertNull(test.getDescription());
		test.setDescription("a test!");
		assertEquals("a test!", test.getDescription().trim());
		// insert a description before the @param
		meth.setDescription("foo\nbar");
		assertEquals("foo\nbar", meth.getDescription().trim());
		String actualDesc = test.getDescription();
		assertNotNull(actualDesc);
		assertEquals("a test!", actualDesc.trim());
	}

	public void testUpdateArgDocs()
	{
		IASMethod meth = clazz.newMethod("test", Visibility.PUBLIC, "void");
		IASParameter test = meth.addParameter("test", "String");
		assertNull(test.getDescription());
		test.setDescription("initial text!");
		assertEquals("initial text!", test.getDescription().trim());
		test.setDescription("replacement text");
		assertEquals("replacement text", test.getDescription().trim());
	}

	public void testParaTagUpdateNewline() throws IOException
	{
		IDocComment doc = clazz.getDocumentation();
		doc.setDescription("blah blah\nblah");
		doc.newDocTag("foo", "foo text");
		doc.newDocTag("test", "initial text");
		// once the body has been replaced, the AST ref changes in the
		// doc tag which makes these refs useless
		IDocTag tag1 = doc.findFirstTag("foo");
		tag1.setBody("replacement\ncontent 1 1 1");
		IDocTag tag2 = doc.findFirstTag("test");
		tag2.setBody("replacement\ncontent 2 \n 2 \n");
		doc.setDescription("foo foo\n{@foo bar.baz} blad\nblah\n");

		tag1 = doc.findFirstTag("foo");
		tag2 = doc.findFirstTag("test");

		doc.removeDocTag(tag1);
		doc.removeDocTag(tag2);

		doc.newDocTag("foo", "foo text");
		doc.newDocTag("test", "initial text");

		IASWriter writer = fact.newWriter();
		StringWriter buff = new StringWriter();
		writer.write(buff, unit);
		String[] lines = buff.toString().split("\n");
		// check indentation, skipping first and last lines,
		for (int i = 1; i < lines.length - 1; i++)
		{
			assertIndent("\t", lines[i]);
		}
	}

	private static void assertIndent(String indent, String line)
	{
		if (line.length() == 0)
		{
			// blank lines allowed
			return;
		}
		assertTrue("expected indentation " + ASTUtils.str(indent)
				+ " but line started with "
				+ ASTUtils.str(line.substring(0, indent.length())), line.startsWith(indent));
	}

	public void testReturnDocs()
	{
		IASMethod meth = clazz.newMethod("test", Visibility.PUBLIC, "void");
		assertNull(meth.getReturnDescription());
		meth.setReturnDescription(null); // should not fail
		meth.setReturnDescription("blah blah");
		assertEquals("blah blah", meth.getReturnDescription().trim());
	}

	public void testRemoveReturnDocs()
	{
		IASMethod meth = clazz.newMethod("test", Visibility.PUBLIC, "void");
		meth.setReturnDescription("blah blah");
		meth.setReturnDescription(null);
		assertNull(meth.getReturnDescription());
	}

	public void testDocumentation()
	{
		IDocComment doc = clazz.getDocumentation();
		assertNotNull(doc);
		assertNull(doc.getDescription());
	}

	public void testFindTags()
	{
		IDocComment doc = clazz.getDocumentation();
		doc.newDocTag("param", "arg0 blah");
		doc.newDocTag("param", "arg1 blah blah");
		doc.newDocTag("param", "arg2 blah blah blah");
		Iterator<IDocTag> i = doc.getTags("param");
		assertTrue(i.hasNext());
		assertTrue(((IDocTag) i.next()).getBody().trim().startsWith("arg0"));
		assertTrue(i.hasNext());
		assertTrue(((IDocTag) i.next()).getBody().trim().startsWith("arg1"));
		assertTrue(i.hasNext());
		assertTrue(((IDocTag) i.next()).getBody().trim().startsWith("arg2"));
	}

	public void testDocTagName()
	{
		IDocComment doc = clazz.getDocumentation();
		doc.newDocTag("param", "arg0 blah");
		IDocTag tag = doc.findFirstTag("param");
		assertEquals("param", tag.getName());
		tag.setName("see");
		assertEquals("see", tag.getName());
		// TODO: assert that the comment is removed?
	}

	public void testDelete()
	{
		IDocComment doc = clazz.getDocumentation();
		doc.setDescription("boo\nfoo");
		doc.newDocTag("param", "arg0 blah");
		doc.newDocTag("param", "arg1 blah blah");
		doc.newDocTag("param", "arg2 blah blah blah");
		IDocTag arg1 = null;
		for (Iterator<IDocTag> i = doc.getTags("param"); i.hasNext();)
		{
			IDocTag tag = (IDocTag) i.next();
			if (tag.getBody().trim().startsWith("arg1"))
			{
				arg1 = tag;
				break;
			}
		}
		assertNotNull(arg1);
		doc.removeDocTag(arg1);
		// check it's gone,
		Iterator<IDocTag> i = doc.getTags("param");
		assertTrue(i.hasNext());
		assertTrue(((IDocTag) i.next()).getBody().trim().startsWith("arg0"));
		assertTrue(i.hasNext());
		assertTrue(((IDocTag) i.next()).getBody().trim().startsWith("arg2"));
		//		doc.delete(doc.findFirstTag("param"));
		//		doc.delete(doc.findFirstTag("param"));
		//		i = doc.findTags();
		//		assertFalse(i.hasNext());
	}

	public void testAddToParsedContent() throws IOException
	{
		IASParser p = fact.newParser();
		StringReader in = new StringReader("package {\n"
				+ "	public class Test {\n" + "		public function foo() {\n"
				+ "		}\n" + "	}\n" + "}\n");
		unit = p.parseIn(in);
		IASMethodAware type = (IASMethodAware) unit.getType();
		IASMethod foo = type.getMethod("foo");
		foo.setDescription("woo!");
		IASWriter writer = fact.newWriter();
		StringWriter out = new StringWriter();
		writer.write(out, unit);
		String result = out.toString();
		// find the end of what would be the only comment block,
		int pos = result.indexOf("*/");
		char firstCharAfterComment = result.charAt(pos + 2);
		assertTrue("expected a newline to appear after newly inserted comment: 0x"
				+ Integer.toHexString(firstCharAfterComment), firstCharAfterComment == '\n'
				|| firstCharAfterComment == '\r');
	}
}