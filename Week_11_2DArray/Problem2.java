public class Problem2
{
	public static void main(String[] args)
	{
		int[][] a1 = {{1, 2, 3, 4},
					  {5, 6, 7, 8},
					  {9, 10, 11, 12},
					  {13, 14, 15, 16}};
					  
		int[][] a2 = {{1, 3, 2, 4,},
					  {3, 5, 8, 7},
					  {12, 11, 16, 8},
					  {12, 14, 15, 16}};
					  
		
					  
		System.out.println(inSequence(a1));
		System.out.println(inSequence(a2));
	}
	public static boolean inSequence(int[][] a)
	{
		int count = 0;
	
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{	
				if(i == 0 && (j + 1) == a[i][j])
					count++;
				else if(i > 0 && (a[i - 1][a[i].length - 1] + (j + 1)) == a[i][j])
					count++;
					
			}//end inner
		}//end outerloop
		
		if(count == a[a.length - 1][a.length - 1])
			return true;
		else
			return false;
	}
}