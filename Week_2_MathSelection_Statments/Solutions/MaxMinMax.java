/* 
not manipulate user input, creating your own if/else to test max and using the Math class max method
Understandin pow returns a double*/

import java.util.Scanner;
public class MaxMinMax
{
	public static void main(String[] args)
	{
		double n1 , n2;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter n1: ");
		n1 = kb.nextInt();
		
        System.out.print("Enter n2: ");	
		n2 = kb.nextInt();
		
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);
		
		if(n1 > n2)
		{
			System.out.println("Absolute value of " + n1 + " is greater than " + n2);
			double n1Temp = Math.pow(n1, n2);
			double n2Temp = Math.pow(n2, n1);
			System.out.println("The new Max is: " + Math.max(n1Temp, n2Temp));
			
		}
		else if(n2 > n1)
		{
			System.out.println("Absolute value of " + n2 + " is greater than " + n1);
			double n2Temp = Math.pow(n2, n1);
			double n1Temp = Math.pow(n1, n2);
			System.out.println("The new max is: " + Math.max(n1Temp, n2Temp));

		}
		else
		{
			System.out.println("Their values are equal.");
		}
	
	}
}