package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class Date {
	public static void main(String []args)
	{
		int d, m, y;
		System.out.println("enter date in day month year");
		d = Utility.singleIntegerInput();
		m = Utility.singleIntegerInput();
		y = Utility.singleIntegerInput();
		System.out.println("day is "+Util.dayOfWeek(d, m, y));
	}
}
