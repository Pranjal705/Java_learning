package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// Find x raised to y without using java built-in methods
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 1;
		if(x>0)
		{
			for(int i=1; i<=y; i++)
			{
				result = result *x;
			}
			System.out.println(result);
		}
		else if(x==0)
		{
			System.out.println(0);
		}
		
		

	}

}
