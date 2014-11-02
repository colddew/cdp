package edu.ustc.sse.cdp.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void register(Observer observer) {
		
		observers.add(observer);
	}
	
	public void unregister(Observer observer) {
		
		observers.remove(observer);
	}
	
	// 通知的观察者可以根据条件进行控制
	public void notifyObservers() {
		
		for(Observer observer : observers) {
			
			observer.update(this);
		}
	}
}
