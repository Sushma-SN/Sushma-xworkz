package com.xworkz.data.dto;

import com.xworkz.data.constants.Shape;

public class SweetDTO {
	
	private String name;
	private double price;
	private String populationstate;
	private Shape shape;
	private String[] color;
	
	public SweetDTO() {
		System.out.println("created SweetDTO using no-arg");
	
	}
	
	public SweetDTO(String name, double price, String populationstate) {
		super();
		this.name = name;
		this.price = price; 
		this.populationstate = populationstate;
	}
	

	public SweetDTO(String name, String[] color, Shape shape) {
		super();
		this.name = name;
		this.color = color;
		this.shape = shape;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPopulationstate() {
		return populationstate;
	}
	public void setPopulationstate(String populationstate) {
		this.populationstate = populationstate;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	
	

}
