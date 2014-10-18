package edu.ustc.sse.cdp.creation.factoryMethod;

import org.junit.Assert;
import org.junit.Test;

public class CreatorTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		ConcreteCreatorA a = new ConcreteCreatorA();
		Assert.assertEquals("ConcreteProductA", a.invoke());
		
		ConcreteCreatorB b = new ConcreteCreatorB();
		Assert.assertEquals("ConcreteProductB", b.invoke());
	}
}
