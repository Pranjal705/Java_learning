package whileLoops;

import java.util.Scanner;

public class DOWhileLoops {

	public static void main(String[] args) {
		// Take an integer number input from the user unless it gives 0 as input
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		do
		{
			System.out.println("Enter the value for n: ");
			n = sc.nextInt();
		}
		while(n!=0);

	}

}