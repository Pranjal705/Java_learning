package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		
		int c = a|b; // OR operation
		int d = a>>2; // Right shift ----each time the number is divided by 2 and the floor value is taken
		int e = a<<2; // left Shift -----each time the number is multiplied by 2
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
