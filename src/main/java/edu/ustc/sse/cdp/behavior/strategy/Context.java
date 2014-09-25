package edu.ustc.sse.cdp.behavior.strategy;

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public String invoke() {
		
		return strategy.invoke();
	}
}
