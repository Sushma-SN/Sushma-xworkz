package com.xworkz.online;

public class HotelMenu {
		// TODO Auto-generated method stub
		private static String[] items = { "Gobi Manchurian", "Hara bara kabab", "French fries", "Paneer Manchurian", "Spring roll", "Kaju masala", "Palak paneer",
				"Veg kofta", "Dal fry", "Roti", "Butter naan ", "Kulcha", "Veg palav",
				"Veg fried rice", "Masala rice", "Curd rice"};

		public static void search(String hotel) {
			System.out.println("invoked search");
			System.out.println("Total items available" + items.length);
			System.out.println("arg1 :" + hotel);
			boolean itemFound = false;
			for (int count = 0; count < items.length; count++) {
				//System.out.println("item at position " + items[count]);
				String item = items[count];
				if (item.equals(hotel)) {
					// System.out.println("item is found");
					itemFound = true;
					break;
				} else {
					// System.out.println("item is not found");
					itemFound = false;
				}

			}

			if (itemFound) {
				System.out.println("item is found ");
			} else {
				System.out.println("item is not found");
			}
			System.out.println("search nirgamana");

		}

		public static int totalItems() {
			return items.length;
		}
}	