package com.bridgeit.datastructure.stack;
public class Stack<T> {

	class Node <T> 
	{
		Object data;
		Node next;
	}
	Node top=null;
	public void push(T data)
	{
		Node node=new Node();
		node.data=data;
		node.next=top;
		top=node;
	}
	public T pop()
	{
		Node node=top;
		top=top.next;
		return (T) node.data;
		
	}
	public boolean IsEmpty()
	{
		
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	public T peek()
	{
		Node node=top;
		if(IsEmpty())
		{
			return null;
		}
		else
		{
			return (T) node.data;
		}
	}
	
	
	//print stack
		 public void display()
		 {
			 Node node = top;
			 while(node.next!=null)
			 {
				 System.out.print(node.data+" ");
					 node = node.next;
				 
			 }
		 }
}
