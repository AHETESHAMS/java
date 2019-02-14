package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class BinarySwap {

	public static void main(String[] args) {
		
		int i,k=0,n,temp,cnt=0;
		int []binary = new int[10];
		int []L = new int[10];
		int []R = new int [10];
		System.out.println("Enter the Number:=");
		int num = Utility.singleIntegerInput();
		i=Utility.integerToBinary(binary,num);
		for(int j=i;k<j;j--)
		{	
				temp=binary[k];
				binary[k]=binary[j];
				binary[j]=temp;
				k++;
			
		}
		for(int l=0;l<binary.length;l++)
		{
			System.out.print(binary[l]);
		}
		
	}

}
