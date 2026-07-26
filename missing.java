import java.util.Scanner;
public class missing {
    public void exe(int[] arr, int n)
    {
        for(int i =0;i<n-1;i++)
        {
            if(arr[i+1]!=arr[i]+1)
            {
                System.out.println(arr[i]+1);
            }
            else {
                continue;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter thesize");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();

        }
        missing obj = new missing();
        obj.exe(arr,n);
    }
}
