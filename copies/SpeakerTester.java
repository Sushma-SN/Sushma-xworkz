package com.xworkz.copies;
import com.xworkz.copies.frame.Speaker;

	public class SpeakerTester {
		public static void main(String[] args) {
			tester();
		}
		public static void tester() {
			Speaker speaker=new Speaker();
			System.out.println("Details of Speaker :");
			System.out.println(speaker.brand);
			System.out.println(speaker.color);
			System.out.println(speaker.price); 
		}
	}
