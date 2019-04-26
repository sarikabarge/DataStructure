/*
 * Purpose: Print the output distance 
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   12-04-2019

 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		
		System.out.println(Utility.distance(x,y));
	}

}
