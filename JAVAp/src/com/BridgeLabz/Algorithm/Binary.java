package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class Binary {

	public static void main(String[] args) {
		int i;
		int []binary = new int[10];
		System.out.println("Enter the Number:=");
		int num = Utility.singleIntegerInput();
		i=Utility.integerToBinary(binary,num);
		for(int j=i;j>=0;j--)
		{
			System.out.print(""+binary[j]);
		}
	}

}
