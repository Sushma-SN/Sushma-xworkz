package com.xworkz.data;

import java.awt.Color;
import java.util.Arrays;
import com.xworkz.data.constants.Shape;
import com.xworkz.data.dto.SweetDTO;


public class DTOSweetTester {

	public static void main(String[] args) {

		SweetDTO sweetDTO = new SweetDTO("Peda", 250, "Karnataka");
		System.out.println(sweetDTO.getName());
		System.out.println(sweetDTO.getPopulationstate());
		System.out.println(sweetDTO.getPrice());
		System.out.println(" ");

		String[] color = new String[2];
		color[0] = "white";
		//color[1] = "Orange";

		SweetDTO sweetDTO2 = new SweetDTO("Peda", color, Shape.DIMOND);
		System.out.println(sweetDTO2.getName());
		System.out.println(sweetDTO2.getPopulationstate());
		System.out.println(Arrays.toString(color));
		System.out.println(sweetDTO2.getShape());
		sweetDTO2.setPrice(400);
		System.out.println(sweetDTO2.getPrice());
	}
 
}