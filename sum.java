import java.util.Scanner;
class sum
{
    void solve(int n)
    {
        int s=0;
        while(n>0)
        {
            int d=n%10;
            s+=d;
            n=n/10;
        }
        System.out.println("The Sum="+ s);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        sum obj= new sum();
        obj.solve(n);
    }
}