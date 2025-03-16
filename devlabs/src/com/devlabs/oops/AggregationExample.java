package com.devlabs.oops;

//Engine can exist independently of Car
class Engine{
	String type;
	
	public Engine(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}

//Car HAS-A Engine (Aggregation)
class Car{
	private String model;
	private Engine engine;// Aggregation
	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}
	
	public void showDetails() {
		System.out.println(model);
		System.out.println(engine.getType());
	}
	
}


/*
 Aggregation ("Has-A" relationship, weak association):

Child object can exist independently of the parent.
Example: A Car has an Engine, but an Engine can exist without the Car.
 * */
public class AggregationExample {
	public static void main(String[] args) {
		Engine engine = new Engine("E14");// Engine can exist separately
		Car car = new Car("MBW", engine);
		car.showDetails();
	}
}
