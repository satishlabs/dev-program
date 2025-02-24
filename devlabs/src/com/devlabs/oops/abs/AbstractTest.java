package com.devlabs.oops.abs;
/*
 Key Features of Abstract Class:

Can have both abstract and non-abstract methods.
Can declare and initialize instance variables.
Supports constructors.
Can have static methods.
Can extend only one other class (single inheritance).

 * */

abstract class Animal{
	String name;
	
	//Constructor
	Animal(String name){
		this.name = name;
	}
	
	//abstract method(must be implemented in subclass)
	abstract void makeSound();
	
	//concrete method(already implemented)
	public void sleep() {
		System.out.println(name+" is sleeping...");
	}
}

//Subclass extending abstract class
class Dog extends Animal{
	//If constructor will not here, It will give below error
	//Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	Dog(String name) {
		super(name);
	}
	
	// Implementing abstract method
	@Override
	void makeSound() {
		System.out.println(name+" barks: Woof! Woof!");
		
	}
	
}

public class AbstractTest {
	public static void main(String[] args) {
		Dog myDog = new Dog("Buddy");
		myDog.makeSound();
		myDog.sleep();
	}
}
