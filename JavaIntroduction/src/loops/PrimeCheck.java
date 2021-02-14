package loops;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// Check whether the entered number is Prime number or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Prime: ");
		int n = sc.nextInt();
		int Prime = 1;
		if (n==0 || n==1 || n<0)
		{
			System.out.println("The number is not Prime.");
		}
		else 
		{
			for(int i = 2; i<n/2; i++)
			{
				if(n%i == 0)
				{
					Prime = 0;
					break;
				}
				
			}
			if(Prime == 1)
			{
				System.out.println("The number is Prime.");
			}
			else
			{
				System.out.println("The number is not Prime.");
			}
		}
		
		

	}

}
