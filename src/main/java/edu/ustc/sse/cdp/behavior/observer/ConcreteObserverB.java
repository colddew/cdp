package edu.ustc.sse.cdp.behavior.observer;

import java.util.Observable;

/**
 * JDK观察者模式
 */
public class ConcreteObserverB implements java.util.Observer {
	
	private String observerStatus;
	
	public String getObserverStatus() {
		
		return observerStatus;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		// 推模型
		// this.observerStatus = (String) arg;
		
		// 拉模型
		this.observerStatus = ((ConcreteSubjectB) o).getSubjectStatus();
	}
}
