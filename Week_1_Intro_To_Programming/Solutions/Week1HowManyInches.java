/* taking user input, basic arithmetic, simple casting into double, modulus*/
import java.util.Scanner;

public class Week1HowManyInches
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int miles;
		System.out.print("Enter distance in miles (less than 50): ");
		miles = kb.nextInt();
		
		//1mile = 5280 times 12 gives you inches.
		int inches = (miles * 5280)  * 12;
		
		System.out.println("The distance in inches is:" + inches);

		inches = inches * 2 + 5;
		
		int feet = inches / 12;
		inches = inches % 12;

		
		System.out.println("Your new distance is " + feet + " ft. and " + inches + " in.");
		
		double newMiles = (feet + inches) / (5280 * 1.0);
		
		System.out.println("The total miles is now " + newMiles);
		
	}
}