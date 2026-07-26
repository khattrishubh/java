import java.util.Scanner;
class patternhollow
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||i==n||j==0||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}