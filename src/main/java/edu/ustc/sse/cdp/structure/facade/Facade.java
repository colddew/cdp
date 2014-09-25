package edu.ustc.sse.cdp.structure.facade;

/**
 * 封装子系统的实现细节，简化客户端调用
 * 
 * 外观（门面）模式也可以设计为接口只暴露部分功能，防止内部接口污染
 */
public class Facade {
	
	public String invoke() {
		
		ModuleA a = new ConcreteModuleA();
		ModuleB b = new ConcreteModuleB();
		
		return a.invoke() + "," + b.invoke();
	}
}
