package com.xworkz.basics.pocket;

public class CreditTester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("JVM invoked main method");
		
		CreditTesterEstimator.expenditure(75);
			
		CreditTesterEstimator.expenditure(57);
		System.out.println("Total Amount:"+CreditTesterEstimator.getTotalAmount());
		
		System.out.println("EXIT :: main");
	}

}
