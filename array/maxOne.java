import java.util.Scanner;
public class maxOne
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp=0;
        int c =1;
        for( int i=0 ; i<n-1 ;i++)
        {
            if(arr[i] == arr[i+1] && arr[i] ==1)
            {
                c++;
            }
            if( temp > c)
            {
                c = temp;
            }
        }
        System.out.println(c);
    }
}