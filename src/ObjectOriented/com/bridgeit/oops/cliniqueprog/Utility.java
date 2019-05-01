
/******************************************************************************************************************
 * purpose:Utility class to define all methods
 * @author sarika barge
 * @version 1.8
 * 
 */
package com.bridgeit.oops.cliniqueprog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


import java.io.PrintWriter;
import java.lang.String;
public class Utility {

	/*
	 * static scanner class objects to call inbuilt methods
	 */
	public static Scanner scanner=new Scanner(System.in);
	
	/*
	 * method to get word from string
	 */
	public static String getStringName() {
		String name = scanner.next();// calling next method to scan word and store it in a variable
		return name;
	}
	
	/*
	 * method to get char from user
	 */

	public static char getChar()
	{
		char ch=scanner.next().charAt(0);
		return ch;
	}
	
	/*
	 * method to get double from user
	 */
	
	public static double getDouble()
	   {
		   double d2=scanner.nextDouble();
		   return d2;
	   }

	///========================  Anagram program  ================================
	   
	   /**
	    * @purpose Anagram program 
	    * @param first
	    * @param second
	    * @return
       */
	public static boolean isAnagram(String sr1,String sr2) {
		int len1=sr1.length();
		int len2=sr2.length();
		char str1[]=sr1.toCharArray();
		char str2[]=sr2.toCharArray();
		
		if(len1!=len2)
			return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<len1;i++)
		
			if(str1[i]!=str2[i])
				return false;
			
			return true;
			
		
		
		
		}
	///getinteger

	   public static int getInteger()
	   {
		   int i2=scanner.nextInt();
		   return i2;
	   }  
	   
	   public static int printPrime(int number)
	   {
	  	int status=0;
	  	int numb = 0 ;
	  	for(int i=2;i<number;i++)
	  	{
	  		if(number%i==0)
	  		{
	  			status=1;
	  			break;
	  		}
	  	}
	  	if(status==0)
	  	{
	  		return numb=number;
	  		//System.out.println(number+"is Prime Number");
	  	}
		return numb;
	   }
	   
	 //===========================  Palindrome Program  ===================================
	   
	   /**
	    * @purpose  To check given number is Palindrome or not
	    * @param number
	    * @return
	    */


	   public static boolean isPalindrome(int number)
	   {
		   int temp=number;
		   int add=0;
		   while(number>0)
		   {
			 add=(add*10)+(number%10);
			
			 number=number/10;
		   }
		   if(add==temp)
		   {
			   return true;
		   }
		   else
		   {
		     return false;
		   }
	   }



	///coupon
	
	public static int getCoupon(int n)
	{
		return (int) (Math.random()*n);
	}
	 
	public static int collect(int n)
	{
		boolean[] isCollect=new boolean[n];
		int count=0;
		int distinct=0;
		
		while(distinct<n)
		{
			int value=getCoupon(n);
			count++;
			if(!isCollect[value]) {
				distinct++;
			isCollect[value]=true;
		}
		}
		return count;
	
	
	}
	
	//Distance
	
	public static double distance(int x,int y)
	{
		double distance=Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));
		return distance;
	}
	
	
	//factor prime
	//========================  Prime factors of nth number  =====================================
	   
	   /**
	    * @purpose Prime factors of nth number 
	    * @param number
	    * @return
	    */

	public static int factorPrime(int n) {
	 // for each potential factor
    for (int factor = 2; factor*factor <= n; factor++) {

        // if factor is a factor of n, repeatedly divide it out
        while (n % factor == 0) {
            System.out.print(factor + " "); 
            n = n / factor;
        }
    }
	return n;
	}
	
	//harmonic

	   //=====================  Harmonic  value for Nth number  =================================
	   
	   /**
	    * @purpose To get harmonic value
	    * @param n
	    * @return
	    */

	public static float getHarmonic(int n)
	{
		float harmonic=1;
		
		for(int i=2;i<=n;i++)
		{
			harmonic=(float)1/i+harmonic;
		}
		System.out.println(harmonic);
		return harmonic;

	}
	
	/**
	@purpose head and tail
	@param num
	@return
			*/
	public static void coin(int num)
	{
		int head=0,tail=0;
		double result;
		for(int i=0;i<num;i++)
		{
			result=Math.random();
			if(result<=.5){
				head++;
				}
			else
				tail++;
			}
		double percentHeads =head * 100 / num;
		double percentTails =(num-head) * 100 / num;
		
		System.out.println("heads percentage is " +percentHeads);
		System.out.println("tails percentage is " + percentTails);
		
	}
	
	//======================  Power of 2  =========================================

	/**
	 * @purpose 
	 * @param pow
	 * @return
	 */

	public static void powerOfTwo(int pow)
	{
		int val=1;
		for(int i=0;i<=pow;i++) {
			val=val*2;
			System.out.println(val);
		}

		
	}
	/** To quadratic
	 *  
	 * @param a
	 * @param b
	 * @return
	 */
	public static int quadratic(int a,int b)
	{
		int delta = 0;
	
    if(delta<0)
    {
   	 System.out.println("roots are temporary");
    }
    else
    {
   	 int z=(int) Math.sqrt(delta);
   	 int r1=(-b+z)/(2*a);
   	 int r2=(-b-z)/(2*a);
   	 System.out.println("root1::"+r1);
   	 System.out.println("root2::"+r2);
   	 
    }
	return delta;
	}
	
	/**sum of integer
	 * 
	 * @param arr
	 * @param n
	 */
	public static void triplets( int[] arr,int n)
	{
		boolean flag=true;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					flag=true;
					}
					
				}
			}
		}
		
		if(flag=false)
		{
			System.out.println("No result");
		}
		
	}


	   //======================  TWO Dimensional Array  ==================================================
	   
	   /**
	    * @purpose TWO Dimensional Array
	    * @param row
	    * @param column
	    */

	public static int twoDArray(int row,int col) {
		
		int ch= Utility.getInteger();
		 PrintWriter pw = new PrintWriter(System.out,true); 
	switch(ch) {
	case 1:
		
		int[][] array = new int[row][col]; 
		System.err.println("Enter"+(row*col)+" array elements");
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			array[i][j]=scanner.nextInt();
			//array[i][j]=col;
		}
	}
	
	System.out.println("Array is");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			pw.print(array[i][j]+" ");
		}
		pw.println(" ");
	}
	break;
	
	case 2:
		
		double[][] array1 = new double[row][col]; 
		System.out.println("Enter"+(row*col)+" array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array1[i][j]=scanner.nextDouble();
				//array[i][j]=col;
			}
		}
		
		System.out.println("Array is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				pw.print(array1[i][j]+" ");
			}
			pw.println(" ");
		}
		break;
	
	case 3:
		
		boolean[][] array2 = new boolean[row][col]; 
		System.out.println("Enter"+(row*col)+" array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Entr boolean");
				array2[i][j]=scanner.nextBoolean();
				//array[i][j]=col;
			}
		}
		
		System.out.println("Array is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				pw.print(array2[i][j]+" ");
			}
			pw.println(" ");
		}
		break;
		
	default :
		System.out.println(" No result");
		break;
	}
	return ch;
	
	
	}
	/** To windChill
	 * 
	 * @param t
	 * @param v
	 * @return
	 */
	public static double windchill(double t,double v) {
	if(t>50&&v>120||v<3) {
		  double W=35.74 + 0.6215 * t+0.4275 * t * Math.pow(v, 0.16) - 35.75 * Math.pow(v, 0.16) ; 
		    System.out.println(W);
		    }
		  else
		  {
			  System.out.println("No result");
		  }
	return v;
	}
	public static String printArray(String arr[],int n)
	{
      n=arr.length;
		
		for(int i=1;i<n;i++) {
			String key=arr[i];
			int j=i-1;
			while ( j >= 0 &&arr[j].compareToIgnoreCase(key)>0)
			{

		{
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
		    }
	
	}
		return null;
	}
	
	//========================= Bubble sort for integer  ===========================

	/**
	 * @purpose Return the values in sorted order for integers by using Bubble sort technique
	 * @param value
	 * @return
	 */

	public static int printBubblesortArray(int array[])
	{
		int n=array.length;
		int temp = 0 ;
		for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) 
	         {
	            if(array[j-1] > array[j]) 
	            {
	               temp = array[j-1];
	               array[j-1] = array[j];
	               array[j] = temp;
			}
		}
		
	}
		return temp;
	}
	
	//========================  Bubble Sort for String  ================================== 
	 
	/**
	 * @purpose Return the values in sorted order for String Element by using Bubble sort technique
	 * @param arr
	 * @return
	 */

	public static String printBubblesortArrayString(String array[])
	{
		int n=array.length;
		 String temp = null;
		for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) 
	         {
	            if(array[j].compareTo(array[j-1])<0)
	            {
	               temp = array[j-1];
	               array[j-1] = array[j];
	               array[j] = temp;
			}
		}
		
	}
		return temp;
	}
	
	
	///=========================   Sort Using  merge  ================================

	/**
	 * @purpose Return the values in sorted order for integers by using Merge sorting technique
	 * @param arr
	 * @param lower
	 * @param mid
	 * @param higher
	 */

	public static void mergeSort(String arr[], int lower, int mid, int higher) 
	{ 
	     
	    int num1 = mid - lower + 1; 
	    int num2 = higher - mid; 

	    String leftArr[] = new String [num1]; 
	    String rightArr[] = new String [num2]; 

	    for (int i=0; i<num1; ++i)
	    {
	        leftArr[i] = arr[lower + i]; 
	    }
	    for (int j=0; j<num2; ++j)
	    {
	        rightArr[j] = arr[mid + 1+ j]; 
	    }
	    int i = 0, j = 0,k=0; 
	    
	    
	    while (i < num1 && j < num2) 
	    { 
	        if (leftArr[i].compareToIgnoreCase(rightArr[j]) < 0) 
	        { 
	            arr[k] = leftArr[i]; 
	            i++; 
	        } 
	        else
	        { 
	            arr[k] = rightArr[j]; 
	            j++; 
	        } 
	        k++; 
	    } 

	    while (i < num1) 
	    { 
	        arr[k] = leftArr[i]; 
	        i++; 
	        k++; 
	    } 

	    while (j < num2) 
	    { 
	        arr[k] = rightArr[j]; 
	        j++; 
	        k++; 
	    } 
	} 
	
	


	public static void sort(String[] arr, int lower, int higher ) 
	{ 
	    if (lower< higher) 
	    {         
	        int mid = (lower+higher)/2;         
	        sort(arr, lower,mid); 
	        sort(arr , mid+1, higher); 
	        mergeSort(arr, lower, mid, higher); 
	    } 
	}
      
	/*public void devideArray(int lowerindex,int higherindex)
	{
		if(lowerindex<higherindex)
		{
			int middle=lowerindex+(higherindex-lowerindex)/2;
			devideArray(lowerindex,middle);//sort left hand side array
			devideArray(middle+1,higherindex);//sort right hand side array
			mergeArray(lowerindex,middle,higherindex);
		}
	}
	*/

	//====================  Printing Integer Array Elements  ==============================

	/**
	 * @purpose Printing String Array Elements
	 * @param arr
	 */

	public static void printArray(String arr[]) 
	{ 
	    int n = arr.length; 
	    for (int i=0; i<n; ++i) 
	    System.out.println(arr[i]); 
	    System.out.println(); 
		
	} 


	public static double monthlyPayment(double p,double y,double r) {
		double n=12*r;
		double r0=r/(12*100);
	    double payment=p*r/1-Math.pow((1+r0),-n);
		return payment;
	}
	
	//=======================  Prime Numbers Program  =========================
	   
	   /**
	    * @purpose Prime Numbers Program
	    * @param number
	    * @return
	    */

	
	public static void isPrime(int num1, int num2)
	{
		
		for(int i=num1;i<num2;i++)
		{
			int j;
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			
			if(i==j)
				System.out.println(i+"");
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
		
		/*static int squareroot(double c)
		{
			double t=c;
			double epsilon=1e-15;
			
			while(Math.abs(t-c/t>epsilon*t))
			{
				System.out.println("");
			}
		}
		*/
		
		/**
		    * @purpose gives the out put as week name  
		    * @param m0
		    * @param d0
		    * @param y0
		    * @return
		    */

		public static int dayOfWeek(int m,int d,int y)
		{
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}
		

		   //====================  Binary Search for integer  ==========================
		   
		   /**
		    * @purpose Binary Search for integer
		    * @param arr
		    * @param findnum
		    * @return
		    */

		public static int binarySearch(int arr[],int start,int end,int findNum) {
			
			int n=arr.length;
			//int findNum=33;
			start=0;
			end=n-1;
			
			int mid=(start+end)/2;
			
			while(start<=end) {
				
				mid=(start+end)/2;
					if(arr[mid]==findNum) //search.compareTo(arr[mid)==0
						{
						System.out.println("Found at "+mid);
						break;
					}
					else if(arr[mid]<findNum) //search.compareTo(arr[mid)>0
						{
						 start=mid+1;
					}
					else{
						 end=mid-1;
					}
					mid=start+end/2;
					//System.out.println(mid);
			}
			if ( start > end ){  
			      System.out.println("Element is not found!");  
			   }
			return mid;  
		
			
			
		
		}

		/*public static int binarySearchString(String arr[],int left,int right,String findNum) {
            
			//int findNum=33;
			int n=arr.length-1;
			left=0;
			right=n-1;
			
			int mid=(left+right)/2;
			//int res = findNum.compareTo(arr[mid]); 
			
			while(left<=right) {
				
				mid=(left+right)/2;
					if(res==0) search.compareTo(arr[mid)==0
					{
						System.out.println("Found at "+mid);
						break;
					}
					else if(res>0) {
						 left=mid+1;
					}
					else{
						 right=mid-1;
					}
					mid=left+right/2;
					//System.out.println(mid);
			}
			return -1;
			
		}*/
		
		//====================  Binary search for String  =============================
		   
		   /**
		    * @purpose Binary search for String
		    * @param arr
		    * @param findnum
		    * @return
		    */

		public static void binarySearchString(String arr[],int start,int end,String findNum) {
			int n=arr.length;
			//int findNum=33;
			start=0;
			end=n-1;
			
			int mid=(start+end)/2;
			
			while(start<=end) {
				
				mid=(start+end)/2;
					if(findNum.compareTo(arr[mid])==0)
						{
						System.out.println("Found at "+mid);
						break;
					}
					else if(findNum.compareTo(arr[mid])>0)
						{
						 start=mid+1;
					}
					else{
						 end=mid-1;
					}
					mid=start+end/2;
					//System.out.println(mid);
			}
			if ( start > end ){  
			      System.out.println("Element is not found!");  
			}
			
			}
		
		/**
		    * @purpose Return the values in sorted order (Insertion Sort for integer)
		    * @param arr
		    * @return
		    */


		public static int printArrayInteger(int arr[],int n)
		{
	      // int n=arr.length;
			
			for(int i=1;i<n;i++) {
				int key=arr[i];
				int j=i-1;
				while (j >= 0 && key < arr[j]) 
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			}
			return n;
		}
		
		//==========================  Insertion sort for String  =======================

		/**
		 * purpose Return the values in sorted order for String Elements by using insertion sort technique
		 * @param arr
		 * @return
		 */

		public static String printArrayString(String arr[],int n)
		{
	      // int n=arr.length;
			
			for(int i=1;i<n;i++) {
				String key=arr[i];
				int j=i-1;
				while (j >= 0 &&arr[j].compareToIgnoreCase(key)> 0) 

			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			    }
			return null;
			
		}
		public static int getnumber() {
			int number = scanner.nextInt();// calling nextInt method to scan word and store it in a variable
			return number;
		}
		
		public static double getdouble()
		{
			double d1=scanner.nextDouble();
			return d1;
		}

		//==================  Square root Program  ====================================
		   
		   /**
		    * @purpose Square root Program 
		    * @param c
		    * @return
		    */

		   public static double squaroot(double c)
		   {
			   double t=c;
			   double epsilon=1e-15;
			   while(Math.abs(t-c/t)>epsilon*t)
			   {
				   t=((c/t+t)/2);
			   }
			   return t;
		   }

		 //========================= Decimal to binary  ===========================================================
		   
		   /**
		    * @purpose Converting 
		    * @param number
		    * @return
		    */

		   public static void toBinary(int number) {
			   ArrayList<Integer> arr= new ArrayList<Integer>();
				System.out.println("Binary degit of " + number + " is ");
				int i ;
				while (number > 0) {
					int value = number % 2;
					System.out.print(value+" ");
					arr.add(value);
					number = number / 2;
				  
				}
				System.out.println(" ");
				System.out.println("power of 2 is: ");

				for (int j = 0; j < arr.size(); j++) {
					if(arr.get(j)==1)
					{
						
						System.out.print(j+" ");
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
 
		   //binary to decimal
		   
		 
		   public static char[] toBinaryChar(int number)
		   {
		  	String  degits="";
		  	while(number>0) 
		  	{
		  		degits=degits+number%2;
		  		number=number/2;
		  	}
		  	 
		  	  return degits.toCharArray();
		   }
		   
		   
		   public static int swapNibbles(int decimal) 
		   {
		   	return ((decimal & 0x0F) <<4  | (decimal & 0xF0) >>4);
		   }

		   //======================  Power of 2  =========================================

		   /**
		    * @purpose 
		    * @param num
		    * @return
		    */
		    public static boolean isPowerTwo(int num) 
		   {
		   	return (int) (Math.ceil((Math.log(num) / Math.log(2)))) == (int) (Math.floor(((Math.log(num) / Math.log(2)))));
		   }


		   
		    public static boolean isLeapYear(int year) 
			{
				if ((year % 4 == 0) && (year % 100 != 0))
					return true;
				if (year % 400 == 0)
					return true;
				return true;
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
 
}
		

