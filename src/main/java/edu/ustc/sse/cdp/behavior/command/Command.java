package edu.ustc.sse.cdp.behavior.command;

/**
 * 命令模式将请求封装成对象，使得发起请求的对象和真正实现的对象解耦
 * 
 * 命令对象可以被用于排队、撤销、重做、记录日志、恢复等
 */
public interface Command {
	
	public String execute();
}
