package com.xyz.solution;

import org.junit.Test;

import com.xyz.solution.Duck;

import junit.framework.TestCase;

public class DuckTest extends TestCase {

	Duck duck = new Duck();

	@Test
	public void testSing() {

		assertEquals(duck.getSing("Quack, quack").sing(), "I am singing..Quack, quack");

	}

	@Test
	public void testSwim() {
		assertEquals(duck.getSwim().swim(), "I am swimming..Duck");

	}

}
