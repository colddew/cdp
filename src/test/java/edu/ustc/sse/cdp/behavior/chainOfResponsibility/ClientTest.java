package edu.ustc.sse.cdp.behavior.chainOfResponsibility;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testHandleByConcreteHandlerA() throws Exception {
		
		Client client = new Client();
		
		Assert.assertNull(client.handleByConcreteHandlerA(null));
		Assert.assertEquals("ConcreteHandlerA", client.handleByConcreteHandlerA("A"));
	}
	
	@Test
	public void testHandleByConcreteHandlerAB() throws Exception {
		
		Client client = new Client();
		
		Assert.assertNull(client.handleByConcreteHandlerAB(null));
		Assert.assertEquals("ConcreteHandlerA", client.handleByConcreteHandlerAB("A"));
		Assert.assertEquals("ConcreteHandlerB", client.handleByConcreteHandlerAB("B"));
	}
	
	@Test
	public void testHandleByConcreteHandlerABC() throws Exception {
		
		Client client = new Client();
		
		Assert.assertNull(client.handleByConcreteHandlerABC(null));
		Assert.assertEquals("ConcreteHandlerA", client.handleByConcreteHandlerABC("A"));
		Assert.assertEquals("ConcreteHandlerB", client.handleByConcreteHandlerABC("B"));
		Assert.assertEquals("ConcreteHandlerC", client.handleByConcreteHandlerABC("C"));
	}
}
