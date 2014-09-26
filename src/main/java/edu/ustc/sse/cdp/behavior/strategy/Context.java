package edu.ustc.sse.cdp.behavior.strategy;

/**
 * 上下文封装策略对象进行算法运算所需要的数据或公共方法
 * 
 * 通过继承该类和实现新的算法扩展功能，遵循开闭原则
 */
public class Context {
	
	private String paramater;
	private Strategy strategy;
	
	public Context(String paramater, Strategy strategy) {
		
		this.paramater = paramater;
		this.strategy = strategy;
	}
	
	public String getParamater() {
		
		return paramater;
	}
	
	public String invoke() {
		
		return strategy.invoke(this);
	}
}
