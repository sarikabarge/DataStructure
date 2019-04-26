/*
 * 
 *  Purpose: To Sort the Elements
 *
 *  @author  sarika barge
 *  @version 1.0
 *  @Date   15-04-2019
 *
 */
package com.bridgeit.algorithmprogram;

import com.Utilpack.Utility;

public class SortingProgram {
 
	    static long startTime,endTime,elapseTime;
	public static void main(String[] args) {
		System.out.println("Enter 1 for Binary Search Method for String ");

		System.out.println("Enter 2 for Binary Search Method for Integer ");

		System.out.println("Enter 3 for Insertion Sort Method for String ");

		System.out.println("Enter 4 for Insertion Sort Method for Integer ");

		System.out.println("Enter 5 for Bubble  Sort Method for String ");

		System.out.println("Enter 6 for Bubble  Sort Method for Integer ");
			long caseTotal[]=new long[6];
			// User input
			int input = Utility.getInteger();
			
			switch (input) {
			case 1:
				startTime=System.currentTimeMillis();
				Utility.binarySearchStr();
				endTime=System.currentTimeMillis();
				elapseTime=endTime-startTime;
				System.out.println("Elapsetime is : "+elapseTime);
				break;
			case 2:
				startTime=System.currentTimeMillis();
				Utility.binarySearchInt();
				endTime=System.currentTimeMillis();
				elapseTime=endTime-startTime;
				System.out.println("Elapsetime is : "+elapseTime);
				break;
			case 3:
				startTime=System.currentTimeMillis();
				Utility.insertionSortString();
				endTime=System.currentTimeMillis();
				elapseTime=endTime-startTime;
				System.out.println("Elapsetime is : "+elapseTime);
				break;
			case 4:
				startTime=System.currentTimeMillis();
				Utility.insertionSortInt();
				endTime=System.currentTimeMillis();
				elapseTime=endTime-startTime;
				System.out.println("Elapsetime is : "+elapseTime);
				break;
			case 5:
				startTime=System.currentTimeMillis();
				Utility.bubbleSortString();
				endTime=System.currentTimeMillis();
				elapseTime=endTime-startTime;
				System.out.println("Elapsetime is : "+elapseTime);
				break;
			case 6:
				startTime=System.currentTimeMillis();
				Utility.bubbleSortInt();
				endTime=System.currentTimeMillis();
				elapseTime=endTime-startTime;
				System.out.println("Elapsetime is : "+elapseTime);
				break;
			default:
				System.out.println("No result");
       
			}
		
	
	}

}