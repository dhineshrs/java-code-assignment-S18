package com.xyz.solution;

import org.junit.Test;

import junit.framework.TestCase;

public class ChickenTest extends TestCase{
	
	Chicken chicken = new Chicken();
	
	@Test
	public void testSing(){
		assertEquals(chicken.getSing("Cluck, cluck").sing(),"I am singing..Cluck, cluck");
	}

}
