package com.xyz.solution;

public class Fish extends Animal implements CanSwim {

	public Swim getSwim() {
		return new Swim("Fish");
	}

}
