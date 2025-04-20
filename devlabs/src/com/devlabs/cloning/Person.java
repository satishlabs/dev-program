package com.devlabs.cloning;

public class Person implements Cloneable{
	String name;
	Address address;
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
    // Shallow copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // default clone() does shallow copy
	}
}
