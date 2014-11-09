package edu.ustc.sse.cdp.behavior.interpreter;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInterpret() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("TerminalExpressionA,TerminalExpressionB", client.interpret());
		Assert.assertEquals("TerminalExpressionA,TerminalExpressionB", client.interpret());
	}
}
