/*
 * Purpose: To print defines the effective temperature
 * 
 * @author Sarika barge
 * @version 1.0
 * @Date 11-04-2019
 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double t=Double.parseDouble(args[0]);
    double v=Double.parseDouble(args[1]);
    
    Utility.windchill(t,v);
	
	}
}