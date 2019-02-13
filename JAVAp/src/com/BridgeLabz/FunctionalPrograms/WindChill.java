package com.BridgeLabz.FunctionalPrograms;

public class WindChill {

	public static void main(String[] args) {
	
		System.out.println("Enter the speed of wind");
		
		int v = Utility.singleIntegerInput();
		
		System.out.println("Enter the Temperature in fahrenheit:=");
		
		int t = Utility.singleIntegerInput();
		
		if(t>50)
		{
			System.out.println("Temperature should be less than 50");
			WindChill.main(null);
		}	
		
		else if(v>120 || v<3)
		{
			System.out.println("speed should be greater than 3 or less than 120");
			WindChill.main(null);
		}	
		else
		{
			double topower=0.16;
			
			double power = Utility.calPower(v,topower);
			
			double w = 35.74+(t*0.6215)+(t*0.4275-35.75)*(v*power);
			
			System.out.print("Wind Chill:="+w);
		}

	}

}
