package edu.ustc.sse.cdp.structure.decorator;

public class ConcreteDecoratorB extends Decorator {
	
	public ConcreteDecoratorB(Component component) {
		
		super(component);
	}
	
	@Override
	public String invoke() {
		
		return super.invoke() + ",ConcreteDecoratorB";
	}
}
