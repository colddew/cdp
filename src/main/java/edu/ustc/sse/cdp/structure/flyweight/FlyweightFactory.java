package edu.ustc.sse.cdp.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂创建和管理享元对象
 */
public class FlyweightFactory {
	
	private static FlyweightFactory factory = new FlyweightFactory();
	
	private static Map<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();
	
	private FlyweightFactory() {
		
	}
	
	public static FlyweightFactory getInstance() {
		
		return factory;
	}
	
	public synchronized Flyweight getFlyweight(String key) {
		
		Flyweight flyweight = flyweightMap.get(key);
		if(null == flyweight) {
			
			flyweight = new SharedFlyweight();
			
			flyweightMap.put(key, flyweight);
		}
		
		return flyweight;
	}
}
