package com.devlabs.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(3, "Alice"));
		empList.add(new Employee(1, "Bob"));
		empList.add(new Employee(2, "Charlie"));
		
		Collections.sort(empList);// Uses compareTo() method
		
		System.out.println(empList);
	}
}
