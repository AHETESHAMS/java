package com.BridgeLabz.Algorithm;

public class Util {
	/**
	 * Function:Performs a Formula Based calculations 
	 * for day of the week of given date
	 * @param d:Integer value for day
	 * @param m:Integer value for month
	 * @param y:Integer value for year
	 * @return Integer Day
	 */
	static int dayOfWeek(int d, int m, int y) 
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
	/**
	 * Function:calculate monthly payment for r interest and p principal for y years
	 *
	 * @param p the principal amount given
	 * @param y the year for which p is given
	 * @param r the rate at which p is given
	 * @return Integer monthly payment
	 */
	static double monthlyPayment(double p, double y, double r) {
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}
	
	/**
	 * Function: To find the square root of given no
	 *
	 * @param c the value to find square root of
	 * @return return the square root in Integer
	 */
	static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
	}
	
	/**
	 * Function: Convert Celsius to Fahrenheit vice versa
	 * @param temp: integer value for Temperature
	 * @param choice: Choice among Celsius and Fahrenheit
	 * @return: Converted Result
	 */
	
	static int temperatureConverter(int temp,int choice)
	{
		int result=0;
		if(choice == 1)
		{
			result = (temp * 9/5) + 32;
			return result;
		}
		else
		{
			result = (temp - 32) * 5/9;
			return result;
		
		}
		
	}


}
