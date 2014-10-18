package edu.ustc.sse.cdp.creation.factoryMethod;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testInvokeFactoryMethod() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteProductA,ConcreteProductB", client.invokeFactoryMethod());
	}
	
	@Test
	public void testInvokeParameterizedFactoryMethod() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("ConcreteProductA,ConcreteProductB,ConcreteProductC", client.invokeParameterizedFactoryMethod());
	}
}
