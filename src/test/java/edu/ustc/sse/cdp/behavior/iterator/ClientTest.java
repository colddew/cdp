package edu.ustc.sse.cdp.behavior.iterator;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testIterate() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ElementA,ElementB,ElementC", client.iterate());
	}
}
