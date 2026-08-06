import java.util.Scanner;
class LC26redo {

   public int removeDuplicates(int[] nums)
   {
        int left = nums[0];
        int right = nums[0];
        int n = nums.length;
        for( int i=0; i<n; i++)
        {
            if( nums[i] == nums[i+1])
            {
                left = nums[i];
                right = nums[i];
                right++;
            }
            else{
                for( int j=i+1; j<n; j++)
                {
                    nums[j] = nums[right];
                }
                left++;
            }
        }
        return -1;
   }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LC26redo obj = new LC26redo();
        obj.removeDuplicates(nums);
    }
}