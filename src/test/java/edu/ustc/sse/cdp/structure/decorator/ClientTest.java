package edu.ustc.sse.cdp.structure.decorator;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteDecoratorA,ConcreteComponent,ConcreteDecoratorB", client.invoke());
	}
}
