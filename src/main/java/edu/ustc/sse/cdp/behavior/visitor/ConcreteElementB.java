package edu.ustc.sse.cdp.behavior.visitor;

public class ConcreteElementB implements Element {
	
	@Override
	public Object accept(Visitor visitor) {
		
		return visitor.visitConcreteElementB(this);
	}
	
	public String invoke() {
		
		return "ConcreteElementB";
	}
}
