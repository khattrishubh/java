import java.util.Scanner;
public class cf2174
{
    boolean block (int[] nums , int n)
    {
        int start=0;
        int c=1;

        while( nums[start] > 0)
        {
            if(nums[start] == 0)
            {
                return false;
            }
            if( nums[start] == nums[start+1] )
            {
                c++;
                if( c == nums[start])
                {
                    return true;
                }
                start++;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for(int i =0;i<n;i++) 
        {
            nums[i]= sc.nextInt();
        }
        cf2174 obj = new cf2174();
        boolean result = obj.block(nums,n);
        System.out.println(" "+ result);
    }
}