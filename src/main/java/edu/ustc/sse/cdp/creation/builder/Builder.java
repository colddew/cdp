package edu.ustc.sse.cdp.creation.builder;

/**
 * 建造者（生成器）模式的构建算法，和实际构建产品的过程分离
 */
public interface Builder {
	
	public void buildHeader();
	
	public void buildBody();
	
	public void buildFooter();
}
