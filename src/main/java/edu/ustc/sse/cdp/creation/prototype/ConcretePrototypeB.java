package edu.ustc.sse.cdp.creation.prototype;

public class ConcretePrototypeB implements Prototype {
	
	private String parameter;
	private PrototypeParameter prototypeParameter;
	
	@Override
	public String getParameter() {
		
		return parameter;
	}

	@Override
	public void setParameter(String parameter) {
		
		this.parameter = parameter;
	}

	public PrototypeParameter getPrototypeParameter() {
		return prototypeParameter;
	}

	public void setPrototypeParameter(PrototypeParameter prototypeParameter) {
		this.prototypeParameter = prototypeParameter;
	}

	@Override
	public Prototype clone() {
	
		ConcretePrototypeB concretePrototypeB = new ConcretePrototypeB();
		concretePrototypeB.setParameter(parameter);
		concretePrototypeB.setPrototypeParameter(this.prototypeParameter.clone());
		
		return concretePrototypeB;
	}
	
	@Override
	public String toString() {
		
		return this.getParameter() + ","  + this.getPrototypeParameter().getParameter();
	}
}
