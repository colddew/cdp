package edu.ustc.sse.cdp.structure.decorator;

/**
 * 装饰器模式使用组合的方式为对象动态的添加职责
 */
public abstract class Decorator implements Component {
	
	private Component component;
	
	public Decorator(Component component) {
		
		this.component = component;
	}
	
	@Override
	public String invoke() {
		
		return component.invoke();
	}
}
