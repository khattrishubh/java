import java.util.Arrays;
import java.util.Scanner;
class LC283
{
    public void moveZeroes(int[] nums)
    {
        int j =0;
        for( int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[j];
                nums[j]= nums[i];
                nums[i]= temp;
                j++;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for( int i =0; i<n; i++)
        {
            nums[i]= sc.nextInt();
        }
        LC283 obj = new LC283();
        obj.moveZeroes(nums);
        System.err.println(Arrays.toString(nums));
    }
}