package com.devlabs.cloning.copyconstructordemo;

public class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
	
    // Copy constructor
	public Address(Address other) {
		this.city = other.city;
	}
}
