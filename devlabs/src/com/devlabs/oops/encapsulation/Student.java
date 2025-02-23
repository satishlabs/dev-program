package com.devlabs.oops.encapsulation;

/*
 Encapsulation with Validation in Setters
Encapsulation also helps in adding data validation.

 * */
public class Student {
	private String name;
	private int marks;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setMarks(int marks) {
		if(marks >= 0 && marks <= 100) {
			this.marks = marks;
		}else {
			System.out.println("Invalid marks! Marks should be between 0 and 100");
		}
	}
	
	public int getMarks() {
		return marks;
	}
}
