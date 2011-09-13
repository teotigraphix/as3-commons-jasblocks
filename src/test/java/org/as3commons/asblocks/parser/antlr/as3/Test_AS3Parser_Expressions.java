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

package org.as3commons.asblocks.parser.antlr.as3;

import junit.framework.TestCase;

import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.as3commons.asblocks.impl.ASTUtils;
import org.as3commons.asblocks.parser.antlr.LinkedListTree;

public class Test_AS3Parser_Expressions extends TestCase
{
    LinkedListTree t;
    AS3Parser parser = null;
    String r = null;
    String xml = null;
    
    private void debug(ParserRuleReturnScope scope)
    {
        t = tree(scope);
        r = t.toStringTree();
        xml = ASTUtils.convert(t, false);
        r = toString().trim();
    }    
    
	public void test_package()
	{
		String data = "var foo:Vector.<Number> = new <Number>[0,0,0,0,0];";
		parser = ASTUtils.parse(data);
		
		//try {
        //    t = tree(parser.statement());
        //} catch (RecognitionException e) {
        //   
        //    e.printStackTrace();
        //}
		
		
		
	}
	
	
	@SuppressWarnings("unused")
	private LinkedListTree tree(ParserRuleReturnScope expression)
	{
		return (LinkedListTree)expression.getTree();
	}
}
