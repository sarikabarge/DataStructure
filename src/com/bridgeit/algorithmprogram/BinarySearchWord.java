 /* Purpose: To get the result searched string is present in the file or not 
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   15-04-2019
 */
package com.bridgeit.algorithmprogram;
import java.io.File;
import java.util.Arrays;

import com.Utilpack.Utility;

import java.util.*;
public class BinarySearchWord{
		public static void main(String[] args) {
	    File f=new File("/home/user/Downloads/JavaProgram/first.txt");
	    
	    try
		{
	    	Scanner s=new Scanner(f);//to read words from  file
	    String list=s.nextLine();
	    String wordlist[]=list.split(",");
	      Arrays.sort(wordlist);
		System.out.println("Enter the string to be searched");
		String word=Utility.getStringName();
		int hi=wordlist.length-1;
	     if(wordlist.length!=0)
	     {
	    	 int result=Utility.binarySearchWord(wordlist,word,0,hi);
	    	 if(result==-1)
	    	 {
	    		 System.out.println("The word not found");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("The word found at:"+ result + "position");
	    	 }
	    
	    }
	     s.close();
		}catch(Exception e)
		{
			System.out.println("File not found");
		}
		
		
		
		
	}
}
