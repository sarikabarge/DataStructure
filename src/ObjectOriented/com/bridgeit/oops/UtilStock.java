package com.bridgeit.oops;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UtilStock 
{
	public String getRepot(File file) throws IOException
	{
		Scanner scanner=new Scanner(file);
		String name = null;
		int number = 0;
		double price = 0,price1=0;
		
		ArrayList<Stock> stock=new ArrayList<Stock>();
		while(scanner.hasNext())
		{
			 name=scanner.next();
			 number=scanner.nextInt();
			
			 price=scanner.nextDouble();
			 price1=price1+price;
			 System.out.println(" Stock Name :"+name);
				System.out.println(" Number of Share :"+number);
				System.out.println(" Price :"+price);
			
		}
		
		System.out.println(" total Price:: "+price1);
		return name;
	
		
	}
}
