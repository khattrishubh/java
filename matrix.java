import java.util.Scanner;
class matrix
{
    void solve(int[][] arr, int n)
    {
        int x = 0,y = 0;
        int i,j = 0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    x=i;
                    y=j;
                }
            }
        }
        while(i==x && j<n)
        {
            arr[x][j] = 0;
            j++;
        }
        while(i<n && j==y)
        {
            arr[i][y] = 0;
            i++;
        }
         for(i =0;i<n;i++) 
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]= new int[n][n];
        for(int i =0;i<n;i++) 
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        matrix obj= new matrix();
        obj.solve(arr,n);
    }
}

