package com.devlabs.cloning.serializationclonedemo;

public class SerializationCloneDemo {
	public static void main(String[] args) throws Exception {
		Address address = new Address("Delhi");
		Person p1 = new Person("Satish", address);
		
		Person p2 = Person.deepClone(p1); //deep cloned
		
		p2.address.city = "Mumbai";
		
		System.out.println(p1.address.city); //Delhi
		System.out.println("\n====================");
		System.out.println(p2.address.city); //Mumabi
	}
}
