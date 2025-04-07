package com.devlabs.dp.builder;

public class UserBuilderMain {
	public static void main(String[] args) {
		UserBuilder user = UserBuilder.builder()
                .name("Alice")
                .age(30)
                .city("New York")
                .build();

		System.out.println(user);
	}
}
