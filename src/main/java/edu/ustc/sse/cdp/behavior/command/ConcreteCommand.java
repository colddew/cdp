package edu.ustc.sse.cdp.behavior.command;

public class ConcreteCommand implements Command {
	
	private Executable executor;
	
	public ConcreteCommand(Executable executor) {
		
		this.executor = executor;
	}
	
	@Override
	public String execute() {
		
		return executor.execute();
	}
}
