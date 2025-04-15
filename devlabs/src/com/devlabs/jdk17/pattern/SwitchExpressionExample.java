package com.devlabs.jdk17.pattern;

public class SwitchExpressionExample {
	public static void main(String[] args) {
		Object input = "JEP406";

		String result = switch (input) {
		case String s -> "Its a String: " + s;
		case Integer i -> "Its a an integer: " + i;
		default -> "Unknown Type";
		};

		System.out.println(result);
	}
}
