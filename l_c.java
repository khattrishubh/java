import java.util.Scanner;
public class l_c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c=0;
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        int min = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] == min)
                c++;
            min++;
        }
        System.out.println(c);
    }
}