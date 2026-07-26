import java.util.Scanner;
class LC26
{
    public int removeDuplicates(int[] nums)
    {
        int k=1;
        int n = nums.length;
        for( int i=1; i<n; i++)
        {
            if(nums[i-1] != nums[i])
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i]= sc.nextInt();
        }
        LC26 obj = new LC26();
        int k = obj.removeDuplicates(nums);

        System.out.println(k);
        for( int i=1; i<k; i++)
        {
            System.out.println(nums[i]+ " "); 

        }
    }
}