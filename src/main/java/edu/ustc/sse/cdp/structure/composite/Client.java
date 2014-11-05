package edu.ustc.sse.cdp.structure.composite;

public class Client {
	
	public String invoke() {
		
		Component root = new Composite("Root");
		
		Component compositeA = new Composite("CompositeA");
		Component compositeB = new Composite("CompositeB");
		
		Component leafA = new Leaf("LeafA");
		Component leafB = new Leaf("LeafB");
		Component leafC = new Leaf("LeafC");
		Component leafD = new Leaf("LeafD");
		
		root.add(compositeA);
		root.add(compositeB);
		
		compositeA.add(leafA);
		compositeA.add(leafB);
		compositeB.add(leafC);
		compositeB.add(leafD);
		
		return root.invoke();
	}
}
