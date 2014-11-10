package edu.ustc.sse.cdp.structure.decorator;

public class Client {
	
	public String invoke() {
		
		Component component = new ConcreteComponent();
		Component decorator = new ConcreteDecoratorB(new ConcreteDecoratorA(component));
		
		return decorator.invoke();
	}
}
