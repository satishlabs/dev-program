package com.devlabs.cloning.copyconstructordemo;

public class CopyConstructorDemo {
	public static void main(String[] args) {
		Address address = new Address("Delhi");
		
		Person p1 = new Person("Satish", address);
		Person p2 = new Person(p1); // deep clone using copy constructor
		
		
		p2.address.city = "Mumabi";
		
		System.out.println(p1.address.city); //Delhi
		System.out.println("\n===================");
		System.out.println(p2.address.city); //Mumbai
	}
}
