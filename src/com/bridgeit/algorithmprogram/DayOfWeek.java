
/*
 *  Purpose: Print the output as week  by taking input as date 
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   12-04-2019
 *

 */
package com.bridgeit.algorithmprogram;
import com.Utilpack.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int d=Integer.parseInt(args[0]);
    int m=Integer.parseInt(args[1]);
    int y=Integer.parseInt(args[2]);
    String arr[]= {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
    int week=Utility.dayOfWeek(m,d,y);
    System.out.println("day of the week  ::"+week);
    for(int i=0;i<arr.length;i++)
    {
    	if(week==i)
    	{
    		System.out.println(arr[i]);
    	}
    }
    /*switch (week) {
	case 0:
		System.out.println("Monday");
		break;
	case 1:
		System.out.println("Tuesday");
		break;
	case 2:
		System.out.println("wednesday");
		break;
	case 3:
		System.out.println("Thursday");
		break;
	case 4:
		System.out.println("Friday");
		break;
	case 5:
		System.out.println(",");
		break;
	case 6:
		System.out.println("Sunday");
		break;
	default:
		System.err.println("Enter correct details");
		break;
	}
	*/

	}

}
