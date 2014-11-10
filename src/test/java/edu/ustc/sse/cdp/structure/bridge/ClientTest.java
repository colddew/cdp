package edu.ustc.sse.cdp.structure.bridge;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvokeConcreteImplementorA() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteImplementorA,RefinedAbstraction", client.invokeConcreteImplementorA());
	}
	
	@Test
	public void testInvokeConcreteImplementorB() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteImplementorB,RefinedAbstraction", client.invokeConcreteImplementorB());
	}
}
