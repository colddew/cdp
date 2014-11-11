package edu.ustc.sse.cdp.behavior.visitor;

/**
 * 访问者模式可以在不改变原有类结构的前提下动态地添加新功能，适用于元素对象的结构比较稳定和需要预留扩展接口的场景
 * 
 * 每个具体的访问者实现一类相同的功能，真正执行什么功能由访问者和元素对象共同决定
 */
public interface Visitor {
	
	public String visitConcreteElementA(ConcreteElementA element);
	
	public String visitConcreteElementB(ConcreteElementB element);
}
