package edu.ustc.sse.cdp.behavior.command;

public class Client {
	
	public String invokeCommonCommand() {
		
		Executable executor = new Executor();
		
		Command command = new ConcreteCommand(executor);
		
		return command.execute();
	}
}
