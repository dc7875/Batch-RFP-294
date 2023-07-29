package com.bl.abstraction;

abstract class Car {
	Car() {
		System.out.println("car");
	}
	
	abstract void drive();
	
	abstract void startMusicPlayer();
	
	void gearChange() {
		System.out.println("Gearchanged");
	}
}
