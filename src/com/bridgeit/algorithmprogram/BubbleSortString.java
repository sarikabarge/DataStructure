package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class BubbleSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		   System.out.println("Enter the array size::");
			int size=Utility.getInteger();
			
			String array[]=new String[size];
			int n=array.length;
			System.out.println("Enter the array");
			for(int i=0; i<n; i++)
		       {
		           array[i] = Utility.getStringName();
		       }
	     
	     
	     Utility.printBubblesortArrayString(array);
	     
	     System.out.println("sorting order::");
	     for(int i=0;i<n;i++)
	   	{
	   	  
	   		System.out.println(array[i]);
	   		
	   	}
	   	System.out.println(" ");
	   	
	   	
	}

}
