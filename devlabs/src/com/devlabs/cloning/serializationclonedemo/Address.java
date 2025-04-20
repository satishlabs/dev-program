package com.devlabs.cloning.serializationclonedemo;

import java.io.Serializable;

public class Address implements Serializable {
	String city;

	public Address(String city) {
		this.city = city;
	}
}
