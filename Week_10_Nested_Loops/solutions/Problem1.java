import java.util.Scanner;
public class Problem1
{
	public static void main(String[] args)
	{
		int row;
		int col;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter rows: ");
		row = kb.nextInt();
	
		System.out.print("Enter col: ");
		col = kb.nextInt();
		
		
		
		for (int i = 1; i <= row; i++)
	    {
			for (int j = 1; j <= col; j++) 
			{
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
	}
	
}