package com.xyz.solution;

class Bird extends Animal implements CanFly, CanSing {

	public void sing(String message) {
		System.out.println("I am singing.." + message);
	}

	public Fly getFly() {
		return new Fly("Bird");
	}

	public Sing getSing() {
		return new Sing("Bird");
	}

}
