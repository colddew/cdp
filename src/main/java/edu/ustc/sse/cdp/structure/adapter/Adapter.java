package edu.ustc.sse.cdp.structure.adapter;

/**
 * 适配器模式用于接口转换，使接口不兼容的类可以一起工作
 * 
 * 适配器和被适配对象是组合的关联关系，客户端调用功能时最终会委托给被适配对象去实现
 */
public class Adapter implements Interface {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		
		this.adaptee = adaptee;
	}
	
	@Override
	public String invoke() {
		
		return adaptee.invoke();
	}
}
