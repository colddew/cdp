package edu.ustc.sse.cdp.creation.singleton;

/**
 * 单元素枚举实现单例模式的最佳方法
 */
public enum EnumSingleton {
	
	instance;
	
	public String invoke() throws Exception {
		
		return "enum";
	}
}
