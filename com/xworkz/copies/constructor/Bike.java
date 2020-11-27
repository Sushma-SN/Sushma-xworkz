package com.xworkz.copies.constructor;

public class Bike {
	//Compiler checks.
	public String color="BLACK";
		public Bike(String bikeColor) {
		System.out.println("invoked Bike constructor");
		System.out.println("arg 1: "+ bikeColor );
		System.out.println("instance var value is: "+color);
		System.out.println("assign arg to instance var");
		color=bikeColor;
		System.out.println("instance vae value is:" +color); 
	}

}