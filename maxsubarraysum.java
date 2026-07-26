import java.util.*;
public class maxsubarraysum
{
    void maxsum(int[] arr, int n)
    {   int sum=0;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=0)
            {
                sum=0;
            }
            else
            {
                sum=sum+arr[i];
            }
            if(sum>temp)
            {
                temp=sum;
            }
        }System.out.println("sum="+temp);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        maxsubarraysum obj = new maxsubarraysum();
        obj.maxsum(arr,n);
    }
}
