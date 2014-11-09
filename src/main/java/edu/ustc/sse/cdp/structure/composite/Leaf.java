package edu.ustc.sse.cdp.structure.composite;

/**
 * 叶子对象
 */
public class Leaf extends Component {
	
	private String name;
	
	public Leaf(String name) {
		
		super(name);
		
		this.name = name;
	}
	
	@Override
	public String invoke() {
		
		return name;
	}
}
