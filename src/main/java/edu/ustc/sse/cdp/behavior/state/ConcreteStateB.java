package edu.ustc.sse.cdp.behavior.state;

public class ConcreteStateB implements State {
	
	@Override
	public String transfer(StateMachine machine) {
		
		if("B".equals(machine.getData().getState())) {
			
			machine.getData().setState("A");
			machine.setState(new ConcreteStateA());
		}
		
		return "ConcreteStateB";
	}
}
