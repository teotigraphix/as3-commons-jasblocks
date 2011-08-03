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

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.AccessorRole;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.IASForStatement;
import org.as3commons.asblocks.dom.IASImportStatement;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASParameter;
import org.as3commons.asblocks.dom.IASStatement;
import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.as3.AS3Lexer;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class Test_BasicUnit extends TestCase
{
	public void testBasic() throws IOException
	{
		String source = "/*fpkg*/package foo.bar {\n"
				+ " import pkg.Stuff;\n"
				+ " /**\n"
				+ "  * java doc\n"
				+ "  */\n"
				+ " public class /*f*/Blat extends Bing implements Febraz, Goo {\n"
				+ " [Annotate]\n"
				+ " [Basic()]\n"
				+ " [String(\"foo\")]\n"
				+ " [Num(1)]\n"
				+ " [Bool(false)]\n"
				+ " [Arg(foo=\"bar\")]\n"
				+ " [List(foo=\"bar\", that=2)]\n"
				+ " [Event(\"alpha\")]\n"
				+ " [Event(\"beta\")]\n"
				+ " private var x:String = 1;\n"
				+ " /** javadoc? */\n"
				+ " public static function func(arg:Number, foo=null, ...):Boolean {\n"
				+ " for (var b=1;b<=10;b++) { bar(); }\n"
				+ " for (var g in blah) { r(); }\n"
				+ " for each (var g in blah) { r(); }\n"
				+ " if (h==undefined) { poo(); } else { /* bar */ }\n"
				+ " while (false) v();\n" 
				+ " do { continue; } while (m);\n"
				+ " switch (blah) {\n" 
				+ " case 0x3: x(); y(); break;\n"
				+ " case 4: next;\n" 
				+ " default: x(); y();\n" 
				+ " }\n"
				+ " with (scope) foo();\n" 
				+ " var a=b?(x+y):new Foo();\n"
				+ " const X=true;\n" 
				+ " ff = function(y, z) { };\n"
				+ " l=[1,'2'];\n" 
				+ " xx = doc.ns::name;\n" 
				+ " m={a:null};\n"
				+ "// d = <foo bar=\"{blat}\"/>;\n" 
				+ " r = /regexp/;\n"
				+ " /* unary expressions */\n" 
				+ " --a; ++a; a--; a++; a = -a;\n"
				+ " return z.call(i.j*k, l[m]);\n" 
				+ " }\n" 
				+ " }\n"
				+ " } // trailing comment";
		StringReader reader = new StringReader(source);

		ASFactory fact = new ASFactory();
		IASCompilationUnit unit = fact.newParser().parseIn(reader);

		// check that everything looks as it should,
		assertEquals("foo.bar", unit.getPackageName());
		
		IASPackage pkg = unit.getPackage();
		IASClassType clazz = (IASClassType) unit.getType();
		
		assertEquals("foo.bar", pkg.getName());
		List<IASImportStatement> imports = pkg.getImports();
		assertEquals(1, imports.size());
		assertEquals("pkg.Stuff", imports.get(0).getTargetString());
		
		assertEquals("Blat", clazz.getName());
		assertEquals("Bing", clazz.getSuperClass());
		assertEquals(Arrays.asList(new String[] { "Febraz", "Goo" }),
				clazz.getImplementedInterfaces());
		assertEquals("java doc", clazz.getDescription().trim());
		assertEquals(1, clazz.getMethods().size());

		IASField x = clazz.getField("x");
		assertEquals("x", x.getName());
		assertEquals("String", x.getType());
		assertEquals(Visibility.PRIVATE, x.getVisibility());

		assertNotNull(x.getMetaTag("Annotate"));

		IASMethod func = clazz.getMethod("func");
		assertEquals("func", func.getName());
		assertEquals("Boolean", func.getType());
		assertTrue(func.isStatic());
		assertEquals(Visibility.PUBLIC, func.getVisibility());
		assertEquals(AccessorRole.NORMAL, func.getAccessorRole());
		List<IASParameter> args = func.getParameters();
		assertEquals(3, args.size());
		IASParameter arg0 = (IASParameter) args.get(0);
		assertEquals("arg", arg0.getName());
		assertEquals("Number", arg0.getType());
		IASParameter arg1 = (IASParameter) args.get(1);
		assertEquals("foo", arg1.getName());
		assertNull(arg1.getType());
		assertEquals(" javadoc? ", func.getDescription());
		IASParameter arg2 = (IASParameter) args.get(2);
		assertTrue(arg2.isRest());
		assertEquals("...", arg2.getName());
		assertNull(arg2.getType());

		// compare the re-serialized code with the original input,
		StringWriter writer = new StringWriter();
		fact.newWriter().write(writer, unit);
		assertEquals(source.trim(), writer.toString());

		List<IASStatement> stats = func.getStatements();
		assertTrue(stats.get(0) instanceof IASForStatement);
		CodeMirror.assertReflection(fact, unit);
	}

	public void testInvalidInput()
	{
		StringReader reader = new StringReader("(*H!D)(&H!)D&*GH");

		ASFactory fact = new ASFactory();
		try
		{
			fact.newParser().parseIn(reader);
			fail("Should raise exception on invalid input");
		}
		catch (ASBlocksSyntaxError e)
		{
			// expected
		}
	}

	public void testStr() throws IOException, RecognitionException
	{
		final String input = "\\\"\n\t\r'";
		String result = ASTUtils.str(input);
		StringReader in = new StringReader(result);
		ANTLRReaderStream stream = new ANTLRReaderStream(in);
		AS3Lexer lex = new AS3Lexer(stream);
		Token tok = lex.nextToken();
		assertEquals(AS3Parser.STRING_LITERAL, tok.getType());
		assertEquals("\"\\\\\\\"\\n\\t\\r'\"", tok.getText());
	}
}