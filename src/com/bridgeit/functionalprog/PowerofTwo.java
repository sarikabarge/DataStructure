/*
 * Purpose: Print the power of 2 values based on command line argument
 * 
 * @author sarika barge
 * @version 1.0
 * @Date 09-04-2019

 */
package com.bridgeit.functionalprog;
import com.Utilpack.Utility;

public class PowerofTwo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter power of 2 less than 32");
    int pow=Utility.getInteger();
    while(pow>31)
    {
    	System.out.println("Invalid input,please enter less than 32");
       pow=Utility.getInteger();
    }
    long val= Utility.powerOfTwo(pow);
    System.out.println(val+"");
	}
	
	

}
