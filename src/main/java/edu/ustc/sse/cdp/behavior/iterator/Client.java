package edu.ustc.sse.cdp.behavior.iterator;

import java.util.Iterator;

public class Client {
	
	public String iterate() {
		
		String[] elements = {"ElementA", "ElementB", "ElementC"};
		Array array = new Array(elements);
		
		StringBuffer result = new StringBuffer();
		
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()) {
			
			result.append(iterator.next()).append(",");
		}
		
		return removeLastComma(result.toString());
	}
	
	private String removeLastComma(String result) {
		
		if(null != result && result.endsWith(",")) {
			
			return result.substring(0, result.length() - 1);
		}
		
		return result;
	}
}
