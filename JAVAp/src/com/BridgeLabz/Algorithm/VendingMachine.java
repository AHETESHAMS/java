package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class VendingMachine {
	public static void main(String []args)
	{
		int []arr = new int[] {1000,500,100,50,10,5,2,1};
		System.out.println("Enter the Amount:=");
		int amount = Utility.singleIntegerInput();
		for(int i=0;i<8;i++)
		{
				int div = amount/arr[i];
				amount=amount-div*arr[i];
				if(div>0)
					System.out.println(div+" Notes "+" of "+arr[i]+" Rupees");
				if(amount==0)
					break;
		}
			
		}
	}

