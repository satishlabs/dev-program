package com.devlabs.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmutableEmployee {
	public static void main(String[] args) {
		List<String> skills = new ArrayList<String>();
		skills.add("Java");
		skills.add("Spring");
		
		Date dob = new Date();
		Employee emp = new Employee("Satish", 30, dob, skills);
		System.out.println(emp);
		
		//Trying to modify mutable fields externally
		dob.setTime(0); //should not change the original date
		skills.add("AWS"); //should not change the original list
		emp.getSkills().add("Docker"); //should not change the original list
		emp.getDob().setTime(100000000L); //should not change the original date
		
		System.out.println("After Modification: "+emp);
	}
}
