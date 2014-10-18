package edu.ustc.sse.cdp.creation.abstractFactory;

/**
 * 抽象工厂模式用于创建多个产品系列，系列中新增产品比较困难
 * 
 * 如果产品系列只有一个产品，则退化为工厂方法模式
 */
public interface AbstractFactory {
	
	public AbstractProductA createProductA();
	
	public AbstractProductB createProductB();
}
