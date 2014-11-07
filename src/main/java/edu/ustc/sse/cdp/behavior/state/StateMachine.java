package edu.ustc.sse.cdp.behavior.state;

public class StateMachine {
	
	private State state;
	private Data data;
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Data getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
	
	public String transfer() {
		
		return state.transfer(this);
	}
}
