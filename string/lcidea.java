import java.util.Scanner;
public class lcidea
{
    String func(String s)
    {
        String rev= "";
        int first =0;
        int last = s.length() -1;
        for(int i = s.length()-1 ; i>=0 ; i++)
        {
            char chh = s.charAt(i);
            char ch = s.charAt(first);
            if(!Character.isLetter(s.charAt(ch)))
            {
                rev+=ch;
                first++;
            }
            else if(!Character.isLetter(chh))
            {
                rev+=chh;
                last--;
            }
            else 
            {
                rev+=ch;
            }
        }
        return rev;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        lcidea obj = new lcidea();
        String result = obj.func(s);
        System.out.println(result);
    }
}