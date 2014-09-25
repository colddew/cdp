package edu.ustc.sse.cdp.structure.facade;

import org.junit.Assert;
import org.junit.Test;

public class FacadeTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Facade facade = new Facade();
		
		Assert.assertEquals("ConcreteModuleA,ConcreteModuleB", facade.invoke());
	}
}
