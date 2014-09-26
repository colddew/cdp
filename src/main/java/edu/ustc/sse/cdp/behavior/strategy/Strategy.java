package edu.ustc.sse.cdp.behavior.strategy;

/**
 * 策略模式用于封装可以相互替换的算法，提高系统的可维护和可扩展性
 */
public interface Strategy {
	
	public String invoke(Context context);
}
