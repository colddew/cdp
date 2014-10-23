package edu.ustc.sse.cdp.creation.builder;

/**
 * 指导产品的构建过程
 */
public class Director {
	
	private Builder builder;
	
	public Director(Builder builder) {
		
		this.builder = builder;
	}
	
	public void build() {
		
		builder.buildHeader();
		
		builder.buildBody();
		
		builder.buildFooter();
	}
}
