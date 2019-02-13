package com.BridgeLabz.FunctionalPrograms;

public class FlipCoin {
	public static void main(String []args)
	{
		int iterations,headcnt=0,tailcnt=0;
		boolean result;
		System.out.println("Enter the number of Iterations:=");
		
		iterations = Utility.singleIntegerInput();
		
		for(int i=0;i<iterations;i++)
		{
			result = Utility.randomValue();
			
			if(result==true)
			{	
				headcnt=headcnt+1;
				
			}	
			else if(result==false)
			{	
				tailcnt=tailcnt+1;
				
			}	
				
		}	
		System.out.println("Head count is:="+headcnt);
		System.out.println("Tail count is:="+tailcnt);
		
		int headpercentage = Utility.calPercentage(headcnt,iterations);
		
		int tailpercentage = Utility.calPercentage(tailcnt,iterations);
		
		System.out.println("Percentage of Head is:="+headpercentage);
		
		System.out.println("Percentage of Head is:="+tailpercentage);
	}

}
