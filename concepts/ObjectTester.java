package com.xworkz.concepts;

import com.xworkz.concepts.obj.Vehicle;

public class ObjectTester {
	public static void main(String[] args) {
		
		Vehicle.yom="2020";
		
		Vehicle vehicle=new Vehicle();
		//ehicle.displayInfo();
		vehicle.color="Black";
		vehicle.model="Baleno";
		
		vehicle.owner="Sushma";
		
		vehicle.displayInfo();
		
		System.out.println("*************");
		
		Vehicle vehicle2=new Vehicle();
		//vehicle2.displayInfo();
		vehicle2.color="Blue";
		vehicle2.model="Rolls Royce";
		vehicle2.displayInfo();
	}

}
