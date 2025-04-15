package com.devlabs.jdk17.pseudorandom;

import java.util.random.RandomGenerator;

public class BasicRandomExample {
	public static void main(String[] args) {
		RandomGenerator generator = RandomGenerator.getDefault();
		
		System.out.println("Int: "+generator.nextInt());
		System.out.println("Double: "+generator.nextDouble());
		System.out.println("Boolean: "+generator.nextBoolean());
	}
}
