package edu.ustc.sse.cdp.creation.factoryMethod;

/**
 * 工厂方法模式将对象的创建延迟到子类
 */
public abstract class Creator {
	
	protected abstract Product factoryMethod();
	
	public String invoke() {
		
		Product product = factoryMethod();
		
		return product.invoke();
	}
}
