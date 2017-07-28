public class Problem2
{
	public static void main(String[] args)
	{
		
		char x = 'x';
		char a = 'a';
		char b = 'b';
		
		String s2 = x +"";
		
		
		String[] s1 = {"cat", "dog", "mouse", "x", "monkey", "tiger", "a"};
		
		
		
		boolean[] b1 = new boolean[3];

		b1[0] = checkChar(x, s1);
		System.out.println(b1[0]);
		
		b1[1] = checkChar(a, s1);
		System.out.println(b1[1]);
		
		b1[2] = checkChar(b, s1);
		System.out.println(b1[2]);
		
		
		
	}
	
	public static boolean checkChar(char c, String[] s1)
	{
		int count = 0;
		String x = c + "";
		
		for(int i = 0; i < s1.length; i++)
		{
			if(s1[i].equals(x))
				count++;
			
		}
		
		if (count != 0)
			return true;
		else
			return false;
	}
}