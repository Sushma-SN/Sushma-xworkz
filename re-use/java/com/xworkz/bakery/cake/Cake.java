package com.xworkz.bakery.cake;

//java.lang.object
public class Cake {
	
	private String flavour; //encapsulation
	private double size;
	private String shape;
	
	public boolean taste()
	{
		System.out.println("invoked taste");
		boolean tastesYummy = true;
		return tastesYummy;
		
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	
	

}
