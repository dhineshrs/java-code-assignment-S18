package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class ClownFishTest extends TestCase{
	
	ClownFish clownFish = new ClownFish();

	@Test
	public void testSwim(){
		assertEquals(clownFish.getSwim().swim(), "I am swimming..ClownFish");
	}
	
	@Test
	public void testSize(){
		assertEquals("I am ClownFish. Size is small", "I am ClownFish. Size is small");
		
	}
	
	@Test
	public void testColor(){
		assertEquals("I am ClownFish. My Color is Orange", "I am ClownFish. My Color is Orange");
		
	}
	
	@Test
	public void testJoke(){
		assertEquals("I am ClownFish. I can joke", "I am ClownFish. I can joke");
		
	}
}
