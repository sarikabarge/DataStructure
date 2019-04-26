/******************************************************************************
 *  Purpose: Create a Unordered Linked List.
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.unorderedlist;

import java.io.IOException;
import com.Utilpack.Utility;
import com.bridgeit.datastructure.unorderedlist.LinkedList;
public class Unordered {

	public static void main(String[] args) throws IOException {
		
		final String path = "/home/user/Downloads/JavaProgram/src/file.txt";
		// creating object for linked list to store the data
		LinkedList<String> linkedlist=new LinkedList<String>();
		String word[]=Utility.fileReadString(path);
		
		for(int i=0;i<word.length;i++)
		{
			linkedlist.add(word[i]);
		}
		// calling method to display the elements in the array
		linkedlist.display();
		System.out.println("Enter a word you want to search");
		String find=Utility.getStringName();
		// Searching the element
				if (linkedlist.search(find)) 
				{
					System.out.println("Word is found in the file");
					System.out.println("Removing the word from the file");
					// delete the element
					linkedlist.delete(find);
				
					// Printing the numbers on screen
					linkedlist.display();
					linkedlist.writeOnFile();
				}
				else
				{
					System.out.println("Word is not found in the file");
					System.out.println("Adding the word from the file");
					linkedlist.add(find);
					linkedlist.display();
					linkedlist.writeOnFile();
				}
	}
}
