/*
 * Purpose: To Sort the Elements
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   15-04-2019

 */
package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the array size::");
		int size=Utility.getInteger();
		
		String arr[]=new String[size];
		int n=arr.length;
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++)
	       {
	           arr[i] = Utility.getStringName();
	       }
		Utility.printArrayString(arr,n);
	  System.out.println("sorting::");
		  for(int i=0;i<n;i++)
			{
			  
				System.out.println(arr[i]);
				
			}
			System.out.println(" ");
			
			
			//System.out.println(re);
		  }
	 

}
