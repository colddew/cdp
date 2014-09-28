package edu.ustc.sse.cdp.behavior.templateMethod;

public class ConcreteClassB extends AbstractTemplete {
	
	@Override
	public String operationA() throws Exception {
		
		return "ConcreteClassBoperationA";
	}

	@Override
	public String operationB() throws Exception {
		
		return "ConcreteClassBoperationB";
	}
}
