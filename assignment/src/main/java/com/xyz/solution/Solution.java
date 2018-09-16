package com.xyz.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public void checkWalkAnimal() {
		Animal animal = new Animal();
		animal.getWalk().walk();

		Caterpillar caterpillar = new Caterpillar();
		caterpillar.getWalk().walk();
	}

	public void checkBirds() {

		Bird bird = new Bird();
		System.out.println(bird.getFly().fly());
		System.out.println(bird.getSing().sing());

		Duck duck = new Duck();
		System.out.println(duck.getSwim().swim());
		System.out.println(duck.sing("Quack, quack"));

		Bird chicken = new Chicken();
		System.out.println(chicken.sing("Cluck, cluck"));

		Bird rooster = new Rooster();
		System.out.println(rooster.sing("Cock-a-doodle-doo"));

		ParrotController parrotWithDogsController = new ParrotController(new ParrotWithDogs());
		ParrotController parrotWithCatsController = new ParrotController(new ParrotWithCats());
		ParrotController parrotWithRoostersController = new ParrotController(new ParrotWithRoosters());
		System.out.println(rooster.sing(parrotWithDogsController.sing("Woof, woof")));
		System.out.println(rooster.sing(parrotWithCatsController.sing("Meow")));
		System.out.println(rooster.sing(parrotWithRoostersController.sing("Cock-a-doodle-doo")));

	}

	public void checkFish() {
		Fish fish = new Fish();
		fish.getSwim().swim();

		Shark shark = new Shark();
		shark.getSwim().swim();
		shark.eat();
		shark.size();
		shark.color();

		ClownFish cownFish = new ClownFish();
		cownFish.getSwim().swim();
		cownFish.size();
		cownFish.joke();
		cownFish.color();

		Dolhpin dolphin = new Dolhpin();
		dolphin.getSwim().swim();
	}

	public void checkButterFly() {
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		// solution.checkWalkAnimal();
		solution.checkBirds();
		// solution.checkFish();
		// solution.checkButterFly();

		System.out.println("Number of animals can swim :" + solution.swimAnimals());
		System.out.println("Number of animals can fly :" + solution.flyAnimals());
		System.out.println("Number of animals can walk :" + solution.walkAnimals());
		System.out.println("Number of animals can sing :" + solution.singingAnimals());
	}

	public int swimAnimals() {
		List<CanSwim> swimList = new ArrayList<CanSwim>();
		swimList.add(new Duck());
		swimList.add(new Fish());
		swimList.add(new Shark());
		swimList.add(new ClownFish());
		swimList.add(new Dolhpin());
		return swimList.size();
	}

	public int walkAnimals() {
		List<CanWalk> walkAnimals = new ArrayList();
		walkAnimals.add(new Caterpillar());
		return walkAnimals.size();
	}

	public int flyAnimals() {
		List<CanFly> flyAnimals = new ArrayList();
		flyAnimals.add(new Butterfly());
		return flyAnimals.size();
	}

	public int singingAnimals() {
		List<CanSing> singingAnimals = new ArrayList();
		singingAnimals.add(new Duck());
		singingAnimals.add(new Chicken());
		singingAnimals.add(new Rooster());
		singingAnimals.add(new ParrotWithCats());
		singingAnimals.add(new ParrotWithDogs());
		singingAnimals.add(new ParrotWithRoosters());
		return singingAnimals.size();
	}

}
