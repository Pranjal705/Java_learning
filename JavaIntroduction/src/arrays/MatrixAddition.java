package arrays;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// Take dimensions and input from the user and perform matrix addition
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of the matrix: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];
		System.out.println("Enter the elements of 1st matrix: ");
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of 2nd array: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		int[][] c = new int[rows][cols];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("The reultant matrix is: ");
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}