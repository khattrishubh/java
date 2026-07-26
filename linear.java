import java.util.Scanner;
class linear
{
    public int searchInsert(int[] nums, int target) {
       int n = nums.length;
       int start=0;
       int end=n-1;
       int mid;
       while(start<=end)
       {
        mid= (start+end)/2;
        if(nums[mid]<target)
        {
            start= mid+1;
        }
        if(nums[mid]>target)
        {
            end= mid-1;
        }
        if(nums[mid]==target)
        return mid;
       }
       return start;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]= sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        linear obj= new linear();
        int result = obj.searchInsert(nums, target);
        System.out.println("Output: " + result);  
    }
}