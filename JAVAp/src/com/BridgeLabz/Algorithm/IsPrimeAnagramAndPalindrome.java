package com.BridgeLabz.Algorithm;

import java.util.List;
import java.util.ArrayList;
import com.BridgeLabz.FunctionalPrograms.Utility;

public class IsPrimeAnagramAndPalindrome {

	public static void main(String[] args) {
		
		int num1,num2,cnt=0,primecnt=0;;
		boolean palindromeResult=false,anagramResult=false;
		
		ArrayList<Integer> prime = new ArrayList<Integer>(); 
		ArrayList<Integer> palindrome = new ArrayList<Integer>(); 
		ArrayList<Integer> anagram = new ArrayList<Integer>(); 
		
					/*Prime*/
		
		for(num1=3;num1<=1000;num1++)
		{			
			cnt = Utility.checkPrime(num1);	
			if(cnt==0)
			{
				prime.add(num1);
			}
		}
		System.out.println("List of Prime Numbers:");
		System.out.println(prime);
		
					/*Palindrome*/
		
		for(int i=0;prime.size()>primecnt;i++)
		{
			num1 = prime.get(i);
			palindromeResult = Utility.checkPalindromeNumber(num1);
			if(palindromeResult == true)
				palindrome.add(num1);
			primecnt++;
			
		}
		System.out.println("List of Palindrome Prime Numbers:");
		System.out.println(palindrome);
		
						/*Anagram*/
		
		for(int i=0;i<prime.size();i++)
		{

			num1 = prime.get(i);
			for(int j=i+1;j<prime.size();j++)
			{
				num2 = prime.get(j);
				String str1 = Integer.toString(num1);
				String str2 = Integer.toString(num2);
				anagramResult = Utility.checkAnagrams(str1,str2);
				if(anagramResult)
				{
					anagram.add(num1);
					break;
				}	
					
			}
			
		}
		
		System.out.println("List of Anagram Prime Numbers:");
		System.out.println(anagram);
	
	}
}
	


