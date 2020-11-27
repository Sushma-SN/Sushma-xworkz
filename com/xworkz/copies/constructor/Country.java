package com.xworkz.copies.constructor;

public class Country {
	public String state="KARNATAKA";
	public Country(String countryState) {
	System.out.println("invoked country constructor");
	System.out.println("arg 1: "+ countryState );
	System.out.println("instance var value is: "+state);
	System.out.println("assign arg to instance var");
	state=countryState;
	System.out.println("instance vae value is:" +state); 
}

}