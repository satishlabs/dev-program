package com.devlabs.jdk17.pseudorandom;

import java.util.random.RandomGenerator;

public class StreamExample {
	public static void main(String[] args) {
		 RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");
		 rng.ints(5,10,50) // generate 5 random integers in range [10, 50)
		 .forEach(System.out::println);
	}
}
