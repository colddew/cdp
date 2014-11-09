package edu.ustc.sse.cdp.structure.flyweight;

/**
 * 享元模式用于重用大量重复的细粒度对象，减少对象数量，节省内存空间
 */
public interface Flyweight {
	
	public String invoke();
}
