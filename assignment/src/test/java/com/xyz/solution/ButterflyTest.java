package com.xyz.solution;

import org.junit.Test;

import com.xyz.solution.Butterfly;

import junit.framework.TestCase;

public class ButterflyTest extends TestCase{
	
	Butterfly butterfly = new Butterfly();
	
	@Test
	public void testFly() {
		assertEquals(butterfly.getFly("Butterfly").fly(), "I am flying..Butterfly");
	}

}
