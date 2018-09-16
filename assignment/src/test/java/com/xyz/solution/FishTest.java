package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class FishTest extends TestCase{
	
	Fish fish = new Fish();

	@Test
	public void testSwim(){
		assertEquals(fish.getSwim().swim(), "I am swimming..Fish");
		
	}
}
