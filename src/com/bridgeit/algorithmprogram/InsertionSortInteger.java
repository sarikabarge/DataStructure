package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class InsertionSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the array size::");
		int size=Utility.getInteger();
		
		int arr[]=new int[size];
		int n=arr.length;
		System.out.println("Enter the array");
		for(int i=0; i<n; i++)
	       {
	           arr[i] = Utility.getInteger();
	       }
		Utility.printArrayInteger(arr,n);
	  System.out.println("sorting::");
		  for(int i=0;i<n;i++)
			{
			  
				System.out.println(arr[i]);
				
			}
			System.out.println(" ");
			
			
			//System.out.println(re);
		  }
	}

