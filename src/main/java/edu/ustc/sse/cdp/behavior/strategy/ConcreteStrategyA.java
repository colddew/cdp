package edu.ustc.sse.cdp.behavior.strategy;

public class ConcreteStrategyA implements Strategy {

	@Override
	public String invoke(Context context) {
		
		return "ConcreteStrategyA" + "," + context.getParamater();
	}
}
