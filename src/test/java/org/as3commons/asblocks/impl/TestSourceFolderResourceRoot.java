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
import java.io.IOException;
import java.util.List;

import org.as3commons.asblocks.dom.ASQName;
import org.junit.Test;
//import org.apache.commons.io.FileUtils;
import junit.framework.TestCase;

public class TestSourceFolderResourceRoot extends TestCase
{
	private File tmpDir;
	
	private File tmpFile1;
	private File tmpFile2;
	
	private File tmpPkg;
	
	public void setUp() throws IOException
	{
		tmpDir = new File(System.getProperty("java.io.tmpdir"), "jasblocks-test");
		tmpDir.mkdir();
		
		tmpFile1 = new File(tmpDir, "Test.as");
		tmpFile1.createNewFile();
		
		tmpPkg = new File(tmpDir, "pkg");
		tmpPkg.mkdir();
		
		tmpFile2 = new File(tmpPkg, "Test2.as");
		tmpFile2.createNewFile();
	}

	public void tearDown() throws IOException
	{
		assertTrue(tmpFile1.delete());
		assertTrue(tmpFile2.delete());
		assertTrue(tmpPkg.delete());
		assertTrue(tmpDir.delete());
	}
	
	@Test
	public void test_resourceRoot()
	{
		SourceFolderResourceRoot resourceRoot = new SourceFolderResourceRoot(tmpDir);
		List<ASQName> qnames = resourceRoot.getDefinitionQNames();
		assertEquals(2, qnames.size());
		assertEquals(new ASQName("pkg", "Test2"), qnames.get(0));
		assertEquals(new ASQName("Test"), qnames.get(1));
	}
}