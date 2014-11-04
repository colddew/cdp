package edu.ustc.sse.cdp.behavior.command;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvokeConcreteCommand() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteCommand", client.invokeConcreteCommand());
	}
	
	@Test
	public void testInvokeCommandQueue() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteCommandA,ConcreteCommandB,ConcreteCommandC", client.invokeCommandQueue());
	}
}
