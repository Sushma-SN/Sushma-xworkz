package com.xworkz.copies;
import com.xworkz.copies.constructor.Bike;
public class BikeTester {

	public static void main(String[] args) {
		//create an instance/object
		Bike bike = new Bike("BLUE");
		bike.color="RED";
		Bike yamaha = new Bike("GREEN");
		System.out.println(yamaha.color); 
		Bike honda = new Bike("WHITE");
		System.out.println(honda.color); 
		
	}

} 