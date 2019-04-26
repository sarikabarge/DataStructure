/*
 * Purpose: Converting the temperatures from celcius to Fahrenheit and vice versa
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   13-04-2019
 */
package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class TemperatureConversion {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       System.out.println("Enter input c or f::");
	      
	       int temp=Utility.getInteger();
	       char t=Utility.getChar();
	      
	       int conver=Utility.temperatureConversion(temp,t);
	       System.out.println("Converted temperature is"+conver);
	       
		}

}
