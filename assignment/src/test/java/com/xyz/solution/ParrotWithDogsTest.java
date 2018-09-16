package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class ParrotWithDogsTest extends TestCase {

	ParrotController parrotWithDogsController = new ParrotController(new ParrotWithDogs());

	@Test
	public void testSing() {
		assertEquals(parrotWithDogsController.sing("Woof, woof"), "ParrotWithDogs  Woof, woof");

	}
}
