package com.xyz.solution;

public class Fly {
	String message;

	public Fly(String message) {
		this.message = message;
	}

	public String fly() {
		return "I am flying.." + message;
	}
}
