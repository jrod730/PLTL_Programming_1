/*
 mod and divison and their differences, nested if/else
introduction to using counter */

import java.util.Scanner;
public class CheckIfSame
{
	public static void main(String[] args)
	{
		int n1, n2, quo1, quo2, rem1, rem2, counter = 0;
		
		Scanner kb = new Scanner(System.in);
		
	 	System.out.print("Enter n1: ");
		n1 = kb.nextInt();
		
		System.out.print("Enter n2: ");
		n2 = kb.nextInt();
		
		quo1 = n1 / 10;
		quo2 = n2 / 10;
		
		rem1 = n1 % 10;
		rem2 = n2 % 10;
		
		if(quo1 == quo2)
		{
			System.out.println("The quotients are the same!");
			counter++;
		}
		if(rem1 == rem2)
		{
			System.out.println("They are both divisible by ten!");
			counter++;
			
		}
		if(counter == 1)
			System.out.println("Either quotient or remainder are the same!");
		else if(counter == 2)
		{
			if(quo1 % 2 == 0 && quo2 % 2 == 0)
				System.out.println("The quotient is divisible by two!");
			else
				System.out.println("The quotient is not divisible by 2.");
		}
		else
			System.out.println("Nothing is the same");
		
		
	}
	
}