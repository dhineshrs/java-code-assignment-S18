package com.xyz.solution;

class Duck implements CanSwim, CanSing {

	Swim swim = new Swim("Duck");
	Sing sing = new Sing("Quack, quack");

	public Swim getSwim() {
		return swim;
	}

	public void swim() {
		this.swim.swim();
	}

	public Sing getSing() {
		return sing;
	}
	
	public void sing(){
		this.sing.sing();
	}

}
