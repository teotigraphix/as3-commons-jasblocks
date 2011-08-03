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

import java.util.Collection;
import junit.framework.Assert;

public class ExtraAssertions
{
	@SuppressWarnings("rawtypes")
	public static void assertInstanceof(Object instance, Class type)
	{
		Assert.assertTrue("expected an instance of <" + type.getName()
				+ ">, but got <" + instance.getClass().getName() + ">",
				type.isInstance(instance));
	}

	@SuppressWarnings("rawtypes")
	public static void assertSize(int size, Collection c)
	{
		Assert.assertEquals(size, c.size());
	}
}
