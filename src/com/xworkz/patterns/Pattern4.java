package com.xworkz.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int num = 4;
		for (int i = num; i >= 0; i--) {
			for (int j = num; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

