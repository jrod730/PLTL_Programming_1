public class Problem2
{
	public static void main(String[] args)
	{
		int[] a1 = {2, 5, 37, 103, 94, 71, 67, 99, 43, 21};
		
		int[][] a2 = change2D(a1);
		
		int[] b1 = {3, 2, 6, 7};
		
		int[][] b2 = change2D(b1);
		
		
		
	}
	public static int[][] change2D(int[] a)
	{
		int count = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 != 0)
				count++;
		}
		
		count /= 2;
		
		int[][] b1 = new int[2][count];
		
		int j = 0, k = 0; 
		int newCount = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 != 0)
			{
				
				if(count == newCount)
				{
					k = 0;
					j++;
				}
				
				b1[j][k] = a[i];
				k++;
				newCount++;
			}
		}
		
		return b1;
	}
}