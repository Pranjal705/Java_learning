package nestedForLoops;

import java.util.Scanner;

public class AdvancedPattern3 {

	public static void main(String[] args) {
//  	Make the following Pattern
//		*
//		* *
//		*   *
//		*     *
//		* * * * *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i==1 || i==n)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				System.out.print("* ");
				for(int k=1; k<=i-2; k++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
				System.out.println();
			}
		}
	}

}
