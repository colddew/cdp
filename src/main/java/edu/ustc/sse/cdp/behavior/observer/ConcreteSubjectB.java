package edu.ustc.sse.cdp.behavior.observer;

import java.util.Observable;

public class ConcreteSubjectB extends Observable {
	
	private String subjectStatus;
	
	public String getSubjectStatus() {
		
		return subjectStatus;
	}
	
	public void setSubjectStatus(String subjectStatus) {
		
		this.subjectStatus = subjectStatus;
		
		this.setChanged();
		
		// 推模型
		// this.notifyObservers(subjectStatus);
		
		// 拉模型
		this.notifyObservers();
	}
}
