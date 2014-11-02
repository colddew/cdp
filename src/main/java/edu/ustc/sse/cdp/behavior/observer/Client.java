package edu.ustc.sse.cdp.behavior.observer;

public class Client {
	
	public String invokeCustomObserver() {
		
		ConcreteSubjectA subject = new ConcreteSubjectA();
		
		Observer observerA = new ConcreteObserverA();
		Observer observerB = new ConcreteObserverA();
		
		subject.register(observerA);
		subject.register(observerB);
		
		subject.setSubjectStatus("CustomObserverStatus");
		
		return ((ConcreteObserverA) observerA).getObserverStatus() + "," 
			+ ((ConcreteObserverA) observerB).getObserverStatus();
	}
	
	public String invokeJDKObserver() {
		
		ConcreteSubjectB subject = new ConcreteSubjectB();
		
		java.util.Observer observerA = new ConcreteObserverB();
		java.util.Observer observerB = new ConcreteObserverB();
		
		subject.addObserver(observerA);
		subject.addObserver(observerB);
		
		subject.setSubjectStatus("JDKObserverStatus");
		
		return ((ConcreteObserverB) observerA).getObserverStatus() + "," 
		+ ((ConcreteObserverB) observerB).getObserverStatus();
	}
}
