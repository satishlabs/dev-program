package com.devlabs.dp.builder;

public class User {
	private String username;
	private String password;
	private String email;
	private String phone;
	private String address;
	
	// Private constructor to prevent direct instantiation
	private User(UserBuilder builder) {
		this.username = builder.username;
		this.password = builder.password;
		this.email = builder.email;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	   // Getters
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}


    // **Step 2: Create the Static Builder Class**
	public static class UserBuilder{
		private String username;
		private String password;
		private String email;
		private String phone;
		private String address;
		
        // Setter methods return UserBuilder instance (Method Chaining)
		public UserBuilder setUsername(String username) {
			this.username = username;
			return this;
		}
		public UserBuilder setPassword(String password) {
			this.password = password;
			return this;
		}
		public UserBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		// **Final build() method**
		public User build() {
			return new User(this);
		}
		
	}
}	
