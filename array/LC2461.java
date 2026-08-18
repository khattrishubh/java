import java.util.Scanner;
class LC2461
{
    public long maximumSubarraySum(int[] nums, int k)
    {
        int n = nums.length;
        int low = 0 ;
        int high = k-1;
        long sum = 0;
        long res = Long.MIN_VALUE;
        for(int i=low; i<=high; i++)
        {
            sum += nums[i];
        }
        while(high<n)
        {
            res = Math.max(res,sum);
            low++;
            high++;

            if( high == n)
            {
                break;
            }
            sum = sum - nums[low-1];
            sum = sum + nums[high];
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for( int i=0; i<n; i++)
        {
            nums[i]= sc.nextInt();
        }
        LC2461 obj = new LC2461();
        long result = obj.maximumSubarraySum (nums,k);
        System.out.println(result);
    }
}