package edu.ustc.sse.cdp.creation.builder;

public class ConcreteBuilderA implements Builder {
	
	private static StringBuffer product = new StringBuffer();
	
	@Override
	public void buildHeader() {
		
		product.append("HeaderA");
	}
	
	@Override
	public void buildBody() {
		
		product.append(",").append("BodyA");
	}
	
	@Override
	public void buildFooter() {
		
		product.append(",").append("FooterA");
	}
	
	public String getProduct() {
		
		return product.toString();
	}
}
