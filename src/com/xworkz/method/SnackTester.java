package com.xworkz.method;

import java.util.Iterator;

import com.xworkz.method.theater.MovieHub;

public class SnackTester { 

	public static void main(String[] args) {
		
		String[] movieNames = {"Sultan","KGF","BajiraoMastani"};
		
		MovieHub movieHub=new MovieHub("PVR", 3, movieNames);
		double price=movieHub.buySnacks("Chips", 3, true, null);
		System.out.println("cost of snacks"+price);
		String[] snacks=movieHub.getSnacksList();
		for(int s=0;s<snacks.length;s++)
		{
			System.out.println(snacks[s]);
		}
		
	}

}