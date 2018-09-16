package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class ParrotWithRoostersTest extends TestCase {
	ParrotController parrotWithRoostersController = new ParrotController(new ParrotWithRoosters());

	@Test
	public void testSing() {
		assertEquals(parrotWithRoostersController.sing("Cock-a-doodle-doo"), "ParrotWithRoosters  Cock-a-doodle-doo");

	}
}
