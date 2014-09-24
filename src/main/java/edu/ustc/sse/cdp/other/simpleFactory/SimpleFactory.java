package edu.ustc.sse.cdp.other.simpleFactory;

public class SimpleFactory {
	
	/**
	 * 根据传参类型选择相应的实现类，还可以使用配置项或者从缓存取值代替传参实现更彻底的解耦
	 */
	public static Interface getInstance(String type) throws Exception {
		
		if("A".equals(type)) {
			
			return new ImplementA();
		} else if("B".equals(type)) {
			
			return new ImplementB();
		}
		
		throw new Exception("do not support this type");
	}
}
