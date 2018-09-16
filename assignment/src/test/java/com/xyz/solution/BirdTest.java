package com.xyz.solution;

import org.junit.Test;

import com.xyz.solution.Bird;

import junit.framework.TestCase;

public class BirdTest extends TestCase {

	Bird bird = new Bird();

	public BirdTest() {
	}

	@Test
	public void testGetFly() {
		assertEquals(bird.getFly().fly(), "I am flying..Bird");
	}

	@Test
	public void testSing() {
		assertEquals(bird.getSing().sing(), "I am singing..Bird");
	}

	@Test
	public void testSing(String message) {
		assertEquals(bird.getSing("bird"), "I am singing..bird");
	}

	public void testBird() {
		assertTrue(true);
	}
}
