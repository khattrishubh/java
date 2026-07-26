import java.util.Scanner;
public class palin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=  0;
        int num =n;
        while (n>0)
        {
            int d = n%10;
            rev = rev * 10 + d;
            n = n/10;
        }
        if( num == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}