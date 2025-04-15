package com.devlabs.jdk17.pseudorandom;

import java.util.random.RandomGeneratorFactory;

public class SeededExample {
	public static void main(String[] args) {
		long seed = 42;
		var generator = RandomGeneratorFactory.of("L64X128MixRandom").create(seed);
		
		System.out.println("Repeatable Int: " + generator.nextInt());
        System.out.println("Repeatable Double: " + generator.nextDouble());
	}
}
