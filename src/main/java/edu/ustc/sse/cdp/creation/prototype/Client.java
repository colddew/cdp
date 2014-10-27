package edu.ustc.sse.cdp.creation.prototype;

public class Client {
	
	public String invoke() {
		
		StringBuffer sb = new StringBuffer();
		
		Prototype prototype = new ConcretePrototypeA();
		prototype.setParameter("ConcretePrototypeAParameterA");
		
		PrototypeParameter prototypeParameterA = new PrototypeParameter();
		prototypeParameterA.setParameter("PrototypeParameterA");
		prototype.setPrototypeParameter(prototypeParameterA);
		
		sb.append(prototype.clone().toString()).append(",");
		
		prototype = new ConcretePrototypeB();
		prototype.setParameter("ConcretePrototypeAParameterB");
		
		PrototypeParameter prototypeParameterB = new PrototypeParameter();
		prototypeParameterB.setParameter("PrototypeParameterB");
		prototype.setPrototypeParameter(prototypeParameterB);
		
		sb.append(prototype.clone().toString());
		
		return sb.toString();
	}
}
