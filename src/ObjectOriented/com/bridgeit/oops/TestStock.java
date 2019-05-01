package com.bridgeit.oops;


import java.io.File;
import java.io.IOException;

public class TestStock {
	
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\Users\\ADMIN\\eclipse-workspace\\Oops\\src\\stock.txt");
		UtilStock stock=new UtilStock();
		stock.getRepot(file);
	}

}
