/*
 * Purpose: To print two dimensional array 
 *           
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   11-04-2019
 *

 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class TwoDArray {
	public static void main(String[] args) {
	    int row,col;
		System.out.println("Enter the rows");
		row=Utility.getInteger();
		System.out.println("Enter the columns");
		col=Utility.getInteger();
		System.out.println("Enter 1 for Integer 2 for Double 3 for Boolean");
		
		
		Utility.twoDArray(row,col);
		
	}

}
