/*
 * Purpose: Printing elapsed time on console   
 *           
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   11-04-2019
 *

 */
package com.bridgeit.functionalprog;

import com.Utilpack.Utility;

public class StopWatch {
	static int start;
	static int stop;
	public static long start()
	{
		start=(int) System.currentTimeMillis();
		return start;
		
	}
	
	public static long stop() {
		stop=(int) System.currentTimeMillis();
		return stop;
		
	}
	public static void elasped() {
		int elapse=stop-start;
		System.out.println(elapse);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the choice 1\n ");
    int ch1=Utility.getInteger();
    StopWatch s11= new StopWatch();
    if(ch1==1)
    {	
    	 s11.start();
    	 System.out.println("Enter the choice 2 to stop");
    	  ch1=Utility.getInteger();
    	 if(ch1==2)
     	{
     		s11.stop();
  
     	}
    	 s11.elasped();
    }
	}

}
