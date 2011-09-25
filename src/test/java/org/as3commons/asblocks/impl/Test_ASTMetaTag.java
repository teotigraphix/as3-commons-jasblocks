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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.as3commons.asblocks.ASFactory;
import org.as3commons.asblocks.dom.IASClassType;
import org.as3commons.asblocks.dom.IASCompilationUnit;
import org.as3commons.asblocks.dom.IASMetaTag;
import org.as3commons.asblocks.dom.IASMethod;
import org.as3commons.asblocks.dom.IASPackage;
import org.as3commons.asblocks.dom.IASType;
import org.as3commons.asblocks.dom.IMetaTagAware;
import org.as3commons.asblocks.dom.Visibility;

public class Test_ASTMetaTag extends TestCase
{
    private ASFactory fact = new ASFactory();
    private IASCompilationUnit unit;

    protected void setUp()
    {
        unit = fact.newClass("Test");
    }

    protected void tearDown() throws IOException
    {
        CodeMirror.assertReflection(fact, unit);
    }

    // TODO: test doc-comments get attached in the correct place

    public void testMethod()
    {
        IASClassType clazz = (IASClassType) unit.getType();
        IASMethod meth = clazz.newMethod("test", Visibility.PUBLIC, null);
        check(meth);
    }

    public void testClass()
    {
        IASPackage pckg = (IASPackage) unit.getPackage();
        IASClassType clazz = (IASClassType) unit.getType();
        check(pckg);
    }

    public void testType()
    {
        // check(unit.getType());
    }

    @SuppressWarnings("unused")
    public void check(IMetaTagAware taggable)
    {
        assertEquals(Collections.EMPTY_LIST, taggable.getMetaTags());
        assertNull(taggable.getMetaTag("missing"));
        assertEquals(Collections.EMPTY_LIST, taggable.getAllMetaTags("missing"));
        IASMetaTag bindable = taggable.newMetaTag("Biddable");
        assertEquals("Biddable", bindable.getName());
        assertEquals(1, taggable.getMetaTags().size());
        assertEquals(Collections.EMPTY_LIST, bindable.getParameters());
        assertNull(bindable.getParameterValue("missing"));
        bindable.addBooleanParam(true);
        bindable.addIntParam(123);
        bindable.addStringParam("test");
        bindable.addStringParam("value", "name");
        List<Object> params = bindable.getParameters();
        assertEquals(4, params.size());
        assertEquals(Boolean.TRUE, params.get(0));
        assertEquals(new Integer(123), params.get(1));
        assertEquals("test", params.get(2));
        assertEquals("value", bindable.getParameterValue("name"));
        IASMetaTag event = taggable.newMetaTag("Event");
        assertNotNull(taggable.getMetaTag("Event"));
        IASMetaTag foo = taggable.newMetaTag("Foo");
        assertEquals(1, taggable.getAllMetaTags("Foo").size());
    }

    public void testParsed() throws FileNotFoundException
    {
        String src = "package framework.business{\n"
                + "	import com.adobe.cairngorm.business.ServiceLocator;\n"
                + "	import mx.rpc.IResponder;\n"
                + "	/**\n"
                + "	 * BDelegate comment\n"
                + "	 */\n"
                + "	[Bindable]\n"
                + "	public class TestDelegate {\n"
                + "		private var responder:IResponder;\n"
                + "		private var service:Object;\n"
                + "		public function TestDelegate(responder:mx.rpc.IResponder) {\n"
                + "			//Save Responder\n"
                + "			//this.responder = responder;\n"
                + "			//Save Service\n"
                + "			//this.service = ServiceLocator.getInstance().getService(\"TestRO\");\n"
                + "		}\n" + "		public function findAndUpdate():void {\n"
                + "			var call:Object = this.service.findAndUpdate();\n"
                + "			call.addResponder(responder);\n" + "		}\n" + "	}\n"
                + "}\n";
        unit = fact.newParser().parseIn(new StringReader(src));
        // IASType testType = unit.getType();
        IASPackage pckg = (IASPackage) unit.getPackage();
        assertEquals(1, pckg.getMetaTags().size());
        assertEquals(0, pckg.getAllMetaTags("RemoteClass").size());
        assertEquals(1, pckg.getAllMetaTags("Bindable").size());
    }

    public void test_newMetaTag()
    {
        String src = "package foo.bar {\n"
                + " [Foo]\n"
                + " public class Baz {\n"
                + "     [MetaOne]\n"
                + "     public function testBaz():void {\n"
                + "     }\n"
                + "}\n"
                + "}\n";

        unit = fact.newParser().parseIn(new StringReader(src));
        IASPackage pckg = unit.getPackage();
        pckg.newMetaTag("Bar");
        IASClassType asClass = (IASClassType) unit.getType();
        IASMethod method = asClass.getMethod("testBaz");

        IASMetaTag tag = method.newMetaTag("TestMeta");
        tag.setDescription("Foo bar.");
        
        String result = unit.toString();
        assertEquals("package foo.bar {\n [Foo]\n [Bar]\n public class Baz {\n" +
        		"     [MetaOne]\n     /**\n      * Foo bar.\n      */\n     " +
        		"[TestMeta]\n     public function testBaz():void {\n     }\n}\n}", result);
    }

    public void testParseValuedParam()
    {
        final String AS_CLASS = "package org.test\n" + "{\n"
                + "       public class MetaTagTest\n" + "       {\n"
                + "               [MyMetaTag(param=\"value\")]  \n"
                + "               public function myFunction():void\n"
                + "               {\n" + "               }\n" + "       }\n"
                + "}";

        unit = fact.newParser().parseIn(new StringReader(AS_CLASS));
        IASClassType asClass = (IASClassType) unit.getType();
        IASMethod asMethod = (IASMethod) asClass.getMethods().iterator().next();
        IASMetaTag asMetaTag = (IASMetaTag) asMethod.getMetaTags().iterator().next();

        assertEquals("MyMetaTag", asMetaTag.getName());
        assertEquals("value", asMetaTag.getParameterValue("param"));

        List<Object> params = asMetaTag.getParameters();
        ExtraAssertions.assertSize(1, params);
    }
}
