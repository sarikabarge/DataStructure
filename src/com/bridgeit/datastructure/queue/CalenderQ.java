package com.bridgeit.datastructure.queue;
import com.Utilpack.Utility;

/******************************************************************************
 *  Purpose: Calendar Details
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

public class CalenderQ {

	public static void main(String[] args) {
		//Object is created for storing 
		Queue qlist = new Queue(31);

		String[] months = { "", "January", "February", "March", "April", "May", " June", "July", "August", "September",
				"October", "November", "December" };
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//Converting String to integer
		int month = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
        //Checking give year is leap year or not 
		if (month == 2 && Utility.leapyear(year)) {
			date[month] = 29;
		}
		// Using inbuilt method for week decision
		int day = Utility.dayOfWeek(month, 1, year);
		int arr[][] = new int[6][7];
		int x = 1;

		for (int i = 0; i < 6; i++) {
			for (int j = day; j < 7; j++) {
				if (x <= date[month]) {
					arr[i][j] = x;
					x++;

				}
			}
			day = 0;
		}
		System.out.println("  " + months[month] + " " + d + " " + year);
		//Printing weeks on console
		System.err.println("  Su  Mon Tue Wed Thu Fri Sat");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] != 0) {
					//Using printf statement for alignment on console
					System.out.printf("%4d", arr[i][j]);

					qlist.enQueue(arr[i][j]);
				} else
					System.out.printf("    ");
			}
			System.out.println();
		}

	}

}
