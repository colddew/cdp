package edu.ustc.sse.cdp.structure.proxy;

/**
 * 代理模式可以控制对象的访问，主要用于延迟加载、远程访问、权限控制、引用计数等
 */
public class Proxy implements Subject {
	
	private Subject subject;
	
	public Proxy(Subject subject) {
		
		this.subject = subject;
	}
	
	@Override
	public String invoke() {
		
		return subject.invoke() + ",Proxy";
	}
}
