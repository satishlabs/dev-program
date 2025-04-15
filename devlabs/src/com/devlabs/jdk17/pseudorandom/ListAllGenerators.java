package com.devlabs.jdk17.pseudorandom;

import java.util.random.RandomGeneratorFactory;

public class ListAllGenerators {
	public static void main(String[] args) {
		RandomGeneratorFactory.all()
			.map(RandomGeneratorFactory::name)
			.sorted()
			.forEach(System.out::println);
	}
}
