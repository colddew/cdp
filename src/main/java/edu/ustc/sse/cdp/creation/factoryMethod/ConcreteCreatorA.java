package edu.ustc.sse.cdp.creation.factoryMethod;

public class ConcreteCreatorA extends Creator {

	@Override
	protected Product factoryMethod() {
		
		return new ConcreteProductA();
	}

}
