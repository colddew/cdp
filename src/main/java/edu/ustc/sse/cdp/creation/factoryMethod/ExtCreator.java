package edu.ustc.sse.cdp.creation.factoryMethod;

public class ExtCreator extends ParameterizedCreator {

		@Override
		protected Product factoryMethod(String type) throws Exception {
			
			if("C".equals(type)) {
				
				return new ConcreteProductC();
			} else {
				
				return super.factoryMethod(type);
			}
		}
}
