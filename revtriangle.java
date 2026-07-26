import java.util.Scanner;
class revtriangle
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a ;
        n = sc.nextInt();
        a=n;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(j==a)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("-");
                }
            }
            System.out.println();
            a--;
        }
    }
}