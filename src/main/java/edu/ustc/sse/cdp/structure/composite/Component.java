package edu.ustc.sse.cdp.structure.composite;

/**
 * 组合模式使用树型结构表示整体和部分的层次结构，使得可以使用一致的方式来处理单个对象和组合对象
 */
public abstract class Component {
	
	private String name;
	
	public Component(String name) {
		
		this.name = name;
	}
	
	public void add(Component child) {
		
		throw new UnsupportedOperationException("do not support add operation");
	}
	
	public void remove(Component child) {
		
		throw new UnsupportedOperationException("do not support remove operation");
	}
	
	public Component get(int index) {
		
		throw new UnsupportedOperationException("do not support remove operation");
	}
	
	public abstract String invoke();
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Component) {
			
			return false;
		}
		
		Component component = (Component) obj;
		if(null != name && name.equals(component.name)) {
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		int hashcode = 17;
		
		return hashcode + name.hashCode();
	}
}
