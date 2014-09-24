package edu.ustc.sse.cdp.other.simpleFactory;

public class Client {
	
	public String invoke(String type) throws Exception {
		
		Interface instance = SimpleFactory.getInstance(type);
		
		return instance.invoke();
	}
}
