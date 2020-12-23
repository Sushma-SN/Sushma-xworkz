package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;

import com.xworkz.bakery.browser.FireFox;

public class FireFoxTester {

	public static void main(String[] args) {
		
		Object generic = new FireFox();
		
		Browser browser = new FireFox();
		
		FireFox fireFox = new FireFox();
		
		FireFox fireFoxCasted = (FireFox)generic;
		
		//it is illegal Browser child = new Object();
		
		//instanceOf
		generic = new String("test");
		if(generic instanceof FireFox)
		{
			System.out.println("yes it is firefox");
			FireFox fireFoxCasted1 = (FireFox)generic;
			System.out.println(fireFox.getName());
		}
		else {
			System.out.println("it is not frefox");
		}
	}

}
