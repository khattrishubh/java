import java.util.Scanner;
class LC11
{
    public int maxArea(int[] height)
    {   
        int n = height.length;
        int maxArea=0;
        int left=0;
        int right= n-1;
        int area=0;

        while(left<right)
        {
            int min = Math.min(height[left],height[right]);
            area = min * (right-left);
            maxArea = Math.max(area,maxArea);

            if( height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for( int i=0; i<n; i++)
        {
            height[i] = sc.nextInt();
        }

        LC11 obj = new LC11();
        System.out.println(obj.maxArea(height));
    }
}