package com.BridgeLabz.FunctionalPrograms;

public class PrimeFactor {
	public static void main(String []args)
	{
		int n,i;
		
		System.out.println("Enter the number:=");
		
		n = Utility.singleIntegerInput();
		
		for(i=2;n!=1;)
		{
			if(n%i==0)
			{
				System.out.print(""+i+" ");
				n=n/i;
			}
			else
				i++;
		}
	}
}
