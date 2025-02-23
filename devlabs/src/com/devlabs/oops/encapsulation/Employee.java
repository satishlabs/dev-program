package com.devlabs.oops.encapsulation;

/*
 ncapsulation is achieved using:

Private variables: Restrict direct access to data members.
Public getter and setter methods: Provide controlled access

 * */
public class Employee {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age > 0 ) {
			//Prevent negative age
			this.age = age;
		}else {
			System.out.println("Age must be positive");
		}
	}
	
	public int getAge() {
		return age;
	}
}
