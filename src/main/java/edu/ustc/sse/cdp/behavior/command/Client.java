package edu.ustc.sse.cdp.behavior.command;

public class Client {
	
	public String invokeConcreteCommand() {
		
		Executable executor = new Executor("ConcreteCommand");
		Command command = new ConcreteCommand(executor);
		
		return command.execute();
	}
	
	public String invokeCommandQueue() {
		
		Executable executorA = new Executor("ConcreteCommandA");
		Command commandA = new ConcreteCommand(executorA);
		CommandQueue.offer(commandA);
		
		Executable executorB = new Executor("ConcreteCommandB");
		Command commandB = new ConcreteCommand(executorB);
		CommandQueue.offer(commandB);
		
		Executable executorC = new Executor("ConcreteCommandC");
		Command commandC = new ConcreteCommand(executorC);
		CommandQueue.offer(commandC);
		
		StringBuffer result = new StringBuffer();
		
		Command command = CommandQueue.poll();
		while(null != command) {
			
			result.append(command.execute()).append(",");
			
			command = CommandQueue.poll();
		}
		
		return removeLastComma(result.toString());
	}
	
	private String removeLastComma(String result) {
		
		if(null != result && result.endsWith(",")) {
			
			return result.substring(0, result.length() - 1);
		}
		
		return result;
	}
}
