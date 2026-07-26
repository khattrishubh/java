import java.util.HashMap;
import java.util.Scanner;
public class count_hash
{
    void hash( String str)
    {
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            if(hm.containsKey(ch))
            {
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for (char key : hm.keySet()) {
            System.out.println(key + " -> " + hm.get(key));
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        count_hash obj = new count_hash ();
        obj.hash(str);
    }
}