import java.util.Scanner;
public class Problem1
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		boolean[] check = new boolean[9999];
		int index = 0, count = 0;
		boolean x = true;
		
		do
		{
			System.out.print("Enter an int: ");
			index = kb.nextInt();
			
			if(check[index])
			{
				if(count == 1)
					System.out.println("You have entered " + count + " value");
				else
					System.out.println("You have entered " + count + " values");
					
				x = false;
			}
			
			check[index] = true;
				
			count++;
			
		}while(x);
	
		
		
	}//end main
}//end class