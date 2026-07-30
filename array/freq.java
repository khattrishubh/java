import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class freq
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for( int i=0;i<n;i++) 
        {
            nums[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i=0; i<n; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for( Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }
}