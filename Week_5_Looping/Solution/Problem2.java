import java.util.Scanner;
public class Problem2
{
   public static void main(String[] args)
   {
      int n = 0, temp, sum = 0, counter = 1;
      Scanner kb = new Scanner(System.in);
      
      do
      {
         temp = n; //holds temp value
         System.out.print("Enter int: ");
         n = kb.nextInt();
         
         sum += n;
         
         if(temp == (n - 1))//checks if n is +1 from last entry
            counter++;
         else
            counter = 1;
         

      }while(counter != 3);
      
      System.out.println(sum);
      
   }//end main
}//end class