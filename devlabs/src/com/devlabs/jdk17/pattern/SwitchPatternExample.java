package com.devlabs.jdk17.pattern;

public class SwitchPatternExample {
	public static void main(String[] args) {
		Object obj=10;
		
		switch (obj) {
		case String s ->System.out.println("String: "+s.toUpperCase());
		case Integer i -> System.out.println("Integer: "+(i*i));
		default -> System.out.println("Other: "+obj);
		}
	}
}
