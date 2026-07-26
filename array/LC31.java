import java.util.Arrays;
import java.util.Scanner;
class LC31
{
    void reverse(int left, int right, int[] nums)
    {
        while(left < right)
        {
            swap(left,right,nums);
            left++;
            right--;
        }
    }
    void swap(int left, int right , int[] nums)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void nextPermutation(int[] nums)
    {
        int n= nums.length;
        int k =-1;
        for( int i= n-2; i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                k=i;
                break;
            }
        }

        if( k == -1)
        {
            reverse(0,n-1,nums);
            return;
        }

        for( int i = n-1; i>k; i--)
        {
            if( nums[k] < nums[i])
            {
                swap(k,i,nums);
                break;
            }
        }

        reverse(k+1,n-1,nums);
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

        LC31 obj = new LC31();
        obj.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}