package edu.ustc.sse.cdp.behavior.command;

/**
 * 命令模式将请求封装成对象，使得发起请求的对象和真正实现的对象解耦
 * 
 * 可以用于实现命令排队、撤销、重做、宏命令、记日志和恢复（事务）、回调等功能
 */
public interface Command {
	
	public String execute();
}
