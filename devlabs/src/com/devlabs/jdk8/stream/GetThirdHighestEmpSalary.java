package com.devlabs.jdk8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GetThirdHighestEmpSalary {
	public static void main(String[] args) {
		List<Emp> empList = Arrays.asList(
				new Emp(1, "Test1", "IT", 20000),
				new Emp(2, "Test2", "HR", 10000),
				new Emp(3, "Test3", "CS", 12000),
				new Emp(4, "Test4", "IT", 18000),
				new Emp(5, "Test5", "CS", 15000),
				new Emp(6, "Test6", "HR", 25000),
				new Emp(7, "Test7", "IT", 22000)
				);
		
		Optional<Integer> empSalary = empList.stream()
		.distinct()
		.map(Emp:: getSalary)
		.sorted(Comparator.reverseOrder())
		.skip(2)
		.findFirst();
		
		if(empSalary.isPresent()) {
			System.out.println(empSalary.get());
		}
		System.out.println("\n========================");
		
		if(empSalary.isPresent()) {
			int thirdHighestSalary = empSalary.get();
			List<Emp> result = empList.stream()
					.filter(e -> e.getSalary() == thirdHighestSalary)
					.collect(Collectors.toList());
			
			System.out.println("Employess with 3rd highest salary: "+thirdHighestSalary);
			result.forEach(System.out::println);
		}else {
			System.out.println("Not enough distinct salaries");
		}
		System.out.println("\n========================");
		
		TreeSet<Integer> distinctSalaries = new TreeSet<>(Collections.reverseOrder());
		for(Emp e: empList) {
			distinctSalaries.add(e.getSalary());
		}
		
		if(distinctSalaries.size() < 3) {
			System.out.println("Not enough distinct salaries..");
			return;
		}
		 // Get the 3rd highest salary
		Iterator<Integer> it = distinctSalaries.iterator();
		it.next(); //1st highest
		it.next(); //2nd highest
		int thirdHighest = it.next(); //3rd highest
		
		//Print all employees with the 3rd highest salary
		System.out.println("Employees with 3rd highest salary : "+thirdHighest);
		for(Emp e: empList) {
			if(e.getSalary() == thirdHighest) {
				System.out.println(e);
			}
		}
		System.out.println("\n========================");
		
		empList.stream()
        .map(Emp::getSalary)
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(2)
        .findFirst()
        .ifPresent(thirdHighestSal -> empList.stream().filter( e -> e.getSalary() == thirdHighest)
        		.map(Emp::getName)
        		.forEach(System.out::println));
	}
}
