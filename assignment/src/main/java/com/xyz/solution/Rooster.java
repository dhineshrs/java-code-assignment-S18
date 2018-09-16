package com.xyz.solution;

public class Rooster extends Bird{

	Chicken chicken = new Chicken();

	public void sing(String message) {
		chicken.sing(message);
	}

}
