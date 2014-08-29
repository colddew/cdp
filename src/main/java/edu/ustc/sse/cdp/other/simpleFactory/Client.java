package edu.ustc.sse.cdp.other.simpleFactory;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		Interface instance = SimpleFactory.getInstance("A");
		instance.test();
		
		instance = SimpleFactory.getInstance("B");
		instance.test();
	}
}
