import java.util.Scanner;
class LC2149 {

   public int[] rearrangeArray(int[] nums)
   {
        int j=0;
        int n = nums.length;
        int k= n/2;
        int[] arr = new int[nums.length];
        for( int i=0; i<nums.length; i++)
        {
            if(nums[i] > 0)
            {
                arr[j++] = nums[i];
            }
            else
            {
                arr[k++] = nums[i];
            }
        } 
        int i=0; 
        int p=0;
        int q=n/2;
        while( i<q && q<n)
        {
            nums[i++]=arr[p++];
            nums[i++]=arr[q++];
        }
        return nums;
   }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LC2149 obj = new LC2149();
         int[] result = obj.rearrangeArray(nums);

        for (int x : result) 
        {
            System.out.print(x + " ");
        }
    }
}