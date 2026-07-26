import java.util.Scanner;
public class union {
    void code(int[] nums, int n1, int[] temp, int n2)
    {
        int[] last= new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(nums[i]==temp[j])
                {
                    last[i] =nums[i];
                }
                else {
                    last[i] =temp[j];
                }
            }
        }
        for(int i=0;i<(n1+n2);i++)
        {
           System.out.print(" "+last[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int[] nums= new int[n1];
        for(int i=0;i<n1;i++)
        {
            nums[i]= sc.nextInt();
        }
        int n2= sc.nextInt();
        int[] temp= new int[n2];
        for(int j=0;j<n2;j++)
        {
            temp[j]= sc.nextInt();
        }
        union obj= new union();
        obj.code(nums,n1,temp,n2);
    }
}
