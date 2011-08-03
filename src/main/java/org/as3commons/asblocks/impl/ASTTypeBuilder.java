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

import org.as3commons.asblocks.ASBlocksSyntaxError;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASField;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.Visibility;
import org.as3commons.asblocks.parser.antlr.LinkedListToken;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ASTTypeBuilder
{
	public static IASCompilationUnit newClass(String qualifiedName)
	{
		return synthesizeClass(qualifiedName);
	}

	public static IASCompilationUnit newInterface(String qualifiedName)
	{
		return synthesizeInterface(qualifiedName);
	}

	public static IASCompilationUnit newFunction(String qualifiedName,
			String returnType)
	{

		return synthesizeFunction(qualifiedName, returnType);
	}

	public static IASCompilationUnit newNamespace(String qualifiedName,
			String uri)
	{

		return synthesizeNamespace(qualifiedName, uri);
	}

	public static ASTASCompilationUnit synthesizeClass(String qualifiedName)
	{
		// add the CU
		LinkedListTree unit = ASTUtils.newImaginaryAST(AS3Parser.COMPILATION_UNIT);
		LinkedListTree packageAST = ASTUtils.newAST(AS3Parser.PACKAGE, "package");
		packageAST.appendToken(TokenBuilder.newSpace());

		// add the CU/PACKAGE
		unit.addChildWithTokens(packageAST);

		String packageName = packageNameFrom(qualifiedName);
		if (packageName != null)
		{
			// add the CU/PACKAGE/TYPE
			LinkedListToken space = TokenBuilder.newSpace();
			LinkedListTree typeSpec = AS3FragmentParser.parseType(packageName);
			packageAST.addChildWithTokens(typeSpec);
			// add the space to the typeSpec so it gets removed when the name is removed
			typeSpec.appendToken(space);
		}

		LinkedListTree packageBlock = ASTBuilder.newBlock();
		// add the CU/PACKAGE/BLOCK/ANNOTATIONS
		LinkedListTree annos = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);

		// ad the CU/PACKAGE/BLOCK
		packageAST.addChildWithTokens(packageBlock);
		String className = typeNameFrom(qualifiedName);

		LinkedListTree clazz = synthesizeAS3ClassAST(className);
		ASTUtils.addChildWithIndentation(packageBlock, clazz);

		packageBlock.addChildAtWithTokens(0, annos);

		return new ASTASCompilationUnit(unit);
	}

	public static IASCompilationUnit synthesizeInterface(String qualifiedName)
	{
		LinkedListTree unit = ASTUtils.newImaginaryAST(AS3Parser.COMPILATION_UNIT);
		LinkedListTree packageAST = ASTUtils.newAST(AS3Parser.PACKAGE, "package");
		packageAST.appendToken(TokenBuilder.newSpace());

		// add the CU/PACKAGE
		unit.addChildWithTokens(packageAST);

		String packageName = packageNameFrom(qualifiedName);
		if (packageName != null)
		{
			// add the CU/PACKAGE/TYPE
			LinkedListToken space = TokenBuilder.newSpace();
			LinkedListTree typeSpec = AS3FragmentParser.parseType(packageName);
			packageAST.addChildWithTokens(typeSpec);
			// add the space to the typeSpec so it gets removed when the name is removed
			typeSpec.appendToken(space);
		}

		LinkedListTree packageBlock = ASTBuilder.newBlock();
		// add the CU/PACKAGE/BLOCK/ANNOTATIONS
		LinkedListTree annos = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);

		// ad the CU/PACKAGE/BLOCK
		packageAST.addChildWithTokens(packageBlock);

		LinkedListTree iface = synthesizeAS3InterfaceAST(qualifiedName);
		ASTUtils.addChildWithIndentation(packageBlock, iface);

		packageBlock.addChildAtWithTokens(0, annos);

		return new ASTASCompilationUnit(unit);
	}

	public static ASTASCompilationUnit synthesizeFunction(String qualifiedName,
			String returnType)
	{
		// add the CU
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.COMPILATION_UNIT);

		LinkedListTree packageAST = ASTUtils.newAST(AS3Parser.PACKAGE, "package");
		packageAST.appendToken(TokenBuilder.newSpace());
		// add the CU/PACKAGE
		ast.addChildWithTokens(packageAST);

		String packageName = packageNameFrom(qualifiedName);
		if (packageName != null)
		{
			// add the CU/PACKAGE/TYPE
			LinkedListToken space = TokenBuilder.newSpace();
			LinkedListTree typeSpec = AS3FragmentParser.parseType(packageName);
			packageAST.addChildWithTokens(typeSpec);
			// add the space to the typeSpec so it gets removed when the name is removed
			typeSpec.appendToken(space);
		}

		LinkedListTree packageBlock = ASTBuilder.newBlock();
		// add the CU/PACKAGE/BLOCK/ANNOTATIONS
		LinkedListTree annos = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);

		// ad the CU/PACKAGE/BLOOCK
		packageAST.addChildWithTokens(packageBlock);
		String functionName = typeNameFrom(qualifiedName);

		LinkedListTree clazz = synthesizeAS3FunctionAST(functionName, returnType);
		ASTUtils.addChildWithIndentation(packageBlock, clazz);

		// add the annos last so the indentation of the CLASS_DEF dosn't mess up
		packageBlock.addChildAtWithTokens(0, annos);

		return new ASTASCompilationUnit(ast);
	}

	public static ASTASCompilationUnit synthesizeNamespace(
			String qualifiedName, String uri)
	{
		// add the CU
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.COMPILATION_UNIT);

		LinkedListTree packageAST = ASTUtils.newAST(AS3Parser.PACKAGE, "package");
		packageAST.appendToken(TokenBuilder.newSpace());
		// add the CU/PACKAGE
		ast.addChildWithTokens(packageAST);

		String packageName = packageNameFrom(qualifiedName);
		if (packageName != null)
		{
			// add the CU/PACKAGE/TYPE
			LinkedListToken space = TokenBuilder.newSpace();
			LinkedListTree typeSpec = AS3FragmentParser.parseType(packageName);
			packageAST.addChildWithTokens(typeSpec);
			// add the space to the typeSpec so it gets removed when the name is removed
			typeSpec.appendToken(space);
		}

		LinkedListTree packageBlock = ASTBuilder.newBlock();
		// add the CU/PACKAGE/BLOCK/ANNOTATIONS
		LinkedListTree annos = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);

		// ad the CU/PACKAGE/BLOOCK
		packageAST.addChildWithTokens(packageBlock);
		String functionName = typeNameFrom(qualifiedName);

		LinkedListTree nspace = synthesizeAS3NamespaceAST(functionName, uri);
		ASTUtils.addChildWithIndentation(packageBlock, nspace);

		// add the annos last so the indentation of the CLASS_DEF dosn't mess up
		packageBlock.addChildAtWithTokens(0, annos);

		return new ASTASCompilationUnit(ast);
	}

	private static LinkedListTree synthesizeAS3NamespaceAST(
			String qualifiedName, String uri)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.VARIABLE_DEF);
		LinkedListTree modifiers = ASTUtils.newImaginaryAST(AS3Parser.MODIFIERS);
		ast.addChildWithTokens(modifiers);
		modifiers.addChildWithTokens(ASTUtils.newAST(AS3Parser.PUBLIC, "public"));
		modifiers.appendToken(TokenBuilder.newSpace());
		ast.addChildWithTokens(ASTUtils.newAST(AS3Parser.NAMESPACE, "namespace"));
		ast.appendToken(TokenBuilder.newSpace());

		LinkedListTree varDec = ASTUtils.newImaginaryAST(AS3Parser.VAR_DEC);
		varDec.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, typeNameFrom(qualifiedName)));
		LinkedListTree assign = ASTUtils.newAST(AS3Parser.ASSIGN, "=");
		assign.addChildWithTokens(ASTUtils.newAST(ASTUtils.newStringLiteral(uri)));
		varDec.addChildWithTokens(assign);
		ast.addChildWithTokens(varDec);

		ast.appendToken(TokenBuilder.newSemi());
		return ast;
	}

	private static LinkedListTree synthesizeAS3InterfaceAST(String qualifiedName)
	{
		LinkedListTree iface = ASTUtils.newImaginaryAST(AS3Parser.INTERFACE_DEF);
		LinkedListTree modifiers = ASTUtils.newImaginaryAST(AS3Parser.MODIFIERS);
		iface.addChildWithTokens(modifiers);
		modifiers.addChildWithTokens(ASTUtils.newAST(AS3Parser.PUBLIC, "public"));
		modifiers.appendToken(TokenBuilder.newSpace());
		iface.appendToken(TokenBuilder.newInterface());
		iface.appendToken(TokenBuilder.newSpace());
		iface.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, typeNameFrom(qualifiedName)));
		iface.appendToken(TokenBuilder.newSpace());
		iface.addChildWithTokens(ASTBuilder.newTypeBlock());
		return iface;
	}

	private static String typeNameFrom(String qualifiedName)
	{
		int p = qualifiedName.lastIndexOf('.');
		if (p == -1)
		{
			return qualifiedName;
		}
		return qualifiedName.substring(p + 1);
	}

	private static LinkedListTree synthesizeAS3ClassAST(String className)
	{
		LinkedListTree clazz = ASTUtils.newImaginaryAST(AS3Parser.CLASS_DEF);
		LinkedListTree modifiers = ASTUtils.newImaginaryAST(AS3Parser.MODIFIERS);
		clazz.addChildWithTokens(modifiers);
		LinkedListTree modPublic = ASTUtils.newAST(AS3Parser.PUBLIC, "public");
		modifiers.addChildWithTokens(modPublic);
		modifiers.appendToken(TokenBuilder.newSpace());
		clazz.appendToken(TokenBuilder.newClass());
		clazz.appendToken(TokenBuilder.newSpace());
		clazz.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, className));
		clazz.appendToken(TokenBuilder.newSpace());
		clazz.addChildWithTokens(ASTBuilder.newTypeBlock());
		return clazz;
	}

	private static LinkedListTree synthesizeAS3FunctionAST(String functionName,
			String returnType)
	{
		LinkedListTree clazz = ASTUtils.newImaginaryAST(AS3Parser.FUNCTION_DEF);
		LinkedListTree modifiers = ASTUtils.newImaginaryAST(AS3Parser.MODIFIERS);
		clazz.addChildWithTokens(modifiers);
		LinkedListTree modPublic = ASTUtils.newAST(AS3Parser.PUBLIC, "public");
		modifiers.addChildWithTokens(modPublic);
		modifiers.appendToken(TokenBuilder.newSpace());
		clazz.appendToken(TokenBuilder.newFunction());
		clazz.appendToken(TokenBuilder.newSpace());
		clazz.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, functionName));

		clazz.addChildWithTokens(ASTUtils.newParentheticAST(AS3Parser.PARAMS, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")"));
		if (returnType != null)
		{
			clazz.addChildWithTokens(AS3FragmentParser.parseTypeSpec(returnType));
		}

		clazz.appendToken(TokenBuilder.newSpace());
		clazz.addChildWithTokens(ASTBuilder.newBlock());
		return clazz;
	}

	private static String packageNameFrom(String qualifiedName)
	{
		int p = qualifiedName.lastIndexOf('.');
		if (p == -1)
		{
			return null;
		}
		return qualifiedName.substring(0, p);
	}

	public static IASField newField(String name, Visibility visibility,
			String type)
	{
		if (name.indexOf('.') != -1)
		{
			throw new ASBlocksSyntaxError("field name must not contain '.'");
		}
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.FIELD_DEF);
		LinkedListTree annotations = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);
		ast.addChildWithTokens(annotations);
		ast.addChildWithTokens(ModifierUtils.toModifiers(visibility));
		ast.addChildWithTokens(ASTUtils.newAST(AS3Parser.VAR, "var"));
		ast.appendToken(TokenBuilder.newSpace());

		LinkedListTree varDec = ASTUtils.newImaginaryAST(AS3Parser.VAR_DEC);
		LinkedListTree def = ASTUtils.newAST(AS3Parser.IDENT, name);
		varDec.addChildWithTokens(def);

		ast.addChildWithTokens(varDec);
		if (type != null)
		{
			varDec.addChildWithTokens(AS3FragmentParser.parseTypeSpec(type));
		}
		ast.appendToken(TokenBuilder.newSemi());

		IASField field = new ASTASField(ast);

		return field;
	}
/*
	public static IASNamespace newNamespace(String name, String uri,
			Visibility visibility)
	{
		LinkedListTree ast = ASTUtils.newImaginaryAST(AS3Parser.FIELD_DEF);
		LinkedListTree annotations = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);
		ast.addChildWithTokens(annotations);
		ast.addChildWithTokens(ModifierUtils.toModifiers(visibility));

		ast.addChildWithTokens(ASTUtils.newAST(AS3Parser.NAMESPACE, "namespace"));

		ast.appendToken(TokenBuilder.newSpace());

		LinkedListTree varDec = ASTUtils.newImaginaryAST(AS3Parser.VAR_DEC);
		varDec.addChildWithTokens(ASTUtils.newAST(AS3Parser.IDENT, name));
		LinkedListTree assign = ASTUtils.newAST(AS3Parser.ASSIGN, "=");
		assign.addChildWithTokens(ASTUtils.newAST(ASTUtils.newStringLiteral(uri)));
		varDec.addChildWithTokens(assign);
		ast.addChildWithTokens(varDec);

		ast.appendToken(TokenBuilder.newSemi());
		return new ASTASNamespace(ast);
	}
*/
	public static IASMethod newClassMethod(String name, Visibility visibility,
			String returnType)
	{
		LinkedListTree def = ASTUtils.newImaginaryAST(AS3Parser.METHOD_DEF);
		LinkedListTree annos = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);
		def.addChildWithTokens(annos);

		def.addChildWithTokens(ModifierUtils.toModifiers(visibility));
		def.appendToken(TokenBuilder.newFunction());
		def.appendToken(TokenBuilder.newSpace());
		LinkedListTree acc = ASTUtils.newPlaceholderAST(AS3Parser.ACCESSOR_ROLE);
		def.addChildWithTokens(acc);
		LinkedListTree methName = ASTUtils.newAST(AS3Parser.IDENT, name);
		def.addChildWithTokens(methName);
		def.addChildWithTokens(ASTUtils.newParentheticAST(AS3Parser.PARAMS, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")"));

		if (returnType != null)
		{
			def.addChildWithTokens(AS3FragmentParser.parseTypeSpec(returnType));
		}
		def.appendToken(TokenBuilder.newSpace());
		LinkedListTree block = ASTBuilder.newBlock();
		def.addChildWithTokens(block);

		return new ASTASMethod(def);
	}

	public static IASMethod newInterfaceMethod(String name,
			Visibility visibility, String returnType)
	{
		LinkedListTree def = ASTUtils.newImaginaryAST(AS3Parser.METHOD_DEF);
		LinkedListTree annos = ASTUtils.newPlaceholderAST(AS3Parser.ANNOTATIONS);
		def.addChildWithTokens(annos);
		//def.addChildWithTokens(ModifierUtils.toModifiers(visibility));
		// all interface methods have default (public) visibility
		//def.addChildWithTokens(ModifierUtils.toModifiers(Visibility.DEFAULT));
		def.appendToken(TokenBuilder.newFunction());
		def.appendToken(TokenBuilder.newSpace());
		LinkedListTree acc = ASTUtils.newPlaceholderAST(AS3Parser.ACCESSOR_ROLE);
		def.addChildWithTokens(acc);
		LinkedListTree methName = ASTUtils.newAST(AS3Parser.IDENT, name);
		def.addChildWithTokens(methName);
		def.addChildWithTokens(ASTUtils.newParentheticAST(AS3Parser.PARAMS, AS3Parser.LPAREN, "(", AS3Parser.RPAREN, ")"));
		if (returnType != null)
		{
			def.addChildWithTokens(AS3FragmentParser.parseTypeSpec(returnType));
		}
		def.appendToken(TokenBuilder.newSemi());

		return new ASTASMethod(def);
	}
}
