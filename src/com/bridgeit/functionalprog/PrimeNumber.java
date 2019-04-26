package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" The ranges are 0 to 1000");
     System.out.println("Enter the first number::");
	int num1=Utility.getInteger();
	
	System.out.println("Enter the second number"
			+ "::");
	int num2=Utility.getInteger();
	
	Utility.isPrime(num1,num2);
	
	}
     
		
	
}
