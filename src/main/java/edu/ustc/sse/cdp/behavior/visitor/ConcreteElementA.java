package edu.ustc.sse.cdp.behavior.visitor;

public class ConcreteElementA implements Element {
	
	@Override
	public Object accept(Visitor visitor) {
		
		return visitor.visitConcreteElementA(this);
	}
	
	public String invoke() {
		
		return "ConcreteElementA";
	}
}
