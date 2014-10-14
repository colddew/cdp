package edu.ustc.sse.cdp.creation.singleton;

import org.junit.Assert;
import org.junit.Test;

public class EnumSingletonTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		EnumSingleton a = EnumSingleton.instance;
		EnumSingleton b = EnumSingleton.instance;
		
		Assert.assertEquals(a, b);
		Assert.assertEquals(a.invoke(), b.invoke());
	}
}
