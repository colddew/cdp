package edu.ustc.sse.cdp.behavior.mediator;

import org.junit.Assert;
import org.junit.Test;

public class ColleagueBTest {
	
	@Test
	public void testInvokeColleagueA() throws Exception {
		
		ColleagueB b = new ColleagueB();
		
		Assert.assertEquals("ColleagueB,ColleagueA", b.invokeColleagueA());
	}
}
