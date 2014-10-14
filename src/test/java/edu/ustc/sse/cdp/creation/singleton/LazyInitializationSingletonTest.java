package edu.ustc.sse.cdp.creation.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LazyInitializationSingletonTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		LazyInitializationSingleton a = LazyInitializationSingleton.getInstance();
		LazyInitializationSingleton b = LazyInitializationSingleton.getInstance();
		
		Assert.assertEquals(a, b);
		Assert.assertEquals(a.invoke(), b.invoke());
	}
}
