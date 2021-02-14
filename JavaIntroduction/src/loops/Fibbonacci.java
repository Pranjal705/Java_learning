package loops;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// Write a program to print the fibonacci series upto the number entered by the user.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print("The fibonacci series upto the given number is: ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i = 0; i<n-2; i++)
		{
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
			
		}

	}

}
