package com.bl.methodoverloading;

public class Overloading {
	public static void main(String[] args) {
		CircleArea circle = new CircleArea();
		SquareArea square = new SquareArea();
		RectangleArea rectangle = new RectangleArea();
		TriangleArea triangle = new TriangleArea();
		
		System.out.println("Rectangle area : " + rectangle.area(6,8));
		System.out.println("Circle area : " + circle.area(1));
		System.out.println("Square area : " + square.area(6));
		System.out.println("Triangle area : " + triangle.area(6,3));
	}
}
