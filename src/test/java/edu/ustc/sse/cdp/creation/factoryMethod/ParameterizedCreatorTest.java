package edu.ustc.sse.cdp.creation.factoryMethod;

import org.junit.Assert;
import org.junit.Test;

public class ParameterizedCreatorTest {

	@Test
	public void testInvoke() throws Exception {
		
		ParameterizedCreator pc = new ParameterizedCreator();
		Assert.assertEquals("ConcreteProductA", pc.invoke("A"));
		Assert.assertEquals("ConcreteProductB", pc.invoke("B"));
		
		ExtCreator ec = new ExtCreator();
		Assert.assertEquals("ConcreteProductC", ec.invoke("C"));
	}
}
