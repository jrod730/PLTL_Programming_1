import java.util.Scanner;
public class Problem1
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n;
		System.out.print("Enter n: ");
		n = kb.nextInt();
		
		isPrime(n);
	}
	public static void isPrime(int n)
	{
		int counter = 0;
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				counter++;
			}
		}
		boolean x = check(counter);
		System.out.println(x);
		
	}
	public static boolean check(int a)
	{
		boolean x = true;
		
		if(a >= 1)
			x = false;
			
		return x;
	}
}