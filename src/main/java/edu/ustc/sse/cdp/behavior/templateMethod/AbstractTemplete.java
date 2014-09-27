package edu.ustc.sse.cdp.behavior.templateMethod;

/**
 * 定义算法骨架，将具体实现步骤延迟到子类
 */
public abstract class AbstractTemplete {
	
	public abstract String operation() throws Exception;
	
	public String hook() throws Exception {
		
		return "hook";
	}
	
	public String invoke() throws Exception {
		
		String operation = operation();
		String hook = hook();
		
		return operation + "," + hook;
	}
}
