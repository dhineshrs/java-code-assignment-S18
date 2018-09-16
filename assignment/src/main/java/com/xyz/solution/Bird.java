package com.xyz.solution;

class Bird extends Animal implements CanFly, CanSing {

	public Fly getFly() {
		return new Fly("Bird");
	}

	public Sing getSing(String type) {
		return new Sing(type);
	}

	public Sing getSing() {
		return new Sing("Bird");
	}

	public Fly getFly(String birdType) {
		return new Fly(birdType);
	}

}
