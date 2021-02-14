package conditionalStatements;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 283;
		int b = 45;
		
		int maximum = 0;
		
		maximum = a>b? a:b;
		System.out.println("The maximum between a and b is: " + maximum);

	}

}