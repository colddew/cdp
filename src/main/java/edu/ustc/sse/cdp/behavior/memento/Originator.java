package edu.ustc.sse.cdp.behavior.memento;

/**
 * 保存原生器状态的过程：原生器创建备忘录信息，备忘录外部存储存储备忘录信息
 * 
 * 恢复原生器状态的过程：备忘录外部存储获取备忘录信息，原生器恢复备忘录信息
 */
public class Originator {
	
	private String state;
	
	//-----------------------基本方法-----------------------
	
	public String runStepOne() {
		
		state = "StateOne";
		
		return state;
	}
	
	public String runStepTwo() {
		
		state += ",StateTwo";
		
		return state;
	}
	
	public String runStepThree() {
		
		state += ",StateThree";
		
		return state;
	}
	
	//-----------------------备忘录相关的内部类和方法-----------------------
	
	public Memento createMemento() {
		
		return new MementoImpl(state);
	}
	
	public void restoreMemento(Memento memento) {
		
		state = ((MementoImpl) memento).getState();
	}
	
	// 备忘录中存储着原生器的状态
	private static class MementoImpl implements Memento {
		
		private String state;
		
		public MementoImpl(String state) {
			
			this.state = state;
		}
		
		public String getState() {
			
			return state;
		}
	}
}
