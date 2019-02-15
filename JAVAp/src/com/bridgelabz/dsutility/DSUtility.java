package com.bridgelabz.dsutility;
import java.io.*;
public class DSUtility {
	
	/**
	 * Function: Used to Read a File
	 * @param word: Array of String 
	 * @return: Array of String
	 */
	public static String[] readFile(String []word)
	{
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
		return word;
	}

	/**
	 * Function: Used to Write a File
	 * @param wordList: Is an Object of LinkedList
	 * @return: wordList of Type LinkedList
	 */
	public static LinkedList writeFile(LinkedList wordList) 
		{
			try
				{
					
					BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
					while(!wordList.isEmpty()) {
						bw.write(wordList.get()+" ");
					}
		            bw.flush();
					bw.close();
				}
			catch(Exception e) 
				{
					e.printStackTrace();
				}
				return wordList;
		}	
		
	}
