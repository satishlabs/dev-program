package com.devlabs.jdk8.stream;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Carro{
	String name;
	
	public Carro(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Carro [name=" + name + "]";
	}
	
}

public class ParallelStreamColecoes {
	public static void main(String[] args) {
		List<Carro> carros = new CopyOnWriteArrayList<>(List.of(
				new Carro("Toyota"),
				new Carro("Honda"),
				new Carro("Ford"),
				new Carro("BMW"),
				new Carro("Chevrolet")
				));
		
		List<String> marcas = new CopyOnWriteArrayList<String>();
		carros.parallelStream().forEach(carro -> marcas.add(carro.getName()));
		System.out.println(marcas);
	}
}
