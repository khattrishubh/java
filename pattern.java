import java.util.Scanner;
public class pattern
{
    void pattern7(int n)
    {
        for(int i =0;i<=n;i++)
        {
            for(int j=0;j<n+1-i;j++)
            {
                System.out.print(" ");
            }
            for(int k =0;k<(2*i)+1;k++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    void pattern8(int n)
    { int x=n;
        for(int i =0; i<=n; i++)
        {
            for(int j=0;j<n-x+1;j++)
            {
                System.out.print(" ");
            }
            for(int k =0;k<2*x+1;k++)
            {
                System.out.print("*");
            }
                x--;
            System.out.println();
        }
    }
    void pattern14(int n){
        for(int i=0;i<n;i++)
        {
            char ch = 'A';
            for(int j =0;j<=i;j++)
            {
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();

        }
    }
    void pattern15(int n){
        for(int i=0;i<=n;i++)
        {
            char ch = 'A';
            for(int j =0;j<n-i+1;j++)
            {
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();

        }
    }
    void pattern16(int n){
            char ch = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print(ch);
            }
            ch+=1;
            System.out.println();

        }
    }
    void pattern17(int n){
        for(int i=0;i<n;i++)
        {
            char ch = 'A';
            for(int j =0;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            int breakpoint = (i/2)+1;
            for(int k =0; k<2*i+1;k++)
            {
                System.out.print(ch);
                if(k<=breakpoint)
                {
                    ch++;
                }
                else {
                    ch--;
                }
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        pattern obj= new pattern();
        obj.pattern17(n);

    }
}