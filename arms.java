import java.util.Scanner;

class arms {
    void solve(int n)
    {
        int sum = 0;
        int length = (int)Math.log10(n) + 1;
        int num = n;
        if(n > 1000 || n < 1) {
            System.out.println("Invalid");
            return;
        }
        while(n > 0) 
        {
            int d = n % 10;
            sum += (int)Math.pow(d, length);
            n /= 10;
        }
        if(sum == num)
            System.out.println("Yes, it is an Armstrong Number");
        else
            System.out.println("No, it is not an Armstrong Number");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 1000");
        int n = sc.nextInt();

        arms obj = new arms();
        obj.solve(n);
    }
}
