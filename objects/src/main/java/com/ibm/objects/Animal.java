package com.ibm.objects;

abstract public class Animal {
	abstract public void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Pig extends Animal {
	@Override
	public void animalSound() {
		System.out.println("This pig says : wee wee");
	}
}