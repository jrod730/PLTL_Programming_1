public class Problem1
{
   public static void main(String[] args)
   {
		int[] a1 = {1, 2, 3, 4, 100};
		int[] a2 = {1, 1, 5, 5, 10, 8, 7};
		int[] a3 = {-10, -4, -2, -4, -2, 0};
		
		System.out.println(centeredAverage(a1));
		System.out.println(centeredAverage(a2));
		System.out.println(centeredAverage(a3));
   }
   public static int centeredAverage(int[] nums) 
   {
      int max = nums[0], min = nums[0], maxCount = 0, minCount = 0, sum = 0;
      for(int i = 0; i < nums.length; i++)
      {
          max = Math.max(max, nums[i]);
          min = Math.min(min, nums[i]);
      }
      for(int i = 0; i < nums.length; i++)
      {
          if(maxCount < 1 && nums[i] == max)
              maxCount++;
          else if(minCount < 1 && nums[i] == min)
              minCount++;
          else
              sum += nums[i];
    
      }
 
  
  return sum / (nums.length - 2);
}

}