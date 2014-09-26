package edu.ustc.sse.cdp.behavior.strategy;

import org.junit.Assert;
import org.junit.Test;

public class ContextTest {
	
	@Test
	public void testInvoke() throws Exception {
		
		Strategy strategyA = new ConcreteStrategyA();
		Context contextA = new Context("baseParameter", strategyA);
		Assert.assertEquals("ConcreteStrategyA,baseParameter", contextA.invoke());
		
		Strategy strategyB = new ConcreteStrategyB();
		Context contextB = new Context("baseParameter", strategyB);
		Assert.assertEquals("ConcreteStrategyB,baseParameter", contextB.invoke());
		
		Strategy strategyC = new ConcreteStrategyC("extendParameter");
		Context contextC = new Context("baseParameter", strategyC);
		Assert.assertEquals("ConcreteStrategyC,extendParameter", contextC.invoke());
	}
}
