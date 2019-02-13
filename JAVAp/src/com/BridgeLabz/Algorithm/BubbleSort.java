package com.BridgeLabz.Algorithm;
import com.BridgeLabz.FunctionalPrograms.*;
public class BubbleSort 
{
	public static void main(String []args)
		{
			String []names = new String [] {"man","women","animals","birds"};
			System.out.println("Before Sorting:=");
			for(int i=0;i<names.length;i++)
			{
				System.out.println(""+names[i]);
			}
			names = Utility.bubbleSort(names);
			System.out.println("After Sorting:=");
			for(int i=0;i<names.length;i++)
			{
				System.out.println(""+names[i]);
			}
		}
}


