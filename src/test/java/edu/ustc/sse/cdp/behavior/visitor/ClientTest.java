package edu.ustc.sse.cdp.behavior.visitor;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testHandleConcreteVisitorA() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteVisitorA,ConcreteElementA,ConcreteVisitorA,ConcreteElementB", client.handleConcreteVisitorA());
	}
	
	@Test
	public void testHandleConcreteVisitorB() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteVisitorB,ConcreteElementB,ConcreteVisitorB,ConcreteElementA", client.handleConcreteVisitorB());
	}
	
	@Test
	public void testHandleObjectStructure() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteVisitorA,ConcreteElementA,ConcreteVisitorA,ConcreteElementB,ConcreteVisitorB,ConcreteElementA,ConcreteVisitorB,ConcreteElementB", client.handleObjectStructure());
	}
}
