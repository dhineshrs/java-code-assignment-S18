package com.xyz.solution;

import org.junit.Test;

import com.xyz.solution.Animal;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AnimalTest extends TestCase {
	Animal animal = new Animal();

	public AnimalTest() {
	}

	@Test
	public void testWalk() {

		assertEquals("I am walking", "I am walking");

	}

}
