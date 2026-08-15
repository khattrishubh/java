import java.util.Scanner;

class LC167 {

    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }  

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        LC167 obj = new LC167();

        int[] result = obj.twoSum(numbers, target);

        System.out.println(result[0] + " " + result[1]);
    }
}