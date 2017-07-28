import java.util.Scanner;
public class Problem2
{
	public static void main(String[] args)
	{	
		int n;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = kb.nextInt();
		
		String[] s1 = nMinusString(n);
		
		printArray(s1);
	}
	public static String[] nMinusString(int n)
	{
		 String[] x = new String[n];
  
 		 for(int i = 0; i < x.length; i++)
    		x[i] = i + "";
			
		 return x;
    
	}
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}