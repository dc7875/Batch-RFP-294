package com.bl.methodoverriding;

public class Triangle extends Shape{
	void draw() {
		System.out.println("Triangle");
	}
	
	void numberOfSides() {
		System.out.println("Side");
	}
}
