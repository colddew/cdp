package edu.ustc.sse.cdp.structure.facade;

/**
 * 封装子系统的实现细节，简化客户端调用
 * 
 * 外观（门面）模式设计为接口只暴露部分功能，防止内部接口污染
 */
public interface Facade {
	
	public String a1();
	
	public String a2();
}
