package org.as3commons.asblocks.parser.antlr.as3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.List;

import junit.framework.TestCase;

import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.impl.AS3FragmentParser;
import org.as3commons.asblocks.impl.ASTASCompilationUnit;
import org.as3commons.asblocks.impl.ASTUtils;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class Test_AS3ParserModes extends TestCase
{

	LinkedListTree t;
	AS3Parser parser = null;
	String r = null;
	String xml = null;

	public static LinkedListTree tree(ParserRuleReturnScope returnScope)
	{
		return (LinkedListTree)returnScope.getTree();
	}
	
	@SuppressWarnings("unused")
	private void debug(ParserRuleReturnScope scope)
	{
		t = tree(scope);
		r = t.toStringTree();
		xml = ASTUtils.convert(t, false);
		r = toString().trim();
	}
	
	public void test_package()
	{
		
	}
	
	public void test_packageBlockParse() throws RecognitionException, FileNotFoundException
	{
		String data = "/* leading comment */\n";
		data += "package foo.bar {\n";
		data += "  [Foo(bar)]\n";
		data += "  import bar.*;\n";
		data += "  public dynamic class Baz extends Baz2 implements IGoo, IBar {\n";
		data += "    public var goo:int = 1;\n";
		data += "    [Foo(\"goo\")]\n";
		data += "    foo_bar function go(back:Boolean):String {\n";
		data += "      return null;\n";
		data += "    }\n";
		data += "  }\n";
		data += "}\n";
		
		parser = ASTUtils.parse(data);
		parser.setPackageBlockParse(true);
		
		try {
			t = tree(parser.compilationUnit());
		} catch (RecognitionException e) {
			throw ASTUtils.buildSyntaxException(null, parser, e);
		}
		
		IASCompilationUnit unit = new ASTASCompilationUnit(t);
		IASClassType ctype = (IASClassType) unit.getType();
		assertEquals("foo.bar", unit.getPackageName());
		assertEquals("Baz", ctype.getName());
		assertEquals("Baz2", ctype.getSuperClass());
		
		assertEquals(2, ctype.getImplementedInterfaces().size());
	}
	
	public void test_uicomponent() throws RecognitionException, FileNotFoundException
	{
		FileInputStream in = new FileInputStream("C:\\Users\\Teoti\\Documents\\Flash\\libraries\\" +
				"flex_sdk_4.5.0.20967\\frameworks\\projects\\framework\\src\\mx\\core\\UIComponent.as");
		InputStreamReader reader = new InputStreamReader(in);
		
		parser = ASTUtils.parse(reader);
		parser.setPackageBlockParse(true);
		
		try {
			t = tree(parser.compilationUnit());
		} catch (RecognitionException e) {
			throw ASTUtils.buildSyntaxException(null, parser, e);
		}
		
		IASCompilationUnit unit = new ASTASCompilationUnit(t);
		IASClassType ctype = (IASClassType) unit.getType();
		assertEquals("mx.core", unit.getPackageName());
		assertEquals("UIComponent", ctype.getName());
		
		//String xml = ASTUtils.convert(t, false);
	}
	
	@SuppressWarnings("unused")
	public void _test_package() throws RecognitionException, FileNotFoundException
	{
		//AS3Parser parser = ASTUtils.parse("package {}");
		//LinkedListTree t;// = tree(parser.compilationUnit());
		

		///*
		//FileInputStream in = new FileInputStream("C:\\Users\\Teoti\\Documents\\Flash\\libraries\\" +
		//		"flex_sdk_4.5.0.20967\\frameworks\\projects\\framework\\src\\mx\\core\\UIComponent.as");
		FileInputStream in = new FileInputStream("C:\\Users\\Teoti\\Documents\\Flash\\OpenSource\\flerry\\src-as3\\net" +
				"\\riaspace\\flerry\\NativeObject.as");
		//*/
		
		///*
		//FileInputStream in = new FileInputStream("C:\\Users\\Teoti\\Documents\\Flash\\" +
		//		"OpenSource\\jas-blocks\\jasblocks-tests\\resources\\AllSyntax.as");
		
		//
		
		InputStreamReader reader = new InputStreamReader(in);
		
		parser = ASTUtils.parse(reader);
		parser.setTypeBlockParse(true);
		
		LinkedListTree cu;
		try {
			t = tree(parser.compilationUnit());
		} catch (RecognitionException e) {
			throw ASTUtils.buildSyntaxException(null, parser, e);
		}	
		
		IASCompilationUnit unit = new ASTASCompilationUnit(t);
		IASClassType ctype = (IASClassType) unit.getType();
		List<IASMethod> methods = ctype.getMethods();	
		
		LinkedListTree me = AS3FragmentParser.parseClassTypeBlockEntry(methods.get(0).toString());
		
		//parser = parse("var foo:*=42;");
		//t = tree(parser.statement());
		String temp = t.toStringTree();
		String xml = ASTUtils.convert(t, false);		
		//System.err.println("here" + temp);
		return;
		/*
		LinkedListTree t;
		//----------------------------------------------------------------------
		// <->
		//----------------------------------------------------------------------
		//parser = parse("var foo:*=42;");
		//t = tree(parser.statement());
		//String temp = t.toStringTree();
		//String xml = ASTUtils.convert(t, false);
		
		
		//(COMPILATION_UNIT (package (IDENTIFIER (. (. foo baz) bo)) (BLOCK (import (IDENTIFIER_STAR foo bar *)))))
		//assertEquals("(COMPILATION_UNIT (package BLOCK))", t.toStringTree());
		
		//------------------------------
		// Simple Ident
		//parser = parse("package foo {}");
//		t = tree(parser.compilationUnit());
		
		
		
		// <COMPILATION_UNIT><PACKAGE><QNAME><IDENT>foo</IDENT></QNAME>
		// <BLOCK>BLOCK</BLOCK></PACKAGE></COMPILATION_UNIT>
		assertEquals("(COMPILATION_UNIT (package (QNAME foo) BLOCK))", t.toStringTree());
		
		//------------------------------
		// Qualified Ident
		parser = parse("package foo.bar.baz {}");
//		t = tree(parser.compilationUnit());
		
		// <COMPILATION_UNIT><PACKAGE><QNAME><IDENT>foo</IDENT><IDENT>bar</IDENT>
		// <IDENT>baz</IDENT></QNAME><BLOCK>BLOCK</BLOCK></PACKAGE></COMPILATION_UNIT>
		assertEquals("(COMPILATION_UNIT (package (QNAME foo bar baz) BLOCK))", t.toStringTree());
		
		//------------------------------
		// Qualified Ident, import directive
		parser = parse("package foo.bar.baz {import foo.bar.*;}");
//		t = tree(parser.compilationUnit());
		
		//<COMPILATION_UNIT><PACKAGE><QNAME><IDENT>foo</IDENT><IDENT>bar</IDENT>
		//<IDENT>baz</IDENT></QNAME><BLOCK><IMPORT><QNAME_STAR><QNAME><IDENT>foo</IDENT>
		//<IDENT>bar</IDENT></QNAME><STAR>*</STAR></QNAME_STAR></IMPORT></BLOCK>
		//</PACKAGE></COMPILATION_UNIT>
		assertEquals("(COMPILATION_UNIT (package (QNAME foo bar baz) " +
			"(BLOCK (import (QNAME_STAR (QNAME foo bar) *)))))", t.toStringTree());
			*/
	}
}
