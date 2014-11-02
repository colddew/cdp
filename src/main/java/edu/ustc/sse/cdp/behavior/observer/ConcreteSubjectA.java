package edu.ustc.sse.cdp.behavior.observer;

public class ConcreteSubjectA extends Subject {
	
	private String subjectStatus;
	
	public String getSubjectStatus() {
		
		return subjectStatus;
	}
	
	public void setSubjectStatus(String subjectStatus) {
		
		this.subjectStatus = subjectStatus;
		
		this.notifyObservers();
	}
}
