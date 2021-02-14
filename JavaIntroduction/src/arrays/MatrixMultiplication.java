package arrays;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// Perform a Matrix Multiplication
		// Conditions to do matrix multiplication
		// Number of columns of first matrix = number of rows of second matrix
		// The resultant matrix is m1xn2 where m1xn1 and m2xn2 are the order of two operand matrices
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of first Matrix: ");
		int rows1 = sc.nextInt();
		int cols1 = sc.nextInt();
		
		
		
		System.out.println("Enter the dimensions of Second Matrix: ");
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		
		
		
		if(cols1 == rows2)
		{
			int[][] a = new int[rows1][cols1];
			int[][] b = new int[rows2][cols2];
			int[][] c = new int[rows1][cols2];
			
			System.out.println("Enter the elements of first Matrix: ");
			for(int i=0; i<rows1; i++)
			{
				for(int j=0; j<cols1; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter the elements of second matrix: ");
			int element = 0;
			for(int i=0; i<rows2; i++)
			{
				for(int j=0; j<cols2; j++)
				{
					b[i][j] = sc.nextInt();
				}
			}
			for(int i=0; i<rows1; i++)
			{
				for(int j=0; j<cols2; j++)
				{					
					c[i][j] = 0;
					for(int k=0; k<rows2; k++)
					{
						c[i][j] += a[i][k] * b[k][j];
					}
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
			
			
			
		}
		else
		{
			System.out.println("Inappropriate dimensions entered! ");
		}
		
	}

}
