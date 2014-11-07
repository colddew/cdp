package edu.ustc.sse.cdp.behavior.state;

import org.junit.Assert;
import org.junit.Test;

public class StateMachineTest {
	
	@Test
	public void testTransfer() throws Exception {
		
		StateMachine machine = new StateMachine();
		
		Data data = new Data();
		data.setState("A");
		machine.setData(data);
		
		State state = new ConcreteStateA();
		machine.setState(state);
		
		Assert.assertEquals("ConcreteStateA", machine.transfer());
		Assert.assertEquals("ConcreteStateB", machine.transfer());
		Assert.assertEquals("ConcreteStateA", machine.transfer());
		Assert.assertEquals("ConcreteStateB", machine.transfer());
	}
}
