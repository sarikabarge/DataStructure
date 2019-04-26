
/******************************************************************************************************************
 * purpose:Utility class to define all methods
 * @author sarika barge
 * @version 1.8
 * 
 */
package com.Utilpack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;

public class Utility {

	/*
	 * static scanner class objects to call inbuilt methods
	 */
	public static Scanner scanner = new Scanner(System.in);

	/*
	 * method to get word from string
	 */
	public static String getStringName() {
		return scanner.nextLine();// calling next method to scan word and store it in a variable
		
	}
	
	public static String getString() {
		return scanner.next();// calling next method to scan word and store it in a variable
		
	}

	/*
	 * method to get random value
	 */
	public static void getRandom() {
		Random random = new Random();
	}

	/*
	 * method to get char from user
	 */

	public static char getChar() {
		return scanner.next().charAt(0);
	}

	/*
	 * method to get double from user
	 */

	public static double getDouble() {
		return scanner.nextDouble();

	}

	/// ======================== Anagram program ================================

	/**
	 * @purpose Anagram program
	 * @param first
	 * @param second
	 * @return
	 */
	public static boolean isAnagram(String string1, String string2) {
		int len1 = string1.length();
		int len2 = string2.length();
		char str1[] = string1.toCharArray();
		char str2[] = string2.toCharArray();

		if (len1 != len2)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);

		// Converting strings in to character array
		String s3 = String.valueOf(str1);
		String s4 = String.valueOf(str2);

		for (int i = 0; i < len1; i++)

			if (str1[i] != str2[i])
				return false;

		return true;

	}
	//===to get integer value===/

	public static int getInteger() {
		return scanner.nextInt();
	}

	public static int printPrime(int number) {
		int status = 0;
		int numb = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				status = 1;
				break;
			}
		}
		if (status == 0) {
			return numb = number;
			// System.out.println(number+"is Prime Number");
		}
		return numb;
	}

	// =========================== Palindrome Program========================================//
	
	/**
	 * @purpose To check given number is Palindrome or not
	 * @param number
	 * @return
	 */
	public static void isPalindrome(int number) {
		int temp=number,reminder=0,result = 0;
		
		while(temp!=0)
		{
			reminder = temp%10;
			result = result*10+reminder;
			temp /= 10;
		}
		if(result==number)
		{
			System.out.println(number);
		}
	}

	//=====================================Anagram program=====================================//
	
	public static void isanagram(int number) {
		int temp1=number;
		int temp2=number;
		char [] array1= (""+temp1).toCharArray();
		char [] array2= (""+temp2).toCharArray();
		
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		temp1=Integer.parseInt(new String(array1));
		temp2=Integer.parseInt(new String(array2));
		if(temp1==temp2)
		{
			System.out.println(number);
		}
		
	}
	
	
	/// coupon

	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollect = new boolean[n];
		int count = 0;
		int distinct = 0;

		while (distinct < n) {
			int value = getCoupon(n);
			count++;
			if (!isCollect[value]) {
				distinct++;
				isCollect[value] = true;
			}
		}
		return count;

	}

	/*
	 * Distance
	 * 
	 * @param x
	 * 
	 * @param y
	 * 
	 * @return distance
	 */

	public static double distance(int x, int y) {
		double distance = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));
		return distance;
	}

	// factor prime
	// ======================== Prime factors of nth number=====================================//
	/**
	 * @purpose Prime factors of nth number
	 * @param number
	 * @return
	 */

	public static int factorPrime(int n) {
		// for each potential factor
		for (int factor = 2; factor * factor <= n; factor++) {

			// if factor is a factor of n, repeatedly divide it out
			while (n % factor == 0) {
				System.out.print(factor + " ");
				n = n / factor;
			}
		}
		return n;
	}

	// year

	public static boolean checkYear(int year) {

		if (year % 400 == 0)
			return true;

		if (year % 100 == 0)
			return false;

		if (year % 4 == 0)
			return true;
		return false;
	}

	// ===================== Harmonic value for Nth number==========================================//

	/**
	 * @purpose To get harmonic value
	 * @param n
	 * @return
	 */

	public static float getHarmonic(int n) {
		float harmonic = 1;

		for (int i = 2; i <= n; i++) {
			harmonic = (float) 1 / i + harmonic;
		}
		System.out.println(harmonic);
		return harmonic;

	}

	/**
	 * @purpose head and tail
	 * @param num
	 * @return
	 */
	public static void coin(int num) {
		int head = 0, tail = 0;
		double result;
		for (int i = 0; i < num; i++) {
			result = Math.random();
			if (result <= .5) {
				head++;
			} else
				tail++;
		}
		double percentHeads = head * 100 / num;
		double percentTails = (100 - percentHeads);

		System.out.println("heads percentage is " + percentHeads);
		System.out.println("tails percentage is " + percentTails);

	}

	// ================================================= Power of 2========================//

	/**
	 * @purpose
	 * @param pow
	 * @return
	 */

	public static long powerOfTwo(int pow) {
		long val = 1;
		for (int i = 1; i <= pow; i++) {
			val = val * 2;

		}
		return val;

	}

	/**
	 * To quadratic
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int quadratic(int a, int b, int c) {
		int delta = 0;

		if (delta < 0) {
			System.out.println("roots are temporary");
		} else {
			delta = b * b - 4 * a * c;
			int z = (int) Math.sqrt(delta);
			int r1 = (-b + z) / (2 * a);
			int r2 = (-b - z) / (2 * a);
			System.out.println("root1::" + r1);
			System.out.println("root2::" + r2);

		}
		return delta;
	}

	/**
	 * sum of integer
	 * 
	 * @param arr
	 * @param n
	 */
	public static boolean triplets(int[] arr, int n) {
		boolean flag = true;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						flag = true;
					}

				}
			}
		}

		return false;

	}

	// ====================== TWO Dimensional Array====================================//
	/**
	 * @purpose TWO Dimensional Array
	 * @param row
	 * @param column
	 */

	public static int twoDArray(int row, int col) {

		int ch = Utility.getInteger();
		PrintWriter pw = new PrintWriter(System.out, true);
		switch (ch) {
		case 1:

			int[][] array = new int[row][col];
			System.out.println("Enter" + (row * col) + " array elements");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					array[i][j] = scanner.nextInt();
					// array[i][j]=col;
				}
			}

			System.out.println("Array is");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					pw.print(array[i][j] + " ");
				}
				pw.println(" ");
			}
			break;

		case 2:

			double[][] array1 = new double[row][col];
			System.out.println("Enter" + (row * col) + " array elements");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					array1[i][j] = scanner.nextDouble();
					// array[i][j]=col;
				}
			}

			System.out.println("Array is");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					pw.print(array1[i][j] + " ");
				}
				pw.println(" ");
			}
			break;

		case 3:

			boolean[][] array2 = new boolean[row][col];
			System.out.println("Enter" + (row * col) + " array elements");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.println("Entr boolean");
					array2[i][j] = scanner.nextBoolean();
					// array[i][j]=col;
				}
			}

			System.out.println("Array is");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					pw.print(array2[i][j] + " ");
				}
				pw.println(" ");
			}
			break;

		default:
			System.out.println(" No result");
			break;
		}
		return ch;

	}

	/**
	 * To windChill
	 * 
	 * @param t
	 * @param v
	 * @return
	 */
	public static double windchill(double t, double v) {
		if (t > 50 && v > 120 || v < 3) {
			double W = 35.74 + 0.6215 * t + 0.4275 * t * Math.pow(v, 0.16) - 35.75 * Math.pow(v, 0.16);
			System.out.println(W);
		} else {
			System.out.println("No result");
		}
		return v;
		
	}

	public static String printArray(String arr[], int n) {
		n = arr.length;

		for (int i = 1; i < n; i++) {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {

				{
					arr[j + 1] = arr[j];
					j = j - 1;
				}//====================  Printing Integer Array Elements  ==============================
				arr[j + 1] = key;
			}

		}
		return null;
	}

	// ========================= Bubble sort for integer ===================================//
	

	/**
	 * @purpose Return the values in sorted order for integers by using Bubble sort
	 *          technique
	 * @param value
	 * @return temp
	 */

	public static int printBubblesortArray(int array[]) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}

		}
		return temp;
	}

	public static void bubbleSortInt() {
		System.out.println("Enter the array size::");
		int size = Utility.getInteger();

		int arr[] = new int[size];
		int n = arr.length;
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = Utility.getInteger();
		}

		Utility.printBubblesortArray(arr);

		System.out.println("sorting order::");
		for (int i = 0; i < n; i++) {

			System.out.println(arr[i]);

		}
		System.out.println(" ");

	}

	// ========================= Bubble Sort for String==================================//

	/**
	 * @purpose Return the values in sorted order for String Element by using Bubble
	 *          sort technique
	 * @param arr
	 * @return
	 */

	public static String printBubblesortArrayString(String array[]) {
		int n = array.length;
		String temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}

		}
		return temp;
	}

	public static void bubbleSortString() {
		System.out.println("Enter the array size::");
		int size = Utility.getInteger();

		String array[] = new String[size];
		int n = array.length;
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			array[i] = Utility.getStringName();
		}

		Utility.printBubblesortArrayString(array);
		System.out.println("sorting order::");
		for (int i = 0; i < n; i++) {

			System.out.println(array[i]);

		}
		System.out.println(" ");

	}

	// ========================= Sort Using merge==============================//

	/**
	 * @purpose Return the values in sorted order for integers by using Merge
	 *          sorting technique
	 * @param arr
	 * @param lower
	 * @param mid
	 * @param higher
	 */

	public static void mergeSort(String arr[], int start, int mid, int length) {

		int num1 = mid - start + 1;
		int num2 = length - mid;

		String L[] = new String[num1];
		String R[] = new String[num2];

		for (int i = 0; i < num1; ++i) // left sublist
		{
			L[i] = arr[start + i];
		}
		for (int j = 0; j < num2; ++j) //
		{
			R[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		int start2 = start;

		while (i < num1 && j < num2) {
			if (L[i].compareToIgnoreCase(R[j]) < 0) {
				arr[start2] = L[i];
				i++;
			} else {
				arr[start2] = R[j];
				j++;
			}
			start2++;
		}

		while (i < num1) {
			arr[start2] = L[i];
			i++;
			start2++;
		}

		while (j < num2) {
			arr[start2] = R[j];
			j++;
			start2++;
		}
	}

	// recursion method to divide into two sub parts

	public static void divide(String arr[], int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			divide(arr, start, mid);// dividing from start
			divide(arr, mid + 1, end);// dividing from middle
			mergeSort(arr, start, mid, end);// final mearging
		}

	}

	// ========================= Printing Integer Array Elements ================================//

	/**
	 * @purpose Printing String Array Elements
	 * @param arr
	 */

	// to pass run time values
	public static void insertArray(String arr[]) {

		System.out.println("enter your word  array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Utility.getStringName();
		}
	}

	public static void printArrayString(String arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.println("Sorted array is : " + arr[i]);
		System.out.println();

	}

	/*
	 * monthlypayment method param p,y,r return payment
	 */
	public static double monthlyPayment(double p, double y, double r) {
		double n = 12 * r;
		double r0 = r / (12 * 100);
		double payment = p * r / 1 - Math.pow((1 + r0), -n);
		return payment;
	}

	// ======================= Prime Numbers Program =========================//

	/**
	 * @purpose Prime Numbers Program
	 * @param number
	 * @return
	 */

	public static void isPrime(int num1, int num2) {

		for (int i = num1; i < num2; i++) {
			int j;
			for (j = 2; j <= i; j++) {
				if (i % j == 0)
					break;
			}

			if (i == j)
				System.out.println(i + "");
		}

	}

	// TemperatureConversion
	public static int temperatureConversion(int tem, char t) {
		int con = 0;
		if (t == 'c' || t == 'C') {
			con = (tem * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			con = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");

		}
		return con;

	}

	/*
	 * static int squareroot(double c) { double t=c; double epsilon=1e-15;
	 * 
	 * while(Math.abs(t-c/t>epsilon*t)) { System.out.println(""); } }
	 */

	/**
	 * @purpose gives the out put as week name
	 * @param m0
	 * @param d0
	 * @param y0
	 * @return
	 */

	public static int dayOfWeek(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}

	// ==================== Binary Search for integer ==========================//

	/**
	 * @purpose Binary Search for integer
	 * @param arr
	 * @param findnum
	 * @return
	 */

	public static int binarySearch(int arr[], int start, int end, int findNum) {
		int n = arr.length;
		// int findNum=33;
		start = 0;
		end = n - 1;

		int mid = (start + end) / 2;

		while (start <= end) {

			mid = (start + end) / 2;
			if (arr[mid] == findNum) // search.compareTo(arr[mid)==0
			{
				System.out.println("Found at " + mid);
				break;
			} else if (arr[mid] < findNum) // search.compareTo(arr[mid)>0
			{
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = start + end / 2;
			// System.out.println(mid);
		}
		if (start > end) {
			System.out.println("Element is not found!");
		}
		return mid;

	}

	public static int binarySearchInt() {
		System.out.println("Enter the array size::");
		int size = Utility.getInteger();

		int[] arr = new int[size];
		int n = arr.length;
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = Utility.getInteger();
		}

		System.out.println("Enter find the key:");
		int findNum = Utility.getInteger();
		Utility.binarySearch(arr, 0, n, findNum);
		return findNum;
	}

	// ==================== Binary search for String =============================//

	/**
	 * @purpose Binary search for String
	 * @param arr
	 * @param findnum
	 * @return
	 */

	public static void binarySearchString(String arr[], int start, int end, String findNum) {
		int n = arr.length;
		// int findNum=33;
		start = 0;
		end = n - 1;

		int mid = (start + end) / 2;

		while (start <= end) {

			mid = (start + end) / 2;
			if (findNum.compareTo(arr[mid]) == 0) {
				System.out.println("Found at " + mid);
				break;
			} else if (findNum.compareTo(arr[mid]) > 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = start + end / 2;
			// System.out.println(mid);
		}
		if (start > end) {
			System.out.println("Element is not found!");
		}

	}

	public static void binarySearchStr() {
		System.out.println("Enter the array size::");
		int size = Utility.getInteger();

		String[] arr = new String[size];
		int n = arr.length;
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = Utility.getStringName();
		}
		System.out.println("Enter find the key:");
		String findNum = Utility.getStringName();
		Utility.binarySearchString(arr, 0, n, findNum);

	}

	/**
	 * @purpose Return the values in sorted order (Insertion Sort for integer)
	 * @param arr
	 * @return
	 */

	public static int printArrayInteger(int arr[], int n) {
		// int n=arr.length;

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return n;
	}

	public static void insertionSortInt() {
		System.out.println("Enter the array size::");
		int size = Utility.getInteger();

		int arr[] = new int[size];
		int n = arr.length;
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = Utility.getInteger();
		}

		Utility.printArrayInteger(arr, n);

		System.out.println("sorting::");
		for (int i = 0; i < n; i++) {

			System.out.println(arr[i]);

		}
		System.out.println(" ");

	}
	// ========================== Insertion sort for String =======================//

	/**
	 * purpose Return the values in sorted order for String Elements by using
	 * insertion sort technique
	 * 
	 * @param arr
	 * @return
	 */

	public static String printArrayString(String arr[], int n) {
		// int n=arr.length;

		for (int i = 1; i < n; i++) {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return null;

	}

	public static void insertionSortString() {
		System.out.println("Enter the array size::");
		int size = Utility.getInteger();

		String arr[] = new String[size];
		int n = arr.length;
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = Utility.getStringName();
		}

		Utility.printArrayString(arr, n);

		System.out.println("sorting::");
		for (int i = 0; i < n; i++) {

			System.out.println(arr[i]);

		}
		System.out.println(" ");

	}

	public static int getnumber() {
		int number = scanner.nextInt();// calling nextInt method to scan word and store it in a variable
		return number;
	}

	public static double getdouble() {
		double d1 = scanner.nextDouble();
		return d1;
	}

	// ================== Square root Program =============================//

	/**
	 * @purpose Square root Program
	 * @param c
	 * @return
	 */

	public static double squaroot(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = ((c / t + t) / 2);
		}
		return t;
	}

	// ========================= Decimal to binary =====================//

	/**
	 * @purpose Converting
	 * @param number
	 *
	 */

	public static void toBinary(int number) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Binary degit of " + number + " is ");
		int i;
		while (number > 0) {
			int value = number % 2;
			System.out.print(value + " ");
			arr.add(value);
			number = number / 2;

		}
		System.out.println(" ");
		System.out.println("power of 2 is: ");

		for (int j = 0; j < arr.size(); j++) {
			if (arr.get(j) == 1) {

				System.out.print(j + " ");
			}

		}

	}

	public static void vendingMachine(int n) {
		int notes = 0;
		int money[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };

		for (int i = 0; i < money.length; i++) {
			if (n / money[i] > 0) {

				System.out.println(money[i] + " notes are " + n / money[i]);
				notes = notes + n / money[i];
				n = n % money[i];
			}

		}
		System.out.println("total number of notes returned by vendor machine is = " + notes);
	}

	// binary to decimal

	public static char[] toBinaryChar(int number) {
		String degits = "";
		while (number > 0) {
			degits = degits + number % 2;
			number = number / 2;
		}

		return degits.toCharArray();
	}

	public static int swapNibbles(int decimal) {
		return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);
	}

	// ====================== Power of 2 =========================================

	/**
	 * @purpose
	 * @param num
	 * 
	 */
	public static boolean isPowerTwo(int num) {
		return (int) (Math.ceil((Math.log(num) / Math.log(2)))) == (int) (Math.floor(((Math.log(num) / Math.log(2)))));
	}

//--------------------- To list using binarysearch method--------------//
	public static int binarySearchWord(String wordlist[], String word, int li, int hi) {
		int mi = Math.round(li + hi) / 2;
		while (li <= hi) {
			int res = word.compareTo(wordlist[mi]);
			if (res == 0) {
				return mi;
			} else if (res > 0) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = Math.round(li + hi) / 2;
		}
		return -1;
	}

//------------------Question to find number-----------------------------------//		    
	public static void findNumber(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = i;

		}
		// display
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		System.out.println();

		System.out.println("Guess any number between 0 to " + (n - 1));
		int low = 0;
		int high = a.length;
		int mid, temp = 0;
		String ch1;

		while (low <= high) {
			// get mid
			mid = (low + high) / 2;

			if (temp == mid)
				System.out.println("Not found");
			// check whether number is at mid or not
			System.out.println("Is your number: " + a[mid]);
			ch1 = Utility.getStringName();
			if (ch1.equals("yes")) {
				System.out.println(" number: " + a[mid] + " found at:" + mid);
				break;
			}

			temp = mid;

			if (a[mid] - a[low] == 2) {
				System.out.println("your number (if not then press no ): " + a[mid - 1]);
				ch1 = Utility.getStringName();
				System.out.println("your number must be: " + a[mid + 1]);
				break;
			}

			System.out.println("is your number greater than: " + a[mid]);
			ch1 = Utility.getStringName();

			if (ch1.equals("no"))

				high = mid; // assign mid as high

			else

				low = mid; // assign mid as low

		}
	}

	/*
	 * **************** Binary presentation of decimal numbers **********
	 */
	public static String getBinary() {

		System.out.println("Enter decimal number:");
		int d = Utility.getInteger();
		int n = d;
		String binary = "";
		String reverse = "";

		// getting remainder
		while (n >= 1) {
			binary = binary + (n % 2);
			n = n / 2;
		}
		// padding to complete 1 byte
		int z = binary.length();
		String padding = "";
		for (int i = z; i < 8; i++) {
			padding = padding + 0;
		}
		System.out.print("binary of " + d + ":");
		for (int i = binary.length() - 1; i >= 0; i--) {
			reverse = reverse + binary.charAt(i);
		}
		System.out.println(padding + reverse);
		return padding + reverse;

	}
	//================================Coupon number==================================================//

	public static void CouponGenerate()
	{
		int max=1000;
		System.out.println("Enter number :");
		int no=Utility.getInteger();
		
		int count=0;
		
		int i=0;
		while(i<no)
		{
			int random=(int)(Math.random()*max);
			System.out.println(random);
		
			System.out.println("coupon : "+count);
		
		count++;
		i++;
		}
		System.out.println("number of coupon generated :"+count);
	}



	public static String[] fileReadString(String path) throws IOException 

	 {
	    String line;
	    FileReader file = new FileReader(path);
	    // reading data from file  
	    BufferedReader bread = new BufferedReader(file);
	    while((line = bread.readLine()) != null)
	    {
	        String word[] = line.split(" ");// adding word in file to word array
	         return word;
	    }
	    bread.close();
	    return null;
	}
	
	public static int[] readFileInteger(String path) throws IOException
	 {
		 String line;
		 // file reader is used to read the file data 
		 FileReader read=new FileReader(path);
		 BufferedReader bread=new BufferedReader(read);
		 while((line=bread.readLine())!=null)
		 {
			 String words[]=line.split(",");
			 int size=words.length;
			 int[] array=new int[size];
			 for(int i=0;i<array.length;i++)
			 {
				 //Converting string to integers 
				 array[i]=Integer.parseInt(words[i]);
			 }
			 return array;
		 }
		 //closing the bread connection  
		 bread.close();
		 return null;
	 }

	 public static int[] primeNumber()
	   {
		   int status=1;
		  	int number=2;
		  	int[] arr = new int[167]; 
		  	int i,j;
		   for( i=0;i<=166;)
		   {
			   for( j=2;j<=Math.sqrt(number) ;j++)
			  	{
			  		if(number%j==0)
			  		{
			  			status=0;
			  			break;
			  		}
			  	}
			  	if(status==1)
			  	{
			  		
			  	  arr[i]=number;
			  	  i++;
			  	}
			  	status=1;
			  	number++;
		   }
		  	
			return arr;
	   }

	 
	 public static int getDay(int year,int month,int day)
		{
			int y0,x,m0,d0;
			y0=year-(14-month)/12;
			x=y0+y0/4-y0/100+y0/400;
			m0=month+12*((14-month)/12)-2;
			d0=(day + x + (31*m0 )/ 12) % 7;
			return d0;
				
		}
			
			    public static boolean leapyear(int year)
			    {
			 	  if((year%4==0)&&(year%100!=0)||(year%400==0))
			      {	  
			 		  return true;
			      }
			 	  else
			 	  {
			 		  return false; 
			 	  }    
			    }
			    public static int binary(String[] arr, String s) {
					int high = arr.length - 1, low = 0, mid;
					printBubblesortArrayString(arr);

					while (low <= high) {
						mid = (low + high) / 2;
						if (s.equalsIgnoreCase(arr[mid])) {
							return mid;
						} else if (arr[mid].compareToIgnoreCase(s) < 0) {
							low = mid + 1;
						} else {
							high = mid - 1;
						}
					}
					return -1;
				}

			    public static int binarySearchMethodString(String[] st,String value)
			    {
			 	   int l=0;
			 	   int r=st.length-1;
			 	  while(l<=r)
			 	   {
			 		   int m=(l+r)/2;
			 		   int result=value.compareTo(st[m]);
			 		   if(result==0)
			 		   {
			 			   return m;
			 		   }
			 		   else if(result>0)
			 		   {
			 			  l=m+1;
			 		   }
			 		   else
			 		   {
			 			   r=m-1;
			 		   }		   
			 	   }
			 	   return -1;
			    }  
			    
			    public static boolean isPrime(int n)
				{
					
					for(int j=2;j<=n/2;j++) {
						int rem = n % j;
						
						if(rem == 0) {
							return false;
						}
						
					}
					
					return true;

				}
				
			    
			    public static int[] primeAnagrams(int range) {
					int index = 0;
					String[] array1 = new String[168];
					int[] anagram = new int[158];  //to store anagrams
					int count = 0;
					
					for(int i=2;i<range;i++)
					{
						if(isPrime(i)) //check for prime
						{
							array1[index] = String.valueOf(i); // integer to string conversion
							index++;          
						}
					}
					
					
					
					for(int i=0;i<index;i++)  //to traverse array
					{
						for(int j=i+1;j<index;j++)
						{
							if(isAnagram(array1[j], array1[i])) //to compare i'th element with j'th element
							{ 
								//store ith as well as jth positions numbers
								anagram[count] = Integer.parseInt(array1[i]);  //String to integer
								count++;
								anagram[count] = Integer.parseInt(array1[j]);
								count++;
							}
						}
					}
					
					return anagram;
				}
			
			 	
}

