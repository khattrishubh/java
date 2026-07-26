import java.util.Scanner;

class LC121 {

    public int maxProfit(int[] prices)
    {
        int minPrice= Integer.MAX_VALUE;
        int max=0;
         
         for( int price:prices)
         {
            if(price<minPrice)
            {
                minPrice=price;
            }
            else
            {
                max= Math.max(max,price-minPrice);
            }
         }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        LC121 obj = new LC121();
        System.out.println(obj.maxProfit(prices));
    }
}