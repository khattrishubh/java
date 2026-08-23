import java.util.Scanner;
class LC209
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int n = nums.length;
        int left =0;
        int min = Integer.MAX_VALUE;
        int sum=0;

       for( int right =0; right <n; right++)
       {
            sum += nums[right];

            while( sum>= target)
            {
                min = Math.min(min, right-left+1);
                sum -= nums[left];
                left++;
            }
       }
       return min== Integer.MAX_VALUE ? 0:min;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for( int i=0; i<n; i++)
        {
            nums[i]= sc.nextInt();
        }
        LC209 obj = new LC209();
        int result = obj.minSubArrayLen (target,nums);
        System.out.println(result);
    }
}