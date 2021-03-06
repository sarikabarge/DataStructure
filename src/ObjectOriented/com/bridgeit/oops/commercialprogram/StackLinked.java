package com.bridgeit.oops.commercialprogram;



public class StackLinked <T>
{
	Node head;
	public class Node
	{
		T data;
		public Node next;
	}
    LinkedList list=new LinkedList();
        
    public void push(T element)
    {
    	list.insertAtLast(element);
    }
    public T pop()
    {
    	return (T) list.deleteAtlast();
    }
    public void peak()
    {
    	list.getlast();
    }
    public boolean isEmpty()
    {
    	return list.isEmpty();
    }
	public void displayList()
	{
		Node temp;
			temp =head;
			while(temp!= null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
	}
    public T print()
	{
		Node temp=head;		
		while(temp!=null)
		{
			System.out.println(temp.data);		
			temp=temp.next;	
		}
		return null;
	}
 
}
