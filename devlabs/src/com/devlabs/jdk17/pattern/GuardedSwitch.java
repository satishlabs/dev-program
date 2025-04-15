package com.devlabs.jdk17.pattern;

public class GuardedSwitch {
	public static void main(String[] args) {
		Object obj = "Java";
		
		switch(obj) {
		case String s when s.length() > 5 -> System.out.println("Long String: "+s);
		case String s -> System.out.println("Short String: "+s);
		case null -> System.out.println("Its null");
		default -> System.out.println("Other type");
		}
	}
}
