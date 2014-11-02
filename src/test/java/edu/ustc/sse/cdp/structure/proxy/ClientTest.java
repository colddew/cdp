package edu.ustc.sse.cdp.structure.proxy;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvokeCustomProxy() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("RealSubject,Proxy", client.invokeCustomProxy());
	}
	
	@Test
	public void testInvokeDynamicProxy() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("RealSubject,DynamicProxy", client.invokeDynamicProxy());
	}
}
