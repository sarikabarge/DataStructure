/*
 * Purpose: Print the output as given year is leap year or not   
 *           
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   09-04-2019
 *

 */
package com.bridgeit.functionalprog;
import com.Utilpack.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print("Enter the year : ");
     int year=Utility.getInteger();
     while(999>year&&year<9999)
     {
    	 if(year<0)
    	 {
    		 System.out.println("please enter proper year");
    	 }
    	 else
    	 {
    		 System.out.println("Enter 4 digit only");
    	 }
    	 System.out.print("Enter the year : ");
    	 year=Utility.getInteger();
     }
     if(Utility.leapyear(year))
     {
    	 System.out.println("It is a leap year");
     }
     else
     {
    	 System.out.println("It is not leap year");
     }
     
     
	}

}
