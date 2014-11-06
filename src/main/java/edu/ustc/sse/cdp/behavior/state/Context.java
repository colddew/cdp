package edu.ustc.sse.cdp.behavior.state;

public class Context {
	
	public String invoke(String state) {
		
		if("a".equals(state)) {
			
			return new ConcreteStateA().invoke();
		} else if("b".equals(state)) {
			
			return new ConcreteStateB().invoke();
		}
		
		return null;
	}
}
