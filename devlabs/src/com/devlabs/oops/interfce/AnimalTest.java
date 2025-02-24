package com.devlabs.oops.interfce;

/*
 Key Features of Interface:

All methods are public and abstract by default (before Java 8).
Cannot have instance variables, only public static final constants.
Supports multiple inheritance.
From Java 8 onwards, interfaces can have default and static methods
 * */

interface Animal{
	//Abstract method (must be implemented)
	void makeSound();
	
	//void makeSound1();
	
	 // Default method (introduced in Java 8)
	default void sleep() {
		System.out.println("Animal is sleeping...");
	}
}

//Implementing the interface
class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog barks: Woof! Woof!");
		
	}
	
}

public class AnimalTest {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.makeSound();
		myDog.sleep();
	}
}
