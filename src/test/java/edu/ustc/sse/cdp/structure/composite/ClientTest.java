package edu.ustc.sse.cdp.structure.composite;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("Root,CompositeA,LeafA,LeafB,CompositeB,LeafC,LeafD", client.invoke());
	}
}
