package edu.ustc.sse.cdp.creation.factoryMethod;

public class ConcreteCreatorB extends Creator {

	@Override
	protected Product factoryMethod() {
		
		return new ConcreteProductB();
	}

}
