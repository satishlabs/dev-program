package com.devlabs.cloning;

public class DeepCloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address1 address1 = new Address1("Delhi");
		Person1 p1 = new Person1("Satish", address1);
		
		Person1 p2 = (Person1)p1.clone();
		
		p2.address1.city = "Mumbai";
		
		
		System.out.println(p1.address1.city); //Delhi
		System.out.println("\n========================");
		System.out.println(p2.address1.city); //Mumbai
	}
}
