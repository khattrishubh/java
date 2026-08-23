import java.util.*;
class LC567
{
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int k = p.length();

        HashMap<Character, Integer> need = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;
        for (int right = 0; right < s.length(); right++) 
        {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (right - left + 1 > k) {

                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }

                left++;
            }
            if (right - left + 1 == k && need.equals(window)) {
                ans.add(left);
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String p = sc.next();

        LC438 obj = new LC438();
        boolean result = obj.checkInclusion(s,p);
        System.out.println(result);
    }
}