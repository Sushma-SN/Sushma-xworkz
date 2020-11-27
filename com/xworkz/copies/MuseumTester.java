package com.xworkz.copies;

import com.xworkz.copies.constructor.Museum;

public class MuseumTester {
	public static void main(String[] args) {
		//create an instance/object
		Museum museum = new Museum("NATIONAL MUSEUM");
		museum.place="INDAIN MUSESUM";
		Museum museum1 = new Museum("SALARJUNG MUSEUM");
		System.out.println(museum1.place); 
		Museum museum2 = new Museum("GULBARGA SCIENCE CENTRE");
		System.out.println(museum2.place);
		Museum museum3 = new Museum("ZOOLOGY MUSEUM");
		System.out.println(museum3.place);
		
	}


}
