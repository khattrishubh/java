import java.util.Scanner
class prine
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for ( int i=2; i<=limit; i++)
        {
            for( int j=0;j<i/2;j++)
            {
                if(i%j==0){
                    c++;
                    if(c==2)
                    {
                        
                    }
                }
            }
        }
    }
}