package edu.ustc.sse.cdp.behavior.chainOfResponsibility;

/**
 * 责任链（职责链）模式将请求的发送者和接收者解耦，可以动态的组合请求的处理对象
 */
public abstract class Handler {
	
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		
		this.successor = successor;
	}
	
	public abstract String handle(String condition);
}
