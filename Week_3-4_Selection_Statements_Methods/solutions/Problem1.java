import java.util.Scanner;
public class Problem1
{
	public static void main(String[] args)
	{
		int n1, n2;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter n1: ");
		n1 = kb.nextInt();
		System.out.print("Enter n2: ");
		n2 = kb.nextInt();
		
		int x = max(n1, n2);
		
		if(n1 != n2)
			System.out.println("at: " + x);	
		
	}
	public static int max(int a, int b)
	{
		int max = a;
		
		if(a > b)
		{
			System.out.print("n1 is the max ");
			max = a;
		}
		else if(b > a)
		{
			System.out.print("n2 is the max ");
			max = b;
		}	
		else
			System.out.println("They are equal");
			
		return max;	
	}
}