import java.util.Scanner;
class LC424
{
    public int characterReplacement(String s, int k)
    {
        int[] freq = new int[26];
        int left =0;
        int maxFreq = 0;
        int answer = 0 ;

        for( int right=0; right<s.length(); right++)
        {
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq , freq[s.charAt(right)-'A']);

            while((right-left+1)- maxFreq > k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
             
            answer = Math.max(answer, right-left+1);
        }
        return answer;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String s = sc.next();

        LC424 obj = new LC424();

        int result = obj.characterReplacement (s , k);

        System.out.println(result);
    }
}