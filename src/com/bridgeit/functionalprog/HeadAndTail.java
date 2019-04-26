/*
 * Purpose: Print the output as how many times heads and tails and its percentage 
 *
 *  @author  sarika barge
 *  @version 1.0
 *  @Date   12-04-2019
 *

 */
package com.bridgeit.functionalprog;
import java.util.Random;
import com.Utilpack.Utility;

public class HeadAndTail {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		int num=Utility.getInteger();
		Utility.coin(num);
	}

}
