/*
 * Purpose: Print the number which are present in between numbers
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   13-04-2019
 *
 
 */
package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println("Enter the first number of range::");
		int num1=Utility.getInteger();
		
		System.out.println("Enter the last number of range::");
		int num2=Utility.getInteger();
		
		Utility.isPrime(num1,num2);
		
		}
	}


