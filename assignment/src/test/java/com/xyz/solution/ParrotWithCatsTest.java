package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class ParrotWithCatsTest extends TestCase{
	
	ParrotController parrotWithCatsController = new ParrotController(new ParrotWithCats());

	@Test
	public void testSing(){
		assertEquals(parrotWithCatsController.sing("Meow"), "ParrotWithCats  Meow");
		
	}
}
