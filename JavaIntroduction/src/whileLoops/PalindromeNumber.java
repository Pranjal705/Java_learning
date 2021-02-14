package whileLoops;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
// 		Check if the inputed number is Palindrome or not?
// 		ALgo
//		Suppose the number is = 121
// 		THe reverse number is calculated by (lastdigit*10 + secondlastDigit)*10 + thirdlastDigit
//                                         i.e (1*10 + 2) = 12
//		                                       (12*10 + 1) = 121
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		
		while(temp>0)
		{
			int lastDigit = (temp%10);
			
			reverse = ((reverse*10) + lastDigit);
			temp/=10;
			
			
		}
		if(n == reverse)
		{
			System.out.println("The number is Palindrome. ");
		}
		else
		{
			System.out.println("THe number is not a Palindrome. ");
		}

	}

}
