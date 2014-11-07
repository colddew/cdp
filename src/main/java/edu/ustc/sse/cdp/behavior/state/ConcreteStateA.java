package edu.ustc.sse.cdp.behavior.state;

public class ConcreteStateA implements State {
	
	@Override
	public String transfer(StateMachine machine) {
		
		if("A".equals(machine.getData().getState())) {
			
			machine.getData().setState("B");
			machine.setState(new ConcreteStateB());
		}
		
		return "ConcreteStateA";
	}
}
