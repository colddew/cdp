package edu.ustc.sse.cdp.creation.prototype;

public class PrototypeParameter {
	
	private String parameter;

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	
	public PrototypeParameter clone() {
		
		PrototypeParameter prototypeParameter = new PrototypeParameter();
		prototypeParameter.setParameter(this.parameter);
		
		return prototypeParameter;
	}
}
