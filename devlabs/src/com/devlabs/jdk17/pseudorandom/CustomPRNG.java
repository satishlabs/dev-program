package com.devlabs.jdk17.pseudorandom;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/*
 Algorithm options include:

L64X128MixRandom

L128X256MixRandom

Xoshiro256PlusPlus

SplitMix64
 * */
public class CustomPRNG {
	public static void main(String[] args) {
		RandomGenerator generator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();

        System.out.println("Xoshiro Random: " + generator.nextInt(100));
	}
}
