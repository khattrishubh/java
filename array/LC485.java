import java.util.Scanner;
class LC485
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int size=0;int c=0;
        for( int i=0; i<nums.length; i++) 
        {
            if(nums[i] == 1)
            {
                c++;
            }
            else
            {
                size = Math.max(c,size);
                c=0;
            }
        }
        size = Math.max(c,size);
        return size;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for( int i=0; i<n; i++)
        {
            nums[i]= sc.nextInt();
        }
        LC485 obj = new LC485();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}