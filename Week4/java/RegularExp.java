package com.bridgeit.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
			//creating the pattern for search
		
			Pattern pattern = Pattern.compile("SarikaSayluBarge");
			
			//search the sarika from above pattern
			
			Matcher match = pattern.matcher("Sarika");
			
			//find out the position from where to where string is found
			
			while(match.find())
			{
				System.out.println("Find position from"+match.start()+" To "+(match.end()-1));
			}
	}
}