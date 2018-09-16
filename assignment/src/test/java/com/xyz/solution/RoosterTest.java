package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class RoosterTest extends TestCase{
	
	Rooster rooster = new Rooster();
	
	@Test
	public void testRooster() {
		assertEquals(rooster.sing("Cluck, cluck").sing(),"I am singing..Cluck, cluck");
	}

}
