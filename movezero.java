import java.util.Scanner;
public class movezero
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=-1;j<n;j++)
            {
                if(arr[i]!=0)
                    j=i;
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}