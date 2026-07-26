import java.util.Arrays;
import java.util.Scanner;
class LCC189
{
    void reverse(int left, int right, int[] nums)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k)
    {
        int n = nums.length;
        k = k % n;

        reverse(0,n-1,nums);
        reverse(0, k-1, nums);
        reverse(k,n-1,nums);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for( int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        int k = sc.nextInt();

        LCC189 obj = new LCC189();
        obj.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}