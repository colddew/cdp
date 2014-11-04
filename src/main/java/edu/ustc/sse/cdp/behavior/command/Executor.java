package edu.ustc.sse.cdp.behavior.command;

public class Executor implements Executable {
	
	private String command;
	
	public Executor(String command) {
		
		this.command = command;
	}
	
	@Override
	public String execute() {
		
		return command;
	}
}
