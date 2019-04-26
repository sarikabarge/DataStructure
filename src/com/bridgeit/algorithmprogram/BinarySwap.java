package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class BinarySwap {
    public static void main(String[] args){ 
		String result= Utility.getBinary();
		String first = "";
		String second = "";
		String last = "";
		for(int i = 0 ; i < 4 ;i++) 
		{
			first = first + result.charAt(i);
		}
		System.out.println("1st nibble: "+first);
		
		for(int i = 4 ; i <8 ; i++) 
		{
			second = second + result.charAt(i);
		}
		System.out.println("2nd nibble: "+second);
		
		last = second+first;
		System.out.println("Swapped Nibble: "+last);
		int swappedDecimal = Integer.parseInt(last,2);
		System.out.println("Binary to decimal: "+swappedDecimal);
	
}

}