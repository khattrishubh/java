import java.util.HashMap;
import java.util.Scanner;
class lc_242
{
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character, Integer> freqS = new HashMap<>();
        HashMap<Character, Integer> freqT = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char ss = s.charAt(i);
            freqS.put(ss,freqS.getOrDefault(ss,0)+1);
        }

        for(int i=0; i<t.length(); i++)
        {
            char tt = t.charAt(i);
            freqT.put(tt,freqS.getOrDefault(tt,0)+1);
        }
        return freqS.equals(freqT);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        lc_242 obj = new lc_242();
        boolean result = obj.isAnagram(s,t);
        System.out.println( ""+result);
    }
}