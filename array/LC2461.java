import java.util.*;
class LC2461
{
    public long maximumSubarraySum(int[] nums, int k)
    {
        int n = nums.length;
        long sum = 0;
        long maxSum =0;
        int left =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int right =0; right <n; right++)
        {
            sum += nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            if( right - left + 1 > k)
            {
                int x = nums[left];
                sum -= x;
                map.put( x, map.get(x)-1);

                if( map.get(x) == 0)
                {
                    map.remove(x);
                }
                left++;
            }
            if(right - left + 1 == k && map.size()==k)
            {
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
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