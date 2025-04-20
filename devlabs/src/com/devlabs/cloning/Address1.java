package com.devlabs.cloning;

public class Address1 implements Cloneable{
	String city;
	
	Address1(String city){
		this.city = city;
		}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();// clone string (immutable)
	}
}
