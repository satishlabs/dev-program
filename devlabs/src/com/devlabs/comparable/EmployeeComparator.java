package com.devlabs.comparable;

import java.util.Comparator;

public class EmployeeComparator {
	//Sorting by Name
	static final Comparator<Employee1> BY_NAME = Comparator.comparing(Employee1::getName);
	 static final Comparator<Employee1> BY_ID = Comparator.comparing(Employee1::getId);
	 static final Comparator<Employee1> BY_SALARY = Comparator.comparing(Employee1::getSalary);
	
}