package com.BridgeLabz.FunctionalPrograms;

public class PowerTable {
	public static void main(String []args)
	{
		int i,n,m=1;
		System.out.print("Enter value of N:=");
		
		n=Utility.singleIntegerInput();
		
		for(i=1;i<n;i++)
		{
			m=m*2;
			System.out.println("2^"+i+"="+m);
		}
	}
}
