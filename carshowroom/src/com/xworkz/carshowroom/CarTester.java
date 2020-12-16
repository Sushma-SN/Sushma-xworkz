package com.xworkz.carshowroom;

import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class CarTester {

	public static void main(String[] args) {
		
		CarShowRoom carShowRoom = new CarShowRoom();
		
		CarDTO dto = new CarDTO();
		
		dto.setModel("Tesla");
		System.out.println(dto.getModel());
		dto.setPrice(200000);
		System.out.println(dto.getPrice()); 
		
		carShowRoom.addCar(dto); 
		
		CarDTO dto2=new CarDTO("Swift", 600000, CarVariant.TOP);
		
		carShowRoom.addCar(dto2);
		
		CarDTO dto3=new CarDTO("Jeep", 280000, CarVariant.TOP);
		
		carShowRoom.addCar(dto3);
		
		CarDTO dto4=new CarDTO("Lamborighini", 3000000, CarVariant.TOP);
		
		carShowRoom.addCar(dto4);
		
		CarDTO dto5=new CarDTO("Muruthi 800", 30000, CarVariant.TOP);
		
		carShowRoom.addCar(dto5);
		
		carShowRoom.displayCars();
		
		carShowRoom.updateCarVariant(CarVariant.BASE, 1);
		
		//carShowRoom.displayCars();
		
		carShowRoom.displayCarAtIndex(1);
		
		carShowRoom.displayCarByModel("Ford");
		
		
	}

}
