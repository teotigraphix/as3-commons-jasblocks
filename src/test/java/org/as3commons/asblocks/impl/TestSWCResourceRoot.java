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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.as3commons.asblocks.dom.ASQName;

import junit.framework.TestCase;

public class TestSWCResourceRoot extends TestCase
{
	public void testIt() throws IOException
	{
		File file = File.createTempFile("test", ".swc");
		createTextSWC(file);
		SWCResourceRoot root = new SWCResourceRoot(file);
		List list = root.getDefinitionQNames();
		assertEquals(2, list.size());
		assertEquals(new ASQName("flashy.events", "EventWrecker"), list.get(0));
		assertEquals(new ASQName("NoPackage"), list.get(1));
		file.delete();
	}

	private void createTextSWC(File file) throws FileNotFoundException,
			IOException
	{
		ZipEntry catalogEntry = new ZipEntry("catalog.xml");
		FileOutputStream out = new FileOutputStream(file);
		file.deleteOnExit();
		ZipOutputStream zip = new ZipOutputStream(out);
		zip.putNextEntry(catalogEntry);
		OutputStreamWriter writer = new OutputStreamWriter(zip);
		writer.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<swc xmlns=\"http://www.adobe.com/flash/swccatalog/9\">"
				+ "  <versions>" + "    <swc version=\"1.0\"/>"
				+ "    <flex version=\"2.0\" build=\"0\"/>" + "  </versions>"
				+ "  <features>" + "    <feature-script-deps/>"
				+ "    <feature-components/>" + "    <feature-files/>"
				+ "  </features>" + "  <libraries>"
				+ "    <library path=\"library.swf\">"
				+ "      <script name=\"EventWrecker\" mod=\"1234567890123\">"
				+ "        <def id=\"flashy.events:EventWrecker\"/>"
				+ "        <def id=\"NoPackage\"/>"
				+ "        <dep id=\"Object\" type=\"i\"/>" + "      </script>"
				+ "    </library>" + "  </libraries>" + "  <files>"
				+ "  </files>" + "</swc>");
		writer.flush();
		zip.close();
	}
}
