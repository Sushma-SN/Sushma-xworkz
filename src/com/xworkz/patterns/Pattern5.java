package com.xworkz.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int num = 2;
		for (int i = num; i >= -num; i--) {
			for (int j = num; j >= Math.abs(i); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
} 