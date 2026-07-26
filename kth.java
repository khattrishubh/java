import java.util.*;
public class kth
{
    void largestnum(int k, int[] ar, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp= ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
        System.out.println("kth largest="+ar[n-k]);
        break;
        }
    }
    void smallestnum (int k, int[] ar, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp= ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("kth smallest="+ar[k-1]);
            break;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int[] ar= new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        kth obj= new kth();
        obj.largestnum(k,ar,n);
        obj.smallestnum(k,ar,n);
    }
}
