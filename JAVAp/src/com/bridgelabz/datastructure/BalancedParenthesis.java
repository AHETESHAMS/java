package com.bridgelabz.datastructure;
import com.BridgeLabz.FunctionalPrograms.Utility;
import com.bridgelabz.dsutility.DSUtility;

public class BalancedParenthesis {

	public static void main(String[] args) {
		System.out.println("Enter the expression:=");
		String str  = Utility.singleStringInput();
		char []exp = str.toCharArray();
			if(DSUtility.areParenthesBalance(exp))
				System.out.println("Balanced!");
			else
				System.out.println("Not Balanced!");
	}

}
