/*
 * *  Purpose: To Sort the Elements
 *
 *  @author  sarika barge
 *  @version 1.0
 *  @Date   15-04-2019
 *

 */
package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class MergeSort {
	public static void main(String[] args) {
		System.out.println("Enter size of array ");
		
			// Taking size of an array
			int size = Utility.getnumber();
			// Passing size to array
			String[] arr = new String[size];
			System.out.println("Enter " + size + " numbers");

			for (int i = 0; i < size ; i++) {
				// Adding values to array
				arr[i] = Utility.getStringName();
			}

			Utility.divide(arr, 0, arr.length-1);
			System.out.println("Sorted elements are ");
			// Printing array elements on console
			Utility.printArrayString(arr);
		
	}
}
