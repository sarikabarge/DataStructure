package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class BubbleSortInteger {

   public static void main(String[] args) {

	   System.out.println("Enter the array size::");
		int size=Utility.getInteger();
		
		int arr[]=new int[size];
		int n=arr.length;
		System.out.println("Enter the array");
		for(int i=0; i<n; i++)
	       {
	           arr[i] = Utility.getInteger();
	       }
     
     
     Utility.printBubblesortArray(arr);
     
     System.out.println("sorting order::");
     for(int i=0;i<n;i++)
   	{
   	  
   		System.out.println(arr[i]);
   		
   	}
   	System.out.println(" ");
   	
   	
	}

}
