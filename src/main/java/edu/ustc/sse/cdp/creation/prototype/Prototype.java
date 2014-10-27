package edu.ustc.sse.cdp.creation.prototype;

/**
 * 原型模式通常使用克隆的方式来生成对象，利用接口来隐藏原型对象的类型，具体需要克隆的对象类型可以在运行时动态选择
 * 
 * 深度克隆需要注意克隆引用类型的对象
 */
public interface Prototype {
	
	public Prototype clone();
	
	public String getParameter();
	
	public void setParameter(String parameter);
	
	public PrototypeParameter getPrototypeParameter();
	
	public void setPrototypeParameter(PrototypeParameter prototypeParameter);
}
