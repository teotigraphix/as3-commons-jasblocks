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

import junit.framework.Test;
import junit.framework.TestSuite;

import org.as3commons.asblocks.impl.ExpressionParseTests;
import org.as3commons.asblocks.impl.OperatorPrecedenceTests;
import org.as3commons.asblocks.impl.ParentheticExpressionTests;
import org.as3commons.asblocks.impl.TestAS3FragmentParser;
import org.as3commons.asblocks.impl.TestAS3Parser;
import org.as3commons.asblocks.impl.TestASTIterator;
import org.as3commons.asblocks.impl.TestASTUtils;
import org.as3commons.asblocks.impl.TestSWCResourceRoot;
import org.as3commons.asblocks.impl.TestSourceFolderResourceRoot;
import org.as3commons.asblocks.impl.Test_ASTASArrayAccessExpression;
import org.as3commons.asblocks.impl.Test_ASTASAssignmentExpression;
import org.as3commons.asblocks.impl.Test_ASTASBinaryExpression;
import org.as3commons.asblocks.impl.Test_ASTASClassType;
import org.as3commons.asblocks.impl.Test_ASTASConditionalExpression;
import org.as3commons.asblocks.impl.Test_ASTASConfigStatement;
import org.as3commons.asblocks.impl.Test_ASTASField;
import org.as3commons.asblocks.impl.Test_ASTASFunctionExpression;
import org.as3commons.asblocks.impl.Test_ASTASFunctionType;
import org.as3commons.asblocks.impl.Test_ASTASInterfaceType;
import org.as3commons.asblocks.impl.Test_ASTASInvocationExpression;
import org.as3commons.asblocks.impl.Test_ASTASLiteral;
import org.as3commons.asblocks.impl.Test_ASTASMethod;
import org.as3commons.asblocks.impl.Test_ASTASNamespaceType;
import org.as3commons.asblocks.impl.Test_ASTASPackage;
import org.as3commons.asblocks.impl.Test_ASTASPostfixExpression;
import org.as3commons.asblocks.impl.Test_ASTASPrefixExpression;
import org.as3commons.asblocks.impl.Test_ASTASProject;
import org.as3commons.asblocks.impl.Test_ASTMetaTag;
import org.as3commons.asblocks.impl.Test_ASTStatementList;
import org.as3commons.asblocks.impl.Test_BasicUnit;
import org.as3commons.asblocks.impl.Test_DocComment;
import org.as3commons.asblocks.impl.TokenBoundryTests;
import org.as3commons.asblocks.parser.antlr.TestAST;
import org.as3commons.asblocks.parser.antlr.TestBasicListUpdateDelegate;
import org.as3commons.asblocks.parser.antlr.TestLinkedListToken;
import org.as3commons.asblocks.parser.antlr.TestLinkedListTokenStream;
import org.as3commons.asblocks.parser.antlr.TestLinkedListTree;
import org.as3commons.asblocks.parser.antlr.as3.TestAS3Parser_CompilationUnit;
import org.as3commons.asblocks.parser.antlr.as3.Test_AS3Parser_Expressions;
import org.as3commons.asblocks.parser.antlr.as3.Test_AS3ParserModes;
import org.as3commons.asblocks.parser.antlr.asdoc.TestASDocParser;

public class AllJASBlockTests
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite("Test for org.as3commons.asblocks");
		//$JUnit-BEGIN$
		
		suite.addTestSuite(Test_AS3ParserModes.class);
		suite.addTestSuite(TestAS3Parser_CompilationUnit.class);

		suite.addTestSuite(TestAST.class);
		suite.addTestSuite(TestBasicListUpdateDelegate.class);
		suite.addTestSuite(TestLinkedListToken.class);
		suite.addTestSuite(TestLinkedListTokenStream.class);
		suite.addTestSuite(TestLinkedListTree.class);

		suite.addTestSuite(TestASDocParser.class);
		
		suite.addTestSuite(TokenBoundryTests.class);
		suite.addTestSuite(ExpressionParseTests.class);
		suite.addTestSuite(OperatorPrecedenceTests.class);
		suite.addTestSuite(ParentheticExpressionTests.class);
		
		suite.addTestSuite(Test_ASTMetaTag.class);
		suite.addTestSuite(Test_ASTASPackage.class);
		suite.addTestSuite(Test_ASTASClassType.class);
		suite.addTestSuite(Test_ASTASInterfaceType.class);
		suite.addTestSuite(Test_ASTASFunctionType.class);
		suite.addTestSuite(Test_ASTASNamespaceType.class);
		suite.addTestSuite(Test_ASTASField.class);
		suite.addTestSuite(Test_ASTASMethod.class);
		
		suite.addTestSuite(Test_ASTStatementList.class);
		
		suite.addTestSuite(Test_ASTASLiteral.class);
		suite.addTestSuite(Test_ASTASPostfixExpression.class);
		suite.addTestSuite(Test_ASTASPrefixExpression.class);
		suite.addTestSuite(Test_ASTASBinaryExpression.class);
		suite.addTestSuite(Test_ASTASInvocationExpression.class);
//		suite.addTestSuite(Test_ASTASNewExpression.class);
		suite.addTestSuite(Test_ASTASArrayAccessExpression.class);
		suite.addTestSuite(Test_ASTASConditionalExpression.class);
		suite.addTestSuite(Test_ASTASAssignmentExpression.class);
		suite.addTestSuite(Test_ASTASFunctionExpression.class);
		suite.addTestSuite(Test_ASTASConfigStatement.class);
		
		
//		suite.addTestSuite(E4XTests.class);
		
		suite.addTestSuite(Test_BasicUnit.class);
		suite.addTestSuite(Test_DocComment.class);
		
		suite.addTestSuite(TestAS3FragmentParser.class);
		suite.addTestSuite(TestAS3Parser.class);
		suite.addTestSuite(Test_ASTASProject.class);
		suite.addTestSuite(TestASTIterator.class);
		suite.addTestSuite(TestASTUtils.class);
		suite.addTestSuite(TestSourceFolderResourceRoot.class);
		suite.addTestSuite(TestSWCResourceRoot.class);
		
		suite.addTestSuite(Test_AS3Parser_Expressions.class);
		
		
		//$JUnit-END$
		return suite;
	}
}
