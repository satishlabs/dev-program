package com.devlabs.jdk8.opt;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		Optional<String> name = Optional.of("Alice");
		System.out.println(name.get());// Alice
		
		name = Optional.ofNullable(null);
		System.out.println(name.isPresent());// false
		
		String value = name.orElse("Default");
		System.out.println(value);
		
		String value1 = name.orElseGet(() -> "Generated");
		System.out.println(value1);
		
		//String value2 = name.orElseThrow(() -> new RuntimeException("Missing"));
		//System.out.println(value2);
		
		Optional<String> email = Optional.of("example@email.com");
		email.filter(e -> e.endsWith(".com"))
				.map(String::toUpperCase)
				.ifPresent(System.out::println);
		
	}
}
