package edu.ustc.sse.cdp.structure.bridge;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		
		super(implementor);
	}

	@Override
	public String invoke() {
		
		return super.invoke() + ",RefinedAbstraction";
	}
}
