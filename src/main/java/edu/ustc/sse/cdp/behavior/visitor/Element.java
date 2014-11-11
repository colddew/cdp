package edu.ustc.sse.cdp.behavior.visitor;

/**
 * 元素对象（被访问者）通过回调访问者的方法来添加新功能
 */
public interface Element {
	
	public Object accept(Visitor visitor);
}
