

import java.util.Scanner;
public class bsrotate2
{
    public boolean search(int[] nums, int target)
    {
        int start = 0;
        int n = nums.length;
        int end = n-1;
        while(start <= end)
        {
            int mid= (start+end)/2;
            if(target == nums[mid])
            return true;
            if(nums[start]==nums[mid] && nums[mid]==nums[end])
            return true;
            if(nums[start]<= nums[mid])
            {
                if(nums[start]<=target && target <=nums[mid])
                {
                    end = mid-1;
                }
                else 
                {
                    start = mid+1;
                }
            }   
            else
            {
                if(target>= nums[mid] && target<=nums[end])
                {
                    start = mid+1;
                }
                else 
                {
                    end = mid-1;
                }
            }
        }
        return false;
    }
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        bsrotate2 obj = new bsrotate2();
        boolean result = obj.search(nums, target);
        if (result == false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}