package edu.ustc.sse.cdp.behavior.templateMethod;

import org.junit.Assert;
import org.junit.Test;

public class AbstractTempleteTest {

	@Test
	public void testInvoke() throws Exception {
		
		AbstractTemplete a = new ConcreteClassA();
		Assert.assertEquals("ConcreteClassAoperationA,hook,ConcreteClassAoperationB", a.invoke());
		
		AbstractTemplete b = new ConcreteClassB();
		Assert.assertEquals("ConcreteClassBoperationA,hook,ConcreteClassBoperationB", b.invoke());
	}
}
