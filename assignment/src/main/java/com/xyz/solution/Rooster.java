package com.xyz.solution;

public class Rooster extends Bird {

	Chicken chicken = new Chicken();

	public String sing(String message) {
		return new Chicken().sing(message);
	}

}
