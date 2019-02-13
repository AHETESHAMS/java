package com.BridgeLabz.FunctionalPrograms;
import java.util.*;
class StopWatch
{
	public static void main(String []args) throws InterruptedException
	{
		Date date = new Date();
		
		Long start = Utility.start();
		
	    System.out.println("Start time:="+date.toString());
		
		Thread.sleep(5000);
		
		Long stop = Utility.stop();
		
	    System.out.println("Stop time:="+date.toString());
		
		Long time = Utility.timeEllapse(start,stop);
		
		System.out.print("Time ellapse:="+time);
	}
}