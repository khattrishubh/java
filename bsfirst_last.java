import java.util.*;
class bsfirst_last {
    int[] solve(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int first = -1, last = -1;

        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid-1;// target toh starting mei mil jayega aur repeayinhg elemnt tou uske baad hi hpga naa
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

         
        start = 0;
        end = nums.length - 1;

        
        while (start <= end) {
           int mid = (start + end) / 2;
           if (nums[mid] == target) {
           last = mid;
              start = mid + 1; // target toh mid ke baad hi ayega
           } else if (nums[mid] < target) {
              start = mid + 1;
           } else {
                end = mid - 1;
           }
        }
        return new int[]{first, last};

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        bsfirst_last obj = new bsfirst_last();
        int[] result = obj.solve(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
