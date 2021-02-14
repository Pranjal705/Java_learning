package nestedForLoops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
//      Make the following pattern
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the pattern: ");
		int n = sc.nextInt();
		for (int j=1; j<=n; j++)
		{
			for(int i=1; i<=n; i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
