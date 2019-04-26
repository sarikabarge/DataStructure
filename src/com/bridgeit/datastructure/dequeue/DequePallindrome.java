/******************************************************************************
 *  Purpose: Pailndrome Checker
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/
package com.bridgeit.datastructure.dequeue;

import com.Utilpack.Utility;

public class DequePallindrome {

	static boolean ispallindrom(Dequeue<Character> dq) {
		if (dq.size() % 2 == 0) {
			while (dq.size() != 0) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
					return false;
				}
			}
		} else {
			while (dq.size() == 1) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("enter a string");
		String s1 = Utility.getStringName();
		if(s1.contains(" ")) {
			System.out.print("space");
			System.out.println("\nEnter the String");
			s1=Utility.getStringName();
		}
		
		Dequeue<Character> dq = new Dequeue<>();
		int i = 0;
		while (i < s1.length()) {
			dq.addRear(s1.charAt(i++));
		}
		//System.out.println(dq + " " + dq.size());
		if(ispallindrom(dq))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not pailndrome");
		}
	}
}
