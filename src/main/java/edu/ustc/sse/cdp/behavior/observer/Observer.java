package edu.ustc.sse.cdp.behavior.observer;

/**
 * 观察者模式用于解决对象之间一对多的依赖关系
 * 
 * 当目标对象的状态变化时，所有依赖于它的观察者对象都会得到通知并自动更新状态
 */
public interface Observer {
	
	public void update(Subject subject);
}
