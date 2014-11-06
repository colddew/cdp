package edu.ustc.sse.cdp.behavior.state;

/**
 * 状态模式用于对象内部状态改变时改变其行为
 */
public interface State {
	
	public String invoke();
}
