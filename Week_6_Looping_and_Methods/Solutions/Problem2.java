import java.util.Scanner;
public class Problem2
{
	public static void main(String[] args)
	{
		int n, count = 0, sum = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter 5 Integers: ");

		do{
				n = kb.nextInt();
				
				sum += sumEveryDigit(n);
				
				
				count++;
			}while(count != 5);
				
			System.out.println(sum);
			
	}
	public static int sumEveryDigit(int n)
	{
		int x = n / 10, sum = 0;
		
		for(int i = 0; i <= x; i++)
		{
			sum += n % 10;
			n = n / 10;
			
		}
		return sum;
	}
}