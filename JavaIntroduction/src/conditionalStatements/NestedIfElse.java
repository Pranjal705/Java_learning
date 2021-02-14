package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		// Program to find the largest number between the three numbers
		int a = 4, b = 6,  c = 5;
		int result = 0;
		if(a>b)
		{
			if(a>c)
			{
				result = a;
			}
			else
			{
				result = c;
			}
		}
		else
		{
			if(b>c)
			{
				result = b;
			}
			else
			{
				result = c;
			}
		}
		System.out.println("The largest between the three numbers is: " + result);
	}

}
