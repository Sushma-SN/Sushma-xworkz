package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {
	
	private String name;
	private long contactNo;
	private ManagerDTO managerDTO;
	
	public CarShowRoom() {
		System.out.println("default const");
	}
	

	public CarShowRoom(String name, String string) {
		super();
		this.name = name;
		this.contactNo = string;
		this.managerDTO = managerDTO;
	}
	
	public void addManager(String name, long contactNo)
	{
		if(name!=null && contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("manager added, data is valid");
		}else {
			System.out.println("manager added, data is invalid");
		}
	}
	
	public void addManager(ManagerDTO dto) {
		if(dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		}else {
			System.out.println("Manager not added,data is invalid");
		}
	}
	
	public void displayManager() {
		if(this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());		
	}else {
		System.out.println("manager is not there:: null");
	}
}
	public void removeManager() {
		this.managerDTO=null;
	}


	public String getName() {
		return name;
	}

}
	