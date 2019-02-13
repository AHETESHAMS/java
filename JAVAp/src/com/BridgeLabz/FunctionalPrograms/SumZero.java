package com.BridgeLabz.FunctionalPrograms;

public class SumZero {
	public static void main(String []args)
	{
//		int []arr = new int[]{-1,5,6,7,8,-5,4,-9,8,1};
		int []arr = new int[]{1, -1, 0, 2, -2};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=i+2;k<arr.length;k++)
				{
					int sum=arr[i]+arr[j]+arr[k];
						
					if(sum==0)
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"=0");
				}
			}
		}
	}
}
