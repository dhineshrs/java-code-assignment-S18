package com.xyz.solution;

public class Butterfly implements CanFly {

	Fly fly = new Fly("Butterfly");
	
	public Fly getFly() {
		return fly;
	}

	public void fly() {
		this.fly.fly();
	}
}
