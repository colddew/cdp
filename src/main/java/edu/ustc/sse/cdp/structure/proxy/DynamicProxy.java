package edu.ustc.sse.cdp.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理利用反射机制和动态生成class的技术
 */
public class DynamicProxy implements InvocationHandler {
	
	private Object target;
	
	public Object getProxy(Object target) {
		
		this.target = target;
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		return method.invoke(target, args) + ",DynamicProxy";
	}
}
