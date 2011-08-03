package org.as3commons.asblocks.impl;

import org.as3commons.asblocks.IASProject;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IScriptElement;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.AS3Parser;

public class ElementUtils
{

	public static IScriptElement getParent(IASProject project,
			LinkedListTree ast)
	{
		if (ast.getType() == AS3Parser.COMPILATION_UNIT)
		{
			//for (IASFile file : project.getASFiles())
			//{
				//if (((ASTScriptElement)unit).getAST().equals(ast))
				//{
				//	return unit;
				//}
			//}
		}
		else if (ast.getType() == AS3Parser.PACKAGE)
		{
			for (IASCompilationUnit unit : project.getCompilationUnits())
			{
				if (((ASTScriptElement) unit).getAST().equals(ast))
				{
					return unit;
				}
			}
		}
		else if (isType(ast))
		{
			
		}

		return null;
	}

	private static boolean isType(LinkedListTree ast)
	{
		switch (ast.getType())
		{
		case AS3Parser.CLASS_DEF:
		case AS3Parser.INTERFACE_DEF:
		case AS3Parser.FUNCTION_DEF:
		case AS3Parser.NAMESPACE_DEF:
			return true;
		}
		return false;
	}

}
