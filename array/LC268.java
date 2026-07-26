import java.util.Scanner;
class LC268
{
    public int missingNumber(int[] nums) {
        int Nsum=0;
        int Osum =0;
        for(int i=0; i<nums.length; i++)
        {
            Nsum+= nums[i];
        }
        for(int i=0; i<=nums.length; i++)
        {
            Osum+= i;
        }
        return Osum-Nsum;
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
        LC268 obj = new LC268();
        System.err.println(obj.missingNumber(nums));
    }
}