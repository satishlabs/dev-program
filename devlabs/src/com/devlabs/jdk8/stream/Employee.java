package com.devlabs.jdk8.stream;

public class Employee {
	private int id;
	private String name;
	private String department;
	private String email;
	private long salary;
	public Employee(int id, String name, String department, String email, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.email = email;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
	
	
}
