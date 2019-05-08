package com.bridgeit.java;

public class Reflection {
	
	private String string;

	public Reflection() {
		string = "Sarika";
	}
	
	//Creation method with no arguments
	
	public void method1()
	{
		System.out.println("method 1"+string);
	}
	
	//creating method with argument
	
	public void method2(int n)
	{
		System.out.println("method 2"+ string +"  "+n );
	}
	
	//creating private method
	
	@SuppressWarnings("unused")
	private void method3()
	{
		System.out.println("In private method");
	}
	
	
	

}