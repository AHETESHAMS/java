package com.BridgeLabz.FunctionalPrograms;

public class Quadratic {

		public static void main(String []args)
		{
			System.out.println("Enter the value of a:=");
			int a = Utility.singleIntegerInput();
			System.out.println("Enter the value of b:=");
			int b = Utility.singleIntegerInput();
			System.out.println("Enter the value of c:=");
			int c = Utility.singleIntegerInput();
			
			double delta = (b*b)-(4*a*c);
			
			double x1 = ((-b+Math.sqrt(delta))/(2*a));
			
			System.out.print("First root of x:="+x1);
			
			double x2 = ((-b-Math.sqrt(delta))/(2*a));
			
			System.out.print("First root of x:="+x2);
			
		}

		
}
