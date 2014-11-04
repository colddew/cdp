package edu.ustc.sse.cdp.behavior.command;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvokeCommonCommand() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("Executor", client.invokeCommonCommand());
	}
}
