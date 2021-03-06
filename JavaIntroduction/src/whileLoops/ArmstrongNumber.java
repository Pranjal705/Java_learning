package whileLoops;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// Program to check if a number is Armstrong or not
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int result = 0;
		
		if(temp>0 && temp<9)
		{
			System.out.println("Armstrong");
		}
		else if (temp>9)
		{
			int digit = 0;
			while(temp>0)
			{
				digit = temp%10;
				result += (digit*digit*digit);
				temp = temp/10;
				digit = 0;
			}
			if(n == result)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("Not Armstrong");
			}
		}
		else
		{
			System.out.println("Invalid input");
		}

	}

}
