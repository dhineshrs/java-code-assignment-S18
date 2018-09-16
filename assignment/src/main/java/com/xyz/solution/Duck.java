package com.xyz.solution;

class Duck extends Bird implements CanSwim {

	Sing sing = new Sing("Quack, quack");

	public Swim getSwim() {
		return new Swim("Duck");
	}

	@Override
	public void sing(String message) {
		super.sing(message);
	}

}
