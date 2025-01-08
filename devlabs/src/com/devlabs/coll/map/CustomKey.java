package com.devlabs.coll.map;

public class CustomKey {
	private final String key;
	public CustomKey(String key) {
		this.key = key;
	}
	
	public int hashcode() {
		// Return a constant hash code for all keys to simulate a hash collision
		return 42;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		
		CustomKey ck = (CustomKey)obj;
		return key.equals(ck.key);
	}
	
	@Override
	public String toString() {
		return key;
	}
	
}
