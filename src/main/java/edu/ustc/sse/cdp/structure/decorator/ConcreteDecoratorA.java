package edu.ustc.sse.cdp.structure.decorator;

public class ConcreteDecoratorA extends Decorator {
	
	public ConcreteDecoratorA(Component component) {
		
		super(component);
	}
	
	@Override
	public String invoke() {
		
		return "ConcreteDecoratorA," + super.invoke();
	}
}
