package com.devlabs.oops.encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		//Setting values using setter methods
		emp.setName("Satish");
		emp.setAge(25);
		
		//Getting values using getter methods
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Age: "+emp.getAge());
	}
}
