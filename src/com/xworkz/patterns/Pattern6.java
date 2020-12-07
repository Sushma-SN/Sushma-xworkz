package com.xworkz.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int num = 2;
		for (int i = num; i >= -num; i--) {
			for (int j = 1; j <= Math.abs(i); j++) {
				System.out.print(" ");
			}
			for (int k = num; k >= Math.abs(i); k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

