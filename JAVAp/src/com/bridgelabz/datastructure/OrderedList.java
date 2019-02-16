package com.bridgelabz.datastructure;

import com.BridgeLabz.FunctionalPrograms.Utility;
import com.bridgelabz.dsutility.DSUtility;
import com.bridgelabz.dsutility.LinkedList;

public class OrderedList {

	public static void main(String[] args) {
		

		String element;
		String str;
		//Creation of Linked List Object
		LinkedList wordList = new LinkedList();
		String word[] = null;
		//Calling to readFile function to read a file
		word = DSUtility.readFile(word);
		
		for(int i=0;i<word.length;i++)
		{
			wordList.insertAtLast(word[i]);
		}
		//Calling to show function to display Linked List
		wordList.show();
		System.out.println("Enter a Word:=");
		//calling to function to get an input from user
		element = Utility.singleStringInput();
		//calling to search function to search element in Linked List
		boolean found = Utility.searchString(word, element);
		if(found)
			wordList.delete(element);
		else
		{
			wordList.insertAtLast(element);
		}
		wordList.sortList();
		//Calling to show function to display Linked List
		wordList.show();
		//Calling to writeFile function to write a file a file
		wordList = DSUtility.writeFile(wordList);
		
		
	}

}
