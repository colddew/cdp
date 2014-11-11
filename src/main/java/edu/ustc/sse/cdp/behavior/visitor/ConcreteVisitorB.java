package edu.ustc.sse.cdp.behavior.visitor;

public class ConcreteVisitorB implements Visitor {
	
	@Override
	public String visitConcreteElementA(ConcreteElementA element) {
		
		return "ConcreteVisitorB," + element.invoke();
	}
	
	@Override
	public String visitConcreteElementB(ConcreteElementB element) {
		
		return "ConcreteVisitorB," + element.invoke();
	}
}
