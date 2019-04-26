/******************************************************************************
 *  Purpose: find the binary search tree
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.Tree;

import com.Utilpack.Utility;

public class BinarySearchTree {
	static int fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter  number: ");
		int num=Utility.getInteger();
		int num1=fact(2*num);
		int num2=fact(num+1)*fact(num);
		
		int value=num1/num2;
		System.out.println(value+" trees can be created using "+num+" nodes");
	}	
}

