package edu.ustc.sse.cdp.creation.builder;

import org.junit.Assert;
import org.junit.Test;

public class DirectorTest {
	
	@Test
	public void testBuild() throws Exception {
		
		ConcreteBuilderA a = new ConcreteBuilderA();
		new Director(a).build();
		Assert.assertEquals("HeaderA,BodyA,FooterA", a.getProduct());
		
		ConcreteBuilderB b = new ConcreteBuilderB();
		new Director(b).build();
		Assert.assertEquals("HeaderB,BodyB,FooterB", b.getProduct());
	}
}
