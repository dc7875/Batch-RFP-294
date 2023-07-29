package com.bl.methodoverriding;

public class Circle extends Shape{
	void draw() {
		System.out.println("Circle");
	}
	
	void numberOfSides() {
		System.out.println("Side");
	}
}
