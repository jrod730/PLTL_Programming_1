public class Problem1
{

	public static void main(String[] args)
	{
		boolean[][] b1 = {{false, true, false, true, true},
					  	{true, false, false, true, true},
					  	{false, false, true, true, false}};
					  
		boolean[][] b2 = {{true, false, true, false},
					  	{false, false, true, false}};
						
		print2DArray(binaryArr(b1));
		System.out.println();
		print2DArray(binaryArr(b2));
						
	}
	public static int[][] binaryArr(boolean[][] a)
	{
		int[][] x = new int[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(a[i][j])
					x[i][j] = 1;
				else
					x[i][j] = 0;
			}//end innerloop	
		}//end outloop
		
		
		return x;
	}//end method
	
	public static void print2DArray(int[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}