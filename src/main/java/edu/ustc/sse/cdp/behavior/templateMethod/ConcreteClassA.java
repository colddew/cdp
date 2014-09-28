package edu.ustc.sse.cdp.behavior.templateMethod;

public class ConcreteClassA extends AbstractTemplete {
	
	@Override
	public String operationA() throws Exception {
		
		return "ConcreteClassAoperationA";
	}

	@Override
	public String operationB() throws Exception {
		
		return "ConcreteClassAoperationB";
	}
}
