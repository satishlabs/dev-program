package com.devlabs.cloning;

public class Person1 implements Cloneable{
	private String name;
	Address1 address1;
	
	public Person1(String name, Address1 address1) {
		this.name = name;
		this.address1 = address1;
	}
	
    // Deep clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person1 cloned = (Person1)super.clone();
		
		cloned.address1 = (Address1)address1.clone(); //clone nested object
		
		return cloned;
	}
}
