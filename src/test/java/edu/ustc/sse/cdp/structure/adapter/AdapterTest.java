package edu.ustc.sse.cdp.structure.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		Assert.assertEquals("adaptee", adapter.invoke());
	}
}
