import java.util.Scanner;
public class freq {
    void count(int[] arr,int n)
    { int c=1;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1; j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                     c++;
                }
            }
            System.out.println("Frequency of "+arr[i]+" = "+c);
            c=0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        freq obj = new freq();
        obj.count(arr,n);
    }
}
