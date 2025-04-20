package com.devlabs.cloning.serializationclonedemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	String name;
	Address address;
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
    // Utility method to deep clone using serialization
	public static Person deepClone(Person original) throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(original);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream in = new ObjectInputStream(bis);
		
		return (Person)in.readObject();
	}
}
