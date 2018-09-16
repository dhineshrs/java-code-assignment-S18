package com.xyz.solution;

public class ParrotController implements Parrot {

	Parrot parrot;

	public ParrotController(Parrot parrot) {
		this.parrot = parrot;
	}

	public void sing(String message) {
		parrot.sing(message);
	}

}
