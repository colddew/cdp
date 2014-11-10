package edu.ustc.sse.cdp.behavior.chainOfResponsibility;

public class ConcreteHandlerB extends Handler {

	@Override
	public String handle(String condition) {
		
		if("B".equals(condition)) {
			
			return "ConcreteHandlerB";
		} else {
			
			if(null != this.successor) {
				
				return this.successor.handle(condition);
			}
		}
		
		return null;
	}
}
