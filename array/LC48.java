import java.util.Scanner;
class LC48{
    void transpose( int[][] matrix)
    {
        for( int i=0; i<matrix.length; i++)
        {
            for( int j=i; j<matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void rotate(int[][] matrix)
    {
        transpose(matrix);

        for (int[] matrix1 : matrix) {
            int left =0;
            int right = matrix.length-1;
            while (left<right) {
                int temp = matrix1[left];
                matrix1[left] = matrix1[right];
                matrix1[right] = temp;
                left++;
                right--;
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
        LC48 obj = new LC48();
        obj.rotate(matrix);
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