package com.devlabs.dp.builder;


/*
 Why Do We Need the Builder Pattern?
In object-oriented programming, you may encounter situations where:

A class has too many optional parameters, leading to constructor overloading.
Some object parameters are required, while others are optional.
You want to avoid long, unreadable constructors with many parameters.
The immutability of an object is required (i.e., no setters should be used).
 * */
public class UserMain {
	public static void main(String[] args) {
		
		//Creating a User object using Builder Pattern
		User user1 = new User.UserBuilder()
				.setUsername("test1")
				.setPassword("test123")
				.setEmail("test1@gmail")
				.setPhone("1234")
				.setAddress("Test1")
				.build();
		
		 //Creating another user with only username and email
		User user2 = new User.UserBuilder()
				.setUsername("test2")
				.setEmail("test2@gmail")
				.build();
		
		//Print the user details
		System.out.println(user1);
		System.out.println(user2);
		
	}
}

//user1 is fully initialized.
//user2 only has username and email, and other fields are null.

//User [username=test1, password=test123, email=test1@gmail, phone=1234, address=Test1]
//User [username=test2, password=null, email=test2@gmail, phone=null, address=null]
