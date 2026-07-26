
import javax.swing.*;
import java.util.Scanner;
public class array_easy {
    public void reverse(int[] arr, int i , int n )
    {
        int[] rev = new int[n];
        for(i=0;i<n;i++)
        {
            rev[i]= arr[n-i-1];
        }

    }
    public static int p1(int[] arr, int n) {
        int max;
        max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    void p2(int[] arr, int n) {
        int lar = p1(arr, n);
        int slar = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < lar && arr[i] > arr[i + 1]) {
                slar = arr[i];
            }
        }
        System.out.println(slar);
    }

    public static boolean p3(int[] arr, int n) {
        for (int i = 0; i < n - 2; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    void p4(int[] arr, int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+ arr[i]);
        }
    }

    public void p5(int[] arr, int n)  {
        int temp= arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]= temp;
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+ arr[i]);
        }
    }

    public void p6(int[] arr, int n, int k)
    {
        reverse(arr,0,k);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public void p7(int[] arr, int n)
    {
        for(int i =0; i<n-1;i++)
        {
            if(arr[i]==0)
            {
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int k=0;
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        array_easy obj = new array_easy();
        obj.reverse(arr,0,n);
        obj.p6(arr, n,k);
    }
}