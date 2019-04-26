/*
 * *  Purpose: Checking that sum  given 3 numbers is equal to 0 or not  
 *           
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   11-04-2019
 */
package com.bridgeit.functionalprog;
import com.Utilpack.Utility;

public class SumofInteger {
public static void main(String[] args) {
	
	System.out.println("Enter the size of array:");
	int n1=Utility.getInteger();
		boolean flag = true;
	int arr[]=new int[n1];
	n1=arr.length;
	System.out.println("enter elements:-");
	for(int i=0;i<n1;i++)
	{
	    arr[i]=Utility.getInteger();	
	}
	
	if(flag==false)
	{
		System.out.println("no result");
	}
     Utility.triplets(arr,n1);
		

}


}
