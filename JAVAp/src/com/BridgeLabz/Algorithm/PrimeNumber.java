package com.BridgeLabz.Algorithm;

import com.BridgeLabz.FunctionalPrograms.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num,cnt=0;
		System.out.println("1 is Prime Number!");
		for(num=3;num<=1000;num++)
		{	
		
			cnt = Utility.checkPrime(num);	
			if(cnt==0)
				System.out.println(num+" is Prime Number!");
		}
		
	}	

}
