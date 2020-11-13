package com.xworkz.online;

public class HotelMenuTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm invoked main");

		System.out.println("Total numbers to search" +HotelMenu.totalItems());
		HotelMenu.search("Curd rice");

		System.out.println("exit main");
	}
}
