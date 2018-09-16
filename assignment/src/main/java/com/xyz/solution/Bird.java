package com.xyz.solution;

class Bird extends Animal implements CanFly, CanSing {

	Fly fly = new Fly("Bird");
	Sing sing = new Sing("Bird");

	public void sing(String message) {
		System.out.println("I am singing.." + message);
	}

	public Fly getFly() {
		return fly;
	}

	public Sing getSing() {
		return sing;
	}

}
