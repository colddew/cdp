package edu.ustc.sse.cdp.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	
	private List<Element> elements = new ArrayList<Element>();
	
	public void addElement(Element element) {
		
		elements.add(element);
	}
	
	public String handle(Visitor visitor) {
		
		StringBuffer sb = new StringBuffer();
		
		if(null != elements && elements.size() > 0) {
			
			for(Element element : elements) {
				
				sb.append(element.accept(visitor)).append(",");
			}
		}
		
		return sb.toString();
	}
}
