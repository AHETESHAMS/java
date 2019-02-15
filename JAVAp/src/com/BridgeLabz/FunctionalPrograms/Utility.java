package com.BridgeLabz.FunctionalPrograms;

import java.util.Scanner;
import java.util.Random;

public class Utility {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Function: To Take Single Integer Value as an Input
	 * @return: Single Integer Value
	 */

	public static int singleIntegerInput() {
		return (sc.nextInt());
	}

	/**
	 * Function: To Take Single Double Value as an Input
	 * @return: Single Double Value
	 */

	public static double singleDoubleInput() {
		return (sc.nextDouble());
	}

	/**
	 * Function: To Take Single Boolean Value as an Input
	 * @return: Single Boolean Value
	 */


	public static boolean singleBooleanInput() {
		return (sc.nextBoolean());
	}

	/**
	 * Function: To Take Single String Value as an Input
	 * @return: Single String Value
	 */


	public static String singleStringInput() {
		return (sc.next());
	}
	
	/**
	 * 
	 * @param arr
	 */
	public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	/**
	 * Function: Sorting for merge sort
	 * @param arr
	 * @param l
	 * @param r
	 */
	public static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted
            merge(arr, l, m, r); 
        } 
    } 
	/**
	 * Function: Merging For Merge Sort
	 * @param arr
	 * @param l
	 * @param m
	 * @param r
	 */
	
	public static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	
	/**
	 * 
	 */
	public static boolean guessNumber(int []arr,int start,int end)
	{
		String ans;
		for(int i=start;i<end;i++)
		{
			System.out.println("is it "+arr[i]+"?");
			ans = Utility.singleStringInput();
			if(ans.equals("yes"))
				return(true);
			else {}
		}
		return false;
	}	
	
	/**
	 * Function:To convert decimal To binary
	 * @param binary:Integer Array
	 * @param num: Integer Number
	 * @return: Integer
	 */
	
	public static int integerToBinary(int []binary,int num)
	{
		int i=0,t;
		for(i=0;num>0;i++)
		{
			binary[i] = num%2;
			num=num/2;
		}
		return(i);
	}
	
	/**
	 * Function: Binary Search For Integer Value
	 * @param searchArray: Array of Integers
	 * @param half: Mid Position in an Array
	 * @param item: Element to Search
	 * @param searchArrayLen: Length of Array
	 */
	
	public static void searchInteger(int []searchArray,int half,int item,int searchArrayLen)
	{
		 int cnt=0,i;
		 if(searchArray[half]==item)
		 {
			 System.out.print("Element Found at Position "+half);
		 }
		 else if(item>searchArray[half])
		 {
			 for(i=half;i<searchArrayLen;i++)
			 {
				 if(searchArray[i]==item)
				 {
					cnt++;
				 }
				 
			 }
			 if(cnt>0)
				 System.out.println("Item Found at Position "+i);
			 else
				 System.out.println("Item not Found");
		 }
		 else
		 {
			 for(i=0;i<half;i++)
			 {
				 if(searchArray[i]==item)
				 {
					cnt++;
				 }
				 
			 }
			 if(cnt>0)
				 System.out.println("Item Found at Position "+i);
			 else
				 System.out.println("Item not Found");
		 }
	}
	
	/**
	 * Function: To Perform Insertion Sort For Array Of String
	 * @param names : Array Of String
	 * @return: Sorted Array Of String
	 */
	
	public static String[] insertionSort(String []names)
	{
		
		for (int i = 1; i < names.length; i++) {
			String temp = names[i];
			int j = i - 1;
			while (j >= 0 && names[j].compareToIgnoreCase(temp) > 0) {
				names[i] = names[j];
				j -= 1;
			}
			names[j + 1] = temp;
		}
		return names;
	}
		
	
	/**
	 * Function: To Perform Bubble Sort
	 * @param names: Array Of Strings
	 * @return: Sorted Array Of Strings
	 */
	public static String[] bubbleSort(String []names)
	{
		for (int j = 0; j < names.length; j++) 
	    {
	    	for (int i = j + 1; i < names.length; i++) 
	    	{
	    		if (names[i].compareTo(names[j]) < 0) 
	    		{
	    			String t = names[j];
	    			names[j] = names[i];
	    			names[i] = t;
	    		}
	    	}
	      
	    }
		return(names);
	}
	
	/**
	 * Function: To Perform Searching For Strings
	 * @param names: Array Of Strings
	 * @param element: Element To Search
	 */
	public static boolean searchString(String []names,String element)
	{
		int n = names.length;
		for (int i=0;i<n;i++) 
		{
		    if ( names[i].equals(element)) 
		    {
		        return true;
		    }
		}
		return false;
	}
	
	/**
	 * Function: To Check Anagrams
	 * @param str1: First String value
	 * @param str2: Second String value
	 * @return; Boolean Value
	 */
	
	public static boolean checkAnagrams(String str1,String str2)
	{
		int n1 = str1.length();
		
		int n2 = str2.length();
		
		int cnt=0;
		
		char[] str1Array = str1. toCharArray();
		
		char[] str2Array = str2. toCharArray();
		
		if(n1!=n2)
			return false;
		
		else
		{
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<n1;j++)
				{
					if(str1Array[i] == str2Array[j])
					{
						cnt++;
						break;
					}
				}
			}
			
			if(cnt == n1)
				return true;
			else
				return false;
		}
		
	}
	
	/**
	 * Function: To check The Number is Prime Or Not
	 * @param num:Integer number
	 * @return Integer
	 */
	
	public static int checkPrime(int num)
	{
		int cnt=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
				break;
			}	
		}
			return cnt;	
	}	
	
	/**
	 * Function: To check number is palindrome or not
	 * @param n; Integer Number
	 * @return; Boolean Value
	 */
	
	public static boolean checkPalindromeNumber(int n)
	{
		int rev=0,rem,original;
		original=n;
		while(n!=0)
		{
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		if(rev==original)
			return true;
		else
			return false;
	}
	
	/**
	 * Function: Give Raising To Given Power 
	 * @param num: Integer Number
	 * @param topower:Has Raised To Power
	 * @return
	 */
	
	public static double calPower(int num,double topower)
	{
		double temp = Math.pow(num, topower);
		return temp;
	}
	
	/**
	 * Function: To Start StopWatch
	 * @return: Long
	 */
	
	public static Long start()
	{
		return(System.nanoTime());
	}
	
	/**
	 * Function: To Start StopWatch
	 * @return; Long
	 */
	
	public static Long stop()
	{
		return(System.nanoTime());
	}

	/**
	 * 
	 * @param start:Long Start value of stop watch
	 * @param stop; Long Stop value of stop watch
	 * @return: Long
	 */
	
	public static Long timeEllapse(Long start,Long stop)
	{
		return((stop-start));
	}

	/**
	 * Function: To Check Year is Leap Year or Not
	 * @param year:Integer value of Year
	 */

	public static void checkLeapYear(int year) {
		if (year % 400 == 0)
			System.out.print("It is a Leap Year!");
		else if (year % 4 == 0)
			System.out.print("It is a Leap Year!");
		else if (year % 100 == 0)
			System.out.print("It is not a Leap Year!");
		else
			System.out.print("It is not a Leap Year!");

	}

	/**Function: To Count Digit of Year
	 * @param year;Integer Value For Year
	 * @return; Integer
	 */
	public static int countLeapYear(int year) {
		int cnt = 0;
		while (year > 0) {
			year = year / 10;
			cnt++;
		}
		return (cnt);
	}

	/**
	 * Function: To Generate a Random Value
	 * @return; Boolean
	 */

	public static boolean randomValue() {
		double result = Math.random();

		if (result <= .5)
			return true;
		else
			return false;

	}

	/**
	 * Function: To Count Perecentage Of Head And Tail
	 * @param self:Integer Value Of Head Or Tail
	 * @param iterations:Integer Total Number of Iterations
	 * @return: Percentage
	 */

	public static int calPercentage(int self, int iterations) {
		return (self * 100 / iterations);
	}

	/**
	 * Function: To Check Length Of String
	 * @param name:String Array
	 */

	public static void checkUserLength(String name) {

		if (name.length() <= 3) {
			System.out.println("Please enter charachters more than three");

			UserNameVerification.main(null);

		} else {
			System.out.println("Hello " + name);
		}

	}

	/**
	 * Function: To Check Rows Of Game
	 * @param game: Integer Array
	 * @return: Boolean
	 */

	public static boolean checkRows(char game[][],char ch) {
		
				if((game[0][0] == ch && game[0][1] == ch && game[0][2] == ch)
						|| (game[1][0] == ch && game[1][1] == ch && game[1][2] == 'x')
						|| (game[2][0] == ch && game[2][1] == ch && game[2][2] == 'x')
						|| (game[0][0] == ch && game[1][0] == ch && game[2][0] == 'x')
						|| (game[0][1] == ch && game[1][1] == ch && game[2][1] == 'x')
						|| (game[0][2] == ch && game[1][2] == ch && game[2][2] == 'x')
						|| (game[0][0] == ch && game[1][1] == ch && game[2][2] == 'x')
						|| (game[0][2] == ch && game[1][1] == ch && game[2][0] == 'x'))
					{
						return(true);
					}
					else
					return(false);			
			
	}
	/**
	 * Function: To Display Tic Tac Toe
	 * @param game: Array Of Integers
	 */

	public static void displayGame(char[][] game) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Function: To Take An Input For Tic Tac Toe
	 * @param player: Integer Value
	 * @param game: Integer Array
	 */
	public static void gameInput(int player, char[][] game) {
		int x, y;
		Random r = new Random();

		Utility.displayGame(game);
		for (int i = 0; i < 9; i++) {
			if (player == 1) {
				System.out.println("Player1's turn:=");

				x = Utility.singleIntegerInput();
				y = Utility.singleIntegerInput();
				if (game[x][y] == 'x' || game[x][y] == 'o') {
					System.out.println("Position is alrady filled!");
					System.out.println("");
					Utility.gameInput(player, game);
				} 
				else 
				{
					boolean temp;
					game[x][y] = 'x';
					temp = Utility.checkRows(game,'x');
					if(temp==true)
					{
						System.out.print("Player 1 won");
						break;
					}	
					player = 2;
				}
			} 
			else 
			{
				x = r.nextInt(3);
				y = r.nextInt(3);
				if (game[x][y] == 'x' || game[x][y] == 'o') {
					Utility.gameInput(player, game);
				} 
				else 
				{
					game[x][y] = 'o';
					boolean temp = Utility.checkRows(game,'o');
					if(temp==true)
					{
						System.out.print("Computer won");
						break;
					}	
					player = 1;
				}
			}

			Utility.displayGame(game);
		}
	
	}

	

}
