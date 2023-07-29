package com.bl.methodoverriding;

public class Overriding {
	public static void main(String[] args) {
		Circle obj1 = new Circle();
		obj1.draw();
		obj1.numberOfSides();
		
		Triangle obj2 = new Triangle();
		obj2.draw();
		obj2.numberOfSides();
		
		Box obj3 = new Box();
		obj3.draw();
		obj3.numberOfSides();
		
	}
}
