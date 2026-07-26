import java.util.Scanner;
class LC73
{
    public void zero( int[][] matrix, int x, int y)
    {
        for( int j=0; j<matrix[0].length; j++)
        {
            matrix[x][j] = 0;
        }

        for( int i=0; i<matrix.length; i++)
        {
            matrix[i][y] = 0;
        }

    }
    public void setZeroes(int[][] matrix)
    {
        for( int i=0; i<matrix.length; i++)
        {
            for( int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    zero(matrix, i, j);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for( int i=0; i<m; i++)
        {
            for( int j=0; j<n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        LC73 obj = new LC73();
        obj.setZeroes(matrix);
        for( int i=0; i<m; i++)
        {
            for( int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}