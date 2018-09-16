package com.xyz.solution;

class Duck extends Bird implements CanSwim {

//	Sing sing = new Sing("Quack, quack");

	public Swim getSwim() {
		return new Swim("Duck");
	}

	@Override
	public String sing(String message) {
		return super.sing(message);
	}

}
