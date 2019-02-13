package com.BridgeLabz.FunctionalPrograms;

public class TwoDArray {
	public static void main(String []args)
	{

		int [][]intmatrix = new int[3][3];
		
		double [][]doublematrix = new double[3][3];
		
		boolean [][]booleanmatrix = new boolean[3][3];
		
		System.out.println("Enter Integer values of matrix:=");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				intmatrix[i][j] = Utility.singleIntegerInput();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(intmatrix[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Enter Double of matrix:=");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				doublematrix[i][j] = Utility.singleDoubleInput();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(doublematrix[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Enter Boolean values of matrix:=");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				booleanmatrix[i][j] = Utility.singleBooleanInput();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(booleanmatrix[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
