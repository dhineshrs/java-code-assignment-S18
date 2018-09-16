package com.xyz.solution;

public class Rooster extends Bird {

	Chicken chicken = new Chicken();

	public Sing sing(String message) {
		return new Chicken().getSing(message);
	}

}
