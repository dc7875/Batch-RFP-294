package com.bl.methodoverriding;

public class Box extends Shape{
	void draw() {
		System.out.println("Box");
	}
	
	void numberOfSides() {
		System.out.println("Side");
	}
}
