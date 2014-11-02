package edu.ustc.sse.cdp.behavior.observer;

public class Client {
	
	public String invokeCustomObserver() {
		
		ConcreteSubject subject = new ConcreteSubject();
		
		Observer observerA = new ConcreteObserver();
		Observer observerB = new ConcreteObserver();
		
		subject.register(observerA);
		subject.register(observerB);
		
		subject.setSubjectStatus("ConcreteSubjectStatus");
		
		return ((ConcreteObserver) observerA).getObserverStatus() + "," 
			+ ((ConcreteObserver) observerB).getObserverStatus();
	}
}
