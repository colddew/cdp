package edu.ustc.sse.cdp.creation.abstractFactory;

public class Client {
	
	public String invoke() {
		
		StringBuffer sb = new StringBuffer();
		
		AbstractFactory factory = new ConcreteFactoryA();
		AbstractProductA a = factory.createProductA();
		AbstractProductB b = factory.createProductB();
		sb.append(a.invoke()).append(",").append(b.invoke()).append(",");
		
		factory = new ConcreteFactoryB();
		a = factory.createProductA();
		b = factory.createProductB();
		sb.append(a.invoke()).append(",").append(b.invoke());
		
		return sb.toString();
	}
}
