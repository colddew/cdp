package edu.ustc.sse.cdp.behavior.visitor;

public class ConcreteVisitorA implements Visitor {
	
	@Override
	public String visitConcreteElementA(ConcreteElementA element) {
		
		return "ConcreteVisitorA," + element.invoke();
	}
	
	@Override
	public String visitConcreteElementB(ConcreteElementB element) {
		
		return "ConcreteVisitorA," + element.invoke();
	}
}
