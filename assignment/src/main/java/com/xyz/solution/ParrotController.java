package com.xyz.solution;

public class ParrotController implements Parrot {

	Parrot parrot;

	public ParrotController(Parrot parrot) {
		this.parrot = parrot;
	}

	public String sing(String message) {
		return parrot.sing(message);
	}

}
