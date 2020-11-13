package com.xworkz.online;

public class Bus {

		private static String[] booking = { "Gulbagra","Bangalore","Mysore","dharwad"};

		public static void search(String place) {
			System.out.println("search kareyuvudu");
			System.out.println("Total bookings available" + booking.length);
			System.out.println("arg1 :" + place);
			boolean bookingFound = false;
			for (int count = 0; count < booking.length; count++) {
				//System.out.println("booking at position " + bookings[count]);
				String bookings = booking[count];
				if (booking.equals(place)) {
					// System.out.println("booking is found");
					bookingFound = true;
					break;
				} else {
					// System.out.println("booking is not found");
					bookingFound = false;
				}

			}

			if (bookingFound) {
				System.out.println("booking is found ");
			} else {
				System.out.println("booking is not found");
			}
			System.out.println("search nirgamana");

		}

		public static int totalBookings() {
			return booking.length;
		}

	}