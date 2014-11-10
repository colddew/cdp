package edu.ustc.sse.cdp.structure.bridge;

public class Client {
	
	public String invokeConcreteImplementorA() {
		
		Implementor implementor = new ConcreteImplementorA();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		
		return abstraction.invoke();
	}
	
	public String invokeConcreteImplementorB() {
		
		Implementor implementor = new ConcreteImplementorB();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		
		return abstraction.invoke();
	}
}
