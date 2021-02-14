package loops;

public class Continue {

	public static void main(String[] args) {
		// Printing 1 to 100 by skipping 40 to 50 using continue statement
		for(int i=1; i<=100; i++)
		{
			if(i>=40 && i<=50)
				continue;
			else
				System.out.println(i);
		}

	}

}
