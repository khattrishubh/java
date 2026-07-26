import static java.lang.Math.min;
import java.util.Scanner;
public class count {
    void num(int n)
    {
        int d,c=0;
        while(n>0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        System.out.println(c);
    }
    void rev(int n)
    {
        int d,reverse=0;
        while(n>0)
        {
            d= n%10;
            reverse = reverse*10+d;
            n=n/10;
        }
        System.out.println(reverse);
    }
    void palin(int n)
    {
        int d, rev=0;
        int number = n;
        while(n>0)
        {
            d= n%10;
            rev = rev*10+d;
            n=n/10;
        }
        if(rev==number)
        {
            System.out.println("Palindrome no");
        }
        else
        {
            System.out.println("not a Palindrome no");

        }
    }
    void gcd(int n1, int n2)
    {
        int greatest=1;
        for(int i =min(n1,n2);i>=1;i--)
        {
            if(n1%i==0&&n2%i==0)
            {
                greatest=i;
                System.out.print(" "+ i);
                break;
            }
        }
    }
    void fun1(int i, int n) {
        if (i >= n) {
            System.out.print(" " + i);
            return;
        }
        System.out.print(" " + i);
        fun1(i + 1, n);
    }
    int fun2(int i, int n)
    {
        if(i>n)
        {
            return 0;
        }
        else
        {
            return (i+ fun2(i+1,n));
        }
    }
    int fun3(int i, int n)
    {
        if (i>n)
        {
            return 1;
        }
        else
        {
            return i*fun3(i+1,n);
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        count obj= new count();
        int result = obj.fun3(1,n);
        System.out.println("Factorial="+ result);
    }
}
