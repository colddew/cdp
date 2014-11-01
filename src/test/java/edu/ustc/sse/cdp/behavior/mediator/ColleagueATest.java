package edu.ustc.sse.cdp.behavior.mediator;

import org.junit.Assert;
import org.junit.Test;

public class ColleagueATest {
	
	@Test
	public void testInvokeColleagueB() throws Exception {
		
		ColleagueA a = new ColleagueA();
		
		Assert.assertEquals("ColleagueA,ColleagueB", a.invokeColleagueB());
	}
}
