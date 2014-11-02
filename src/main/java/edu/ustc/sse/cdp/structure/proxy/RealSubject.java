package edu.ustc.sse.cdp.structure.proxy;

public class RealSubject implements Subject {

	@Override
	public String invoke() {
		
		return "RealSubject";
	}
}
