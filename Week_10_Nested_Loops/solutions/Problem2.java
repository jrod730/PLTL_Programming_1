public class Problem2
{
	public static void main(String[] args)
	{
		int row = 10, col = 10;
		
		for(int i = 1; i <= row; i++)
		{
			for(int j = 1; j <= col; j++)
			{
				if(i == 1)
					System.out.print(j + "  ");
				else if(j == 1 && i != row)
					System.out.print(i + "  ");
				else if( i == col|| j == row)
					System.out.print(i * j + " ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}	
	}
}