package com.BridgeLabz.Algorithm;
import com.BridgeLabz.FunctionalPrograms.Utility;

public class Anagram {

		public static void main(String []args)
		{
			String str1;
			String str2;
			int cnt=0,n1,n2;
			
			System.out.print("Enter the first String:=");
			
			str1 = Utility.singleStringInput();
			
			System.out.print("Enter the Second String:=");
			
			str2 = Utility.singleStringInput();
			
			boolean result = Utility.checkAnagrams(str1,str2);
			
			if(result == true)
				System.out.print("Strings are Anagrams");
			else
				System.out.println("Strings are not Anagrams");	
		}
}
