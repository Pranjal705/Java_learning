package loops;

import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		// Compute the natural logarithm of 2 by adding upto n in the series.
		// 1 - 1/2 + 1/3 - 1/4 +...........1/n
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result = 1.0f;
		for(float i=2; i<=n; i++)
		{
			if(i%2==0)
			{
				result = result - 1/i;
			}
			else
			{
				result += 1/i;
			}
		}
		System.out.println(result);

	}

}
