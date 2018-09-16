package com.xyz.solution;

class Duck extends Bird implements CanSwim {

	public Swim getSwim() {
		return new Swim("Duck");
	}

	@Override
	public Sing getSing(String message) {
		return super.getSing(message);
	}

}
