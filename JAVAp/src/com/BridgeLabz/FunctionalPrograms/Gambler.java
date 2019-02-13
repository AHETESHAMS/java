package com.BridgeLabz.FunctionalPrograms;

public class Gambler {
	public static void main(String[] args) {
		
		int bet,win=0,loose=0;
	
		System.out.println("Enter Iterations:=");
		
		int iterations = Utility.singleIntegerInput();
		
		System.out.println("Enter stake:=");
		
		int stake = Utility.singleIntegerInput();
			
		System.out.println("Enter Goal:=");
		
		int goal = Utility.singleIntegerInput();

		int cash = stake;
		
		for(bet=1;bet<iterations && cash>0;bet++)
		{
			boolean result = Utility.randomValue();
			
			if(result==true)
			{
				win++;
				cash=cash*2;
			}	
			else
			{	
				loose++;
				cash=cash/2;
			}	
		}
		
		int winpercentage = Utility.calPercentage(win,iterations);
		
		int loosepercentage = Utility.calPercentage(loose,iterations);
		
		System.out.println("Peerson played "+bet+" bets");
		
		System.out.println("Person won "+win+" times");
		
		System.out.println("Person Loose "+loose+" times");
		
		System.out.println("Percentage of winning is:="+winpercentage);
		
		System.out.println("Percentage of loosinging is:="+loosepercentage);
		
		if(win>loose)
			System.out.println("Person won");
		else
			System.out.println("Person loose");
	}

}
