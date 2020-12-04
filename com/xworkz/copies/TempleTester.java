package com.xworkz.copies;
import com.xworkz.copies.init.Temple;
public class TempleTester {

	public static void main(String[] args) {
		
		//class is custom/non-primitive data type
		
		Temple temple;
		temple=new Temple("Sai-Baba","Gulbarga",6.00f,"puliyogare",9.00f);
		//debug
		String name=temple.getName();
		String location=temple.getLocation();
		//float startTime=temple.getOpenTime();
		//float closing=temple.getCloseTime();
		String prasad=temple.getPrasada();
		
		System.out.println(name);
		System.out.println(location);
		//System.out.println(startTime);
		//System.out.println(closing);
		System.out.println(prasad);
		temple.setPrasada("laadu");
		prasad=temple.getPrasada();
		System.out.println("updated prasada:"+prasad);
	}

}