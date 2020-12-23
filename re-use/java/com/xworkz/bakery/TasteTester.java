package com.xworkz.bakery;

import com.xworkz.bakery.cake.Cake;

import com.xworkz.bakery.cake.Pastry;

public class TasteTester {

	public static void main(String[] args) {
		 
		//decomplier
		Cake cake = new Cake();
		cake.setFlavour("Vanila");
		cake.setShape("Square");
		cake.setSize(2.5);
		
		System.out.println("Cake flavour : " + cake.getFlavour());
		System.out.println("Cake flavour : " + cake.getShape());
		System.out.println("Cake flavour : " + cake.getSize());
		cake.taste(); 
		
		Pastry pastry = new Pastry();
		
		System.out.println("Pastry flavour : " + pastry.getFlavour());
		System.out.println("Pastry flavour : " + pastry.getShape());
		System.out.println("Pastry flavour : " + pastry.getSize());
		
		pastry.taste();
	}
 
}  