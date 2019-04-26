/*Purpose: To Converting decimal to binary  
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   14-04-2019
 */

package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class ToBinary{
	public static void main(String[] args) {

		
			System.out.println("Enter a number");
			// Taking input from user
			int number = Utility.getInteger();
			// Converting to binary by using toBinary method present in utility package
			Utility.toBinary(number);
		
		
	}
	
}
