package com.bridgeit.algorithmprogram;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.Utilpack.Utility;

public class BinaryWordList {

	public static void main(String[] args) throws IOException {
		String[] arr = new String[100];
		// read the elements from the file
		BufferedReader file = new BufferedReader(new FileReader("/home/user/Downloads/JavaProgram/first.txt"));
		String str = "";
		StringBuffer sb = new StringBuffer();
		int i;
		// To store the elements in string buffer class
		while ((i = file.read()) != -1) {
			char ch = (char) i;
			str = Character.toString(ch);
			sb = sb.append(str);
		}
		System.out.println("Elements in text file :");
		System.out.println("");
		System.out.println(sb);

		String str1 = sb.toString();
		arr = str1.split(" ");
		Arrays.sort(arr);
		System.out.println("Enter the string to search :");
		String input = Utility.getStringName();

		int result = Utility.binarySearchMethodString(arr, input);

		if (result == -1) {
			System.out.println("Element not found");

		} else {
			System.out.println(input + " is found in the file ");
		}
		file.close();
	}
}