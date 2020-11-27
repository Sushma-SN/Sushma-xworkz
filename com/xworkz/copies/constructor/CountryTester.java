package com.xworkz.copies.constructor;

public class CountryTester {

	public static void main(String[] args) {
		//create an instance/object
				Country country = new Country("KARNATAKA");
				country.state="MAHARASHTRA";
				Country city1 = new Country("GULBARGA");
				System.out.println(city1.state); 
				Country city2 = new Country("BIDAR");
				System.out.println(city2.state);
				Country city3 = new Country("DHARWAD");
				System.out.println(city3.state);
				Country city4 = new Country("BANGALORE");
				System.out.println(city4.state);
				Country city5 = new Country("MYSORE");
				System.out.println(city5.state);
				Country city6 = new Country("BELGAUM");
				System.out.println(city6.state);
				Country city7 = new Country("HUBLI");
				System.out.println(city7.state);
				Country city8 = new Country("BIJAPUR");
				System.out.println(city8.state);
				Country city9 = new Country("HAMPI");
				System.out.println(city9.state);
				Country city10 = new Country("RAICHUR");
				System.out.println(city10.state);
	}

}