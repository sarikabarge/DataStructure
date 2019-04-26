/*
 * Purpose: Print value of x in quadratic Expression by giving a,b,c values    
 *           
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   11-04-2019
 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the value a,b and c");
     int a=Utility.getInteger();
     int b=Utility.getInteger();
     int c=Utility.getInteger();
     
    Utility.quadratic(a,b,c);
    	 
	}

}
