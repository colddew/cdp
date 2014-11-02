package edu.ustc.sse.cdp.structure.proxy;

public class Client {

	public String invokeCustomProxy() {
		
		Subject subject = new RealSubject();
		Subject proxy = new Proxy(subject);
		
		return proxy.invoke();
	}
	
	public String invokeDynamicProxy() {
		
		Subject subject = new RealSubject();
		Subject proxy = (Subject) new DynamicProxy().getProxy(subject);
		
		return proxy.invoke();
	}
}
