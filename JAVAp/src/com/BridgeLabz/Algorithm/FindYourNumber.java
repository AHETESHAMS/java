package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class FindYourNumber {

	public static void main(String[] args) throws InterruptedException {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		String ans;
		boolean result;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Think of a number form given numbers!");
		Thread.sleep(5000);
		int choice=arr.length/2;
		System.out.println("Is it "+arr[choice]+"?");
		System.out.println("Enter Choice yes or no:=");
		ans = Utility.singleStringInput();
		if(ans.equals("yes"))
		{
			System.out.println("Nice!");
		}
		else if(ans.equals("no"))
		{
			System.out.println("Is it Greater than "+arr[choice]+"?");
			System.out.println("Enter Choice yes or no:=");
			ans = Utility.singleStringInput();
			if(ans.equals("yes"))
			{
				result = Utility.guessNumber(arr,choice+1,arr.length);
				if(result==true)
					System.out.print("Nice");
				
			}
			else
			{
				result = Utility.guessNumber(arr,0,choice);
				if(result==true)
					System.out.print("Nice");
			}
		}	
		else
			System.out.println("Wrong Choice!");
		
		}
		

	}


