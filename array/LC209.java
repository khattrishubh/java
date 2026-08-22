import java.util.Scanner;
class LC209
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int n = nums.length;
        int low =0;
        int high = 0;
        int res = Integer.MAX_VALUE;
        int sum=0;

        while(high<n)
        {
            sum+= nums[high];

            while( sum>=target)
            {
                int len = high - low + 1;
                res = Math.min(res,len);
                sum -= nums[low];
                low++;
            }
            high++;
        }.        
        return res;
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