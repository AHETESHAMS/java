package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class BinarySwap {

	public static void main(String[] args) {
		
		int i,k=0,n,temp,p=0;
		double powerResult=0.00,sum=0.00;
		int []binary = new int[8];
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
		n=4;
		for(int l=0;l<n && n<binary.length;l++)
		{
			temp=binary[l];
			binary[l]=binary[n];
			binary[n]=temp;
			n++;
		}
		System.out.print("Decimal to Binary:=");
		for(int a=0;a<binary.length;a++)
		{
			System.out.print(binary[a]);
		}
		for(int b=binary.length-1;b>=0;b--)
		{
			if(binary[b]==1)
			{
				powerResult=1*Utility.calPower(2, p);
				System.out.println("powerResult="+powerResult);
				p++;
			}
			else
			{
				powerResult=0*Utility.calPower(2, p);
				System.out.println("powerResult="+powerResult);
				p++;
			}	
			sum = sum+powerResult;
		}
		System.out.println("Binary to Decimal:="+sum);
		
	}

}
