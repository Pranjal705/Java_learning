package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// Write a program to calculate the sum of the series upto the value of n:
		// 1 + 1/2 + 1/3 + ..................+ 1/n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float sum = 0;
		for(float i = 1; i<=n; i++)
		{
			sum += (1/i);
		}
		System.out.println(sum);
	}

}
