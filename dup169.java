import java.util.Scanner;
import java.util.HashMap;
class dup169
{
    public int majorityElement(int[] nums)
    {
        int num = 0;
        HashMap <Integer,Integer> map = new HashMap<>();

        for( int i=0; i<nums.length; i++)
        {
            map.put( nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for( int i=0; i<nums.length; i++)
        {
            if( map.get(nums[i]) > (nums.length/2))
            {
                num = nums[i];
                break;
            }
        }
        return num;
    }
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];
        for( int i=0; i<n; i++)
        {
            nums[i]= sc.nextInt();
        }

        dup169 obj = new dup169();
        System.out.println(obj.majorityElement(nums));
    }
}