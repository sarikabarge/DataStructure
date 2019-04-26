/******************************************************************************
 *  Purpose: Pailndrome Checker
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.deque;

import com.Utilpack.Utility;

public class PaindromeChecker {

	public static Dequeue<String> queue=new Dequeue<String>();
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String input = Utility.getStringName();
		if(input.contains(" ")) {
			System.out.print("space");
			System.out.println("\nEnter the String");
			input=Utility.getStringName();
		}
		
		char[] ch = input.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			queue.addRear(Character.toString(ch[i]));
		}
		String reverse = "";

		int length = queue.size();
		for (int i = 0; i < length; i++) {
			reverse = reverse + queue.removeRear();
		}

		if (input.compareTo(reverse) == 0) {
			System.out.println("the string is palindrome");
		} else {
			System.out.println("the string is not a palindrome");
		}
	}
	

}
