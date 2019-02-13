package com.BridgeLabz.Algorithm;
import java.io.*;

import com.BridgeLabz.FunctionalPrograms.Utility;
public class SearchWordFromWordList {
	public static void main(String []args)
	{
		String []word=null;
		File file = new File("abc.txt");
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = br.readLine();
			while(br.readLine()!=null)
			{
				str = str+br.readLine();
			}
			word = str.split(" ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		word = Utility.bubbleSort(word);
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		System.out.println("Enter the Word to Search:");
		String element= Utility.singleStringInput();
		Utility.searchString(word, element);
	}
}	
