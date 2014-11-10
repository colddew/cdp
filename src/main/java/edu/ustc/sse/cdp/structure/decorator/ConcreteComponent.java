package edu.ustc.sse.cdp.structure.decorator;

/**
 * 真正被装饰的对象
 */
public class ConcreteComponent implements Component {
	
	@Override
	public String invoke() {
		
		return "ConcreteComponent";
	}
}
