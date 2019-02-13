package com.BridgeLabz.Algorithm;
import com.BridgeLabz.FunctionalPrograms.Utility;

public class SearchingAndSorting
{
			
	private static final String String = null;

	public static void main(String[] args) {
		 
					/*Searching For String*/
		
		String[] names = new String[] {"man","women","animals","birds"};
		System.out.println("/*Binary Search For String*/");
		System.out.println();
		System.out.println("Enter String element to search:=");
		System.out.println();
		String stringElement = Utility.singleStringInput();
		Long startStringSearch = Utility.start();
		/*Bubble Sort Function*/
		names = Utility.bubbleSort(names);
		/*Binary Search Function*/
	    Utility.searchString(names,stringElement);
	    Long stopStringSearch = Utility.stop();
	    Long timeStringSearch = Utility.timeEllapse(startStringSearch, stopStringSearch);
	    System.out.println();
	    System.out.println("Time Taken by String Searching is:="+timeStringSearch+" Nano Seconds");
	    
	    
	    			/*Searching For Integer*/
	    
	    String []integerSearchArray = new String[] {"2","1","9","6","3","0"};
	    System.out.println();
	    System.out.println("/*Binary Search For Integer*/");
	    System.out.println();
	    System.out.println("Enter Integer element to search:=");
		String integerElement = Utility.singleStringInput();
		Long startIntegerSearch = Utility.start();
		/*Bubble Sort Function*/
		integerSearchArray = Utility.bubbleSort(integerSearchArray);
		/*Binary Search Function*/
	    Utility.searchString(integerSearchArray,integerElement);
	    Long stopIntegerSearch = Utility.stop();
	    Long timeIntegerSearch = Utility.timeEllapse(startIntegerSearch, stopIntegerSearch);
	    System.out.println();
	    System.out.println("Time Taken by Integer Searching is:="+timeIntegerSearch+" Nano Seconds");
	    
	    					/*Bubble Sort For Integer*/
	    
	    String []integerSortArray = new String[] {"8","9","2","0","7","6"};
	    System.out.println();
	    System.out.println("/*Bubble sort for Integer*/");
	    System.out.println();
	    System.out.println("Before Sorting:=");
	    for(int i=0;i<integerSortArray.length;i++)
	    {
	    	System.out.print(" "+integerSortArray[i]);
	    	
	    }
	    Long startIntegerSort = Utility.start();
	    /*Bubble Sort Function*/
	    integerSortArray = Utility.bubbleSort(integerSortArray);
	    Long stopIntegerSort  = Utility.stop();
	    Long timeIntegerSort  = Utility.timeEllapse(startIntegerSort , stopIntegerSort );
	    System.out.println();
	    System.out.println("Time Taken by Integer Sorting is:="+timeIntegerSort +" Nano Seconds");
	    System.out.println();
	    System.out.println("After Sorting:=");
	    for(int i=0;i<integerSortArray.length;i++)
	    {
	    	System.out.print(" "+integerSortArray[i]);
	    	
	    }
	    System.out.println();
	    
	    			/*Bubble Sort For String*/
	    
	    String []stringSortArray = new String[] {"man","women","animals","birds"};
	    System.out.println();
	    System.out.println("/*Bubble sort for String*/");
	    System.out.println();
	    System.out.println("Before Bubble Sorting:=");
	    for(int i=0;i<stringSortArray.length;i++)
	    {
	    	System.out.print(" "+stringSortArray[i]);
	    	
	    }
	    Long startStringSort = Utility.start();
	    /*Bubble Sort Function*/
	    stringSortArray = Utility.bubbleSort(stringSortArray);
	    Long stopStringSort  = Utility.stop();
	    Long timeStringSort  = Utility.timeEllapse(startStringSort , stopStringSort );
	    System.out.println();
	    System.out.println("Time Taken by Integer Bubble Sorting is:="+timeStringSort +" Nano Seconds");
	    System.out.println();
	    System.out.println("After Bubble Sorting:=");
	    for(int i=0;i<stringSortArray.length;i++)
	    {
	    	System.out.print(" "+stringSortArray[i]);
	    	
	    }
	    
	    /*Insertion Sort For String*/
	    
	    String []stringInsertionSortArray = new String[] {"man","women","animals","birds"};
	    System.out.println();
	    System.out.println("/*Insertion sort for String*/");
	    System.out.println();
	    System.out.println("Before Insertion Sorting:=");
	    for(int i=0;i<stringInsertionSortArray.length;i++)
	    {
	    	System.out.print(" "+stringInsertionSortArray[i]);
	    	
	    }
	    Long startStringInsertionSort = Utility.start();
	    /*Insertion Sort Function*/
	    stringInsertionSortArray = Utility.insertionSort(stringInsertionSortArray);
	    Long stopStringInsertionSort  = Utility.stop();
	    Long timeStringInsertionSort  = Utility.timeEllapse(startStringInsertionSort , stopStringInsertionSort );
	    System.out.println();
	    System.out.println("Time Taken by String Insertion Sorting is:="+timeStringInsertionSort +" Nano Seconds");
	    System.out.println();
	    System.out.println("After Insertion Sorting:=");
	    for(int i=0;i<stringSortArray.length;i++)
	    {
	    	System.out.print(" "+stringInsertionSortArray[i]);
	    	
	    }
	    
	    		/*Insertion Sorting For Integer*/
	    
	    String []integerInsertionSortArray = new String[] {"7","8","0","1","3","2"};
	    System.out.println();
	    System.out.println("/*Insertion sort for String*/");
	    System.out.println();
	    System.out.println("Before Insertion Sorting:=");
	    for(int i=0;i<integerSortArray.length;i++)
	    {
	    	System.out.print(" "+integerInsertionSortArray[i]);
	    	
	    }
	    Long startIntegerInsertionSort = Utility.start();
	    System.out.println();
	    /*Insertion Sort Function*/
	    integerInsertionSortArray = Utility.insertionSort(integerInsertionSortArray);
	    Long stopIntegerInsertionSort  = Utility.stop();
	    Long timeIntegerInsertionSort  = Utility.timeEllapse(startIntegerInsertionSort , stopIntegerInsertionSort );
	    System.out.println();
	    System.out.println("Time Taken by String Insertion Sorting is:="+timeIntegerInsertionSort +" Nano Seconds");
	    System.out.println();
	    System.out.println("After Insertion Sorting:=");
	    for(int i=0;i<integerSortArray.length;i++)
	    {
	    	System.out.print(" "+integerInsertionSortArray[i]);
	    	
	    }
	}

}



