package edu.ustc.sse.cdp.behavior.observer;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvokeCustomObserver() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteSubjectStatus,ConcreteSubjectStatus", client.invokeCustomObserver());
	}
}
