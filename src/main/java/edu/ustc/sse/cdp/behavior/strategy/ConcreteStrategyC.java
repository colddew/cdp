package edu.ustc.sse.cdp.behavior.strategy;

public class ConcreteStrategyC implements Strategy {

	private String extendParameter;
	
	public ConcreteStrategyC(String extendParameter) {
		
		this.extendParameter = extendParameter;
	}
	
	@Override
	public String invoke(Context context) {
		
		return "ConcreteStrategyC" + "," + this.extendParameter;
	}
}
