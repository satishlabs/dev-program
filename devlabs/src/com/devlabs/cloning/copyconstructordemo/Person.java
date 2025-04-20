package com.devlabs.cloning.copyconstructordemo;

public class Person {
	String name;
	Address address;
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
    // Copy constructor for deep clone
	Person(Person other){
		this.name = other.name;
		this.address = new Address(other.address); //deep copy
	}
}
