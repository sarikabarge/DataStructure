package com.bridgeit.algorithmprogram;

import java.util.InputMismatchException;

import com.Utilpack.Utility;

public class MergeSortString {

	public static void main(String[] args) {
		System.out.println("Enter size of array ");
		try {
			// Taking size of an array
			int number = Utility.getInteger();
			// Passing size to array
			String[] arr = new String[number];
			System.out.println("Enter " + number + "elements");

			for (int i = 0; i < number; i++) {
				// Adding values to array
				arr[i] = Utility.getStringName();
			}

			Utility.divide(arr, 0, arr.length - 1);
			System.out.println("Sorted elements are ");
			// Printing array elements on console
			Utility.printArrayString(arr);
		} catch (InputMismatchException e) {
			System.err.println("Please enter number only");
		}
	}
}
