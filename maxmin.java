import java.util.Scanner;
public class maxmin
{
    public static void main(String args[])
    {
        int max,min,n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min= arr[i];
            }
        }
        System.out.println("Max="+ max);
        System.out.println("Min="+ min);

    }
}