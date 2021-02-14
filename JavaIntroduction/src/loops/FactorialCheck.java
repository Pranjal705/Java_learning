package loops;

import java.util.Scanner;
public class FactorialCheck {

	public static void main(String[] args) {
		// Finding a factorial of a number n.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n to calculate its facctorial: ");
		int n = sc.nextInt();
		if(n>0)
		{
			int factorial = 1;
			for(int i=1; i<=n; i++)
			{
				factorial*=i;
			}
			System.out.println("The factorial of the given number is: " + factorial);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
