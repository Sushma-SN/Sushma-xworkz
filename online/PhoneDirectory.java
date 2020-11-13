package com.xworkz.online;

public class PhoneDirectory {
	private static long[] numbers = { 984524725l, 783456981l, 975312368l, 983412879l, 908734231l, 987634229l,
			755799233l, 909087653l };

	public static void search(long phone) {
		System.out.println("invoked search");
		System.out.println("Total items available" + numbers.length);
		System.out.println("arg1 :" + phone);
		boolean numberFound = false;
		for (int count = 0; count < numbers.length; count++) {
			// System.out.println("number at position " + numbers[count]);
			long num = numbers[count];
			if (num == phone) {
				// System.out.println("number is found");
				numberFound = true;
				break;
			} else {
				// System.out.println("number is not found");
				numberFound = false;
			}

		}

		if (numberFound) {
			System.out.println("number is found ");
		} else {
			System.out.println("number is not found");
		}
		System.out.println("exit search");

	}

	public static long totalNumbers() {
		return numbers.length;
	}

}
