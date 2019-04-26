/******************************************************************************
 *  Purpose: Read .a List of Numbers from a file and arrange it ascending Order in a
Linked List
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.orderedlist;
import com.bridgeit.datastructure.unorderedlist.LinkedList;
import java.io.IOException;
import com.Utilpack.Utility;
public class OrderedList{

     public static void main(String[] args) throws IOException {
    			// TODO Auto-generated method stub
    			final String path = "/home/user/Downloads/JavaProgram/src/fileint.txt";
    			LinkedList<Integer> linkedlist=new LinkedList< >();
    			int number1[]=Utility.readFileInteger(path);
    		Utility.printBubblesortArray(number1);
    			for(int i=0;i<number1.length;i++)
    			{
    				linkedlist.add(number1[i]);
    			}
    			// calling method to display the elements in the array
    			linkedlist.display();
    			System.out.println("Enter a number you want to search");
    			int find=Utility.getInteger();
    			// Searching the element
    					if (linkedlist.search(find)) 
    					{
    						System.out.println("number is found in the file");
    						System.out.println("Removing the number from the file");
    						// delete the element
    						linkedlist.delete(find);
    			            // Printing the numbers on screen
    						linkedlist.display();
    					}
    					else
    					{
    						System.out.println("Number is not found in the file");
    						System.out.println("Adding the number from the file");
    						linkedlist.add(find);
    						linkedlist.display();
    						
    					}
    	}
}
