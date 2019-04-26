/******************************************************************************
 *  Purpose: find the Prime numbers
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.primenumber;

import com.Utilpack.Utility;

public class PrimeNumber2D {
	public static void main(String[] args) {
		int[] array = Utility.primeNumber();           
		int[][] array1 = new int[10][167];

		for (int i = 0; i < 10; i++) {
			System.out.println(" ");
			System.out.println(i * 100 + " To " + (i + 1) * 100);

			for (int j = 0; j < 167; j++) {
				if (array[j] > ((i) * 100) && array[j] < ((i + 1) * 100)) 
				{
					array1[i][j] = array[j];
					System.out.print(array1[i][j] + " ");
				}
			}
			System.out.println(" ");
		} 

	}
}