/*
 * Purpose: Print the output Coupon numbers  
 *
 *  @author  sarika barge
 *  @version 1.0
 *  @Date   10-04-2019

 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n=Integer.parseInt(args[0]);
		int count=Utility.collect(n);
		System.out.println(count);
		
	}
	
	

}
