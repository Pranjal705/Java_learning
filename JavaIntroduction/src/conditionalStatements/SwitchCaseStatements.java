package conditionalStatements;
import java.util.Scanner;
public class SwitchCaseStatements {

	public static void main(String[] args) {
		// Basic Calculator
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Operation: ");
		char Operation = sc.nextLine().charAt(0);
		int result = 0;
		switch(Operation)
		{
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
			default:
				System.out.println("Invalid Operation! ");
		}
		System.out.println(result);

	}

}
// For merged switchc cases, put the two cases to be merged with each other and remove one statement.