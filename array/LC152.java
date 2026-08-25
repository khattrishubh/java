import java.util.*;
class LC152
{
    public int maxProduct(int[] nums)
    {
        
        int n = nums.length;
        int maxmax = nums[0];
        int minmin = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            int number1 = x * maxmax;
            int number2 = x * minmin;

            int newMax = Math.max(x, Math.max(number1, number2));
            int newMin = Math.min(x, Math.min(number1, number2));

            maxmax = newMax;
            minmin = newMin;

            answer = Math.max(answer, maxmax);
        }

        return answer;
    }
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for( int i =0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        LC152 obj = new LC152();
        int result = obj.maxProduct(nums);
        System.out.println(result);
    }
}