package edu.ustc.sse.cdp.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	private Map<TerminalExpression, String> map = new HashMap<TerminalExpression, String>();
	
	public void set(TerminalExpression key, String value) {
		
		map.put(key, value);
	}
	
	public String get(TerminalExpression key) {
		
		return map.get(key);
	}
}
