package com.xworkz.copies.constructor;

public class Museum {
	public String place="INDIA";
	public Museum(String museumPlace) {
	System.out.println("invoked museum constructor");
	System.out.println("arg 1: "+ museumPlace );
	System.out.println("instance var value is: "+place);
	System.out.println("assign arg to instance var");
	place=museumPlace;
	System.out.println("instance vae value is:" +place); 
}

}
