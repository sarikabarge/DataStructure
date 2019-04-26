/******************************************************************************
 *  Purpose: find the balanaced parentheses 
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.stack;
public class BalancedParentheses
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("String :(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
		char str[]="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)".toCharArray();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=='(')
			{
				stack.push(str[i]);
			}
			else if(str[i]==')')
			{
				stack.pop();
				
			}
		}
		if(stack.IsEmpty())
		{
			System.out.println("Balanced Parentheses ");
		}
		else
		{
			System.out.println("Unbalanced Parentheses ");
		}
	}

}
