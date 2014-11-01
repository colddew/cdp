package edu.ustc.sse.cdp.behavior.mediator;

public class ColleagueB {
	
	public String invokeColleagueA() {
		
		Mediator mediator = Mediator.getInstance();
		
		return toString() + "," + mediator.invokeColleagueA();
	}
	
	@Override
	public String toString() {
		
		return "ColleagueB";
	}
}
