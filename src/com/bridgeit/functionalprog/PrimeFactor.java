/*
 * Purpose: Print the prime factors for the given number  
 *           
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   11-04-2019
 *

 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class PrimeFactor {

	public static void main(String[] args) { 

        // command-line argument
        int n = Integer.parseInt(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");

       Utility.factorPrime(n);

       /* // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
        */
    }
}
