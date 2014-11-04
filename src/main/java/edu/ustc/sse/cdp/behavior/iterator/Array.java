package edu.ustc.sse.cdp.behavior.iterator;

import java.util.Iterator;

public class Array implements Iterable<String> {
	
	private String[] array;
	
	public Array(String[] array) {
		
		this.array = array;
	}
	
	public String get(int index) {
		
		if(index >= 0 && index < array.length) {
			
			return array[index];
		}
		
		return null;
	}
	
	public int size() {
		
		return array.length;
	}
	
	@Override
	public Iterator<String> iterator() {
		
		return new ArrayIterator(this);
	}
}
