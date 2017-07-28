public class Problem1
{
	public static void main(String[] args)
	{
		int[][] a1 = {{1, 2, 3, 4},
					  {5, 6, 7, 8},
					  {2, 1, 5, 9},
					  {10, 2, 3, 10}};
					  
		int[][] a2= {{3, 4, 7, 10},
					 {19, 50, 4, 6},
					 {2, 5, 11, 74},
					 {1, 2, 3, 4}};
					  
		System.out.println(diagSquare(a1));
		System.out.println(diagSquare(a2));
	}
	public static boolean diagSquare(int[][] a)
	{
		int sumL = 0, sumR = 0;
		
		for(int i = 0; i < a.length; i ++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(i == j)
					sumL += a[i][j];
				if((a[i].length - i - 1) == j)
					sumR += a[i][j];
					
			}
		}
		if(sumL == sumR)
			return true;
		else
			return false;
	
	}
}