package edu.ustc.sse.cdp.other.simpleFactory;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Client client = new Client();
		
		String a = client.invoke("A");
		Assert.assertEquals("ImplementA", a);
		
		String b = client.invoke("B");
		Assert.assertEquals("ImplementB", b);
	}
}
