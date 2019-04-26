/******************************************************************************
 *  Purpose: find the Prime anagram two dimensional
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.primenumber;

import com.Utilpack.Utility;

public class PrimeAnagram2Dimensional 
{
	public static void main(String[] args) 
	{
		int i;
		String compare1=" ";
		String compare2=" ";
		String adding=" ";	
		//Storing prime numbers in  array
		int arr[]=Utility.primeNumber();
		// Creating String array by passing length of the 
		String arr3[][] = new String[arr.length][arr.length];
		String[] storing=new String[arr.length];		
		StringBuffer sb=new StringBuffer(arr.length);				
		for(i=0;i<arr.length;i++)
		{
			
			adding=sb.append(arr[i]+" ").toString();	
		}
		//adding element by element
		
		storing=adding.split(" ");		
		System.out.println("Prime Anagrams are till 1000");
		System.out.println(" ");
			for(i=0;i<storing.length;i++)
			{
				for(int j=i+1;j<storing.length;j++)
				{
					// toString method is used for converting to String type
					compare1=storing[i].toString();
					compare2=storing[j].toString();
					//comparing and giving output here
					boolean status=Utility.isAnagram(compare1, compare2);

				if (status)
				{					
					arr3[i][j] = storing[i] + "  " + storing[j];
					System.out.println( arr3[i][j]);
				}

			}
		}
	}
}

	
	

