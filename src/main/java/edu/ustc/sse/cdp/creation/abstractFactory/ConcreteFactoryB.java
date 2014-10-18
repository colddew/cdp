package edu.ustc.sse.cdp.creation.abstractFactory;

public class ConcreteFactoryB implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		
		return new ProductAB();
	}

	@Override
	public AbstractProductB createProductB() {
		
		return new ProductBB();
	}
}
