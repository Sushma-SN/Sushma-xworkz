package com.xworkz.online;

public class BusTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jvm kareyuvudu main");

		System.out.println("Total numbers to search" +Bus.totalBookings());
		Bus.search("Mysore");

		System.out.println("main nirgamana");
	}
}
