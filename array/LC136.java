import java.util.Scanner;
class LC136
{
    public int singleNumber(int[] nums) {
        int XOR =0 ;
        for( int i =0; i<nums.length; i++)
        {
            XOR=XOR^nums[i];
        }
        return XOR;
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
        LC136 obj = new LC136();
        System.out.println(obj.singleNumber(nums));
    }
}