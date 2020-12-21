package com.xworkz.dresses.ethnicWear;

public class Lehenga {
	
	private String color;
	private double price;
	private int size;
	
	public boolean material()
	{
		System.out.println("invoked dress material");
		boolean materialIsGood = true;
		return materialIsGood;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
		
	}
	
	

}
