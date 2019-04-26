/*
 * Purpose: Output  monthly payment  
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   13-04-2019
 *

 */
package com.bridgeit.algorithmprogram;
import com.Utilpack.Utility;
public class MonthlyPayment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double p=Double.parseDouble(args[0]);
        double y=Double.parseDouble(args[1]);
        double r=Double.parseDouble(args[2]);
        
 
        System.out.println("Monthly payment is::"+Utility.monthlyPayment(p,y,r));
	}

}
