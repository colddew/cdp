package edu.ustc.sse.cdp.behavior.iterator;

import java.util.Iterator;

/**
 * 迭代器模式用于控制访问聚合对象的元素，而又不暴露该对象的内部表示
 */
public class ArrayIterator implements Iterator<String> {
	
	private int index = 0;
	
	private Array array;
	
	public ArrayIterator(Array array) {

		this.array = array;
	}
	
	@Override
	public boolean hasNext() {
		
		if(null != array && index < array.size()) {
			
			return true;
		}
		
		return false;
	}

	@Override
	public String next() {
		
		if(hasNext()) {
			
			String element = array.get(index);
			
			index++;
			
			return element;
		}
		
		return null;
	}

	@Override
	public void remove() {
		
	}
}
