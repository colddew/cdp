package edu.ustc.sse.cdp.behavior.state;

import org.junit.Assert;
import org.junit.Test;

public class ContextTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Context context = new Context();
		
		Assert.assertEquals("ConcreteStateA", context.invoke("a"));
		Assert.assertEquals("ConcreteStateB", context.invoke("b"));
	}
}
