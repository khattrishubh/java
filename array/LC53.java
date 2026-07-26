import java.util.Scanner;

class LC53 {

    public int maxSubArray(int[] nums)
    {
        int n = nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            sum+= nums[i];
            
            if( sum > max )
            {
                max=sum;
            }

            if( sum < 0 )
            {
                sum=0;
            }
        }
        return max;
    }
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LC53 obj = new LC53();
        System.out.println(obj.maxSubArray(nums));
    }
}