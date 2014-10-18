package edu.ustc.sse.cdp.creation.abstractFactory;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ProductAA,ProductBA,ProductAB,ProductBB", client.invoke());
	}
}
