package com.devlabs.oops.encapsulation;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student("Satish");
		
		student.setMarks(85);
		System.out.println(student.getName()+"'s Marks: "+student.getMarks());
		
		student.setMarks(150);
	}
}
