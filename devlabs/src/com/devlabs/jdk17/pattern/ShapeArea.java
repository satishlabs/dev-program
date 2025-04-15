package com.devlabs.jdk17.pattern;
sealed interface Shape permits Circle, Reactangle{
	
}

final class Circle implements Shape{
	int radius;
	Circle(int r){
		radius = r;
	}
}

final class Reactangle implements Shape{
	int widht, height;
	Reactangle( int w, int h){
		widht = w;
		height = h;
	}
}

public class ShapeArea {
	static double area(Shape shape) {
		return switch (shape) {
		case Circle c -> Math.PI*c.radius*c.radius;
		case Reactangle r -> r.widht*r.height;
		};
	}
	
	public static void main(String[] args) {
		System.out.println(area(new Circle(5)));
		System.out.println(area(new Reactangle(4, 6)));
	}
}
