package com.devlabs.scenarios.cabservice;

public class Cab {
	private final String id;
	private String location;
	
	public Cab(String id, String location) {
		this.id = id;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cab [id=" + id + ", location=" + location + "]";
	}
	
	
}
