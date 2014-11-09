package edu.ustc.sse.cdp.structure.flyweight;

public class Client {
	
	public int hashcode(String key) {
		
		FlyweightFactory factory = FlyweightFactory.getInstance();
		Flyweight flyweight = factory.getFlyweight(key);
		
		return flyweight.hashCode();
	}
}
