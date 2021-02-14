package nestedForLoops;

import java.util.Scanner;

public class AdvancedPattern1 {

	public static void main(String[] args) {
//  	Make the following Pattern
//		      *
//		    *   *
//		 *    *    *
//	  *    *    *    *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Pattern: ");
		int n = sc.nextInt();
		int num = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(num + "  ");
				num++;
			}
			System.out.println();
		}
	}

}