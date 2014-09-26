package edu.ustc.sse.cdp.behavior.strategy;

public class ConcreteStrategyB implements Strategy {

	@Override
	public String invoke(Context context) {
		
		return "ConcreteStrategyB" + "," + context.getParamater();
	}
}
