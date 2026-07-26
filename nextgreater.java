import java.util.*;
public class nextgreater {
    void greater(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
        {
            int next = -1;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] > arr[i])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        nextgreater obj = new nextgreater();
        obj.greater(arr,n);
    }
}