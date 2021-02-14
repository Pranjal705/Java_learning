package whileLoops;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// Find the sum of the digits of a inputed number.
		// When we don't know how many digits are there in the given number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int n = sc.nextInt();
		int sum = 0;
		while(n>0)
		{
			sum+= n%10;
			n/=10;
		}
		System.out.println("The sum of the given digit is: " + sum);
		
		// To know the number of digits in a number
//		int numberOfDIgits = (int)Math.log10(n);
		

	}

}
