import java.util.Arrays;
import java.util.Scanner;
class LC75
{
    public void sortColors(int[] nums)
    {
        int low=0;
        int mid=0;
        int high= nums.length-1;
        while(mid<=high)
        {
            if( nums[mid] == 0)
            {
                int temp = nums[mid];
                nums[mid]= nums[low];
                nums[low]= temp;
                low++;
                mid++;
            }

            else if( nums[mid] == 1)
            {
                mid++;
            }

            else
            {
                int temp = nums[mid];
                nums[mid]= nums[high];
                nums[high]= temp;
                high--;
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
        LC75 obj = new LC75();
        obj.sortColors(nums);
        System.err.println(Arrays.toString(nums));
    }
}