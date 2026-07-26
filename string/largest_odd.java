import java.util.Scanner;
class largest_odd
{
    String func(String s)
    {
        for(int i=(s.length()-1); i>=0; i--)
        {
            char ch = s.charAt(i);
            if( (ch-'0') % 2 == 1)
            {
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        largest_odd obj = new largest_odd();
        String result = obj.func(s);
        System.out.println(" "+ result);
    }
}