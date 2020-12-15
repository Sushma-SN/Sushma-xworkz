package com.xworkz.data;

import java.util.Date;

import com.xworkz.data.dto.FileDTO;

public class FileDataTester {

	public static void main(String[] args) {
		
		
		FileDTO dto=new FileDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getCreatedDate());
		
		FileDTO dto2=new FileDTO("backup.jpg", 159.67);  
		System.out.println(dto2.getName());
		System.out.println(dto2.getSize());
		System.out.println(dto2.getCreatedDate());
		
		Date currentDate=new Date();
		//System.out.println(currentDate);
		
		
		dto2.setCreatedDate(currentDate); 
		System.out.println(dto2.getCreatedDate());
		 
		dto2.setLocation("c://images");
		dto2.setType("jpg");
		
		Date date =new Date();
		FileDTO dto3=new FileDTO("xworkz.jpg", 100, "jpg", "c://images", date);
		System.out.println(dto3.getName());
		System.out.println(dto3.getSize());
		System.out.println(dto3.getCreatedDate());
		 
	}

}
