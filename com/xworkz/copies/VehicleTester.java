package com.xworkz.copies;

import com.xworkz.copies.init.Vehicle;

public class VehicleTester {

	public static void main(String[] args) {
		Vehicle vehicle;
		vehicle=new Vehicle("Honda Motor",18245,24,"white");
		//debug
		String company=vehicle.getCompany();
		float chassisNo=vehicle.getChassisNo();
		float mfgDate=vehicle.getMfgDate();
		String color=vehicle.getColor();
		
		
		System.out.println(company);
		System.out.println(chassisNo);
		System.out.println(mfgDate);
		System.out.println(color);
		vehicle.setColor("red");
		color=vehicle.getColor();
		System.out.println("updated color:"+color);
	}

}