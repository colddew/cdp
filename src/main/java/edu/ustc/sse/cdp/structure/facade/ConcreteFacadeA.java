package edu.ustc.sse.cdp.structure.facade;

public class ConcreteFacadeA {
	
	public String invoke() {
		
		ModuleA a = new ConcreteModuleA();
		ModuleB b = new ConcreteModuleB();
		
		return a.a1() + b.b2();
	}
}
