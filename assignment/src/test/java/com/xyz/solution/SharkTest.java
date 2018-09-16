package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class SharkTest extends TestCase {

	Shark shark = new Shark();

	@Test
	public void testSwim() {
		assertEquals(shark.getSwim().swim(), "I am swimming..Shark");

	}

	@Test
	public void testSize() {
		assertEquals("I am Shark. Size is Large", "I am Shark. Size is Large");

	}

	@Test
	public void testColor() {
		assertEquals("I am Shark. My Color is Grey", "I am Shark. My Color is Grey");

	}

	@Test
	public void testEat() {
		assertEquals("I am Shark. I can eat fish", "I am Shark. I can eat fish");

	}
}
