import java.util.Scanner;
class revword
{
    String func(String s)
    {
        int n = s.length();
        String rev = "";
        int end =n;
        for(int i=n-1; i>=0 ;i--)
        {
            if(s.charAt(i) == ' ')
            {
                rev += s.substring(i+1,end) + " ";
                end=i;
            }
        }
        rev+=s.substring(0,end);
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        revword obj = new revword();
        String result = obj.func(s);
        System.out.println(result);
    }
}