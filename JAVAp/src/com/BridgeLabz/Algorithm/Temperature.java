package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class Temperature {

	public static void main(String[] args) {
		int result = 0,temp;
		System.out.println("Enter 1 for clesius and 2 for Fahrenheit:");
		System.out.println("Enter your choice:");
		int choice = Utility.singleIntegerInput();
		if(choice == 0 ||choice == 1)
		{
			System.out.println("Enter your Temperature:");
			temp = Utility.singleIntegerInput();
			result = Util.temperatureConverter(temp,choice);
		}
		else
			System.out.println("Invalid Choice!");
		
		System.out.println("Temperature is:="+result);

	}

}
