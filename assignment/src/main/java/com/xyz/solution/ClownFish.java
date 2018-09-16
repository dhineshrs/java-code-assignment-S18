package com.xyz.solution;

public class ClownFish extends Fish {

	@Override
	public Swim getSwim() {
		return new Swim("ClownFish");
	}

	public void size() {
		System.out.println("I am ClownFish. Size is small");

	}

	public void color() {
		System.out.println("I am ClownFish. My Color is Orange");

	}

	public void joke() {
		System.out.println("I am ClownFish. I can joke");

	}

}
