package edu.ustc.sse.cdp.creation.prototype;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcretePrototypeAParameterA,PrototypeParameterA,ConcretePrototypeAParameterB,"
				+ "PrototypeParameterB", client.invoke());
	}
}
