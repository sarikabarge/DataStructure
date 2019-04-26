package com.bridgeit.functionalprog;
import java.util.Scanner;

public class PermutationRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string input");
		String s=sc.nextLine();
     recursive(0,1,s);
	}

	public static int recursive(int i,int j,String s)
    {
   	 char[] ch=s.toCharArray();
   	 char temp;
   	 temp=ch[i];
   	 ch[i]=ch[j];
   	 return ch[j]=temp;
    }
}
