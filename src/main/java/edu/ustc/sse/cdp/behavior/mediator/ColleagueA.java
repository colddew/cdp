package edu.ustc.sse.cdp.behavior.mediator;

public class ColleagueA {
	
	public String invokeColleagueB() {
		
		Mediator mediator = Mediator.getInstance();
		
		return toString() + "," + mediator.invokeColleagueB();
	}
	
	@Override
	public String toString() {
		
		return "ColleagueA";
	}
}
