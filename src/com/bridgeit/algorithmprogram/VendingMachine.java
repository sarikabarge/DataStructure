/*
 * Purpose: To count the notes by VenderMachine by taking input amount from user. 
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   13-04-2019

 */
package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class VendingMachine {
	public static void main(String[] args)

	{
		try {
			System.out.println("enter the amount to withdraw");
			int amount = Utility.getnumber();
			Utility.vendingMachine(amount);// calling method to print number of notes
		} catch (Exception e) {
			System.out.println("Enter only number");
			
		}

	}
}
