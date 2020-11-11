package com.xworkz.basics;

public class personalInfo {

	public static void main(String[] args) {
		//data type which is non-primitive--------class, enum, []
		String firstName="Sushma";
		boolean empty=firstName.isEmpty();
		System.out.println(empty);
		
		String lastName="Nimbal";
		
		String fullName=firstName+lastName;
		
		System.out.println(fullName);
		
		String partName=fullName.substring(4);
		System.out.println(partName);
		
		String concatinated=partName.concat("Dev Center");
		System.out.println(partName);
		System.out.println(concatinated);
		
		//==----> two reference are pointing to same value
		if(firstName==lastName)
		{
			System.out.println("first name is pointing to same as last name");
		}
		else {
			System.out.println("first name is not pointing to same as last name");
		}
		int a=7;
		int b=7;
		if(b==a)
		{
			System.out.println("reference point to same memory location");
		}
		else {
			System.out.println("reference point to different memory location");
		}
	}

}
