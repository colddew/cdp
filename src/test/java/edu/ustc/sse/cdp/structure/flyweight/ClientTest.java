package edu.ustc.sse.cdp.structure.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testHashcode() throws Exception {
		
		Client client = new Client();
		
		int a = client.hashcode("SharedFlyweightA");
		int b = client.hashcode("SharedFlyweightB");
		
		Assert.assertNotEquals(a, b);
		Assert.assertEquals(a, client.hashcode("SharedFlyweightA"));
	}
}
