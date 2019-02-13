package com.BridgeLabz.FunctionalPrograms;

public class LeapYear {
	public static void main(String []args)
	{
		int year;
		
		System.out.println("Enter the Year:=");
		
		year = Utility.singleIntegerInput();
		
		int cnt = Utility.countLeapYear(year);
		
		if(cnt==4)
			Utility.checkLeapYear(year);
		
		else
			System.out.println("Enter a valid year!");
	}
}
