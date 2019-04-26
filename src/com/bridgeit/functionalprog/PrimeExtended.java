package com.bridgeit.functionalprog;
import com.Utilpack.Utility;
public class PrimeExtended {


	public static void main(String[] args) {
		      int low=10,high=1000;    
				System.out.println("Eneter choice:"
						+ " \n1.To check prime Palindrome numbers"
						+ "\n2.To check Prime Anagram Numbers\n");
	    		int choice=Utility.getInteger();
		       for(int i=low;i<high;i++)
				{
					int count=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							count++;
						}
					}
					if(count==2)
			    	  {

			    		if(choice==1)
			    		{
			    		    Utility.isPalindrome(i);
			    		}
			    		
			    		else if(choice==2) {
			    			Utility.isanagram(i);
			    		}
			    		else
			    		{
			    			System.out.println("Wrong choice!");
			    			
			    		}
						
			    		
			    		
			    	  }
			      }
		       
		      
		  }
}


