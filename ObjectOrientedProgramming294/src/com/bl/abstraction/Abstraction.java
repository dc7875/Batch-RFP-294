package com.bl.abstraction;

public class Abstraction {
	public static void main(String[] args) {
	//	Object obj = new Object(); // general way
		Car obj1 = new Tata();
		obj1.drive();
		
		Car obj2 = new Hyundai();
		obj2.startMusicPlayer();
		
	}
}
