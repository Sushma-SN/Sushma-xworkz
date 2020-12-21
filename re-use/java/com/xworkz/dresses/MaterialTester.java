package com.xworkz.dresses;

import com.xworkz.dresses.ethnicWear.DesignerKurta;

import com.xworkz.dresses.ethnicWear.Lehenga;

public class MaterialTester {

	public static void main(String[] args) {
		
		DesignerKurta designerKurta = new DesignerKurta();
		designerKurta.setColor("Black");
		designerKurta.setPrice(2500);
		designerKurta.setSize(32);
		
		System.out.println("DesignerKurta color : "+designerKurta.getColor());
		System.out.println("DesignerKurta price : "+designerKurta.getPrice());
		System.out.println("DesignerKurta size : "+designerKurta.getSize());
		designerKurta.material();
		
		 
		Lehenga lehenga = new Lehenga();
		lehenga.setColor("Red");
		lehenga.setPrice(7500);
		lehenga.setSize(34);
		
		System.out.println("Lehenga color : " + lehenga.getColor());
		System.out.println("Lehenga price : " + lehenga.getPrice());
		System.out.println("Lehenga size : " + lehenga.getSize());
		lehenga.material();
	}

}
