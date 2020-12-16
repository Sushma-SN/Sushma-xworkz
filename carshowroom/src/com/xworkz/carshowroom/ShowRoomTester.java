package com.xworkz.carshowroom;

import com.xworkz.carshowroom.dto.ManagerDTO;

import com.xworkz.carshowroom.showroom.CarShowRoom;

public class ShowRoomTester {

	public static void main(String[] args) {
		
		CarShowRoom carshowroom=new CarShowRoom();
		
		carshowroom.addManager("Ravi", 1);
		carshowroom.displayManager();
		carshowroom.removeManager();
		carshowroom.displayManager();
		
		
		ManagerDTO dto=new ManagerDTO("Devendra", 89);
		
		carshowroom.addManager(dto);
		carshowroom.displayManager();
		
		
		}

} 