import java.util.*;
class LC567
{
    public boolean checkInclusion(String s1, String s2)
    {
        int k = s1.length();

        HashMap<Character,Integer> need = new HashMap<>();
        for( int i=0; i<k; i++)
        {
            char ch = s1.charAt(i);
            need.put(ch, need.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> window = new HashMap<>();
        
        int left =0;

        for( int right=0; right<s2.length(); right++)
        {
            char ch = s2.charAt(right);
            window.put( ch , window.getOrDefault(ch,0) + 1);

            if( right-left+1 > k)
            {
                char leftChar = s2.charAt(left);
                window.put( leftChar, window.get(leftChar) - 1);

                if( window.get(leftChar) == 0)
                {
                    window.remove(leftChar);
                }
                left++;
            }

            if( need.equals(window) && right -left+1 ==k)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        LC567 obj = new LC567();
        boolean result = obj.checkInclusion(s1,s2);
        System.out.println(result);
    }
}