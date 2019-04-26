/*
 *  Purpose: Prints given number is anagram or not  
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   12-04-2019
 */
package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string 1");
		
		String s2="";
		String s1="";
		s1=Utility.getStringName();
		
	
		while(s1.contains(" "))
		{
			System.out.println("space in First String");
			s1=Utility.getStringName();
		}
		System.out.println("Enter string 2");
		s2=Utility.getStringName();
		while(s2.contains(" "))
		{
			System.out.println("space in Second String");
			s2=Utility.getStringName();
		}
		

		if(Utility.isAnagram(s1,s2))
	      {
	    	  System.out.println("Two string are anangram ");
	    	  
	      }
	      else
	      {
	    	  System.out.println("Two strings are not anagram");
	      }
	 }

}
