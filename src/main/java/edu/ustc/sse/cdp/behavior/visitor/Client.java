package edu.ustc.sse.cdp.behavior.visitor;

public class Client {
	
	public String handleConcreteVisitorA() {
		
		Visitor visitor = new ConcreteVisitorA();
		
		Element a = new ConcreteElementA();
		Element b = new ConcreteElementB();
		
		return a.accept(visitor) + "," + b.accept(visitor);
	}
	
	public String handleConcreteVisitorB() {
		
		Visitor visitor = new ConcreteVisitorB();
		
		Element b = new ConcreteElementB();
		Element a = new ConcreteElementA();
		
		return b.accept(visitor) + "," + a.accept(visitor);
	}
	
	public String handleObjectStructure() {
		
		Element a = new ConcreteElementA();
		Element b = new ConcreteElementB();
		
		ObjectStructure os = new ObjectStructure();
		os.addElement(a);
		os.addElement(b);
		
		return removeLastComma(os.handle(new ConcreteVisitorA()) + os.handle(new ConcreteVisitorB()));
	}
	
	private String removeLastComma(String result) {
		
		if(null != result && result.endsWith(",")) {
			
			return result.substring(0, result.length() - 1);
		}
		
		return result;
	}
}
