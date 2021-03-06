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
		System.out.println(duck.getSing("Quack, quack").sing());

		Bird chicken = new Chicken();
		System.out.println(chicken.getSing("Cluck, cluck").sing());

		Bird rooster = new Rooster();
		System.out.println(rooster.getSing("Cock-a-doodle-doo").sing());

		ParrotController parrotWithDogsController = new ParrotController(new ParrotWithDogs());
		ParrotController parrotWithCatsController = new ParrotController(new ParrotWithCats());
		ParrotController parrotWithRoostersController = new ParrotController(new ParrotWithRoosters());
		System.out.println(parrotWithDogsController.sing("Woof, woof"));
		System.out.println(parrotWithCatsController.sing("Meow"));
		System.out.println(parrotWithRoostersController.sing("Cock-a-doodle-doo"));

	}

	public void checkFish() {
		Fish fish = new Fish();
		System.out.println(fish.getSwim().swim());
		
		Shark shark = new Shark();
		System.out.println(shark.getSwim().swim());
		shark.eat();
		shark.size();
		shark.color();

		ClownFish cownFish = new ClownFish();
		System.out.println(cownFish.getSwim().swim());
		cownFish.size();
		cownFish.joke();
		cownFish.color();

		Dolhpin dolphin = new Dolhpin();
		dolphin.getSwim().swim();
	}

	public void checkButterFly() {
		Bird butterfly = new Butterfly();
		System.out.println(butterfly.getFly("Butterfly").fly());
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		// solution.checkWalkAnimal();
		//solution.checkBirds();
		solution.checkFish();
		 //solution.checkButterFly();

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
