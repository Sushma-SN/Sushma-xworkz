package com.xworkz.copies.init;

public class Vehicle {
	private String company;
	private float chassisNo;
	private float mfgDate;
	private String color;
	
	public Vehicle(String company,float chassisNo,float mfgDate,String color)
	{
		this.company=company;
		this.chassisNo=chassisNo;
		this.mfgDate=mfgDate;
		this.color=color;
	}

	public String getCompany() {
		return company;
	}

	public float getChassisNo() {
		return chassisNo;
	}

	public float getMfgDate() {
		return mfgDate;
	} 

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


}


