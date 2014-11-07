package edu.ustc.sse.cdp.behavior.state;

/**
 * 状态模式根据对象内部状态改变时改变其行为
 * 
 * 状态可以维护在上下文（状态机）中或者维护在具体的状态类里
 */
public interface State {
	
	public String transfer(StateMachine machine);
}
