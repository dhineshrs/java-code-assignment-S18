package com.xyz.solution;

public class Sing {
	String message;

	public Sing(String message) {
		this.message = message;
	}

	public String sing() {
		return "I am singing.." + message;
	}
}
