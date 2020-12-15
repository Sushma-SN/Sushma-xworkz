package com.xworkz.data;

import com.xworkz.data.dto.CustomerDTO;

public class DTOTester { 

	public static void main(String[] args) {
		
		CustomerDTO customerDTO=new CustomerDTO();
		
		customerDTO.setCustomerId(5775);
		customerDTO.setName("Sushma");
		customerDTO.setContactNo(7829302061l);
		customerDTO.setEmail("sushma.nimbal98@gmail.com");
		
		long no=customerDTO.getContactNo();
		if(no>0) {
			System.out.println(no);
		} 
		else {
			System.out.println("contact no is not there");
		}
		
		System.out.println(customerDTO.getEmail());
		System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getCustomerId()); 
		
		
		CustomerDTO customerDTO2=new CustomerDTO(); 
		customerDTO2.setCustomerId(7575);
		customerDTO2.setName("xworkz");
		customerDTO2.setContactNo(7829112298l); 
		customerDTO2.setEmail("xworkz@gmail.com"); 
		
		
		System.out.println(customerDTO2.getEmail());
		System.out.println(customerDTO2.getName());
		System.out.println(customerDTO2.getCustomerId());
		
		
		CustomerDTO customerDTO3=new CustomerDTO(); 
		customerDTO3.setCustomerId(1234);
		customerDTO3.setName("Seema");
		customerDTO3.setContactNo(9865612298l); 
		customerDTO3.setEmail("seema@gmail.com");
		
		
		System.out.println(customerDTO3.getEmail());
		System.out.println(customerDTO3.getName());
		System.out.println(customerDTO3.getCustomerId());
		
		
	}

}