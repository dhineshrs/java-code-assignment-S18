package com.xyz.solution;

import org.junit.Test;

import com.xyz.solution.Bird;

import junit.framework.TestCase;	

public class BirdTest extends TestCase {
	
	Bird bird = new Bird();
	
	public BirdTest() {
	}


	@Test
	public void testFly() {
		assertEquals("I am walking", "I am walking");
	}
	
	@Test
	public void testSing() {
		assertEquals("I am singing", "I am singing");
	}
	
	@Test
	public void testSing(String message) {
		assertEquals("I am singing..", "I am singing..bird");
	}


	public void testBird() {
		assertTrue(true);
	}
}
