package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeByDepartment {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee(1, "Satish", "IT", "sat@gamil.com",12000),
				new Employee(2, "Ramesh", "HR", "sat@gamil.com",20000),
				new Employee(3, "Mahesh", "CS", "sat@gamil.com",10000),
				new Employee(4, "Kundan", "HR", "sat@gamil.com",18000),
				new Employee(5, "Kauhsik", "IT", "sat@gamil.com",15000)
				);
		
		Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		collect.forEach((dept, empL) -> {
			System.out.println(dept+" -> "+empL);
		});
		
		System.out.println("\n========================");
		Map<String, List<String>> collect2 = empList.stream().collect(Collectors.groupingBy(
				Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())
				));
		collect2.forEach((dpt,names) -> {
			System.out.println(dpt+" "+names);
		});
		System.out.println("\n=========Sorted Salary===============");
		List<Employee> sorted = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println("\n=========Sorted Salary===============");
		sorted.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
	}
}
