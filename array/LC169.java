import java.util.HashMap;
import java.util.Scanner;

class LC169 {

    public int majorityElement(int[] nums)
    {

        int num = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (freqMap.get(nums[i]) > (nums.length/2)) {
                num = nums[i];
                break; 
            }
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        LC169 obj = new LC169();
        System.out.println(obj.majorityElement(nums));
    }
}