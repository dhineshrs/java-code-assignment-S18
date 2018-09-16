package com.xyz.solution;

public class Shark extends Fish {

	@Override
	public Swim getSwim() {
		return new Swim("Shark");
	}

	public void size() {
		System.out.println("I am Shark. Size is Large");

	}

	public void color() {
		System.out.println("I am Shark. My Color is Grey");

	}

	public void eat() {
		System.out.println("I am Shark. I can eat fish");

	}

}
