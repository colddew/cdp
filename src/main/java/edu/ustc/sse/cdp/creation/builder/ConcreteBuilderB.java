package edu.ustc.sse.cdp.creation.builder;

public class ConcreteBuilderB implements Builder {
	
	private static StringBuffer product = new StringBuffer();
	
	@Override
	public void buildHeader() {
		
		product.append("HeaderB");
	}
	
	@Override
	public void buildBody() {
		
		product.append(",").append("BodyB");
	}
	
	@Override
	public void buildFooter() {
		
		product.append(",").append("FooterB");
	}
	
	public String getProduct() {
		
		return product.toString();
	}
}
