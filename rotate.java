import java.util.Scanner;
class rotate {
    void solve(int[][] matrix) 
    {
        int n = matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i =0;i<n;i++) 
        {
            for(int j =0;j<n;j++)
            {
                matrix[i][j]= sc.nextInt();
            }
        }
        rotate obj= new rotate();
        obj.solve(matrix);
    }
}