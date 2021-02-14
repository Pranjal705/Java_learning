package conditionalStatements;

public class NestedTernaryOperator {

	public static void main(String[] args) {
//		Program to find the largest number between the three numnbers
//		Algorithm
//		if a>b
//		 if a>c
//		  a is largest
//		  else c is largest\
//		else
//			if b>c b is largest
//			else c is largest
		
		int a = 5, b=3, c=9;
		int result =0;
		result = a>b ? a>c ? a:c : b>c ? b:c;
		System.out.println(result);

	}

}
