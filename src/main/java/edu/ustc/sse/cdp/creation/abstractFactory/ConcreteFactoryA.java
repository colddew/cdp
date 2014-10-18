package edu.ustc.sse.cdp.creation.abstractFactory;

public class ConcreteFactoryA implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		
		return new ProductAA();
	}

	@Override
	public AbstractProductB createProductB() {
		
		return new ProductBA();
	}
}
