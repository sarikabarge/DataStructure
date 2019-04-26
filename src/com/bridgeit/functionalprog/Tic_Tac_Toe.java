/*
 * Purpose: To find tic tac toe game   
 *           
 *  @author  sarika barge
 *  @version 1.0
 *  @Date   09-04-2019
 *

 */
package com.bridgeit.functionalprog;

import java.util.Random;

import com.Utilpack.Utility;

public class Tic_Tac_Toe {

	static String arr[][]= new String[3][3];
	static int row;
	static int col;
	public static void board()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]="__ ";
			}
		}
	}
	
	public static void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print
				(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static String playgame()
	{
		String draw="game is over";
		Random rd= new Random();
		for(int i=0;i<5;i++)
			
		{
			System.out.println("its comp turn");
		
		
		int count=0;
		while(count==0)
		{
			
			
			row=rd.nextInt(3);
			col=rd.nextInt(3);
			System.out.println(row+"  "+col);
			
			if(arr[row][col] == "__ ")
			{
				count++;
				arr[row][col]="x";
			}
			if((arr[0][0]=="x" && arr[0][1]=="x" && arr[0][2]=="x") 
					|| (arr[1][0]=="x" && arr[1][1]=="x" && arr[1][2]=="x")
					|| (arr[2][0]=="x" && arr[2][1]=="x" && arr[2][2]=="x")
					|| (arr[0][0]=="x" && arr[1][0]=="x" && arr[2][0]=="x")
					|| (arr[0][1]=="x" && arr[1][1]=="x" && arr[2][1]=="x")
					|| (arr[0][2]=="x" && arr[1][2]=="x" && arr[2][2]=="x")
					|| (arr[0][0]=="x" && arr[1][1]=="x" && arr[2][2]=="x")
					|| (arr[0][2]=="x" && arr[1][1]=="x" && arr[2][0]=="x"))
			{
				display();
				System.out.println("comp wins");
			}
			display();
			System.out.println("**********************");
			
			count=0;
					
		while(count==0)
		{
			System.out.println("ENTER ROW");
			row=Utility.getInteger();
			col=Utility.getInteger();
			if(arr[row][col] == "__ ")
			{
				count++;
				arr[row][col]="o";
			}
			

				if(arr[0][0]=="o" && arr[0][1]=="o" && arr[0][2]=="o"
					|| arr[1][0]=="o" && arr[1][1]=="o" && arr[1][2]=="o"
					|| arr[2][0]=="o" && arr[2][1]=="o" && arr[2][2]=="o"
					|| arr[0][0]=="o" && arr[1][0]=="o" && arr[2][0]=="o"
					|| arr[0][1]=="o" && arr[1][1]=="o" && arr[2][1]=="o"
					|| arr[0][2]=="o" && arr[1][2]=="o" && arr[2][2]=="o"
					|| arr[0][0]=="o" && arr[1][1]=="o" && arr[2][2]=="o"
					|| arr[0][2]=="o" && arr[1][1]=="o" && arr[2][0]=="o")
				{
				display();
				System.out.println("user wins");
				}
		
			display();
			System.out.println("**********************");
		  }
		}
		
		
		}
		return draw;
	}
	
	
	public static void main(String[] args) 
	{
		
			System.out.println("start the game");
			System.out.println("board is ready");
			board();
			display();
			System.out.print(playgame());
			
		
	
	}

}