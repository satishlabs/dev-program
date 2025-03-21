package com.devlabs.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Employee {
	private final String name;
	private final int age;
	private final Date dob; //Mutbale filed
	private final List<String> skills;//Mutbale filed
	
	public Employee(String name, int age, Date dob, List<String> skills) {
		this.name = name;
		this.age = age;
		this.dob = new Date(dob.getTime()); //Defensive Copy
		this.skills = new ArrayList<String>(skills);//Defensive Copy
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDob() {
		return new Date(dob.getTime()); //Defensive Copy
	}

	public List<String> getSkills() {
		return new ArrayList<String>(skills); //Defensive Copy
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dob=" + dob + ", skills=" + skills + "]";
	}
}
