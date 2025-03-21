package com.devlabs.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class User {
	private final String username;
	private final String email;
	private final List<String> roles; //Mutable filed
	
	 // Constructor initializes all fields
	public User(String username, String email, List<String> roles) {
		this.username = username;
		this.email = email;
		this.roles = new ArrayList<String>(roles);
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public List<String> getRoles() {
		return Collections.unmodifiableList(roles);
		//return roles;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", roles=" + roles + "]";
	}
	
	
	
	
}
