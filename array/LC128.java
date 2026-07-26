import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class LC128
{
    public int longestConsecutive(int[] nums)
    {
        int n = nums.length;
        if(n==0) return 0;
        int longest =1 ;

        Set <Integer> st = new HashSet<>();
        for( int i =0; i<n; i++)
        {
            st.add(nums[i]);
        }

        for( int it: st) 
        {
            if( !st.contains(it-1))
            {
                int cnt=1;
                int x= it;

                while( st.contains(x+1))
                {
                    cnt++;
                    x++;
                }
                longest = Math.max(longest,cnt);
            }
        }

        return longest;
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
        LC128 obj = new LC128();
        System.out.println(obj.longestConsecutive(nums));
    }
}