package edu.ustc.sse.cdp.creation.singleton;

/**
 * 单例模式控制在运行期只有一个类的实例，并且提供唯一的全局访问点
 * 
 * 通常指的单例模式是在一个虚拟机的范围
 * 
 * 利用静态内部类实现延迟加载，由虚拟机保证线程安全
 */
public class LazyInitializationSingleton {
	
	private static class SingletonHolder {
		
		private static final LazyInitializationSingleton instance = new LazyInitializationSingleton();
	}
	
	private LazyInitializationSingleton() {
		
	}
	
	public static LazyInitializationSingleton getInstance() {
		
		return SingletonHolder.instance;
	}
	
	public String invoke() throws Exception {
		
		return "lazy";
	}
}
