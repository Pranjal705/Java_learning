package nestedForLoops;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
//      Make the following pattern
//		* * * * *
//		  * * * *
//		    * * *
//		      * *
//		        *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=5-i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
