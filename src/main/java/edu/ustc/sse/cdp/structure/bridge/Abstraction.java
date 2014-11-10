package edu.ustc.sse.cdp.structure.bridge;

/**
 * 桥接模式将抽象部分和实现部分分离，使它们可以独立变化，常用来解决具有两个变化维度的问题
 * 
 * 桥接是单向的，抽象部分使用实现部分
 */
public abstract class Abstraction {
	
	protected Implementor implementor;
	
	public Abstraction(Implementor implementor) {
		
		this.implementor = implementor;
	}
	
	public String invoke() {
		
		return implementor.invoke();
	}
}
