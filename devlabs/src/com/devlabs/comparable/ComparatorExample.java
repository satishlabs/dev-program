package com.devlabs.comparable;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Employee1> employees = new ArrayList<Employee1>();
		employees.add(new Employee1(3, "Alice",15000));
		employees.add(new Employee1(1, "Bob",20000));
		employees.add(new Employee1(2, "Charlie",12000));
		
		//Sorting by Name
		employees.sort(EmployeeComparator.BY_NAME);
		System.out.println("Sorted By Name: "+employees);
		
		employees.sort(EmployeeComparator.BY_ID);
		System.out.println("Sorted By ID: "+employees);
		
		employees.sort(EmployeeComparator.BY_SALARY);
		System.out.println("Sorted by Salary: "+employees);
	}
}
