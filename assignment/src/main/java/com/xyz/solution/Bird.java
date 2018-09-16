package com.xyz.solution;

class Bird extends Animal implements CanFly, CanSing {

	public String sing(String message) {
		return "I am singing.." + message;
	}

	public Fly getFly() {
		return new Fly("Bird");
	}

	public Sing getSing() {
		return new Sing("Bird");
	}

}
