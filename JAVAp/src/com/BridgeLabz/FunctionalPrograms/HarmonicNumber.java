package com.BridgeLabz.FunctionalPrograms;

public class HarmonicNumber {
	
	public static void main(String []args)
	{
		float n,i,sum=0;
		
		System.out.print("Enter the Nth number:=");
		
		n = Utility.singleIntegerInput();
		
		for(i=1;i<=n;i++)
		{
			sum=(sum+(1/i));
		}
		System.out.println("Nth Harmonic number is:="+sum);
	}
}
