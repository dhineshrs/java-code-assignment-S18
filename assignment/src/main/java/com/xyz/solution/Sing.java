package com.xyz.solution;

public class Sing {
	String message;

	public Sing(String message) {
		this.message = message;
	}

	public void sing() {
		System.out.println("I am singing.." + message);
	}
}
