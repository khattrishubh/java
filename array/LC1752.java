import java.util.Scanner;

class LC1752 {

    public boolean check(int[] nums, int n) {
        int count = 0;
        for(int i=1; i<n; i++) 
        {
            if(nums[i-1] > nums[i])
            count++;
        }

        if(nums[n-1] > nums[0])
        count++;

        return (count <= 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LC1752 obj = new LC1752();
        System.out.println(obj.check(arr, n)); 
    }
}