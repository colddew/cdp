package edu.ustc.sse.cdp.behavior.observer;

public class ConcreteObserverA implements Observer {
	
	private String observerStatus;
	
	public String getObserverStatus() {
		
		return observerStatus;
	}
	
	@Override
	public void update(Subject subject) {
		
		this.observerStatus = ((ConcreteSubjectA) subject).getSubjectStatus();
	}
}
