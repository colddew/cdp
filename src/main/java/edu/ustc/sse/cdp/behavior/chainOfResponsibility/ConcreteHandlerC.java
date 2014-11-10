package edu.ustc.sse.cdp.behavior.chainOfResponsibility;

public class ConcreteHandlerC extends Handler {

	@Override
	public String handle(String condition) {
		
		if("C".equals(condition)) {
			
			return "ConcreteHandlerC";
		} else {
			
			if(null != this.successor) {
				
				return this.successor.handle(condition);
			}
		}
		
		return null;
	}
}
