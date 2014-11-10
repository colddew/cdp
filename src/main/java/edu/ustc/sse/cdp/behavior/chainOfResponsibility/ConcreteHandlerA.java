package edu.ustc.sse.cdp.behavior.chainOfResponsibility;

public class ConcreteHandlerA extends Handler {

	@Override
	public String handle(String condition) {
		
		if("A".equals(condition)) {
			
			return "ConcreteHandlerA";
		} else {
			
			if(null != this.successor) {
				
				return this.successor.handle(condition);
			}
		}
		
		return null;
	}
}
