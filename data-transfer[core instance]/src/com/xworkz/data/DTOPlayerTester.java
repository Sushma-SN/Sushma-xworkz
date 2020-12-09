package com.xworkz.data;

import java.util.Arrays;

import com.xworkz.data.dto.PlayerDTO;

public class DTOPlayerTester {

	public static void main(String[] args) {
		
		PlayerDTO playerDTO=new PlayerDTO();
		playerDTO.setName("Rohit Sharma");
		playerDTO.setCountry("India");
		playerDTO.setSports(new String[] {"Cricket"});
		playerDTO.setAwards(new String[] {"Rajiv Gandhi Khel Ratna Award","Padma Shri Award"});
		
		String no=playerDTO.getCountry();
		{
			System.out.println(no);
			System.out.println("country no is not there");
		}
		
		System.out.println(Arrays.toString(playerDTO.getAwards()));
		System.out.println(Arrays.toString(playerDTO.getSports()));
		System.out.println(playerDTO.getName());
		
		PlayerDTO playerDTO2=new PlayerDTO(); 
		playerDTO2.setName("Shri Deepak");
		playerDTO2.setCountry("India");
		playerDTO2.setSports(new String[] {"Kabaddi"}); 
		playerDTO2.setAwards(new String[] {"Arjuna Award","Padma Shri Award"});
		
		
		System.out.println(Arrays.toString(playerDTO2.getAwards()));
		System.out.println(Arrays.toString(playerDTO.getSports()));
		System.out.println(playerDTO2.getName());
		
		
		PlayerDTO playerDTO3=new PlayerDTO(); 
		playerDTO3.setName("Sachin Tendulkar");
		playerDTO3.setCountry("India");
		playerDTO3.setSports(new String[] {"Cricket"}); 
		playerDTO3.setAwards(new String[] {"Bharat Ratna Award","Rajiv Gandhi Khel Ratna Award"});
		
		
		System.out.println(Arrays.toString(playerDTO3.getAwards()));
		System.out.println(Arrays.toString(playerDTO.getSports()));
		System.out.println(playerDTO3.getName());
		
		
		PlayerDTO playerDTO4=new PlayerDTO(); 
		playerDTO4.setName("Manika Batra");
		playerDTO4.setCountry("India");
		playerDTO4.setSports(new String[] {"Table Tennis"}); 
		playerDTO4.setAwards(new String[] {"Rajiv Gandhi Khel Ratna Award","Padma Bhushan Award"});
		
		
		System.out.println(Arrays.toString(playerDTO4.getAwards()));
		System.out.println(Arrays.toString(playerDTO.getSports()));
		System.out.println(playerDTO4.getName());
		
		
		PlayerDTO playerDTO5=new PlayerDTO(); 
		playerDTO5.setName("Prashanti Singh");
		playerDTO5.setCountry("India");
		playerDTO5.setSports(new String[] {"Basket Ball"}); 
		playerDTO5.setAwards(new String[] {"Padma Shri Award", "Padma Bhushan Award"});
		
		
		System.out.println(Arrays.toString(playerDTO5.getAwards()));
		System.out.println(Arrays.toString(playerDTO.getSports()));
		System.out.println(playerDTO5.getName());
	}
}
