package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class MonthlyPayment {
	public static void main(String []args)
	{
		System.out.println("Enter Principal ,Year and Rate");
		double p = Utility.singleIntegerInput();
		double y = Utility.singleIntegerInput();
		double r = Utility.singleIntegerInput();
		System.out.println("mothly payment is:" + Util.monthlyPayment(p, y, r));
	}
}
