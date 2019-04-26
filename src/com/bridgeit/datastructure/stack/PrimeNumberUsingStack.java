/******************************************************************************
 *  Purpose: find the Prime number and anagram using stack
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.stack;

import com.Utilpack.Utility;
import com.bridgeit.datastructure.stack.Stack;

public class PrimeNumberUsingStack
	{
		public static void main(String[] args)
		{
			Stack<Integer>stack=new Stack<Integer>();
			int res[]=Utility.primeAnagrams(1000);
			for(int i=res.length-1;i>=0;i--)
				stack.push(res[i]);
				stack.display();
	}
	}
