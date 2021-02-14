package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a = 23;
		int b = 45;
		
//		int c = (a+b)*(a+b);
		 int c = a++;
		 c = ++b;
		 
		
		System.out.println(c+ " "+ a);
		System.out.println(c+ " "+ b);
	}

}
