package com.devlabs.cloning;

public class ShallowCloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Delhi");
		Person p1 = new Person("Satish", address);
		
		Person p2 = (Person)p1.clone();
		
		System.out.println(p1.address.city);//Delhi
		System.out.println(p2.address.city); //Delhi
		
		
		p2.address.city = "Mumbai";
		
		System.out.println("\n=======================");
		
        // Both objects share the same Address instance
		System.out.println(p1.address.city); //Mumbai
		System.out.println(p2.address.city); //Mumbai
	}
}
