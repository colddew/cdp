package edu.ustc.sse.cdp.creation.factoryMethod;

public class Client {
	
	public String invokeFactoryMethod() {
		
		ConcreteCreatorA a = new ConcreteCreatorA();
		
		ConcreteCreatorB b = new ConcreteCreatorB();
		
		return a.invoke() + "," + b.invoke();
	}
	
	public String invokeParameterizedFactoryMethod() throws Exception {
		
		ParameterizedCreator pc = new ParameterizedCreator();
		
		ExtCreator ec = new ExtCreator();
		
		return pc.invoke("A") + "," + pc.invoke("B") + "," + ec.invoke("C");
	} 
}
