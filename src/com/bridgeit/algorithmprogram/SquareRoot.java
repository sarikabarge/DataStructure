/*
 * Purpose: SquareRoot of given number
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   13-04-2019
 */
package com.bridgeit.algorithmprogram;
import java.util.InputMismatchException;

import com.Utilpack.Utility;


public class SquareRoot {
	public static void main(String[] args) {
		double c = 0;
		System.out.println("Enter the value");
		try {
			// User input
		c = Utility.getdouble();
			System.out.println("squaroot of " + c + "  is  " + Utility.squaroot(c));
		}
		// Catch block for catch the exception
		catch (InputMismatchException e) {
			System.out.println(" Enter valid details ");
		}
		Utility.squaroot(c);
	}

	

}
