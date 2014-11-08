package edu.ustc.sse.cdp.behavior.memento;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
	
	@Test
	public void testRunStepOne() throws Exception {
		
		Client client = new Client();
				
		Assert.assertEquals("StateOne", client.runStepOne());
	}
	
	@Test
	public void testRunStepOneAndTwo() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("StateOne,StateTwo", client.runStepOneAndTwo());
	}
	
	@Test
	public void testRunStepOneAndTwoAndThree() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("StateOne,StateTwo,StateThree", client.runStepOneAndTwoAndThree());
	}
	
	@Test
	public void testRunStepOneAndTwoAndRestoreAndThree() throws Exception {
		
		Client client = new Client();
		
		Assert.assertEquals("StateOne,StateThree", client.runStepOneAndTwoAndRestoreAndThree());
	}
}
