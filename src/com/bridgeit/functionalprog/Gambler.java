/*Purpose: Print the output as how many times he played a match and win and loss percentage 
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   09-04-2019
*/
package com.bridgeit.functionalprog;

public class Gambler {
	
	public static void main(String[] args) {
        int stake  = Integer.parseInt(args[0]);    
        int goal   = Integer.parseInt(args[1]);   
        int trials = Integer.parseInt(args[2]);  

        int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            int cash = stake;
            while (cash > 0 && cash < goal && (cash!=0)){
            	bets++;
                if (Math.random() < 0.5) 
			cash=cash+stake;     // win $1
                else                     
			cash=cash-stake;     // lose $1
            }
            if (cash == goal) wins++;  
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
}
