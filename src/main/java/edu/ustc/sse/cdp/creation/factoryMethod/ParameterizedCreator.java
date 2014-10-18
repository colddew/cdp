package edu.ustc.sse.cdp.creation.factoryMethod;

/**
 * 参数化的工厂方法可以集中管理需要创建的产品，通过继承实现扩展
 * 
 * 如果只有公共的工厂方法，则退化为简单工厂模式
 */
public class ParameterizedCreator {
	
	protected Product factoryMethod(String type) throws Exception {
		
		if("A".equals(type)) { 
			
			return new ConcreteProductA();
		} else if("B".equals(type)) {
			
			return new ConcreteProductB();
		} else {
			throw new Exception("not support this type");
		}
	}
	
	public String invoke(String type) throws Exception {
		
		Product product = factoryMethod(type);
		
		return product.invoke();
	}
}
