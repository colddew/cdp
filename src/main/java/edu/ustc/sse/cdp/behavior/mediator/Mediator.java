package edu.ustc.sse.cdp.behavior.mediator;

/**
 * 中介者（调停者）模式降低了对象之间的耦合，将多对多关系转变为一对多的关系
 */
public class Mediator {
	
	// 懒汉式单例模式
	public static Mediator mediator = new Mediator();
	
	private Mediator() {
		
	}
	
	public static Mediator getInstance() {
		
		return mediator;
	}
	
	public String invokeColleagueA() {
		
		ColleagueA a = new ColleagueA();
		
		return a.toString();
	}
	
	public String invokeColleagueB() {
		
		ColleagueB b = new ColleagueB();
		
		return b.toString();
	}
}
