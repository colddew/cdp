package edu.ustc.sse.cdp.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private String name;
	
	private List<Component> components;
	
	public Composite(String name) {
		
		super(name);
		
		this.name = name;
	}
	
	@Override
	public void add(Component child) {
		
		if(null == components) {
			
			components = new ArrayList<Component>();
		}
		
		components.add(child);
	}

	@Override
	public void remove(Component child) {
		
		if(null != components) {
			
			components.remove(child);
		}
	}

	@Override
	public Component get(int index) {
		
		if(null != components && index > 0 && index < components.size()) {
			
			return components.get(index);
		}
		
		return null;
	}
	
	@Override
	public String invoke() {
		
		StringBuffer sb = new StringBuffer(name);
		sb.append(",");
		
		if(components != null) {
			
			for(int i=0; i < components.size(); i++) {
				
				Component component = components.get(i);
				if(i < components.size() - 1) {
					
					sb.append(component.invoke()).append(",");
				} else {
					
					sb.append(component.invoke());
				}
			}
		}
		
		return sb.toString();
	}
}
