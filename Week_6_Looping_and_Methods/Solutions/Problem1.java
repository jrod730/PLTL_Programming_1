import java.util.Scanner;
public class Problem1
{
	public static void main(String[] args)
	{
		int n;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter int (<20): ");
		n = kb.nextInt();
		
		isDivByFive(powerBaseTwo(n));
	}
	
	public static int powerBaseTwo(int n)
	{
		int product = 1;
		for(int i = n; i > 0; i--)
		{
			product *= 2;
		}
		
		System.out.println(product);
		return product;
	}
	
	public static void isDivByFive(int n)
	{
		if(n % 4 == 0)
			System.out.println(n / 4);
		else
			System.out.println(-1);
	}
	
}	