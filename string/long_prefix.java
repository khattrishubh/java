import java.util.Scanner;
class long_prefix
{
    int func(String haystack, String needle)
    {
        int i=0;
        while(i <= haystack.length()-needle.length() )
        {
            if(haystack.startsWith(needle,i))
            {
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        long_prefix obj = new long_prefix();
        int result = obj.func(haystack,needle);
        System.out.println(" "+ result);
    }
}