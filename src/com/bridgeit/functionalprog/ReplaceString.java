/*
 * Purpose: Replace the string   
 *           
 *  @author  sarika barge
 *  @version 1.0
 *  @Date   09-04-2019
 *

 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;
public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String string="Hello <<UserName>>,How are you?";
		System.out.println("String"+string);
	    String replace=" ";
		System.out.println("Enter replace string::");
		String str1=Utility.getStringName();
		
		if(str1.length()>3)
		{
			replace=string.replace("<<UserName>>",str1 );
			System.out.println(replace);
		}
		else
		{
			System.out.println("Only enter minimum 3 char");
		  main(args);
			
		}
		
	}

}
