import java.util.Scanner;
public class Problem2
{
	public static void main(String[] args)
	{
		int n;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter n (<100): ");
		n = kb.nextInt();
		
		
		System.out.println("Sum is: " + sumOfDigits(n));
	}
	public static int sumOfDigits(int a)
	{
		int sum = a % 10;;
		sum += a / 10;
		
		return sum;
	}
}