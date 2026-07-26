import java.util.HashMap;
import java.util.Scanner;
public class isomorphic
{
    void func(String str)
    {
        HashMap<Character,Integer> freq = new HashMap<>();

        for( int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            if(freq.containsKey(ch))
            {
                freq.put(ch,freq.get(ch)+1);
            }
            else{
                freq.put(ch,1);
            }
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        isomorphic obj = new isomorphic ();
        obj.func(str);
    }
}