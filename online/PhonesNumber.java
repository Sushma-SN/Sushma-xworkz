package com.xworkz.online;

public class PhonesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm invoked main");

		System.out.println("Total numbers to search:" +PhoneDirectory.totalNumbers());
		PhoneDirectory.search(984524725l);

		System.out.println("exit main");
	}
}
